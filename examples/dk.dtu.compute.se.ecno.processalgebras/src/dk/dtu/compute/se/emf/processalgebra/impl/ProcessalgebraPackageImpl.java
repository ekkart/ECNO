/**
 */
package dk.dtu.compute.se.emf.processalgebra.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import dk.dtu.compute.se.emf.processalgebra.Action;
import dk.dtu.compute.se.emf.processalgebra.ActionDef;
import dk.dtu.compute.se.emf.processalgebra.ActionInst;
import dk.dtu.compute.se.emf.processalgebra.Choice;
import dk.dtu.compute.se.emf.processalgebra.ChoiceInst;
import dk.dtu.compute.se.emf.processalgebra.Composite;
import dk.dtu.compute.se.emf.processalgebra.Hide;
import dk.dtu.compute.se.emf.processalgebra.HideInst;
import dk.dtu.compute.se.emf.processalgebra.Parallel;
import dk.dtu.compute.se.emf.processalgebra.ParallelInst;
import dk.dtu.compute.se.emf.processalgebra.ProcessDefinition;
import dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions;
import dk.dtu.compute.se.emf.processalgebra.ProcessInstance;
import dk.dtu.compute.se.emf.processalgebra.ProcessName;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;
import dk.dtu.compute.se.emf.processalgebra.Sequence;
import dk.dtu.compute.se.emf.processalgebra.SequenceInst;
import dk.dtu.compute.se.emf.processalgebra.Setting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessalgebraPackageImpl extends EPackageImpl implements ProcessalgebraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hideInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInstEClass = null;

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
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessalgebraPackageImpl() {
		super(eNS_URI, ProcessalgebraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProcessalgebraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessalgebraPackage init() {
		if (isInited) return (ProcessalgebraPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessalgebraPackage.eNS_URI);

		// Obtain or create and register package
		ProcessalgebraPackageImpl theProcessalgebraPackage = (ProcessalgebraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessalgebraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessalgebraPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProcessalgebraPackage.createPackageContents();

		// Initialize created meta-data
		theProcessalgebraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessalgebraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessalgebraPackage.eNS_URI, theProcessalgebraPackage);
		return theProcessalgebraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessDefinitions() {
		return processDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessDefinitions_Definitions() {
		return (EReference)processDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessDefinitions_Actions() {
		return (EReference)processDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessDefinitions_Setting() {
		return (EReference)processDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessDefinition() {
		return processDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessDefinition_Name() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessDefinition_Process() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessDefinition_Owner() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Bar() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Action() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Instances() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessName() {
		return processNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessName_Definition() {
		return (EReference)processNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionDef() {
		return actionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionDef_Name() {
		return (EAttribute)actionDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDef_Uses() {
		return (EReference)actionDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDef_Procdefs() {
		return (EReference)actionDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHide() {
		return hideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHide_Actions() {
		return (EReference)hideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHide_Process() {
		return (EReference)hideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Subprocess() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessInstance() {
		return processInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInstance_Child() {
		return (EReference)processInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInstance_Parent() {
		return (EReference)processInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetting() {
		return settingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetting_Definitions() {
		return (EReference)settingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetting_Instances() {
		return (EReference)settingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceInst() {
		return sequenceInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceInst_Remainder() {
		return (EReference)sequenceInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceInst() {
		return choiceInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelInst() {
		return parallelInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHideInst() {
		return hideInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHideInst_Actions() {
		return (EReference)hideInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInst() {
		return actionInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionInst_Action() {
		return (EReference)actionInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessalgebraFactory getProcessalgebraFactory() {
		return (ProcessalgebraFactory)getEFactoryInstance();
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
		processDefinitionsEClass = createEClass(PROCESS_DEFINITIONS);
		createEReference(processDefinitionsEClass, PROCESS_DEFINITIONS__DEFINITIONS);
		createEReference(processDefinitionsEClass, PROCESS_DEFINITIONS__ACTIONS);
		createEReference(processDefinitionsEClass, PROCESS_DEFINITIONS__SETTING);

		processDefinitionEClass = createEClass(PROCESS_DEFINITION);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__NAME);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__PROCESS);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__OWNER);

		processEClass = createEClass(PROCESS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__BAR);
		createEReference(actionEClass, ACTION__ACTION);
		createEReference(actionEClass, ACTION__INSTANCES);

		processNameEClass = createEClass(PROCESS_NAME);
		createEReference(processNameEClass, PROCESS_NAME__DEFINITION);

		actionDefEClass = createEClass(ACTION_DEF);
		createEAttribute(actionDefEClass, ACTION_DEF__NAME);
		createEReference(actionDefEClass, ACTION_DEF__USES);
		createEReference(actionDefEClass, ACTION_DEF__PROCDEFS);

		hideEClass = createEClass(HIDE);
		createEReference(hideEClass, HIDE__ACTIONS);
		createEReference(hideEClass, HIDE__PROCESS);

		compositeEClass = createEClass(COMPOSITE);
		createEReference(compositeEClass, COMPOSITE__SUBPROCESS);

		sequenceEClass = createEClass(SEQUENCE);

		choiceEClass = createEClass(CHOICE);

		parallelEClass = createEClass(PARALLEL);

		processInstanceEClass = createEClass(PROCESS_INSTANCE);
		createEReference(processInstanceEClass, PROCESS_INSTANCE__CHILD);
		createEReference(processInstanceEClass, PROCESS_INSTANCE__PARENT);

		settingEClass = createEClass(SETTING);
		createEReference(settingEClass, SETTING__DEFINITIONS);
		createEReference(settingEClass, SETTING__INSTANCES);

		sequenceInstEClass = createEClass(SEQUENCE_INST);
		createEReference(sequenceInstEClass, SEQUENCE_INST__REMAINDER);

		choiceInstEClass = createEClass(CHOICE_INST);

		parallelInstEClass = createEClass(PARALLEL_INST);

		hideInstEClass = createEClass(HIDE_INST);
		createEReference(hideInstEClass, HIDE_INST__ACTIONS);

		actionInstEClass = createEClass(ACTION_INST);
		createEReference(actionInstEClass, ACTION_INST__ACTION);
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
		actionEClass.getESuperTypes().add(this.getProcess());
		processNameEClass.getESuperTypes().add(this.getProcess());
		hideEClass.getESuperTypes().add(this.getProcess());
		compositeEClass.getESuperTypes().add(this.getProcess());
		sequenceEClass.getESuperTypes().add(this.getComposite());
		choiceEClass.getESuperTypes().add(this.getComposite());
		parallelEClass.getESuperTypes().add(this.getComposite());
		sequenceInstEClass.getESuperTypes().add(this.getProcessInstance());
		choiceInstEClass.getESuperTypes().add(this.getProcessInstance());
		parallelInstEClass.getESuperTypes().add(this.getProcessInstance());
		hideInstEClass.getESuperTypes().add(this.getProcessInstance());
		actionInstEClass.getESuperTypes().add(this.getProcessInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(processDefinitionsEClass, ProcessDefinitions.class, "ProcessDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessDefinitions_Definitions(), this.getProcessDefinition(), this.getProcessDefinition_Owner(), "definitions", null, 0, -1, ProcessDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinitions_Actions(), this.getActionDef(), this.getActionDef_Procdefs(), "actions", null, 0, -1, ProcessDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinitions_Setting(), this.getSetting(), this.getSetting_Definitions(), "setting", null, 0, 1, ProcessDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processDefinitionEClass, ProcessDefinition.class, "ProcessDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_Process(), this.getProcess(), null, "process", null, 1, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_Owner(), this.getProcessDefinitions(), this.getProcessDefinitions_Definitions(), "owner", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, dk.dtu.compute.se.emf.processalgebra.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(processEClass, this.getProcessInstance(), "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Bar(), ecorePackage.getEBoolean(), "bar", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Action(), this.getActionDef(), this.getActionDef_Uses(), "action", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Instances(), this.getActionInst(), this.getActionInst_Action(), "instances", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(actionEClass, this.getProcessInstance(), "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(processNameEClass, ProcessName.class, "ProcessName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessName_Definition(), this.getProcessDefinition(), null, "definition", null, 1, 1, ProcessName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(processNameEClass, this.getProcessInstance(), "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionDefEClass, ActionDef.class, "ActionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDef_Uses(), this.getAction(), this.getAction_Action(), "uses", null, 0, -1, ActionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDef_Procdefs(), this.getProcessDefinitions(), this.getProcessDefinitions_Actions(), "procdefs", null, 0, 1, ActionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hideEClass, Hide.class, "Hide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHide_Actions(), this.getActionDef(), null, "actions", null, 0, -1, Hide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHide_Process(), this.getProcess(), null, "process", null, 1, 1, Hide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(hideEClass, this.getProcessInstance(), "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposite_Subprocess(), this.getProcess(), null, "subprocess", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(sequenceEClass, this.getProcessInstance(), "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(choiceEClass, this.getProcessInstance(), "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(parallelEClass, this.getProcessInstance(), "createInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(processInstanceEClass, ProcessInstance.class, "ProcessInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessInstance_Child(), this.getProcessInstance(), this.getProcessInstance_Parent(), "child", null, 0, -1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInstance_Parent(), this.getProcessInstance(), this.getProcessInstance_Child(), "parent", null, 0, 1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(processInstanceEClass, null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(settingEClass, Setting.class, "Setting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetting_Definitions(), this.getProcessDefinitions(), this.getProcessDefinitions_Setting(), "definitions", null, 1, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetting_Instances(), this.getProcessInstance(), null, "instances", null, 0, -1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceInstEClass, SequenceInst.class, "SequenceInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceInst_Remainder(), this.getProcess(), null, "remainder", null, 0, -1, SequenceInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceInstEClass, ChoiceInst.class, "ChoiceInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelInstEClass, ParallelInst.class, "ParallelInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hideInstEClass, HideInst.class, "HideInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHideInst_Actions(), this.getActionDef(), null, "actions", null, 0, -1, HideInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionInstEClass, ActionInst.class, "ActionInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionInst_Action(), this.getAction(), this.getAction_Instances(), "action", null, 1, 1, ActionInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(actionInstEClass, null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProcessalgebraPackageImpl
