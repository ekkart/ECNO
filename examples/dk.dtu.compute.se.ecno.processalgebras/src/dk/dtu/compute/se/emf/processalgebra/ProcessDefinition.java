/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinition()
 * @model
 * @generated
 */
public interface ProcessDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(dk.dtu.compute.se.emf.processalgebra.Process)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinition_Process()
	 * @model containment="true" required="true"
	 * @generated
	 */
	dk.dtu.compute.se.emf.processalgebra.Process getProcess();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(dk.dtu.compute.se.emf.processalgebra.Process value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(ProcessDefinitions)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinition_Owner()
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getDefinitions
	 * @model opposite="definitions" transient="false"
	 * @generated
	 */
	ProcessDefinitions getOwner();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ProcessDefinitions value);

} // ProcessDefinition
