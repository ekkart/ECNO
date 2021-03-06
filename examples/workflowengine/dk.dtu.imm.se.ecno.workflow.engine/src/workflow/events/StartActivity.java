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

public class StartActivity extends Event_Values  {

	final public workflow.Task task;
	final public workflow.Agent agent;
	final public workflow.Case case_;

	public StartActivity(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    task = (workflow.Task) event.getParameter(formalParameters.get(0)).getValue();
	    agent = (workflow.Agent) event.getParameter(formalParameters.get(1)).getValue();
	    case_ = (workflow.Case) event.getParameter(formalParameters.get(2)).getValue();
	}
}
