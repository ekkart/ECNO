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
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.Car#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.Car#getPassenger <em>Passenger</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject {
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
	 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getCar_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.emf.example.workers.Car#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.emf.example.workers.Worker}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.emf.example.workers.Worker#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' reference list.
	 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getCar_Passenger()
	 * @see dk.dtu.imm.se.emf.example.workers.Worker#getCar
	 * @model opposite="car" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<Worker> getPassenger();

} // Car
