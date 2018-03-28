/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesFactory;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultContainer;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourstatesPackageImpl extends EPackageImpl implements BehaviourstatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptNetStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedBehaviourStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementBehaviourStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerConfiguratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviourstatesPackageImpl() {
		super(eNS_URI, BehaviourstatesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BehaviourstatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviourstatesPackage init() {
		if (isInited) return (BehaviourstatesPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourstatesPackage.eNS_URI);

		// Obtain or create and register package
		BehaviourstatesPackageImpl theBehaviourstatesPackage = (BehaviourstatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviourstatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviourstatesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBehaviourstatesPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviourstatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviourstatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviourstatesPackage.eNS_URI, theBehaviourstatesPackage);
		return theBehaviourstatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviourStates() {
		return behaviourStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourStates_States() {
		return (EReference)behaviourStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourStates_Orphans() {
		return (EReference)behaviourStatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourStates_Added() {
		return (EReference)behaviourStatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourStates_ControllerConfig() {
		return (EReference)behaviourStatesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviourStates_Packages() {
		return (EAttribute)behaviourStatesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviourState() {
		return behaviourStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultState() {
		return defaultStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTNetState() {
		return ptNetStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPTNetState_Marking() {
		return (EAttribute)ptNetStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedBehaviourState() {
		return inheritedBehaviourStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritedBehaviourState_States() {
		return (EReference)inheritedBehaviourStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultContainer() {
		return defaultContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementBehaviourState() {
		return elementBehaviourStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementBehaviourState_State() {
		return (EReference)elementBehaviourStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementBehaviourState_Element() {
		return (EReference)elementBehaviourStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerConfigurator() {
		return controllerConfiguratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerConfigurator_Uri() {
		return (EAttribute)controllerConfiguratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerConfigurator_State() {
		return (EReference)controllerConfiguratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerState() {
		return controllerStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectReference() {
		return objectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectReference_Object() {
		return (EReference)objectReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourstatesFactory getBehaviourstatesFactory() {
		return (BehaviourstatesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		behaviourStatesEClass = createEClass(BEHAVIOUR_STATES);
		createEReference(behaviourStatesEClass, BEHAVIOUR_STATES__STATES);
		createEReference(behaviourStatesEClass, BEHAVIOUR_STATES__ORPHANS);
		createEReference(behaviourStatesEClass, BEHAVIOUR_STATES__ADDED);
		createEReference(behaviourStatesEClass, BEHAVIOUR_STATES__CONTROLLER_CONFIG);
		createEAttribute(behaviourStatesEClass, BEHAVIOUR_STATES__PACKAGES);

		behaviourStateEClass = createEClass(BEHAVIOUR_STATE);

		defaultStateEClass = createEClass(DEFAULT_STATE);

		ptNetStateEClass = createEClass(PT_NET_STATE);
		createEAttribute(ptNetStateEClass, PT_NET_STATE__MARKING);

		inheritedBehaviourStateEClass = createEClass(INHERITED_BEHAVIOUR_STATE);
		createEReference(inheritedBehaviourStateEClass, INHERITED_BEHAVIOUR_STATE__STATES);

		defaultContainerEClass = createEClass(DEFAULT_CONTAINER);

		elementBehaviourStateEClass = createEClass(ELEMENT_BEHAVIOUR_STATE);
		createEReference(elementBehaviourStateEClass, ELEMENT_BEHAVIOUR_STATE__STATE);
		createEReference(elementBehaviourStateEClass, ELEMENT_BEHAVIOUR_STATE__ELEMENT);

		controllerConfiguratorEClass = createEClass(CONTROLLER_CONFIGURATOR);
		createEAttribute(controllerConfiguratorEClass, CONTROLLER_CONFIGURATOR__URI);
		createEReference(controllerConfiguratorEClass, CONTROLLER_CONFIGURATOR__STATE);

		controllerStateEClass = createEClass(CONTROLLER_STATE);

		objectReferenceEClass = createEClass(OBJECT_REFERENCE);
		createEReference(objectReferenceEClass, OBJECT_REFERENCE__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultStateEClass.getESuperTypes().add(this.getBehaviourState());
		ptNetStateEClass.getESuperTypes().add(this.getBehaviourState());
		inheritedBehaviourStateEClass.getESuperTypes().add(this.getBehaviourState());
		defaultContainerEClass.getESuperTypes().add(this.getBehaviourState());
		objectReferenceEClass.getESuperTypes().add(this.getControllerState());

		// Initialize classes and features; add operations and parameters
		initEClass(behaviourStatesEClass, BehaviourStates.class, "BehaviourStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourStates_States(), this.getElementBehaviourState(), null, "states", null, 0, -1, BehaviourStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourStates_Orphans(), ecorePackage.getEObject(), null, "orphans", null, 0, -1, BehaviourStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourStates_Added(), ecorePackage.getEObject(), null, "added", null, 0, -1, BehaviourStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourStates_ControllerConfig(), this.getControllerConfigurator(), null, "controllerConfig", null, 0, 1, BehaviourStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourStates_Packages(), ecorePackage.getEString(), "packages", null, 0, -1, BehaviourStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourStateEClass, BehaviourState.class, "BehaviourState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultStateEClass, DefaultState.class, "DefaultState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ptNetStateEClass, PTNetState.class, "PTNetState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPTNetState_Marking(), ecorePackage.getEInt(), "marking", null, 0, -1, PTNetState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritedBehaviourStateEClass, InheritedBehaviourState.class, "InheritedBehaviourState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInheritedBehaviourState_States(), this.getBehaviourState(), null, "states", null, 0, -1, InheritedBehaviourState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultContainerEClass, DefaultContainer.class, "DefaultContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementBehaviourStateEClass, ElementBehaviourState.class, "ElementBehaviourState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementBehaviourState_State(), this.getBehaviourState(), null, "state", null, 1, 1, ElementBehaviourState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementBehaviourState_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, ElementBehaviourState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerConfiguratorEClass, ControllerConfigurator.class, "ControllerConfigurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerConfigurator_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ControllerConfigurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerConfigurator_State(), this.getControllerState(), null, "state", null, 0, 1, ControllerConfigurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerStateEClass, ControllerState.class, "ControllerState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectReferenceEClass, ObjectReference.class, "ObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectReference_Object(), ecorePackage.getEObject(), null, "object", null, 0, 1, ObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BehaviourstatesPackageImpl
