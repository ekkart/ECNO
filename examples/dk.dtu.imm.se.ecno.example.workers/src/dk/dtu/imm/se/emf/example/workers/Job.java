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
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.Job#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.Job#getNeeded <em>Needed</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
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
	 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.emf.example.workers.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Needed</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.emf.example.workers.Worker}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.emf.example.workers.Worker#getAssigned <em>Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed</em>' reference list.
	 * @see dk.dtu.imm.se.emf.example.workers.WorkersPackage#getJob_Needed()
	 * @see dk.dtu.imm.se.emf.example.workers.Worker#getAssigned
	 * @model opposite="assigned" resolveProxies="false"
	 * @generated
	 */
	EList<Worker> getNeeded();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Job job = WorkersFactoryImpl.eINSTANCE.createJob();\r\n\t\t\r\n// ekki: create a clone of this job\r\njob.setName(this.getName());\r\njava.util.List<Worker> list = job.getNeeded();\r\nfor (Worker worker : this.getNeeded()) {\r\n\tlist.add(worker);\r\n}\r\n\t\t\r\n// ekki: return the cloned job as a singleton list\r\nEList<Job> jobs = new org.eclipse.emf.common.util.BasicEList<Job>();\r\njobs.add(job);\r\nreturn jobs;'"
	 * @generated
	 */
	EList<Job> createJobs();

} // Job
