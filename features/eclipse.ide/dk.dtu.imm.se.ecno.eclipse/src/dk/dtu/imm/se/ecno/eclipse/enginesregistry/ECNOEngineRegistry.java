package dk.dtu.imm.se.ecno.eclipse.enginesregistry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import dk.dtu.imm.se.ecno.eclipse.adapterfactory.IPackageAdapterFactory;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;

public class ECNOEngineRegistry {
	
	private static ECNOEngineRegistry instance;
	
	private final List<EngineWrapper> engineWrappers;
	private final List<IEngineRegistryListener> listeners;
	
	private final Map<BehaviourStates,EngineWrapper> behaviourStates2wrapper;
	private final Map<EngineWrapper,BehaviourStates> wrapper2behaviourStates;
	
	private int counter = 0;
	
	private ECNOEngineRegistry() {
		engineWrappers = new ArrayList<EngineWrapper>();
		listeners = new ArrayList<IEngineRegistryListener>();
		behaviourStates2wrapper = new HashMap<BehaviourStates,EngineWrapper>();
		wrapper2behaviourStates = new HashMap<EngineWrapper,BehaviourStates>();
	}
	
	public synchronized ExecutionEngine createExecutionEngine() {
		ExecutionEngine engine = ExecutionEngine.createNewInstance();
		EngineWrapper wrapper = new EngineWrapper(engine);
		wrapper.setName("Engine " + counter++);
		add(wrapper);
		return engine;
	}
	
	public synchronized ExecutionEngine createExecutionEngine(IFile file) {
		if (file != null && "behaviourstates".equals(file.getFileExtension())) {
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(),true);
			try {
				Resource resource = resourceSet.getResource(uri, true);
				if (resource != null) {
					List<EObject> contents = resource.getContents();
					if (contents != null & contents.size() == 1) {
						EObject object = contents.get(0);
						if (object instanceof BehaviourStates) {
							return createExecutionEngine((BehaviourStates) object);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;	
	}
	
	
	private void initializeControllers(ExecutionEngine engine, BehaviourStates states) {
		
		ControllerConfigurator config = states.getControllerConfig();
		if (config != null && config.getUri() != null) {
			String uri = config.getUri();
			IExtensionRegistry reg = Platform.getExtensionRegistry();
			IExtensionPoint extPoint = reg.
					getExtensionPoint("dk.dtu.imm.se.ecno.eclipse.engine_controller_configurator");

			IExtension[] extensions = extPoint.getExtensions();

			for (int i = 0; i < extensions.length; i++) {
				IExtension extension = extensions[i];
				IConfigurationElement confs[] = extension.getConfigurationElements();
				IConfigurationElement elem = confs[0];
				if (uri.equals(confs[0].getAttribute("uri"))) {
					try {
						IControllerConfigurator configurator = (IControllerConfigurator) elem.createExecutableExtension("class");
						configurator.initializeControllers(engine, config.getState());
						return;
					} catch (Exception e) {
						throw new RuntimeException("Controllers could not be initiazed: Controller configurator " + uri);
					}
				}
			}
		}

	    // if there is no controller configurator, use the default GUI
	    ECNOGUI.createECNOGUI(engine);
	}
	
	private void initializePackageAdapters(ExecutionEngine engine, BehaviourStates states) {
		// XXX the code below is a quick and dirty hack to add the plugged in ECNO
		//     package adapters to the ECNO engine; this should eventually be implemented 
		//     in a nicer and more efficient way (e.g. with a Registry for these factories)
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint extPoint = reg.
			getExtensionPoint("dk.dtu.imm.se.ecno.eclipse.package_adapter_factory");

		IExtension[] extensions = extPoint.getExtensions();
		List<String> packages = states.getPackages();
		
		for (int i = 0; i < extensions.length; i++) {
			IExtension extension = extensions[i];
			IConfigurationElement confs[] = extension.getConfigurationElements();
			IConfigurationElement elem = confs[0];
			String uri = confs[0].getAttribute("uri");
			if ( packages.size() == 0 || (uri != null && packages.contains(uri))) {
				try {
					IPackageAdapterFactory factory = (IPackageAdapterFactory) elem.createExecutableExtension("class");
					engine.addPackageAdapter(factory.getModel(engine));
				} catch (Exception e) { }
			}
		}
	}
	
	public synchronized ExecutionEngine createExecutionEngine(BehaviourStates states) {
		if (states != null) {
			
			// If there is an engine running on that behaviour statse element already,
			// no new engine is created; the running enigne is returned instead.
			EngineWrapper wrapper = behaviourStates2wrapper.get(states);
			if (wrapper != null) {
				return wrapper.engine;
			}
			
			ExecutionEngine engine = ExecutionEngine.createNewInstance();

			try {
				initializePackageAdapters(engine, states);
				if (!engine.resolveNamespaceImports()) {
					System.err.println("Package imports could not be resolved!");
					engine.exit();
					return null;
				}

				initializeControllers(engine, states);

				wrapper = new EngineWrapper(engine,states);
				wrapper.setName("Engine " + ++counter);
				behaviourStates2wrapper.put(states,wrapper);
				wrapper2behaviourStates.put(wrapper,states);
				add(wrapper);
				return engine;
			} catch (Exception e) {
				e.printStackTrace();
				engine.exit();
			}
		}
		return null;
	}
	
	public List<EngineWrapper> getEngineWrappers() {
		return Collections.unmodifiableList(engineWrappers);
	}
	
	private void add(EngineWrapper wrapper) {
		if (!engineWrappers.contains(wrapper)) {
			engineWrappers.add(wrapper);
			for (IEngineRegistryListener listener: listeners) {
				listener.add(wrapper);
			}
		}
	}

	public synchronized void remove(EngineWrapper wrapper) {
		if (engineWrappers.contains(wrapper)) {
			engineWrappers.remove(wrapper);
			for (IEngineRegistryListener listener: listeners) {
				listener.remove(wrapper);
			}
			BehaviourStates states = wrapper2behaviourStates.get(wrapper);
			wrapper2behaviourStates.remove(wrapper);
			if (states != null) {
				behaviourStates2wrapper.remove(states);
			}
			wrapper.exit();
		}
	}
	
	public synchronized void addListener(IEngineRegistryListener listener) {
		 listeners.add(listener);
	}
	
	public synchronized void removeListener(IEngineRegistryListener listener) {
		 listeners.remove(listener);
	}
	
	static synchronized public ECNOEngineRegistry getInstance() {
		if (instance == null) {
			instance = new ECNOEngineRegistry();
			
			// The following code makes sure that the AdapterFactory for
			// package http://ecno.se.imm.dtu.dk/ecno/save/bahaviourstates is installed
			// by touching on its code
			IExtensionRegistry reg = Platform.getExtensionRegistry();
			IExtensionPoint extPoint = reg.
				getExtensionPoint("org.eclipse.emf.edit.itemProviderAdapterFactories");

			IExtension[] extensions = extPoint.getExtensions();
			
			for (int i = 0; i < extensions.length; i++) {
				IExtension extension = extensions[i];
				IConfigurationElement confs[] = extension.getConfigurationElements();
				IConfigurationElement elem = confs[0];
				if ("http://ecno.se.imm.dtu.dk/ecno/save/bahaviourstates".equals(elem.getAttribute("uri"))) {
					try {
						elem.createExecutableExtension("class");
					} catch (Exception e) {
					}
				}
			}
		}
		return instance;
	}
	
}
