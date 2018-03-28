package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands.FormalParameter2CreateCommand;
import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;

/**
 * @generated
 */
public class EventTypeExtensionParametersItemSemanticEditPolicy extends
		EcnoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventTypeExtensionParametersItemSemanticEditPolicy() {
		super(EcnoElementTypes.EventTypeExtension_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EcnoElementTypes.FormalParameter_3003 == req.getElementType()) {
			return getGEFWrapper(new FormalParameter2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
