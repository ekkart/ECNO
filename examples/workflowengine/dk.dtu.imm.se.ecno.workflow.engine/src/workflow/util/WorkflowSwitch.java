/**
 */
package workflow.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import workflow.Activity;
import workflow.ActivityAspect;
import workflow.ActivityC;
import workflow.ActivityI;
import workflow.ActivityO;
import workflow.Agent;
import workflow.AgentContainer;
import workflow.Arc;
import workflow.Atom;
import workflow.Case;
import workflow.CaseAspect;
import workflow.CaseC;
import workflow.CaseI;
import workflow.CaseO;
import workflow.ConstantAtom;
import workflow.Control;
import workflow.ControlAspect;
import workflow.CoreModel;
import workflow.DefaultDocument;
import workflow.DefaultDocumentCondition;
import workflow.DefaultDocumentDescriptor;
import workflow.DefaultDocumentType;
import workflow.Document;
import workflow.DocumentCondition;
import workflow.DocumentContainer;
import workflow.DocumentDescrAtom;
import workflow.DocumentDescriptor;
import workflow.DocumentType;
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
import workflow.GlobalAspect;
import workflow.GreaterThanOperator;
import workflow.Information;
import workflow.InformationAspect;
import workflow.InformationRuntimeAspect;
import workflow.LessThanOperator;
import workflow.Marking;
import workflow.ModelAspect;
import workflow.ModelRegistry;
import workflow.Operator;
import workflow.Organisation;
import workflow.OrganisationAspect;
import workflow.PetriNet;
import workflow.Place;
import workflow.ProcessAspect;
import workflow.ProcessDocument;
import workflow.ProcessO;
import workflow.Role;
import workflow.RuntimeCoreModel;
import workflow.RuntimeGlobalAspect;
import workflow.RuntimeInformation;
import workflow.RuntimeModelAspect;
import workflow.State;
import workflow.Task;
import workflow.TaskAspect;
import workflow.TaskC;
import workflow.TaskI;
import workflow.TaskO;
import workflow.Token;
import workflow.Transition;
import workflow.UnequalToOperator;
import workflow.WorkflowEngine;
import workflow.WorkflowPackage;

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
 * @see workflow.WorkflowPackage
 * @generated
 */
