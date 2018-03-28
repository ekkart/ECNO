package dk.dtu.imm.se.ecno.model.generator.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.service.resolver.ExportPackageDescription;
import org.eclipse.pde.core.IBaseModel;
import org.eclipse.pde.core.plugin.IExtensionsModelFactory;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IBundleProjectService;
import org.eclipse.pde.core.project.IPackageExportDescription;
import org.eclipse.pde.internal.core.project.BundleProjectService;
import org.eclipse.pde.internal.ui.util.ModelModification;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.model.generator.Context;
import dk.dtu.imm.se.ecno.model.generator.ECNOModelContext;
import dk.dtu.imm.se.ecno.model.generator.ECNO_Event2JGenerator;
import dk.dtu.imm.se.ecno.model.generator.ECNO_EventExtension2JGenerator;
import dk.dtu.imm.se.ecno.model.generator.ECNO_M2JGenerator;
import dk.dtu.imm.se.ecno.model.generator.ECNO_M2PackageAdapterFactoryGenerator;
import dk.dtu.imm.se.ecno.model.generator.ECNO_PN2JGenerator;

@SuppressWarnings("restriction")
public class ECNO_M2JGeneratorAction implements IObjectActionDelegate {
	
	private ECNOGenModel genModel;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			IJavaProject javaProject = null;

			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if ( window != null ) {
				IWorkbenchPage page = window.getActivePage();
				if ( page != null ) {
					IEditorPart editor = page.getActiveEditor();
					if ( editor != null ) {
						IEditorInput input = editor.getEditorInput();
						if ( input instanceof IFileEditorInput) {
							IFileEditorInput fileInput = (IFileEditorInput) input;
							IProject project = fileInput.getFile().getProject();
							javaProject = JavaCore.create(project);
						}
					}
				}					
			}

			if (javaProject == null  || !javaProject.exists()) {
				MessageDialog.openInformation(
						null,
						"ECNO: Code Generator",
						"For generating code, the genfile must be contained in " +
						"a java project."
				);
				return;
			}
			
