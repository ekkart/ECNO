package dk.dtu.compute.se.ecno.ide.builders.popup.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.compute.se.ecno.ide.builders.util.Util;
import dk.dtu.imm.se.ecno.model.generator.util.ECNO_M2JGeneratorUtil;
import dk.dtu.imm.se.ecno.pn.ecnonets.Transition;

/**
 * 
 * @author Andreas
 *
 */
public class TreeViewConditionPN2Java implements IObjectActionDelegate {

	private Shell shell;
	private Transition selectedTrans;
	private IWorkbenchPage page;

	/**
	 * Constructor for Action1.
	 */
	public TreeViewConditionPN2Java() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		page = targetPart.getSite().getPage();
	}

	private PetriNet getNet(EObject eo) {
		EObject cont = eo.eContainer();
		if (cont == null) {
			return null;
		} else if (cont instanceof PetriNet) {
			return (PetriNet) cont;
		} else {
			return getNet(cont);
		}
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		String objectURI = ECNO_M2JGeneratorUtil.findObjectURI(selectedTrans
				.getCondition());
		PetriNet net = getNet(selectedTrans);
		String className = net.getName().getText();
		String projectURI = selectedTrans.eResource().getURI().toString();
		
		Util.findSource(objectURI, className, projectURI, shell, page);

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		selectedTrans = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof Transition) {
				selectedTrans = (Transition) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}

	private boolean isEnabled() {
		boolean enabled = false;
		if (selectedTrans != null) {
			enabled = selectedTrans.getCondition() != null;
		}
		return enabled;
	}
	
}
