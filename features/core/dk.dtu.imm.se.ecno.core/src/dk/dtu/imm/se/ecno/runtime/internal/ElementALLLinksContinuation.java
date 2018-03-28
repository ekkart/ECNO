package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.Link;

public class ElementALLLinksContinuation extends Continuation {
	
	private ISynchronisation coordinationReference;
	private Event event;
	private int no;

	public ElementALLLinksContinuation(ExecutionEngine engine, Object element,
			ISynchronisation reference, Event event) {
		super(engine, element);
		this.coordinationReference = reference;
		this.event = event;
		this.no = 0;
	}

	protected ElementALLLinksContinuation(ElementALLLinksContinuation continuation, CopyMappings mappings) {
		super(continuation, mappings);
		this.coordinationReference = continuation.coordinationReference;
		this.event = mappings.getCopy(continuation.event);
		this.no = continuation.no;
	}

	@Override
	public List<Continuation[]> computeContinuations(Interaction interaction, InteractionIterator iterator) {
		List<Continuation[]> continuations = new ArrayList<Continuation[]>();
		iterator.addTouchedElement(this.element);
		
		if (no == 0) {
			// first time we come in here, we register the event if it does
			// not exists; if it exists, compatibility is checked and the
			// more specific event type is used (if reference event type
			// is more specific).
			IEventType eventType = coordinationReference.getEvent();
			// eki 18. 4. 2012: the event is now provided with the Continutation
			// Event event = interaction.getEvent(this.element, eventType);
			if (event == null) {
				// eki 18. 4. 2012: would be a failure but should not happen
				// event = new Event(eventType);
				// interaction.add(this.element, event);
				continuations.add(new Continuation[]{new Failure(engine, element)});
				return continuations;
			} else if (eventType.getSuperTypes().contains(event.getType())) {
				event.specialize(eventType);
			} else if (!event.getType().getSuperTypes().contains(eventType)) {
				// event types not compatible
				continuations.add(new Continuation[]{new Failure(engine, element)});
				return continuations;
			}
		}
			
		List<Object> targetElements = this.adapter.getLinks(this.element, coordinationReference);
		if (targetElements != null && no < targetElements.size()) {
			Object targetElement = targetElements.get(no);
			Link link = new Link(this.element, targetElement, coordinationReference.getReference(), no);
			no ++;
			IElementType elementType = engine.getElementType(targetElement);
			if (elementType.isDerivedFrom(coordinationReference.getReference().getTargetElementType())) {
				// Only add this continuation if the ElementType of the targetElement fits
				// the ElementType of the target of the Reference
				IEventType eventType = coordinationReference.getEvent();
				/* eki 18. 4. 2012: 
				Event event = interaction.getEvent(this.element, eventType);
				if (event == null) {
					// eki: should actually not happen since event was initialized before
					// event = new Event(eventType);
					// interaction.add(this.element, event);
					continuations.add(new Continuation[]{new Failure(element)});
					return continuations;
				}
				*/ 
				
				continuations.add(
						new Continuation[]{this,
								new ElementEventContinuation(engine, targetElement, link, event, eventType)});
			} else {
				continuations.add(
						new Continuation[]{this});
			}
		}

		return continuations;
	}

	@Override
	public Continuation copy(CopyMappings mappings) {
		return new ElementALLLinksContinuation(this, mappings);

	}

}
