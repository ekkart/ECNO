/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getSynchronisations <em>Synchronisations</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getCoordinationSet()
 * @model superTypes="dk.dtu.imm.se.ecno.model.ecno.ICoordinationSet"
 * @generated
 */
public interface CoordinationSet extends EObject, ICoordinationSet {
	/**
	 * Returns the value of the '<em><b>Synchronisations</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getCoordinationSet <em>Coordination Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronisations</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getCoordinationSet_Synchronisations()
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getCoordinationSet
	 * @model opposite="coordinationSet"
	 * @generated
	 */
	EList<Synchronisation> getSynchronisations();

	/**
	 * Returns the value of the '<em><b>Trigger Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Event</em>' reference.
	 * @see #setTriggerEvent(EventType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getCoordinationSet_TriggerEvent()
	 * @model
	 * @generated
	 */
	EventType getTriggerEvent();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTriggerEvent <em>Trigger Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Event</em>' reference.
	 * @see #getTriggerEvent()
	 * @generated
	 */
	void setTriggerEvent(EventType value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getCoordinationSet_Trigger()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getCoordinationSet_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // CoordinationSet
