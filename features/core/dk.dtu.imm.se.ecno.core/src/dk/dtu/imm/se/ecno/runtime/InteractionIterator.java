package dk.dtu.imm.se.ecno.runtime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IChangeListener;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.internal.Continuation;
import dk.dtu.imm.se.ecno.runtime.internal.DepthFirstStrategy;
import dk.dtu.imm.se.ecno.runtime.internal.ElementEventContinuation;
import dk.dtu.imm.se.ecno.runtime.internal.Failure;
import dk.dtu.imm.se.ecno.runtime.internal.IExplorationStrategy;
import dk.dtu.imm.se.ecno.runtime.internal.InteractionComputation;
import dk.dtu.imm.se.ecno.runtime.internal.InteractionComputationPriorityList;

public class InteractionIterator extends InvalidationNotifier implements IChangeListener {
	
	private IExplorationStrategy computations;
	private Interaction next;
	
	private Set<IElementBehaviour> touchedElements;

	public InteractionIterator(ExecutionEngine engine, Object element, Event event) {
		super(engine);
		Interaction interaction = new Interaction(engine);
		interaction.setLabel(event.getType().getName());
		Continuation continuation = new ElementEventContinuation(engine, element, null, event);
		List<Continuation> stack = new ArrayList<Continuation>();
		stack.add(continuation);
		
		computations = new DepthFirstStrategy();
		// computations = new MinimalInteractionsFirstStrategy();
		computations.add(new InteractionComputation(interaction,stack));
		
		next = null;
		
		touchedElements = new HashSet<IElementBehaviour>();
	}

	public InteractionIterator(ExecutionEngine engine, Object element, IEventType eventType) {
		this(engine, element, new Event(engine, eventType));
	}
	
	public void addTouchedElement(Object element) {
		IElementBehaviour behaviour = engine.getElementBehaviour(element);
		if (behaviour == null)
			return;

        registerAsListenerFor(behaviour);
	}
	
	private synchronized void registerAsListenerFor(IElementBehaviour behaviour) {
		if (isValid() && !touchedElements.contains(behaviour)) {
			behaviour.registerListener(this);
			touchedElements.add(behaviour);
		}
	}
	
	boolean first = true;
	
	public boolean hasNext() throws InvalidStateException {
		if (isValid()) {
			if (next != null) {
				return true;
			}
			
			long start = System.nanoTime();
			while (!computations.isEmpty()) {
				InteractionComputation computation = computations.remove();

				List<Continuation> stack = computation.getStack();
				Interaction interaction = computation.getInteraction();
				if (stack.isEmpty()) {
					// TODO part of checking the conditions should actually be done as early
					//      as possible in order to increase efficiency
					if (interaction.checkConditions()) {
						next = interaction;
						double time = (System.nanoTime() - start) * 1.0E-6; // we use ms as unit here
						if (first) {
							engine.compTimeFirst.addValue(time);
							first = false;
						} else {
							engine.compTimeFollow.addValue(time);
						}
						// eki: make sure that computations that have lower priority than
						//      this one, are discarded.
						computations.discard(computation);
						return true;
					}
				} else {
					Continuation continuation = stack.remove(stack.size()-1);

					List<Continuation[]> continuations = 
							continuation.computeContinuations(interaction,this);

					InteractionComputationPriorityList priorityList = new InteractionComputationPriorityList();
					if (!continuations.isEmpty()) {
						for (int i = 0; i < continuations.size(); i++) {
							Continuation[] continuationl = continuations.get(i);
							if (!isValid()) {
								throw new InvalidStateException();
							}
							if (continuationl.length == 1 && continuationl[0] instanceof Failure) {

							} else {
								if (i+1 < continuations.size()) {
									// in order not to mix up different alternatives (computations of
									// interactions) we need to make copies of them
									CopyMappings mappings = new CopyMappings();
									InteractionComputation computation2 = computation.copy(mappings);
									int priority = 0;
									for (int j=0; j<continuationl.length; j++) {
										priority = continuationl[j].priority;
										computation2.getStack().add(continuationl[j].copy(mappings)); 
										if (!isValid()) {
											throw new InvalidStateException();
										}
									}
									priorityList.add(computation2,priority);
								} else {
									int priority = 0;
									// the last one does not need to be copied, which saves some time
									for (int j=0; j<continuationl.length; j++) {
										priority = continuationl[j].priority;
										computation.getStack().add(continuationl[j]); 
										if (!isValid()) {
											throw new InvalidStateException();
										}
									}
									priorityList.add(computation,priority);
								}
							}
						}
					} else {
						priorityList.add(computation,0);
					}
					priorityList.addToExploration(computations);
				}
			}
			double time = (System.nanoTime() - start) * 1.0E-6; // we use ms as unit here
			if (first) {
				engine.compTimeFailFirst.addValue(time);
				first = false;
			} else {
				engine.compTimeFailFollow.addValue(time);
			}
			return false;
		} else {
			throw new InvalidStateException();
		}
	}

	public Interaction next() throws InvalidStateException {
		if (hasNext()) {
			Interaction result = next;
			next = null;
			result.registerWithElements();
			return result;			
		} else {
			throw new NoSuchElementException("There are no more possible interactions for this element and event type");
		}
	}

	@Override
	public void notifyChange(IElementBehaviour elementBehaviour) {
		if (notifyInvalidationListeners()) {
			for (IElementBehaviour element: touchedElements) {
				element.unregisterListener(this);
			}
			touchedElements.clear();
		}
	}
	
	public void dispose() {
		super.dispose();
		for (IElementBehaviour element: touchedElements) {
			element.unregisterListener(this);
		}
		touchedElements.clear();
	}

}
