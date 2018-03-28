/**
 */
package dk.dtu.compute.se.emf.processalgebra.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import dk.dtu.compute.se.emf.processalgebra.Action;
import dk.dtu.compute.se.emf.processalgebra.ActionDef;
import dk.dtu.compute.se.emf.processalgebra.ActionInst;
import dk.dtu.compute.se.emf.processalgebra.Choice;
import dk.dtu.compute.se.emf.processalgebra.ChoiceInst;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessalgebraFactoryImpl extends EFactoryImpl implements ProcessalgebraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessalgebraFactory init() {
		try {
			ProcessalgebraFactory theProcessalgebraFactory = (ProcessalgebraFactory)EPackage.Registry.INSTANCE.getEFactory("http://se.compute.dtu.dk/processalgebra/1.0"); 
			if (theProcessalgebraFactory != null) {
				return theProcessalgebraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessalgebraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessalgebraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessalgebraPackage.PROCESS_DEFINITIONS: return createProcessDefinitions();
			case ProcessalgebraPackage.PROCESS_DEFINITION: return createProcessDefinition();
			case ProcessalgebraPackage.ACTION: return createAction();
			case ProcessalgebraPackage.PROCESS_NAME: return createProcessName();
			case ProcessalgebraPackage.ACTION_DEF: return createActionDef();
			case ProcessalgebraPackage.HIDE: return createHide();
			case ProcessalgebraPackage.SEQUENCE: return createSequence();
			case ProcessalgebraPackage.CHOICE: return createChoice();
			case ProcessalgebraPackage.PARALLEL: return createParallel();
			case ProcessalgebraPackage.PROCESS_INSTANCE: return createProcessInstance();
			case ProcessalgebraPackage.SETTING: return createSetting();
			case ProcessalgebraPackage.SEQUENCE_INST: return createSequenceInst();
			case ProcessalgebraPackage.CHOICE_INST: return createChoiceInst();
			case ProcessalgebraPackage.PARALLEL_INST: return createParallelInst();
			case ProcessalgebraPackage.HIDE_INST: return createHideInst();
			case ProcessalgebraPackage.ACTION_INST: return createActionInst();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinitions createProcessDefinitions() {
		ProcessDefinitionsImpl processDefinitions = new ProcessDefinitionsImpl();
		return processDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinition createProcessDefinition() {
		ProcessDefinitionImpl processDefinition = new ProcessDefinitionImpl();
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessName createProcessName() {
		ProcessNameImpl processName = new ProcessNameImpl();
		return processName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDef createActionDef() {
		ActionDefImpl actionDef = new ActionDefImpl();
		return actionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hide createHide() {
		HideImpl hide = new HideImpl();
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createProcessInstance() {
		ProcessInstanceImpl processInstance = new ProcessInstanceImpl();
		return processInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setting createSetting() {
		SettingImpl setting = new SettingImpl();
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceInst createSequenceInst() {
		SequenceInstImpl sequenceInst = new SequenceInstImpl();
		return sequenceInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceInst createChoiceInst() {
		ChoiceInstImpl choiceInst = new ChoiceInstImpl();
		return choiceInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelInst createParallelInst() {
		ParallelInstImpl parallelInst = new ParallelInstImpl();
		return parallelInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideInst createHideInst() {
		HideInstImpl hideInst = new HideInstImpl();
		return hideInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInst createActionInst() {
		ActionInstImpl actionInst = new ActionInstImpl();
		return actionInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessalgebraPackage getProcessalgebraPackage() {
		return (ProcessalgebraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessalgebraPackage getPackage() {
		return ProcessalgebraPackage.eINSTANCE;
	}

} //ProcessalgebraFactoryImpl
