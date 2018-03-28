/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getExpression <em>Expression</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getNamedParameter()
 * @model
 * @generated
 */
public interface NamedParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(JavaExpression)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getNamedParameter_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaExpression getExpression();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(JavaExpression value);

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
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getNamedParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getNamedParameter_Optional()
	 * @model required="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // NamedParameter
