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
 * A representation of the model object '<em><b>Java Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getJavaExpression()
 * @model
 * @generated
 */
public interface JavaExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getJavaExpression_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // JavaExpression
