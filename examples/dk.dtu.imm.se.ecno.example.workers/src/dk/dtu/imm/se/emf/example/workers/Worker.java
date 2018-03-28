/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.emf.example.workers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.Worker#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.Worker#getCar <em>Car</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.Worker#getAssigned <em>Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getWorker()
 * @model
 * @generated
 */
public interface Worker extends EObject {
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
	 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getWorker_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.emf.example.workers.Worker#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Car</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.emf.example.workers.Car#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' reference.
	 * @see #setCar(Car)
	 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getWorker_Car()
	 * @see dk.dtu.imm.se.emf.example.workers.Car#getPassenger
	 * @model opposite="passenger" resolveProxies="false"
	 * @generated
	 */
	Car getCar();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.emf.example.workers.Worker#getCar <em>Car</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car</em>' reference.
	 * @see #getCar()
	 * @generated
	 */
	void setCar(Car value);

	/**
	 * Returns the value of the '<em><b>Assigned</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.emf.example.workers.Job}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.emf.example.workers.Job#getNeeded <em>Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned</em>' reference list.
	 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getWorker_Assigned()
	 * @see dk.dtu.imm.se.emf.example.workers.Job#getNeeded
	 * @model opposite="needed" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<Job> getAssigned();

} // Worker
