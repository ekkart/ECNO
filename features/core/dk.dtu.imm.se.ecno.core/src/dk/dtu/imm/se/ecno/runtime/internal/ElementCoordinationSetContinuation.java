package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.SynchronisationType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.Link;

public class ElementCoordinationSetContinuation extends Continuation {
	
	private ISynchronisation[] coordSet;
	private int no;
	
	// triggerType is used to assure compatibility of event with its trigger here (and
	// possibly cast the event to the more specific type of the trigger event type
	private IEventType triggerType;
	private Event event;
	
	// TODO eki 18. 4. 2012: I guess the compatibility could now be checked when creating
	//                       this continuation; so we could remove the triggerType here,
	//                       once this check is done.

	public ElementCoordinationSetContinuation(ExecutionEngine engine, Object element,
			int priority, ISynchronisation[] coordSet, IEventType triggerType, Event event) {
		super(engine, element, priority);
		this.coordSet = coordSet;
		this.no = 0;
		this.triggerType = triggerType;
		this.event = event;
	}
	
	protected ElementCoordinationSetContinuation(ElementCoordinationSetContinuation continuation, CopyMappings mappings) {
		super(continuation, mappings);
		this.coordSet = continuation.coordSet;
		this.no = continuation.no;
		this.triggerType = continuation.triggerType;
		this.event = mappings.getCopy(continuation.event);
	}

	@Override
	public List<Continuation[]> computeContinuations(Interaction interaction, InteractionIterator iterator) {
		List<Continuation[]> continuations = new ArrayList<Continuation[]>();
		
		if (no == 0) {
			// Check compatibility of trigger event and, if necessary, specialize it
			// eki 18. 4. 2012: 
			// Event e = interaction.getEvent(element, triggerType);
			Event e = event;
			// TODO remove the above assignment and replace all occurrences of e
			//      with event
			if (e != null) {
				if (triggerType.getSuperTypes().contains(e.getType())) {
					e.specialize(triggerType);
				} else if (!e.getType().getSuperTypes().contains(triggerType)) {
					// event types are incompatible
					continuations.add(new Continuation[]{new Failure(engine, element)});
					return continuations;
				}
			} else {
				// eki: should never happen, since the event should have been triggered
				//      with the element already earlier.
				continuations.add(new Continuation[]{new Failure(engine, element)});
				return continuations;
			}
		}

		if (no < coordSet.length) {
			ISynchronisation reference = coordSet[no];
			no++;
			if (reference != null) {
				if (reference.getSyncType().equals(SynchronisationType.ALL)) {
					continuations.add(new Continuation[]{this, 
							new ElementALLLinksContinuation(engine, element,reference,event)});
				} else {
					iterator.addTouchedElement(this.element);
					List<Object> elements = adapter.getLinks(element, reference);
					IEventType eventType = reference.getEvent();
					// eki 18. 4. 2012
					// Event event = interaction.getEvent(element, eventType);
					if (elements == null || elements.size() == 0 || event == null ||
							(!eventType.getSuperTypes().contains(event.getType()) &&
									!event.getType().getSuperTypes().contains(eventType))) {
						continuations.add(new Continuation[]{new Failure(engine, element)});
					} else {
						boolean found = false;
						int index =0;
						for (Object object: elements) {
							IElementType elementType = engine.getElementType(object);
							Link link = new Link(element, object, reference.getReference(), index++);
							if (elementType.isDerivedFrom(reference.getReference().getTargetElementType())) {
								// note that we add elements only, if they are derived (or equal) from
								// the target type of the reference.
								continuations.add(
										new Continuation[]{this, 
												new ElementEventContinuation(engine, object, link, event, eventType)});
								found = true;
							}
						}
						if (!found) {
							// If no fitting object was found, make this computation fail
							continuations.add(new Continuation[]{new Failure(engine, element)});
						}
					}
				}
			} else {
				continuations.add(new Continuation[]{new Failure(engine, element)});
			}
		}
		return continuations;
	}

	@Override
	public Continuation copy(CopyMappings mappings) {
		return new ElementCoordinationSetContinuation(this,mappings);
	}

}
