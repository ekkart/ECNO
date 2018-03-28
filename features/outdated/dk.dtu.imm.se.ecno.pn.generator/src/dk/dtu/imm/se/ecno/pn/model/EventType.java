package dk.dtu.imm.se.ecno.pn.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Event_Values;



public class EventType extends Namespace implements IEventType {
	
	final private List<FormalParameter> formalParameters;
	final private Class<? extends Event_Values> eventValuesClass;
	final private EventType superType;

	public EventType(Namespace container, String name, EventType superType, FormalParameter[] formalParameters, Class<? extends Event_Values> eventValuesClass) {
		super(container, name);
		this.superType = superType;
		this.formalParameters = new ArrayList<FormalParameter>();
		for (int i=0; i< formalParameters.length; i++) {
			this.formalParameters.add(formalParameters[i]);
		}
		
		if (eventValuesClass != null && Event_Values.class.isAssignableFrom(eventValuesClass)) {
			this.eventValuesClass = eventValuesClass;
		} else {
			this.eventValuesClass = null;
		}
	}
	
	public EventType(Namespace container, String name, FormalParameter[] formalParameters, Class<?  extends Event_Values> eventValuesClass) {
		this(container, name, null, formalParameters, eventValuesClass);
	}

	public EventType(Namespace container, String name, FormalParameter[] formalParameters) {
		this(container, name, formalParameters, null);
	}
	
	public EventType(Namespace container, String name) {
		this(container, name, new FormalParameter[0]);
	}
	
	public FormalParameter getFormalParameter(String name) {
		for (FormalParameter formalParameter : formalParameters) {
			if (formalParameter.getName().equals(name) ) {
				return formalParameter;
			}
		}
		
		return null;
	}
	
	public Class<? extends Event_Values> getEventValuesClass() {
		return eventValuesClass;
	}
	
	public Event createInstance(ExecutionEngine engine) {
		Event result = new Event(engine, this);
		return result;
	}

	@Override
	public EventType getDirectSuperType() {
		return superType;
	}

	private EventType topSuper;
	private Set<IEventType> allSuper;
	private List<IFormalParameter> allFormalParameters;
	
	// @generated NOT 
	@Override
	public IEventType getTopSuper() {
		// See comment of getSuperTypes
		if (topSuper == null) {
			getSuperTypes();
		}
		return topSuper;
	}

	@Override
	public Set<IEventType> getSuperTypes() {
		// In order to make this more efficient, we calculate this only
		// once. This, however, requires that getSuperTypes is called
		// only after all event types are fully created (in particular,
		// the directSuper must be set).
		if (allSuper == null) {
			Set<IEventType> touched = new HashSet<IEventType>();
			List<IFormalParameter> formalParameters = new ArrayList<IFormalParameter>();
			EventType current = this;
			EventType previous = current;
			
			while (current != null &&  !touched.contains(current)) {
				touched.add(current);
				formalParameters.addAll(current.formalParameters);
				previous = current;
				current = current.superType;
			}
			
			if (current == null) {
				allSuper = Collections.unmodifiableSet(touched);
				allFormalParameters = Collections.unmodifiableList(formalParameters);
				topSuper = previous;
			} else {
				// If this occurs, there is a cycle in the type hierarchy
				// of the event type. And this should actually not happen.
				// We could raise an exception here. The topSuper is some
				// event type on the cycle (actually, the last one before
				// closing the cycle).
				// TODO maybe, raise an exception here instead
				allSuper = Collections.unmodifiableSet(touched);
				allFormalParameters = Collections.unmodifiableList(formalParameters);
				topSuper = previous;
			}
		}
		return allSuper;
	}

	@Override
	public List<IFormalParameter> getFormalParametersList() {
		// See comment of getSuperTypes
		if (allFormalParameters == null) {
			getSuperTypes();
		}
		return allFormalParameters;
	}

	@Override
	public boolean isCompatibleWith(IEventType eventType) {
		if (this.getTopSuper() != eventType.getTopSuper()) {
			return false;
		} else {
			return this.getSuperTypes().contains(eventType) ||
					eventType.getSuperTypes().contains(this);
		}
	}

}
