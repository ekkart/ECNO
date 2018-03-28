package dk.dtu.imm.se.ecno.model.ecno.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetTriggerEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionParametersEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeParametersEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameter2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameterEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.PackageEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceUpperBound2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceUpperBoundEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapKeyEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEventNameTypeEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EcnoVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "dk.dtu.imm.se.ecno.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry
				.getVisualID(view.getType());
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
				EcnoDiagramEditorPlugin.getInstance().logError(
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
		if (EcnoPackage.eINSTANCE.getPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
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
		String containerModelID = dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			if (EcnoPackage.eINSTANCE.getEventType().isSuperTypeOf(
					domainElement.eClass())) {
				return EventTypeEditPart.VISUAL_ID;
			}
			if (EcnoPackage.eINSTANCE.getElementType().isSuperTypeOf(
					domainElement.eClass())) {
				return ElementTypeEditPart.VISUAL_ID;
			}
			if (EcnoPackage.eINSTANCE.getEventTypeExtension().isSuperTypeOf(
					domainElement.eClass())) {
				return EventTypeExtensionEditPart.VISUAL_ID;
			}
			break;
		case ElementTypeEditPart.VISUAL_ID:
			if (EcnoPackage.eINSTANCE.getCoordinationSet().isSuperTypeOf(
					domainElement.eClass())) {
				return CoordinationSetEditPart.VISUAL_ID;
			}
			break;
		case EventTypeParametersEditPart.VISUAL_ID:
			if (EcnoPackage.eINSTANCE.getFormalParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return FormalParameterEditPart.VISUAL_ID;
			}
			break;
		case EventTypeExtensionParametersEditPart.VISUAL_ID:
			if (EcnoPackage.eINSTANCE.getFormalParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return FormalParameter2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			if (EventTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElementTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventTypeExtensionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventTypeEditPart.VISUAL_ID:
			if (EventTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventTypeParametersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementTypeEditPart.VISUAL_ID:
			if (ElementTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CoordinationSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventTypeExtensionEditPart.VISUAL_ID:
			if (EventTypeExtensionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventTypeExtensionParametersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoordinationSetEditPart.VISUAL_ID:
			if (CoordinationSetTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventTypeParametersEditPart.VISUAL_ID:
			if (FormalParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventTypeExtensionParametersEditPart.VISUAL_ID:
			if (FormalParameter2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReferenceEditPart.VISUAL_ID:
			if (ReferenceUpperBoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReferenceUpperBound2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SynchronisationEditPart.VISUAL_ID:
			if (SynchronisationEventNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case String2EventTypeExtensionMapEditPart.VISUAL_ID:
			if (String2EventTypeExtensionMapKeyEditPart.VISUAL_ID == nodeVisualID) {
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
		if (EcnoPackage.eINSTANCE.getReference().isSuperTypeOf(
				domainElement.eClass())) {
			return ReferenceEditPart.VISUAL_ID;
		}
		if (EcnoPackage.eINSTANCE.getSynchronisation().isSuperTypeOf(
				domainElement.eClass())) {
			return SynchronisationEditPart.VISUAL_ID;
		}
		if (EcnoPackage.eINSTANCE.getString2EventTypeExtensionMap()
				.isSuperTypeOf(domainElement.eClass())) {
			return String2EventTypeExtensionMapEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

}
