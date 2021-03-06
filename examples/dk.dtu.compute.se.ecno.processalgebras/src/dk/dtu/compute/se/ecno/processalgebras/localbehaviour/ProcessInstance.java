/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of an element, as defined by the Petri net.
 */
package dk.dtu.compute.se.ecno.processalgebras.localbehaviour;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.model.runtime.ecnonets.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.model.runtime.ecnonets.PetriNetChoice;
import dk.dtu.imm.se.ecno.runtime.ParentAction;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import dk.dtu.compute.se.emf.processalgebra.ChoiceInst;
import dk.dtu.compute.se.emf.processalgebra.HideInst;
import dk.dtu.compute.se.emf.processalgebra.SequenceInst; 

@SuppressWarnings("unused")
public class ProcessInstance extends AbstractPetrinetBehaviour<dk.dtu.compute.se.emf.processalgebra.ProcessInstance> {
	
	public ProcessInstance(ExecutionEngine engine, IElementType type,  EObject element) {
		super(engine, (dk.dtu.compute.se.emf.processalgebra.ProcessInstance) element, new int[]{}, new String[]{"t0"}, type );
	}
	
	@Override
	public boolean enabled(int t) {
		switch (t) {
		case 0:
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
                    
		}
	}

	@Override
	public boolean dropParentChoice(int t) {
		switch (t) {
		case 0:
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
						
		}
	}
	
	@Override
	public String[] getTransitionEventParameterNames(int transition, int event) {
		switch (transition) {
		case 0:
			switch (event) {
			case 0:
				return new String[] { "processes" };
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
		dk.dtu.compute.se.emf.processalgebra.ProcessInstance self = self();
				
		switch (transition) {
		case 0: {
			dk.dtu.compute.se.ecno.processalgebras.events.Action a = 
			    (dk.dtu.compute.se.ecno.processalgebras.events.Action) choice.getEventValues("action");
			switch (event) {
			case 0:
				switch (param) {      
				case 0: return self();			    
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
		dk.dtu.compute.se.emf.processalgebra.ProcessInstance self = self();
		
		switch (transition) {
		case 0: {
			dk.dtu.compute.se.ecno.processalgebras.events.Action a = 
                (dk.dtu.compute.se.ecno.processalgebras.events.Action) choice.getEventValues("action");
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
		dk.dtu.compute.se.emf.processalgebra.ProcessInstance self = self();
		
		switch (transition) {
		case 0: {
			dk.dtu.compute.se.ecno.processalgebras.events.Action a =
                (dk.dtu.compute.se.ecno.processalgebras.events.Action) choice.getEventValues("action");
{
// code for reducing the process instance tree on the fly
if (!a.terminating.contains(this)) {
	boolean terminatingChild = false;
	for (dk.dtu.compute.se.emf.processalgebra.ProcessInstance child: self().getChild()) {
		if (a.terminating.contains(child)) {
			terminatingChild = true;
			break;
		}
	}

	dk.dtu.compute.se.emf.processalgebra.ProcessInstance par = self().getParent();
	if (par != null && 
			(!(par instanceof HideInst) &&
					(par.getChild().size() == 1 && (!(par instanceof SequenceInst) ||
							((SequenceInst) par).getRemainder().isEmpty()) ||
							par instanceof ChoiceInst))) {
		dk.dtu.compute.se.emf.processalgebra.ProcessInstance par2 = self();
		dk.dtu.compute.se.emf.processalgebra.ProcessInstance last = null;;
		do {
			last = par2;
			par2 = par;
			par = par2.getParent();
		} while(par != null && 
				(!(par instanceof HideInst) &&
						(par.getChild().size() == 1 && (!(par instanceof SequenceInst) ||
								((SequenceInst) par).getRemainder().isEmpty()) ||
								par instanceof ChoiceInst)));
		int index = par2.getChild().indexOf(last);
		par2.getChild().remove(index);
		par2.getChild().add(index,self());
	}
}
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
			return new String[] { "action" };
		default: return null;
		}  
	}
		
}

