package PetriNets.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PetriNetVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "APetriNetEditorIn15Minutes.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
					.equals(view.getType())) {
				return PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return PetriNets.diagram.part.PetriNetVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				PetriNets.diagram.part.PetriNetDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PetriNets.PetriNetsPackage.eINSTANCE.getPetriNet().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((PetriNets.PetriNet) domainElement)) {
			return PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getModelID(containerView);
		if (!PetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (PetriNets.PetriNetsPackage.eINSTANCE.getTransition()
					.isSuperTypeOf(domainElement.eClass())) {
				return PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
			}
			if (PetriNets.PetriNetsPackage.eINSTANCE.getPlace().isSuperTypeOf(
					domainElement.eClass())) {
				return PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID;
			}
			break;
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			if (PetriNets.PetriNetsPackage.eINSTANCE.getToken().isSuperTypeOf(
					domainElement.eClass())) {
				return PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getModelID(containerView);
		if (!PetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			if (PetriNets.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			if (PetriNets.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PetriNets.PetriNetsPackage.eINSTANCE.getArc().isSuperTypeOf(
				domainElement.eClass())) {
			return PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(PetriNets.PetriNet element) {
		return true;
	}

}
