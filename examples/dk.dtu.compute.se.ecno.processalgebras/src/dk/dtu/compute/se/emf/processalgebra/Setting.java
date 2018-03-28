/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Setting#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Setting#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getSetting()
 * @model
 * @generated
 */
public interface Setting extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(ProcessDefinitions)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getSetting_Definitions()
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getSetting
	 * @model opposite="setting" containment="true" required="true"
	 * @generated
	 */
	ProcessDefinitions getDefinitions();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.Setting#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(ProcessDefinitions value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getSetting_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessInstance> getInstances();

} // Setting
