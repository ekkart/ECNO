package dk.dtu.imm.se.ecno.eclipse.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import dk.dtu.imm.se.ecno.eclipse.enginesregistry.ECNOEngineRegistry;

public class StartEngineFromBehavioursResource implements IObjectActionDelegate {
	
	private IFile selected;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			final ECNOEngineRegistry registry = ECNOEngineRegistry.getInstance();

			// In order to avoid problems with the Swing GUI start up on OS X,
			// the start up of the engine is delegated to another thread (which
			// is not a Display thread)
			Thread thread = new Thread() {

				@Override
				public void run() {
					if (registry.createExecutionEngine(selected) == null) {
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

}
