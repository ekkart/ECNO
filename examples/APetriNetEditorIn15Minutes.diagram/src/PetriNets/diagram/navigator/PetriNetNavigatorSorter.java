package PetriNets.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PetriNetNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof PetriNets.diagram.navigator.PetriNetNavigatorItem) {
			PetriNets.diagram.navigator.PetriNetNavigatorItem item = (PetriNets.diagram.navigator.PetriNetNavigatorItem) element;
			return PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
