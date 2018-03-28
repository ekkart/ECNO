package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;

/**
 * @generated
 */
public class String2EventTypeExtensionMapItemSemanticEditPolicy extends
		EcnoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public String2EventTypeExtensionMapItemSemanticEditPolicy() {
		super(EcnoElementTypes.String2EventTypeExtensionMap_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
