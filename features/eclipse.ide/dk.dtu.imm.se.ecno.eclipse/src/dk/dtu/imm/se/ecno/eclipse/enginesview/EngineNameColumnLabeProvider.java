package dk.dtu.imm.se.ecno.eclipse.enginesview;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import dk.dtu.imm.se.ecno.eclipse.enginesregistry.EngineWrapper;

public class EngineNameColumnLabeProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof EngineWrapper) {
			return ((EngineWrapper) element).getName();
		}
		return null;
	}

}
