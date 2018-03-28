package dk.dtu.imm.se.ecno.runtime;

import java.util.HashMap;
import java.util.Map;

import dk.dtu.imm.se.ecno.core.IEventTypeExtension;

public class EventExtension_Values extends Event_Values {
	
	protected final Event event;
	protected final IEventTypeExtension eventTypeExtension;
	
	private Event_Values baseEventValues;
	
	private Map<String,EventExtension_Values> key2EventExtension_Values;

	public EventExtension_Values(IEventTypeExtension eventTypeExtension, Event event) {
		super(eventTypeExtension.getBaseEventType(), event);
		this.event = event;
		this.eventTypeExtension = eventTypeExtension;
		this.baseEventValues = null;
		this.key2EventExtension_Values = new HashMap<String,EventExtension_Values>();
	}
	
	final protected Event_Values getBaseEvent_Values() {
		if (baseEventValues == null) {
			baseEventValues = event.getEventValues();
		}
		return baseEventValues;
	}
	
	final protected EventExtension_Values getSuperEventExtensionValues(String key) {
		if (!key2EventExtension_Values.containsKey(key)) {
			IEventTypeExtension superTypeExtension = eventTypeExtension.getSuperTypeExtension(key);
			if (superTypeExtension != null) {
				EventExtension_Values tmpValues = event.getEventExtensionValues(superTypeExtension);
				key2EventExtension_Values.put(key, tmpValues);
				return tmpValues;
			}
			// next time do not try again to create the values, if we could not create them now
			key2EventExtension_Values.put(key, null);
		}
		return key2EventExtension_Values.get(key);
	}

}
