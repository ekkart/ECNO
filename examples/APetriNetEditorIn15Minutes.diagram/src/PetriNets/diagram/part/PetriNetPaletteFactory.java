package PetriNets.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class PetriNetPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPetriNets1Group());
	}

	/**
	 * Creates "PetriNets" palette tool group
	 * @generated
	 */
	private PaletteContainer createPetriNets1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				PetriNets.diagram.part.Messages.PetriNets1Group_title);
		paletteContainer.setId("createPetriNets1Group"); //$NON-NLS-1$
		paletteContainer.add(createArc1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		paletteContainer.add(createPlace3CreationTool());
		paletteContainer.add(createToken4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArc1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				PetriNets.diagram.part.Messages.Arc1CreationTool_title,
				PetriNets.diagram.part.Messages.Arc1CreationTool_desc,
				Collections
						.singletonList(PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001));
		entry.setId("createArc1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetriNets.diagram.providers.PetriNetElementTypes
				.getImageDescriptor(PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				PetriNets.diagram.part.Messages.Transition2CreationTool_title,
				PetriNets.diagram.part.Messages.Transition2CreationTool_desc,
				Collections
						.singletonList(PetriNets.diagram.providers.PetriNetElementTypes.Transition_2001));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetriNets.diagram.providers.PetriNetElementTypes
				.getImageDescriptor(PetriNets.diagram.providers.PetriNetElementTypes.Transition_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlace3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				PetriNets.diagram.part.Messages.Place3CreationTool_title,
				PetriNets.diagram.part.Messages.Place3CreationTool_desc,
				Collections
						.singletonList(PetriNets.diagram.providers.PetriNetElementTypes.Place_2002));
		entry.setId("createPlace3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetriNets.diagram.providers.PetriNetElementTypes
				.getImageDescriptor(PetriNets.diagram.providers.PetriNetElementTypes.Place_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createToken4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				PetriNets.diagram.part.Messages.Token4CreationTool_title,
				PetriNets.diagram.part.Messages.Token4CreationTool_desc,
				Collections
						.singletonList(PetriNets.diagram.providers.PetriNetElementTypes.Token_3001));
		entry.setId("createToken4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetriNets.diagram.providers.PetriNetElementTypes
				.getImageDescriptor(PetriNets.diagram.providers.PetriNetElementTypes.Token_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