			try {
				boolean behaviourGenerated = false;
				boolean modelGenerated = false;
				boolean eventsGenerated = false;
				boolean eventExtensionsGenerated = false;
				boolean packageAdapterFactoryGenerated = false; 
				
				Context context = new Context(genModel);
				ECNOModelContext mcontext = new ECNOModelContext(context);
				
				IPackageFragmentRoot[] roots = javaProject.getPackageFragmentRoots(); 
				if (roots!= null && roots.length > 0) {
					for (IPackageFragmentRoot root: roots) {
						if (!root.isReadOnly()) {

							// Generate Behaviour
							// TODO should be done more flexible
							if (!behaviourGenerated) {
								IPackageFragment packageFragment = 
										root.createPackageFragment(genModel.getBasePathECNOAutomata(), false, null);
								IResource resource = packageFragment.getResource();
								if (resource instanceof IFolder) {
									IFolder folder =  (IFolder) resource;
									EObject behaviour = genModel.getBehaviourModel();
									if (behaviour != null && behaviour instanceof PetriNetDoc) {
										PetriNetDoc doc = (PetriNetDoc) behaviour;
										ECNO_PN2JGenerator.generate(context, doc, folder);
										behaviourGenerated = true;
									}
								}
							}
							
							// Generate ECNO Model/Adapter class
							if (!modelGenerated) {
								IPackageFragment packageFragment = 
										root.createPackageFragment(genModel.getBasePathModelClass(), false, null);
								IResource resource = packageFragment.getResource();
								if (resource instanceof IFolder) {
									IFolder folder =  (IFolder) resource;
									ECNO_M2JGenerator.generate(mcontext, folder);
									modelGenerated = true;
									if (context.getPackageAdapterFactoryClassName() != null && !context.getPackageAdapterFactoryClassName().isEmpty()) {
										ECNO_M2PackageAdapterFactoryGenerator.generate(mcontext, folder);
									}
									packageAdapterFactoryGenerated = true;
								}
							}
							
							// TODO add Generator for EventValueClasses 
							if (!eventsGenerated) {
								if (context.hasEventTypeValueClasses()) {
									IPackageFragment packageFragment = 
											root.createPackageFragment(genModel.getBasePathECNOEvents(), false, null);
									IResource resource = packageFragment.getResource();
									if (resource instanceof IFolder) {
										IFolder folder =  (IFolder) resource;
										ECNO_Event2JGenerator.generate(context, folder);
										eventsGenerated = true;
									}
								} else {
									eventsGenerated = true;
								}
							}
							
							if (!eventExtensionsGenerated) {
								if (context.hasEventTypeExtensionValueClasses()) {
									IPackageFragment packageFragment = 
											root.createPackageFragment(genModel.getBasePathECNOEvents(), false, null);
									IResource resource = packageFragment.getResource();
									if (resource instanceof IFolder) {
										IFolder folder =  (IFolder) resource;
										ECNO_EventExtension2JGenerator.generate(context, folder);
										eventExtensionsGenerated = true;
									}
								} else {
									eventExtensionsGenerated = true;
								}
							}
						
							// TODO this condition could be done a bit more clever
							if (behaviourGenerated && modelGenerated && eventsGenerated && eventExtensionsGenerated && packageAdapterFactoryGenerated) {
								// in case everything was created successfully, add the necessary dependencies to
								// the required ECNO plug-ins ...
								IProject project = javaProject.getProject();
								if (project != null) {
									this.addProjectImports(project);
									this.addProjectExports(project, context);
								}
								
								// ... and, if a package adapter factory was generated add it as extension to this plug-in.
								if (context.getPackageAdapterFactoryClassName() != null && 
										!context.getPackageAdapterFactoryClassName().isEmpty()) {
									addPackageAdapterExtension(project, context);
								}
								return;
							}
						}
					}
				}
			} catch (JavaModelException e) {
			}

