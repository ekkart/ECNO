/**
 */
package dk.dtu.compute.se.emf.processalgebra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessName#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessName()
 * @model
 * @generated
 */
public interface ProcessName extends dk.dtu.compute.se.emf.processalgebra.Process {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ProcessDefinition)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessName_Definition()
	 * @model required="true"
	 * @generated
	 */
	ProcessDefinition getDefinition();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ProcessName#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ProcessDefinition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getDefinition().getProcess().createInstance();'"
	 * @generated
	 */
	ProcessInstance createInstance();

} // ProcessName
