package dk.dtu.imm.se.ecno.runtime;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public class Event {
	
	final private ExecutionEngine engine;
	
	private IEventType type;
	
	private Map<IFormalParameter,Parameter> parameters;
	
	private Event delegate;
	

	public Event(ExecutionEngine engine, IEventType type) {
		super();
		this.engine = engine;
		this.delegate = null;
		this.type = type;
		
		this.parameters = new HashMap<IFormalParameter,Parameter>();
		/*
		List<IFormalParameter> formalParameters = type.getFormalParametersList();
		if (type != null && formalParameters != null && formalParameters.size() > 0) {
			for (IFormalParameter formalParameter: formalParameters) {
				parameters.put(formalParameter, engine.createParameter(formalParameter));
			}
		}
		*/
	}

	public IEventType getType() {
		Event delegate = getDelegate();
		return delegate.type;
	}

	public Parameter getParameter(IFormalParameter formalParameter) {
		Event delegate = getDelegate();
		Parameter parameter = delegate.parameters.get(formalParameter);
		if (parameter == null) {
			parameter = engine.createParameter(formalParameter);
			delegate.parameters.put(formalParameter, parameter);
		}
		return parameter;
	}
	
	private IEventType getClosesSuperTypeWithParameters(IEventType eventType) {
		// TODO right now, the Event lacks a means to find out whether it has
		//      its own parameters. To this end, we need this method. This
		//      should eventually be changed (the way this is implemented
		//      right now is extremely inefficient (the least would be to
		//      cash the result).
		int noParams = eventType.getFormalParametersList().size();
		IEventType result = eventType;
		IEventType superType = eventType.getDirectSuperType();
		Set<IEventType> touched = new HashSet<IEventType>();
		while (superType != null && !touched.contains(result)) {
			touched.add(result);
			if (superType.getFormalParametersList().size() < noParams) {
				return result;
			} else {
				result = superType;
				superType = result.getDirectSuperType();
			}
		}
		if (superType == null) {
			return result;
		} else {
			return null;
		}
		
	}
	
	public Event_Values getEventValues() {
		Event delegate = getDelegate();
		Event_Values result = null;
		if (delegate.type != null) {
			IEventType type = getClosesSuperTypeWithParameters(delegate.type);
			if (type != null) {
				IPackageAdapter adapter = engine.getPackageAdapter(type);
				if (adapter != null) {
					Class<? extends Event_Values> clazz = adapter.getEventValuesClass(type);
					if (clazz != null) {
						/*
						List<IFormalParameter> formalParameters = delegate.type.getFormalParametersList();
						Class<?>[] parameterTypes = new Class<?>[formalParameters.size()];
						for (int i=0; i< parameterTypes.length; i++) {
							if (!formalParameters.get(i).isCollective()) {
								parameterTypes[i] = formalParameters.get(i).getType();
							} else {
								// TODO this should be done more specifically for
								//      the type of this parameter ArrayList<formalParameters[i].getType()>
								parameterTypes[i] = List.class;
							}
						}
						Constructor<?> constructor = null;
						try {
							constructor = clazz.getConstructor(parameterTypes);
							if (constructor != null) {
								Object[] objects = new Object[parameterTypes.length];
								for (int i=0; i< parameterTypes.length; i++) {
									objects[i] = delegate.getParameter(formalParameters.get(i)).getValue();
								}
								result = (Event_Values) constructor.newInstance(objects);
							}
						} catch (Throwable e) {};
						*/
						
						Class<?>[] parameterTypes = new Class<?>[2];
						parameterTypes[0] = IEventType.class;
						parameterTypes[1] = Event.class;
						Constructor<? extends Event_Values> constructor = null;
						try {
							constructor = clazz.getConstructor(parameterTypes);
							if (constructor != null) {
								Object[] parameters = new Object[2];
								parameters[0] = this.getType();
								parameters[1] = this;
								result = (Event_Values) constructor.newInstance(parameters);
							}
						} catch (Exception e) {};
					}
				}
			}
		}
		return result;
	}
	
	public EventExtension_Values getEventExtensionValues(IEventTypeExtension extension) {
		EventExtension_Values result = null;
		if (extension != null) {
			IPackageAdapter adapter = engine.getPackageAdapter(extension);
			if (adapter != null) {
				Class<? extends EventExtension_Values> clazz = adapter.getEventValuesClass(extension);
				if (clazz != null) {
					Class<?>[] parameterTypes = new Class<?>[2];
					parameterTypes[0] = IEventTypeExtension.class;
					parameterTypes[1] = Event.class;
					Constructor<? extends EventExtension_Values> constructor = null;
					try {
						constructor = clazz.getConstructor(parameterTypes);
						if (constructor != null) {
							Object[] parameters = new Object[2];
							parameters[0] = extension;
							parameters[1] = this;
							result = (EventExtension_Values) constructor.newInstance(parameters);
						}
					} catch (Exception e) {};
				}
			}
		}

		return result;
	}

	public Event copy(CopyMappings mappings) {
		Event delegate = getDelegate();
		Event result = null;
		if (delegate == this) {
			result = new Event(engine, type);
		} else {
			result = mappings.getCopy(delegate);
		}
		for (IFormalParameter formalParameter: delegate.type.getFormalParametersList()) {
			if (formalParameter.isCollective()) {
				@SuppressWarnings("rawtypes")
				Collection values = (Collection) delegate.getParameter(formalParameter).getValue();
				Parameter parameter = result.getParameter(formalParameter);
				for (Object value: values) {
					parameter.setValue(value);
				}
			} else {
				result.getParameter(formalParameter).setValue(delegate.getParameter(formalParameter).getValue());
			}
		}
		return result;
	}
	
	/**
	 * Unifies two events, if this is possible (i.e. the event types are compatible and the
	 * values for every parameter of both events are compatible). The result indicates if
	 * unification was successful.
	 * 
	 * @param event the event this event should be unified with
	 * @return true, if the unification was possible
	 */
	public boolean unify(Event event) {
		Event unified = null;
		Event delegate1 = null;
		Event delegate2 = null;
		
		IEventType type = event.getType();
		if (type.getSuperTypes().contains(this.getType())) {
			// event is subtype of this event
			delegate1 = getDelegate();
			delegate2 = event.getDelegate();
			unified = new Event(engine, type);
		} else if (this.getType().getSuperTypes().contains(type)) {
			// this event is subtype of event
			delegate2 = getDelegate();
			delegate1 = event.getDelegate();
			unified = new Event(engine, this.getType());
		} else {
			// the events types are in incompatible; therefore, they
			// cannot be unified
			return false;
		}
		
		// in both successful cases, delegate1 will have the subtype of delegate2
		// und unified has the subtype
		
		if (delegate1 == delegate2) {
			return true;
		}
		
		for (IFormalParameter formalParameter: unified.getType().getFormalParametersList()) {
			if (formalParameter.isCollective()) {
				// Collect the values of both events and add them to the unified event.
				Parameter parameter = unified.getParameter(formalParameter);
				Parameter parameterOld = delegate1.getParameter(formalParameter);
				if (parameterOld != null) {
					@SuppressWarnings("rawtypes")
					Collection values = (Collection) parameterOld.getValue();
					for (Object value: values) {
						parameter.setValue(value);
					}
				}
				parameterOld = delegate2.getParameter(formalParameter);
				if (parameterOld != null) {
					@SuppressWarnings("rawtypes")
					Collection values = (Collection) parameterOld.getValue();
					for (Object value: values) {
						parameter.setValue(value);
					}
				}
			} else {
				Object value1 = delegate1.getParameter(formalParameter).getValue();
				Object value2 = delegate2.getParameter(formalParameter).getValue();
				if (value1 == null) {
					unified.getParameter(formalParameter).setValue(value2);
					// Ekkart Kindler 19. 5. 2015: fixed this stupid mistake
					// return false;
				} else if (value2 == null) {
					unified.getParameter(formalParameter).setValue(value1);
				} else if (value1.equals(value2)) {
					unified.getParameter(formalParameter).setValue(value1);
				} else {
					// in case both events have this parameter assigned and they are
					// not equal, the unification fails;
					return false;
				}
			}
		}
		
		delegate1.delegate = unified;
		delegate2.delegate = unified;
		return true;
	}
	
	public void specialize(IEventType type) {
		if (type.getSuperTypes().contains(this.type)) {
			this.type = type;
		}
	}

	private Event getDelegate() {
		if (delegate == null) {
			return this;
		} else {
			Event result = delegate.getDelegate();
			// On the fly, cut out intermediate delegates
			delegate = result;
			return result;
		}
	}
	
	/** 
	 * Do not use this method!
	 * 
	 * For the presentation, it is necessary to get hold of the
	 * identity of the actual event behind this one, which might occur
	 * due to unification of events during the computation of events.
	 * This method gives access to this event; this is not very
	 * nice and reveals implementation details. This method will
	 * eventually be removed and identity implemented in a different way. 
	 * 
	 * @return the event representing this one
	 */
	public Event theEvent() {
		// TODO eki 17. 9. 2012 remove this method and implement the
		//      presentation of an interaction in a different way.
		return getDelegate();
	}

}
