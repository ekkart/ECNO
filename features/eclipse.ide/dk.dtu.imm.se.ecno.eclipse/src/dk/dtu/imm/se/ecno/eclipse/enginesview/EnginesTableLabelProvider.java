package dk.dtu.imm.se.ecno.eclipse.enginesview;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;


import dk.dtu.imm.se.ecno.eclipse.enginesregistry.EngineWrapper;

public class EnginesTableLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof EngineWrapper) {
			EngineWrapper wrapper = (EngineWrapper) element;
			switch (columnIndex) {
			case 0 :
				return wrapper.getName();
			case 1 : 
				return wrapper.getResourceFileName();
		    default :
		    	return "<none> " + columnIndex;
			}
		}
		return "<corrupted list content>";
	}

}
