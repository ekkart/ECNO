package dk.dtu.imm.se.ecno.model.generator.actions;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel;
import dk.dtu.imm.se.ecno.model.generator.ECNO_I2JGenerator;
import dk.dtu.imm.se.ecno.model.generator.InstanceContext;


public class ECNO_I2JGeneratorAction implements IObjectActionDelegate {
	
	private ECNOInstanceGenModel instGenModel;

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
				InstanceContext context = new InstanceContext(instGenModel);
				
				IPackageFragmentRoot[] roots = javaProject.getPackageFragmentRoots(); 
				if (roots!= null && roots.length > 0) {
					for (IPackageFragmentRoot root: roots) {
						if (!root.isReadOnly()) {
							IPackageFragment packageFragment = 
									root.createPackageFragment(instGenModel.getBasePathECNOInstance(), false, null);
							IResource resource = packageFragment.getResource();
							if (resource instanceof IFolder) {
								IFolder folder =  (IFolder) resource;
								ECNO_I2JGenerator.generate(context, folder);
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
		instGenModel = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof ECNOInstanceGenModel) {
				instGenModel = (ECNOInstanceGenModel) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return instGenModel != null;
	}

}
