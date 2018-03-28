package dk.dtu.compute.se.ecno.statespace.controller.configurator;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState;
import dk.dtu.compute.se.ecno.statespace.StatespaceFactory;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;

/**
 * This is a controller configurator, which installs the graphical
 * editor as a graphical GUI for the ECNO simulation of Petri nets along
 * with the standard ECNO GUI for interacting with the simulation.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class StatespaceRecorderConfiguration implements IControllerConfigurator, IController {

	private ExecutionEngine engine;
	private Resource resource;
	
	private EObject container;
	
	// TODO the following methods were a experiment for the systematic state space generator (which now
	// is implemented in (and improved) in a separate project. The follwoing methods can be deleted now.
	/*
	@SuppressWarnings("unchecked")
	private boolean cleanObject(Element element) {
		EStructuralFeature containerFeature = container.eClass().getEStructuralFeature("objects");
		if (!(containerFeature instanceof EReference) || 
				containerFeature.getUpperBound() == 1 ||
				!((EReference) containerFeature).isContainment()) {
			return false;
		}
		Object containment = container.eGet(containerFeature);
		if (!(containment instanceof Collection)) {
			return false;
		}
		Collection<Element> elementList = null;
		try {
			elementList = (Collection<Element>) containment;
		} catch (ClassCastException e) {
			return false;
		}
			
		for (EStructuralFeature feature: element.eClass().getEAllStructuralFeatures()) {
			if (feature != StatespacePackage.eINSTANCE.getElement_Uid()) {
				if (feature.getUpperBound() == 1) {
					// element.eSet(feature, null);
					element.eUnset(feature);
				} else {
					Object value = element.eGet(feature);
					if (value instanceof Collection) {
						((Collection<?>) value).clear();
					} else {
						return false;
					}
				}
			}
		}
		elementList.add(element);
		return true;
	}
	*/
	
	/*
	@SuppressWarnings("unchecked")
	private boolean createObjectState(State state, Element element, Map<StateObject,Element> stateObject2Element) {
		StateObject stateObject = state.getState(element.getUid());
		if (stateObject != null) {
			for (ObjectFeatureValues ofv: stateObject.getFeatures()) {
				EStructuralFeature feature = ofv.getFeature();
				EList<Value> values = ofv.getValues();
				if (feature == null || values == null || values.size() != 1) {
					return false;
				}
				Value value = values.get(0);
				if (feature instanceof EReference) {
					EReference reference = (EReference) feature;
					if (reference.isContainment() || reference.getEOpposite() == null ||
							(reference.getUpperBound() != 1 && reference.getEOpposite().getUpperBound() == 1) ||
							(reference.hashCode() < reference.getEOpposite().hashCode())) {
						// in case of opposite assignments, we need to be a bit careful; the
						// opposite does not need to be assigned (they need, however, be brought in
						// the right order (which we do in a separate last step)
						if (feature.getUpperBound() == 1) {
							if (value.getStateValues().size() == 1) {
								Element targetElement = stateObject2Element.get(value.getStateValues().get(0));
								if (targetElement != null) {
									try {
										element.eSet(feature, targetElement);
									} catch (Throwable e) {
										return false;
									}
								} else {
									return false;
								}
							}
						} else {
							Object targetObject = element.eGet(feature);
							if (!(targetObject instanceof Collection)) {
								return false;
							}
							Collection<Element> targetCollection = null;
							try {
								targetCollection = (Collection<Element>) targetObject;
							} catch (ClassCastException r) {
								return false;
							}
							for (StateObject targetStateObject: value.getStateValues()) {
								Element targetElement = stateObject2Element.get(targetStateObject);
								if (targetElement != null) {
									try {
										targetCollection.add(targetElement);
									} catch (Throwable e) {
										return false;
									}
								} else {
									return false;
								}
								
							}
						}
					}
				} else {
					if (feature.getUpperBound() == 1) {
						if (value.getIntValues().size() == 1) {
							try {
							element.eSet(feature, value.getIntValues().get(0));
							} catch (Throwable e) {
								return false;
							}
						} else if (value.getStringValues().size() == 1) {
							try {
							element.eSet(feature, value.getStringValues().get(0));
							} catch (Throwable e) {
								return false;
							}
						}
					} else {
						Object targetObject = element.eGet(feature);
						if (targetObject instanceof Collection) {
							if (value.getIntValues().size() >= 1) {
								try {
									Collection<Integer> targetCollection = (Collection<Integer>) targetObject;
									targetCollection.addAll(value.getIntValues());
								} catch (Throwable e) {
									return false;
								}
							} else if (value.getStringValues().size() == 1) {
								try {
									Collection<String> targetCollection = (Collection<String>) targetObject;
									targetCollection.addAll(value.getStringValues());
								} catch (Throwable e) {
									return false;
								}
							}
						} else {
							return false;
						}
					}
				}
			}
		}
		
		return true;
	}
	*/
	
	/*
	@SuppressWarnings("unchecked")
	private boolean alignOppositeReferences(State state, Element element, Map<StateObject,Element> stateObject2Element) {
		StateObject stateObject = state.getState(element.getUid());
		if (stateObject != null) {
			for (ObjectFeatureValues ofv: stateObject.getFeatures()) {
				EStructuralFeature feature = ofv.getFeature();
				EList<Value> values = ofv.getValues();
				if (feature == null || values == null || values.size() != 1) {
					return false;
				}
				Value value = values.get(0);
				if (feature instanceof EReference) {
					EReference reference = (EReference) feature;
					if (!reference.isContainment() && reference.getEOpposite() != null &&
							(reference.getUpperBound() != 1 && reference.getEOpposite().getUpperBound() != 1) &&
							(reference.hashCode() >= reference.getEOpposite().hashCode())) {
						// align the non dominating opposite
						Object targetObject = element.eGet(feature);
						if (!(targetObject instanceof Collection)) {
							return false;
						}
						EList<Element> targetCollection = null;
						try {
							targetCollection = (EList<Element>) targetObject;
						} catch (ClassCastException r) {
							return false;
						}
						int i = 0;
						for (StateObject targetStateObject: value.getStateValues()) {
							Element targetElement = stateObject2Element.get(targetStateObject);
							boolean found = true;
							for (int j=i; j < targetCollection.size(); j++) {
								if (targetCollection.get(j) == targetElement) {
									found = true;
									if (i != j) {
										targetCollection.move(i, j);
									}
									break;
								}

							}
							if (!found) {
								return false;
							}
							i++;
						}
					}
				}
			}
		}
		
		return true;
	}
	*/

	/*
	private boolean setBehaviourState(StateObject stateObject, Element element) {
		IElementBehaviour behaviour = engine.getElementBehaviour(element);
		if (behaviour == null && stateObject.getBehaviourStates().isEmpty()) {
			return true;
		}
		if (behaviour instanceof InheritingBehaviour) {
			InheritingBehaviour inheritingBehaviour = (InheritingBehaviour) behaviour;
			List<PTNetState> stateObjectBehaviours = stateObject.getBehaviourStates();
			if (stateObjectBehaviours.size() != inheritingBehaviour.getBehaviours().size()) {
				return false;
			}
			int i = 0;
			for (IElementBehaviour b: inheritingBehaviour.getBehaviours()) {
				if (b instanceof AbstractPetrinetBehaviour) {
					AbstractPetrinetBehaviour<?> pnBehaviour = (AbstractPetrinetBehaviour<?>) b;
					BehaviourState state = pnBehaviour.getBehaviourState();
					if (state instanceof PTNetState) {
						PTNetState ptNetState = (PTNetState) state;
						PTNetState ptNetStateCopy = stateObjectBehaviours.get(i);
						if (ptNetState.getMarking().size() != ptNetStateCopy.getMarking().size()) {
							return false;
						}
						ptNetState.getMarking().clear();
						for (int j =0; j < ptNetStateCopy.getMarking().size(); j++) {
							ptNetState.getMarking().add(ptNetStateCopy.getMarking().get(j));
						}
						i++;
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	*/
	
	/*
	private boolean establishState(State state) {
		List<Element> elements = new ArrayList<Element>();
		Map<StateObject,Element> stateObject2Element = new HashMap<StateObject,Element>();
		Iterator<EObject> iterator = container.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (!(object instanceof Element)) {
				return false;
			}
			Element element = (Element) object;
			elements.add(element);
			StateObject stateObject = state.getState(element.getUid());
			if (stateObject == null) {
				return false;
			}
			stateObject2Element.put(stateObject, element);
		}
		
		// clean all objects and add them to the container
		for (Element element: elements) {
			if (!cleanObject(element)) {
				return false;
			}
		}
		
		// now recreate the state of all elements from the states objects.
		for (Element element: elements) {
			if (!createObjectState(state, element, stateObject2Element)) {
				return false;
			}
		}
		
		// now recreate the state of all elements from the states objects.
		for (Element element: elements) {
			StateObject stateObject = state.getState(element.getUid());
			if (stateObject == null) {
				return false;
			}
			if (!alignOppositeReferences(state, element, stateObject2Element)) {
				return false;
			}
			if (!setBehaviourState(stateObject, element)) {
				return false;
			}
		}		
		return true;
	}
	*/
	
	/*
	private void resetStateCommand(final State state) {
		EditingDomain dom = AdapterFactoryEditingDomain.getEditingDomainFor(container);
		if (dom instanceof TransactionalEditingDomain) {
			TransactionalEditingDomain domain = (TransactionalEditingDomain) dom;
			engine.lockExclusive();
			RecordingCommand command = new RecordingCommand(domain,"reset to state") {

				@Override
				protected void doExecute() {
					// TODO Auto-generated method stub
					if (!StatespaceRecorderConfiguration.this.establishState(state)) {
						throw new RuntimeException();
					}
				}
			};
			domain.getCommandStack().execute(command);
			State newState = StatespaceFactory.eINSTANCE.createState();
			newState.init(container,engine);
			if (!newState.equals(state)) {
				System.out.println("States are not equal!");
			}
			engine.unlock();
		}
	}
	*/
	
	@Override
	public void initializeControllers(ExecutionEngine engine,
			ControllerState state) {

		this.engine = engine;
		
		if (state instanceof StateSpaceControllerState) {
			StateSpaceControllerState config = (StateSpaceControllerState) state;
			container = config.getObject();
			
			String resourcename = config.getConfig();
			
			URI uri = state.eResource().getURI();
			String uriString =  uri.toPlatformString(false);
			int index=uriString.lastIndexOf("/");
			uriString = uriString.substring(0, index+1) + resourcename;
			uri = URI.createPlatformResourceURI(uriString,false);
			
			ResourceSet resourceSet = new ResourceSetImpl();
			try {
				resource = resourceSet.getResource(uri, true);
			} catch (Exception e) {
				resource = resourceSet.createResource(uri);
			}
			EList<EObject> contents = resource.getContents();
			StateSpace statespace = null;
			if (!contents.isEmpty()) {
				EObject object = contents.get(0);
				if (object instanceof StateSpace) {
				    statespace = (StateSpace) object;
				}
			} else {
				statespace = StatespaceFactory.eINSTANCE.createStateSpace();
				statespace.setName("Automatically created");
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Calendar cal = Calendar.getInstance();
				statespace.setDescription(dateFormat.format(cal.getTime()));
				contents.add(statespace);
			}
			
			engine.addInteractionCommandWrapperFactory(new StatespaceRecorderInteractionWrapperFactory(engine,statespace,container));

		}

		engine.addController(this);
	}

	
	
	@Override
	public void addElement(Object element) {		
	}

	@Override
	public void removeElement(Object element) {
		
	}

	@Override
	public void elementEncountered(Object element) {
	}

	@Override
	synchronized public void dispose() {
		try {
			resource.save(new HashMap<String,Object>());
		} catch (IOException e) {
			// Do nothing for now if file could not be saved.
		}
		
		if (engine != null) {
			engine.removeController(this);
			engine = null;
		}
	}

}
