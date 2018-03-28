package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import dk.dtu.imm.se.ecno.core.IEventType;

public class EventTypeSet {
	
	private Map <IEventType,IEventType> topEventType2EventType;

	public EventTypeSet() {
		super();
		topEventType2EventType = new HashMap<IEventType,IEventType>();
	}
	
	public boolean contains(IEventType eventType) {
		IEventType eventType2 =  topEventType2EventType.get(eventType.getTopSuper());
		if (eventType2 != null) {
			return eventType.equals(eventType2);
		} else {
			return false;
		}
	}	

	public boolean isEmpty() {
		return topEventType2EventType.isEmpty();
	}
	
	public boolean covers(IEventType eventType) {
		IEventType eventType2 =  topEventType2EventType.get(eventType.getTopSuper());
		if (eventType2 != null) {
			return eventType2.isCompatibleWith(eventType);
		} else {
			return false;
		}
	}
	
	public boolean add(IEventType eventType) {
		IEventType eventType2 =  topEventType2EventType.get(eventType.getTopSuper());
		if (eventType2 == null) {
			topEventType2EventType.put(eventType.getTopSuper(), eventType);
			return true;
		} else {
			if (eventType2.getSuperTypes().contains(eventType)) {
				topEventType2EventType.put(eventType.getTopSuper(), eventType);
				return true;
			} else if (eventType.getSuperTypes().contains(eventType2)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean addAll(Collection<IEventType> eventTypes) {
		boolean result = true;
		for (IEventType eventType: eventTypes) {
			result = result && this.add(eventType);
		}
		return result;
	}
	
	public boolean addAll(EventTypeSet eventTypes) {
		return addAll(eventTypes.getSet());
	}
	
	public boolean addAll(IEventType[] eventTypes) {
		boolean result = true;
		for (IEventType eventType: eventTypes) {
			result = result && this.add(eventType);
		}
		return result;
	}
	
	public boolean remove(IEventType eventType) {
		IEventType eventType2 =  topEventType2EventType.get(eventType.getTopSuper());
		if (eventType2 == null) {
			return false;
		} else {
			topEventType2EventType.remove(eventType.getTopSuper());
			return true;
		}
	}
	
	public boolean removeAll(Collection<IEventType> eventTypes) {
		boolean result = true;
		for (IEventType eventType: eventTypes) {
			result = result && this.remove(eventType);
		}
		return result;
	}
	
	public boolean removeAll(EventTypeSet eventTypes) {
		return removeAll(eventTypes.getSet());
	}
	
	public Collection<IEventType> getSet() {
		return Collections.unmodifiableCollection(topEventType2EventType.values());
	}
	


}
