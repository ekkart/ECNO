package dk.dtu.imm.se.ecno.pn.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.pn.model.ElementType;
import dk.dtu.imm.se.ecno.pn.model.Reference;

/**
 * A class that on the one hand acts as an instance of an ElementType,
 * and on the other hand acts as the element behaviour. This way
 * the structural part and the behaviour part of the model are
 * integrated into one -- the element.
 * 
 * @author eki
 *
 */
public class Element {

	final protected ExecutionEngine engine;
	
	private IElementType type;
	
	private Map<Reference,List<Element>> links;
	
	private List<AbstractBehaviour> listeners;

	public Element(ExecutionEngine engine, ElementType type) {
		super();
		this.engine = engine;
		this.type = type;
		this.listeners = new ArrayList<AbstractBehaviour>();
		
		this.links = new HashMap<Reference,List<Element>>();		
		if (type != null & type.getReferences() != null) {
			for (Reference reference : type.getReferences()) {
				List<Element> list = new ArrayList<Element>();
				links.put(reference, list);
			}
		}		
	}
	
	public IElementType getElementType() {
		return type;
	}

	final public Element[] getLinks(Reference reference) {
		List<Element> elements = this.links.get(reference);
		if (elements != null) {
			return elements.toArray(new Element[elements.size()]);
		} else {
			return new Element[0];
		}
	}

	final public void addLink(Reference reference, Element element) {
		if (element != null &&
				reference.getTargetElementType() != null ) {
			if (element.isInstanceOf(reference.getTargetElementType())) {
				List<Element> list = links.get(reference);
				if (list == null) {
					throw new RuntimeException("The reference does not exist");
				}
				list.add(element);
				notifyChangeListeners();
			} else {
				throw new RuntimeException("The target element of the added link does not fit the target type of the reference");
			}
		}
	}

	final public void removeLink(Reference reference, Element element) {
		if (element != null &&
				reference.getTargetElementType() != null ) {
			List<Element> list = links.get(reference);
			if (list != null) {
				list.remove(element);
				notifyChangeListeners();
			}
		}
	}

	final public void removeAllLinks(Reference reference) {
		if (reference.getTargetElementType() != null ) {
			List<Element> list = links.get(reference);
			if (list != null) {
				list.clear();
				notifyChangeListeners();
			}
		}
	}

	final public boolean isInstanceOf(ElementType type) {
		IElementType thisType = getElementType();
		return thisType != null && (thisType instanceof ElementType) &&
		       ((ElementType) thisType).isSubtypeOf(type); 
	}
	
	public synchronized void registerListener(AbstractBehaviour listener) {
		listeners.add(listener);		
	}

	public synchronized void unregisterListener(AbstractBehaviour listener) {
		listeners.remove(listener);
	}
	
	final protected void notifyChangeListeners() {
		// eki: note that every listener is notified about a change at most once
		List<AbstractBehaviour> listenersList = new ArrayList<AbstractBehaviour>(listeners);
		for (AbstractBehaviour listener: listenersList) {
			listener.notifyChange(this);
		}	
	}

}
