/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import dk.dtu.imm.se.ecno.core.IReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getEReference <em>EReference</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getSource <em>Source</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getSynchronisations <em>Synchronisations</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getReference()
 * @model superTypes="dk.dtu.imm.se.ecno.model.ecno.IReference"
 * @generated
 */
public interface Reference extends EObject, IReference {
	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EReference)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getReference_EReference()
	 * @model
	 * @generated
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ElementType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getReference_Target()
	 * @model required="true"
	 * @generated
	 */
	ElementType getTarget();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ElementType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(ElementType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getReference_Source()
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#getReferences
	 * @model opposite="references" required="true" transient="false"
	 * @generated
	 */
	ElementType getSource();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ElementType value);

	/**
	 * Returns the value of the '<em><b>Synchronisations</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronisations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronisations</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getReference_Synchronisations()
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getReference
	 * @model opposite="reference" containment="true"
	 * @generated
	 */
	EList<Synchronisation> getSynchronisations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getReference_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getReference_UpperBound()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getUpperBound();

} // Reference
