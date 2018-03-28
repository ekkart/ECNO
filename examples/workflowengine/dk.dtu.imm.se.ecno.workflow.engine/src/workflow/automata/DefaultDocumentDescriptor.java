/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of an element, as defined by the Petri net.
 */
package workflow.automata;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.model.runtime.pn.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.model.runtime.pn.PetriNetChoice;
import dk.dtu.imm.se.ecno.runtime.ParentAction;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine; 

@SuppressWarnings("unused")
public class DefaultDocumentDescriptor extends AbstractPetrinetBehaviour<workflow.DefaultDocumentDescriptor> {


final coded.util.DefaultDocumentDescriptorUtil util = coded.util.DefaultDocumentDescriptorUtil.getInstance();	
	public DefaultDocumentDescriptor(ExecutionEngine engine, IElementType type,  EObject element) {
		super(engine, (workflow.DefaultDocumentDescriptor) element, new int[]{}, new String[]{"t0", "t1"}, type );
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
	public boolean doesAssignParam(int transition, int event, int param) {
		switch (transition) {
		case 0:
			switch (event) {
			case 0:
				switch (param) {
				case 0: return false;			
				case 1: return false;			    
                default: return false;
                }
			default: return false;
			}
		case 1:
			switch (event) {
			case 0:
				switch (param) {
				case 0: return false;			    
                default: return false;
                }
			default: return false;
			}
		default: return false;
		}  
	}	
	
	@Override
	public Object getParamAssignment(PetriNetChoice choice, int event, int param) {
		int transition = choice.getTransition();
		// Note that this attribute self will be deleted in future versions 
		// of the ECNO code generator for ECNO nets. Therefore, the method
		// self() should be used instead of the variable self in your 
		// ECNO Net Java code snippets.
		workflow.DefaultDocumentDescriptor self = self();
				
		switch (transition) {
		case 0: {
			workflow.events.StartActivityI si = 
			    (workflow.events.StartActivityI) choice.getEventValues("StartActivityI");
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 1: {
			workflow.events.FinishActivity f = 
			    (workflow.events.FinishActivity) choice.getEventValues("FinishActivity");
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
		workflow.DefaultDocumentDescriptor self = self();
		
		switch (transition) {
		case 0: {
			workflow.events.StartActivityI si = 
                (workflow.events.StartActivityI) choice.getEventValues("StartActivityI");
			return util.getDocument(self,si.caseI) != null; 
		}
		case 1: {
			workflow.events.FinishActivity f = 
                (workflow.events.FinishActivity) choice.getEventValues("FinishActivity");
			return util.getDocument(self,f.activity) != null; 
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
		workflow.DefaultDocumentDescriptor self = self();
		
		switch (transition) {
		case 0: {
			workflow.events.StartActivityI si =
                (workflow.events.StartActivityI) choice.getEventValues("StartActivityI");
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 1: {
			workflow.events.FinishActivity f =
                (workflow.events.FinishActivity) choice.getEventValues("FinishActivity");
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
			return new String[] { "StartActivityI" };
		case 1: 
			return new String[] { "FinishActivity" };
		default: return null;
		}  
	}
		
}

