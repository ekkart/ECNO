/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateObject#getUid <em>Uid</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateObject#getFeatures <em>Features</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateObject#getType <em>Type</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateObject#getBehaviourStates <em>Behaviour States</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateObject()
 * @model
 * @generated
 */
public interface StateObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(int)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateObject_Uid()
	 * @model
	 * @generated
	 */
	int getUid();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateObject#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(int value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateObject_Features()
	 * @see dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getObject
	 * @model opposite="object" containment="true"
	 * @generated
	 */
	EList<ObjectFeatureValues> getFeatures();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateObject_Type()
	 * @model
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Behaviour States</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour States</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateObject_BehaviourStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<PTNetState> getBehaviourStates();

} // StateObject
