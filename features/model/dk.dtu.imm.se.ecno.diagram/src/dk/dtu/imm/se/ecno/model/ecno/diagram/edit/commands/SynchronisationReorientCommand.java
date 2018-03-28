package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies.EcnoBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SynchronisationReorientCommand extends EditElementCommand {

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
	public SynchronisationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Synchronisation) {
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
		if (!(oldEnd instanceof Reference && newEnd instanceof Reference)) {
			return false;
		}
		CoordinationSet target = getLink().getCoordinationSet();
		return EcnoBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistSynchronisation_4002(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CoordinationSet && newEnd instanceof CoordinationSet)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Reference)) {
			return false;
		}
		Reference source = (Reference) getLink().eContainer();
		return EcnoBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistSynchronisation_4002(getLink(), source, getNewTarget());
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
		getOldSource().getSynchronisations().remove(getLink());
		getNewSource().getSynchronisations().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setCoordinationSet(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Synchronisation getLink() {
		return (Synchronisation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Reference getOldSource() {
		return (Reference) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Reference getNewSource() {
		return (Reference) newEnd;
	}

	/**
	 * @generated
	 */
	protected CoordinationSet getOldTarget() {
		return (CoordinationSet) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CoordinationSet getNewTarget() {
		return (CoordinationSet) newEnd;
	}
}
