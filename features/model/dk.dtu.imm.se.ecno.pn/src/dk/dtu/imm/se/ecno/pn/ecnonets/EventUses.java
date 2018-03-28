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
 * A representation of the model object '<em><b>Event Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUses#getEventuse <em>Eventuse</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUses#isDropParent <em>Drop Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUses()
 * @model
 * @generated
 */
public interface EventUses extends EObject {
	/**
	 * Returns the value of the '<em><b>Eventuse</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventuse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventuse</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUses_Eventuse()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventUse> getEventuse();

	/**
	 * Returns the value of the '<em><b>Drop Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drop Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop Parent</em>' attribute.
	 * @see #setDropParent(boolean)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getEventUses_DropParent()
	 * @model
	 * @generated
	 */
	boolean isDropParent();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUses#isDropParent <em>Drop Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop Parent</em>' attribute.
	 * @see #isDropParent()
	 * @generated
	 */
	void setDropParent(boolean value);

} // EventUses
