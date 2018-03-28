/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package ecno.bankingsystem.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 

public class Balance extends ecno.bankingsystem.events.UserMainAction  {

	final public java.lang.Integer balance;

	public Balance(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    balance = (java.lang.Integer) event.getParameter(formalParameters.get(0)).getValue();
	}

	@Override
	public ecno.bankingsystem.events.UserMainAction super_() {
		return this;
	}

}