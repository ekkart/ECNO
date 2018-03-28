package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class ParallelChoice implements CompositeChoice {

	final InheritingChoice[] parallelChoices;
	// TODO eki, 18. 4. 2012: with the sharedEvents attribute, we
	//      could probably remove eventTypes completely with some
	//      refactoring
	final private List<IEventType> eventTypes;
	final private HashMap<IEventType,Event> sharedEvents;
	private Set<IEventType> handledTopLevelTypes;

	private IChoice container;
	
	public ParallelChoice(InheritingChoice inheritingChoice) {
		parallelChoices = new InheritingChoice[1];
		parallelChoices[0] = inheritingChoice.copy(null);
		parallelChoices[0].setChoiceContainer(this);
		eventTypes = inheritingChoice.getEventTypes();
		container = null;
	    sharedEvents = new HashMap<IEventType,Event>();
	    handledTopLevelTypes = new HashSet<IEventType>();
	    for (IEventType eventType: eventTypes) {
	    	// eki, 11. 4. 2013: Make sure that the non-triggered events from the first parallel
	    	//      choice are marked as handled (actually we mark all elements; we should
	    	//      only add the non-triggered event types of the element type here
	    	//      but it does not harm to add the others too, so we add all of them, since
	    	//      we do not have the element type readily available here).
	    	handledTopLevelTypes.add(eventType);
	    }
	    
	}
	
	public ParallelChoice(ParallelChoice parallelChoice, InheritingChoice inheritingChoice) {
		Set<IEventType> eventTypeSet = new HashSet<IEventType>();
		parallelChoices = new InheritingChoice[parallelChoice.parallelChoices.length+1];
		for (int i = 0; i < parallelChoice.parallelChoices.length; i++) {
			// eki: note that these choices are NOT copied (since they are part of
			//      an interaction already at that point
			parallelChoices[i] = parallelChoice.parallelChoices[i];
			parallelChoices[i].setChoiceContainer(this);
			for (IEventType type: parallelChoices[i].getEventTypes()) {
				eventTypeSet.add(type);
			}
		}
		parallelChoices[parallelChoice.parallelChoices.length] = inheritingChoice;
		// eki: note that these choices are NOT copied (since they are part of
		//      an interaction already at that point
		parallelChoices[parallelChoice.parallelChoices.length].setChoiceContainer(this);
		for (IEventType type: parallelChoices[parallelChoice.parallelChoices.length].getEventTypes()) {
			eventTypeSet.add(type);
		}
		
		eventTypes = new ArrayList<IEventType>(eventTypeSet);
		
		container = null;
		
	    sharedEvents = new HashMap<IEventType,Event>();
		for (IEventType eventType: parallelChoice.sharedEvents.keySet()) {
			sharedEvents.put(eventType, parallelChoice.sharedEvents.get(eventType));
		}
	    handledTopLevelTypes = new HashSet<IEventType>(parallelChoice.handledTopLevelTypes);
	}
	
	public ParallelChoice(ParallelChoice parallelChoice, CopyMappings mappings) {
		container = null;
		this.parallelChoices = new InheritingChoice[parallelChoice.parallelChoices.length];
		if (mappings == null) {
			for (int i = 0; i < parallelChoice.parallelChoices.length; i++) {
				this.parallelChoices[i] = parallelChoice.parallelChoices[i].copy(null);
				this.parallelChoices[i].setChoiceContainer(this);

			}	
		} else {
			for (int i = 0; i < parallelChoice.parallelChoices.length; i++) {
				this.parallelChoices[i] = (InheritingChoice) mappings.getCopy(parallelChoice.parallelChoices[i]);
				this.parallelChoices[i].setChoiceContainer(this);
			}	
		}
		this.eventTypes = new ArrayList<IEventType>(parallelChoice.eventTypes);
		
		sharedEvents = new HashMap<IEventType,Event>();
		for (IEventType eventType: parallelChoice.sharedEvents.keySet()) {
			sharedEvents.put(eventType, mappings.getCopy(parallelChoice.sharedEvents.get(eventType)));
		}
		
		handledTopLevelTypes = new HashSet<IEventType>(parallelChoice.handledTopLevelTypes);
	}
	
	public int size() {
		return parallelChoices.length;
	}
	
	public List<IChoice> getChoices() {
		ArrayList<IChoice> choices = new ArrayList<IChoice>();
		for(IChoice choice: parallelChoices) {
			choices.add(choice);
		}
		return choices;
	}
	
	@Override
	public IElementBehaviour getOwner() {
		return parallelChoices[0].getOwner();
	}

	@Override
	public IChoice getChoiceContainer() {
		return container;
	}

	@Override
	public void setChoiceContainer(IChoice container) {
		this.container = container; 
	}

	@Override
	public boolean dropParentChoice() {
		return false;
	}

	@Override
	public List<IEventType> getEventTypes() {
		return Collections.unmodifiableList(eventTypes);
	}
	
	public boolean wasEventTypesHandled(IEventType eventType) {
		return this.handledTopLevelTypes.contains(eventType.getTopSuper());
	}
	
	public void addHandledEventType(IEventType eventType) {
		this.handledTopLevelTypes.add(eventType.getTopSuper());
	}
	
	@Override
	public void addEvent(Event event) {
		// TODO eki: we might want to check whether this is really a shared event type for
		//           this element type
		IElementBehaviour owner = getOwner();
		if (owner != null) {
			if (owner.getElementType().isParallelTriggerEvent(event.getType())) {
				System.err.println("ECNO Engine: trigger event added as shared event: " + event.getType().getName());
			}
		}
		this.sharedEvents.put(event.getType().getTopSuper(), event);
	}

	@Override
	public Event getEvent(IEventType eventType) {
		return this.sharedEvents.get(eventType.getTopSuper());
	}

	@Override
	public boolean doAssignments(Set<Parameter> parameters) {
		boolean result = true;
		for (int i = 0; i < parallelChoices.length; i++) {
			if (parallelChoices[i] != null) {
				if (!parallelChoices[i].doAssignments(parameters)) {
					result = false;
					break;
				}
			}
		}
		return result;	
	}

	@Override
	public boolean areAssignmentsComplete() {
		boolean result = true;
		for (int i = 0; i < parallelChoices.length && result; i++) {
			if (parallelChoices[i] != null) {
				if (!parallelChoices[i].areAssignmentsComplete()) {
					result = false;
					break;
				}
			}
		}
		return result;
	}

	@Override
	public boolean evaluateCondition() {
		boolean result = true;
		for (int i = 0; i < parallelChoices.length && result; i++) {
		    // eki: note that we evaluate all conditions, even if we
			//      know already that the condition will be false. This
			//      could be implemented more efficiently; but to take
			//      care of side effects (which conditions should not have)
			//      we evaluate all of them.
		    result = result && parallelChoices[i].evaluateCondition();
		}
		return result;
	}

	@Override
	public void execute() {
        for (InheritingChoice choice: parallelChoices) {
        	choice.execute();
        }
	}

	@Override
	public ParallelChoice copy(CopyMappings mappings) {
		return new ParallelChoice(this, mappings);
	}

	@Override
	public Collection<IElementBehaviour> getBehaviours() {
		List<IElementBehaviour> behaviours = new ArrayList<IElementBehaviour>();
		
		for (IChoice choice: parallelChoices) {
			if (choice instanceof CompositeChoice) {
				behaviours.addAll(((CompositeChoice) choice).getBehaviours());
			} else {
				behaviours.add(choice.getOwner());
			}
		}

		return behaviours;
	}

}
