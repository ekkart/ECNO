/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;

import org.pnml.tools.epnk.pnmlcoremodel.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getAttributeDeclarations()
 * @model
 * @generated
 */
public interface AttributeDeclarations extends Label {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getAttributeDeclarations_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // AttributeDeclarations
