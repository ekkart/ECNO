/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.dtu.compute.se.ecno.statespace.StatespaceFactory
 * @model kind="package"
 * @generated
 */
public interface StatespacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statespace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.compute.dtu.dk/ecno/statespace/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statespace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatespacePackage eINSTANCE = dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl <em>State Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getStateSpace()
	 * @generated
	 */
	int STATE_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE__STATES = 2;

	/**
	 * The feature id for the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE__INIT = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Max Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE__MAX_UID = 5;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE__CONFIG = 6;

	/**
	 * The number of structural features of the '<em>State Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StateImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUT = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IN = 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECTS = 2;

	/**
	 * The feature id for the '<em><b>Statespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATESPACE = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NUMBER = 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINKS = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Trigger Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl <em>State Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getStateObject()
	 * @generated
	 */
	int STATE_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT__UID = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Behaviour States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT__BEHAVIOUR_STATES = 3;

	/**
	 * The number of structural features of the '<em>State Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.LinkImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NO = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EVENTS = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.EventImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.ParameterImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ObjectFeatureValuesImpl <em>Object Feature Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.ObjectFeatureValuesImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getObjectFeatureValues()
	 * @generated
	 */
	int OBJECT_FEATURE_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_VALUES__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_VALUES__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_VALUES__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Object Feature Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_VALUES_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.ValueImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * The feature id for the '<em><b>State Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATE_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Int Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__INT_VALUES = 1;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STRING_VALUES = 2;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.ElementImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UID = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceControllerStateImpl <em>State Space Controller State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StateSpaceControllerStateImpl
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getStateSpaceControllerState()
	 * @generated
	 */
	int STATE_SPACE_CONTROLLER_STATE = 10;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE_CONTROLLER_STATE__OBJECT = BehaviourstatesPackage.OBJECT_REFERENCE__OBJECT;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE_CONTROLLER_STATE__CONFIG = BehaviourstatesPackage.OBJECT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Space Controller State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SPACE_CONTROLLER_STATE_FEATURE_COUNT = BehaviourstatesPackage.OBJECT_REFERENCE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '<em>Execution Engine</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.engine.ExecutionEngine
	 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getExecutionEngine()
	 * @generated
	 */
	int EXECUTION_ENGINE = 11;


	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.StateSpace <em>State Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Space</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace
	 * @generated
	 */
	EClass getStateSpace();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getName()
	 * @see #getStateSpace()
	 * @generated
	 */
	EAttribute getStateSpace_Name();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getDescription()
	 * @see #getStateSpace()
	 * @generated
	 */
	EAttribute getStateSpace_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getStates()
	 * @see #getStateSpace()
	 * @generated
	 */
	EReference getStateSpace_States();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getInit()
	 * @see #getStateSpace()
	 * @generated
	 */
	EReference getStateSpace_Init();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getTransitions()
	 * @see #getStateSpace()
	 * @generated
	 */
	EReference getStateSpace_Transitions();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getMaxUid <em>Max Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Uid</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getMaxUid()
	 * @see #getStateSpace()
	 * @generated
	 */
	EAttribute getStateSpace_MaxUid();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getConfig()
	 * @see #getStateSpace()
	 * @generated
	 */
	EAttribute getStateSpace_Config();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.ecno.statespace.State#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.State#getOut()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Out();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.ecno.statespace.State#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.State#getIn()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_In();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.State#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.State#getObjects()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Objects();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.se.ecno.statespace.State#getStatespace <em>Statespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statespace</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.State#getStatespace()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Statespace();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.State#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.State#getNumber()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Number();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.Transition#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Events();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.Transition#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getLinks()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Links();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.Transition#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getNumber()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Number();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.Transition#getTriggerElement <em>Trigger Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Element</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getTriggerElement()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TriggerElement();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.StateObject <em>State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Object</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateObject
	 * @generated
	 */
	EClass getStateObject();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.StateObject#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateObject#getUid()
	 * @see #getStateObject()
	 * @generated
	 */
	EAttribute getStateObject_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.StateObject#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateObject#getFeatures()
	 * @see #getStateObject()
	 * @generated
	 */
	EReference getStateObject_Features();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.StateObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateObject#getType()
	 * @see #getStateObject()
	 * @generated
	 */
	EReference getStateObject_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.StateObject#getBehaviourStates <em>Behaviour States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviour States</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateObject#getBehaviourStates()
	 * @see #getStateObject()
	 * @generated
	 */
	EReference getStateObject_BehaviourStates();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.Link#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Link#getFeature()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Feature();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.Link#getNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Link#getNo()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_No();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.ecno.statespace.Link#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Link#getEvents()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Events();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.ecno.statespace.Event#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Event#getLinks()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Links();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.Event#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Event#getParameters()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Parameters();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.Parameter#isCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Parameter#isCollection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.se.ecno.statespace.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Value();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues <em>Object Feature Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Feature Values</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues
	 * @generated
	 */
	EClass getObjectFeatureValues();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getObject()
	 * @see #getObjectFeatureValues()
	 * @generated
	 */
	EReference getObjectFeatureValues_Object();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getFeature()
	 * @see #getObjectFeatureValues()
	 * @generated
	 */
	EReference getObjectFeatureValues_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues#getValues()
	 * @see #getObjectFeatureValues()
	 * @generated
	 */
	EReference getObjectFeatureValues_Values();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.ecno.statespace.Value#getStateValues <em>State Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Values</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Value#getStateValues()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StateValues();

	/**
	 * Returns the meta object for the attribute list '{@link dk.dtu.compute.se.ecno.statespace.Value#getIntValues <em>Int Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Int Values</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Value#getIntValues()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_IntValues();

	/**
	 * Returns the meta object for the attribute list '{@link dk.dtu.compute.se.ecno.statespace.Value#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Values</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Value#getStringValues()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_StringValues();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.Element#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.Element#getUid()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Uid();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState <em>State Space Controller State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Space Controller State</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState
	 * @generated
	 */
	EClass getStateSpaceControllerState();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState#getConfig()
	 * @see #getStateSpaceControllerState()
	 * @generated
	 */
	EAttribute getStateSpaceControllerState_Config();

	/**
	 * Returns the meta object for data type '{@link dk.dtu.imm.se.ecno.engine.ExecutionEngine <em>Execution Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Execution Engine</em>'.
	 * @see dk.dtu.imm.se.ecno.engine.ExecutionEngine
	 * @model instanceClass="dk.dtu.imm.se.ecno.engine.ExecutionEngine"
	 * @generated
	 */
	EDataType getExecutionEngine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatespaceFactory getStatespaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl <em>State Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getStateSpace()
		 * @generated
		 */
		EClass STATE_SPACE = eINSTANCE.getStateSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_SPACE__NAME = eINSTANCE.getStateSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_SPACE__DESCRIPTION = eINSTANCE.getStateSpace_Description();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SPACE__STATES = eINSTANCE.getStateSpace_States();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SPACE__INIT = eINSTANCE.getStateSpace_Init();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SPACE__TRANSITIONS = eINSTANCE.getStateSpace_Transitions();

		/**
		 * The meta object literal for the '<em><b>Max Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_SPACE__MAX_UID = eINSTANCE.getStateSpace_MaxUid();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_SPACE__CONFIG = eINSTANCE.getStateSpace_Config();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StateImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUT = eINSTANCE.getState_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__IN = eINSTANCE.getState_In();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECTS = eINSTANCE.getState_Objects();

		/**
		 * The meta object literal for the '<em><b>Statespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATESPACE = eINSTANCE.getState_Statespace();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NUMBER = eINSTANCE.getState_Number();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENTS = eINSTANCE.getTransition_Events();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__LINKS = eINSTANCE.getTransition_Links();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NUMBER = eINSTANCE.getTransition_Number();

		/**
		 * The meta object literal for the '<em><b>Trigger Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER_ELEMENT = eINSTANCE.getTransition_TriggerElement();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl <em>State Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getStateObject()
		 * @generated
		 */
		EClass STATE_OBJECT = eINSTANCE.getStateObject();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_OBJECT__UID = eINSTANCE.getStateObject_Uid();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OBJECT__FEATURES = eINSTANCE.getStateObject_Features();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OBJECT__TYPE = eINSTANCE.getStateObject_Type();

		/**
		 * The meta object literal for the '<em><b>Behaviour States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OBJECT__BEHAVIOUR_STATES = eINSTANCE.getStateObject_BehaviourStates();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.LinkImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__FEATURE = eINSTANCE.getLink_Feature();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NO = eINSTANCE.getLink_No();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__EVENTS = eINSTANCE.getLink_Events();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.EventImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__LINKS = eINSTANCE.getEvent_Links();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PARAMETERS = eINSTANCE.getEvent_Parameters();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.ParameterImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__COLLECTION = eINSTANCE.getParameter_Collection();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ObjectFeatureValuesImpl <em>Object Feature Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.ObjectFeatureValuesImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getObjectFeatureValues()
		 * @generated
		 */
		EClass OBJECT_FEATURE_VALUES = eINSTANCE.getObjectFeatureValues();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FEATURE_VALUES__OBJECT = eINSTANCE.getObjectFeatureValues_Object();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FEATURE_VALUES__FEATURE = eINSTANCE.getObjectFeatureValues_Feature();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FEATURE_VALUES__VALUES = eINSTANCE.getObjectFeatureValues_Values();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.ValueImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>State Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATE_VALUES = eINSTANCE.getValue_StateValues();

		/**
		 * The meta object literal for the '<em><b>Int Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__INT_VALUES = eINSTANCE.getValue_IntValues();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__STRING_VALUES = eINSTANCE.getValue_StringValues();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.ElementImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UID = eINSTANCE.getElement_Uid();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceControllerStateImpl <em>State Space Controller State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StateSpaceControllerStateImpl
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getStateSpaceControllerState()
		 * @generated
		 */
		EClass STATE_SPACE_CONTROLLER_STATE = eINSTANCE.getStateSpaceControllerState();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_SPACE_CONTROLLER_STATE__CONFIG = eINSTANCE.getStateSpaceControllerState_Config();

		/**
		 * The meta object literal for the '<em>Execution Engine</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.engine.ExecutionEngine
		 * @see dk.dtu.compute.se.ecno.statespace.impl.StatespacePackageImpl#getExecutionEngine()
		 * @generated
		 */
		EDataType EXECUTION_ENGINE = eINSTANCE.getExecutionEngine();

	}

} //StatespacePackage
