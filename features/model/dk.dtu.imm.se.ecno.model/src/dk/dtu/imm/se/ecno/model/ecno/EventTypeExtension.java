/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import dk.dtu.imm.se.ecno.core.IEventTypeExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getBase <em>Base</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventTypeExtension()
 * @model superTypes="dk.dtu.imm.se.ecno.model.ecno.IEventTypeExtension dk.dtu.imm.se.ecno.model.ecno.ImportedType"
 * @generated
 */
public interface EventTypeExtension extends IEventTypeExtension, ImportedType {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(EventType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventTypeExtension_Base()
	 * @model required="true"
	 * @generated
	 */
	EventType getBase();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(EventType value);

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
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventTypeExtension_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventTypeExtension_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Super</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' map.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventTypeExtension_Super()
	 * @model mapType="dk.dtu.imm.se.ecno.model.ecno.String2EventTypeExtensionMap<org.eclipse.emf.ecore.EString, dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension>"
	 * @generated
	 */
	EMap<String, EventTypeExtension> getSuper();

} // EventTypeExtension
