package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies.CompartmentEditPolicy;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies.EventTypeParametersCanonicalEditPolicy;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.policies.EventTypeParametersItemSemanticEditPolicy;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.Messages;

/**
 * @generated
 */
public class EventTypeParametersEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public EventTypeParametersEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.EventTypeParametersEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigureGen() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated NOT
	 * @author eki
	 */
	public IFigure createFigure() {
		IFigure result = createFigureGen();
		if (result != null && result instanceof ResizableCompartmentFigure) {
			FlowLayout layout = new FlowLayout();
			layout.setMajorSpacing(getMapMode().DPtoLP(0));
			layout.setMinorSpacing(getMapMode().DPtoLP(0));
			layout.setHorizontal(false);
			((ResizableCompartmentFigure) result).getContentPane()
					.setLayoutManager(layout);
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPoliciesGen() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EventTypeParametersItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EventTypeParametersCanonicalEditPolicy());
	}

	/**
	 * @generated NOT (installed Role for reordering parameters using a policy from the GMF Recipes together
	 *                 with an own fix of the XYLayoutEditPolicy)
	 * @author eki
	 */
	protected void createDefaultEditPolicies() {
		createDefaultEditPoliciesGen();
		// eki: install the CompartmentEditPolicy
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(
				EcnoPackage.Literals.EVENT_TYPE__PARAMETERS));
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
