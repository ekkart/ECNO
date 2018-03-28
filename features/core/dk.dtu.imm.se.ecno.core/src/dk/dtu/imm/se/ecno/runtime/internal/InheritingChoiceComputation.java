package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.runtime.IChoice;

public class InheritingChoiceComputation {

	private final InheritingBehaviour behaviour;
	
	private final Map<IEventType,IEventType> toplevelEventType2eventType;
	private final Set<IEventType> eventTypes;
	
	final IChoice[] choices;
	
	private boolean valid = true;
	private int size;
	
	private static NoOpChoice noop = NoOpChoice.getInstance();

	public InheritingChoiceComputation(InheritingBehaviour behaviour) {
		this.behaviour = behaviour;
		this.toplevelEventType2eventType = new HashMap<IEventType,IEventType>();
		this.eventTypes = new HashSet<IEventType>();
		this.choices = new IChoice[this.behaviour.behaviours.length];
		this.valid = true;
		this.size = 0;
	}
	
	public InheritingChoiceComputation(InheritingChoiceComputation other) {
		this.behaviour = other.behaviour;
		this.toplevelEventType2eventType = new HashMap<IEventType,IEventType>(other.toplevelEventType2eventType);
		this.eventTypes = new HashSet<IEventType>(other.eventTypes);
		this.choices = new IChoice[this.behaviour.behaviours.length];

		for (int i = 0; i < other.choices.length; i++) {
			if (other.choices[i] != null) {
				this.choices[i] = other.choices[i].copy(null);
			}
		}
		this.valid = other.valid;
		this.size = other.size;
	}
	
	public boolean isValid() {
		return valid;
	}
	
	public boolean setChoice(IChoice choice, int level) {
		if (level < choices.length && choices[level] == null) {
			if (choices[level] == null) {
				choices[level] = choice;
				size = size+1;
			} else {
				valid = false;
				return valid;
			}
			if (choice.dropParentChoice()) {
				for (int i = level+1; i < choices.length; i++) {
					if (choices[i] == null) {
						choices[i] = noop;
					} else if (choices[i] != noop) {
						// the current choice was triggered by a choice from a
						// ancester, which is required to be dropped by this
						// choice. So this choice is inconsistent.
						valid = false;
						return valid;
					}
				}
			}
	
			for (IEventType eventType: choice.getEventTypes()) {
				IEventType eventType1 = toplevelEventType2eventType.get(eventType.getTopSuper());
				if (eventType1 == null) {
					toplevelEventType2eventType.put(eventType.getTopSuper(),eventType);
					eventTypes.add(eventType);
				} else {
					if (!eventType1.getSuperTypes().contains(eventType)) {
						if (eventType.getSuperTypes().contains(eventType1)) {
							eventTypes.remove(eventType1);
							eventTypes.add(eventType);
						} else {
							valid = false;
							return valid;
						}
					}
				}
			}
			
			return valid;
		}
		valid = false;
		return valid;
	}
	
	public Set<IEventType> getEventTypes() {
		return new HashSet<IEventType>(eventTypes);
	}

	public int getSize() {
		return size;
	}

}
