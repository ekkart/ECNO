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
 * A representation of the model object '<em><b>State Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getDescription <em>Description</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getStates <em>States</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getInit <em>Init</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getMaxUid <em>Max Uid</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace()
 * @model
 * @generated
 */
public interface StateSpace extends EObject {
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
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.State}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.State#getStatespace <em>Statespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace_States()
	 * @see dk.dtu.compute.se.ecno.statespace.State#getStatespace
	 * @model opposite="statespace" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' reference.
	 * @see #setInit(State)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace_Init()
	 * @model
	 * @generated
	 */
	State getInit();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getInit <em>Init</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(State value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Max Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Uid</em>' attribute.
	 * @see #setMaxUid(int)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace_MaxUid()
	 * @model
	 * @generated
	 */
	int getMaxUid();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getMaxUid <em>Max Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Uid</em>' attribute.
	 * @see #getMaxUid()
	 * @generated
	 */
	void setMaxUid(int value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpace_Config()
	 * @model
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	State add(State state);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Transition add(Transition Transition);

} // StateSpace
