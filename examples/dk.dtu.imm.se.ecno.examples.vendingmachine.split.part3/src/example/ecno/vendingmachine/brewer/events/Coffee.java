/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package example.ecno.vendingmachine.brewer.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 

public class Coffee extends example.ecno.vendingmachine.events.Drink  {

	final public java.lang.Integer strength;

	public Coffee(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    strength = (java.lang.Integer) event.getParameter(formalParameters.get(0)).getValue();
	}

	@Override
	public example.ecno.vendingmachine.events.Drink super_() {
		return this;
	}

}
