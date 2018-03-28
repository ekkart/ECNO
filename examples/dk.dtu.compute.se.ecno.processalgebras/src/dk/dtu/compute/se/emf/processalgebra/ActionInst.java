/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.emf.processalgebra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ActionInst#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getActionInst()
 * @model
 * @generated
 */
public interface ActionInst extends ProcessInstance {

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.Action#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getActionInst_Action()
	 * @see dk.dtu.compute.se.emf.processalgebra.Action#getInstances
	 * @model opposite="instances" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ActionInst#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setAction(null);\r\nsuper.dispose();'"
	 * @generated
	 */
	void dispose();
} // ActionInst
