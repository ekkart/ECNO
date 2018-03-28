package dk.dtu.imm.se.ecno.runtime;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IChangeListener;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public abstract class AbstractElementBehaviour implements IElementBehaviour  {

	final protected ExecutionEngine engine;
	
	final private IElementType type;
	
	final private WeakReference<Object> elementRef;
	
	private List<IChangeListener> listeners;
	
	public AbstractElementBehaviour(ExecutionEngine engine, IElementType type, Object element) {
		super();
		this.engine = engine;
		this.type = type;
		elementRef = new WeakReference<Object>(element);
		listeners = new ArrayList<IChangeListener>();
	}
	
	public IElementType getElementType() {
		return type;
	}
	
	/**
	 * Returns the object for this behaviour.
	 *
	 * @return the element 
	 */
	@Override
	final public Object getElement() {
		return elementRef.get();
	}	
	
	@Override
	public synchronized void registerListener(IChangeListener listener) {
		listeners.add(listener);		
	}

	@Override
	public synchronized void unregisterListener(IChangeListener listener) {
		listeners.remove(listener);
	}
	
	final private synchronized List<IChangeListener> getAndRemoveListeners() {
		List<IChangeListener> result = listeners;
		listeners = new ArrayList<IChangeListener>();
		return result;
	}
	
	final protected void notifyChangeListeners() {
		// eki: note that every listener is notified about a change at most once
		List<IChangeListener> listenersList = getAndRemoveListeners();
		for (IChangeListener listener: listenersList) {
			listener.notifyChange(this);
		}	
	}

}
