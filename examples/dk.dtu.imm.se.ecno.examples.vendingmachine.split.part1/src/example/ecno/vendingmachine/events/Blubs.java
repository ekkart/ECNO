/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an EventExtension_Value class.
 */
package example.ecno.vendingmachine.events;

import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.EventExtension_Values; 

public class Blubs extends EventExtension_Values {


	public Blubs(IEventTypeExtension typeExtension, Event event) {
		super(typeExtension, event);
	}
	
	public example.ecno.vendingmachine.events.Drink base() {
		return (example.ecno.vendingmachine.events.Drink) getBaseEvent_Values();
	}

}