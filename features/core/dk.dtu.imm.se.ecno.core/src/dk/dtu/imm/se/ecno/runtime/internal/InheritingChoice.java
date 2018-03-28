package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class InheritingChoice implements CompositeChoice {

	final private IElementBehaviour owner;
	private IChoice container;
	final IChoice[] choices;
	// TODO eki, 18. 4. 2012: with the parallelEvents attribute, we
	//                        could probably delete eventTypes completely
	final private List<IEventType> eventTypes;
	final private HashMap<IEventType,Event> parallelEvents;
	final public boolean isParallelTriggerChoice ;
	
	private static NoOpChoice noop = NoOpChoice.getInstance();

	public InheritingChoice(IElementBehaviour owner, InheritingChoiceComputation choices, boolean isParallelTriggerChoice) {
		this.owner = owner;
		this.container = null;
		
		this.choices = new IChoice[choices.choices.length];
		for (int i = 0; i < choices.choices.length; i++) {
			if (choices.choices[i] != null && choices.choices[i] != noop) {
				this.choices[i] = choices.choices[i].copy(null);
				this.choices[i].setChoiceContainer(this);
			} else {
				this.choices[i] =  null;
			}
		}		
		
		this.eventTypes = new ArrayList<IEventType>(choices.getEventTypes());
		
		parallelEvents = new HashMap<IEventType,Event>();
		this.isParallelTriggerChoice = isParallelTriggerChoice;
	}
	
	public InheritingChoice(InheritingChoice choice, CopyMappings mappings) {
		this.owner = choice.owner;
		this.container = null;
		
		this.choices = new IChoice[choice.choices.length];
		if (mappings == null) {
			for (int i = 0; i < choice.choices.length; i++) {
				if (choice.choices[i] != null) {
					this.choices[i] = choice.choices[i].copy(null);
					this.choices[i].setChoiceContainer(this);
				} else {
					this.choices[i] = null;
				}
			}	
		} else {
			for (int i = 0; i < choice.choices.length; i++) {
				if (choice.choices[i] != null) {
					this.choices[i] = mappings.getCopy(choice.choices[i]);
					this.choices[i].setChoiceContainer(this);
				} else {
					this.choices[i] = null;
				}
			}	
		}
		
		this.eventTypes = new ArrayList<IEventType>(choice.eventTypes);
		
		parallelEvents = new HashMap<IEventType,Event>();
		for (IEventType eventType: choice.parallelEvents.keySet()) {
			parallelEvents.put(eventType, mappings.getCopy(choice.parallelEvents.get(eventType)));
		}
		
		this.isParallelTriggerChoice = choice.isParallelTriggerChoice;
	}

	@Override
	public IElementBehaviour getOwner() {
		return owner;
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
	
	@Override
	public void addEvent(Event event) {
		IElementType elementType = this.getOwner().getElementType();
		if (elementType != null && elementType.isParallelTriggerEvent(event.getType())) {
			this.parallelEvents.put(event.getType().getTopSuper(), event);
		} else if (container == null) {
			this.parallelEvents.put(event.getType().getTopSuper(), event);
		} else {
			// XXX eki 14. 9. 2012 (realized that these events where missing in choices
			container.addEvent(event);
		}
	}

	@Override
	public Event getEvent(IEventType eventType) {
		Event result = this.parallelEvents.get(eventType.getTopSuper());
		if (result == null && container != null) {
			result = container.getEvent(eventType);
		}
		return result;
	}

	@Override
	public boolean doAssignments(Set<Parameter> parameters) {
		// TODO the order of how different values are assigned by
		//      different choices in the hierarchy is not defined
		//      (since this could be done in different interactions).
		//      Eventually, this should probably be done with preference
		//      to the most concrete class; this would, however, require
		//      a method that says to which parameters a choice contributes
		//      (which is not yet there in the general interface).
		boolean result = true;
		for (int i = 0; i < choices.length; i++) {
			if (choices[i] != null) {
				if (!choices[i].doAssignments(parameters)) {
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
		for (int i = 0; i < choices.length && result; i++) {
			if (choices[i] != null) {
				if (!choices[i].areAssignmentsComplete()) {
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
		for (int i = 0; i < choices.length && result; i++) {
		    // eki: note that we evaluate all conditions, even if we
			//      know already that the condition will be false. This
			//      could be implemented more efficiently; but to take
			//      care of side effects (which conditions should not have)
			//      we evaluate all of them.
			if (choices[i] != null) { 
				result = result && choices[i].evaluateCondition();
			}
		}
		return result;
	}

	boolean executed = false;
	int current;
	boolean[] executedSubChoices;
	
	@Override
	public void execute() {
		// start only if the execute method was not called yet
		if (!executed) {
			executed = true;
			executedSubChoices = new boolean[choices.length];
			for (int i = 0; i < choices.length; i++) {
				if (choices[i] != null) {
					if (!executedSubChoices[i]) {
						current = i;
						choices[i].execute();
						executedSubChoices[i] = true;
					} else {
						break;
					}
				}
			}
		}
	}
	
	public void executeParent() {
		if (!executedSubChoices[current]) {
			for (int i = current+1; i < choices.length; i++) {
				if (choices[i] != null) {
					if (!executedSubChoices[i]) {
						current = i;
						choices[i].execute();
						executedSubChoices[i] = true;
					} else {
						break;
					}
				}
			}
		}
	}
	
	public void dropExecuteParent() {
		if (!executedSubChoices[current]) {
			for (int i = current+1; i < choices.length; i++) {
				if (!executedSubChoices[i]) {
					executedSubChoices[i] = true;
				} else {
					break;
				}
			}
		}
	}

	@Override
	public InheritingChoice copy(CopyMappings mappings) {
		return new InheritingChoice(this, mappings);
	}

	@Override
	public Collection<IElementBehaviour> getBehaviours() {
		List<IElementBehaviour> behaviours = new ArrayList<IElementBehaviour>();
		
		for (IChoice choice: choices) {
			if (choice instanceof CompositeChoice) {
				behaviours.addAll(((CompositeChoice) choice).getBehaviours());
			} else {
				behaviours.add(choice.getOwner());
			}
		}

		return behaviours;
	}

}
