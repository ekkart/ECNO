/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourstatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviourstates";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ecno.se.imm.dtu.dk/ecno/save/bahaviourstates";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviourstates";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourstatesPackage eINSTANCE = dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl <em>Behaviour States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getBehaviourStates()
	 * @generated
	 */
	int BEHAVIOUR_STATES = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_STATES__STATES = 0;

	/**
	 * The feature id for the '<em><b>Orphans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_STATES__ORPHANS = 1;

	/**
	 * The feature id for the '<em><b>Added</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_STATES__ADDED = 2;

	/**
	 * The feature id for the '<em><b>Controller Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_STATES__CONTROLLER_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_STATES__PACKAGES = 4;

	/**
	 * The number of structural features of the '<em>Behaviour States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_STATES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStateImpl <em>Behaviour State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStateImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getBehaviourState()
	 * @generated
	 */
	int BEHAVIOUR_STATE = 1;

	/**
	 * The number of structural features of the '<em>Behaviour State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_STATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultStateImpl <em>Default State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultStateImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getDefaultState()
	 * @generated
	 */
	int DEFAULT_STATE = 2;

	/**
	 * The number of structural features of the '<em>Default State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_FEATURE_COUNT = BEHAVIOUR_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.PTNetStateImpl <em>PT Net State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.PTNetStateImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getPTNetState()
	 * @generated
	 */
	int PT_NET_STATE = 3;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_NET_STATE__MARKING = BEHAVIOUR_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PT Net State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_NET_STATE_FEATURE_COUNT = BEHAVIOUR_STATE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.InheritedBehaviourStateImpl <em>Inherited Behaviour State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.InheritedBehaviourStateImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getInheritedBehaviourState()
	 * @generated
	 */
	int INHERITED_BEHAVIOUR_STATE = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_BEHAVIOUR_STATE__STATES = BEHAVIOUR_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inherited Behaviour State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_BEHAVIOUR_STATE_FEATURE_COUNT = BEHAVIOUR_STATE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultContainerImpl <em>Default Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultContainerImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getDefaultContainer()
	 * @generated
	 */
	int DEFAULT_CONTAINER = 5;

	/**
	 * The number of structural features of the '<em>Default Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONTAINER_FEATURE_COUNT = BEHAVIOUR_STATE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ElementBehaviourStateImpl <em>Element Behaviour State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ElementBehaviourStateImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getElementBehaviourState()
	 * @generated
	 */
	int ELEMENT_BEHAVIOUR_STATE = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BEHAVIOUR_STATE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BEHAVIOUR_STATE__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element Behaviour State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BEHAVIOUR_STATE_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerConfiguratorImpl <em>Controller Configurator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerConfiguratorImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getControllerConfigurator()
	 * @generated
	 */
	int CONTROLLER_CONFIGURATOR = 7;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONFIGURATOR__URI = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONFIGURATOR__STATE = 1;

	/**
	 * The number of structural features of the '<em>Controller Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONFIGURATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerStateImpl <em>Controller State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerStateImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getControllerState()
	 * @generated
	 */
	int CONTROLLER_STATE = 8;

	/**
	 * The number of structural features of the '<em>Controller State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ObjectReferenceImpl
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getObjectReference()
	 * @generated
	 */
	int OBJECT_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE__OBJECT = CONTROLLER_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_FEATURE_COUNT = CONTROLLER_STATE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates <em>Behaviour States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour States</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates
	 * @generated
	 */
	EClass getBehaviourStates();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getStates()
	 * @see #getBehaviourStates()
	 * @generated
	 */
	EReference getBehaviourStates_States();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getOrphans <em>Orphans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orphans</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getOrphans()
	 * @see #getBehaviourStates()
	 * @generated
	 */
	EReference getBehaviourStates_Orphans();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getAdded <em>Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Added</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getAdded()
	 * @see #getBehaviourStates()
	 * @generated
	 */
	EReference getBehaviourStates_Added();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getControllerConfig <em>Controller Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controller Config</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getControllerConfig()
	 * @see #getBehaviourStates()
	 * @generated
	 */
	EReference getBehaviourStates_ControllerConfig();

	/**
	 * Returns the meta object for the attribute list '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Packages</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getPackages()
	 * @see #getBehaviourStates()
	 * @generated
	 */
	EAttribute getBehaviourStates_Packages();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState <em>Behaviour State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState
	 * @generated
	 */
	EClass getBehaviourState();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultState
	 * @generated
	 */
	EClass getDefaultState();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState <em>PT Net State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PT Net State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState
	 * @generated
	 */
	EClass getPTNetState();

	/**
	 * Returns the meta object for the attribute list '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Marking</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState#getMarking()
	 * @see #getPTNetState()
	 * @generated
	 */
	EAttribute getPTNetState_Marking();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState <em>Inherited Behaviour State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited Behaviour State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState
	 * @generated
	 */
	EClass getInheritedBehaviourState();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState#getStates()
	 * @see #getInheritedBehaviourState()
	 * @generated
	 */
	EReference getInheritedBehaviourState_States();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultContainer <em>Default Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Container</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultContainer
	 * @generated
	 */
	EClass getDefaultContainer();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState <em>Element Behaviour State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Behaviour State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState
	 * @generated
	 */
	EClass getElementBehaviourState();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState#getState()
	 * @see #getElementBehaviourState()
	 * @generated
	 */
	EReference getElementBehaviourState_State();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState#getElement()
	 * @see #getElementBehaviourState()
	 * @generated
	 */
	EReference getElementBehaviourState_Element();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator <em>Controller Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Configurator</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator
	 * @generated
	 */
	EClass getControllerConfigurator();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getUri()
	 * @see #getControllerConfigurator()
	 * @generated
	 */
	EAttribute getControllerConfigurator_Uri();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getState()
	 * @see #getControllerConfigurator()
	 * @generated
	 */
	EReference getControllerConfigurator_State();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState <em>Controller State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller State</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState
	 * @generated
	 */
	EClass getControllerState();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference <em>Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Reference</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference
	 * @generated
	 */
	EClass getObjectReference();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference#getObject()
	 * @see #getObjectReference()
	 * @generated
	 */
	EReference getObjectReference_Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourstatesFactory getBehaviourstatesFactory();

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
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl <em>Behaviour States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getBehaviourStates()
		 * @generated
		 */
		EClass BEHAVIOUR_STATES = eINSTANCE.getBehaviourStates();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_STATES__STATES = eINSTANCE.getBehaviourStates_States();

		/**
		 * The meta object literal for the '<em><b>Orphans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_STATES__ORPHANS = eINSTANCE.getBehaviourStates_Orphans();

		/**
		 * The meta object literal for the '<em><b>Added</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_STATES__ADDED = eINSTANCE.getBehaviourStates_Added();

		/**
		 * The meta object literal for the '<em><b>Controller Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_STATES__CONTROLLER_CONFIG = eINSTANCE.getBehaviourStates_ControllerConfig();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_STATES__PACKAGES = eINSTANCE.getBehaviourStates_Packages();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStateImpl <em>Behaviour State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStateImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getBehaviourState()
		 * @generated
		 */
		EClass BEHAVIOUR_STATE = eINSTANCE.getBehaviourState();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultStateImpl <em>Default State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultStateImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getDefaultState()
		 * @generated
		 */
		EClass DEFAULT_STATE = eINSTANCE.getDefaultState();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.PTNetStateImpl <em>PT Net State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.PTNetStateImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getPTNetState()
		 * @generated
		 */
		EClass PT_NET_STATE = eINSTANCE.getPTNetState();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_NET_STATE__MARKING = eINSTANCE.getPTNetState_Marking();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.InheritedBehaviourStateImpl <em>Inherited Behaviour State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.InheritedBehaviourStateImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getInheritedBehaviourState()
		 * @generated
		 */
		EClass INHERITED_BEHAVIOUR_STATE = eINSTANCE.getInheritedBehaviourState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITED_BEHAVIOUR_STATE__STATES = eINSTANCE.getInheritedBehaviourState_States();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultContainerImpl <em>Default Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.DefaultContainerImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getDefaultContainer()
		 * @generated
		 */
		EClass DEFAULT_CONTAINER = eINSTANCE.getDefaultContainer();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ElementBehaviourStateImpl <em>Element Behaviour State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ElementBehaviourStateImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getElementBehaviourState()
		 * @generated
		 */
		EClass ELEMENT_BEHAVIOUR_STATE = eINSTANCE.getElementBehaviourState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_BEHAVIOUR_STATE__STATE = eINSTANCE.getElementBehaviourState_State();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_BEHAVIOUR_STATE__ELEMENT = eINSTANCE.getElementBehaviourState_Element();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerConfiguratorImpl <em>Controller Configurator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerConfiguratorImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getControllerConfigurator()
		 * @generated
		 */
		EClass CONTROLLER_CONFIGURATOR = eINSTANCE.getControllerConfigurator();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CONFIGURATOR__URI = eINSTANCE.getControllerConfigurator_Uri();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CONFIGURATOR__STATE = eINSTANCE.getControllerConfigurator_State();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerStateImpl <em>Controller State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ControllerStateImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getControllerState()
		 * @generated
		 */
		EClass CONTROLLER_STATE = eINSTANCE.getControllerState();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ObjectReferenceImpl
		 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesPackageImpl#getObjectReference()
		 * @generated
		 */
		EClass OBJECT_REFERENCE = eINSTANCE.getObjectReference();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_REFERENCE__OBJECT = eINSTANCE.getObjectReference_Object();

	}

} //BehaviourstatesPackage
