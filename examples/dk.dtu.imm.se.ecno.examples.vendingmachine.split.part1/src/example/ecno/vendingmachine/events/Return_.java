/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package example.ecno.vendingmachine.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class Return_ extends Event_Values  {

	final public example.emf.vendingmachine.Slot slot;

	public Return_(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    slot = (example.emf.vendingmachine.Slot) event.getParameter(formalParameters.get(0)).getValue();
	}
}
