package simplePDL2PetriNet;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Process;
import simplepdl.ProcessElement;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
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
		URI modelURI = URI.createURI(args[1]);
		Resource resource = resSet.getResource(modelURI,true);
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);
		
		//Générer l'URI pour créer le .xmi du petrinet
		String rootName = process.getName();
		URI netURI;
		switch (args.length) {
			case 1:
				
				netURI = URI.createURI("models/"+rootName);
				break;
			case 2:
				netURI = URI.createURI(args[2]);
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
		
		resource.getContents().add(network);
		
		//Convertir les WorkDefinition
		for (ProcessElement o : process.getProcessElements()) {
			if(o instanceof WorkDefinition) {
				createFromWorkDefinition(network, petrinetResource, myFactory, (WorkDefinition)o);
			}
		}
		
		//Convertir les WorkSequence
		for (ProcessElement o : process.getProcessElements()) {
			if(o instanceof WorkSequence) {
				createFromWorkSequence(network, petrinetResource, myFactory, (WorkSequence)o);
			}
		}
	}
	
	private static void createFromWorkDefinition(Network network, Resource petrinetResource, PetrinetFactory myFactory, WorkDefinition wd)
	{
		String nom = wd.getName();
		
		//Création des états
		State ready = myFactory.createState();
		State started = myFactory.createState();
		State running = myFactory.createState();
		State finished = myFactory.createState();
		ready.setName(nom + "Ready");
		ready.setTokenNb(1);
		started.setName(nom + "Started");
		running.setName(nom + "Running");
		finished.setName(nom + "Finished");
		
		//Création des transitions
		Transition start = myFactory.createTransition();
		Transition finish = myFactory.createTransition();
		start.setName(nom + "Start");
		finish.setName(nom + "Finish");
		
		//Création des arcs
		Arc ready2start = myFactory.createArc();
		Arc start2started = myFactory.createArc();
		Arc start2running = myFactory.createArc();
		Arc running2finish = myFactory.createArc();
		Arc finish2finished = myFactory.createArc();
		
		ready2start.setState(ready);
		ready2start.setTransition(start);
		ready2start.setTowardState(0);
		ready2start.setTowardTransition(1);
		
		start2started.setState(started);
		start2started.setTransition(start);
		start2started.setTowardState(1);
		start2started.setTowardTransition(0);
		
		start2running.setState(running);
		start2running.setTransition(start);
		start2running.setTowardState(1);
		start2running.setTowardTransition(0);
		
		running2finish.setState(running);
		running2finish.setTransition(finish);
		running2finish.setTowardState(0);
		running2finish.setTowardTransition(1);
		
		finish2finished.setState(finished);
		finish2finished.setTransition(finish);
		finish2finished.setTowardState(1);
		finish2finished.setTowardTransition(0);
		
		network.getNetworkElement().add(ready);
		network.getNetworkElement().add(start);
		network.getNetworkElement().add(started);
		network.getNetworkElement().add(running);
		network.getNetworkElement().add(finish);
		network.getNetworkElement().add(finished);
		network.getNetworkElement().add(ready2start);
		network.getNetworkElement().add(start2started);
		network.getNetworkElement().add(start2running);
		network.getNetworkElement().add(running2finish);
		network.getNetworkElement().add(finish2finished);
		
	}
	
	private static void createFromWorkSequence(Network network, Resource petrinetResource, PetrinetFactory myFactory, WorkSequence ws) throws AbsentProcessElement
	{
		String nomPredecesseur = ws.getPredecessor().getName();
		String nomSuccesseur = ws.getSuccessor().getName();
		State predecesseur = null;
		Transition successeur = null;
		switch(ws.getLinkType()) {
			case START_TO_START:
				for (NetworkElement o : network.getNetworkElement()) {
					if(o instanceof State && ((State)o).getName() == nomPredecesseur + "Started") {
						predecesseur = (State)o;
					}
					else if (o instanceof Transition && ((Transition)o).getName() == nomSuccesseur + "Start"){
						successeur = (Transition)o;
					}
				}
				break;
			case START_TO_FINISH:
				for (NetworkElement o : network.getNetworkElement()) {
					if(o instanceof State && ((State)o).getName() == nomPredecesseur + "Started") {
						predecesseur = (State)o;
					}
					else if (o instanceof Transition && ((Transition)o).getName() == nomSuccesseur + "Finish"){
						successeur = (Transition)o;
					}
				}
				break;
			case FINISH_TO_START:
				for (NetworkElement o : network.getNetworkElement()) {
					if(o instanceof State && ((State)o).getName() == nomPredecesseur + "Finished") {
						predecesseur = (State)o;
					}
					else if (o instanceof Transition && ((Transition)o).getName() == nomSuccesseur + "Start"){
						successeur = (Transition)o;
					}
				}
				break;
			case FINISH_TO_FINISH:
				for (NetworkElement o : network.getNetworkElement()) {
					if(o instanceof State && ((State)o).getName() == nomPredecesseur + "Finished") {
						predecesseur = (State)o;
					}
					else if (o instanceof Transition && ((Transition)o).getName() == nomSuccesseur + "Finish"){
						successeur = (Transition)o;
					}
				}
				break;
		}
		if(predecesseur == null) {
			throw new AbsentProcessElement(nomPredecesseur);
		} else if(successeur == null) {
			throw new AbsentProcessElement(nomSuccesseur);
		} else {
		ReadArc readArc = myFactory.createReadArc();
		readArc.setState(predecesseur);
		readArc.setTransition(successeur);
		readArc.setTowardTransition(1);
		}
		
	}
	private static class AbsentProcessElement extends Exception {
		public AbsentProcessElement() {
		    super();
		  }

		  public AbsentProcessElement(String s) {
		    super(s);
		  }
	}
}
