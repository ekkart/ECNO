package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands;

import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies.EcnoBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class String2EventTypeExtensionMapReorientCommand extends
		EditElementCommand {

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
	public String2EventTypeExtensionMapReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Map.Entry) {
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
		if (!(oldEnd instanceof EventTypeExtension && newEnd instanceof EventTypeExtension)) {
			return false;
		}
		EventTypeExtension target = ((EventTypeExtension) ((EObject) getLink())
				.eGet(EcnoPackage.eINSTANCE
						.getString2EventTypeExtensionMap_Value()));
		return EcnoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistString2EventTypeExtensionMap_4006(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof EventTypeExtension && newEnd instanceof EventTypeExtension)) {
			return false;
		}
		if (!(((EObject) getLink()).eContainer() instanceof EventTypeExtension)) {
			return false;
		}
		EventTypeExtension source = (EventTypeExtension) ((EObject) getLink())
				.eContainer();
		return EcnoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistString2EventTypeExtensionMap_4006(getLink(), source,
						getNewTarget());
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
		getOldSource().getSuper().remove(getLink());
		getNewSource().getSuper().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		((EObject) getLink()).eSet(
				EcnoPackage.eINSTANCE.getString2EventTypeExtensionMap_Value(),
				getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Map.Entry getLink() {
		return (Map.Entry) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected EventTypeExtension getOldSource() {
		return (EventTypeExtension) oldEnd;
	}

	/**
	 * @generated
	 */
	protected EventTypeExtension getNewSource() {
		return (EventTypeExtension) newEnd;
	}

	/**
	 * @generated
	 */
	protected EventTypeExtension getOldTarget() {
		return (EventTypeExtension) oldEnd;
	}

	/**
	 * @generated
	 */
	protected EventTypeExtension getNewTarget() {
		return (EventTypeExtension) newEnd;
	}
}
