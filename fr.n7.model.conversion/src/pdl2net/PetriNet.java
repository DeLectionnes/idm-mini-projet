package pdl2net;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import petrinet.Arc;
import petrinet.Network;
import petrinet.PetrinetFactory;
import petrinet.ReadArc;
import petrinet.State;
import petrinet.Transition;
import simplepdl.Process;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.RessourceSupply;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

public class PetriNet {
		
		private Network network;
		private PetrinetFactory myFactory;
		
		private Map<String, State> hashState;
		private Map<String, Transition> hashTransition;
		private List<WorkSequence> listWS;
		private List<RessourceSupply> listRS;
		
		
		private class StateWrapper {
			private State s;
			public StateWrapper(String name, int TokenNb) {
				s = myFactory.createState();
				s.setName(name);
				s.setTokenNb(TokenNb);
				s.setNetwork(network);
			}
			public State getState() {
				return s;
			}
			
			public void save() {
				hashState.put(s.getName(), s);
				network.getNetworkElement().add(s);
			}
		}
		
		private class TransitionWrapper {
			private Transition t;
			public TransitionWrapper(String name) {
				t = myFactory.createTransition();
				t.setName(name);
				t.setNetwork(network);
			}
			public Transition getTransition() {
				return t;
			}
			
			public void save() {
				hashTransition.put(t.getName(), t);
				network.getNetworkElement().add(t);
			}
		}
		
		private class ArcWrapper {
			private Arc a;
			public ArcWrapper(State state, int toState, Transition transition, int toTransition) {
				a = myFactory.createArc();
				a.setState(state);
				a.setTowardState(toState);
				a.setTransition(transition);
				a.setTowardTransition(toTransition);
				a.setNetwork(network);
			}
			
			public void save() {
				network.getNetworkElement().add(a);
			}
		}
		
		private class ReadArcWrapper{
			private ReadArc ra;
			public ReadArcWrapper(State state, Transition transition, int toTransition) {
				ra = myFactory.createReadArc();
				ra.setState(state);
				ra.setTransition(transition);
				ra.setTowardTransition(toTransition);
				ra.setNetwork(network);
			}
			public void save() {
				network.getNetworkElement().add(ra);
			}
		}
		
		public PetriNet(Network n,PetrinetFactory mF, Process processPDL) throws AbsentProcessElement {
			network = n;
			myFactory = mF;
			hashState = new HashMap<String, State>();
			hashTransition = new HashMap<String, Transition>();
			listWS = new LinkedList<WorkSequence>();
			listRS = new LinkedList<RessourceSupply>();
			
			for (ProcessElement o : processPDL.getProcessElements()) {
				if(o instanceof WorkDefinition) {
					createFromWorkDefinition((WorkDefinition)o);
				} else if(o instanceof Ressource) {
					createFromRessource((Ressource)o);
				} else if(o instanceof WorkSequence) {
					listWS.add((WorkSequence)o);
				} else if(o instanceof RessourceSupply) {
					listRS.add((RessourceSupply)o);
				}
			}
			
			for (WorkSequence ws : listWS) {
				createFromWorkSequence(ws);
			}
			for (RessourceSupply rs : listRS) {
				createFromRessourceSupply(rs);
			}
		}
		
		private void createFromWorkDefinition(WorkDefinition wd)
		{
			String nom = wd.getName();
			
			//Création des états
			StateWrapper ready = new StateWrapper(nom + "Ready",1);
			StateWrapper started = new StateWrapper(nom + "Started",0);
			StateWrapper running = new StateWrapper(nom + "Running",0);
			StateWrapper finished = new StateWrapper(nom + "Finished",0);
			
			//Création des transitions
			TransitionWrapper start = new TransitionWrapper(nom + "Start");
			TransitionWrapper finish = new TransitionWrapper(nom + "Finish");
			
			//Création des arcs
			ArcWrapper ready2start = new ArcWrapper(ready.getState(),0,start.getTransition(),1);
			ArcWrapper start2started = new ArcWrapper(started.getState(),1,start.getTransition(),0);
			ArcWrapper start2running = new ArcWrapper(running.getState(),1,start.getTransition(),0);
			ArcWrapper running2finish = new ArcWrapper(running.getState(),0,finish.getTransition(),1);
			ArcWrapper finish2finished = new ArcWrapper(finished.getState(),1,finish.getTransition(),0);
			
			ready.save();
			started.save();
			running.save();
			finished.save();
			
			start.save();
			finish.save();
			
			ready2start.save();
			start2started.save();
			start2running.save();
			running2finish.save();
			finish2finished.save();
			
			
		}
		
		private void createFromWorkSequence(WorkSequence ws) throws AbsentProcessElement
		{
			String nomPredecesseur = ws.getPredecessor().getName();
			String nomSuccesseur = ws.getSuccessor().getName();
			State predecesseur;
			Transition successeur;
			switch(ws.getLinkType()) {
				case START_TO_START:
					predecesseur = hashState.get(nomPredecesseur + "Started");
					successeur = hashTransition.get(nomSuccesseur + "Start");
					break;
				case START_TO_FINISH:
					predecesseur = hashState.get(nomPredecesseur + "Started");
					successeur = hashTransition.get(nomSuccesseur + "Finish");
					break;
				case FINISH_TO_START:
					predecesseur = hashState.get(nomPredecesseur + "Finished");
					successeur = hashTransition.get(nomSuccesseur + "Start");
					break;
				case FINISH_TO_FINISH:
					predecesseur = hashState.get(nomPredecesseur + "Finished");
					successeur = hashTransition.get(nomSuccesseur + "Finish");
					break;
				default:
					predecesseur = null;
					successeur = null;
			}
			if(predecesseur == null) {
				throw new AbsentProcessElement(nomPredecesseur);
			} else if(successeur == null) {
				throw new AbsentProcessElement(nomSuccesseur);
			} else {
			ReadArcWrapper readArc = new ReadArcWrapper(predecesseur,successeur,1);
			readArc.save();
			}
		}
			
		private void createFromRessource(Ressource rs)
		{
			StateWrapper ressource = new StateWrapper("Ressource"+rs.getName(),rs.getQuantity());
			ressource.save();
		}
		
		private void createFromRessourceSupply(RessourceSupply rsSupply) throws AbsentProcessElement
		{
			State ressource;
			Transition start;
			Transition finish;
			String nomPredecesseur = rsSupply.getPredecessor().getName();
			String nomSuccesseur = rsSupply.getSuccessor().getName();
			
			ressource = hashState.get("Ressource"+nomPredecesseur);
			start = hashTransition.get(rsSupply.getSuccessor().getName() + "Start");
			finish = hashTransition.get(rsSupply.getSuccessor().getName() + "Finish");
			if(ressource == null) {
				throw new AbsentProcessElement(nomPredecesseur);
			} else if(start == null || finish == null) {
				throw new AbsentProcessElement(nomSuccesseur);
			} else {
				ArcWrapper ressource2WD = new ArcWrapper(ressource,0,start,rsSupply.getQuantityNeeded());
				ArcWrapper wD2ressource = new ArcWrapper(ressource,rsSupply.getQuantityNeeded(),finish,0);
				ressource2WD.save();
				wD2ressource.save();
			}
		}
	}
