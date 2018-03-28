package PetriNets.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import PetriNets.Place;
import PetriNets.diagram.edit.parts.PlaceEditPart;

/**
 * @generated
 */
public class PlaceItemSemanticEditPolicy extends
		PetriNets.diagram.edit.policies.PetriNetBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PlaceItemSemanticEditPolicy() {
		super(PetriNets.diagram.providers.PetriNetElementTypes.Place_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PetriNets.diagram.providers.PetriNetElementTypes.Token_3001 == req
				.getElementType()) {
			return getGEFWrapper(new PetriNets.diagram.edit.commands.TokenCreateCommand(
					req));
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
			if (PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(incomingLink) == PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(outgoingLink) == PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
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
			switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(node)) {
			case PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID:
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
		if (PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001 == req
				.getElementType()) {
			return getGEFWrapper(new PetriNets.diagram.edit.commands.ArcCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PetriNets.diagram.providers.PetriNetElementTypes.Arc_4001 == req
				.getElementType()) {
			return getGEFWrapper(new PetriNets.diagram.edit.commands.ArcCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getGEFWrapper(new PetriNets.diagram.edit.commands.ArcReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Overridden method to make sure that positions for automatically
	 * generated token are updated before the Command is created. there
	 * are nicer ways of doing this; but for now this does the job.
	 * 
	 * @author ekki@dtu.dk
	 * @generated NOT
	 */
	@Override
	public Command getCommand(Request request) {
		if (request instanceof CreateViewRequest) {
			CreateViewRequest req = (CreateViewRequest) request;
			if (req.getLocation().x < 0 && req.getLocation().y < 0) {
				// If the request has no position, calculate a reasonable
				// position (if more than one token is on the place, this
				// is by random now.
				// TODO this could be more advanced by, for example, considering
				//      the number and the position of the other tokens. 
				try {
					Object model = this.getHost().getModel();
					if (model instanceof Node) {
						Node node = (Node) model;

						Place place = (Place) node.getElement();
						int m = place.getToken().size() - 1;

						Bounds bounds = (Bounds) (node).getLayoutConstraint();
						float px = bounds.getX();
						float py = bounds.getY();
						float prw = bounds.getWidth();
						float prh = bounds.getHeight();

						if (prw < 0) {
							prw = 20;
						} else {
							prw = prw / 2;
						}

						if (prh < 0) {
							prh = 20;
						} else {
							prh = prh / 2;
						}

						int x = (int) ((px + prw) - 7.5);
						int y = (int) ((py + prh) - 7.5);
						if (m != 0) {
							x = (int) (x + prw * (Math.random() - 0.5));
							y = (int) (y + prh * (Math.random() - 0.5));
						}

						Point point = new Point(x, y);

						// translate the position to the absolute positions which
						// are needed in the command.
						IFigure figure = ((PlaceEditPart) getHost())
								.getFigure();
						figure.translateToAbsolute(point);

						req.setLocation(point);
					}
				} catch (Exception e) {
					// TODO this is a brute force way of evading any
					//      null pointer exceptions or type cast errors;
					//      if this happens, no location will be set for
					//      the new token.
				}
				return super.getCommand(request);
			}

		}

		return super.getCommand(request);
	}

}
