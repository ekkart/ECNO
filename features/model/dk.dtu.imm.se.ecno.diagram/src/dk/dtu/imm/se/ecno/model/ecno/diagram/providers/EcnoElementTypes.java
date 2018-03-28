package dk.dtu.imm.se.ecno.model.ecno.diagram.providers;

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

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionBaseEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameter2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameterEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.PackageEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoDiagramEditorPlugin;

/**
 * @generated
 */
public class EcnoElementTypes {

	/**
	 * @generated
	 */
	private EcnoElementTypes() {
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
	public static final IElementType Package_1000 = getElementType("dk.dtu.imm.se.ecno.diagram.Package_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventType_2001 = getElementType("dk.dtu.imm.se.ecno.diagram.EventType_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElementType_2002 = getElementType("dk.dtu.imm.se.ecno.diagram.ElementType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventTypeExtension_2003 = getElementType("dk.dtu.imm.se.ecno.diagram.EventTypeExtension_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FormalParameter_3002 = getElementType("dk.dtu.imm.se.ecno.diagram.FormalParameter_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CoordinationSet_3001 = getElementType("dk.dtu.imm.se.ecno.diagram.CoordinationSet_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormalParameter_3003 = getElementType("dk.dtu.imm.se.ecno.diagram.FormalParameter_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Reference_4001 = getElementType("dk.dtu.imm.se.ecno.diagram.Reference_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Synchronisation_4002 = getElementType("dk.dtu.imm.se.ecno.diagram.Synchronisation_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ElementTypeSuper_4003 = getElementType("dk.dtu.imm.se.ecno.diagram.ElementTypeSuper_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventTypeSuper_4004 = getElementType("dk.dtu.imm.se.ecno.diagram.EventTypeSuper_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventTypeExtensionBase_4005 = getElementType("dk.dtu.imm.se.ecno.diagram.EventTypeExtensionBase_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType String2EventTypeExtensionMap_4006 = getElementType("dk.dtu.imm.se.ecno.diagram.String2EventTypeExtensionMap_4006"); //$NON-NLS-1$

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
				return EcnoDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
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

			elements.put(Package_1000, EcnoPackage.eINSTANCE.getPackage());

			elements.put(EventType_2001, EcnoPackage.eINSTANCE.getEventType());

			elements.put(ElementType_2002,
					EcnoPackage.eINSTANCE.getElementType());

			elements.put(EventTypeExtension_2003,
					EcnoPackage.eINSTANCE.getEventTypeExtension());

			elements.put(FormalParameter_3002,
					EcnoPackage.eINSTANCE.getFormalParameter());

			elements.put(CoordinationSet_3001,
					EcnoPackage.eINSTANCE.getCoordinationSet());

			elements.put(FormalParameter_3003,
					EcnoPackage.eINSTANCE.getFormalParameter());

			elements.put(Reference_4001, EcnoPackage.eINSTANCE.getReference());

			elements.put(Synchronisation_4002,
					EcnoPackage.eINSTANCE.getSynchronisation());

			elements.put(ElementTypeSuper_4003,
					EcnoPackage.eINSTANCE.getElementType_Super());

			elements.put(EventTypeSuper_4004,
					EcnoPackage.eINSTANCE.getEventType_Super());

			elements.put(EventTypeExtensionBase_4005,
					EcnoPackage.eINSTANCE.getEventTypeExtension_Base());

			elements.put(String2EventTypeExtensionMap_4006,
					EcnoPackage.eINSTANCE.getString2EventTypeExtensionMap());
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
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(EventType_2001);
			KNOWN_ELEMENT_TYPES.add(ElementType_2002);
			KNOWN_ELEMENT_TYPES.add(EventTypeExtension_2003);
			KNOWN_ELEMENT_TYPES.add(FormalParameter_3002);
			KNOWN_ELEMENT_TYPES.add(CoordinationSet_3001);
			KNOWN_ELEMENT_TYPES.add(FormalParameter_3003);
			KNOWN_ELEMENT_TYPES.add(Reference_4001);
			KNOWN_ELEMENT_TYPES.add(Synchronisation_4002);
			KNOWN_ELEMENT_TYPES.add(ElementTypeSuper_4003);
			KNOWN_ELEMENT_TYPES.add(EventTypeSuper_4004);
			KNOWN_ELEMENT_TYPES.add(EventTypeExtensionBase_4005);
			KNOWN_ELEMENT_TYPES.add(String2EventTypeExtensionMap_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PackageEditPart.VISUAL_ID:
			return Package_1000;
		case EventTypeEditPart.VISUAL_ID:
			return EventType_2001;
		case ElementTypeEditPart.VISUAL_ID:
			return ElementType_2002;
		case EventTypeExtensionEditPart.VISUAL_ID:
			return EventTypeExtension_2003;
		case FormalParameterEditPart.VISUAL_ID:
			return FormalParameter_3002;
		case CoordinationSetEditPart.VISUAL_ID:
			return CoordinationSet_3001;
		case FormalParameter2EditPart.VISUAL_ID:
			return FormalParameter_3003;
		case ReferenceEditPart.VISUAL_ID:
			return Reference_4001;
		case SynchronisationEditPart.VISUAL_ID:
			return Synchronisation_4002;
		case ElementTypeSuperEditPart.VISUAL_ID:
			return ElementTypeSuper_4003;
		case EventTypeSuperEditPart.VISUAL_ID:
			return EventTypeSuper_4004;
		case EventTypeExtensionBaseEditPart.VISUAL_ID:
			return EventTypeExtensionBase_4005;
		case String2EventTypeExtensionMapEditPart.VISUAL_ID:
			return String2EventTypeExtensionMap_4006;
		}
		return null;
	}

}
