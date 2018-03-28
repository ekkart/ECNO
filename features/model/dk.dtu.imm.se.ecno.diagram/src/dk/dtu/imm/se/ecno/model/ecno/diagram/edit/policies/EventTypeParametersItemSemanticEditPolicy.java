package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands.FormalParameterCreateCommand;
import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;

/**
 * @generated
 */
public class EventTypeParametersItemSemanticEditPolicy extends
		EcnoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventTypeParametersItemSemanticEditPolicy() {
		super(EcnoElementTypes.EventType_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EcnoElementTypes.FormalParameter_3002 == req.getElementType()) {
			return getGEFWrapper(new FormalParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
