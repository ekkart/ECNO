package dk.dtu.imm.se.ecno.pn.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.pn.runtime.AbstractBehaviour;
import dk.dtu.imm.se.ecno.pn.runtime.Element;
import dk.dtu.imm.se.ecno.pn.runtime.SimpleBehaviour;

public class ElementType extends Namespace implements IElementType {


	private List<Reference> references;
	
	private Map<EventType,List<Set<CoordinationReference>>> eventMap;
	
	private List<EventType> guiEvents;
	
	private Set<IEventType> parallelTriggerEvents;
	
	private ElementType super_;
	
	private Set<IElementType> superTypes;
	
	private Class<?> elementClass;
	
	private Class<?> behaviourClass;

	public ElementType(Namespace container, String name, ElementType super_, 
			Class<?> elementClass, Class<?> behaviourClass) {
		super(container, name);
		this.references = new ArrayList<Reference>();
		this.eventMap = new HashMap<EventType,List<Set<CoordinationReference>>>();
	    this.guiEvents = new ArrayList<EventType>();
	    this.parallelTriggerEvents = new HashSet<IEventType>();
	    this.super_ = super_;
		this.elementClass = elementClass;
		this.behaviourClass = behaviourClass;
		this.superTypes = new HashSet<IElementType>();
		if (super_ != null) {
			superTypes.addAll(super_.superTypes);
			superTypes.add(super_);
		}
	}
	
	public ElementType(Namespace container, String name, ElementType super_) {
		this(container, name, super_, null, null);
	}
	
	public ElementType(Namespace container, String name, Class<?> elementClass) {
		this(container, name, null, elementClass, null);
	}
	
	public ElementType(Namespace container, String name, Class<?> elementClass, Class<?> behaviourClass) {
		this(container, name, null, elementClass, behaviourClass);
	}
	
	public ElementType(Namespace container, String name) {
		this(container, name, null, null, null);
	}

	public ElementType getSuperElementType() {
		return super_;
	}
	
	public boolean isSubtypeOf(ElementType type) {
		if (type != null) {
			if (this.equals(type)) {
				return true;
			} else if (super_ != null) {
				return super_.isSubtypeOf(type);
			} 
		} 
	    return false;
	}

	public List<Reference> getReferences() {
		List<Reference> result ;
		if (super_ != null) {
			result = super_.getReferences();

		} else {
			result = new ArrayList<Reference>();
		}
		result.addAll(this.references);
		return result;
	}
	
	public Reference getReference(String name) {
		for (Reference reference : getReferences()) {
			if (reference.getName().equals(name)) {
				return reference;
			}
		}
		
		return null;
	}
	
	void addReference(Reference reference) {
		if (reference != null &&
				reference.getSourceElementType() == this &&
				reference.getTargetElementType() != null) {
			references.add(reference);
		}		
	}

	public void addEventTypeCoordinationSet(EventType eventType, CoordinationReference[] coordinationReferences) {
		if (eventType != null) {
			Set<CoordinationReference> set = new HashSet<CoordinationReference>(); 
			
			for (int i=0; i< coordinationReferences.length; i++) {
				CoordinationReference coordinationReference = coordinationReferences[i];
				if (coordinationReference != null && eventType.equals(coordinationReference.getEvent())) {
					set.add(coordinationReference);
				}
			}
			
			List<Set<CoordinationReference>> list = eventMap.get(eventType);
			if (list == null) {
				list = new ArrayList<Set<CoordinationReference>>();
				eventMap.put(eventType, list);
			}
			list.add(set);
		}
	}
	
	public CoordinationReference[][] getCoordinationSets(IEventType eventType) {
		List<Set<CoordinationReference>> list = eventMap.get(eventType);
		if (list == null) {
			return new CoordinationReference[0][];
		} else {
			CoordinationReference[][] array = new CoordinationReference[list.size()][];
			int i = 0;
			for (Set<CoordinationReference> set: list) {
				array[i] = set.toArray(new CoordinationReference[0]);
				i++;
			}	
			return array;
		}
	}

	public List<ICoordinationSet> getCoordinationSetsList() {
		List<ICoordinationSet> result = new ArrayList<ICoordinationSet>();
		for (EventType type: eventMap.keySet()) {
			List<Set<CoordinationReference>> list = eventMap.get(type);
			if (list != null) {
				for (Set<CoordinationReference> set: list) {
					result.add(new CoordinationSet(type, new ArrayList<ISynchronisation>(set)));
				}
			}
		}
		return result;
	}
	
	public void addGUIEventType(EventType eventType) {
		guiEvents.add(eventType);
		
	}
	
	public void addParallelTriggerEventType(EventType eventType) {
		parallelTriggerEvents.add(eventType.getTopSuper());
		
	}
	
	public boolean supportsEventType(IEventType eventType) {
		return eventMap.containsKey(eventType);
	}
	
	public boolean isGUIEventType(EventType eventType) {
		return guiEvents.contains(eventType);
	}
	
	public List<IEventType> getGUIEventTypes() {
		return new ArrayList<IEventType>(guiEvents); 
	}
	
	public Element createInstance(ExecutionEngine engine) {
		Element result = null;
		if (elementClass == null) {
			result = new Element(engine, this);
		} else {
			try {
				Constructor<?> constructor = elementClass.getConstructor(
						new Class[]{ExecutionEngine.class, ElementType.class});
				result = (Element) constructor.newInstance(new Object[]{engine, this});
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public AbstractBehaviour createBehaviour(ExecutionEngine engine, Element element) {
		AbstractBehaviour result = null;
		if (behaviourClass == null) {
			result = new SimpleBehaviour(engine, this, element);
		} else {
			try {
				Constructor<?> constructor = behaviourClass.getConstructor(
						new Class[]{ExecutionEngine.class, ElementType.class, Element.class});
				result = (AbstractBehaviour) constructor.newInstance(new Object[]{engine, this, element});
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return result;
		
	}
	
	/*
	public Element createInstance(ExecutionEngine engine, Object object) {
		Element result = null;
		if (elementClass == null) {
			result = new Element(engine, this);
		} else {
			try {
				Constructor<?> constructor = elementClass.getConstructor(
						new Class[]{ExecutionEngine.class, ElementType.class});
				result = (Element) constructor.newInstance(new Object[]{engine, this});
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	*/

	@Override
	public boolean isDerivedFrom(IElementType elementType) {
		if (this.equals(elementType)) {
			return true;
		}
		return superTypes.contains(elementType);
	}

	@Override
	public boolean isParallelTriggerEvent(IEventType eventType) {
		return this.parallelTriggerEvents.contains(eventType.getTopSuper());
	}

}
