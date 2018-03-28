package dk.dtu.imm.se.ecno.model.ecno.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetTriggerEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionBaseEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameter2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameterEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.PackageEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceUpperBoundEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapKeyEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEventNameTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoDiagramEditorPlugin;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry;
import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;
import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoParserProvider;

/**
 * @generated
 */
public class EcnoNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EcnoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EcnoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EcnoNavigatorItem
				&& !isOwnView(((EcnoNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EcnoNavigatorGroup) {
			EcnoNavigatorGroup group = (EcnoNavigatorGroup) element;
			return EcnoDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof EcnoNavigatorItem) {
			EcnoNavigatorItem navigatorItem = (EcnoNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (EcnoVisualIDRegistry.getVisualID(view)) {
		case EventTypeExtensionBaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ecno.se.imm.dtu.dk/ecno?EventTypeExtension?base", EcnoElementTypes.EventTypeExtensionBase_4005); //$NON-NLS-1$
		case EventTypeSuperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ecno.se.imm.dtu.dk/ecno?EventType?super", EcnoElementTypes.EventTypeSuper_4004); //$NON-NLS-1$
		case FormalParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ecno.se.imm.dtu.dk/ecno?FormalParameter", EcnoElementTypes.FormalParameter_3002); //$NON-NLS-1$
		case String2EventTypeExtensionMapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ecno.se.imm.dtu.dk/ecno?String2EventTypeExtensionMap", EcnoElementTypes.String2EventTypeExtensionMap_4006); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ecno.se.imm.dtu.dk/ecno?Package", EcnoElementTypes.Package_1000); //$NON-NLS-1$
		case CoordinationSetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ecno.se.imm.dtu.dk/ecno?CoordinationSet", EcnoElementTypes.CoordinationSet_3001); //$NON-NLS-1$
		case EventTypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ecno.se.imm.dtu.dk/ecno?EventTypeExtension", EcnoElementTypes.EventTypeExtension_2003); //$NON-NLS-1$
		case FormalParameter2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ecno.se.imm.dtu.dk/ecno?FormalParameter", EcnoElementTypes.FormalParameter_3003); //$NON-NLS-1$
		case EventTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ecno.se.imm.dtu.dk/ecno?EventType", EcnoElementTypes.EventType_2001); //$NON-NLS-1$
		case ReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ecno.se.imm.dtu.dk/ecno?Reference", EcnoElementTypes.Reference_4001); //$NON-NLS-1$
		case ElementTypeSuperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ecno.se.imm.dtu.dk/ecno?ElementType?super", EcnoElementTypes.ElementTypeSuper_4003); //$NON-NLS-1$
		case SynchronisationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ecno.se.imm.dtu.dk/ecno?Synchronisation", EcnoElementTypes.Synchronisation_4002); //$NON-NLS-1$
		case ElementTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ecno.se.imm.dtu.dk/ecno?ElementType", EcnoElementTypes.ElementType_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EcnoDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& EcnoElementTypes.isKnownElementType(elementType)) {
			image = EcnoElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof EcnoNavigatorGroup) {
			EcnoNavigatorGroup group = (EcnoNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EcnoNavigatorItem) {
			EcnoNavigatorItem navigatorItem = (EcnoNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (EcnoVisualIDRegistry.getVisualID(view)) {
		case EventTypeExtensionBaseEditPart.VISUAL_ID:
			return getEventTypeExtensionBase_4005Text(view);
		case EventTypeSuperEditPart.VISUAL_ID:
			return getEventTypeSuper_4004Text(view);
		case FormalParameterEditPart.VISUAL_ID:
			return getFormalParameter_3002Text(view);
		case String2EventTypeExtensionMapEditPart.VISUAL_ID:
			return getString2EventTypeExtensionMap_4006Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case CoordinationSetEditPart.VISUAL_ID:
			return getCoordinationSet_3001Text(view);
		case EventTypeExtensionEditPart.VISUAL_ID:
			return getEventTypeExtension_2003Text(view);
		case FormalParameter2EditPart.VISUAL_ID:
			return getFormalParameter_3003Text(view);
		case EventTypeEditPart.VISUAL_ID:
			return getEventType_2001Text(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4001Text(view);
		case ElementTypeSuperEditPart.VISUAL_ID:
			return getElementTypeSuper_4003Text(view);
		case SynchronisationEditPart.VISUAL_ID:
			return getSynchronisation_4002Text(view);
		case ElementTypeEditPart.VISUAL_ID:
			return getElementType_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getEventTypeExtensionBase_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getReference_4001Text(View view) {
		IParser parser = EcnoParserProvider.getParser(
				EcnoElementTypes.Reference_4001,
				view.getElement() != null ? view.getElement() : view,
				EcnoVisualIDRegistry
						.getType(ReferenceUpperBoundEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSynchronisation_4002Text(View view) {
		IParser parser = EcnoParserProvider
				.getParser(
						EcnoElementTypes.Synchronisation_4002,
						view.getElement() != null ? view.getElement() : view,
						EcnoVisualIDRegistry
								.getType(SynchronisationEventNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventType_2001Text(View view) {
		IParser parser = EcnoParserProvider.getParser(
				EcnoElementTypes.EventType_2001,
				view.getElement() != null ? view.getElement() : view,
				EcnoVisualIDRegistry.getType(EventTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElementTypeSuper_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		Package domainModelElement = (Package) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUri();
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventTypeSuper_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getElementType_2002Text(View view) {
		IParser parser = EcnoParserProvider
				.getParser(EcnoElementTypes.ElementType_2002,
						view.getElement() != null ? view.getElement() : view,
						EcnoVisualIDRegistry
								.getType(ElementTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationSet_3001Text(View view) {
		IParser parser = EcnoParserProvider.getParser(
				EcnoElementTypes.CoordinationSet_3001,
				view.getElement() != null ? view.getElement() : view,
				EcnoVisualIDRegistry
						.getType(CoordinationSetTriggerEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventTypeExtension_2003Text(View view) {
		IParser parser = EcnoParserProvider.getParser(
				EcnoElementTypes.EventTypeExtension_2003,
				view.getElement() != null ? view.getElement() : view,
				EcnoVisualIDRegistry
						.getType(EventTypeExtensionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFormalParameter_3003Text(View view) {
		IParser parser = EcnoParserProvider.getParser(
				EcnoElementTypes.FormalParameter_3003,
				view.getElement() != null ? view.getElement() : view,
				EcnoVisualIDRegistry
						.getType(FormalParameter2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFormalParameter_3002Text(View view) {
		IParser parser = EcnoParserProvider
				.getParser(EcnoElementTypes.FormalParameter_3002, view
						.getElement() != null ? view.getElement() : view,
						EcnoVisualIDRegistry
								.getType(FormalParameterEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getString2EventTypeExtensionMap_4006Text(View view) {
		IParser parser = EcnoParserProvider
				.getParser(
						EcnoElementTypes.String2EventTypeExtensionMap_4006,
						view.getElement() != null ? view.getElement() : view,
						EcnoVisualIDRegistry
								.getType(String2EventTypeExtensionMapKeyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EcnoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PackageEditPart.MODEL_ID.equals(EcnoVisualIDRegistry
				.getModelID(view));
	}

}
