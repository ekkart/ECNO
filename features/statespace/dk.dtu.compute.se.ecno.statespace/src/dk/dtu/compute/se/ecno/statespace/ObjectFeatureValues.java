/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Feature Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getObject <em>Object</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getFeature <em>Feature</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getObjectFeatureValues()
 * @model
 * @generated
 */
public interface ObjectFeatureValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.StateObject#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' container reference.
	 * @see #setObject(StateObject)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getObjectFeatureValues_Object()
	 * @see dk.dtu.compute.se.ecno.statespace.StateObject#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	StateObject getObject();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getObject <em>Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' container reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(StateObject value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getObjectFeatureValues_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getObjectFeatureValues_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // ObjectFeatureValues
