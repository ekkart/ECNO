package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands.CoordinationSetCreateCommand;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands.ElementTypeSuperCreateCommand;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands.ElementTypeSuperReorientCommand;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands.ReferenceCreateCommand;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.commands.ReferenceReorientCommand;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry;
import dk.dtu.imm.se.ecno.model.ecno.diagram.providers.EcnoElementTypes;

/**
 * @generated
 */
public class ElementTypeItemSemanticEditPolicy extends
		EcnoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElementTypeItemSemanticEditPolicy() {
		super(EcnoElementTypes.ElementType_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EcnoElementTypes.CoordinationSet_3001 == req.getElementType()) {
			return getGEFWrapper(new CoordinationSetCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (EcnoVisualIDRegistry.getVisualID(incomingLink) == ReferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EcnoVisualIDRegistry.getVisualID(incomingLink) == ElementTypeSuperEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (EcnoVisualIDRegistry.getVisualID(outgoingLink) == ReferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EcnoVisualIDRegistry.getVisualID(outgoingLink) == ElementTypeSuperEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (EcnoVisualIDRegistry.getVisualID(node)) {
			case CoordinationSetEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (EcnoVisualIDRegistry.getVisualID(incomingLink) == SynchronisationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EcnoElementTypes.Reference_4001 == req.getElementType()) {
			return getGEFWrapper(new ReferenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EcnoElementTypes.ElementTypeSuper_4003 == req.getElementType()) {
			return getGEFWrapper(new ElementTypeSuperCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EcnoElementTypes.Reference_4001 == req.getElementType()) {
			return getGEFWrapper(new ReferenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EcnoElementTypes.ElementTypeSuper_4003 == req.getElementType()) {
			return getGEFWrapper(new ElementTypeSuperCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ReferenceEditPart.VISUAL_ID:
			return getGEFWrapper(new ReferenceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ElementTypeSuperEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementTypeSuperReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
