package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;

/**
 * @generated
 */
public class EventTypeExtensionBaseItemSemanticEditPolicy extends
		EcnoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventTypeExtensionBaseItemSemanticEditPolicy() {
		super(EcnoElementTypes.EventTypeExtensionBase_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
