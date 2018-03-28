/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Link#getFeature <em>Feature</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Link#getNo <em>No</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Link#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(ObjectFeatureValues)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getLink_Feature()
	 * @model required="true"
	 * @generated
	 */
	ObjectFeatureValues getFeature();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Link#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(ObjectFeatureValues value);

	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(int)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getLink_No()
	 * @model
	 * @generated
	 */
	int getNo();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Link#getNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #getNo()
	 * @generated
	 */
	void setNo(int value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.Event}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.Event#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getLink_Events()
	 * @see dk.dtu.compute.se.ecno.statespace.Event#getLinks
	 * @model opposite="links"
	 * @generated
	 */
	EList<Event> getEvents();

} // Link
