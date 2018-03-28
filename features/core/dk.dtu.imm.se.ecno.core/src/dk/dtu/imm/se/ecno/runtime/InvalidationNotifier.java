package dk.dtu.imm.se.ecno.runtime;

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.transactions.TransactionManager;

public class InvalidationNotifier implements IInvalidationNotifier {

	private List<IInvalidationListener> listeners;
	
	private boolean invalidated;
	
	final protected ExecutionEngine engine;

	public InvalidationNotifier(ExecutionEngine engine) {
		super();
		listeners = new ArrayList<IInvalidationListener>();
		invalidated = false;
		this.engine = engine;
	}

	@Override
	final public synchronized void registerListener(IInvalidationListener listener) throws InvalidStateException {
		if (!invalidated) {
			listeners.add(listener);
		} else {
			throw new InvalidStateException();
		}
	}

	@Override
	final public synchronized void unregisterListener(IInvalidationListener listener) {
		listeners.remove(listener);
	}

	public boolean isValid() {
		return !invalidated;
	}

	final private synchronized List<IInvalidationListener> getAndRemoveListeners() {
		List<IInvalidationListener> result = listeners;
		listeners = new ArrayList<IInvalidationListener>();
		return result;
	}

	synchronized private boolean isValidAndInvalidate() {
		boolean result = invalidated;
		invalidated = true;
		return !result;
	}

	final protected boolean notifyInvalidationListeners()  {
		boolean result = isValidAndInvalidate();
		if (result) {
			TransactionManager transactionManager = engine.getTransactionManager();
			boolean deferred = false;
			
			if (transactionManager.inTransaction() && !listeners.isEmpty()) {
				try {
					transactionManager.registerTransactionStoppedListener(this);
					deferred = true;
				} catch (InvalidStateException e) { }
			}
			
			if (!deferred) {
				List<IInvalidationListener> listenersList = getAndRemoveListeners();
				for (IInvalidationListener listener: listenersList) {
					listener.notifyInvalidation(this);
				}	
			}
		}
		return result;
	}
	
	protected void dispose() {
		// make sure that in the end, the invalidation listers are informed
		// if a listener does not want to be informed, it needs to unregister
		// before. It might be however, that the notifications only come
		// a bit later, at the end of the transaction where this dispose
		// was called.
		notifyInvalidationListeners();
	}
	
	public void notifyTransactionStopped() {
		List<IInvalidationListener> listenersList = getAndRemoveListeners();
		for (IInvalidationListener listener: listenersList) {
			listener.notifyInvalidation(this);
		}	
	}

}
