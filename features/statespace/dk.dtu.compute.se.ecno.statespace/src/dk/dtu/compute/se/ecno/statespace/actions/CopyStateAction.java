package dk.dtu.compute.se.ecno.statespace.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import dk.dtu.compute.se.ecno.statespace.StateSpace;

public class CopyStateAction implements IObjectActionDelegate {
	
	private StateSpace selected;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			/*
			EObject object = selected.getContainer();
			State state = StatespaceFactory.eINSTANCE.createState();
			state.init(object);
			if (selected.add(state) != state) {
				MessageDialog.openInformation(
						null,
						"ECNO: State space",
						"State existst already"
				);
			}
			*/
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof StateSpace) {
				selected = (StateSpace) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selected != null;
	}

}
