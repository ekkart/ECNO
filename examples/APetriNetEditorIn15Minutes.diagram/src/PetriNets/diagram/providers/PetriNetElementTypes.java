package PetriNets.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class PetriNetElementTypes {

	/**
	 * @generated
	 */
	private PetriNetElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType PetriNet_1000 = getElementType("APetriNetEditorIn15Minutes.diagram.PetriNet_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_2001 = getElementType("APetriNetEditorIn15Minutes.diagram.Transition_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Place_2002 = getElementType("APetriNetEditorIn15Minutes.diagram.Place_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Token_3001 = getElementType("APetriNetEditorIn15Minutes.diagram.Token_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Arc_4001 = getElementType("APetriNetEditorIn15Minutes.diagram.Arc_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return PetriNets.diagram.part.PetriNetDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(PetriNet_1000,
					PetriNets.PetriNetsPackage.eINSTANCE.getPetriNet());

			elements.put(Transition_2001,
					PetriNets.PetriNetsPackage.eINSTANCE.getTransition());

			elements.put(Place_2002,
					PetriNets.PetriNetsPackage.eINSTANCE.getPlace());

			elements.put(Token_3001,
					PetriNets.PetriNetsPackage.eINSTANCE.getToken());

			elements.put(Arc_4001,
					PetriNets.PetriNetsPackage.eINSTANCE.getArc());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(PetriNet_1000);
			KNOWN_ELEMENT_TYPES.add(Transition_2001);
			KNOWN_ELEMENT_TYPES.add(Place_2002);
			KNOWN_ELEMENT_TYPES.add(Token_3001);
			KNOWN_ELEMENT_TYPES.add(Arc_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return PetriNet_1000;
		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_2001;
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return Place_2002;
		case PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID:
			return Token_3001;
		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return Arc_4001;
		}
		return null;
	}

}
