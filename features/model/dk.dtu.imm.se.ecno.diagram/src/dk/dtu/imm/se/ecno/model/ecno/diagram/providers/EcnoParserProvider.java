package dk.dtu.imm.se.ecno.model.ecno.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetTriggerEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeNameEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameter2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameterEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceUpperBound2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceUpperBoundEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapKeyEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEventNameTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.parsers.MessageFormatParser;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry;

/**
 * @generated
 */
public class EcnoParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eventTypeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getEventTypeName_5001Parser() {
		if (eventTypeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getEventType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventTypeName_5001Parser = parser;
		}
		return eventTypeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser elementTypeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getElementTypeName_5002Parser() {
		if (elementTypeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getElementType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			elementTypeName_5002Parser = parser;
		}
		return elementTypeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventTypeExtensionName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEventTypeExtensionName_5004Parser() {
		if (eventTypeExtensionName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getEventTypeExtension_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventTypeExtensionName_5004Parser = parser;
		}
		return eventTypeExtensionName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser formalParameter_3002Parser;

	/**
	 * @generated
	 */
	private IParser getFormalParameter_3002Parser() {
		if (formalParameter_3002Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getFormalParameter_Label() };
			EAttribute[] editableFeatures = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			formalParameter_3002Parser = parser;
		}
		return formalParameter_3002Parser;
	}

	/**
	 * @generated
	 */
	private IParser coordinationSetTrigger_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCoordinationSetTrigger_5003Parser() {
		if (coordinationSetTrigger_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getCoordinationSet_Trigger() };
			MessageFormatParser parser = new MessageFormatParser(features);
			coordinationSetTrigger_5003Parser = parser;
		}
		return coordinationSetTrigger_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser formalParameter_3003Parser;

	/**
	 * @generated
	 */
	private IParser getFormalParameter_3003Parser() {
		if (formalParameter_3003Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getFormalParameter_Label() };
			EAttribute[] editableFeatures = new EAttribute[] { EcorePackage.eINSTANCE
					.getENamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			formalParameter_3003Parser = parser;
		}
		return formalParameter_3003Parser;
	}

	/**
	 * @generated
	 */
	private IParser referenceName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getReferenceName_6002Parser() {
		if (referenceName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			referenceName_6002Parser = parser;
		}
		return referenceName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser referenceUpperBound_6003Parser;

	/**
	 * @generated
	 */
	private IParser getReferenceUpperBound_6003Parser() {
		if (referenceUpperBound_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getReference_UpperBound() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0,choice,-1#*|-1<{0}}"); //$NON-NLS-1$
			parser.setEditorPattern("{0,choice,-1#*|-1<{0}}"); //$NON-NLS-1$
			parser.setEditPattern("{0,choice,-1#*|-1<{0}}"); //$NON-NLS-1$
			referenceUpperBound_6003Parser = parser;
		}
		return referenceUpperBound_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser synchronisationEventNameType_6001Parser;

	/**
	 * @generated
	 */
	private IParser getSynchronisationEventNameType_6001Parser() {
		if (synchronisationEventNameType_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EcnoPackage.eINSTANCE.getSynchronisation_EventName(),
					EcnoPackage.eINSTANCE.getSynchronisation_Type() };
			EAttribute[] editableFeatures = new EAttribute[] { EcnoPackage.eINSTANCE
					.getSynchronisation_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}->{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}->{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			synchronisationEventNameType_6001Parser = parser;
		}
		return synchronisationEventNameType_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser string2EventTypeExtensionMapKey_6004Parser;

	/**
	 * @generated
	 */
	private IParser getString2EventTypeExtensionMapKey_6004Parser() {
		if (string2EventTypeExtensionMapKey_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { EcnoPackage.eINSTANCE
					.getString2EventTypeExtensionMap_Key() };
			MessageFormatParser parser = new MessageFormatParser(features);
			string2EventTypeExtensionMapKey_6004Parser = parser;
		}
		return string2EventTypeExtensionMapKey_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EventTypeNameEditPart.VISUAL_ID:
			return getEventTypeName_5001Parser();
		case ElementTypeNameEditPart.VISUAL_ID:
			return getElementTypeName_5002Parser();
		case EventTypeExtensionNameEditPart.VISUAL_ID:
			return getEventTypeExtensionName_5004Parser();
		case FormalParameterEditPart.VISUAL_ID:
			return getFormalParameter_3002Parser();
		case CoordinationSetTriggerEditPart.VISUAL_ID:
			return getCoordinationSetTrigger_5003Parser();
		case FormalParameter2EditPart.VISUAL_ID:
			return getFormalParameter_3003Parser();
		case ReferenceUpperBoundEditPart.VISUAL_ID:
			return getReferenceName_6002Parser();
		case ReferenceUpperBound2EditPart.VISUAL_ID:
			return getReferenceUpperBound_6003Parser();
		case SynchronisationEventNameTypeEditPart.VISUAL_ID:
			return getSynchronisationEventNameType_6001Parser();
		case String2EventTypeExtensionMapKeyEditPart.VISUAL_ID:
			return getString2EventTypeExtensionMapKey_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(EcnoVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EcnoVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EcnoElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
