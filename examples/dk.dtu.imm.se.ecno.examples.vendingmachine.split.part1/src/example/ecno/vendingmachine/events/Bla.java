/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an EventExtension_Value class.
 */
package example.ecno.vendingmachine.events;

import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.EventExtension_Values; 

public class Bla extends EventExtension_Values {


	public Bla(IEventTypeExtension typeExtension, Event event) {
		super(typeExtension, event);
	}
	
	public example.ecno.vendingmachine.events.Drink base() {
		return (example.ecno.vendingmachine.events.Drink) getBaseEvent_Values();
	}

	public example.ecno.vendingmachine.events.Blubs n() {
		return (example.ecno.vendingmachine.events.Blubs) getSuperEventExtensionValues("n");
	}
	
}
