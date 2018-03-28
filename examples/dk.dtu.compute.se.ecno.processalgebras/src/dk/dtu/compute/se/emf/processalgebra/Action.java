/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Action#isBar <em>Bar</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Action#getAction <em>Action</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Action#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends dk.dtu.compute.se.emf.processalgebra.Process {
	/**
	 * Returns the value of the '<em><b>Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar</em>' attribute.
	 * @see #setBar(boolean)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getAction_Bar()
	 * @model required="true"
	 * @generated
	 */
	boolean isBar();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.Action#isBar <em>Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar</em>' attribute.
	 * @see #isBar()
	 * @generated
	 */
	void setBar(boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(ActionDef)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getAction_Action()
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionDef#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	ActionDef getAction();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.Action#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionDef value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.ActionInst}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ActionInst#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getAction_Instances()
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionInst#getAction
	 * @model opposite="action"
	 * @generated
	 */
	EList<ActionInst> getInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ActionInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createActionInst();\r\ninstance.setAction(this);\r\nreturn instance;'"
	 * @generated
	 */
	ProcessInstance createInstance();

} // Action
