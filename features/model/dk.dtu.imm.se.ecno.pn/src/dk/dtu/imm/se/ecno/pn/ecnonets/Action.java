/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.Action#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends StructuredLabel {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(JavaStatement)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getAction_Structure()
	 * @model containment="true"
	 * @generated
	 */
	JavaStatement getStructure();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Action#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(JavaStatement value);

} // Action
