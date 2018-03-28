package dk.dtu.imm.se.ecno.model.ecno.diagram.part;

import java.util.ArrayList;
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

import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;

/**
 * @generated
 */
public class EcnoPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEcno1Group());
	}

	/**
	 * Creates "ecno" palette tool group
	 * @generated
	 */
	private PaletteContainer createEcno1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Ecno1Group_title);
		paletteContainer.setId("createEcno1Group"); //$NON-NLS-1$
		paletteContainer.add(createElementType1CreationTool());
		paletteContainer.add(createEventType2CreationTool());
		paletteContainer.add(createEventTypeExtension3CreationTool());
		paletteContainer.add(createCoordinationSet4CreationTool());
		paletteContainer.add(createSynchronisation5CreationTool());
		paletteContainer.add(createReference6CreationTool());
		paletteContainer.add(createParameter7CreationTool());
		paletteContainer.add(createInheritance8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementType1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ElementType1CreationTool_title,
				Messages.ElementType1CreationTool_desc,
				Collections.singletonList(EcnoElementTypes.ElementType_2002));
		entry.setId("createElementType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoElementTypes
				.getImageDescriptor(EcnoElementTypes.ElementType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventType2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EventType2CreationTool_title,
				Messages.EventType2CreationTool_desc,
				Collections.singletonList(EcnoElementTypes.EventType_2001));
		entry.setId("createEventType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoElementTypes
				.getImageDescriptor(EcnoElementTypes.EventType_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventTypeExtension3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EventTypeExtension3CreationTool_title,
				Messages.EventTypeExtension3CreationTool_desc,
				Collections
						.singletonList(EcnoElementTypes.EventTypeExtension_2003));
		entry.setId("createEventTypeExtension3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoElementTypes
				.getImageDescriptor(EcnoElementTypes.EventTypeExtension_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoordinationSet4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CoordinationSet4CreationTool_title,
				Messages.CoordinationSet4CreationTool_desc,
				Collections
						.singletonList(EcnoElementTypes.CoordinationSet_3001));
		entry.setId("createCoordinationSet4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoElementTypes
				.getImageDescriptor(EcnoElementTypes.CoordinationSet_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSynchronisation5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Synchronisation5CreationTool_title,
				Messages.Synchronisation5CreationTool_desc,
				Collections
						.singletonList(EcnoElementTypes.Synchronisation_4002));
		entry.setId("createSynchronisation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoElementTypes
				.getImageDescriptor(EcnoElementTypes.Synchronisation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReference6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EcnoElementTypes.Reference_4001);
		types.add(EcnoElementTypes.String2EventTypeExtensionMap_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Reference6CreationTool_title,
				Messages.Reference6CreationTool_desc, types);
		entry.setId("createReference6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoElementTypes
				.getImageDescriptor(EcnoElementTypes.Reference_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EcnoElementTypes.FormalParameter_3002);
		types.add(EcnoElementTypes.FormalParameter_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parameter7CreationTool_title,
				Messages.Parameter7CreationTool_desc, types);
		entry.setId("createParameter7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoElementTypes
				.getImageDescriptor(EcnoElementTypes.FormalParameter_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInheritance8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EcnoElementTypes.ElementTypeSuper_4003);
		types.add(EcnoElementTypes.EventTypeSuper_4004);
		types.add(EcnoElementTypes.EventTypeExtensionBase_4005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Inheritance8CreationTool_title,
				Messages.Inheritance8CreationTool_desc, types);
		entry.setId("createInheritance8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EcnoDiagramEditorPlugin
				.findImageDescriptor("/dk.dtu.imm.se.ecno.model.edit/icons/full/obj16/Inheritance.gif")); //$NON-NLS-1$
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
