package dk.dtu.imm.se.ecno.gui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.internal.ParallelChoice;

public class PresentationUtil implements IPresentationUtil{

	ExecutionEngine engine;

	ECNOGUI gui;

	public PresentationUtil(ExecutionEngine engine, ECNOGUI gui) {
		super();
		this.engine = engine;
		this.gui = gui;
	}

	public String getElementLabel(Object element) {
		IElementType elementType = engine.getElementType(element);

		// Get some name out of the object reflectively;
		String elementName = null;
		Class<?> clazz = element.getClass();
		try {
			Method method = clazz.getMethod("getName", new Class<?>[0]);
			if (method != null) {
				try {
					Object result = method.invoke(element, new Object[0]);
					if (result instanceof String) {
						elementName = (String) result;
					}
				} catch (IllegalArgumentException e) {		
				} catch (IllegalAccessException e) {
				} catch (InvocationTargetException e) {
				}
			}
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		}

		if (elementName == null) {
			Method method;
			try {
				method = clazz.getMethod("getId", new Class<?>[0]);
				if (method != null) {
					try {
						Object result = method.invoke(element, new Object[0]);
						if (result instanceof String) {
							elementName = (String) result;
						} else if (result instanceof Number) {
							elementName = "" + (Number) result;
						}
					} catch (IllegalArgumentException e) {		
					} catch (IllegalAccessException e) {
					} catch (InvocationTargetException e) {
					}
				}
			} catch (SecurityException e1) {
			} catch (NoSuchMethodException e1) {
			}
		}

		if (elementName == null) {
			elementName = "<NN>";
		}

		int id = 0;
		if (gui != null) {
			id = gui.getID(element);
		}

		if (id > 0) {
			return elementName + " : " + elementType.getName() + " [" + id + "]";
		} else {
			return elementName + " : " + elementType.getName();		
		}
	}

	public String getEventLabel(Event event) {
		return event.getType().getName();
	}

	private static final String LF = System.getProperty("line.separator").toString();

	public String getInteractionLabel(Interaction interaction) {
		String result = "Interaction elements:" + LF;

		Collection<Object> elements = interaction.getElements();
		HashMap<Event,Integer> events = new HashMap<Event,Integer>();
		List<Event> eventList = new ArrayList<Event>();
		int eventCount = 0;
		for (Object element: elements) {
			result += "    " + getElementLabel(element) + " |";
			IChoice choice = interaction.getElementsChoice(element);
			boolean first = true;
			for (Event event: getEvents(choice)) {
				int eventNo = 0;
				Event real = event.theEvent();
				if (!events.containsKey(real)) {
					eventCount++;
					events.put(real, eventCount);
					eventList.add(real);
					eventNo = eventCount;
				} else {
					eventNo = events.get(real);
				}
				if (!first) {
					result += ", ";
				} else {
					first = false;
					result += " ";
				}
				result += "(" + eventNo + ") " + getEventLabel(real);
			}
			result += LF;
		}

		result += "Interaction events:" + LF;

		for (Event event: eventList) {
			result += "    (" + events.get(event) + ") " + getEventLabel(event) + LF;
			IEventType type = event.getType();
			for (IFormalParameter param: type.getFormalParametersList()) {
				Object object = event.getParameter(param).getValue();
				if (object != null) {
					if (!param.isCollective()) {
						IElementType elementType1 = engine.getElementType(object);
						if (elementType1 != null) {
							result += "        " + param.getName() + " = " + getElementLabel(object) + LF;
						} else {
							result += "        " + param.getName() + " = " + object.toString() + LF;
						}
					} else {
						if (object instanceof Collection) {
							String value = "{ ";
							boolean first = true;
							for (Object o: ((Collection<?>) object)) {
								IElementType elementType1 = engine.getElementType(o);
								if (! first ) {
									value += "," + LF + "        " + "    ";
								}
								if (elementType1 != null) {
									value +=  getElementLabel(o);
								} else {
									value += o.toString();
								}
								first = false;
							}
							result += "        " + param.getName() + " = " + value + " }" + LF;
						} else {
							result += "        " + param.getName() + " = " + object.toString() + LF;
						}
						
					}
				}	
			}
		}

		return result;
	}

	public static Collection<Event> getEvents(IChoice choice) {
		Collection<Event> events = new ArrayList<Event>();
		if (choice instanceof ParallelChoice) {
			for (IChoice parallel: ((ParallelChoice) choice).getChoices()) {
				events.addAll(getEvents(parallel));
			}
		} else {
			for (IEventType eventType: choice.getEventTypes()) {
				Event event = choice.getEvent(eventType);
				events.add(event);
			}
		}

		return events;
	}

}
