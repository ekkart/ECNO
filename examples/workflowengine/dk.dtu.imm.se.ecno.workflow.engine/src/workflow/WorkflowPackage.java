/**
 */
package workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://workflow/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link workflow.TaskAspect <em>Task Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.TaskAspect
	 * @see workflow.impl.WorkflowPackageImpl#getTaskAspect()
	 * @generated
	 */
	int TASK_ASPECT = 28;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASPECT__CORE = 0;

	/**
	 * The number of structural features of the '<em>Task Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ASPECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.TaskOImpl <em>Task O</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TaskOImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTaskO()
	 * @generated
	 */
	int TASK_O = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_O__CORE = TASK_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_O__REQUIRED_ROLES = TASK_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Follows Up On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_O__FOLLOWS_UP_ON = TASK_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_O__NAME = TASK_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_O_FEATURE_COUNT = TASK_ASPECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link workflow.ActivityAspect <em>Activity Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.ActivityAspect
	 * @see workflow.impl.WorkflowPackageImpl#getActivityAspect()
	 * @generated
	 */
	int ACTIVITY_ASPECT = 31;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__TASK = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__CORE = 1;

	/**
	 * The number of structural features of the '<em>Activity Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.ActivityOImpl <em>Activity O</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ActivityOImpl
	 * @see workflow.impl.WorkflowPackageImpl#getActivityO()
	 * @generated
	 */
	int ACTIVITY_O = 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_O__TASK = ACTIVITY_ASPECT__TASK;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_O__CORE = ACTIVITY_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_O__ASSIGNED_TO = ACTIVITY_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_O_FEATURE_COUNT = ACTIVITY_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.RoleImpl
	 * @see workflow.impl.WorkflowPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CaseImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__STARTED = 2;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__FINISHED = 3;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ASPECTS = 4;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ACTIVITIES = 5;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__PROCESS = 6;

	/**
	 * The feature id for the '<em><b>Runtime Core Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__RUNTIME_CORE_MODEL = 7;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link workflow.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ActivityImpl
	 * @see workflow.impl.WorkflowPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STARTED = 0;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FINISHED = 1;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ASPECTS = 2;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TASK = 3;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EREFERENCE0 = 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link workflow.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.AgentImpl
	 * @see workflow.impl.WorkflowPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 5;

	/**
	 * The feature id for the '<em><b>Taken Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TAKEN_ROLES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ACTIVE = 4;

	/**
	 * The feature id for the '<em><b>May Take Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MAY_TAKE_ROLES = 5;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link workflow.impl.RuntimeInformationImpl <em>Runtime Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.RuntimeInformationImpl
	 * @see workflow.impl.WorkflowPackageImpl#getRuntimeInformation()
	 * @generated
	 */
	int RUNTIME_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Case Id Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION__CASE_ID_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Runtime Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.TaskCImpl <em>Task C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TaskCImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTaskC()
	 * @generated
	 */
	int TASK_C = 7;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_C__CORE = TASK_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_C__NAME = TASK_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_C_FEATURE_COUNT = TASK_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.ActivityCImpl <em>Activity C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ActivityCImpl
	 * @see workflow.impl.WorkflowPackageImpl#getActivityC()
	 * @generated
	 */
	int ACTIVITY_C = 8;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_C__TASK = ACTIVITY_ASPECT__TASK;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_C__CORE = ACTIVITY_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_C__CASE = ACTIVITY_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_C_FEATURE_COUNT = ACTIVITY_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.ProcessAspect <em>Process Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.ProcessAspect
	 * @see workflow.impl.WorkflowPackageImpl#getProcessAspect()
	 * @generated
	 */
	int PROCESS_ASPECT = 27;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ASPECT__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ASPECT__CORE = 1;

	/**
	 * The number of structural features of the '<em>Process Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ASPECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ControlImpl
	 * @see workflow.impl.WorkflowPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 9;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TASKS = PROCESS_ASPECT__TASKS;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CORE = PROCESS_ASPECT__CORE;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = PROCESS_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.CaseAspect <em>Case Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.CaseAspect
	 * @see workflow.impl.WorkflowPackageImpl#getCaseAspect()
	 * @generated
	 */
	int CASE_ASPECT = 30;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ASPECT__PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ASPECT__CORE = 1;

	/**
	 * The number of structural features of the '<em>Case Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ASPECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.CaseCImpl <em>Case C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CaseCImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCaseC()
	 * @generated
	 */
	int CASE_C = 10;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_C__PROCESS = CASE_ASPECT__PROCESS;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_C__CORE = CASE_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_C__STATE = CASE_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_C_FEATURE_COUNT = CASE_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.StateImpl
	 * @see workflow.impl.WorkflowPackageImpl#getState()
	 * @generated
	 */
	int STATE = 11;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.PetriNetImpl
	 * @see workflow.impl.WorkflowPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 12;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TASKS = CONTROL__TASKS;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__CORE = CONTROL__CORE;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ARCS = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PLACES = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__START = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__FINISH = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link workflow.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TransitionImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CORE = TASK_C__CORE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = TASK_C__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = TASK_C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = TASK_C_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = TASK_C_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ArcImpl
	 * @see workflow.impl.WorkflowPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 14;

	/**
	 * The feature id for the '<em><b>Source Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Target Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET_PLACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = 2;

	/**
	 * The feature id for the '<em><b>Source Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Target Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET_TRANSITION = 4;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link workflow.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.PlaceImpl
	 * @see workflow.impl.WorkflowPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.MarkingImpl
	 * @see workflow.impl.WorkflowPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 16;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__TOKENS = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Petrinet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__PETRINET = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TokenImpl
	 * @see workflow.impl.WorkflowPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 17;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__PLACE = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.ModelRegistryImpl <em>Model Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ModelRegistryImpl
	 * @see workflow.impl.WorkflowPackageImpl#getModelRegistry()
	 * @generated
	 */
	int MODEL_REGISTRY = 18;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__ENGINE = 0;

	/**
	 * The feature id for the '<em><b>Core Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__CORE_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Global Aspects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY__GLOBAL_ASPECTS = 2;

	/**
	 * The number of structural features of the '<em>Model Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REGISTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.InformationImpl
	 * @see workflow.impl.WorkflowPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 19;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TASKS = PROCESS_ASPECT__TASKS;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CORE = PROCESS_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Process Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__PROCESS_DOCUMENTS = PROCESS_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = PROCESS_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.TaskIImpl <em>Task I</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TaskIImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTaskI()
	 * @generated
	 */
	int TASK_I = 20;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_I__CORE = TASK_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_I__IN = TASK_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_I__OUT = TASK_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_I__START = TASK_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_I__FINISH = TASK_ASPECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_I_FEATURE_COUNT = TASK_ASPECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link workflow.impl.DocumentDescriptorImpl <em>Document Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DocumentDescriptorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDocumentDescriptor()
	 * @generated
	 */
	int DOCUMENT_DESCRIPTOR = 21;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DESCRIPTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Process Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT = 2;

	/**
	 * The number of structural features of the '<em>Document Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DESCRIPTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DocumentTypeImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.ActivityIImpl <em>Activity I</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ActivityIImpl
	 * @see workflow.impl.WorkflowPackageImpl#getActivityI()
	 * @generated
	 */
	int ACTIVITY_I = 23;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_I__TASK = ACTIVITY_ASPECT__TASK;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_I__CORE = ACTIVITY_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_I__IN = ACTIVITY_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_I__OUT = ACTIVITY_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_I_FEATURE_COUNT = ACTIVITY_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DocumentImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 24;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.CaseIImpl <em>Case I</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CaseIImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCaseI()
	 * @generated
	 */
	int CASE_I = 25;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_I__PROCESS = CASE_ASPECT__PROCESS;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_I__CORE = CASE_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Case Documents</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_I__CASE_DOCUMENTS = CASE_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_I_FEATURE_COUNT = CASE_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.ModelAspect <em>Model Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.ModelAspect
	 * @see workflow.impl.WorkflowPackageImpl#getModelAspect()
	 * @generated
	 */
	int MODEL_ASPECT = 26;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASPECT__PROCESS = 0;

	/**
	 * The number of structural features of the '<em>Model Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASPECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.RuntimeModelAspect <em>Runtime Model Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.RuntimeModelAspect
	 * @see workflow.impl.WorkflowPackageImpl#getRuntimeModelAspect()
	 * @generated
	 */
	int RUNTIME_MODEL_ASPECT = 29;

	/**
	 * The number of structural features of the '<em>Runtime Model Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_MODEL_ASPECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.CoreModelImpl <em>Core Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CoreModelImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCoreModel()
	 * @generated
	 */
	int CORE_MODEL = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__ASPECTS = 1;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Model Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL__MODEL_REGISTRY = 3;

	/**
	 * The number of structural features of the '<em>Core Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link workflow.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ProcessImpl
	 * @see workflow.impl.WorkflowPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Core Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CORE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ASPECTS = 3;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link workflow.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.TaskImpl
	 * @see workflow.impl.WorkflowPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASPECTS = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.RuntimeCoreModelImpl <em>Runtime Core Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.RuntimeCoreModelImpl
	 * @see workflow.impl.WorkflowPackageImpl#getRuntimeCoreModel()
	 * @generated
	 */
	int RUNTIME_CORE_MODEL = 35;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CORE_MODEL__ASPECTS = 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CORE_MODEL__CASES = 1;

	/**
	 * The feature id for the '<em><b>Core Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CORE_MODEL__CORE_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Runtime Core Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CORE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.OrganisationAspectImpl <em>Organisation Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.OrganisationAspectImpl
	 * @see workflow.impl.WorkflowPackageImpl#getOrganisationAspect()
	 * @generated
	 */
	int ORGANISATION_ASPECT = 36;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_ASPECT__PROCESS = MODEL_ASPECT__PROCESS;

	/**
	 * The number of structural features of the '<em>Organisation Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_ASPECT_FEATURE_COUNT = MODEL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.ControlAspectImpl <em>Control Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ControlAspectImpl
	 * @see workflow.impl.WorkflowPackageImpl#getControlAspect()
	 * @generated
	 */
	int CONTROL_ASPECT = 37;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ASPECT__PROCESS = MODEL_ASPECT__PROCESS;

	/**
	 * The number of structural features of the '<em>Control Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ASPECT_FEATURE_COUNT = MODEL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.WorkflowEngineImpl <em>Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.WorkflowEngineImpl
	 * @see workflow.impl.WorkflowPackageImpl#getWorkflowEngine()
	 * @generated
	 */
	int WORKFLOW_ENGINE = 38;

	/**
	 * The feature id for the '<em><b>Model Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE__MODEL_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Runtime Core Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE__RUNTIME_CORE_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Runtime Global Aspects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS = 2;

	/**
	 * The number of structural features of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.ProcessOImpl <em>Process O</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ProcessOImpl
	 * @see workflow.impl.WorkflowPackageImpl#getProcessO()
	 * @generated
	 */
	int PROCESS_O = 39;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_O__TASKS = PROCESS_ASPECT__TASKS;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_O__CORE = PROCESS_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Involved</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_O__INVOLVED = PROCESS_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_O_FEATURE_COUNT = PROCESS_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.DocumentConditionImpl <em>Document Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DocumentConditionImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDocumentCondition()
	 * @generated
	 */
	int DOCUMENT_CONDITION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Document Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ExpressionImpl
	 * @see workflow.impl.WorkflowPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 41;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link workflow.impl.DefaultDocumentTypeImpl <em>Default Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DefaultDocumentTypeImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocumentType()
	 * @generated
	 */
	int DEFAULT_DOCUMENT_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_TYPE__NAME = DOCUMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_TYPE__FIELDS = DOCUMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS = DOCUMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_TYPE_FEATURE_COUNT = DOCUMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.DefaultDocumentImpl <em>Default Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DefaultDocumentImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocument()
	 * @generated
	 */
	int DEFAULT_DOCUMENT = 43;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT__DOCUMENT_TYPE = DOCUMENT__DOCUMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT__ID = DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Field Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT__FIELD_VALUES = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum Field Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT__ENUM_FIELD_VALUES = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT__PLACEHOLDER = DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Default Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link workflow.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.FieldImpl
	 * @see workflow.impl.WorkflowPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.FieldValueImpl <em>Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.FieldValueImpl
	 * @see workflow.impl.WorkflowPackageImpl#getFieldValue()
	 * @generated
	 */
	int FIELD_VALUE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__FIELD = 1;

	/**
	 * The number of structural features of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.InformationAspectImpl <em>Information Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.InformationAspectImpl
	 * @see workflow.impl.WorkflowPackageImpl#getInformationAspect()
	 * @generated
	 */
	int INFORMATION_ASPECT = 46;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ASPECT__PROCESS = MODEL_ASPECT__PROCESS;

	/**
	 * The number of structural features of the '<em>Information Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ASPECT_FEATURE_COUNT = MODEL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.CaseOImpl <em>Case O</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.CaseOImpl
	 * @see workflow.impl.WorkflowPackageImpl#getCaseO()
	 * @generated
	 */
	int CASE_O = 47;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_O__PROCESS = CASE_ASPECT__PROCESS;

	/**
	 * The feature id for the '<em><b>Core</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_O__CORE = CASE_ASPECT__CORE;

	/**
	 * The feature id for the '<em><b>Involved</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_O__INVOLVED = CASE_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case O</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_O_FEATURE_COUNT = CASE_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.InformationRuntimeAspectImpl <em>Information Runtime Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.InformationRuntimeAspectImpl
	 * @see workflow.impl.WorkflowPackageImpl#getInformationRuntimeAspect()
	 * @generated
	 */
	int INFORMATION_RUNTIME_ASPECT = 48;

	/**
	 * The number of structural features of the '<em>Information Runtime Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RUNTIME_ASPECT_FEATURE_COUNT = RUNTIME_MODEL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.DefaultDocumentDescriptorImpl <em>Default Document Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DefaultDocumentDescriptorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocumentDescriptor()
	 * @generated
	 */
	int DEFAULT_DOCUMENT_DESCRIPTOR = 49;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE = DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_DESCRIPTOR__NAME = DOCUMENT_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Process Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT = DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT;

	/**
	 * The number of structural features of the '<em>Default Document Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_DESCRIPTOR_FEATURE_COUNT = DOCUMENT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.ProcessDocumentImpl <em>Process Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ProcessDocumentImpl
	 * @see workflow.impl.WorkflowPackageImpl#getProcessDocument()
	 * @generated
	 */
	int PROCESS_DOCUMENT = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DOCUMENT__DOCUMENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Process Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.String2DocumentMapImpl <em>String2 Document Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.String2DocumentMapImpl
	 * @see workflow.impl.WorkflowPackageImpl#getString2DocumentMap()
	 * @generated
	 */
	int STRING2_DOCUMENT_MAP = 51;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_DOCUMENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_DOCUMENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String2 Document Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_DOCUMENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.AtomImpl
	 * @see workflow.impl.WorkflowPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 52;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.OperatorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 53;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERANDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.DocumentDescrAtomImpl <em>Document Descr Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DocumentDescrAtomImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDocumentDescrAtom()
	 * @generated
	 */
	int DOCUMENT_DESCR_ATOM = 54;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DESCR_ATOM__DESCRIPTOR = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document Descr Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DESCR_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.FieldAtomImpl <em>Field Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.FieldAtomImpl
	 * @see workflow.impl.WorkflowPackageImpl#getFieldAtom()
	 * @generated
	 */
	int FIELD_ATOM = 55;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ATOM__FIELD = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.ConstantAtomImpl <em>Constant Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.ConstantAtomImpl
	 * @see workflow.impl.WorkflowPackageImpl#getConstantAtom()
	 * @generated
	 */
	int CONSTANT_ATOM = 56;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ATOM__VALUE = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.DotOperatorImpl <em>Dot Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DotOperatorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDotOperator()
	 * @generated
	 */
	int DOT_OPERATOR = 57;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_OPERATOR__OPERANDS = OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>Dot Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.EqualToOperatorImpl <em>Equal To Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.EqualToOperatorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getEqualToOperator()
	 * @generated
	 */
	int EQUAL_TO_OPERATOR = 58;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR__OPERANDS = OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>Equal To Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.DefaultDocumentConditionImpl <em>Default Document Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DefaultDocumentConditionImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocumentCondition()
	 * @generated
	 */
	int DEFAULT_DOCUMENT_CONDITION = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_CONDITION__NAME = DOCUMENT_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_CONDITION__EXPRESSION = DOCUMENT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Document Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_DOCUMENT_CONDITION_FEATURE_COUNT = DOCUMENT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.EnumFieldImpl <em>Enum Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.EnumFieldImpl
	 * @see workflow.impl.WorkflowPackageImpl#getEnumField()
	 * @generated
	 */
	int ENUM_FIELD = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enum Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__ENUM_LITERALS = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__DEFAULT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Enum Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link workflow.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.EnumLiteralImpl
	 * @see workflow.impl.WorkflowPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.EnumFieldValueImpl <em>Enum Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.EnumFieldValueImpl
	 * @see workflow.impl.WorkflowPackageImpl#getEnumFieldValue()
	 * @generated
	 */
	int ENUM_FIELD_VALUE = 62;

	/**
	 * The feature id for the '<em><b>Enum Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_VALUE__ENUM_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_VALUE__ENUM_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link workflow.impl.LessThanOperatorImpl <em>Less Than Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.LessThanOperatorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getLessThanOperator()
	 * @generated
	 */
	int LESS_THAN_OPERATOR = 63;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR__OPERANDS = OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>Less Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.GreaterThanOperatorImpl <em>Greater Than Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.GreaterThanOperatorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getGreaterThanOperator()
	 * @generated
	 */
	int GREATER_THAN_OPERATOR = 64;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR__OPERANDS = OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>Greater Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.impl.EnumFieldAtomImpl <em>Enum Field Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.EnumFieldAtomImpl
	 * @see workflow.impl.WorkflowPackageImpl#getEnumFieldAtom()
	 * @generated
	 */
	int ENUM_FIELD_ATOM = 65;

	/**
	 * The feature id for the '<em><b>Enum Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_ATOM__ENUM_FIELD = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Field Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.EnumLiteralAtomImpl <em>Enum Literal Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.EnumLiteralAtomImpl
	 * @see workflow.impl.WorkflowPackageImpl#getEnumLiteralAtom()
	 * @generated
	 */
	int ENUM_LITERAL_ATOM = 66;

	/**
	 * The feature id for the '<em><b>Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_ATOM__ENUM_LITERAL = ATOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link workflow.impl.UnequalToOperatorImpl <em>Unequal To Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.UnequalToOperatorImpl
	 * @see workflow.impl.WorkflowPackageImpl#getUnequalToOperator()
	 * @generated
	 */
	int UNEQUAL_TO_OPERATOR = 67;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEQUAL_TO_OPERATOR__OPERANDS = OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>Unequal To Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNEQUAL_TO_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link workflow.RuntimeGlobalAspect <em>Runtime Global Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.RuntimeGlobalAspect
	 * @see workflow.impl.WorkflowPackageImpl#getRuntimeGlobalAspect()
	 * @generated
	 */
	int RUNTIME_GLOBAL_ASPECT = 71;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_GLOBAL_ASPECT__ENGINE = 0;

	/**
	 * The number of structural features of the '<em>Runtime Global Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_GLOBAL_ASPECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.AgentContainerImpl <em>Agent Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.AgentContainerImpl
	 * @see workflow.impl.WorkflowPackageImpl#getAgentContainer()
	 * @generated
	 */
	int AGENT_CONTAINER = 68;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER__ENGINE = RUNTIME_GLOBAL_ASPECT__ENGINE;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER__AGENTS = RUNTIME_GLOBAL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER__NAME = RUNTIME_GLOBAL_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agent Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CONTAINER_FEATURE_COUNT = RUNTIME_GLOBAL_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.GlobalAspect <em>Global Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.GlobalAspect
	 * @see workflow.impl.WorkflowPackageImpl#getGlobalAspect()
	 * @generated
	 */
	int GLOBAL_ASPECT = 70;

	/**
	 * The feature id for the '<em><b>Model Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ASPECT__MODEL_REGISTRY = 0;

	/**
	 * The number of structural features of the '<em>Global Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ASPECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link workflow.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.OrganisationImpl
	 * @see workflow.impl.WorkflowPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 69;

	/**
	 * The feature id for the '<em><b>Model Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__MODEL_REGISTRY = GLOBAL_ASPECT__MODEL_REGISTRY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = GLOBAL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ROLES = GLOBAL_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = GLOBAL_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.DocumentTypeContainerImpl <em>Document Type Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DocumentTypeContainerImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDocumentTypeContainer()
	 * @generated
	 */
	int DOCUMENT_TYPE_CONTAINER = 72;

	/**
	 * The feature id for the '<em><b>Model Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY = GLOBAL_ASPECT__MODEL_REGISTRY;

	/**
	 * The feature id for the '<em><b>Document Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES = GLOBAL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_CONTAINER__NAME = GLOBAL_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Type Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_CONTAINER_FEATURE_COUNT = GLOBAL_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link workflow.impl.DocumentContainerImpl <em>Document Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see workflow.impl.DocumentContainerImpl
	 * @see workflow.impl.WorkflowPackageImpl#getDocumentContainer()
	 * @generated
	 */
	int DOCUMENT_CONTAINER = 73;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTAINER__ENGINE = RUNTIME_GLOBAL_ASPECT__ENGINE;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTAINER__DOCUMENTS = RUNTIME_GLOBAL_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTAINER__NAME = RUNTIME_GLOBAL_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_CONTAINER_FEATURE_COUNT = RUNTIME_GLOBAL_ASPECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>My String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see workflow.impl.WorkflowPackageImpl#getMyString()
	 * @generated
	 */
	int MY_STRING = 74;

	/**
	 * The meta object id for the '<em>My List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see workflow.impl.WorkflowPackageImpl#getMyList()
	 * @generated
	 */
	int MY_LIST = 75;


	/**
	 * Returns the meta object for class '{@link workflow.TaskO <em>Task O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task O</em>'.
	 * @see workflow.TaskO
	 * @generated
	 */
	EClass getTaskO();

	/**
	 * Returns the meta object for the reference list '{@link workflow.TaskO#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Roles</em>'.
	 * @see workflow.TaskO#getRequiredRoles()
	 * @see #getTaskO()
	 * @generated
	 */
	EReference getTaskO_RequiredRoles();

	/**
	 * Returns the meta object for the reference '{@link workflow.TaskO#getFollowsUpOn <em>Follows Up On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Follows Up On</em>'.
	 * @see workflow.TaskO#getFollowsUpOn()
	 * @see #getTaskO()
	 * @generated
	 */
	EReference getTaskO_FollowsUpOn();

	/**
	 * Returns the meta object for the attribute '{@link workflow.TaskO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.TaskO#getName()
	 * @see #getTaskO()
	 * @generated
	 */
	EAttribute getTaskO_Name();

	/**
	 * Returns the meta object for class '{@link workflow.ActivityO <em>Activity O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity O</em>'.
	 * @see workflow.ActivityO
	 * @generated
	 */
	EClass getActivityO();

	/**
	 * Returns the meta object for the reference '{@link workflow.ActivityO#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned To</em>'.
	 * @see workflow.ActivityO#getAssignedTo()
	 * @see #getActivityO()
	 * @generated
	 */
	EReference getActivityO_AssignedTo();

	/**
	 * Returns the meta object for class '{@link workflow.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see workflow.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link workflow.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see workflow.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Case#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see workflow.Case#getId()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Id();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Case#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client</em>'.
	 * @see workflow.Case#getClient()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Client();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Case#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see workflow.Case#isStarted()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Started();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Case#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see workflow.Case#isFinished()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Finished();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Case#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see workflow.Case#getAspects()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Aspects();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Case#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see workflow.Case#getActivities()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Activities();

	/**
	 * Returns the meta object for the reference '{@link workflow.Case#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see workflow.Case#getProcess()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Process();

	/**
	 * Returns the meta object for the container reference '{@link workflow.Case#getRuntimeCoreModel <em>Runtime Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Runtime Core Model</em>'.
	 * @see workflow.Case#getRuntimeCoreModel()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_RuntimeCoreModel();

	/**
	 * Returns the meta object for class '{@link workflow.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see workflow.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Activity#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see workflow.Activity#isStarted()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Started();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Activity#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see workflow.Activity#isFinished()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Finished();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Activity#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see workflow.Activity#getAspects()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Aspects();

	/**
	 * Returns the meta object for the reference '{@link workflow.Activity#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see workflow.Activity#getTask()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Task();

	/**
	 * Returns the meta object for the reference '{@link workflow.Activity#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see workflow.Activity#getEReference0()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_EReference0();

	/**
	 * Returns the meta object for class '{@link workflow.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see workflow.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Agent#getTakenRoles <em>Taken Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Taken Roles</em>'.
	 * @see workflow.Agent#getTakenRoles()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_TakenRoles();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Agent#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see workflow.Agent#getUsername()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Username();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Agent#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see workflow.Agent#getPassword()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Password();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Agent#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active</em>'.
	 * @see workflow.Agent#getActive()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Active();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Agent#getMayTakeRoles <em>May Take Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>May Take Roles</em>'.
	 * @see workflow.Agent#getMayTakeRoles()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_MayTakeRoles();

	/**
	 * Returns the meta object for class '{@link workflow.RuntimeInformation <em>Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Information</em>'.
	 * @see workflow.RuntimeInformation
	 * @generated
	 */
	EClass getRuntimeInformation();

	/**
	 * Returns the meta object for the attribute '{@link workflow.RuntimeInformation#getCaseIdCount <em>Case Id Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Id Count</em>'.
	 * @see workflow.RuntimeInformation#getCaseIdCount()
	 * @see #getRuntimeInformation()
	 * @generated
	 */
	EAttribute getRuntimeInformation_CaseIdCount();

	/**
	 * Returns the meta object for class '{@link workflow.TaskC <em>Task C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task C</em>'.
	 * @see workflow.TaskC
	 * @generated
	 */
	EClass getTaskC();

	/**
	 * Returns the meta object for the attribute '{@link workflow.TaskC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.TaskC#getName()
	 * @see #getTaskC()
	 * @generated
	 */
	EAttribute getTaskC_Name();

	/**
	 * Returns the meta object for class '{@link workflow.ActivityC <em>Activity C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity C</em>'.
	 * @see workflow.ActivityC
	 * @generated
	 */
	EClass getActivityC();

	/**
	 * Returns the meta object for the reference '{@link workflow.ActivityC#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Case</em>'.
	 * @see workflow.ActivityC#getCase()
	 * @see #getActivityC()
	 * @generated
	 */
	EReference getActivityC_Case();

	/**
	 * Returns the meta object for class '{@link workflow.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see workflow.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for class '{@link workflow.CaseC <em>Case C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case C</em>'.
	 * @see workflow.CaseC
	 * @generated
	 */
	EClass getCaseC();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.CaseC#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see workflow.CaseC#getState()
	 * @see #getCaseC()
	 * @generated
	 */
	EReference getCaseC_State();

	/**
	 * Returns the meta object for class '{@link workflow.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see workflow.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link workflow.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see workflow.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.PetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see workflow.PetriNet#getArcs()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.PetriNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see workflow.PetriNet#getPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Places();

	/**
	 * Returns the meta object for the reference '{@link workflow.PetriNet#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see workflow.PetriNet#getStart()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Start();

	/**
	 * Returns the meta object for the reference '{@link workflow.PetriNet#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finish</em>'.
	 * @see workflow.PetriNet#getFinish()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Finish();

	/**
	 * Returns the meta object for class '{@link workflow.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see workflow.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Transition#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see workflow.Transition#getOut()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Out();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Transition#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see workflow.Transition#getIn()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_In();

	/**
	 * Returns the meta object for class '{@link workflow.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see workflow.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link workflow.Arc#getSourcePlace <em>Source Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Place</em>'.
	 * @see workflow.Arc#getSourcePlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_SourcePlace();

	/**
	 * Returns the meta object for the reference '{@link workflow.Arc#getTargetPlace <em>Target Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Place</em>'.
	 * @see workflow.Arc#getTargetPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_TargetPlace();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Arc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Arc#getName()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Name();

	/**
	 * Returns the meta object for the reference '{@link workflow.Arc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Transition</em>'.
	 * @see workflow.Arc#getSourceTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_SourceTransition();

	/**
	 * Returns the meta object for the reference '{@link workflow.Arc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Transition</em>'.
	 * @see workflow.Arc#getTargetTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_TargetTransition();

	/**
	 * Returns the meta object for class '{@link workflow.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see workflow.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Place#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see workflow.Place#getIn()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_In();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Place#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see workflow.Place#getOut()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Out();

	/**
	 * Returns the meta object for class '{@link workflow.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see workflow.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Marking#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see workflow.Marking#getTokens()
	 * @see #getMarking()
	 * @generated
	 */
	EReference getMarking_Tokens();

	/**
	 * Returns the meta object for the reference '{@link workflow.Marking#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petrinet</em>'.
	 * @see workflow.Marking#getPetrinet()
	 * @see #getMarking()
	 * @generated
	 */
	EReference getMarking_Petrinet();

	/**
	 * Returns the meta object for class '{@link workflow.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see workflow.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link workflow.Token#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see workflow.Token#getPlace()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Place();

	/**
	 * Returns the meta object for class '{@link workflow.ModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Registry</em>'.
	 * @see workflow.ModelRegistry
	 * @generated
	 */
	EClass getModelRegistry();

	/**
	 * Returns the meta object for the reference '{@link workflow.ModelRegistry#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine</em>'.
	 * @see workflow.ModelRegistry#getEngine()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_Engine();

	/**
	 * Returns the meta object for the reference list '{@link workflow.ModelRegistry#getCoreModels <em>Core Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Core Models</em>'.
	 * @see workflow.ModelRegistry#getCoreModels()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_CoreModels();

	/**
	 * Returns the meta object for the reference list '{@link workflow.ModelRegistry#getGlobalAspects <em>Global Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Global Aspects</em>'.
	 * @see workflow.ModelRegistry#getGlobalAspects()
	 * @see #getModelRegistry()
	 * @generated
	 */
	EReference getModelRegistry_GlobalAspects();

	/**
	 * Returns the meta object for class '{@link workflow.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see workflow.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Information#getProcessDocuments <em>Process Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Documents</em>'.
	 * @see workflow.Information#getProcessDocuments()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_ProcessDocuments();

	/**
	 * Returns the meta object for class '{@link workflow.TaskI <em>Task I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task I</em>'.
	 * @see workflow.TaskI
	 * @generated
	 */
	EClass getTaskI();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.TaskI#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see workflow.TaskI#getIn()
	 * @see #getTaskI()
	 * @generated
	 */
	EReference getTaskI_In();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.TaskI#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out</em>'.
	 * @see workflow.TaskI#getOut()
	 * @see #getTaskI()
	 * @generated
	 */
	EReference getTaskI_Out();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.TaskI#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start</em>'.
	 * @see workflow.TaskI#getStart()
	 * @see #getTaskI()
	 * @generated
	 */
	EReference getTaskI_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.TaskI#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finish</em>'.
	 * @see workflow.TaskI#getFinish()
	 * @see #getTaskI()
	 * @generated
	 */
	EReference getTaskI_Finish();

	/**
	 * Returns the meta object for class '{@link workflow.DocumentDescriptor <em>Document Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Descriptor</em>'.
	 * @see workflow.DocumentDescriptor
	 * @generated
	 */
	EClass getDocumentDescriptor();

	/**
	 * Returns the meta object for the reference '{@link workflow.DocumentDescriptor#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document Type</em>'.
	 * @see workflow.DocumentDescriptor#getDocumentType()
	 * @see #getDocumentDescriptor()
	 * @generated
	 */
	EReference getDocumentDescriptor_DocumentType();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DocumentDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.DocumentDescriptor#getName()
	 * @see #getDocumentDescriptor()
	 * @generated
	 */
	EAttribute getDocumentDescriptor_Name();

	/**
	 * Returns the meta object for the reference '{@link workflow.DocumentDescriptor#getProcessDocument <em>Process Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Document</em>'.
	 * @see workflow.DocumentDescriptor#getProcessDocument()
	 * @see #getDocumentDescriptor()
	 * @generated
	 */
	EReference getDocumentDescriptor_ProcessDocument();

	/**
	 * Returns the meta object for class '{@link workflow.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type</em>'.
	 * @see workflow.DocumentType
	 * @generated
	 */
	EClass getDocumentType();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DocumentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.DocumentType#getName()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_Name();

	/**
	 * Returns the meta object for class '{@link workflow.ActivityI <em>Activity I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity I</em>'.
	 * @see workflow.ActivityI
	 * @generated
	 */
	EClass getActivityI();

	/**
	 * Returns the meta object for the reference list '{@link workflow.ActivityI#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see workflow.ActivityI#getIn()
	 * @see #getActivityI()
	 * @generated
	 */
	EReference getActivityI_In();

	/**
	 * Returns the meta object for the reference list '{@link workflow.ActivityI#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see workflow.ActivityI#getOut()
	 * @see #getActivityI()
	 * @generated
	 */
	EReference getActivityI_Out();

	/**
	 * Returns the meta object for class '{@link workflow.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see workflow.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the reference '{@link workflow.Document#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document Type</em>'.
	 * @see workflow.Document#getDocumentType()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_DocumentType();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Document#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see workflow.Document#getId()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Id();

	/**
	 * Returns the meta object for class '{@link workflow.CaseI <em>Case I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case I</em>'.
	 * @see workflow.CaseI
	 * @generated
	 */
	EClass getCaseI();

	/**
	 * Returns the meta object for the map '{@link workflow.CaseI#getCaseDocuments <em>Case Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Case Documents</em>'.
	 * @see workflow.CaseI#getCaseDocuments()
	 * @see #getCaseI()
	 * @generated
	 */
	EReference getCaseI_CaseDocuments();

	/**
	 * Returns the meta object for class '{@link workflow.ModelAspect <em>Model Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Aspect</em>'.
	 * @see workflow.ModelAspect
	 * @generated
	 */
	EClass getModelAspect();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.ModelAspect#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see workflow.ModelAspect#getProcess()
	 * @see #getModelAspect()
	 * @generated
	 */
	EReference getModelAspect_Process();

	/**
	 * Returns the meta object for class '{@link workflow.ProcessAspect <em>Process Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Aspect</em>'.
	 * @see workflow.ProcessAspect
	 * @generated
	 */
	EClass getProcessAspect();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.ProcessAspect#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see workflow.ProcessAspect#getTasks()
	 * @see #getProcessAspect()
	 * @generated
	 */
	EReference getProcessAspect_Tasks();

	/**
	 * Returns the meta object for the reference '{@link workflow.ProcessAspect#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see workflow.ProcessAspect#getCore()
	 * @see #getProcessAspect()
	 * @generated
	 */
	EReference getProcessAspect_Core();

	/**
	 * Returns the meta object for class '{@link workflow.TaskAspect <em>Task Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Aspect</em>'.
	 * @see workflow.TaskAspect
	 * @generated
	 */
	EClass getTaskAspect();

	/**
	 * Returns the meta object for the reference '{@link workflow.TaskAspect#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see workflow.TaskAspect#getCore()
	 * @see #getTaskAspect()
	 * @generated
	 */
	EReference getTaskAspect_Core();

	/**
	 * Returns the meta object for class '{@link workflow.RuntimeModelAspect <em>Runtime Model Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Model Aspect</em>'.
	 * @see workflow.RuntimeModelAspect
	 * @generated
	 */
	EClass getRuntimeModelAspect();

	/**
	 * Returns the meta object for class '{@link workflow.CaseAspect <em>Case Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Aspect</em>'.
	 * @see workflow.CaseAspect
	 * @generated
	 */
	EClass getCaseAspect();

	/**
	 * Returns the meta object for the reference '{@link workflow.CaseAspect#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see workflow.CaseAspect#getProcess()
	 * @see #getCaseAspect()
	 * @generated
	 */
	EReference getCaseAspect_Process();

	/**
	 * Returns the meta object for the container reference '{@link workflow.CaseAspect#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core</em>'.
	 * @see workflow.CaseAspect#getCore()
	 * @see #getCaseAspect()
	 * @generated
	 */
	EReference getCaseAspect_Core();

	/**
	 * Returns the meta object for class '{@link workflow.ActivityAspect <em>Activity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Aspect</em>'.
	 * @see workflow.ActivityAspect
	 * @generated
	 */
	EClass getActivityAspect();

	/**
	 * Returns the meta object for the reference '{@link workflow.ActivityAspect#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see workflow.ActivityAspect#getTask()
	 * @see #getActivityAspect()
	 * @generated
	 */
	EReference getActivityAspect_Task();

	/**
	 * Returns the meta object for the container reference '{@link workflow.ActivityAspect#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core</em>'.
	 * @see workflow.ActivityAspect#getCore()
	 * @see #getActivityAspect()
	 * @generated
	 */
	EReference getActivityAspect_Core();

	/**
	 * Returns the meta object for class '{@link workflow.CoreModel <em>Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Model</em>'.
	 * @see workflow.CoreModel
	 * @generated
	 */
	EClass getCoreModel();

	/**
	 * Returns the meta object for the attribute '{@link workflow.CoreModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.CoreModel#getName()
	 * @see #getCoreModel()
	 * @generated
	 */
	EAttribute getCoreModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.CoreModel#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see workflow.CoreModel#getAspects()
	 * @see #getCoreModel()
	 * @generated
	 */
	EReference getCoreModel_Aspects();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.CoreModel#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see workflow.CoreModel#getProcess()
	 * @see #getCoreModel()
	 * @generated
	 */
	EReference getCoreModel_Process();

	/**
	 * Returns the meta object for the reference '{@link workflow.CoreModel#getModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Registry</em>'.
	 * @see workflow.CoreModel#getModelRegistry()
	 * @see #getCoreModel()
	 * @generated
	 */
	EReference getCoreModel_ModelRegistry();

	/**
	 * Returns the meta object for class '{@link workflow.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see workflow.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Process#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see workflow.Process#getTasks()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Tasks();

	/**
	 * Returns the meta object for the container reference '{@link workflow.Process#getCoreModel <em>Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Core Model</em>'.
	 * @see workflow.Process#getCoreModel()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CoreModel();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Process#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aspects</em>'.
	 * @see workflow.Process#getAspects()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Aspects();

	/**
	 * Returns the meta object for class '{@link workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see workflow.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the reference list '{@link workflow.Task#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aspects</em>'.
	 * @see workflow.Task#getAspects()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Aspects();

	/**
	 * Returns the meta object for class '{@link workflow.RuntimeCoreModel <em>Runtime Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Core Model</em>'.
	 * @see workflow.RuntimeCoreModel
	 * @generated
	 */
	EClass getRuntimeCoreModel();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.RuntimeCoreModel#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see workflow.RuntimeCoreModel#getAspects()
	 * @see #getRuntimeCoreModel()
	 * @generated
	 */
	EReference getRuntimeCoreModel_Aspects();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.RuntimeCoreModel#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see workflow.RuntimeCoreModel#getCases()
	 * @see #getRuntimeCoreModel()
	 * @generated
	 */
	EReference getRuntimeCoreModel_Cases();

	/**
	 * Returns the meta object for the reference '{@link workflow.RuntimeCoreModel#getCoreModel <em>Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Model</em>'.
	 * @see workflow.RuntimeCoreModel#getCoreModel()
	 * @see #getRuntimeCoreModel()
	 * @generated
	 */
	EReference getRuntimeCoreModel_CoreModel();

	/**
	 * Returns the meta object for class '{@link workflow.OrganisationAspect <em>Organisation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Aspect</em>'.
	 * @see workflow.OrganisationAspect
	 * @generated
	 */
	EClass getOrganisationAspect();

	/**
	 * Returns the meta object for class '{@link workflow.ControlAspect <em>Control Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Aspect</em>'.
	 * @see workflow.ControlAspect
	 * @generated
	 */
	EClass getControlAspect();

	/**
	 * Returns the meta object for class '{@link workflow.WorkflowEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine</em>'.
	 * @see workflow.WorkflowEngine
	 * @generated
	 */
	EClass getWorkflowEngine();

	/**
	 * Returns the meta object for the reference '{@link workflow.WorkflowEngine#getModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Registry</em>'.
	 * @see workflow.WorkflowEngine#getModelRegistry()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	EReference getWorkflowEngine_ModelRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.WorkflowEngine#getRuntimeCoreModels <em>Runtime Core Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Core Models</em>'.
	 * @see workflow.WorkflowEngine#getRuntimeCoreModels()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	EReference getWorkflowEngine_RuntimeCoreModels();

	/**
	 * Returns the meta object for the reference list '{@link workflow.WorkflowEngine#getRuntimeGlobalAspects <em>Runtime Global Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runtime Global Aspects</em>'.
	 * @see workflow.WorkflowEngine#getRuntimeGlobalAspects()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	EReference getWorkflowEngine_RuntimeGlobalAspects();

	/**
	 * Returns the meta object for class '{@link workflow.ProcessO <em>Process O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process O</em>'.
	 * @see workflow.ProcessO
	 * @generated
	 */
	EClass getProcessO();

	/**
	 * Returns the meta object for the reference list '{@link workflow.ProcessO#getInvolved <em>Involved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved</em>'.
	 * @see workflow.ProcessO#getInvolved()
	 * @see #getProcessO()
	 * @generated
	 */
	EReference getProcessO_Involved();

	/**
	 * Returns the meta object for class '{@link workflow.DocumentCondition <em>Document Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Condition</em>'.
	 * @see workflow.DocumentCondition
	 * @generated
	 */
	EClass getDocumentCondition();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DocumentCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.DocumentCondition#getName()
	 * @see #getDocumentCondition()
	 * @generated
	 */
	EAttribute getDocumentCondition_Name();

	/**
	 * Returns the meta object for class '{@link workflow.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see workflow.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link workflow.DefaultDocumentType <em>Default Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Document Type</em>'.
	 * @see workflow.DefaultDocumentType
	 * @generated
	 */
	EClass getDefaultDocumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.DefaultDocumentType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see workflow.DefaultDocumentType#getFields()
	 * @see #getDefaultDocumentType()
	 * @generated
	 */
	EReference getDefaultDocumentType_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.DefaultDocumentType#getEnumFields <em>Enum Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Fields</em>'.
	 * @see workflow.DefaultDocumentType#getEnumFields()
	 * @see #getDefaultDocumentType()
	 * @generated
	 */
	EReference getDefaultDocumentType_EnumFields();

	/**
	 * Returns the meta object for class '{@link workflow.DefaultDocument <em>Default Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Document</em>'.
	 * @see workflow.DefaultDocument
	 * @generated
	 */
	EClass getDefaultDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.DefaultDocument#getFieldValues <em>Field Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Values</em>'.
	 * @see workflow.DefaultDocument#getFieldValues()
	 * @see #getDefaultDocument()
	 * @generated
	 */
	EReference getDefaultDocument_FieldValues();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.DefaultDocument#getEnumFieldValues <em>Enum Field Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Field Values</em>'.
	 * @see workflow.DefaultDocument#getEnumFieldValues()
	 * @see #getDefaultDocument()
	 * @generated
	 */
	EReference getDefaultDocument_EnumFieldValues();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DefaultDocument#isPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see workflow.DefaultDocument#isPlaceholder()
	 * @see #getDefaultDocument()
	 * @generated
	 */
	EAttribute getDefaultDocument_Placeholder();

	/**
	 * Returns the meta object for class '{@link workflow.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see workflow.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for class '{@link workflow.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Value</em>'.
	 * @see workflow.FieldValue
	 * @generated
	 */
	EClass getFieldValue();

	/**
	 * Returns the meta object for the attribute '{@link workflow.FieldValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see workflow.FieldValue#getValue()
	 * @see #getFieldValue()
	 * @generated
	 */
	EAttribute getFieldValue_Value();

	/**
	 * Returns the meta object for the reference '{@link workflow.FieldValue#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see workflow.FieldValue#getField()
	 * @see #getFieldValue()
	 * @generated
	 */
	EReference getFieldValue_Field();

	/**
	 * Returns the meta object for class '{@link workflow.InformationAspect <em>Information Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Aspect</em>'.
	 * @see workflow.InformationAspect
	 * @generated
	 */
	EClass getInformationAspect();

	/**
	 * Returns the meta object for class '{@link workflow.CaseO <em>Case O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case O</em>'.
	 * @see workflow.CaseO
	 * @generated
	 */
	EClass getCaseO();

	/**
	 * Returns the meta object for the reference list '{@link workflow.CaseO#getInvolved <em>Involved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved</em>'.
	 * @see workflow.CaseO#getInvolved()
	 * @see #getCaseO()
	 * @generated
	 */
	EReference getCaseO_Involved();

	/**
	 * Returns the meta object for class '{@link workflow.InformationRuntimeAspect <em>Information Runtime Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Runtime Aspect</em>'.
	 * @see workflow.InformationRuntimeAspect
	 * @generated
	 */
	EClass getInformationRuntimeAspect();

	/**
	 * Returns the meta object for class '{@link workflow.DefaultDocumentDescriptor <em>Default Document Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Document Descriptor</em>'.
	 * @see workflow.DefaultDocumentDescriptor
	 * @generated
	 */
	EClass getDefaultDocumentDescriptor();

	/**
	 * Returns the meta object for class '{@link workflow.ProcessDocument <em>Process Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Document</em>'.
	 * @see workflow.ProcessDocument
	 * @generated
	 */
	EClass getProcessDocument();

	/**
	 * Returns the meta object for the attribute '{@link workflow.ProcessDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.ProcessDocument#getName()
	 * @see #getProcessDocument()
	 * @generated
	 */
	EAttribute getProcessDocument_Name();

	/**
	 * Returns the meta object for the reference '{@link workflow.ProcessDocument#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document Type</em>'.
	 * @see workflow.ProcessDocument#getDocumentType()
	 * @see #getProcessDocument()
	 * @generated
	 */
	EReference getProcessDocument_DocumentType();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String2 Document Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String2 Document Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="workflow.Document" valueRequired="true"
	 * @generated
	 */
	EClass getString2DocumentMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getString2DocumentMap()
	 * @generated
	 */
	EAttribute getString2DocumentMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getString2DocumentMap()
	 * @generated
	 */
	EReference getString2DocumentMap_Value();

	/**
	 * Returns the meta object for class '{@link workflow.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see workflow.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for class '{@link workflow.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see workflow.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Operator#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see workflow.Operator#getOperands()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Operands();

	/**
	 * Returns the meta object for class '{@link workflow.DocumentDescrAtom <em>Document Descr Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Descr Atom</em>'.
	 * @see workflow.DocumentDescrAtom
	 * @generated
	 */
	EClass getDocumentDescrAtom();

	/**
	 * Returns the meta object for the reference '{@link workflow.DocumentDescrAtom#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see workflow.DocumentDescrAtom#getDescriptor()
	 * @see #getDocumentDescrAtom()
	 * @generated
	 */
	EReference getDocumentDescrAtom_Descriptor();

	/**
	 * Returns the meta object for class '{@link workflow.FieldAtom <em>Field Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Atom</em>'.
	 * @see workflow.FieldAtom
	 * @generated
	 */
	EClass getFieldAtom();

	/**
	 * Returns the meta object for the reference '{@link workflow.FieldAtom#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see workflow.FieldAtom#getField()
	 * @see #getFieldAtom()
	 * @generated
	 */
	EReference getFieldAtom_Field();

	/**
	 * Returns the meta object for class '{@link workflow.ConstantAtom <em>Constant Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Atom</em>'.
	 * @see workflow.ConstantAtom
	 * @generated
	 */
	EClass getConstantAtom();

	/**
	 * Returns the meta object for the attribute '{@link workflow.ConstantAtom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see workflow.ConstantAtom#getValue()
	 * @see #getConstantAtom()
	 * @generated
	 */
	EAttribute getConstantAtom_Value();

	/**
	 * Returns the meta object for class '{@link workflow.DotOperator <em>Dot Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Operator</em>'.
	 * @see workflow.DotOperator
	 * @generated
	 */
	EClass getDotOperator();

	/**
	 * Returns the meta object for class '{@link workflow.EqualToOperator <em>Equal To Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal To Operator</em>'.
	 * @see workflow.EqualToOperator
	 * @generated
	 */
	EClass getEqualToOperator();

	/**
	 * Returns the meta object for class '{@link workflow.DefaultDocumentCondition <em>Default Document Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Document Condition</em>'.
	 * @see workflow.DefaultDocumentCondition
	 * @generated
	 */
	EClass getDefaultDocumentCondition();

	/**
	 * Returns the meta object for the containment reference '{@link workflow.DefaultDocumentCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see workflow.DefaultDocumentCondition#getExpression()
	 * @see #getDefaultDocumentCondition()
	 * @generated
	 */
	EReference getDefaultDocumentCondition_Expression();

	/**
	 * Returns the meta object for class '{@link workflow.EnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Field</em>'.
	 * @see workflow.EnumField
	 * @generated
	 */
	EClass getEnumField();

	/**
	 * Returns the meta object for the attribute '{@link workflow.EnumField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.EnumField#getName()
	 * @see #getEnumField()
	 * @generated
	 */
	EAttribute getEnumField_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.EnumField#getEnumLiterals <em>Enum Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Literals</em>'.
	 * @see workflow.EnumField#getEnumLiterals()
	 * @see #getEnumField()
	 * @generated
	 */
	EReference getEnumField_EnumLiterals();

	/**
	 * Returns the meta object for the reference '{@link workflow.EnumField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see workflow.EnumField#getDefaultValue()
	 * @see #getEnumField()
	 * @generated
	 */
	EReference getEnumField_DefaultValue();

	/**
	 * Returns the meta object for class '{@link workflow.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see workflow.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link workflow.EnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.EnumLiteral#getName()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Name();

	/**
	 * Returns the meta object for class '{@link workflow.EnumFieldValue <em>Enum Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Field Value</em>'.
	 * @see workflow.EnumFieldValue
	 * @generated
	 */
	EClass getEnumFieldValue();

	/**
	 * Returns the meta object for the reference '{@link workflow.EnumFieldValue#getEnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Field</em>'.
	 * @see workflow.EnumFieldValue#getEnumField()
	 * @see #getEnumFieldValue()
	 * @generated
	 */
	EReference getEnumFieldValue_EnumField();

	/**
	 * Returns the meta object for the reference '{@link workflow.EnumFieldValue#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Value</em>'.
	 * @see workflow.EnumFieldValue#getEnumValue()
	 * @see #getEnumFieldValue()
	 * @generated
	 */
	EReference getEnumFieldValue_EnumValue();

	/**
	 * Returns the meta object for class '{@link workflow.LessThanOperator <em>Less Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Operator</em>'.
	 * @see workflow.LessThanOperator
	 * @generated
	 */
	EClass getLessThanOperator();

	/**
	 * Returns the meta object for class '{@link workflow.GreaterThanOperator <em>Greater Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Operator</em>'.
	 * @see workflow.GreaterThanOperator
	 * @generated
	 */
	EClass getGreaterThanOperator();

	/**
	 * Returns the meta object for class '{@link workflow.EnumFieldAtom <em>Enum Field Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Field Atom</em>'.
	 * @see workflow.EnumFieldAtom
	 * @generated
	 */
	EClass getEnumFieldAtom();

	/**
	 * Returns the meta object for the reference '{@link workflow.EnumFieldAtom#getEnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Field</em>'.
	 * @see workflow.EnumFieldAtom#getEnumField()
	 * @see #getEnumFieldAtom()
	 * @generated
	 */
	EReference getEnumFieldAtom_EnumField();

	/**
	 * Returns the meta object for class '{@link workflow.EnumLiteralAtom <em>Enum Literal Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Atom</em>'.
	 * @see workflow.EnumLiteralAtom
	 * @generated
	 */
	EClass getEnumLiteralAtom();

	/**
	 * Returns the meta object for the reference '{@link workflow.EnumLiteralAtom#getEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Literal</em>'.
	 * @see workflow.EnumLiteralAtom#getEnumLiteral()
	 * @see #getEnumLiteralAtom()
	 * @generated
	 */
	EReference getEnumLiteralAtom_EnumLiteral();

	/**
	 * Returns the meta object for class '{@link workflow.UnequalToOperator <em>Unequal To Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unequal To Operator</em>'.
	 * @see workflow.UnequalToOperator
	 * @generated
	 */
	EClass getUnequalToOperator();

	/**
	 * Returns the meta object for class '{@link workflow.AgentContainer <em>Agent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Container</em>'.
	 * @see workflow.AgentContainer
	 * @generated
	 */
	EClass getAgentContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.AgentContainer#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see workflow.AgentContainer#getAgents()
	 * @see #getAgentContainer()
	 * @generated
	 */
	EReference getAgentContainer_Agents();

	/**
	 * Returns the meta object for the attribute '{@link workflow.AgentContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.AgentContainer#getName()
	 * @see #getAgentContainer()
	 * @generated
	 */
	EAttribute getAgentContainer_Name();

	/**
	 * Returns the meta object for class '{@link workflow.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see workflow.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link workflow.Organisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.Organisation#getName()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.Organisation#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see workflow.Organisation#getRoles()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Roles();

	/**
	 * Returns the meta object for class '{@link workflow.GlobalAspect <em>Global Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Aspect</em>'.
	 * @see workflow.GlobalAspect
	 * @generated
	 */
	EClass getGlobalAspect();

	/**
	 * Returns the meta object for the reference '{@link workflow.GlobalAspect#getModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Registry</em>'.
	 * @see workflow.GlobalAspect#getModelRegistry()
	 * @see #getGlobalAspect()
	 * @generated
	 */
	EReference getGlobalAspect_ModelRegistry();

	/**
	 * Returns the meta object for class '{@link workflow.RuntimeGlobalAspect <em>Runtime Global Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Global Aspect</em>'.
	 * @see workflow.RuntimeGlobalAspect
	 * @generated
	 */
	EClass getRuntimeGlobalAspect();

	/**
	 * Returns the meta object for the reference '{@link workflow.RuntimeGlobalAspect#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine</em>'.
	 * @see workflow.RuntimeGlobalAspect#getEngine()
	 * @see #getRuntimeGlobalAspect()
	 * @generated
	 */
	EReference getRuntimeGlobalAspect_Engine();

	/**
	 * Returns the meta object for class '{@link workflow.DocumentTypeContainer <em>Document Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type Container</em>'.
	 * @see workflow.DocumentTypeContainer
	 * @generated
	 */
	EClass getDocumentTypeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.DocumentTypeContainer#getDocumentTypes <em>Document Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Types</em>'.
	 * @see workflow.DocumentTypeContainer#getDocumentTypes()
	 * @see #getDocumentTypeContainer()
	 * @generated
	 */
	EReference getDocumentTypeContainer_DocumentTypes();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DocumentTypeContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.DocumentTypeContainer#getName()
	 * @see #getDocumentTypeContainer()
	 * @generated
	 */
	EAttribute getDocumentTypeContainer_Name();

	/**
	 * Returns the meta object for class '{@link workflow.DocumentContainer <em>Document Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Container</em>'.
	 * @see workflow.DocumentContainer
	 * @generated
	 */
	EClass getDocumentContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link workflow.DocumentContainer#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see workflow.DocumentContainer#getDocuments()
	 * @see #getDocumentContainer()
	 * @generated
	 */
	EReference getDocumentContainer_Documents();

	/**
	 * Returns the meta object for the attribute '{@link workflow.DocumentContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see workflow.DocumentContainer#getName()
	 * @see #getDocumentContainer()
	 * @generated
	 */
	EAttribute getDocumentContainer_Name();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>My String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>My String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getMyString();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>My List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>My List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EDataType getMyList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

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
		 * The meta object literal for the '{@link workflow.impl.TaskOImpl <em>Task O</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TaskOImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTaskO()
		 * @generated
		 */
		EClass TASK_O = eINSTANCE.getTaskO();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_O__REQUIRED_ROLES = eINSTANCE.getTaskO_RequiredRoles();

		/**
		 * The meta object literal for the '<em><b>Follows Up On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_O__FOLLOWS_UP_ON = eINSTANCE.getTaskO_FollowsUpOn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_O__NAME = eINSTANCE.getTaskO_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.ActivityOImpl <em>Activity O</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ActivityOImpl
		 * @see workflow.impl.WorkflowPackageImpl#getActivityO()
		 * @generated
		 */
		EClass ACTIVITY_O = eINSTANCE.getActivityO();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_O__ASSIGNED_TO = eINSTANCE.getActivityO_AssignedTo();

		/**
		 * The meta object literal for the '{@link workflow.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.RoleImpl
		 * @see workflow.impl.WorkflowPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CaseImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__ID = eINSTANCE.getCase_Id();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__CLIENT = eINSTANCE.getCase_Client();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__STARTED = eINSTANCE.getCase_Started();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__FINISHED = eINSTANCE.getCase_Finished();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ASPECTS = eINSTANCE.getCase_Aspects();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ACTIVITIES = eINSTANCE.getCase_Activities();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__PROCESS = eINSTANCE.getCase_Process();

		/**
		 * The meta object literal for the '<em><b>Runtime Core Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__RUNTIME_CORE_MODEL = eINSTANCE.getCase_RuntimeCoreModel();

		/**
		 * The meta object literal for the '{@link workflow.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ActivityImpl
		 * @see workflow.impl.WorkflowPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__STARTED = eINSTANCE.getActivity_Started();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__FINISHED = eINSTANCE.getActivity_Finished();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ASPECTS = eINSTANCE.getActivity_Aspects();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TASK = eINSTANCE.getActivity_Task();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EREFERENCE0 = eINSTANCE.getActivity_EReference0();

		/**
		 * The meta object literal for the '{@link workflow.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.AgentImpl
		 * @see workflow.impl.WorkflowPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Taken Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__TAKEN_ROLES = eINSTANCE.getAgent_TakenRoles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__USERNAME = eINSTANCE.getAgent_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__PASSWORD = eINSTANCE.getAgent_Password();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ACTIVE = eINSTANCE.getAgent_Active();

		/**
		 * The meta object literal for the '<em><b>May Take Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__MAY_TAKE_ROLES = eINSTANCE.getAgent_MayTakeRoles();

		/**
		 * The meta object literal for the '{@link workflow.impl.RuntimeInformationImpl <em>Runtime Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.RuntimeInformationImpl
		 * @see workflow.impl.WorkflowPackageImpl#getRuntimeInformation()
		 * @generated
		 */
		EClass RUNTIME_INFORMATION = eINSTANCE.getRuntimeInformation();

		/**
		 * The meta object literal for the '<em><b>Case Id Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INFORMATION__CASE_ID_COUNT = eINSTANCE.getRuntimeInformation_CaseIdCount();

		/**
		 * The meta object literal for the '{@link workflow.impl.TaskCImpl <em>Task C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TaskCImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTaskC()
		 * @generated
		 */
		EClass TASK_C = eINSTANCE.getTaskC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_C__NAME = eINSTANCE.getTaskC_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.ActivityCImpl <em>Activity C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ActivityCImpl
		 * @see workflow.impl.WorkflowPackageImpl#getActivityC()
		 * @generated
		 */
		EClass ACTIVITY_C = eINSTANCE.getActivityC();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_C__CASE = eINSTANCE.getActivityC_Case();

		/**
		 * The meta object literal for the '{@link workflow.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ControlImpl
		 * @see workflow.impl.WorkflowPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '{@link workflow.impl.CaseCImpl <em>Case C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CaseCImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCaseC()
		 * @generated
		 */
		EClass CASE_C = eINSTANCE.getCaseC();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_C__STATE = eINSTANCE.getCaseC_State();

		/**
		 * The meta object literal for the '{@link workflow.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.StateImpl
		 * @see workflow.impl.WorkflowPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link workflow.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.PetriNetImpl
		 * @see workflow.impl.WorkflowPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__ARCS = eINSTANCE.getPetriNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PLACES = eINSTANCE.getPetriNet_Places();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__START = eINSTANCE.getPetriNet_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__FINISH = eINSTANCE.getPetriNet_Finish();

		/**
		 * The meta object literal for the '{@link workflow.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TransitionImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUT = eINSTANCE.getTransition_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__IN = eINSTANCE.getTransition_In();

		/**
		 * The meta object literal for the '{@link workflow.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ArcImpl
		 * @see workflow.impl.WorkflowPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE_PLACE = eINSTANCE.getArc_SourcePlace();

		/**
		 * The meta object literal for the '<em><b>Target Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET_PLACE = eINSTANCE.getArc_TargetPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__NAME = eINSTANCE.getArc_Name();

		/**
		 * The meta object literal for the '<em><b>Source Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE_TRANSITION = eINSTANCE.getArc_SourceTransition();

		/**
		 * The meta object literal for the '<em><b>Target Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET_TRANSITION = eINSTANCE.getArc_TargetTransition();

		/**
		 * The meta object literal for the '{@link workflow.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.PlaceImpl
		 * @see workflow.impl.WorkflowPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__IN = eINSTANCE.getPlace_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__OUT = eINSTANCE.getPlace_Out();

		/**
		 * The meta object literal for the '{@link workflow.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.MarkingImpl
		 * @see workflow.impl.WorkflowPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING__TOKENS = eINSTANCE.getMarking_Tokens();

		/**
		 * The meta object literal for the '<em><b>Petrinet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKING__PETRINET = eINSTANCE.getMarking_Petrinet();

		/**
		 * The meta object literal for the '{@link workflow.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TokenImpl
		 * @see workflow.impl.WorkflowPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__PLACE = eINSTANCE.getToken_Place();

		/**
		 * The meta object literal for the '{@link workflow.impl.ModelRegistryImpl <em>Model Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ModelRegistryImpl
		 * @see workflow.impl.WorkflowPackageImpl#getModelRegistry()
		 * @generated
		 */
		EClass MODEL_REGISTRY = eINSTANCE.getModelRegistry();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__ENGINE = eINSTANCE.getModelRegistry_Engine();

		/**
		 * The meta object literal for the '<em><b>Core Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__CORE_MODELS = eINSTANCE.getModelRegistry_CoreModels();

		/**
		 * The meta object literal for the '<em><b>Global Aspects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REGISTRY__GLOBAL_ASPECTS = eINSTANCE.getModelRegistry_GlobalAspects();

		/**
		 * The meta object literal for the '{@link workflow.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.InformationImpl
		 * @see workflow.impl.WorkflowPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Process Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__PROCESS_DOCUMENTS = eINSTANCE.getInformation_ProcessDocuments();

		/**
		 * The meta object literal for the '{@link workflow.impl.TaskIImpl <em>Task I</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TaskIImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTaskI()
		 * @generated
		 */
		EClass TASK_I = eINSTANCE.getTaskI();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_I__IN = eINSTANCE.getTaskI_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_I__OUT = eINSTANCE.getTaskI_Out();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_I__START = eINSTANCE.getTaskI_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_I__FINISH = eINSTANCE.getTaskI_Finish();

		/**
		 * The meta object literal for the '{@link workflow.impl.DocumentDescriptorImpl <em>Document Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DocumentDescriptorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDocumentDescriptor()
		 * @generated
		 */
		EClass DOCUMENT_DESCRIPTOR = eINSTANCE.getDocumentDescriptor();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE = eINSTANCE.getDocumentDescriptor_DocumentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_DESCRIPTOR__NAME = eINSTANCE.getDocumentDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Process Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT = eINSTANCE.getDocumentDescriptor_ProcessDocument();

		/**
		 * The meta object literal for the '{@link workflow.impl.DocumentTypeImpl <em>Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DocumentTypeImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDocumentType()
		 * @generated
		 */
		EClass DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__NAME = eINSTANCE.getDocumentType_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.ActivityIImpl <em>Activity I</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ActivityIImpl
		 * @see workflow.impl.WorkflowPackageImpl#getActivityI()
		 * @generated
		 */
		EClass ACTIVITY_I = eINSTANCE.getActivityI();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_I__IN = eINSTANCE.getActivityI_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_I__OUT = eINSTANCE.getActivityI_Out();

		/**
		 * The meta object literal for the '{@link workflow.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DocumentImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__DOCUMENT_TYPE = eINSTANCE.getDocument_DocumentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__ID = eINSTANCE.getDocument_Id();

		/**
		 * The meta object literal for the '{@link workflow.impl.CaseIImpl <em>Case I</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CaseIImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCaseI()
		 * @generated
		 */
		EClass CASE_I = eINSTANCE.getCaseI();

		/**
		 * The meta object literal for the '<em><b>Case Documents</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_I__CASE_DOCUMENTS = eINSTANCE.getCaseI_CaseDocuments();

		/**
		 * The meta object literal for the '{@link workflow.ModelAspect <em>Model Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.ModelAspect
		 * @see workflow.impl.WorkflowPackageImpl#getModelAspect()
		 * @generated
		 */
		EClass MODEL_ASPECT = eINSTANCE.getModelAspect();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ASPECT__PROCESS = eINSTANCE.getModelAspect_Process();

		/**
		 * The meta object literal for the '{@link workflow.ProcessAspect <em>Process Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.ProcessAspect
		 * @see workflow.impl.WorkflowPackageImpl#getProcessAspect()
		 * @generated
		 */
		EClass PROCESS_ASPECT = eINSTANCE.getProcessAspect();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ASPECT__TASKS = eINSTANCE.getProcessAspect_Tasks();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ASPECT__CORE = eINSTANCE.getProcessAspect_Core();

		/**
		 * The meta object literal for the '{@link workflow.TaskAspect <em>Task Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.TaskAspect
		 * @see workflow.impl.WorkflowPackageImpl#getTaskAspect()
		 * @generated
		 */
		EClass TASK_ASPECT = eINSTANCE.getTaskAspect();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ASPECT__CORE = eINSTANCE.getTaskAspect_Core();

		/**
		 * The meta object literal for the '{@link workflow.RuntimeModelAspect <em>Runtime Model Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.RuntimeModelAspect
		 * @see workflow.impl.WorkflowPackageImpl#getRuntimeModelAspect()
		 * @generated
		 */
		EClass RUNTIME_MODEL_ASPECT = eINSTANCE.getRuntimeModelAspect();

		/**
		 * The meta object literal for the '{@link workflow.CaseAspect <em>Case Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.CaseAspect
		 * @see workflow.impl.WorkflowPackageImpl#getCaseAspect()
		 * @generated
		 */
		EClass CASE_ASPECT = eINSTANCE.getCaseAspect();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ASPECT__PROCESS = eINSTANCE.getCaseAspect_Process();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_ASPECT__CORE = eINSTANCE.getCaseAspect_Core();

		/**
		 * The meta object literal for the '{@link workflow.ActivityAspect <em>Activity Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.ActivityAspect
		 * @see workflow.impl.WorkflowPackageImpl#getActivityAspect()
		 * @generated
		 */
		EClass ACTIVITY_ASPECT = eINSTANCE.getActivityAspect();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_ASPECT__TASK = eINSTANCE.getActivityAspect_Task();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_ASPECT__CORE = eINSTANCE.getActivityAspect_Core();

		/**
		 * The meta object literal for the '{@link workflow.impl.CoreModelImpl <em>Core Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CoreModelImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCoreModel()
		 * @generated
		 */
		EClass CORE_MODEL = eINSTANCE.getCoreModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_MODEL__NAME = eINSTANCE.getCoreModel_Name();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL__ASPECTS = eINSTANCE.getCoreModel_Aspects();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL__PROCESS = eINSTANCE.getCoreModel_Process();

		/**
		 * The meta object literal for the '<em><b>Model Registry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_MODEL__MODEL_REGISTRY = eINSTANCE.getCoreModel_ModelRegistry();

		/**
		 * The meta object literal for the '{@link workflow.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ProcessImpl
		 * @see workflow.impl.WorkflowPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__TASKS = eINSTANCE.getProcess_Tasks();

		/**
		 * The meta object literal for the '<em><b>Core Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__CORE_MODEL = eINSTANCE.getProcess_CoreModel();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ASPECTS = eINSTANCE.getProcess_Aspects();

		/**
		 * The meta object literal for the '{@link workflow.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.TaskImpl
		 * @see workflow.impl.WorkflowPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ASPECTS = eINSTANCE.getTask_Aspects();

		/**
		 * The meta object literal for the '{@link workflow.impl.RuntimeCoreModelImpl <em>Runtime Core Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.RuntimeCoreModelImpl
		 * @see workflow.impl.WorkflowPackageImpl#getRuntimeCoreModel()
		 * @generated
		 */
		EClass RUNTIME_CORE_MODEL = eINSTANCE.getRuntimeCoreModel();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_CORE_MODEL__ASPECTS = eINSTANCE.getRuntimeCoreModel_Aspects();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_CORE_MODEL__CASES = eINSTANCE.getRuntimeCoreModel_Cases();

		/**
		 * The meta object literal for the '<em><b>Core Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_CORE_MODEL__CORE_MODEL = eINSTANCE.getRuntimeCoreModel_CoreModel();

		/**
		 * The meta object literal for the '{@link workflow.impl.OrganisationAspectImpl <em>Organisation Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.OrganisationAspectImpl
		 * @see workflow.impl.WorkflowPackageImpl#getOrganisationAspect()
		 * @generated
		 */
		EClass ORGANISATION_ASPECT = eINSTANCE.getOrganisationAspect();

		/**
		 * The meta object literal for the '{@link workflow.impl.ControlAspectImpl <em>Control Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ControlAspectImpl
		 * @see workflow.impl.WorkflowPackageImpl#getControlAspect()
		 * @generated
		 */
		EClass CONTROL_ASPECT = eINSTANCE.getControlAspect();

		/**
		 * The meta object literal for the '{@link workflow.impl.WorkflowEngineImpl <em>Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.WorkflowEngineImpl
		 * @see workflow.impl.WorkflowPackageImpl#getWorkflowEngine()
		 * @generated
		 */
		EClass WORKFLOW_ENGINE = eINSTANCE.getWorkflowEngine();

		/**
		 * The meta object literal for the '<em><b>Model Registry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ENGINE__MODEL_REGISTRY = eINSTANCE.getWorkflowEngine_ModelRegistry();

		/**
		 * The meta object literal for the '<em><b>Runtime Core Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ENGINE__RUNTIME_CORE_MODELS = eINSTANCE.getWorkflowEngine_RuntimeCoreModels();

		/**
		 * The meta object literal for the '<em><b>Runtime Global Aspects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS = eINSTANCE.getWorkflowEngine_RuntimeGlobalAspects();

		/**
		 * The meta object literal for the '{@link workflow.impl.ProcessOImpl <em>Process O</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ProcessOImpl
		 * @see workflow.impl.WorkflowPackageImpl#getProcessO()
		 * @generated
		 */
		EClass PROCESS_O = eINSTANCE.getProcessO();

		/**
		 * The meta object literal for the '<em><b>Involved</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_O__INVOLVED = eINSTANCE.getProcessO_Involved();

		/**
		 * The meta object literal for the '{@link workflow.impl.DocumentConditionImpl <em>Document Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DocumentConditionImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDocumentCondition()
		 * @generated
		 */
		EClass DOCUMENT_CONDITION = eINSTANCE.getDocumentCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_CONDITION__NAME = eINSTANCE.getDocumentCondition_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ExpressionImpl
		 * @see workflow.impl.WorkflowPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link workflow.impl.DefaultDocumentTypeImpl <em>Default Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DefaultDocumentTypeImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocumentType()
		 * @generated
		 */
		EClass DEFAULT_DOCUMENT_TYPE = eINSTANCE.getDefaultDocumentType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_DOCUMENT_TYPE__FIELDS = eINSTANCE.getDefaultDocumentType_Fields();

		/**
		 * The meta object literal for the '<em><b>Enum Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS = eINSTANCE.getDefaultDocumentType_EnumFields();

		/**
		 * The meta object literal for the '{@link workflow.impl.DefaultDocumentImpl <em>Default Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DefaultDocumentImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocument()
		 * @generated
		 */
		EClass DEFAULT_DOCUMENT = eINSTANCE.getDefaultDocument();

		/**
		 * The meta object literal for the '<em><b>Field Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_DOCUMENT__FIELD_VALUES = eINSTANCE.getDefaultDocument_FieldValues();

		/**
		 * The meta object literal for the '<em><b>Enum Field Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_DOCUMENT__ENUM_FIELD_VALUES = eINSTANCE.getDefaultDocument_EnumFieldValues();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_DOCUMENT__PLACEHOLDER = eINSTANCE.getDefaultDocument_Placeholder();

		/**
		 * The meta object literal for the '{@link workflow.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.FieldImpl
		 * @see workflow.impl.WorkflowPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.FieldValueImpl <em>Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.FieldValueImpl
		 * @see workflow.impl.WorkflowPackageImpl#getFieldValue()
		 * @generated
		 */
		EClass FIELD_VALUE = eINSTANCE.getFieldValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_VALUE__VALUE = eINSTANCE.getFieldValue_Value();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_VALUE__FIELD = eINSTANCE.getFieldValue_Field();

		/**
		 * The meta object literal for the '{@link workflow.impl.InformationAspectImpl <em>Information Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.InformationAspectImpl
		 * @see workflow.impl.WorkflowPackageImpl#getInformationAspect()
		 * @generated
		 */
		EClass INFORMATION_ASPECT = eINSTANCE.getInformationAspect();

		/**
		 * The meta object literal for the '{@link workflow.impl.CaseOImpl <em>Case O</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.CaseOImpl
		 * @see workflow.impl.WorkflowPackageImpl#getCaseO()
		 * @generated
		 */
		EClass CASE_O = eINSTANCE.getCaseO();

		/**
		 * The meta object literal for the '<em><b>Involved</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_O__INVOLVED = eINSTANCE.getCaseO_Involved();

		/**
		 * The meta object literal for the '{@link workflow.impl.InformationRuntimeAspectImpl <em>Information Runtime Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.InformationRuntimeAspectImpl
		 * @see workflow.impl.WorkflowPackageImpl#getInformationRuntimeAspect()
		 * @generated
		 */
		EClass INFORMATION_RUNTIME_ASPECT = eINSTANCE.getInformationRuntimeAspect();

		/**
		 * The meta object literal for the '{@link workflow.impl.DefaultDocumentDescriptorImpl <em>Default Document Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DefaultDocumentDescriptorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocumentDescriptor()
		 * @generated
		 */
		EClass DEFAULT_DOCUMENT_DESCRIPTOR = eINSTANCE.getDefaultDocumentDescriptor();

		/**
		 * The meta object literal for the '{@link workflow.impl.ProcessDocumentImpl <em>Process Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ProcessDocumentImpl
		 * @see workflow.impl.WorkflowPackageImpl#getProcessDocument()
		 * @generated
		 */
		EClass PROCESS_DOCUMENT = eINSTANCE.getProcessDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DOCUMENT__NAME = eINSTANCE.getProcessDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DOCUMENT__DOCUMENT_TYPE = eINSTANCE.getProcessDocument_DocumentType();

		/**
		 * The meta object literal for the '{@link workflow.impl.String2DocumentMapImpl <em>String2 Document Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.String2DocumentMapImpl
		 * @see workflow.impl.WorkflowPackageImpl#getString2DocumentMap()
		 * @generated
		 */
		EClass STRING2_DOCUMENT_MAP = eINSTANCE.getString2DocumentMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING2_DOCUMENT_MAP__KEY = eINSTANCE.getString2DocumentMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING2_DOCUMENT_MAP__VALUE = eINSTANCE.getString2DocumentMap_Value();

		/**
		 * The meta object literal for the '{@link workflow.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.AtomImpl
		 * @see workflow.impl.WorkflowPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '{@link workflow.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.OperatorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OPERANDS = eINSTANCE.getOperator_Operands();

		/**
		 * The meta object literal for the '{@link workflow.impl.DocumentDescrAtomImpl <em>Document Descr Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DocumentDescrAtomImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDocumentDescrAtom()
		 * @generated
		 */
		EClass DOCUMENT_DESCR_ATOM = eINSTANCE.getDocumentDescrAtom();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DESCR_ATOM__DESCRIPTOR = eINSTANCE.getDocumentDescrAtom_Descriptor();

		/**
		 * The meta object literal for the '{@link workflow.impl.FieldAtomImpl <em>Field Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.FieldAtomImpl
		 * @see workflow.impl.WorkflowPackageImpl#getFieldAtom()
		 * @generated
		 */
		EClass FIELD_ATOM = eINSTANCE.getFieldAtom();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ATOM__FIELD = eINSTANCE.getFieldAtom_Field();

		/**
		 * The meta object literal for the '{@link workflow.impl.ConstantAtomImpl <em>Constant Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.ConstantAtomImpl
		 * @see workflow.impl.WorkflowPackageImpl#getConstantAtom()
		 * @generated
		 */
		EClass CONSTANT_ATOM = eINSTANCE.getConstantAtom();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_ATOM__VALUE = eINSTANCE.getConstantAtom_Value();

		/**
		 * The meta object literal for the '{@link workflow.impl.DotOperatorImpl <em>Dot Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DotOperatorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDotOperator()
		 * @generated
		 */
		EClass DOT_OPERATOR = eINSTANCE.getDotOperator();

		/**
		 * The meta object literal for the '{@link workflow.impl.EqualToOperatorImpl <em>Equal To Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.EqualToOperatorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getEqualToOperator()
		 * @generated
		 */
		EClass EQUAL_TO_OPERATOR = eINSTANCE.getEqualToOperator();

		/**
		 * The meta object literal for the '{@link workflow.impl.DefaultDocumentConditionImpl <em>Default Document Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DefaultDocumentConditionImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDefaultDocumentCondition()
		 * @generated
		 */
		EClass DEFAULT_DOCUMENT_CONDITION = eINSTANCE.getDefaultDocumentCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_DOCUMENT_CONDITION__EXPRESSION = eINSTANCE.getDefaultDocumentCondition_Expression();

		/**
		 * The meta object literal for the '{@link workflow.impl.EnumFieldImpl <em>Enum Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.EnumFieldImpl
		 * @see workflow.impl.WorkflowPackageImpl#getEnumField()
		 * @generated
		 */
		EClass ENUM_FIELD = eINSTANCE.getEnumField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_FIELD__NAME = eINSTANCE.getEnumField_Name();

		/**
		 * The meta object literal for the '<em><b>Enum Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD__ENUM_LITERALS = eINSTANCE.getEnumField_EnumLiterals();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD__DEFAULT_VALUE = eINSTANCE.getEnumField_DefaultValue();

		/**
		 * The meta object literal for the '{@link workflow.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.EnumLiteralImpl
		 * @see workflow.impl.WorkflowPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.EnumFieldValueImpl <em>Enum Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.EnumFieldValueImpl
		 * @see workflow.impl.WorkflowPackageImpl#getEnumFieldValue()
		 * @generated
		 */
		EClass ENUM_FIELD_VALUE = eINSTANCE.getEnumFieldValue();

		/**
		 * The meta object literal for the '<em><b>Enum Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD_VALUE__ENUM_FIELD = eINSTANCE.getEnumFieldValue_EnumField();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD_VALUE__ENUM_VALUE = eINSTANCE.getEnumFieldValue_EnumValue();

		/**
		 * The meta object literal for the '{@link workflow.impl.LessThanOperatorImpl <em>Less Than Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.LessThanOperatorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getLessThanOperator()
		 * @generated
		 */
		EClass LESS_THAN_OPERATOR = eINSTANCE.getLessThanOperator();

		/**
		 * The meta object literal for the '{@link workflow.impl.GreaterThanOperatorImpl <em>Greater Than Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.GreaterThanOperatorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getGreaterThanOperator()
		 * @generated
		 */
		EClass GREATER_THAN_OPERATOR = eINSTANCE.getGreaterThanOperator();

		/**
		 * The meta object literal for the '{@link workflow.impl.EnumFieldAtomImpl <em>Enum Field Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.EnumFieldAtomImpl
		 * @see workflow.impl.WorkflowPackageImpl#getEnumFieldAtom()
		 * @generated
		 */
		EClass ENUM_FIELD_ATOM = eINSTANCE.getEnumFieldAtom();

		/**
		 * The meta object literal for the '<em><b>Enum Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD_ATOM__ENUM_FIELD = eINSTANCE.getEnumFieldAtom_EnumField();

		/**
		 * The meta object literal for the '{@link workflow.impl.EnumLiteralAtomImpl <em>Enum Literal Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.EnumLiteralAtomImpl
		 * @see workflow.impl.WorkflowPackageImpl#getEnumLiteralAtom()
		 * @generated
		 */
		EClass ENUM_LITERAL_ATOM = eINSTANCE.getEnumLiteralAtom();

		/**
		 * The meta object literal for the '<em><b>Enum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_ATOM__ENUM_LITERAL = eINSTANCE.getEnumLiteralAtom_EnumLiteral();

		/**
		 * The meta object literal for the '{@link workflow.impl.UnequalToOperatorImpl <em>Unequal To Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.UnequalToOperatorImpl
		 * @see workflow.impl.WorkflowPackageImpl#getUnequalToOperator()
		 * @generated
		 */
		EClass UNEQUAL_TO_OPERATOR = eINSTANCE.getUnequalToOperator();

		/**
		 * The meta object literal for the '{@link workflow.impl.AgentContainerImpl <em>Agent Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.AgentContainerImpl
		 * @see workflow.impl.WorkflowPackageImpl#getAgentContainer()
		 * @generated
		 */
		EClass AGENT_CONTAINER = eINSTANCE.getAgentContainer();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CONTAINER__AGENTS = eINSTANCE.getAgentContainer_Agents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CONTAINER__NAME = eINSTANCE.getAgentContainer_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.OrganisationImpl
		 * @see workflow.impl.WorkflowPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__NAME = eINSTANCE.getOrganisation_Name();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__ROLES = eINSTANCE.getOrganisation_Roles();

		/**
		 * The meta object literal for the '{@link workflow.GlobalAspect <em>Global Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.GlobalAspect
		 * @see workflow.impl.WorkflowPackageImpl#getGlobalAspect()
		 * @generated
		 */
		EClass GLOBAL_ASPECT = eINSTANCE.getGlobalAspect();

		/**
		 * The meta object literal for the '<em><b>Model Registry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ASPECT__MODEL_REGISTRY = eINSTANCE.getGlobalAspect_ModelRegistry();

		/**
		 * The meta object literal for the '{@link workflow.RuntimeGlobalAspect <em>Runtime Global Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.RuntimeGlobalAspect
		 * @see workflow.impl.WorkflowPackageImpl#getRuntimeGlobalAspect()
		 * @generated
		 */
		EClass RUNTIME_GLOBAL_ASPECT = eINSTANCE.getRuntimeGlobalAspect();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_GLOBAL_ASPECT__ENGINE = eINSTANCE.getRuntimeGlobalAspect_Engine();

		/**
		 * The meta object literal for the '{@link workflow.impl.DocumentTypeContainerImpl <em>Document Type Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DocumentTypeContainerImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDocumentTypeContainer()
		 * @generated
		 */
		EClass DOCUMENT_TYPE_CONTAINER = eINSTANCE.getDocumentTypeContainer();

		/**
		 * The meta object literal for the '<em><b>Document Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES = eINSTANCE.getDocumentTypeContainer_DocumentTypes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE_CONTAINER__NAME = eINSTANCE.getDocumentTypeContainer_Name();

		/**
		 * The meta object literal for the '{@link workflow.impl.DocumentContainerImpl <em>Document Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see workflow.impl.DocumentContainerImpl
		 * @see workflow.impl.WorkflowPackageImpl#getDocumentContainer()
		 * @generated
		 */
		EClass DOCUMENT_CONTAINER = eINSTANCE.getDocumentContainer();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_CONTAINER__DOCUMENTS = eINSTANCE.getDocumentContainer_Documents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_CONTAINER__NAME = eINSTANCE.getDocumentContainer_Name();

		/**
		 * The meta object literal for the '<em>My String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see workflow.impl.WorkflowPackageImpl#getMyString()
		 * @generated
		 */
		EDataType MY_STRING = eINSTANCE.getMyString();

		/**
		 * The meta object literal for the '<em>My List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see workflow.impl.WorkflowPackageImpl#getMyList()
		 * @generated
		 */
		EDataType MY_LIST = eINSTANCE.getMyList();

	}

} //WorkflowPackage
