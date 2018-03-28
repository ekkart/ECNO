package dk.dtu.imm.se.ecno.eclipse.enginesview;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

import dk.dtu.imm.se.ecno.eclipse.enginesregistry.EngineWrapper;

public class EngineNameEditingSupport extends EditingSupport {

	private final ColumnViewer viewer;
	
	private TextCellEditor editor = null;
	
	public EngineNameEditingSupport(ColumnViewer viewer) {
		super(viewer);
		this.viewer = viewer;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		if (editor == null) {
			Composite composite = (Composite) viewer.getControl();
			editor = new TextCellEditor(composite);
		}
		return editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		if (element instanceof EngineWrapper) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected Object getValue(Object element) {
		String result = null;
		if (element instanceof EngineWrapper) {
			result = ((EngineWrapper) element).getName();
		}
		if (result == null) {
			result = "";
		}
		return result;
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (element instanceof EngineWrapper && value instanceof String) {
			((EngineWrapper) element).setName((String) value);
			viewer.refresh(element);
		}
	}

}
