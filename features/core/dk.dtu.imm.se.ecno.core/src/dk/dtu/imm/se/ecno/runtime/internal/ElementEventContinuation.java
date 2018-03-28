package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.Link;

public class ElementEventContinuation extends Continuation {

	private Link link;
	private Event event;
	private IEventType eventType;


	public ElementEventContinuation(ExecutionEngine engine, Object element, Link link, Event event) {
		super(engine, element);
		this.link = link;
		this.event = event;
		this.eventType = event.getType();
	}
	
	public ElementEventContinuation(ExecutionEngine engine, Object element, Link link, Event event, IEventType eventType) {
		super(engine, element);
		this.link = link;
		this.event = event;
		this.eventType = eventType;
	}
	
	protected ElementEventContinuation(ElementEventContinuation continuation, CopyMappings mappings) {
		super(continuation, mappings);
		this.link = continuation.link;
		this.event = mappings.getCopy(continuation.event);
		this.eventType = continuation.eventType;
	}

	@Override
	public List<Continuation[]> computeContinuations(Interaction interaction, InteractionIterator iterator) {
		List<Continuation[]> continuations = new ArrayList<Continuation[]>();
		if (link != null && event != null) {
			interaction.add(link, event);
		} else {
			interaction.add(element,event);
		}
		
        IElementType elementType = engine.getElementType(element);
		if (elementType == null) {
			continuations.add(new Continuation[]{new Failure(engine, element)});
			return continuations;
		}
		
        if (eventType.getSuperTypes().contains(event.getType())) {
			// specialize event to required type
			event.specialize(eventType);
		} else if (!event.getType().getSuperTypes().contains(eventType)){
			// event types not compatible
			continuations.add(new Continuation[]{new Failure(engine, element)});
			return continuations;
		}

		IChoice choice = interaction.getElementsChoice(element);
		boolean eventIsParallelTriggerEvent = elementType.isParallelTriggerEvent(event.getType());
		if (choice != null && !eventIsParallelTriggerEvent) {
			List<IEventType> eventTypes = choice.getEventTypes();
			Set<IEventType> parallelEventTypes = new HashSet<IEventType>();
			if (choice instanceof ParallelChoice) {
				for (InheritingChoice inheritingChoice: ((ParallelChoice) choice).parallelChoices) {
					if (!inheritingChoice.isParallelTriggerChoice) {
						// Only consider eventTypes that are not in parallely triggered choices
						for (IEventType eventType: inheritingChoice.getEventTypes()) {
							parallelEventTypes.add(eventType.getTopSuper());
						}
					}

				}
			}
			boolean eventFound = false;
			if (eventTypes != null) {
				boolean success = false;
				for (int i = 0; i < eventTypes.size(); i++) {
					if (parallelEventTypes.contains(event.getType().getTopSuper())) {
						// only consider events that are in non parallel trigger choices
						if (event.getType().getTopSuper().equals(eventTypes.get(i).getTopSuper())) {
							eventFound = true;
							if (event.getType().equals(eventTypes.get(i))) {
								Event e = choice.getEvent(eventTypes.get(i));
								if (e != null) {
									success = e.unify(event);
								} else {
									choice.addEvent(event);
									success = true;
								}
							} else if (event.getType().getSuperTypes().contains(eventTypes.get(i))) {
								Event e = choice.getEvent(eventTypes.get(i));
								if (e != null) {
									success = e.unify(event);
								} else {
									choice.addEvent(event);
									success = true;
								}
							} else if (eventTypes.get(i).getSuperTypes().contains(event.getType())) {
								Event e = choice.getEvent(eventTypes.get(i));
								if (e != null) {
									success = e.unify(event);
								} else {
									event.specialize(eventTypes.get(i));
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
				if (eventFound && !success) {
					continuations.add(new Continuation[]{new Failure(engine, element)});
					return continuations;
				}
			} 
			
			if (eventFound) {
				// eki: the exploration terminates here successfully (empty continuations)
				return continuations;
			} else if (choice instanceof ParallelChoice) {
				// TODO eki 8. 4. 2012: This was copied from the case where no choice was made yet (see case below)
				//                      and slightly adapted. This should be unified (mainly for maintenance
				//                      reasons).
				List<IChoice> choices = new ArrayList<IChoice>();
				Set<IEventType> eventTypes2 = engine.getEventTypes(element);
				if (eventTypes != null) {
					for (IEventType eventType: eventTypes2) {
						if (eventType.getSuperTypes().contains(event.getType()) ||
								event.getType().getSuperTypes().contains(eventType) ) {
							List<IChoice> typeChoices = engine.getChoices((ParallelChoice) choice, element, event.getType());
							if (typeChoices != null) {
								choices.addAll(typeChoices);
							}
						}
					}
				}
				
				if (choices != null && choices.size() > 0) {
					/*
					// eki 18. 4. 2012
					// Event elementEvent = interaction.getEvent(element, event.getType());
					Event elementEvent = choice.getEvent(event.getType());
					if (elementEvent == null) {
						// eki 18. 4. 2012
						// interaction.add(element, event);
						
						// Note that the event is added to the original choice (which would be 
						// parallel one; the reasons is that this is a shared element event
						// and not a triggered event
						choice.addEvent(event);
					} else {
						if (!event.unify(elementEvent)) {
							continuations.add(new Continuation[]{new Failure(element)});
							return continuations;
						}
					}
					*/
					for (IChoice c: choices) {
						if (c instanceof InheritingChoice) {
							continuations.add(new Continuation[]{
									new ElementChoiceContinuation(engine, element,c,event)});
						} else {
							// eki: should actually not happen if the rest of the implementation is correct
							continuations.add(new Continuation[]{new Failure(engine, element)});
						}
					}
				} else {
					continuations.add(new Continuation[]{new Failure(engine, element)});
					return continuations;
				}
			} else {
				continuations.add(new Continuation[]{new Failure(engine, element)});
				return continuations;
			}
		} else {
			// TODO: here, it would probably more efficient to compute the choices based
			//       on the event than only on the event's type.
			
			iterator.addTouchedElement(this.element);
			List<IChoice> choices = new ArrayList<IChoice>();
			ParallelChoice pChoice = null;
			
			if (choice != null && choice instanceof ParallelChoice) {
				pChoice = (ParallelChoice) choice;
			}

			Set<IEventType> eventTypes = engine.getEventTypes(element);
			if (eventTypes != null) {
				for (IEventType eventType: eventTypes) {
					if (eventType.getSuperTypes().contains(event.getType()) ||
							event.getType().getSuperTypes().contains(eventType) ) {
						List<IChoice> typeChoices = engine.getChoices(pChoice, element, event.getType());
						if (typeChoices != null) {
							choices.addAll(typeChoices);
						}
					}
				}
			}
			
			if (choices != null && choices.size() > 0) {
				for (IChoice c: choices) {
					continuations.add(new Continuation[]{new ElementChoiceContinuation(engine, element,c,event)});
					/*
					IEventType[] choiceEventTypes = c.getEventTypes();
					boolean eventFound = false;
					if (choiceEventTypes != null) {
						boolean success = false;
						for (int i = 0; i < choiceEventTypes.length; i++) {
							if (event.getType().getTopSuper().equals(choiceEventTypes[i].getTopSuper())) {
								eventFound = true;
						        // eki 19. 4. 2012: this was copied from the other case; it was simplified though
								if (event.getType().equals(choiceEventTypes[i])) {
									success = true;
								} else if (event.getType().getSuperTypes().contains(choiceEventTypes[i])) {
									success = true;
								} else if (choiceEventTypes[i].getSuperTypes().contains(event.getType())) {
									event.specialize(choiceEventTypes[i]);
									success = true;
								}
								// eki: note that we can unsuccessfully finish here, since a choice
								//      cannot have two events with incompatible types but with a
								//      common super type
								break;
							}
						}
						if (eventFound && success) {
							// note that in both cases (parallel trigger or now existing choice yet)
							// the event must be added to the new choice
							c.addEvent(event);

							continuations.add(new Continuation[]{new ElementChoiceContinuation(element,c)});
						} else {
							// do not add this choice
						}
					} 
					*/
				}
			} else {
				continuations.add(new Continuation[]{new Failure(engine, element)});
			}
		}

		return continuations;

	}

	@Override
	public Continuation copy(CopyMappings mappings) {
		return new ElementEventContinuation(this,mappings);
	}

}
