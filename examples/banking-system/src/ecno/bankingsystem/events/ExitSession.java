/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package ecno.bankingsystem.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 

public class ExitSession extends ecno.bankingsystem.events.SystemAction  {

	final public emf.bankingsystem.ATMController atm;

	public ExitSession(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    atm = (emf.bankingsystem.ATMController) event.getParameter(formalParameters.get(0)).getValue();
	}

	@Override
	public ecno.bankingsystem.events.SystemAction super_() {
		return this;
	}

}
