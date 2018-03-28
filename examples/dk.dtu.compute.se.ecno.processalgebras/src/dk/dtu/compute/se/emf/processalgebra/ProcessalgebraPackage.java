/**
 */
package dk.dtu.compute.se.emf.processalgebra;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessalgebraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processalgebra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.compute.dtu.dk/processalgebra/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processalgebra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessalgebraPackage eINSTANCE = dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionsImpl <em>Process Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionsImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessDefinitions()
	 * @generated
	 */
	int PROCESS_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITIONS__DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITIONS__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Setting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITIONS__SETTING = 2;

	/**
	 * The number of structural features of the '<em>Process Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITIONS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessDefinition()
	 * @generated
	 */
	int PROCESS_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ActionImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BAR = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INSTANCES = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessNameImpl <em>Process Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessNameImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessName()
	 * @generated
	 */
	int PROCESS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NAME__DEFINITION = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NAME_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionDefImpl <em>Action Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ActionDefImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getActionDef()
	 * @generated
	 */
	int ACTION_DEF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__USES = 1;

	/**
	 * The feature id for the '<em><b>Procdefs</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__PROCDEFS = 2;

	/**
	 * The number of structural features of the '<em>Action Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.HideImpl <em>Hide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.HideImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getHide()
	 * @generated
	 */
	int HIDE = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__ACTIONS = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__PROCESS = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.CompositeImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 7;

	/**
	 * The feature id for the '<em><b>Subprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SUBPROCESS = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.SequenceImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Subprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUBPROCESS = COMPOSITE__SUBPROCESS;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ChoiceImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 9;

	/**
	 * The feature id for the '<em><b>Subprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SUBPROCESS = COMPOSITE__SUBPROCESS;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ParallelImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Subprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__SUBPROCESS = COMPOSITE__SUBPROCESS;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessInstanceImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessInstance()
	 * @generated
	 */
	int PROCESS_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__CHILD = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Process Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.SettingImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 12;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.SequenceInstImpl <em>Sequence Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.SequenceInstImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getSequenceInst()
	 * @generated
	 */
	int SEQUENCE_INST = 13;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INST__CHILD = PROCESS_INSTANCE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INST__PARENT = PROCESS_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Remainder</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INST__REMAINDER = PROCESS_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INST_FEATURE_COUNT = PROCESS_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ChoiceInstImpl <em>Choice Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ChoiceInstImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getChoiceInst()
	 * @generated
	 */
	int CHOICE_INST = 14;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_INST__CHILD = PROCESS_INSTANCE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_INST__PARENT = PROCESS_INSTANCE__PARENT;

	/**
	 * The number of structural features of the '<em>Choice Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_INST_FEATURE_COUNT = PROCESS_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ParallelInstImpl <em>Parallel Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ParallelInstImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getParallelInst()
	 * @generated
	 */
	int PARALLEL_INST = 15;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_INST__CHILD = PROCESS_INSTANCE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_INST__PARENT = PROCESS_INSTANCE__PARENT;

	/**
	 * The number of structural features of the '<em>Parallel Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_INST_FEATURE_COUNT = PROCESS_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.HideInstImpl <em>Hide Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.HideInstImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getHideInst()
	 * @generated
	 */
	int HIDE_INST = 16;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_INST__CHILD = PROCESS_INSTANCE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_INST__PARENT = PROCESS_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_INST__ACTIONS = PROCESS_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hide Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_INST_FEATURE_COUNT = PROCESS_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionInstImpl <em>Action Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ActionInstImpl
	 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getActionInst()
	 * @generated
	 */
	int ACTION_INST = 17;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INST__CHILD = PROCESS_INSTANCE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INST__PARENT = PROCESS_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INST__ACTION = PROCESS_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INST_FEATURE_COUNT = PROCESS_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions <em>Process Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definitions</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions
	 * @generated
	 */
	EClass getProcessDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getDefinitions()
	 * @see #getProcessDefinitions()
	 * @generated
	 */
	EReference getProcessDefinitions_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getActions()
	 * @see #getProcessDefinitions()
	 * @generated
	 */
	EReference getProcessDefinitions_Actions();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Setting</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getSetting()
	 * @see #getProcessDefinitions()
	 * @generated
	 */
	EReference getProcessDefinitions_Setting();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definition</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinition
	 * @generated
	 */
	EClass getProcessDefinition();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getName()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getProcess()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Process();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getOwner()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Owner();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.emf.processalgebra.Action#isBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Action#isBar()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Bar();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.emf.processalgebra.Action#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Action#getAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Action();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.emf.processalgebra.Action#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Action#getInstances()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Instances();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ProcessName <em>Process Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Name</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessName
	 * @generated
	 */
	EClass getProcessName();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.emf.processalgebra.ProcessName#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessName#getDefinition()
	 * @see #getProcessName()
	 * @generated
	 */
	EReference getProcessName_Definition();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef <em>Action Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Def</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionDef
	 * @generated
	 */
	EClass getActionDef();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionDef#getName()
	 * @see #getActionDef()
	 * @generated
	 */
	EAttribute getActionDef_Name();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionDef#getUses()
	 * @see #getActionDef()
	 * @generated
	 */
	EReference getActionDef_Uses();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getProcdefs <em>Procdefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Procdefs</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionDef#getProcdefs()
	 * @see #getActionDef()
	 * @generated
	 */
	EReference getActionDef_Procdefs();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Hide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Hide
	 * @generated
	 */
	EClass getHide();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.emf.processalgebra.Hide#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Hide#getActions()
	 * @see #getHide()
	 * @generated
	 */
	EReference getHide_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.se.emf.processalgebra.Hide#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Hide#getProcess()
	 * @see #getHide()
	 * @generated
	 */
	EReference getHide_Process();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.emf.processalgebra.Composite#getSubprocess <em>Subprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subprocess</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Composite#getSubprocess()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Subprocess();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Instance</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessInstance
	 * @generated
	 */
	EClass getProcessInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getChild()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_Child();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessInstance#getParent()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_Parent();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.se.emf.processalgebra.Setting#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Setting#getDefinitions()
	 * @see #getSetting()
	 * @generated
	 */
	EReference getSetting_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.se.emf.processalgebra.Setting#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.Setting#getInstances()
	 * @see #getSetting()
	 * @generated
	 */
	EReference getSetting_Instances();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.SequenceInst <em>Sequence Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Inst</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.SequenceInst
	 * @generated
	 */
	EClass getSequenceInst();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.emf.processalgebra.SequenceInst#getRemainder <em>Remainder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Remainder</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.SequenceInst#getRemainder()
	 * @see #getSequenceInst()
	 * @generated
	 */
	EReference getSequenceInst_Remainder();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ChoiceInst <em>Choice Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Inst</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ChoiceInst
	 * @generated
	 */
	EClass getChoiceInst();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ParallelInst <em>Parallel Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Inst</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ParallelInst
	 * @generated
	 */
	EClass getParallelInst();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.HideInst <em>Hide Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide Inst</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.HideInst
	 * @generated
	 */
	EClass getHideInst();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.se.emf.processalgebra.HideInst#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.HideInst#getActions()
	 * @see #getHideInst()
	 * @generated
	 */
	EReference getHideInst_Actions();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.se.emf.processalgebra.ActionInst <em>Action Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Inst</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionInst
	 * @generated
	 */
	EClass getActionInst();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.se.emf.processalgebra.ActionInst#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionInst#getAction()
	 * @see #getActionInst()
	 * @generated
	 */
	EReference getActionInst_Action();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessalgebraFactory getProcessalgebraFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionsImpl <em>Process Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionsImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessDefinitions()
		 * @generated
		 */
		EClass PROCESS_DEFINITIONS = eINSTANCE.getProcessDefinitions();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITIONS__DEFINITIONS = eINSTANCE.getProcessDefinitions_Definitions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITIONS__ACTIONS = eINSTANCE.getProcessDefinitions_Actions();

		/**
		 * The meta object literal for the '<em><b>Setting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITIONS__SETTING = eINSTANCE.getProcessDefinitions_Setting();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessDefinition()
		 * @generated
		 */
		EClass PROCESS_DEFINITION = eINSTANCE.getProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__NAME = eINSTANCE.getProcessDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__PROCESS = eINSTANCE.getProcessDefinition_Process();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__OWNER = eINSTANCE.getProcessDefinition_Owner();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ActionImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__BAR = eINSTANCE.getAction_Bar();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION = eINSTANCE.getAction_Action();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INSTANCES = eINSTANCE.getAction_Instances();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessNameImpl <em>Process Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessNameImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessName()
		 * @generated
		 */
		EClass PROCESS_NAME = eINSTANCE.getProcessName();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NAME__DEFINITION = eINSTANCE.getProcessName_Definition();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionDefImpl <em>Action Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ActionDefImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getActionDef()
		 * @generated
		 */
		EClass ACTION_DEF = eINSTANCE.getActionDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DEF__NAME = eINSTANCE.getActionDef_Name();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DEF__USES = eINSTANCE.getActionDef_Uses();

		/**
		 * The meta object literal for the '<em><b>Procdefs</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DEF__PROCDEFS = eINSTANCE.getActionDef_Procdefs();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.HideImpl <em>Hide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.HideImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getHide()
		 * @generated
		 */
		EClass HIDE = eINSTANCE.getHide();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIDE__ACTIONS = eINSTANCE.getHide_Actions();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIDE__PROCESS = eINSTANCE.getHide_Process();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.CompositeImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Subprocess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SUBPROCESS = eINSTANCE.getComposite_Subprocess();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.SequenceImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ChoiceImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ParallelImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessInstanceImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getProcessInstance()
		 * @generated
		 */
		EClass PROCESS_INSTANCE = eINSTANCE.getProcessInstance();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__CHILD = eINSTANCE.getProcessInstance_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__PARENT = eINSTANCE.getProcessInstance_Parent();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.SettingImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING__DEFINITIONS = eINSTANCE.getSetting_Definitions();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING__INSTANCES = eINSTANCE.getSetting_Instances();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.SequenceInstImpl <em>Sequence Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.SequenceInstImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getSequenceInst()
		 * @generated
		 */
		EClass SEQUENCE_INST = eINSTANCE.getSequenceInst();

		/**
		 * The meta object literal for the '<em><b>Remainder</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_INST__REMAINDER = eINSTANCE.getSequenceInst_Remainder();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ChoiceInstImpl <em>Choice Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ChoiceInstImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getChoiceInst()
		 * @generated
		 */
		EClass CHOICE_INST = eINSTANCE.getChoiceInst();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ParallelInstImpl <em>Parallel Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ParallelInstImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getParallelInst()
		 * @generated
		 */
		EClass PARALLEL_INST = eINSTANCE.getParallelInst();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.HideInstImpl <em>Hide Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.HideInstImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getHideInst()
		 * @generated
		 */
		EClass HIDE_INST = eINSTANCE.getHideInst();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIDE_INST__ACTIONS = eINSTANCE.getHideInst_Actions();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionInstImpl <em>Action Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ActionInstImpl
		 * @see dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraPackageImpl#getActionInst()
		 * @generated
		 */
		EClass ACTION_INST = eINSTANCE.getActionInst();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_INST__ACTION = eINSTANCE.getActionInst_Action();

	}

} //ProcessalgebraPackage
