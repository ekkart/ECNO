package dk.dtu.compute.se.ecno.statespace.generator.simulator;

import java.util.List;

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
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import dk.dtu.imm.se.ecno.eclipse.adapterfactory.IPackageAdapterFactory;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IInteractionCommandWrapperFactory;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;
import dk.dtu.imm.se.ecno.runtime.IInteractionExecutionCommand;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

/**
 * Action that starts an ECNO application from a behaviour states file, but not using the
 * behaviour of the elements and not running not under the control of the ECNO engine registry.
 * This makes the execution  more efficient. Only the configuration of the behaviour states
 * file is used.
 * 
 * TODO: Eventually, this should be moved to the ECNO eclipse module. But for now, this
 *       is experimental (so we leave it in the statespace generator for now, for which
 *       it actually has been created).
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class StartEngineFromBehavioursResource implements IObjectActionDelegate {
	
	private IFile selected;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			// In order to avoid problems with the Swing GUI start up on OS X,
			// the start up of the engine is delegated to another thread (which
			// is not a Display thread)
			Thread thread = new Thread() {

				@Override
				public void run() {
					if (createExecutionEngine(selected) == null) {
						Display.getDefault().asyncExec(new Runnable() {
							
							@Override
							public void run() {
								MessageDialog.openInformation(
										null,
										"ECNO: Resource could not be loaded",
										"The ECNO behaviours could not be loaded. ECNO engine was not started.");
							}
							
						});
					}
				}
				
			};
			thread.start();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof IFile) {
				selected = (IFile) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selected != null && "behaviourstates".equals(selected.getFileExtension());
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
	
	public synchronized ExecutionEngine createExecutionEngine(BehaviourStates states) {
		if (states != null) {
			
			ExecutionEngine engine = ExecutionEngine.createNewInstance();
			
			try {
				initializePackageAdapters(engine, states);
				if (!engine.resolveNamespaceImports()) {
					System.err.println("Package imports could not be resolved!");
					engine.exit();
					return null;
				}
				
				initializeControllers(engine, states);
				engine.addInteractionCommandWrapperFactory(new IInteractionCommandWrapperFactory() {

					@Override
					public IInteractionExecutionCommand wrapInteractionCommand(
							final IInteractionExecutionCommand command) {
						// TODO Auto-generated method stub
						return new IInteractionExecutionCommand() {

							@Override
							public Interaction getInteraction() {
								// TODO Auto-generated method stub
								return null;
							}

							@Override
							public void doExecute()
									throws InvalidStateException {
								command.doExecute();
								
							}
							
						};
					}
					
				});
				
				return engine;
			} catch (Exception e) {
				e.printStackTrace();
				engine.exit();
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

}
