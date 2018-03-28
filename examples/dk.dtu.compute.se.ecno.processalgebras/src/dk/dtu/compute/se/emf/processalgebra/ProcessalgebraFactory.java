/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage
 * @generated
 */
public interface ProcessalgebraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessalgebraFactory eINSTANCE = dk.dtu.compute.se.emf.processalgebra.impl.ProcessalgebraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Definitions</em>'.
	 * @generated
	 */
	ProcessDefinitions createProcessDefinitions();

	/**
	 * Returns a new object of class '<em>Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Definition</em>'.
	 * @generated
	 */
	ProcessDefinition createProcessDefinition();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Process Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Name</em>'.
	 * @generated
	 */
	ProcessName createProcessName();

	/**
	 * Returns a new object of class '<em>Action Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Def</em>'.
	 * @generated
	 */
	ActionDef createActionDef();

	/**
	 * Returns a new object of class '<em>Hide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hide</em>'.
	 * @generated
	 */
	Hide createHide();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
	Parallel createParallel();

	/**
	 * Returns a new object of class '<em>Process Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Instance</em>'.
	 * @generated
	 */
	ProcessInstance createProcessInstance();

	/**
	 * Returns a new object of class '<em>Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setting</em>'.
	 * @generated
	 */
	Setting createSetting();

	/**
	 * Returns a new object of class '<em>Sequence Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Inst</em>'.
	 * @generated
	 */
	SequenceInst createSequenceInst();

	/**
	 * Returns a new object of class '<em>Choice Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Inst</em>'.
	 * @generated
	 */
	ChoiceInst createChoiceInst();

	/**
	 * Returns a new object of class '<em>Parallel Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Inst</em>'.
	 * @generated
	 */
	ParallelInst createParallelInst();

	/**
	 * Returns a new object of class '<em>Hide Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hide Inst</em>'.
	 * @generated
	 */
	HideInst createHideInst();

	/**
	 * Returns a new object of class '<em>Action Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Inst</em>'.
	 * @generated
	 */
	ActionInst createActionInst();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProcessalgebraPackage getProcessalgebraPackage();

} //ProcessalgebraFactory
