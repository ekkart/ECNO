/**
 */
package dk.dtu.compute.se.emf.processalgebra.util;

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
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;
import dk.dtu.compute.se.emf.processalgebra.Sequence;

import dk.dtu.compute.se.emf.processalgebra.SequenceInst;
import dk.dtu.compute.se.emf.processalgebra.Setting;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage
 * @generated
 */
public class ProcessalgebraSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessalgebraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessalgebraSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessalgebraPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessalgebraPackage.PROCESS_DEFINITIONS: {
				ProcessDefinitions processDefinitions = (ProcessDefinitions)theEObject;
				T result = caseProcessDefinitions(processDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.PROCESS_DEFINITION: {
				ProcessDefinition processDefinition = (ProcessDefinition)theEObject;
				T result = caseProcessDefinition(processDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.PROCESS: {
				dk.dtu.compute.se.emf.processalgebra.Process process = (dk.dtu.compute.se.emf.processalgebra.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseProcess(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.PROCESS_NAME: {
				ProcessName processName = (ProcessName)theEObject;
				T result = caseProcessName(processName);
				if (result == null) result = caseProcess(processName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.ACTION_DEF: {
				ActionDef actionDef = (ActionDef)theEObject;
				T result = caseActionDef(actionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.HIDE: {
				Hide hide = (Hide)theEObject;
				T result = caseHide(hide);
				if (result == null) result = caseProcess(hide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseProcess(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseComposite(sequence);
				if (result == null) result = caseProcess(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseComposite(choice);
				if (result == null) result = caseProcess(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = caseComposite(parallel);
				if (result == null) result = caseProcess(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.PROCESS_INSTANCE: {
				ProcessInstance processInstance = (ProcessInstance)theEObject;
				T result = caseProcessInstance(processInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.SETTING: {
				Setting setting = (Setting)theEObject;
				T result = caseSetting(setting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.SEQUENCE_INST: {
				SequenceInst sequenceInst = (SequenceInst)theEObject;
				T result = caseSequenceInst(sequenceInst);
				if (result == null) result = caseProcessInstance(sequenceInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.CHOICE_INST: {
				ChoiceInst choiceInst = (ChoiceInst)theEObject;
				T result = caseChoiceInst(choiceInst);
				if (result == null) result = caseProcessInstance(choiceInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.PARALLEL_INST: {
				ParallelInst parallelInst = (ParallelInst)theEObject;
				T result = caseParallelInst(parallelInst);
				if (result == null) result = caseProcessInstance(parallelInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.HIDE_INST: {
				HideInst hideInst = (HideInst)theEObject;
				T result = caseHideInst(hideInst);
				if (result == null) result = caseProcessInstance(hideInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessalgebraPackage.ACTION_INST: {
				ActionInst actionInst = (ActionInst)theEObject;
				T result = caseActionInst(actionInst);
				if (result == null) result = caseProcessInstance(actionInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessDefinitions(ProcessDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessDefinition(ProcessDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(dk.dtu.compute.se.emf.processalgebra.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessName(ProcessName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDef(ActionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHide(Hide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessInstance(ProcessInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetting(Setting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceInst(SequenceInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceInst(ChoiceInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelInst(ParallelInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hide Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHideInst(HideInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionInst(ActionInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProcessalgebraSwitch
