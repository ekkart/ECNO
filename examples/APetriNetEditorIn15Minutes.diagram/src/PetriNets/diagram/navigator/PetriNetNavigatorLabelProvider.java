package PetriNets.diagram.navigator;

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

/**
 * @generated
 */
public class PetriNetNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PetriNets.diagram.part.PetriNetDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		PetriNets.diagram.part.PetriNetDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PetriNets.diagram.navigator.PetriNetNavigatorItem
				&& !isOwnView(((PetriNets.diagram.navigator.PetriNetNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof PetriNets.diagram.navigator.PetriNetNavigatorGroup) {
			PetriNets.diagram.navigator.PetriNetNavigatorGroup group = (PetriNets.diagram.navigator.PetriNetNavigatorGroup) element;
			return PetriNets.diagram.part.PetriNetDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PetriNets.diagram.navigator.PetriNetNavigatorItem) {
			PetriNets.diagram.navigator.PetriNetNavigatorItem navigatorItem = (PetriNets.diagram.navigator.PetriNetNavigatorItem) element;
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
		switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?APetriNetEditorIn15Minutes?Place", PetriNets.diagram.providers.PetriNetElementTypes.Place_2002); //$NON-NLS-1$
		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?APetriNetEditorIn15Minutes?Arc", PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001); //$NON-NLS-1$
		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?APetriNetEditorIn15Minutes?Transition", PetriNets.diagram.providers.PetriNetElementTypes.Transition_2001); //$NON-NLS-1$
		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?APetriNetEditorIn15Minutes?PetriNet", PetriNets.diagram.providers.PetriNetElementTypes.PetriNet_1000); //$NON-NLS-1$
		case PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?APetriNetEditorIn15Minutes?Token", PetriNets.diagram.providers.PetriNetElementTypes.Token_3001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PetriNets.diagram.part.PetriNetDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& PetriNets.diagram.providers.PetriNetElementTypes
						.isKnownElementType(elementType)) {
			image = PetriNets.diagram.providers.PetriNetElementTypes
					.getImage(elementType);
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
		if (element instanceof PetriNets.diagram.navigator.PetriNetNavigatorGroup) {
			PetriNets.diagram.navigator.PetriNetNavigatorGroup group = (PetriNets.diagram.navigator.PetriNetNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PetriNets.diagram.navigator.PetriNetNavigatorItem) {
			PetriNets.diagram.navigator.PetriNetNavigatorItem navigatorItem = (PetriNets.diagram.navigator.PetriNetNavigatorItem) element;
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
		switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2002Text(view);
		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001Text(view);
		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2001Text(view);
		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000Text(view);
		case PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID:
			return getToken_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPlace_2002Text(View view) {
		IParser parser = PetriNets.diagram.providers.PetriNetParserProvider
				.getParser(
						PetriNets.diagram.providers.PetriNetElementTypes.Place_2002,
						view.getElement() != null ? view.getElement() : view,
						PetriNets.diagram.part.PetriNetVisualIDRegistry
								.getType(PetriNets.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PetriNets.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPetriNet_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArc_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransition_2001Text(View view) {
		IParser parser = PetriNets.diagram.providers.PetriNetParserProvider
				.getParser(
						PetriNets.diagram.providers.PetriNetElementTypes.Transition_2001,
						view.getElement() != null ? view.getElement() : view,
						PetriNets.diagram.part.PetriNetVisualIDRegistry
								.getType(PetriNets.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PetriNets.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getToken_3001Text(View view) {
		return ""; //$NON-NLS-1$
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
		return PetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(PetriNets.diagram.part.PetriNetVisualIDRegistry
						.getModelID(view));
	}

}
