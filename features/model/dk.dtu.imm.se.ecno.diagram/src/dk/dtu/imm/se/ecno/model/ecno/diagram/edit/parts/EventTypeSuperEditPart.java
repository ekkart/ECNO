package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.figures.InheritanceTargetDecoration;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies.EventTypeSuperItemSemanticEditPolicy;

/**
 * @generated
 */
public class EventTypeSuperEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public EventTypeSuperEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EventTypeSuperItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new InheritanceFigure();
	}

	/**
	 * @generated
	 */
	public InheritanceFigure getPrimaryShape() {
		return (InheritanceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InheritanceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public InheritanceFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated NOT // Decoration for Inheritance changed
		 * @author eki
		 */
		private RotatableDecoration createTargetDecoration() {
			return new InheritanceTargetDecoration();
		}

	}

}
