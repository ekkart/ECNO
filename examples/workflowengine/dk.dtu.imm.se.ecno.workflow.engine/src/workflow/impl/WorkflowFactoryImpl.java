/**
 */
package workflow.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workflow.Activity;
import workflow.ActivityC;
import workflow.ActivityI;
import workflow.ActivityO;
import workflow.Agent;
import workflow.AgentContainer;
import workflow.Arc;
import workflow.Atom;
import workflow.Case;
import workflow.CaseC;
import workflow.CaseI;
import workflow.CaseO;
import workflow.ConstantAtom;
import workflow.ControlAspect;
import workflow.CoreModel;
import workflow.DefaultDocument;
import workflow.DefaultDocumentCondition;
import workflow.DefaultDocumentDescriptor;
import workflow.DefaultDocumentType;
import workflow.Document;
import workflow.DocumentContainer;
import workflow.DocumentDescrAtom;
import workflow.DocumentTypeContainer;
import workflow.DotOperator;
import workflow.EnumField;
import workflow.EnumFieldAtom;
import workflow.EnumFieldValue;
import workflow.EnumLiteral;
import workflow.EnumLiteralAtom;
import workflow.EqualToOperator;
import workflow.Expression;
import workflow.Field;
import workflow.FieldAtom;
import workflow.FieldValue;
import workflow.GreaterThanOperator;
import workflow.Information;
import workflow.InformationAspect;
import workflow.InformationRuntimeAspect;
import workflow.LessThanOperator;
import workflow.Marking;
import workflow.ModelRegistry;
import workflow.Operator;
import workflow.Organisation;
import workflow.OrganisationAspect;
import workflow.PetriNet;
import workflow.Place;
import workflow.ProcessDocument;
import workflow.ProcessO;
import workflow.Role;
import workflow.RuntimeCoreModel;
import workflow.RuntimeInformation;
import workflow.Task;
import workflow.TaskI;
import workflow.TaskO;
import workflow.Token;
import workflow.Transition;
import workflow.UnequalToOperator;
import workflow.WorkflowEngine;
import workflow.WorkflowFactory;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init() {
		try {
			WorkflowFactory theWorkflowFactory = (WorkflowFactory)EPackage.Registry.INSTANCE.getEFactory("http://workflow/1.0"); 
			if (theWorkflowFactory != null) {
				return theWorkflowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactoryImpl() {
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
			case WorkflowPackage.TASK_O: return createTaskO();
			case WorkflowPackage.ACTIVITY_O: return createActivityO();
			case WorkflowPackage.ROLE: return createRole();
			case WorkflowPackage.CASE: return createCase();
			case WorkflowPackage.ACTIVITY: return createActivity();
			case WorkflowPackage.AGENT: return createAgent();
			case WorkflowPackage.RUNTIME_INFORMATION: return createRuntimeInformation();
			case WorkflowPackage.ACTIVITY_C: return createActivityC();
			case WorkflowPackage.CASE_C: return createCaseC();
			case WorkflowPackage.PETRI_NET: return createPetriNet();
			case WorkflowPackage.TRANSITION: return createTransition();
			case WorkflowPackage.ARC: return createArc();
			case WorkflowPackage.PLACE: return createPlace();
			case WorkflowPackage.MARKING: return createMarking();
			case WorkflowPackage.TOKEN: return createToken();
			case WorkflowPackage.MODEL_REGISTRY: return createModelRegistry();
			case WorkflowPackage.INFORMATION: return createInformation();
			case WorkflowPackage.TASK_I: return createTaskI();
			case WorkflowPackage.ACTIVITY_I: return createActivityI();
			case WorkflowPackage.CASE_I: return createCaseI();
			case WorkflowPackage.CORE_MODEL: return createCoreModel();
			case WorkflowPackage.PROCESS: return createProcess();
			case WorkflowPackage.TASK: return createTask();
			case WorkflowPackage.RUNTIME_CORE_MODEL: return createRuntimeCoreModel();
			case WorkflowPackage.ORGANISATION_ASPECT: return createOrganisationAspect();
			case WorkflowPackage.CONTROL_ASPECT: return createControlAspect();
			case WorkflowPackage.WORKFLOW_ENGINE: return createWorkflowEngine();
			case WorkflowPackage.PROCESS_O: return createProcessO();
			case WorkflowPackage.EXPRESSION: return createExpression();
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE: return createDefaultDocumentType();
			case WorkflowPackage.DEFAULT_DOCUMENT: return createDefaultDocument();
			case WorkflowPackage.FIELD: return createField();
			case WorkflowPackage.FIELD_VALUE: return createFieldValue();
			case WorkflowPackage.INFORMATION_ASPECT: return createInformationAspect();
			case WorkflowPackage.CASE_O: return createCaseO();
			case WorkflowPackage.INFORMATION_RUNTIME_ASPECT: return createInformationRuntimeAspect();
			case WorkflowPackage.DEFAULT_DOCUMENT_DESCRIPTOR: return createDefaultDocumentDescriptor();
			case WorkflowPackage.PROCESS_DOCUMENT: return createProcessDocument();
			case WorkflowPackage.STRING2_DOCUMENT_MAP: return (EObject)createString2DocumentMap();
			case WorkflowPackage.ATOM: return createAtom();
			case WorkflowPackage.OPERATOR: return createOperator();
			case WorkflowPackage.DOCUMENT_DESCR_ATOM: return createDocumentDescrAtom();
			case WorkflowPackage.FIELD_ATOM: return createFieldAtom();
			case WorkflowPackage.CONSTANT_ATOM: return createConstantAtom();
			case WorkflowPackage.DOT_OPERATOR: return createDotOperator();
			case WorkflowPackage.EQUAL_TO_OPERATOR: return createEqualToOperator();
			case WorkflowPackage.DEFAULT_DOCUMENT_CONDITION: return createDefaultDocumentCondition();
			case WorkflowPackage.ENUM_FIELD: return createEnumField();
			case WorkflowPackage.ENUM_LITERAL: return createEnumLiteral();
			case WorkflowPackage.ENUM_FIELD_VALUE: return createEnumFieldValue();
			case WorkflowPackage.LESS_THAN_OPERATOR: return createLessThanOperator();
			case WorkflowPackage.GREATER_THAN_OPERATOR: return createGreaterThanOperator();
			case WorkflowPackage.ENUM_FIELD_ATOM: return createEnumFieldAtom();
			case WorkflowPackage.ENUM_LITERAL_ATOM: return createEnumLiteralAtom();
			case WorkflowPackage.UNEQUAL_TO_OPERATOR: return createUnequalToOperator();
			case WorkflowPackage.AGENT_CONTAINER: return createAgentContainer();
			case WorkflowPackage.ORGANISATION: return createOrganisation();
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER: return createDocumentTypeContainer();
			case WorkflowPackage.DOCUMENT_CONTAINER: return createDocumentContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WorkflowPackage.MY_STRING:
				return createMyStringFromString(eDataType, initialValue);
			case WorkflowPackage.MY_LIST:
				return createMyListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WorkflowPackage.MY_STRING:
				return convertMyStringToString(eDataType, instanceValue);
			case WorkflowPackage.MY_LIST:
				return convertMyListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskO createTaskO() {
		TaskOImpl taskO = new TaskOImpl();
		return taskO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityO createActivityO() {
		ActivityOImpl activityO = new ActivityOImpl();
		return activityO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeInformation createRuntimeInformation() {
		RuntimeInformationImpl runtimeInformation = new RuntimeInformationImpl();
		return runtimeInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityC createActivityC() {
		ActivityCImpl activityC = new ActivityCImpl();
		return activityC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseC createCaseC() {
		CaseCImpl caseC = new CaseCImpl();
		return caseC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking() {
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRegistry createModelRegistry() {
		ModelRegistryImpl modelRegistry = new ModelRegistryImpl();
		return modelRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskI createTaskI() {
		TaskIImpl taskI = new TaskIImpl();
		return taskI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityI createActivityI() {
		ActivityIImpl activityI = new ActivityIImpl();
		return activityI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseI createCaseI() {
		CaseIImpl caseI = new CaseIImpl();
		return caseI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModel createCoreModel() {
		CoreModelImpl coreModel = new CoreModelImpl();
		return coreModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeCoreModel createRuntimeCoreModel() {
		RuntimeCoreModelImpl runtimeCoreModel = new RuntimeCoreModelImpl();
		return runtimeCoreModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationAspect createOrganisationAspect() {
		OrganisationAspectImpl organisationAspect = new OrganisationAspectImpl();
		return organisationAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAspect createControlAspect() {
		ControlAspectImpl controlAspect = new ControlAspectImpl();
		return controlAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngine createWorkflowEngine() {
		WorkflowEngineImpl workflowEngine = new WorkflowEngineImpl();
		return workflowEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessO createProcessO() {
		ProcessOImpl processO = new ProcessOImpl();
		return processO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDocumentType createDefaultDocumentType() {
		DefaultDocumentTypeImpl defaultDocumentType = new DefaultDocumentTypeImpl();
		return defaultDocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDocument createDefaultDocument() {
		DefaultDocumentImpl defaultDocument = new DefaultDocumentImpl();
		return defaultDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldValue createFieldValue() {
		FieldValueImpl fieldValue = new FieldValueImpl();
		return fieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationAspect createInformationAspect() {
		InformationAspectImpl informationAspect = new InformationAspectImpl();
		return informationAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseO createCaseO() {
		CaseOImpl caseO = new CaseOImpl();
		return caseO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRuntimeAspect createInformationRuntimeAspect() {
		InformationRuntimeAspectImpl informationRuntimeAspect = new InformationRuntimeAspectImpl();
		return informationRuntimeAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDocumentDescriptor createDefaultDocumentDescriptor() {
		DefaultDocumentDescriptorImpl defaultDocumentDescriptor = new DefaultDocumentDescriptorImpl();
		return defaultDocumentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDocument createProcessDocument() {
		ProcessDocumentImpl processDocument = new ProcessDocumentImpl();
		return processDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Document> createString2DocumentMap() {
		String2DocumentMapImpl string2DocumentMap = new String2DocumentMapImpl();
		return string2DocumentMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentDescrAtom createDocumentDescrAtom() {
		DocumentDescrAtomImpl documentDescrAtom = new DocumentDescrAtomImpl();
		return documentDescrAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAtom createFieldAtom() {
		FieldAtomImpl fieldAtom = new FieldAtomImpl();
		return fieldAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantAtom createConstantAtom() {
		ConstantAtomImpl constantAtom = new ConstantAtomImpl();
		return constantAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotOperator createDotOperator() {
		DotOperatorImpl dotOperator = new DotOperatorImpl();
		return dotOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualToOperator createEqualToOperator() {
		EqualToOperatorImpl equalToOperator = new EqualToOperatorImpl();
		return equalToOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDocumentCondition createDefaultDocumentCondition() {
		DefaultDocumentConditionImpl defaultDocumentCondition = new DefaultDocumentConditionImpl();
		return defaultDocumentCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumField createEnumField() {
		EnumFieldImpl enumField = new EnumFieldImpl();
		return enumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumFieldValue createEnumFieldValue() {
		EnumFieldValueImpl enumFieldValue = new EnumFieldValueImpl();
		return enumFieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanOperator createLessThanOperator() {
		LessThanOperatorImpl lessThanOperator = new LessThanOperatorImpl();
		return lessThanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanOperator createGreaterThanOperator() {
		GreaterThanOperatorImpl greaterThanOperator = new GreaterThanOperatorImpl();
		return greaterThanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumFieldAtom createEnumFieldAtom() {
		EnumFieldAtomImpl enumFieldAtom = new EnumFieldAtomImpl();
		return enumFieldAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralAtom createEnumLiteralAtom() {
		EnumLiteralAtomImpl enumLiteralAtom = new EnumLiteralAtomImpl();
		return enumLiteralAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnequalToOperator createUnequalToOperator() {
		UnequalToOperatorImpl unequalToOperator = new UnequalToOperatorImpl();
		return unequalToOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentContainer createAgentContainer() {
		AgentContainerImpl agentContainer = new AgentContainerImpl();
		return agentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTypeContainer createDocumentTypeContainer() {
		DocumentTypeContainerImpl documentTypeContainer = new DocumentTypeContainerImpl();
		return documentTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentContainer createDocumentContainer() {
		DocumentContainerImpl documentContainer = new DocumentContainerImpl();
		return documentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMyStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMyStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createMyListFromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMyListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPackage getWorkflowPackage() {
		return (WorkflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage() {
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactoryImpl
