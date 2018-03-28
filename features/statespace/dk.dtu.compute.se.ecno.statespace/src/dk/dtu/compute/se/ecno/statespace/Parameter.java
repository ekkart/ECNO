/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Parameter#isCollection <em>Collection</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
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
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see #setCollection(boolean)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getParameter_Collection()
	 * @model required="true"
	 * @generated
	 */
	boolean isCollection();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Parameter#isCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see #isCollection()
	 * @generated
	 */
	void setCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getParameter_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Parameter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Parameter
