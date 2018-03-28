package dk.dtu.imm.se.ecno.engine;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IInvalidationListener;
import dk.dtu.imm.se.ecno.runtime.IInvalidationNotifier;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

public abstract class ElementEventController {

	final public ExecutionEngine engine;
	final public Object element;
	final public IEventType eventType;
	
	private InteractionIterator iterator;
	protected Interaction interaction;
	
	private IInvalidationListener listener;
	
	public ElementEventController(ExecutionEngine engine, Object element, IEventType eventType) {
		this.engine = engine;
		this.element = element;
		this.eventType = eventType;
		
		this.interaction = null;

		this.listener = new IInvalidationListener() {

			@Override
			public void notifyInvalidation(
					IInvalidationNotifier invalidationNotifier) {
				ElementEventController.this.update();
			}

		};
		// note that this listener is only created here; it will be
		// registered with the respective interactions or interaction
		// iterators during the update() and indirectly during the
		// initialize()
	}
	
	final public void initialize() {
		init();
		update();		
	}
	
	/** 
	 * Semaphor for making sure that only one update is active at a time
	 */
	private boolean updating = false;
	
	/**
	 * Flag indicating that while updating was in progress, another update
	 * request came in.
	 */
	private boolean unclean = false;
	
	private synchronized boolean enterUpdate() {
		if (disposing) {
			// do not enter update, if dispose is announced
			return false;
		}
		
		if (!updating) {
			// if not updating, mark the update as potentially
			// clean and indicate that updating is in progress
			// allow update to proceed
			unclean = false;
			updating = true;
			return true;
		} else {
			// if another update request comes in during the
			// update request, mark update process as unclean
			// but do not enter another update
			unclean = true;
			return false;
		}
	}
	
	private synchronized boolean leaveUpdate() {
		if (disposing) {
			// if dispose is announced, end updating
			updating = false;
			// and wake up all threads (in particular the ones 
			// waiting for entering the dispose (should actually
			// be only one (therefore notify should be good enough here)
			notify();
			// but independent on the clean state, do
			// allow the update to leave (result won't be
			// used for anything anyway.
			return true;
		}
		
		if (unclean) {
			// if there was another update request in the
			// meanwhile, enforce another round of update
			// but mark the round as clean
			unclean = false;
			return false;
		} else {
			// if no other update request came in, allow
			// the update to finish successfully
			updating = false;
			return true;
		}
	}
	
	public void update() {
		if (enterUpdate()) {
			// XXX eki: can be deleted eventually
			// long start = System.nanoTime();
			do {
				if (listener != null) {
					if (interaction != null) {
						interaction.unregisterListener(listener);
						interaction.dispose();
						interaction = null;
					}
					if (iterator != null) {
						iterator.unregisterListener(listener);
						iterator.dispose();
						iterator = null;
					}

					boolean success = false;
					do {
						iterator = engine.getInteractions(element, getEvent());
						success = true;
						try {
							iterator.registerListener(listener);
							if (iterator.hasNext()) {
								interaction = iterator.next();
								interaction.registerListener(listener);
								// iterator.unregisterListener(listener);
								setEnabled(true);
							} else {
								setEnabled(false);
							}
						} catch (InvalidStateException e) {
						    success = false;
							if (iterator != null) {
								iterator.unregisterListener(listener);
								iterator.dispose();
							}
							if (interaction != null) {
								interaction.unregisterListener(listener);
								interaction.dispose();
								interaction = null;
							}
						}
					} while (!success);
				}
			} while (!leaveUpdate());
			/* XXX eki: can be deleted eventually
			long stop = System.nanoTime();
			System.out.println(
					"Update " + element.getClass().getSimpleName() + ", " + eventType.getName() + " " + (stop-start)*1E-9 + " seconds.");
			*/
		}
	}
	
