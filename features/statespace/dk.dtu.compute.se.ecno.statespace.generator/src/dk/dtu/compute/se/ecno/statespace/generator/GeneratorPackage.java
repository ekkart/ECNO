/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.generator;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;

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
 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.compute.dtu.dk/ecno/statespace/generator/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl
	 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorPackageImpl#getGeneratorState()
	 * @generated
	 */
	int GENERATOR_STATE = 0;

	/**
	 * The feature id for the '<em><b>Statespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_STATE__STATESPACE = 0;

	/**
	 * The feature id for the '<em><b>Unhandled State Object Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Unhandled States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_STATE__UNHANDLED_STATES = 2;

	/**
	 * The feature id for the '<em><b>Unhandled State Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_STATE__UNHANDLED_STATE_OBJECTS = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.generator.impl.StateObjectEventImpl <em>State Object Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.StateObjectEventImpl
	 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorPackageImpl#getStateObjectEvent()
	 * @generated
	 */
	int STATE_OBJECT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT_EVENT__EVENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>State Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT_EVENT__STATE_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>State Object Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OBJECT_EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl <em>Controller State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl
	 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorPackageImpl#getGeneratorControllerState()
	 * @generated
	 */
	int GENERATOR_CONTROLLER_STATE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTROLLER_STATE__OBJECT = BehaviourstatesPackage.OBJECT_REFERENCE__OBJECT;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTROLLER_STATE__FILENAME = BehaviourstatesPackage.OBJECT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTROLLER_STATE__ELEMENTS = BehaviourstatesPackage.OBJECT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTROLLER_STATE__EVENTS = BehaviourstatesPackage.OBJECT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTROLLER_STATE__CONTAINMENT_FEATURE = BehaviourstatesPackage.OBJECT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Controller State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_CONTROLLER_STATE_FEATURE_COUNT = BehaviourstatesPackage.OBJECT_REFERENCE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorState
	 * @generated
	 */
	EClass getGeneratorState();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getStatespace <em>Statespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statespace</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getStatespace()
	 * @see #getGeneratorState()
	 * @generated
	 */
	EReference getGeneratorState_Statespace();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStateObjectEvents <em>Unhandled State Object Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unhandled State Object Events</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStateObjectEvents()
	 * @see #getGeneratorState()
	 * @generated
	 */
	EReference getGeneratorState_UnhandledStateObjectEvents();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStates <em>Unhandled States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unhandled States</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStates()
	 * @see #getGeneratorState()
	 * @generated
	 */
	EReference getGeneratorState_UnhandledStates();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStateObjects <em>Unhandled State Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unhandled State Objects</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStateObjects()
	 * @see #getGeneratorState()
	 * @generated
	 */
	EReference getGeneratorState_UnhandledStateObjects();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent <em>State Object Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Object Event</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent
	 * @generated
	 */
	EClass getStateObjectEvent();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getEventName()
	 * @see #getStateObjectEvent()
	 * @generated
	 */
	EAttribute getStateObjectEvent_EventName();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getStateObject <em>State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Object</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getStateObject()
	 * @see #getStateObjectEvent()
	 * @generated
	 */
	EReference getStateObjectEvent_StateObject();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState <em>Controller State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller State</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState
	 * @generated
	 */
	EClass getGeneratorControllerState();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getFilename()
	 * @see #getGeneratorControllerState()
	 * @generated
	 */
	EAttribute getGeneratorControllerState_Filename();

	/**
	 * Returns the meta object for the attribute list '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elements</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getElements()
	 * @see #getGeneratorControllerState()
	 * @generated
	 */
	EAttribute getGeneratorControllerState_Elements();

	/**
	 * Returns the meta object for the attribute list '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Events</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getEvents()
	 * @see #getGeneratorControllerState()
	 * @generated
	 */
	EAttribute getGeneratorControllerState_Events();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getContainmentFeature <em>Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment Feature</em>'.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState#getContainmentFeature()
	 * @see #getGeneratorControllerState()
	 * @generated
	 */
	EAttribute getGeneratorControllerState_ContainmentFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorFactory getGeneratorFactory();

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
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl
		 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorPackageImpl#getGeneratorState()
		 * @generated
		 */
		EClass GENERATOR_STATE = eINSTANCE.getGeneratorState();

		/**
		 * The meta object literal for the '<em><b>Statespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_STATE__STATESPACE = eINSTANCE.getGeneratorState_Statespace();

		/**
		 * The meta object literal for the '<em><b>Unhandled State Object Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS = eINSTANCE.getGeneratorState_UnhandledStateObjectEvents();

		/**
		 * The meta object literal for the '<em><b>Unhandled States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_STATE__UNHANDLED_STATES = eINSTANCE.getGeneratorState_UnhandledStates();

		/**
		 * The meta object literal for the '<em><b>Unhandled State Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_STATE__UNHANDLED_STATE_OBJECTS = eINSTANCE.getGeneratorState_UnhandledStateObjects();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.generator.impl.StateObjectEventImpl <em>State Object Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.StateObjectEventImpl
		 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorPackageImpl#getStateObjectEvent()
		 * @generated
		 */
		EClass STATE_OBJECT_EVENT = eINSTANCE.getStateObjectEvent();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_OBJECT_EVENT__EVENT_NAME = eINSTANCE.getStateObjectEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>State Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_OBJECT_EVENT__STATE_OBJECT = eINSTANCE.getStateObjectEvent_StateObject();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl <em>Controller State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl
		 * @see dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorPackageImpl#getGeneratorControllerState()
		 * @generated
		 */
		EClass GENERATOR_CONTROLLER_STATE = eINSTANCE.getGeneratorControllerState();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CONTROLLER_STATE__FILENAME = eINSTANCE.getGeneratorControllerState_Filename();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CONTROLLER_STATE__ELEMENTS = eINSTANCE.getGeneratorControllerState_Elements();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CONTROLLER_STATE__EVENTS = eINSTANCE.getGeneratorControllerState_Events();

		/**
		 * The meta object literal for the '<em><b>Containment Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_CONTROLLER_STATE__CONTAINMENT_FEATURE = eINSTANCE.getGeneratorControllerState_ContainmentFeature();

	}

} //GeneratorPackage
