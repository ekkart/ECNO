/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getExpression <em>Expression</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getType <em>Type</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUse()
 * @model
 * @generated
 */
public interface EventUse extends EObject {
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
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUse_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaExpression> getExpression();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUse_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUse_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedParameter> getParameter();

} // EventUse
