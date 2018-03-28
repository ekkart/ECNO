/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import dk.dtu.imm.se.ecno.core.INamespace;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Package#getElementTypes <em>Element Types</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Package#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Package#getEventTypes <em>Event Types</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Package#getUses <em>Uses</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Package#getUri <em>Uri</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Package#getEventTypeExtensions <em>Event Type Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getPackage()
 * @model superTypes="dk.dtu.imm.se.ecno.model.ecno.INamespace"
 * @generated
 */
public interface Package extends EObject, INamespace {
	/**
	 * Returns the value of the '<em><b>Element Types</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.ElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Types</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getPackage_ElementTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementType> getElementTypes();

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(EPackage)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getPackage_EPackage()
	 * @model required="true"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Event Types</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Types</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getPackage_EventTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventType> getEventTypes();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getPackage_Uses()
	 * @model
	 * @generated
	 */
	EList<Package> getUses();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getPackage_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Event Type Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type Extensions</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getPackage_EventTypeExtensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventTypeExtension> getEventTypeExtensions();

} // Package
