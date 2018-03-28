package PetriNets.diagram.integration;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.resources.IFile;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.part.FileEditorInput;

/**
 * A class "simulating" a FileEditorInput, but actually providing the diagram object
 * as input to the graphical editor. This is a quick and dirty hack to allow a graphical
 * editor open on a diagram that is opened in some other resource set already (provided
 * it is attached to a TransactionalEditingDomain already). This was introduced to
 * install an ECNO GUI, which shows the behaviour of the Petri net simulation graphically.
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 */
public class DiagramEditorInput extends FileEditorInput {

	private Diagram diagram;
	private IOperationHistory operationHistory;
	
	public DiagramEditorInput(IFile file, Diagram diagram, IOperationHistory operationHistory) {
		super(file);
		this.diagram = diagram;
		this.operationHistory = operationHistory;
	}
	
	public Diagram getDiagram() {
		return diagram;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof DiagramEditorInput)) {
			return false;
		} else if (diagram != null) {
			return diagram.equals(((DiagramEditorInput) object).getDiagram());
		} else {
			return this == object;
		}
	}
	
	public IOperationHistory getOperationHistory() {
		return operationHistory;
		
	}

}
