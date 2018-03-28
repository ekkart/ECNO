package dk.dtu.compute.se.ecno.statespace.generator.cofigurator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState;
import dk.dtu.compute.se.ecno.statespace.generator.GeneratorState;
import dk.dtu.compute.se.ecno.statespace.generator.simulator.StateSpaceGenerationJob;
import dk.dtu.compute.se.ecno.statespace.generator.simulator.StateSpaceGenerator;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.model.ecno.EventType;

/**
 * This is a controller configurator, which starts systematic generation of the state
 * space for the given setting.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class StateSpaceGeneratorConfigurator implements IControllerConfigurator, IController {

	private ExecutionEngine engine;
	
	private EObject container;
	
	private StateSpaceGenerator generator;
	private StateSpaceGenerationJob job;
	
	@Override
	public void initializeControllers(ExecutionEngine engine,
			ControllerState state) {

		this.engine = engine;
		
		if (state instanceof GeneratorControllerState) {
			GeneratorControllerState configState = (GeneratorControllerState) state;
			container = configState.getObject();
			
			String resourcename = configState.getFilename();
			
			URI uri = state.eResource().getURI();
			String uriString =  uri.toPlatformString(false);
			int index=uriString.lastIndexOf("/");
			uriString = uriString.substring(0, index+1) + resourcename;
			uri = URI.createPlatformResourceURI(uriString,false);
			
			Resource resource = null;
			ResourceSet resourceSet = new ResourceSetImpl();
			try {
				resource = resourceSet.getResource(uri, true);
			} catch (Exception e)  {
				throw new RuntimeException("Generation resource " + configState.getFilename() + " not found.");
			}
			EList<EObject> contents = resource.getContents();
			GeneratorState generatorState = null;
			if (!contents.isEmpty()) {
				EObject object = contents.get(0);
				if (object instanceof GeneratorState) {
					generatorState = (GeneratorState) object;
				}
			}
			if (generatorState == null) {
				throw new RuntimeException("Generator state not found.");
			}
			
			StateSpace statespace = generatorState.getStatespace();
			if (statespace == null || statespace.eIsProxy()) {
				throw new RuntimeException("No state space found.");
			}
			
			List<Element> elements = new ArrayList<Element>();
			Iterator<EObject> iterator = container.eAllContents();
			while (iterator.hasNext()) {
				EObject object = iterator.next();
				if (object instanceof Element) {
					Element element = (Element) object;
					if (configState.getElements().contains(element.getUid())) {
						elements.add(element);
					}
				}
			}
			
			EObject object = configState.eContainer();
			if (object instanceof ControllerConfigurator) {
				ControllerConfigurator config = (ControllerConfigurator) object;
				object = config.eContainer();
				if (object instanceof BehaviourStates) {
					BehaviourStates behaviourStates = (BehaviourStates) object;
					EList<String> packageURIs = behaviourStates.getPackages();
					dk.dtu.imm.se.ecno.model.ecno.Package ecnoPackage = null;
					INamespace namespace = engine.getNamespace(packageURIs.get(0));
					if (namespace instanceof dk.dtu.imm.se.ecno.model.ecno.Package) {
						ecnoPackage = (dk.dtu.imm.se.ecno.model.ecno.Package) namespace;
						List<IEventType> eventTypes = new ArrayList<IEventType>();
						for (EventType eventType: ecnoPackage.getEventTypes()) {
							if (configState.getEvents().contains(eventType.getName())) {
								eventTypes.add(eventType);
							}
						}
						
						// new ECNOGUI(engine);
						String containmentFeatureName = configState.getContainmentFeature();
						if (containmentFeatureName == null || containmentFeatureName.equals("")) {
							containmentFeatureName = "objects";
						}
						EStructuralFeature containmentFeature = container.eClass().getEStructuralFeature(configState.getContainmentFeature());
						if (!(containmentFeature instanceof EReference) || 
								containmentFeature.getUpperBound() == 1 ||
								!((EReference) containmentFeature).isContainment()) {
							throw new RuntimeException("Invalid containment feature.");
						}
						
						generator = new StateSpaceGenerator(engine, container, (EReference) containmentFeature,
								generatorState, elements, eventTypes);
						engine.addController(this);
						job = new StateSpaceGenerationJob(generator, engine);
						job.schedule();
						return;
					}
				}
			}
		}
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
		if (job != null) {
			job.cancel();
			job = null;
		}

		if (engine != null) {
			engine.removeController(this);
			engine = null;
		}
	}

}
