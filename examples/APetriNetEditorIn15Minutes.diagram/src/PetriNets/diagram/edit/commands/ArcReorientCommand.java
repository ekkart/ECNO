package PetriNets.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ArcReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ArcReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PetriNets.Arc) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof PetriNets.Node && newEnd instanceof PetriNets.Node)) {
			return false;
		}
		PetriNets.Node target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof PetriNets.PetriNet)) {
			return false;
		}
		PetriNets.PetriNet container = (PetriNets.PetriNet) getLink()
				.eContainer();
		return PetriNets.diagram.edit.policies.PetriNetBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistArc_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PetriNets.Node && newEnd instanceof PetriNets.Node)) {
			return false;
		}
		PetriNets.Node source = getLink().getSource();
		if (!(getLink().eContainer() instanceof PetriNets.PetriNet)) {
			return false;
		}
		PetriNets.PetriNet container = (PetriNets.PetriNet) getLink()
				.eContainer();
		return PetriNets.diagram.edit.policies.PetriNetBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistArc_4001(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected PetriNets.Arc getLink() {
		return (PetriNets.Arc) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected PetriNets.Node getOldSource() {
		return (PetriNets.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PetriNets.Node getNewSource() {
		return (PetriNets.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected PetriNets.Node getOldTarget() {
		return (PetriNets.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PetriNets.Node getNewTarget() {
		return (PetriNets.Node) newEnd;
	}
}
