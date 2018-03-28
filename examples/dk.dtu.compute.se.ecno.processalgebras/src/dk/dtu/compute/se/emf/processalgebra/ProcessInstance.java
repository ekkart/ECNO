/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getChild <em>Child</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessInstance()
 * @model
 * @generated
 */
public interface ProcessInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessInstance_Child()
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ProcessInstance> getChild();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ProcessInstance)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessInstance_Parent()
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getChild
	 * @model opposite="child" transient="false"
	 * @generated
	 */
	ProcessInstance getParent();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ProcessInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (ProcessInstance subInstance: this.getChild()) {\r\n\tsubInstance.dispose();\r\n}'"
	 * @generated
	 */
	void dispose();

} // ProcessInstance
