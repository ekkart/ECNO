/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package workflow.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class StartActivityI extends Event_Values  {

	final public workflow.CaseI caseI;
	final public workflow.Task task;

	public StartActivityI(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    caseI = (workflow.CaseI) event.getParameter(formalParameters.get(0)).getValue();
	    task = (workflow.Task) event.getParameter(formalParameters.get(1)).getValue();
	}
}