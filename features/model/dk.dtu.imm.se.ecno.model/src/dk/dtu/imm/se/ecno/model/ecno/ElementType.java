/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import dk.dtu.imm.se.ecno.core.IElementType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getEClass <em>EClass</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getCoordinationSets <em>Coordination Sets</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getReferences <em>References</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#isGui <em>Gui</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getSuper <em>Super</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getParallelTriggerEvents <em>Parallel Trigger Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType()
 * @model superTypes="dk.dtu.imm.se.ecno.model.ecno.IElementType dk.dtu.imm.se.ecno.model.ecno.ImportedType"
 * @generated
 */
public interface ElementType extends IElementType, ImportedType {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType_EClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Coordination Sets</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Sets</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType_CoordinationSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinationSet> getCoordinationSets();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.Reference}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see #isSetReferences()
	 * @see #unsetReferences()
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType_References()
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getSource
	 * @model opposite="source" containment="true" unsettable="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Unsets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getReferences <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferences()
	 * @see #getReferences()
	 * @generated
	 */
	void unsetReferences();

	/**
	 * Returns whether the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getReferences <em>References</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>References</em>' containment reference list is set.
	 * @see #unsetReferences()
	 * @see #getReferences()
	 * @generated
	 */
	boolean isSetReferences();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

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
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType_Gui()
	 * @model
	 * @generated
	 */
	boolean isGui();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#isGui <em>Gui</em>}' attribute.
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
	 * @see #setSuper(ElementType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType_Super()
	 * @model
	 * @generated
	 */
	ElementType getSuper();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(ElementType value);

	/**
	 * Returns the value of the '<em><b>Parallel Trigger Events</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Trigger Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Trigger Events</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getElementType_ParallelTriggerEvents()
	 * @model
	 * @generated
	 */
	EList<EventType> getParallelTriggerEvents();

} // ElementType
