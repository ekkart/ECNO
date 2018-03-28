package PetriNets.diagram.part;

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

/**
 * @generated
 */
public class PetriNetDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetNodeDescriptor> getSemanticChildren(
			View view) {
		switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000SemanticChildren(view);
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetNodeDescriptor> getPetriNet_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PetriNets.PetriNet modelElement = (PetriNets.PetriNet) view
				.getElement();
		LinkedList<PetriNets.diagram.part.PetriNetNodeDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getObject().iterator(); it.hasNext();) {
			PetriNets.Object childElement = (PetriNets.Object) it.next();
			int visualID = PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
				result.add(new PetriNets.diagram.part.PetriNetNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID) {
				result.add(new PetriNets.diagram.part.PetriNetNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetNodeDescriptor> getPlace_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PetriNets.Place modelElement = (PetriNets.Place) view.getElement();
		LinkedList<PetriNets.diagram.part.PetriNetNodeDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getToken().iterator(); it.hasNext();) {
			PetriNets.Token childElement = (PetriNets.Token) it.next();
			int visualID = PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID) {
				result.add(new PetriNets.diagram.part.PetriNetNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getContainedLinks(
			View view) {
		switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000ContainedLinks(view);
		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001ContainedLinks(view);
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2002ContainedLinks(view);
		case PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID:
			return getToken_3001ContainedLinks(view);
		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getIncomingLinks(
			View view) {
		switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001IncomingLinks(view);
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2002IncomingLinks(view);
		case PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID:
			return getToken_3001IncomingLinks(view);
		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001OutgoingLinks(view);
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2002OutgoingLinks(view);
		case PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID:
			return getToken_3001OutgoingLinks(view);
		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getPetriNet_1000ContainedLinks(
			View view) {
		PetriNets.PetriNet modelElement = (PetriNets.PetriNet) view
				.getElement();
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getTransition_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getPlace_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getToken_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getArc_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getTransition_2001IncomingLinks(
			View view) {
		PetriNets.Transition modelElement = (PetriNets.Transition) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getPlace_2002IncomingLinks(
			View view) {
		PetriNets.Place modelElement = (PetriNets.Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getToken_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getArc_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getTransition_2001OutgoingLinks(
			View view) {
		PetriNets.Transition modelElement = (PetriNets.Transition) view
				.getElement();
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getPlace_2002OutgoingLinks(
			View view) {
		PetriNets.Place modelElement = (PetriNets.Place) view.getElement();
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getToken_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetriNets.diagram.part.PetriNetLinkDescriptor> getArc_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<PetriNets.diagram.part.PetriNetLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4001(
			PetriNets.PetriNet container) {
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		for (Iterator<?> links = container.getObject().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PetriNets.Arc) {
				continue;
			}
			PetriNets.Arc link = (PetriNets.Arc) linkObject;
			if (PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID != PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PetriNets.Node dst = link.getTarget();
			PetriNets.Node src = link.getSource();
			result.add(new PetriNets.diagram.part.PetriNetLinkDescriptor(src,
					dst, link,
					PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001,
					PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PetriNets.diagram.part.PetriNetLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4001(
			PetriNets.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PetriNets.PetriNetsPackage.eINSTANCE
					.getArc_Target()
					|| false == setting.getEObject() instanceof PetriNets.Arc) {
				continue;
			}
			PetriNets.Arc link = (PetriNets.Arc) setting.getEObject();
			if (PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID != PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PetriNets.Node src = link.getSource();
			result.add(new PetriNets.diagram.part.PetriNetLinkDescriptor(src,
					target, link,
					PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001,
					PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PetriNets.diagram.part.PetriNetLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4001(
			PetriNets.Node source) {
		PetriNets.PetriNet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof PetriNets.PetriNet) {
				container = (PetriNets.PetriNet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<PetriNets.diagram.part.PetriNetLinkDescriptor>();
		for (Iterator<?> links = container.getObject().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PetriNets.Arc) {
				continue;
			}
			PetriNets.Arc link = (PetriNets.Arc) linkObject;
			if (PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID != PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PetriNets.Node dst = link.getTarget();
			PetriNets.Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PetriNets.diagram.part.PetriNetLinkDescriptor(src,
					dst, link,
					PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001,
					PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
		}
		return result;
	}

}
