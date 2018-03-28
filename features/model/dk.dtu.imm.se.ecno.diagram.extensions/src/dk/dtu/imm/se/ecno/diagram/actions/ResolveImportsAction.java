package dk.dtu.imm.se.ecno.diagram.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.PackageEditPart;


public class ResolveImportsAction implements IObjectActionDelegate {
	
	private Package ecnoPackage;
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(ecnoPackage);	
			domain.getCommandStack().execute(new ResolveImportsCommand(domain, ecnoPackage));
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		ecnoPackage = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof PackageEditPart) {
				PackageEditPart editPart = (PackageEditPart) structuredSelection.getFirstElement();
				View view = editPart.getNotationView();
				if (view != null) {
					EObject object = view.getElement();
					if (object instanceof Package) {
						ecnoPackage = (Package) object;
					}
				}
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return ecnoPackage != null;
	}
	

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}


}
