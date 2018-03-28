package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;

public class ElementChoiceContinuation extends Continuation {

	private IChoice choice;
	private Event event;
	private boolean initialized;
	private int no;
	private List<IEventType> eventTypes;
	
	public ElementChoiceContinuation(ExecutionEngine engine, Object element, IChoice choice, Event event) {
		super(engine, element);
		this.choice = choice;
		this.event = event;
		this.initialized = false;
		this.eventTypes = null;
		this.no = 0;
	}
	
	protected ElementChoiceContinuation(ElementChoiceContinuation continuation, CopyMappings mappings) {
		super(continuation, mappings);
		this.choice = mappings.getCopy(continuation.choice);
		this.event = mappings.getCopy(continuation.event);
		this.initialized = continuation.initialized;
		this.eventTypes = continuation.eventTypes;
		this.no = continuation.no;
	}

	@Override
	public List<Continuation[]> computeContinuations(Interaction interaction, InteractionIterator iterator) {
		
		// XXX note that we do not add any element here to the touched list !!

		List<Continuation[]> continuations = new ArrayList<Continuation[]>();
		
		if (!initialized) {
			IChoice c = interaction.getElementsChoice(this.choice.getOwner().getElement());
			if (c == null) {
				// ekki 20.10.2015 (next 12 lines replaced line after):
				// added  ParalleChoice wrapper here (removed it from InheritingBehaviour.getChoices():
				ParallelChoice pChoice = null;
				if (choice instanceof InheritingChoice) {
					InheritingChoice iChoice = (InheritingChoice) choice;
					IElementBehaviour owner = iChoice.getOwner();
					if (owner instanceof InheritingBehaviour) {
						if (((InheritingBehaviour) owner).isParallelBehaviour()) {
							pChoice = new ParallelChoice(iChoice);
							choice = pChoice.getChoices().get(0);
						}
					}
				}
				if (pChoice != null) {
					interaction.add(pChoice);
				} else {
					interaction.add(this.choice);
				}
				// interaction.add(this.choice);
				eventTypes = choice.getEventTypes();
			} else if (c instanceof ParallelChoice && choice instanceof InheritingChoice) {
				ParallelChoice parallelChoice = new ParallelChoice((ParallelChoice) c, (InheritingChoice) choice );
				// TODO eki 8. 4. 2012: this is a minor hack since we replace an existing choice with
				//                      a new one in the interaction; the way this is done and
				//                      used other places, this should be okay. To this end, the
				//                      choice of the interaction should be used with great care
				//                      by other continuations; otherwise, the computation could
				//                      be messed up
				interaction.add(parallelChoice);
				List<IEventType> eventTypesTMP = choice.getEventTypes();
				List<IEventType> list = new ArrayList<IEventType>();
				for (IEventType eventType: eventTypesTMP) {
					if (choice.getOwner().getElementType().isParallelTriggerEvent(eventType)) {
						// TODO ekki 20. 10. 2015: event.getType() != eventType should probably
						//      better be: event.getType().getTopSuper() != eventType.getTopSuper()
						if (event != null && event.getType() != eventType) {
							// eki: 11. 4. 2013
							// create new events for the other (!) parallel triggered events in order
							// to make sure that a new instance of this event is "triggered" here
							choice.addEvent(engine.createInstance(eventType));
						}
						list.add(eventType);
					} else {
						if (!parallelChoice.wasEventTypesHandled(eventType)) {
							list.add(eventType);
							parallelChoice.addHandledEventType(eventType);
						} 
					}
				}
				eventTypes = list; // toArray(new IEventType[list.size()]);
			} else {
				// XXX this should not happen (checked earlier)
				continuations.add(new Continuation[]{new Failure(engine, element)});
				return continuations;				
			}
			
			boolean eventFound = false;
			boolean success = false;
			List<IEventType> eventTypesTMP = choice.getEventTypes();
			if (eventTypesTMP != null) {
				for (int i = 0; i < eventTypesTMP.size(); i++) {
					if (event.getType().getTopSuper().equals(eventTypesTMP.get(i).getTopSuper())) {
						eventFound = true;
						if (event.getType().equals(eventTypesTMP.get(i))) {
							Event e = choice.getEvent(eventTypesTMP.get(i));
							if (e != null) {
								success = e.unify(event);
							} else {
								choice.addEvent(event);
								success = true;
							}
						} else if (event.getType().getSuperTypes().contains(eventTypesTMP.get(i))) {
							Event e = choice.getEvent(eventTypesTMP.get(i));
							if (e != null) {
								success = e.unify(event);
							} else {
								choice.addEvent(event);
								success = true;
							}
						} else if (eventTypesTMP.get(i).getSuperTypes().contains(event.getType())) {
							Event e = choice.getEvent(eventTypesTMP.get(i));
							if (e != null) {
								success = e.unify(event);
							} else {
								event.specialize(eventTypesTMP.get(i));
								choice.addEvent(event);
								success = true;
							}
						}
						// eki: note that we can successfully or unsuccessfully finish here, since a choice
						//      cannot have two events with incompatible types but with a
						//      common super type
						break;
					}
				}
			}

			if (!eventFound || !success) {
				continuations.add(new Continuation[]{new Failure(engine, element)});
				return continuations;
			}
			
			initialized = true;
		}
		
		if (eventTypes != null) {
			if (no < eventTypes.size()) {
				IEventType eventType = eventTypes.get(no);
				no++;

				Event event = choice.getEvent(eventType);
				if (event == null) {
					event = new Event(engine, eventType);
					choice.addEvent(event);
				} else {
					if (eventType.getSuperTypes().contains(event.getType())) {
						// The new eventType is more specific: So, we need to make
						// the event more specific
						event.specialize(eventType);
					} else if (!event.getType().getSuperTypes().contains(eventType)) {
						// the event types are incompatible, which results in failure
						continuations.add(new Continuation[]{new Failure(engine, element)});
						return continuations;
					} 
				}

				Set<ICoordinationSet> coordSets = engine.getCoordinationSets(this.type);
				boolean coordSetAdded = false;
				for (ICoordinationSet coordSet: coordSets) {
					IEventType triggerType = coordSet.getTriggerEventType();
					if (triggerType != null) {
						if (triggerType.getTopSuper().equals(eventType.getTopSuper())) {
							// TODO ekki@dtu.dk, 18. 5. 2015: Here we could make a change that only
							// coordination sets specified by the choice are considered.
							coordSetAdded = true;
							continuations.add(new Continuation[]{this,
									new ElementCoordinationSetContinuation(engine, element,
											coordSet.getPriority(),
											coordSet.getSynchonisationsList().toArray(new ISynchronisation[coordSet.getSynchonisationsList().size()]),
											triggerType, event)});
						}
					}
				}
				if (!coordSetAdded) {
					continuations.add(new Continuation[]{this});
				}
			}
		} else {
			continuations.add(new Continuation[]{new Failure(engine, element)});
		}
		return continuations;
	}

	@Override
	public Continuation copy(CopyMappings mappings) {
		return new ElementChoiceContinuation(this,mappings);
	}

}