public class WorkflowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
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
			case WorkflowPackage.TASK_O: {
				TaskO taskO = (TaskO)theEObject;
				T result = caseTaskO(taskO);
				if (result == null) result = caseTaskAspect(taskO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ACTIVITY_O: {
				ActivityO activityO = (ActivityO)theEObject;
				T result = caseActivityO(activityO);
				if (result == null) result = caseActivityAspect(activityO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.RUNTIME_INFORMATION: {
				RuntimeInformation runtimeInformation = (RuntimeInformation)theEObject;
				T result = caseRuntimeInformation(runtimeInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TASK_C: {
				TaskC taskC = (TaskC)theEObject;
				T result = caseTaskC(taskC);
				if (result == null) result = caseTaskAspect(taskC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ACTIVITY_C: {
				ActivityC activityC = (ActivityC)theEObject;
				T result = caseActivityC(activityC);
				if (result == null) result = caseActivityAspect(activityC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseProcessAspect(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CASE_C: {
				CaseC caseC = (CaseC)theEObject;
				T result = caseCaseC(caseC);
				if (result == null) result = caseCaseAspect(caseC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.PETRI_NET: {
				PetriNet petriNet = (PetriNet)theEObject;
				T result = casePetriNet(petriNet);
				if (result == null) result = caseControl(petriNet);
				if (result == null) result = caseProcessAspect(petriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseTaskC(transition);
				if (result == null) result = caseTaskAspect(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.MARKING: {
				Marking marking = (Marking)theEObject;
				T result = caseMarking(marking);
				if (result == null) result = caseState(marking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.MODEL_REGISTRY: {
				ModelRegistry modelRegistry = (ModelRegistry)theEObject;
				T result = caseModelRegistry(modelRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.INFORMATION: {
				Information information = (Information)theEObject;
				T result = caseInformation(information);
				if (result == null) result = caseProcessAspect(information);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TASK_I: {
				TaskI taskI = (TaskI)theEObject;
				T result = caseTaskI(taskI);
				if (result == null) result = caseTaskAspect(taskI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOCUMENT_DESCRIPTOR: {
				DocumentDescriptor documentDescriptor = (DocumentDescriptor)theEObject;
				T result = caseDocumentDescriptor(documentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOCUMENT_TYPE: {
				DocumentType documentType = (DocumentType)theEObject;
				T result = caseDocumentType(documentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ACTIVITY_I: {
				ActivityI activityI = (ActivityI)theEObject;
				T result = caseActivityI(activityI);
				if (result == null) result = caseActivityAspect(activityI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CASE_I: {
				CaseI caseI = (CaseI)theEObject;
				T result = caseCaseI(caseI);
				if (result == null) result = caseCaseAspect(caseI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.MODEL_ASPECT: {
				ModelAspect modelAspect = (ModelAspect)theEObject;
				T result = caseModelAspect(modelAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.PROCESS_ASPECT: {
				ProcessAspect processAspect = (ProcessAspect)theEObject;
				T result = caseProcessAspect(processAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TASK_ASPECT: {
				TaskAspect taskAspect = (TaskAspect)theEObject;
				T result = caseTaskAspect(taskAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.RUNTIME_MODEL_ASPECT: {
				RuntimeModelAspect runtimeModelAspect = (RuntimeModelAspect)theEObject;
				T result = caseRuntimeModelAspect(runtimeModelAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CASE_ASPECT: {
				CaseAspect caseAspect = (CaseAspect)theEObject;
				T result = caseCaseAspect(caseAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ACTIVITY_ASPECT: {
				ActivityAspect activityAspect = (ActivityAspect)theEObject;
				T result = caseActivityAspect(activityAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CORE_MODEL: {
				CoreModel coreModel = (CoreModel)theEObject;
				T result = caseCoreModel(coreModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.PROCESS: {
				workflow.Process process = (workflow.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.RUNTIME_CORE_MODEL: {
				RuntimeCoreModel runtimeCoreModel = (RuntimeCoreModel)theEObject;
				T result = caseRuntimeCoreModel(runtimeCoreModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ORGANISATION_ASPECT: {
				OrganisationAspect organisationAspect = (OrganisationAspect)theEObject;
				T result = caseOrganisationAspect(organisationAspect);
				if (result == null) result = caseModelAspect(organisationAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CONTROL_ASPECT: {
				ControlAspect controlAspect = (ControlAspect)theEObject;
				T result = caseControlAspect(controlAspect);
				if (result == null) result = caseModelAspect(controlAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_ENGINE: {
				WorkflowEngine workflowEngine = (WorkflowEngine)theEObject;
				T result = caseWorkflowEngine(workflowEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.PROCESS_O: {
				ProcessO processO = (ProcessO)theEObject;
				T result = caseProcessO(processO);
				if (result == null) result = caseProcessAspect(processO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOCUMENT_CONDITION: {
				DocumentCondition documentCondition = (DocumentCondition)theEObject;
				T result = caseDocumentCondition(documentCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE: {
				DefaultDocumentType defaultDocumentType = (DefaultDocumentType)theEObject;
				T result = caseDefaultDocumentType(defaultDocumentType);
				if (result == null) result = caseDocumentType(defaultDocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DEFAULT_DOCUMENT: {
				DefaultDocument defaultDocument = (DefaultDocument)theEObject;
				T result = caseDefaultDocument(defaultDocument);
				if (result == null) result = caseDocument(defaultDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.FIELD_VALUE: {
				FieldValue fieldValue = (FieldValue)theEObject;
				T result = caseFieldValue(fieldValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.INFORMATION_ASPECT: {
				InformationAspect informationAspect = (InformationAspect)theEObject;
				T result = caseInformationAspect(informationAspect);
				if (result == null) result = caseModelAspect(informationAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CASE_O: {
				CaseO caseO = (CaseO)theEObject;
				T result = caseCaseO(caseO);
				if (result == null) result = caseCaseAspect(caseO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.INFORMATION_RUNTIME_ASPECT: {
				InformationRuntimeAspect informationRuntimeAspect = (InformationRuntimeAspect)theEObject;
				T result = caseInformationRuntimeAspect(informationRuntimeAspect);
				if (result == null) result = caseRuntimeModelAspect(informationRuntimeAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DEFAULT_DOCUMENT_DESCRIPTOR: {
				DefaultDocumentDescriptor defaultDocumentDescriptor = (DefaultDocumentDescriptor)theEObject;
				T result = caseDefaultDocumentDescriptor(defaultDocumentDescriptor);
				if (result == null) result = caseDocumentDescriptor(defaultDocumentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.PROCESS_DOCUMENT: {
				ProcessDocument processDocument = (ProcessDocument)theEObject;
				T result = caseProcessDocument(processDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.STRING2_DOCUMENT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Document> string2DocumentMap = (Map.Entry<String, Document>)theEObject;
				T result = caseString2DocumentMap(string2DocumentMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = caseExpression(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseExpression(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOCUMENT_DESCR_ATOM: {
				DocumentDescrAtom documentDescrAtom = (DocumentDescrAtom)theEObject;
				T result = caseDocumentDescrAtom(documentDescrAtom);
				if (result == null) result = caseAtom(documentDescrAtom);
				if (result == null) result = caseExpression(documentDescrAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.FIELD_ATOM: {
				FieldAtom fieldAtom = (FieldAtom)theEObject;
				T result = caseFieldAtom(fieldAtom);
				if (result == null) result = caseAtom(fieldAtom);
				if (result == null) result = caseExpression(fieldAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.CONSTANT_ATOM: {
				ConstantAtom constantAtom = (ConstantAtom)theEObject;
				T result = caseConstantAtom(constantAtom);
				if (result == null) result = caseAtom(constantAtom);
				if (result == null) result = caseExpression(constantAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOT_OPERATOR: {
				DotOperator dotOperator = (DotOperator)theEObject;
				T result = caseDotOperator(dotOperator);
				if (result == null) result = caseOperator(dotOperator);
				if (result == null) result = caseExpression(dotOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.EQUAL_TO_OPERATOR: {
				EqualToOperator equalToOperator = (EqualToOperator)theEObject;
				T result = caseEqualToOperator(equalToOperator);
				if (result == null) result = caseOperator(equalToOperator);
				if (result == null) result = caseExpression(equalToOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DEFAULT_DOCUMENT_CONDITION: {
				DefaultDocumentCondition defaultDocumentCondition = (DefaultDocumentCondition)theEObject;
				T result = caseDefaultDocumentCondition(defaultDocumentCondition);
				if (result == null) result = caseDocumentCondition(defaultDocumentCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ENUM_FIELD: {
				EnumField enumField = (EnumField)theEObject;
				T result = caseEnumField(enumField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T result = caseEnumLiteral(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ENUM_FIELD_VALUE: {
				EnumFieldValue enumFieldValue = (EnumFieldValue)theEObject;
				T result = caseEnumFieldValue(enumFieldValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.LESS_THAN_OPERATOR: {
				LessThanOperator lessThanOperator = (LessThanOperator)theEObject;
				T result = caseLessThanOperator(lessThanOperator);
				if (result == null) result = caseOperator(lessThanOperator);
				if (result == null) result = caseExpression(lessThanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.GREATER_THAN_OPERATOR: {
				GreaterThanOperator greaterThanOperator = (GreaterThanOperator)theEObject;
				T result = caseGreaterThanOperator(greaterThanOperator);
				if (result == null) result = caseOperator(greaterThanOperator);
				if (result == null) result = caseExpression(greaterThanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ENUM_FIELD_ATOM: {
				EnumFieldAtom enumFieldAtom = (EnumFieldAtom)theEObject;
				T result = caseEnumFieldAtom(enumFieldAtom);
				if (result == null) result = caseAtom(enumFieldAtom);
				if (result == null) result = caseExpression(enumFieldAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ENUM_LITERAL_ATOM: {
				EnumLiteralAtom enumLiteralAtom = (EnumLiteralAtom)theEObject;
				T result = caseEnumLiteralAtom(enumLiteralAtom);
				if (result == null) result = caseAtom(enumLiteralAtom);
				if (result == null) result = caseExpression(enumLiteralAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.UNEQUAL_TO_OPERATOR: {
				UnequalToOperator unequalToOperator = (UnequalToOperator)theEObject;
				T result = caseUnequalToOperator(unequalToOperator);
				if (result == null) result = caseOperator(unequalToOperator);
				if (result == null) result = caseExpression(unequalToOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.AGENT_CONTAINER: {
				AgentContainer agentContainer = (AgentContainer)theEObject;
				T result = caseAgentContainer(agentContainer);
				if (result == null) result = caseRuntimeGlobalAspect(agentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.ORGANISATION: {
				Organisation organisation = (Organisation)theEObject;
				T result = caseOrganisation(organisation);
				if (result == null) result = caseGlobalAspect(organisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.GLOBAL_ASPECT: {
				GlobalAspect globalAspect = (GlobalAspect)theEObject;
				T result = caseGlobalAspect(globalAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.RUNTIME_GLOBAL_ASPECT: {
				RuntimeGlobalAspect runtimeGlobalAspect = (RuntimeGlobalAspect)theEObject;
				T result = caseRuntimeGlobalAspect(runtimeGlobalAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER: {
				DocumentTypeContainer documentTypeContainer = (DocumentTypeContainer)theEObject;
				T result = caseDocumentTypeContainer(documentTypeContainer);
				if (result == null) result = caseGlobalAspect(documentTypeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.DOCUMENT_CONTAINER: {
				DocumentContainer documentContainer = (DocumentContainer)theEObject;
				T result = caseDocumentContainer(documentContainer);
				if (result == null) result = caseRuntimeGlobalAspect(documentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task O</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task O</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskO(TaskO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity O</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity O</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityO(ActivityO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeInformation(RuntimeInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskC(TaskC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityC(ActivityC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseC(CaseC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetriNet(PetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarking(Marking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRegistry(ModelRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task I</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task I</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskI(TaskI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentDescriptor(DocumentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentType(DocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity I</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity I</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityI(ActivityI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case I</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case I</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseI(CaseI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelAspect(ModelAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessAspect(ProcessAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskAspect(TaskAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Model Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Model Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeModelAspect(RuntimeModelAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseAspect(CaseAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityAspect(ActivityAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreModel(CoreModel object) {
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
	public T caseProcess(workflow.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Core Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Core Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeCoreModel(RuntimeCoreModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisationAspect(OrganisationAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAspect(ControlAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowEngine(WorkflowEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process O</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process O</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessO(ProcessO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentCondition(DocumentCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultDocumentType(DefaultDocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultDocument(DefaultDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldValue(FieldValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationAspect(InformationAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case O</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case O</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseO(CaseO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Runtime Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Runtime Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationRuntimeAspect(InformationRuntimeAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Document Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Document Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultDocumentDescriptor(DefaultDocumentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessDocument(ProcessDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String2 Document Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String2 Document Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString2DocumentMap(Map.Entry<String, Document> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Descr Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Descr Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentDescrAtom(DocumentDescrAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAtom(FieldAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantAtom(ConstantAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dot Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDotOperator(DotOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal To Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualToOperator(EqualToOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Document Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Document Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultDocumentCondition(DefaultDocumentCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumField(EnumField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Field Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumFieldValue(EnumFieldValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOperator(LessThanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOperator(GreaterThanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Field Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Field Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumFieldAtom(EnumFieldAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteralAtom(EnumLiteralAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unequal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unequal To Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnequalToOperator(UnequalToOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentContainer(AgentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalAspect(GlobalAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Global Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Global Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeGlobalAspect(RuntimeGlobalAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTypeContainer(DocumentTypeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentContainer(DocumentContainer object) {
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

} //WorkflowSwitch
