package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IChangeListener;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.core.IParallelElementBehaviour;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.AbstractElementBehaviour;
import dk.dtu.imm.se.ecno.runtime.IChoice;

public class InheritingBehaviour extends AbstractElementBehaviour implements
		IElementBehaviour, IChangeListener {
	
	final IElementBehaviour[] behaviours;
	
	final private Set<IEventType> topLevelEventTypes;
	final private boolean isParallel;
	
	private InheritingBehaviour(ExecutionEngine engine, IElementType type, Object element, List<IElementBehaviour> behaviours) {
		super(engine, type, element);
		this.behaviours = new IElementBehaviour[behaviours.size()];
		boolean parallel = true;
		for (int i = 0; i < this.behaviours.length; i++) {
			this.behaviours[i] = behaviours.get(i);
			if (!(this.behaviours[i] instanceof IParallelElementBehaviour)) {
				parallel = false;
			}
		}
		isParallel = parallel;
		
		Set<IEventType> events = new HashSet<IEventType>();

		for (int i=0; i < this.behaviours.length; i++) {
			events.addAll(this.behaviours[i].getTopLevelEventTypes());
		}
		this.topLevelEventTypes = Collections.unmodifiableSet(events);
	}

	@Override
	public List<IChoice> getChoices(IEventType eventType) {
		return getChoices(null, eventType);
	}
	
	public List<IChoice> getChoices(ParallelChoice parallelChoice, IEventType eventType) {
		if (this.isParallel || parallelChoice == null) {
			InheritingChoiceComputation choices = new InheritingChoiceComputation(this);
			Set<IEventType> eventTypes = new HashSet<IEventType>();
			eventTypes.add(eventType.getTopSuper());
			boolean isParallelTriggerEvent = this.getElementType().isParallelTriggerEvent(eventType); 
			List<InheritingChoiceComputation> choicesList = computeChoiceComputations(parallelChoice, isParallelTriggerEvent, choices, eventTypes, 0, behaviours.length);

			List<IChoice> result = new ArrayList<IChoice>(choicesList.size());
			for (InheritingChoiceComputation choices2:  choicesList ) {
				if (parallelChoice == null) {
					// TODO these two cases can now be combined after change from 20.10.2015
					// ekki 20.10.2015: removed the ParallelChoice wrapper (which now is added
					//                  in the ElementChoiceContinuation); this change was made
					//                  to fix a problem with different trigger events in different
					//                  choices of a parallel choice which were unified, but should not have been
					result.add(new InheritingChoice(this, choices2, isParallelTriggerEvent));
					// result.add(new ParallelChoice(new InheritingChoice(this, choices2, isParallelTriggerEvent)));
				} else {

				    result.add(new InheritingChoice(this, choices2, isParallelTriggerEvent));
				}
			}
			return result;
		}
		return null;
	}
		
	private static final NoOpChoice noop = NoOpChoice.getInstance();

	// TODO eki: note that some choices are computed here twice, since events and
	//           some of the sub events are added to the considered event types.
	//           This needs to be carefully checked and fixed (without compromising
	//           efficiency too much).
	private List<InheritingChoiceComputation> computeChoiceComputations(
			ParallelChoice parallelChoice,
			boolean parallelTrigger,
			InheritingChoiceComputation choiceComp,
			Collection<IEventType> collection, int min, int max) {
		
		EventTypeSet eventTypes  = new EventTypeSet();
		eventTypes.addAll(collection);
		
		// TODO eki: the event types of choices should eventually turned into sets 
		//           arrays result in some inefficiencies here
		EventTypeSet parallelEventTypes = new EventTypeSet();
		if (parallelChoice != null) {
			for (InheritingChoice inheritingChoice: parallelChoice.parallelChoices) {
				if (!inheritingChoice.isParallelTriggerChoice) {
					// Only consider eventTypes that are not in parallelly triggered choices
					parallelEventTypes.addAll(inheritingChoice.getEventTypes());
					// for (IEventType eventType: inheritingChoice.getEventTypes()) {
					// 	parallelEventTypes.add(eventType);
					// }
				}

			}
		}
		
		EventTypeSet oldTypes = new EventTypeSet(); 
		oldTypes.addAll(choiceComp.getEventTypes());
		
		for (int i = min;  i < max; i++) {
			if (choiceComp.choices[i] == null) {
				List<IChoice> parallelChoiceList = new ArrayList<IChoice>();
				if (parallelChoice != null) {
					for (InheritingChoice choice: parallelChoice.parallelChoices) {
						if (choice.choices[i] != null) {
							parallelChoiceList.add(choice.choices[i]);
						}
					}
				}
				Set<IChoice> choiceSet = new HashSet<IChoice>();
				for (IEventType eventType: eventTypes.getSet()) {
					List<IChoice> choices = null;
					if (parallelChoiceList.size() == 0) {
						choices = behaviours[i].getChoices(eventType);
					} else if (behaviours[i] instanceof IParallelElementBehaviour) {
						choices = ((IParallelElementBehaviour) behaviours[i]).getChoices(parallelChoiceList,eventType);
						if (!parallelTrigger) {
							for (IChoice choice: new ArrayList<IChoice>(choices)) {
								// remove choices that are touching on existing parallel choices
								boolean eventFound = false;
								for (IEventType eventType2: choice.getEventTypes()) {
									if (parallelEventTypes.covers(eventType2)) {
										eventFound = true;
										break;
									}
								}
								if (eventFound) {
									choices.remove(choice);
								}
							}
						}
					} 
					if (choices != null && !choices.isEmpty()) {
						choiceSet.addAll(choices);
					}
				}
				if (choiceSet != null && !choiceSet.isEmpty()) {
					List<InheritingChoiceComputation> list = new ArrayList<InheritingChoiceComputation>();
					choiceloop: for (IChoice choice: choiceSet) {
						for (IEventType eventType: eventTypes.getSet()) {
							boolean covered = false;
							for (IEventType eventType2: choice.getEventTypes()) {
								if (eventType2.getTopSuper() == eventType.getTopSuper()) {
									covered = true;
									break;
								}
							}
							if (!covered) {
								// TODO still to be decided, whether the events that must be covered
								//      should come from the behaviour (as is implemented right now)
								//      or from the structure.
								for (IEventType eventType2: behaviours[i].getTopLevelEventTypes()) {
									if (eventType.getTopSuper() == eventType2) {
										// An event type that must be supported does not occur in this choice;
										// therefore, this choice is not considered.
										continue choiceloop;
									}
								}
							}
						}
						InheritingChoiceComputation inheritingChoice = new InheritingChoiceComputation(choiceComp);
						if (inheritingChoice.setChoice(choice, i)) {
							EventTypeSet newEventTypes = new EventTypeSet();
							for (IEventType type: choice.getEventTypes()) {
								if (!oldTypes.covers(type) && !eventTypes.covers(type)) {
									newEventTypes.add(type);
								}
							}
							if (!newEventTypes.isEmpty() && i > 0) {
								list.addAll(computeChoiceComputations(parallelChoice,parallelTrigger,inheritingChoice,newEventTypes.getSet(),0,i));
							} else {
								list.add(inheritingChoice);
							}
						}
					}
					if (i+1 < max) {
						List<InheritingChoiceComputation> result = new ArrayList<InheritingChoiceComputation>();
						for (InheritingChoiceComputation comp: list) {
							EventTypeSet newEventTypes = new EventTypeSet(); 
							newEventTypes.addAll(comp.getEventTypes());
							newEventTypes.removeAll(oldTypes);
							newEventTypes.addAll(eventTypes);
							result.addAll(computeChoiceComputations(parallelChoice,parallelTrigger,comp,newEventTypes.getSet(),i+1,max));
						}
						return result;
					} else {
						return list;
					}
				} else {
					for (IEventType eventType: eventTypes.getSet()) {
						// TODO still to be decided, whether the events that must be covered
						//      should come from the behaviour (as is implemented right now)
						//      or from the structure.
						for (IEventType eventType2: behaviours[i].getTopLevelEventTypes()) {
							if (eventType.getTopSuper() == eventType2) {
								// The event type should be supported; but it is not;
								// so, this is not a choice.
								return  new ArrayList<InheritingChoiceComputation>();
							}
						}
					}
				}
			} else if (choiceComp.choices[i] == noop) {
				List<InheritingChoiceComputation> result = new ArrayList<InheritingChoiceComputation>();
				result.add(choiceComp);
				return result;
			} else {
				// Check whether the existing choice covers all required (new) EventTypes
				//
				// TODO still to be decided, whether the events that must be covered
				//      should come from the behaviour (as is implemented right now)
				//      or from the structure.
				for (IEventType eventType: eventTypes.getSet()) {
					boolean covered = false;
					for (IEventType eventType2: choiceComp.choices[i].getEventTypes()) {
						if (eventType2.getTopSuper() == eventType.getTopSuper()) {
							covered = true;
							break;
						}
					}
					if (!covered) {
						for (IEventType eventType2: behaviours[i].getTopLevelEventTypes()) {
							if (eventType.getTopSuper() == eventType2) {
								// the selected choice does not cover a required EventType;
								// therefore, this will not be able to complete successfully;
								// the empty result is returned
								return new ArrayList<InheritingChoiceComputation>();
							}
						}
					}
				}	
			}
		}
		return new ArrayList<InheritingChoiceComputation>();
	}
	
	public static IElementBehaviour createElementBehaviour(
			ExecutionEngine engine,
			Object element,
			IElementType type,
			IPackageAdapter adapter) {
		
			ArrayList<IElementBehaviour> behaviours = new ArrayList<IElementBehaviour>();
			IElementType type2 = type;
			while (type2 != null) {
				IPackageAdapter adapter2 = engine.getPackageAdapter(type2);
				if (adapter2 != null) {
					IElementBehaviour behaviour = adapter2.createElementBehaviour(element, type2);
					if (behaviour != null) {
						behaviours.add(behaviour);
					}
				}
				type2 = type2.getSuperElementType();
			}
			if (behaviours.size() == 0) {
				return null;
			}
			return new InheritingBehaviour(engine, type,element,behaviours);
	}

	@Override
	public void notifyChange(IElementBehaviour elementBehaviour) {
		notifyChangeListeners();
	}

	@Override
	public synchronized void registerListener(IChangeListener listener) {
		super.registerListener(listener);
		for (IElementBehaviour behaviour: behaviours) {
			behaviour.registerListener(this);
		}
	}

	@Override
	public synchronized void unregisterListener(IChangeListener listener) {
		super.unregisterListener(listener);
		for (IElementBehaviour behaviour: behaviours) {
			behaviour.unregisterListener(this);
		}
	}
	
	/**
	 * Returns the top level event types for which this behaviour contributes
	 * choices. Other event types are ignored by this behaviour.
	 */
	public Set<IEventType> getTopLevelEventTypes() {
		return this.topLevelEventTypes;
	}
	
	/**
	 * Returns true, if all the behaviour supports parallel behaviour. I.e. if
	 * all the parts of the behaviour are parallel.
	 * 
	 */
	public boolean isParallelBehaviour() {
		return isParallel;
	}
	
	public List<IElementBehaviour> getBehaviours() {
		List<IElementBehaviour> result = new ArrayList<IElementBehaviour>();
		for (IElementBehaviour behaviour: behaviours) {
			result.add(behaviour);
		}
		return result;
		
	}

}
