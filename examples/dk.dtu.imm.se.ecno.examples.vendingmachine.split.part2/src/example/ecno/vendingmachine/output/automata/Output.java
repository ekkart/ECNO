/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of an element, as defined by the Petri net.
 */
package example.ecno.vendingmachine.output.automata;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.model.runtime.ecnonets.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.model.runtime.ecnonets.PetriNetChoice;
import dk.dtu.imm.se.ecno.runtime.ParentAction;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine; 

@SuppressWarnings("unused")
public class Output extends AbstractPetrinetBehaviour<example.emf.vendingmachineoutput.Output> {
	
	public Output(ExecutionEngine engine, IElementType type,  EObject element) {
		super(engine, (example.emf.vendingmachineoutput.Output) element, new int[]{1, 0}, new String[]{"t9", "t10"}, type );
	}
	
	@Override
	public boolean enabled(int t) {
		switch (t) {
		case 0:
			return marking.get(0) >= 1;
                    
		case 1:
			return marking.get(1) >= 1;
                    
		default:
			return false;	
		}
	}
	
	@Override
	public void consumeTokens(int t, int[] m) {
		switch (t) {
		case 0:
            m[0]--;
            break;
                    
		case 1:
            m[1]--;
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
			marking.set(0, marking.get(0) - 1);
			marking.set(1,  marking.get(1) + 1);
			break;
			
		case 1:		
			marking.set(1, marking.get(1) - 1);
			marking.set(0,  marking.get(0) + 1);
			break;
						
		}
	}
	
	@Override
	public String[] getTransitionEventParameterNames(int transition, int event) {
		switch (transition) {
		case 0:
			switch (event) {
			case 0:
				return new String[] {};
            default: return new String[] {};
                }
		case 1:
			switch (event) {
			case 0:
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
		example.emf.vendingmachineoutput.Output self = self();
				
		switch (transition) {
		case 0: {
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 1: {
			switch (event) {
			case 0:
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
		example.emf.vendingmachineoutput.Output self = self();
		
		switch (transition) {
		case 0: {
			return true; 
		}
		case 1: {
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
		example.emf.vendingmachineoutput.Output self = self();
		
		switch (transition) {
		case 0: {
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 1: {
/* DO NOTHING */
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
			return new String[] { "cup_in" };
		case 1: 
			return new String[] { "cup_out" };
		default: return null;
		}  
	}
		
}