	public void next() {
		if (enterUpdate()) {
			boolean newIterator = false;
			long start = System.nanoTime();
			do {
				if (listener != null) {
					boolean success = false;
					do {
						if (iterator == null) {
							iterator = engine.getInteractions(element, getEvent());
							try {
								iterator.registerListener(listener);
								newIterator = true;
								if (interaction != null) {
									interaction.unregisterListener(listener);
									interaction.dispose();
									interaction = null;
								}
							} catch (InvalidStateException e) {
								iterator.dispose();
								iterator = null;
							}
						}

						try {			
							if (iterator != null) {
								success = true;
								if (iterator != null && iterator.hasNext()) {
									if (interaction != null) {
										interaction.unregisterListener(listener);
										interaction.dispose();
										interaction = null;
									}
									interaction = iterator.next();
									interaction.registerListener(listener);
									if (!newIterator) {
										setNext();
									} else {
										setEnabled(true);
									}
								} else {
									if (newIterator) {
										setEnabled(false);
									}
								}
							}
						} catch (InvalidStateException e) {
							iterator.unregisterListener(listener);
							iterator.dispose();
							iterator = null;
							success = false;
						}
					} while (!success);
				}
			} while (!leaveUpdate());
			long stop = System.nanoTime();
			System.out.println(
					"Update " + element.getClass().getSimpleName() + ", " + eventType.getName() + " " + (stop-start)*1E-9 + " seconds.");
		}
	}
	
	final public void execute() {
		Interaction interaction = this.interaction;
		if (!disposing && interaction != null) {
			try {
				// Note that it might happen that, by a concurrent invalidation,
				// this interaction is not valid anymore, when the execution is 
				// scheduled -- or that it is invalidated during the execution.
				// It depends of the kind of transaction what happens then:
				// Either nothing happens at all, or the execution is partially 
				// executed. If all the changes result from the execution of 
				// interactions only (or if the changes are made under transaction
				// control), it will be all or nothing; otherwise, partial execution
				// might happen.
				interaction.execute();
				showResult(interaction);
				
				// Note that we do not need to update the button explicitly here, 
				// since the updated will be triggered by the invalidation 
				// notification of the interaction.
			} catch (InvalidStateException e) {
				// Note that we do not need to update the button in 
				// the case of an exception either, since the updated will be t
				// triggered by the invalidation notification of the interaction.
			}
		} 
	}
	
	protected void showResult(Interaction interaction) {
		// This is a bit ad hoc way of allowing subclasses of this controller
		// to update the GUI based on the outcome of the execution. This could
		// eventually be done in a uniform way for all controllers.
		// Sub classes should overwrite this method.
	}
	
	private boolean disposing = false;
	
	private synchronized boolean enterDispose() {
		if (disposing) {
			return false;
		}
		disposing = true;
		while (updating) {
			try {
				// note that only once in the life-time of this object, an
				// single thread is waiting in this loop (maybe several times).
				// That is why a notify() in the leaveUpdate() method is
				// enough.
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		return true;
	}
	
	final public void dispose() {
		if (enterDispose()) {
			destroy();

			if (interaction != null) {
				interaction.unregisterListener(listener);
				interaction.dispose();
				interaction = null;
			}
			if (iterator != null) {
				iterator.unregisterListener(listener);
				iterator.dispose();
				iterator = null;
			}
			listener = null;
		}
	}
	
	public InteractionIterator getInteractionIterator() {
		return iterator;
	}
	
	public IInvalidationListener getIInvalidationListener() {
		return listener;
	}
		
	/**
	 * Initializes the parts of the concrete controller. Does nothing here. Can be overridden by
	 * subclasses if necessary.
	 */
	protected void init() { }

	/**
	 * Provides an instance of the event for which the interactions for the selected
	 * element should be computed, whenever the interactions need to be recomputed.
	 * Subclasses can override this method, e.g. for adding values for some parameter
	 * to this event.
	 * 
	 * @return the triggering event for which the interactions will be computed
	 */
	protected Event getEvent() {
		return new Event(engine, this.eventType);
	}
	
	/**
	 * Updates the enabledness status of the respective interaction. Note that
	 * the execution method should only be called when the last call to setEnabled()
	 * was true. The setEnabled() method can be used by sub-classes to schedule the
	 * call of the execution method, after it gets enabled -- but the setEnabled()
	 * method should never call the execution method directly.
	 * 
	 * @param enabled
	 */
	protected abstract void setEnabled(boolean enabled);
	
	/**
	 * When switching to the next interaction, this method is called to updates the status.
	 * The method can be overwritten by subclasses if needed (for example for visualizing
	 * the change to a new interaction in the GUI).
	 */
	protected void setNext() {
		setEnabled(true);
	}

	/**
	 * Takes down all the parts of the concrete controller (which, typically, were created in 
	 * the init() method). 
	 */
	protected void destroy() { }

}
