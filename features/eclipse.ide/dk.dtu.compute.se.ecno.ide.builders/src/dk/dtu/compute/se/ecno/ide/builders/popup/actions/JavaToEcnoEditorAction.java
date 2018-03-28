package dk.dtu.compute.se.ecno.ide.builders.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.texteditor.ITextEditor;

import dk.dtu.compute.se.ecno.ide.builders.util.Util;
import dk.dtu.imm.se.ecno.model.generator.util.ECNO_M2JGeneratorUtil;

/**
 * @author Tobias
 */
public class JavaToEcnoEditorAction implements IObjectActionDelegate {

	private IWorkbenchPage page;
	private IFile currentFile;

	@Override
	public void run(IAction action) {
		if (currentFile == null) {
			throw new IllegalStateException("The java to Ecno action is invoked, when no file is selected!!");
		}
		
		ITextSelection selection = getTextSelection();
		int offset = selection.getOffset();
		URI uri = Util.getEcnoUri(currentFile, offset);
		
		if (uri == null ){
			MessageDialog.openInformation(null, "Please select code in ECNO block",
					"Please select java code contained in a " + ECNO_M2JGeneratorUtil.SEE_PNML_START + " block");
			// throw new IllegalStateException("The current selection does is not linked with a pnml-source");
		}
		Util.openECNOEditor(uri, page);
	}

	/**
	 * Finds the currently selected text in the editor, if it can be extracted from active editor one the page.
	 * @return The text selection if such exists. Null if it can't be extracted.
	 */
	public ITextSelection getTextSelection() {
		IEditorPart editor = page.getActiveEditor();
		if (editor instanceof ITextEditor) {
			ISelection selection2 = ((ITextEditor) editor).getSelectionProvider().getSelection();
			if (selection2 instanceof ITextSelection) {
				return (ITextSelection) selection2;
			}
		}
		return null;
	}


	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		page = targetPart.getSite().getPage();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currentFile = getSelectedFile(selection);

	}

	/**
	 * Returns the openend file iff the selection contains exactly one selected file editor, and nothing else.
	 * This is the case when rightclicking an editor.
	 * 
	 * @param selection
	 * @return The selected file, or null if the selection is invallid.
	 */
	private IFile getSelectedFile(ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;
			Object element = structuredSelection.getFirstElement();

			if(structuredSelection.size() == 1 && element instanceof IFileEditorInput) {
				return ((IFileEditorInput) element).getFile();
			}
		}
		return null;
	}

}