			MessageDialog.openInformation(
					null,
					"ECNO: Code Generator",
					"Code generation was not successfull"
			);
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		genModel = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof ECNOGenModel) {
				genModel = (ECNOGenModel) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return genModel != null;
	}
	
	private void addProjectImports(IProject project) {
		IPluginModelBase plugin = PluginRegistry.findModel(project);
		
		final List<String> addPlugIns = new ArrayList<String>();
		addPlugIns.add("dk.dtu.imm.se.ecno.model");
		addPlugIns.add("dk.dtu.imm.se.ecno.model.generator");
		for (IPluginImport pluginImport : plugin.getPluginBase().getImports()) {
			// remove the plug-ins that are imported already from the list
			addPlugIns.remove(pluginImport.getId());
		}
		if (!addPlugIns.isEmpty()) {
			ModelModification modification = new ModelModification(project) {

				@Override
				protected void modifyModel(
						IBaseModel model,
						IProgressMonitor monitor)
								throws CoreException {
					IPluginModelBase plugin = (IPluginModelBase) model;
					for (String pluginId : addPlugIns) {
						IPluginImport pluginImport = plugin.getPluginFactory().createImport();
						pluginImport.setId(pluginId);
						plugin.getPluginBase().add(pluginImport);
					}

				}

			};
			PDEModelUtility.modifyModel(modification, null);
		}
	}
	
	// TODO all these changes should probably done in a single go (and in a similar
	//      way as the addProjectExport() method does it now.
	private void addProjectExports(final IProject project, Context context) {
		IPluginModelBase plugin = PluginRegistry.findModel(project);
		
		final List<String> addExportPackages = new ArrayList<String>();
		addExportPackages.add(context.getEcnogenmodel().getBasePathModelClass());
		if (context.hasEventTypeValueClasses() || context.hasEventTypeExtensionValueClasses()) {
			addExportPackages.add(context.getEcnogenmodel().getBasePathECNOEvents());
		}
		// note that the path for the behaviours is not exported; under normal
		// circumstances, these would never be needed outside this project
		for (ExportPackageDescription pluginImport : plugin.getBundleDescription().getExportPackages()) {
			// remove the packages that are exported already from the list
			String name = pluginImport.getName();
			addExportPackages.remove(name);
		}
		
		if (!addExportPackages.isEmpty()) {
			try {
				IBundleProjectService service = BundleProjectService.getDefault();
				IBundleProjectDescription description = service.getDescription(project);
				List<IPackageExportDescription> exports = new ArrayList<IPackageExportDescription>();
				for (IPackageExportDescription descriptor: description.getPackageExports()) {
					exports.add(descriptor);
				}
				for (String packageName : addExportPackages) {
					IPackageExportDescription export = service.newPackageExport(packageName, null, true, null);
					exports.add(export);
				}
				description.setPackageExports(exports.toArray(description.getPackageExports()));
				description.apply(null);
			} catch (CoreException e) {
				// TODO add some proper error dialog here
				e.printStackTrace();
			}
		}
	}
	
	private void addPackageAdapterExtension(IProject project, final Context context) {
		IPluginModelBase plugin = PluginRegistry.findModel(project);
		
		if (plugin != null) {
			boolean found = false;
			for (IPluginExtension extension : plugin.getPluginBase().getExtensions()) {
				if (extension.getPoint().equals("dk.dtu.imm.se.ecno.eclipse.package_adapter_factory")) {
					for (IPluginObject pluginObject : extension.getChildren()) {
						if (pluginObject instanceof IPluginElement) {
							IPluginElement element = (IPluginElement) pluginObject;
							String type = element.getName();
							IPluginAttribute attributeClass = element.getAttribute("class");
							IPluginAttribute attributeURI = element.getAttribute("uri");
							if ("adapter_factory".equals(type) ) {
								if ( attributeClass != null && context.getQualifiedPackageAdapterFactoryClassName().equals(attributeClass.getValue()) && 
										attributeURI != null && context.getEcnopackage().getUri().equals(attributeURI.getValue())) {
									found = true;
									// in this case, the required extension exists already, so we do not need to install another one
								} else if (attributeURI != null	&& context.getEcnopackage().getUri().equals(attributeURI.getValue())) {
									MessageDialog.openInformation(
											null,
											"ECNO: Code Generator",
											"A different package adapter for the ECNO package is installed already for the URI\r\r" +
											"    " + attributeURI.getValue() + "\r\r" +
											"If you want to create one with a new name, delete the old extension from the plugin.xml;" +
											"then, start the ECNO code generation again."
									);
									found = true;
									// in this case, we do not generate another extension automatically
								}
							}
						}
					}
				}
			}
			
			if (!found) {
				ModelModification modification = new ModelModification(project) {

					@Override
					protected void modifyModel(
							IBaseModel model,
							IProgressMonitor monitor)
									throws CoreException {
						IPluginModelBase plugin = (IPluginModelBase) model;
						IExtensionsModelFactory factory = plugin.getFactory();
						IPluginExtension extension = factory.createExtension();
						extension.setPoint("dk.dtu.imm.se.ecno.eclipse.package_adapter_factory");

						IPluginElement element = factory.createElement(extension);
						element.setName("adapter_factory");

						element.setAttribute("class", context.getQualifiedPackageAdapterFactoryClassName());
						element.setAttribute("uri", context.getEcnopackage().getURI());

						extension.add(element);
						plugin.getExtensions().add(extension);
					}

				};
				PDEModelUtility.modifyModel(modification, null);
			}
		} else {
			MessageDialog.openInformation(
					null,
					"ECNO: Code Generator",
					"In order to generate the package adapter extension, " +
					"you must convert this project into a plugin project: " +
					"Configure -> Convert to Plug-in Projects..."
			);
		}
	}

}
