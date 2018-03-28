/**
 */
package workflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public interface WorkflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowFactory eINSTANCE = workflow.impl.WorkflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task O</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task O</em>'.
	 * @generated
	 */
	TaskO createTaskO();

	/**
	 * Returns a new object of class '<em>Activity O</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity O</em>'.
	 * @generated
	 */
	ActivityO createActivityO();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Runtime Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Information</em>'.
	 * @generated
	 */
	RuntimeInformation createRuntimeInformation();

	/**
	 * Returns a new object of class '<em>Activity C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity C</em>'.
	 * @generated
	 */
	ActivityC createActivityC();

	/**
	 * Returns a new object of class '<em>Case C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case C</em>'.
	 * @generated
	 */
	CaseC createCaseC();

	/**
	 * Returns a new object of class '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Net</em>'.
	 * @generated
	 */
	PetriNet createPetriNet();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking</em>'.
	 * @generated
	 */
	Marking createMarking();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Model Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Registry</em>'.
	 * @generated
	 */
	ModelRegistry createModelRegistry();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Task I</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task I</em>'.
	 * @generated
	 */
	TaskI createTaskI();

	/**
	 * Returns a new object of class '<em>Activity I</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity I</em>'.
	 * @generated
	 */
	ActivityI createActivityI();

	/**
	 * Returns a new object of class '<em>Case I</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case I</em>'.
	 * @generated
	 */
	CaseI createCaseI();

	/**
	 * Returns a new object of class '<em>Core Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Model</em>'.
	 * @generated
	 */
	CoreModel createCoreModel();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Runtime Core Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Core Model</em>'.
	 * @generated
	 */
	RuntimeCoreModel createRuntimeCoreModel();

	/**
	 * Returns a new object of class '<em>Organisation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organisation Aspect</em>'.
	 * @generated
	 */
	OrganisationAspect createOrganisationAspect();

	/**
	 * Returns a new object of class '<em>Control Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Aspect</em>'.
	 * @generated
	 */
	ControlAspect createControlAspect();

	/**
	 * Returns a new object of class '<em>Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engine</em>'.
	 * @generated
	 */
	WorkflowEngine createWorkflowEngine();

	/**
	 * Returns a new object of class '<em>Process O</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process O</em>'.
	 * @generated
	 */
	ProcessO createProcessO();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Default Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Document Type</em>'.
	 * @generated
	 */
	DefaultDocumentType createDefaultDocumentType();

	/**
	 * Returns a new object of class '<em>Default Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Document</em>'.
	 * @generated
	 */
	DefaultDocument createDefaultDocument();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Value</em>'.
	 * @generated
	 */
	FieldValue createFieldValue();

	/**
	 * Returns a new object of class '<em>Information Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Aspect</em>'.
	 * @generated
	 */
	InformationAspect createInformationAspect();

	/**
	 * Returns a new object of class '<em>Case O</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case O</em>'.
	 * @generated
	 */
	CaseO createCaseO();

	/**
	 * Returns a new object of class '<em>Information Runtime Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Runtime Aspect</em>'.
	 * @generated
	 */
	InformationRuntimeAspect createInformationRuntimeAspect();

	/**
	 * Returns a new object of class '<em>Default Document Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Document Descriptor</em>'.
	 * @generated
	 */
	DefaultDocumentDescriptor createDefaultDocumentDescriptor();

	/**
	 * Returns a new object of class '<em>Process Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Document</em>'.
	 * @generated
	 */
	ProcessDocument createProcessDocument();

	/**
	 * Returns a new object of class '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atom</em>'.
	 * @generated
	 */
	Atom createAtom();

	/**
	 * Returns a new object of class '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator</em>'.
	 * @generated
	 */
	Operator createOperator();

	/**
	 * Returns a new object of class '<em>Document Descr Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Descr Atom</em>'.
	 * @generated
	 */
	DocumentDescrAtom createDocumentDescrAtom();

	/**
	 * Returns a new object of class '<em>Field Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Atom</em>'.
	 * @generated
	 */
	FieldAtom createFieldAtom();

	/**
	 * Returns a new object of class '<em>Constant Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Atom</em>'.
	 * @generated
	 */
	ConstantAtom createConstantAtom();

	/**
	 * Returns a new object of class '<em>Dot Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot Operator</em>'.
	 * @generated
	 */
	DotOperator createDotOperator();

	/**
	 * Returns a new object of class '<em>Equal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal To Operator</em>'.
	 * @generated
	 */
	EqualToOperator createEqualToOperator();

	/**
	 * Returns a new object of class '<em>Default Document Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Document Condition</em>'.
	 * @generated
	 */
	DefaultDocumentCondition createDefaultDocumentCondition();

	/**
	 * Returns a new object of class '<em>Enum Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Field</em>'.
	 * @generated
	 */
	EnumField createEnumField();

	/**
	 * Returns a new object of class '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal</em>'.
	 * @generated
	 */
	EnumLiteral createEnumLiteral();

	/**
	 * Returns a new object of class '<em>Enum Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Field Value</em>'.
	 * @generated
	 */
	EnumFieldValue createEnumFieldValue();

	/**
	 * Returns a new object of class '<em>Less Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Operator</em>'.
	 * @generated
	 */
	LessThanOperator createLessThanOperator();

	/**
	 * Returns a new object of class '<em>Greater Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Operator</em>'.
	 * @generated
	 */
	GreaterThanOperator createGreaterThanOperator();

	/**
	 * Returns a new object of class '<em>Enum Field Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Field Atom</em>'.
	 * @generated
	 */
	EnumFieldAtom createEnumFieldAtom();

	/**
	 * Returns a new object of class '<em>Enum Literal Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal Atom</em>'.
	 * @generated
	 */
	EnumLiteralAtom createEnumLiteralAtom();

	/**
	 * Returns a new object of class '<em>Unequal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unequal To Operator</em>'.
	 * @generated
	 */
	UnequalToOperator createUnequalToOperator();

	/**
	 * Returns a new object of class '<em>Agent Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Container</em>'.
	 * @generated
	 */
	AgentContainer createAgentContainer();

	/**
	 * Returns a new object of class '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organisation</em>'.
	 * @generated
	 */
	Organisation createOrganisation();

	/**
	 * Returns a new object of class '<em>Document Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Type Container</em>'.
	 * @generated
	 */
	DocumentTypeContainer createDocumentTypeContainer();

	/**
	 * Returns a new object of class '<em>Document Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Container</em>'.
	 * @generated
	 */
	DocumentContainer createDocumentContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkflowPackage getWorkflowPackage();

} //WorkflowFactory
