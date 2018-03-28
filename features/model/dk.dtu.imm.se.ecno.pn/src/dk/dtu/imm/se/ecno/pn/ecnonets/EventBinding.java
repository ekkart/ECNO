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
 * A representation of the model object '<em><b>Event Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventBinding()
 * @model
 * @generated
 */
public interface EventBinding extends StructuredLabel {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(EventUses)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventBinding_Structure()
	 * @model containment="true"
	 * @generated
	 */
	EventUses getStructure();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(EventUses value);

} // EventBinding
