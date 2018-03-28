package dk.dtu.imm.se.ecno.model.ecno.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionBaseEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionParametersEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeParametersEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameter2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameterEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.PackageEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;

/**
 * @generated
 */
public class EcnoDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EcnoNodeDescriptor> getSemanticChildren(View view) {
		switch (EcnoVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		case ElementTypeEditPart.VISUAL_ID:
			return getElementType_2002SemanticChildren(view);
		case EventTypeParametersEditPart.VISUAL_ID:
			return getEventTypeParameters_7001SemanticChildren(view);
		case EventTypeExtensionParametersEditPart.VISUAL_ID:
			return getEventTypeExtensionParameters_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<EcnoNodeDescriptor> result = new LinkedList<EcnoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventTypes().iterator(); it
				.hasNext();) {
			EventType childElement = (EventType) it.next();
			int visualID = EcnoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventTypeEditPart.VISUAL_ID) {
				result.add(new EcnoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElementTypes().iterator(); it
				.hasNext();) {
			ElementType childElement = (ElementType) it.next();
			int visualID = EcnoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ElementTypeEditPart.VISUAL_ID) {
				result.add(new EcnoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEventTypeExtensions().iterator(); it
				.hasNext();) {
			EventTypeExtension childElement = (EventTypeExtension) it.next();
			int visualID = EcnoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventTypeExtensionEditPart.VISUAL_ID) {
				result.add(new EcnoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoNodeDescriptor> getElementType_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ElementType modelElement = (ElementType) view.getElement();
		LinkedList<EcnoNodeDescriptor> result = new LinkedList<EcnoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCoordinationSets().iterator(); it
				.hasNext();) {
			CoordinationSet childElement = (CoordinationSet) it.next();
			int visualID = EcnoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CoordinationSetEditPart.VISUAL_ID) {
				result.add(new EcnoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoNodeDescriptor> getEventTypeParameters_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventType modelElement = (EventType) containerView.getElement();
		LinkedList<EcnoNodeDescriptor> result = new LinkedList<EcnoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			FormalParameter childElement = (FormalParameter) it.next();
			int visualID = EcnoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormalParameterEditPart.VISUAL_ID) {
				result.add(new EcnoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoNodeDescriptor> getEventTypeExtensionParameters_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventTypeExtension modelElement = (EventTypeExtension) containerView
				.getElement();
		LinkedList<EcnoNodeDescriptor> result = new LinkedList<EcnoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			FormalParameter childElement = (FormalParameter) it.next();
			int visualID = EcnoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FormalParameter2EditPart.VISUAL_ID) {
				result.add(new EcnoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getContainedLinks(View view) {
		switch (EcnoVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case EventTypeEditPart.VISUAL_ID:
			return getEventType_2001ContainedLinks(view);
		case ElementTypeEditPart.VISUAL_ID:
			return getElementType_2002ContainedLinks(view);
		case EventTypeExtensionEditPart.VISUAL_ID:
			return getEventTypeExtension_2003ContainedLinks(view);
		case FormalParameterEditPart.VISUAL_ID:
			return getFormalParameter_3002ContainedLinks(view);
		case CoordinationSetEditPart.VISUAL_ID:
			return getCoordinationSet_3001ContainedLinks(view);
		case FormalParameter2EditPart.VISUAL_ID:
			return getFormalParameter_3003ContainedLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4001ContainedLinks(view);
		case SynchronisationEditPart.VISUAL_ID:
			return getSynchronisation_4002ContainedLinks(view);
		case String2EventTypeExtensionMapEditPart.VISUAL_ID:
			return getString2EventTypeExtensionMap_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getIncomingLinks(View view) {
		switch (EcnoVisualIDRegistry.getVisualID(view)) {
		case EventTypeEditPart.VISUAL_ID:
			return getEventType_2001IncomingLinks(view);
		case ElementTypeEditPart.VISUAL_ID:
			return getElementType_2002IncomingLinks(view);
		case EventTypeExtensionEditPart.VISUAL_ID:
			return getEventTypeExtension_2003IncomingLinks(view);
		case FormalParameterEditPart.VISUAL_ID:
			return getFormalParameter_3002IncomingLinks(view);
		case CoordinationSetEditPart.VISUAL_ID:
			return getCoordinationSet_3001IncomingLinks(view);
		case FormalParameter2EditPart.VISUAL_ID:
			return getFormalParameter_3003IncomingLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4001IncomingLinks(view);
		case SynchronisationEditPart.VISUAL_ID:
			return getSynchronisation_4002IncomingLinks(view);
		case String2EventTypeExtensionMapEditPart.VISUAL_ID:
			return getString2EventTypeExtensionMap_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getOutgoingLinks(View view) {
		switch (EcnoVisualIDRegistry.getVisualID(view)) {
		case EventTypeEditPart.VISUAL_ID:
			return getEventType_2001OutgoingLinks(view);
		case ElementTypeEditPart.VISUAL_ID:
			return getElementType_2002OutgoingLinks(view);
		case EventTypeExtensionEditPart.VISUAL_ID:
			return getEventTypeExtension_2003OutgoingLinks(view);
		case FormalParameterEditPart.VISUAL_ID:
			return getFormalParameter_3002OutgoingLinks(view);
		case CoordinationSetEditPart.VISUAL_ID:
			return getCoordinationSet_3001OutgoingLinks(view);
		case FormalParameter2EditPart.VISUAL_ID:
			return getFormalParameter_3003OutgoingLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4001OutgoingLinks(view);
		case SynchronisationEditPart.VISUAL_ID:
			return getSynchronisation_4002OutgoingLinks(view);
		case String2EventTypeExtensionMapEditPart.VISUAL_ID:
			return getString2EventTypeExtensionMap_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getEventType_2001ContainedLinks(
			View view) {
		EventType modelElement = (EventType) view.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_EventType_Super_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getElementType_2002ContainedLinks(
			View view) {
		ElementType modelElement = (ElementType) view.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Reference_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ElementType_Super_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getEventTypeExtension_2003ContainedLinks(
			View view) {
		EventTypeExtension modelElement = (EventTypeExtension) view
				.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_EventTypeExtension_Base_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_String2EventTypeExtensionMap_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getFormalParameter_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getCoordinationSet_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getFormalParameter_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getReference_4001ContainedLinks(
			View view) {
		Reference modelElement = (Reference) view.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Synchronisation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getSynchronisation_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getString2EventTypeExtensionMap_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getEventType_2001IncomingLinks(
			View view) {
		EventType modelElement = (EventType) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_EventType_Super_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EventTypeExtension_Base_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getElementType_2002IncomingLinks(
			View view) {
		ElementType modelElement = (ElementType) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ElementType_Super_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getEventTypeExtension_2003IncomingLinks(
			View view) {
		EventTypeExtension modelElement = (EventTypeExtension) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_String2EventTypeExtensionMap_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getFormalParameter_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getCoordinationSet_3001IncomingLinks(
			View view) {
		CoordinationSet modelElement = (CoordinationSet) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Synchronisation_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getFormalParameter_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getReference_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getSynchronisation_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getString2EventTypeExtensionMap_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getEventType_2001OutgoingLinks(
			View view) {
		EventType modelElement = (EventType) view.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_EventType_Super_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getElementType_2002OutgoingLinks(
			View view) {
		ElementType modelElement = (ElementType) view.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Reference_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ElementType_Super_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getEventTypeExtension_2003OutgoingLinks(
			View view) {
		EventTypeExtension modelElement = (EventTypeExtension) view
				.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_EventTypeExtension_Base_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_String2EventTypeExtensionMap_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getFormalParameter_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getCoordinationSet_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getFormalParameter_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getReference_4001OutgoingLinks(
			View view) {
		Reference modelElement = (Reference) view.getElement();
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Synchronisation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getSynchronisation_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EcnoLinkDescriptor> getString2EventTypeExtensionMap_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getContainedTypeModelFacetLinks_Reference_4001(
			ElementType container) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		for (Iterator<?> links = container.getReferences().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Reference) {
				continue;
			}
			Reference link = (Reference) linkObject;
			if (ReferenceEditPart.VISUAL_ID != EcnoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementType dst = link.getTarget();
			result.add(new EcnoLinkDescriptor(container, dst, link,
					EcnoElementTypes.Reference_4001,
					ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getContainedTypeModelFacetLinks_Synchronisation_4002(
			Reference container) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		for (Iterator<?> links = container.getSynchronisations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Synchronisation) {
				continue;
			}
			Synchronisation link = (Synchronisation) linkObject;
			if (SynchronisationEditPart.VISUAL_ID != EcnoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CoordinationSet dst = link.getCoordinationSet();
			result.add(new EcnoLinkDescriptor(container, dst, link,
					EcnoElementTypes.Synchronisation_4002,
					SynchronisationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getContainedTypeModelFacetLinks_String2EventTypeExtensionMap_4006(
			EventTypeExtension container) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		for (Iterator<?> links = container.getSuper().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Map.Entry) {
				continue;
			}
			Map.Entry link = (Map.Entry) linkObject;
			if (String2EventTypeExtensionMapEditPart.VISUAL_ID != EcnoVisualIDRegistry
					.getLinkWithClassVisualID((EObject) link)) {
				continue;
			}
			EventTypeExtension dst = ((EventTypeExtension) ((EObject) link)
					.eGet(EcnoPackage.eINSTANCE
							.getString2EventTypeExtensionMap_Value()));
			result.add(new EcnoLinkDescriptor(container, dst, (EObject) link,
					EcnoElementTypes.String2EventTypeExtensionMap_4006,
					String2EventTypeExtensionMapEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getIncomingTypeModelFacetLinks_Reference_4001(
			ElementType target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EcnoPackage.eINSTANCE
					.getReference_Target()
					|| false == setting.getEObject() instanceof Reference) {
				continue;
			}
			Reference link = (Reference) setting.getEObject();
			if (ReferenceEditPart.VISUAL_ID != EcnoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof ElementType) {
				continue;
			}
			ElementType container = (ElementType) link.eContainer();
			result.add(new EcnoLinkDescriptor(container, target, link,
					EcnoElementTypes.Reference_4001,
					ReferenceEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getIncomingTypeModelFacetLinks_Synchronisation_4002(
			CoordinationSet target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EcnoPackage.eINSTANCE
					.getSynchronisation_CoordinationSet()
					|| false == setting.getEObject() instanceof Synchronisation) {
				continue;
			}
			Synchronisation link = (Synchronisation) setting.getEObject();
			if (SynchronisationEditPart.VISUAL_ID != EcnoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Reference) {
				continue;
			}
			Reference container = (Reference) link.eContainer();
			result.add(new EcnoLinkDescriptor(container, target, link,
					EcnoElementTypes.Synchronisation_4002,
					SynchronisationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getIncomingFeatureModelFacetLinks_ElementType_Super_4003(
			ElementType target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EcnoPackage.eINSTANCE
					.getElementType_Super()) {
				result.add(new EcnoLinkDescriptor(setting.getEObject(), target,
						EcnoElementTypes.ElementTypeSuper_4003,
						ElementTypeSuperEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getIncomingFeatureModelFacetLinks_EventType_Super_4004(
			EventType target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EcnoPackage.eINSTANCE
					.getEventType_Super()) {
				result.add(new EcnoLinkDescriptor(setting.getEObject(), target,
						EcnoElementTypes.EventTypeSuper_4004,
						EventTypeSuperEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getIncomingFeatureModelFacetLinks_EventTypeExtension_Base_4005(
			EventType target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EcnoPackage.eINSTANCE
					.getEventTypeExtension_Base()) {
				result.add(new EcnoLinkDescriptor(setting.getEObject(), target,
						EcnoElementTypes.EventTypeExtensionBase_4005,
						EventTypeExtensionBaseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getIncomingTypeModelFacetLinks_String2EventTypeExtensionMap_4006(
			EventTypeExtension target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EcnoPackage.eINSTANCE
					.getString2EventTypeExtensionMap_Value()
					|| false == setting.getEObject() instanceof Map.Entry) {
				continue;
			}
			Map.Entry link = (Map.Entry) setting.getEObject();
			if (String2EventTypeExtensionMapEditPart.VISUAL_ID != EcnoVisualIDRegistry
					.getLinkWithClassVisualID((EObject) link)) {
				continue;
			}
			if (false == ((EObject) link).eContainer() instanceof EventTypeExtension) {
				continue;
			}
			EventTypeExtension container = (EventTypeExtension) ((EObject) link)
					.eContainer();
			result.add(new EcnoLinkDescriptor(container, target,
					(EObject) link,
					EcnoElementTypes.String2EventTypeExtensionMap_4006,
					String2EventTypeExtensionMapEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getOutgoingFeatureModelFacetLinks_ElementType_Super_4003(
			ElementType source) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		ElementType destination = source.getSuper();
		if (destination == null) {
			return result;
		}
		result.add(new EcnoLinkDescriptor(source, destination,
				EcnoElementTypes.ElementTypeSuper_4003,
				ElementTypeSuperEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getOutgoingFeatureModelFacetLinks_EventType_Super_4004(
			EventType source) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		EventType destination = source.getSuper();
		if (destination == null) {
			return result;
		}
		result.add(new EcnoLinkDescriptor(source, destination,
				EcnoElementTypes.EventTypeSuper_4004,
				EventTypeSuperEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EcnoLinkDescriptor> getOutgoingFeatureModelFacetLinks_EventTypeExtension_Base_4005(
			EventTypeExtension source) {
		LinkedList<EcnoLinkDescriptor> result = new LinkedList<EcnoLinkDescriptor>();
		EventType destination = source.getBase();
		if (destination == null) {
			return result;
		}
		result.add(new EcnoLinkDescriptor(source, destination,
				EcnoElementTypes.EventTypeExtensionBase_4005,
				EventTypeExtensionBaseEditPart.VISUAL_ID));
		return result;
	}

}
