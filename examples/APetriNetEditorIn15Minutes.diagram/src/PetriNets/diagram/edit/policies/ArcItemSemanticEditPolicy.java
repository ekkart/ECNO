package PetriNets.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ArcItemSemanticEditPolicy extends
		PetriNets.diagram.edit.policies.PetriNetBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArcItemSemanticEditPolicy() {
		super(PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
