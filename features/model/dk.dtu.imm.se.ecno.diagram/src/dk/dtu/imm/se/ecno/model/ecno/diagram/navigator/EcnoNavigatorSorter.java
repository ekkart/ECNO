package dk.dtu.imm.se.ecno.model.ecno.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry;

/**
 * @generated
 */
public class EcnoNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EcnoNavigatorItem) {
			EcnoNavigatorItem item = (EcnoNavigatorItem) element;
			return EcnoVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
