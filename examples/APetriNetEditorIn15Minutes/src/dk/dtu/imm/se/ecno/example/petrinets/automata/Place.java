/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of an element, as defined by the Petri net.
 */
package dk.dtu.imm.se.ecno.example.petrinets.automata;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.model.runtime.ecnonets.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.model.runtime.ecnonets.PetriNetChoice;
import dk.dtu.imm.se.ecno.runtime.ParentAction;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import PetriNets.PetriNetsFactory; 

@SuppressWarnings("unused")
public class Place extends AbstractPetrinetBehaviour<PetriNets.Place> {


final PetriNetsFactory factory = PetriNetsFactory.eINSTANCE;	
	public Place(ExecutionEngine engine, IElementType type,  EObject element) {
		super(engine, (PetriNets.Place) element, new int[]{}, new String[]{"t0", "t1"}, type );
	}
	
	@Override
	public boolean enabled(int t) {
		switch (t) {
		case 0:
			return true;
                    
		case 1:
			return true;
                    
		default:
			return false;	
		}
	}
	
	@Override
	public void consumeTokens(int t, int[] m) {
		switch (t) {
		case 0:
            break;
                    
		case 1:
            break;
                    
		}
	}

	@Override
	public boolean dropParentChoice(int t) {
		switch (t) {
		case 0:
			return false;                    
		case 1:
			return false;                    
		default:
			return false;	
		}
	}

	@Override
	public void fireImpl(int t) {
		if (! enabled(t))
			return;
		
		switch (t) {
		case 0:		
			break;
			
		case 1:		
			break;
						
		}
	}
	
	@Override
	public String[] getTransitionEventParameterNames(int transition, int event) {
		switch (transition) {
		case 0:
			switch (event) {
			case 0:
				return new String[] { "places" };
            default: return new String[] {};
                }
		case 1:
			switch (event) {
			case 0:
				return new String[] { "places" };
			case 1:
				return new String[] {};
            default: return new String[] {};
                }
		default: return new String[] {};
		}  
	}	
	
	@Override
	public Object getParamAssignment(PetriNetChoice choice, int event, int param) {
		int transition = choice.getTransition();
		// Note that this attribute self will be deleted in future versions 
		// of the ECNO code generator for ECNO nets. Therefore, the method
		// self() should be used instead of the variable self in your 
		// ECNO Net Java code snippets.
		PetriNets.Place self = self();
				
		switch (transition) {
		case 0: {
			dk.dtu.imm.se.ecno.example.petrinets.events.Add a = 
			    (dk.dtu.imm.se.ecno.example.petrinets.events.Add) choice.getEventValues("add");
			switch (event) {
			case 0:
				switch (param) {      
				case 0: return self();			    
                default: return null;
                }
			default: return null;
			}
		}
		case 1: {
			dk.dtu.imm.se.ecno.example.petrinets.events.Remove r = 
			    (dk.dtu.imm.se.ecno.example.petrinets.events.Remove) choice.getEventValues("remove");
			dk.dtu.imm.se.ecno.example.petrinets.events.RemoveToken t = 
			    (dk.dtu.imm.se.ecno.example.petrinets.events.RemoveToken) choice.getEventValues("removeToken");
			switch (event) {
			case 0:
				switch (param) {      
				case 0: return self();			    
                default: return null;
                }
			case 1:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		default: return null;
		}  
	}	

	@Override
	public boolean evaluateCondition(PetriNetChoice choice) {
		int transition = choice.getTransition();
		// Note that this attribute self will be deleted in future versions 
		// of the ECNO code generator for ECNO nets. Therefore, the method
		// self() should be used instead of the variable self in your 
		// ECNO Net Java code snippets.
		PetriNets.Place self = self();
		
		switch (transition) {
		case 0: {
			dk.dtu.imm.se.ecno.example.petrinets.events.Add a = 
                (dk.dtu.imm.se.ecno.example.petrinets.events.Add) choice.getEventValues("add");
			return true; 
		}
		case 1: {
			dk.dtu.imm.se.ecno.example.petrinets.events.Remove r = 
                (dk.dtu.imm.se.ecno.example.petrinets.events.Remove) choice.getEventValues("remove");
			dk.dtu.imm.se.ecno.example.petrinets.events.RemoveToken t = 
                (dk.dtu.imm.se.ecno.example.petrinets.events.RemoveToken) choice.getEventValues("removeToken");
			return true; 
		}
		default: return false;
		}  
	}	
	
	@Override
	public void executeAction(PetriNetChoice choice) {
		int transition = choice.getTransition();
		ParentAction parent = new ParentAction(choice);
		// Note that this attribute self will be deleted in future versions 
		// of the ECNO code generator for ECNO nets. Therefore, the method
		// self() should be used instead of the variable self in your 
		// ECNO Net Java code snippets.
		PetriNets.Place self = self();
		
		switch (transition) {
		case 0: {
			dk.dtu.imm.se.ecno.example.petrinets.events.Add a =
                (dk.dtu.imm.se.ecno.example.petrinets.events.Add) choice.getEventValues("add");
{
self().getToken().add(factory.createToken());
}
            fire(transition);
			return; 
		}
		case 1: {
			dk.dtu.imm.se.ecno.example.petrinets.events.Remove r =
                (dk.dtu.imm.se.ecno.example.petrinets.events.Remove) choice.getEventValues("remove");
			dk.dtu.imm.se.ecno.example.petrinets.events.RemoveToken t =
                (dk.dtu.imm.se.ecno.example.petrinets.events.RemoveToken) choice.getEventValues("removeToken");
{
self().getToken().remove(t.token);
}
            fire(transition);
			return; 
		}
		default: return;
		}  
	}	
	
	@Override
	public String[] getTransitionEvents(int transition) {
			switch (transition) {
		case 0: 
			return new String[] { "add" };
		case 1: 
			return new String[] { "remove", "removeToken" };
		default: return null;
		}  
	}
		
}

