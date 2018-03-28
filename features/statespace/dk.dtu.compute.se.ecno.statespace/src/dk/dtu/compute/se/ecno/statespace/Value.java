/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Value#getStateValues <em>State Values</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Value#getIntValues <em>Int Values</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Value#getStringValues <em>String Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>State Values</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.StateObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Values</em>' reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getValue_StateValues()
	 * @model
	 * @generated
	 */
	EList<StateObject> getStateValues();

	/**
	 * Returns the value of the '<em><b>Int Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Values</em>' attribute list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getValue_IntValues()
	 * @model
	 * @generated
	 */
	EList<Integer> getIntValues();

	/**
	 * Returns the value of the '<em><b>String Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Values</em>' attribute list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getValue_StringValues()
	 * @model
	 * @generated
	 */
	EList<String> getStringValues();

} // Value
