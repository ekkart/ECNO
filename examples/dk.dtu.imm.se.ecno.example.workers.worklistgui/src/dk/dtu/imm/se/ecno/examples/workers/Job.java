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
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.examples.workers.Job#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.examples.workers.Job#getNeeded <em>Needed</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.examples.workers.WorkersPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Needed</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.examples.workers.Worker}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.ecno.examples.workers.Worker#getAssigned <em>Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.examples.workers.WorkersPackage#getJob_Needed()
	 * @see dk.dtu.imm.se.ecno.examples.workers.Worker#getAssigned
	 * @model opposite="assigned"
	 * @generated
	 */
	EList<Worker> getNeeded();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Job> createJobs(String name);

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
	 * @see dk.dtu.imm.se.ecno.examples.workers.WorkersPackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.examples.workers.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Job
