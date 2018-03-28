/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.examples.workers;

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
 *   <li>{@link dk.dtu.imm.se.ecno.examples.workers.Setting#getCar <em>Car</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.examples.workers.Setting#getWorker <em>Worker</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.examples.workers.Setting#getJob <em>Job</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.examples.workers.WorkersPackage#getSetting()
 * @model
 * @generated
 */
public interface Setting extends EObject {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.examples.workers.Job}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.examples.workers.WorkersPackage#getSetting_Job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJob();

	/**
	 * Returns the value of the '<em><b>Worker</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.examples.workers.Worker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.examples.workers.WorkersPackage#getSetting_Worker()
	 * @model containment="true"
	 * @generated
	 */
	EList<Worker> getWorker();

	/**
	 * Returns the value of the '<em><b>Car</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.examples.workers.Car}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.examples.workers.WorkersPackage#getSetting_Car()
	 * @model containment="true"
	 * @generated
	 */
	EList<Car> getCar();

} // Setting
