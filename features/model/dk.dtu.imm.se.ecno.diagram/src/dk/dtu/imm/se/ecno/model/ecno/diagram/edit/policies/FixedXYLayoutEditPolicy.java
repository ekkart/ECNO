package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;

/**
 * This class fixes a problem with a NullPointerException in the standard XYLayoutEditPolicy
 * in that it returns a trivial rectangle for the getCurrentConstraintFor(GraphicalEditPart child),
 * in case it is null for the super class.
 * 
 * @generated NOT
 * @author eki
 *
 */
public class FixedXYLayoutEditPolicy extends XYLayoutEditPolicy {
	
	@Override
	protected Rectangle getCurrentConstraintFor(GraphicalEditPart child) {
		Rectangle rect = super.getCurrentConstraintFor(child);
		if (rect == null) {
			rect = new Rectangle();
		}
		return rect;
	}

}
