/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import org.eclipse.emf.common.util.EList;

import dk.dtu.imm.se.ecno.core.IEventType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventType#isGui <em>Gui</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventType()
 * @model superTypes="dk.dtu.imm.se.ecno.model.ecno.IEventType dk.dtu.imm.se.ecno.model.ecno.ImportedType"
 * @generated
 */
public interface EventType extends IEventType, ImportedType {
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
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventType_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameter> getParameters();

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
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui</em>' attribute.
	 * @see #setGui(boolean)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventType_Gui()
	 * @model
	 * @generated
	 */
	boolean isGui();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.EventType#isGui <em>Gui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui</em>' attribute.
	 * @see #isGui()
	 * @generated
	 */
	void setGui(boolean value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(EventType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getEventType_Super()
	 * @model
	 * @generated
	 */
	EventType getSuper();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(EventType value);

} // EventType
