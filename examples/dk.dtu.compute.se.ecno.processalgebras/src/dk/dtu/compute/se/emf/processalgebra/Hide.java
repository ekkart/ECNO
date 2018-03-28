/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Hide#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Hide#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getHide()
 * @model
 * @generated
 */
public interface Hide extends dk.dtu.compute.se.emf.processalgebra.Process {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.ActionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getHide_Actions()
	 * @model
	 * @generated
	 */
	EList<ActionDef> getActions();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(dk.dtu.compute.se.emf.processalgebra.Process)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getHide_Process()
	 * @model containment="true" required="true"
	 * @generated
	 */
	dk.dtu.compute.se.emf.processalgebra.Process getProcess();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.Hide#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(dk.dtu.compute.se.emf.processalgebra.Process value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='dk.dtu.compute.se.emf.processalgebra.HideInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createHideInst();\r\ninstance.getActions().addAll(this.getActions());\r\ninstance.getChild().add(this.getProcess().createInstance());\t\t\t\r\nreturn instance;'"
	 * @generated
	 */
	ProcessInstance createInstance();

} // Hide
