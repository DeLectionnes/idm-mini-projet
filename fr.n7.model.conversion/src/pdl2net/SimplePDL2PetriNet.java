package pdl2net;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

import simplepdl.Process;
import simplepdl.ProcessElement;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
import simplepdl.Ressource;
import simplepdl.RessourceSupply;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;

import petrinet.Network;
import petrinet.NetworkElement;
import petrinet.Arc;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.ReadArc;
import petrinet.State;
import petrinet.Transition;



public class SimplePDL2PetriNet {
	
	public static void main(String[] args) throws AbsentProcessElement {
		
		//Créer et charger les instances nécessaires
		
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		// DÃ©finir la ressource (le modÃ¨le)
		URI modelURI = URI.createURI(args[0]);
		Resource resource = resSet.getResource(modelURI,true);
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);
		
		//Générer l'URI pour créer le .xmi du petrinet
		String rootName = process.getName();
		URI netURI;
		switch (args.length) {
			case 1:
				netURI = URI.createURI("models/"+rootName+".xmi");
				break;
			case 2:
				netURI = URI.createURI(args[1]);
				break;
			default:
				throw new IllegalArgumentException("Nombre d'arguments incorrect");
		}
		
		// Charger le package PetriNet afin de l'enregistrer dans le registre d'Eclipse.
		PetrinetPackage petrinetPackageInstance = PetrinetPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry petrinetReg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> petrinetM = petrinetReg.getExtensionToFactoryMap();
		petrinetM.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet petrinetResSet = new ResourceSetImpl();

		// DÃ©finir la ressource (le modÃ¨le)
		Resource petrinetResource = petrinetResSet.createResource(netURI);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de PetriNet
		PetrinetFactory myFactory = PetrinetFactory.eINSTANCE;

		// CrÃ©er un Ã©lÃ©ment Network
	    Network network = myFactory.createNetwork();
		network.setName(rootName);
		
		petrinetResource.getContents().add(network);
		
		// Création du pétrinet
		PetriNet petrinet = new PetriNet(network, myFactory, process);
		
		// Sauver la ressource
	    try {
	    	petrinetResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
