/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.generator;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getFilename <em>Filename</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getElements <em>Elements</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getEvents <em>Events</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getContainmentFeature <em>Containment Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorControllerState()
 * @model
 * @generated
 */
public interface GeneratorControllerState extends ObjectReference {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorControllerState_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute list.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorControllerState_Elements()
	 * @model
	 * @generated
	 */
	EList<Integer> getElements();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' attribute list.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorControllerState_Events()
	 * @model
	 * @generated
	 */
	EList<String> getEvents();

	/**
	 * Returns the value of the '<em><b>Containment Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Feature</em>' attribute.
	 * @see #setContainmentFeature(String)
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorControllerState_ContainmentFeature()
	 * @model
	 * @generated
	 */
	String getContainmentFeature();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getContainmentFeature <em>Containment Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Feature</em>' attribute.
	 * @see #getContainmentFeature()
	 * @generated
	 */
	void setContainmentFeature(String value);

} // GeneratorControllerState
