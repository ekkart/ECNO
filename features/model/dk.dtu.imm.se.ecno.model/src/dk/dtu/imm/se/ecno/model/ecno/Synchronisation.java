/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import dk.dtu.imm.se.ecno.core.ISynchronisation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getEventType <em>Event Type</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getType <em>Type</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getReference <em>Reference</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getCoordinationSet <em>Coordination Set</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getEventName <em>Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getSynchronisation()
 * @model superTypes="dk.dtu.imm.se.ecno.model.ecno.ISynchronisation"
 * @generated
 */
public interface Synchronisation extends EObject, ISynchronisation {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' reference.
	 * @see #setEventType(EventType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getSynchronisation_EventType()
	 * @model required="true"
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getEventType <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.dtu.imm.se.ecno.model.ecno.SynchronisationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.SynchronisationType
	 * @see #setType(SynchronisationType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getSynchronisation_Type()
	 * @model
	 * @generated
	 */
	SynchronisationType getType();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.SynchronisationType
	 * @see #getType()
	 * @generated
	 */
	void setType(SynchronisationType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getSynchronisations <em>Synchronisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' container reference.
	 * @see #setReference(Reference)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getSynchronisation_Reference()
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getSynchronisations
	 * @model opposite="synchronisations" required="true" transient="false"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getReference <em>Reference</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' container reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Coordination Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getSynchronisations <em>Synchronisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Set</em>' reference.
	 * @see #setCoordinationSet(CoordinationSet)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getSynchronisation_CoordinationSet()
	 * @see dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getSynchronisations
	 * @model opposite="synchronisations" required="true"
	 * @generated
	 */
	CoordinationSet getCoordinationSet();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getCoordinationSet <em>Coordination Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Set</em>' reference.
	 * @see #getCoordinationSet()
	 * @generated
	 */
	void setCoordinationSet(CoordinationSet value);

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getSynchronisation_EventName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getEventName();

} // Synchronisation
