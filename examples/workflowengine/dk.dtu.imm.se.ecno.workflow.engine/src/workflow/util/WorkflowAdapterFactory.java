/**
 */
package workflow.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public class WorkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowSwitch<Adapter> modelSwitch =
		new WorkflowSwitch<Adapter>() {
			@Override
			public Adapter caseTaskO(TaskO object) {
				return createTaskOAdapter();
			}
			@Override
			public Adapter caseActivityO(ActivityO object) {
				return createActivityOAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseRuntimeInformation(RuntimeInformation object) {
				return createRuntimeInformationAdapter();
			}
			@Override
			public Adapter caseTaskC(TaskC object) {
				return createTaskCAdapter();
			}
			@Override
			public Adapter caseActivityC(ActivityC object) {
				return createActivityCAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseCaseC(CaseC object) {
				return createCaseCAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter casePetriNet(PetriNet object) {
				return createPetriNetAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseMarking(Marking object) {
				return createMarkingAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseModelRegistry(ModelRegistry object) {
				return createModelRegistryAdapter();
			}
			@Override
			public Adapter caseInformation(Information object) {
				return createInformationAdapter();
			}
			@Override
			public Adapter caseTaskI(TaskI object) {
				return createTaskIAdapter();
			}
			@Override
			public Adapter caseDocumentDescriptor(DocumentDescriptor object) {
				return createDocumentDescriptorAdapter();
			}
			@Override
			public Adapter caseDocumentType(DocumentType object) {
				return createDocumentTypeAdapter();
			}
			@Override
			public Adapter caseActivityI(ActivityI object) {
				return createActivityIAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseCaseI(CaseI object) {
				return createCaseIAdapter();
			}
			@Override
			public Adapter caseModelAspect(ModelAspect object) {
				return createModelAspectAdapter();
			}
			@Override
			public Adapter caseProcessAspect(ProcessAspect object) {
				return createProcessAspectAdapter();
			}
			@Override
			public Adapter caseTaskAspect(TaskAspect object) {
				return createTaskAspectAdapter();
			}
			@Override
			public Adapter caseRuntimeModelAspect(RuntimeModelAspect object) {
				return createRuntimeModelAspectAdapter();
			}
			@Override
			public Adapter caseCaseAspect(CaseAspect object) {
				return createCaseAspectAdapter();
			}
			@Override
			public Adapter caseActivityAspect(ActivityAspect object) {
				return createActivityAspectAdapter();
			}
			@Override
			public Adapter caseCoreModel(CoreModel object) {
				return createCoreModelAdapter();
			}
			@Override
			public Adapter caseProcess(workflow.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseRuntimeCoreModel(RuntimeCoreModel object) {
				return createRuntimeCoreModelAdapter();
			}
			@Override
			public Adapter caseOrganisationAspect(OrganisationAspect object) {
				return createOrganisationAspectAdapter();
			}
			@Override
			public Adapter caseControlAspect(ControlAspect object) {
				return createControlAspectAdapter();
			}
			@Override
			public Adapter caseWorkflowEngine(WorkflowEngine object) {
				return createWorkflowEngineAdapter();
			}
			@Override
			public Adapter caseProcessO(ProcessO object) {
				return createProcessOAdapter();
			}
			@Override
			public Adapter caseDocumentCondition(DocumentCondition object) {
				return createDocumentConditionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseDefaultDocumentType(DefaultDocumentType object) {
				return createDefaultDocumentTypeAdapter();
			}
			@Override
			public Adapter caseDefaultDocument(DefaultDocument object) {
				return createDefaultDocumentAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseFieldValue(FieldValue object) {
				return createFieldValueAdapter();
			}
			@Override
			public Adapter caseInformationAspect(InformationAspect object) {
				return createInformationAspectAdapter();
			}
			@Override
			public Adapter caseCaseO(CaseO object) {
				return createCaseOAdapter();
			}
			@Override
			public Adapter caseInformationRuntimeAspect(InformationRuntimeAspect object) {
				return createInformationRuntimeAspectAdapter();
			}
			@Override
			public Adapter caseDefaultDocumentDescriptor(DefaultDocumentDescriptor object) {
				return createDefaultDocumentDescriptorAdapter();
			}
			@Override
			public Adapter caseProcessDocument(ProcessDocument object) {
				return createProcessDocumentAdapter();
			}
			@Override
			public Adapter caseString2DocumentMap(Map.Entry<String, Document> object) {
				return createString2DocumentMapAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseDocumentDescrAtom(DocumentDescrAtom object) {
				return createDocumentDescrAtomAdapter();
			}
			@Override
			public Adapter caseFieldAtom(FieldAtom object) {
				return createFieldAtomAdapter();
			}
			@Override
			public Adapter caseConstantAtom(ConstantAtom object) {
				return createConstantAtomAdapter();
			}
			@Override
			public Adapter caseDotOperator(DotOperator object) {
				return createDotOperatorAdapter();
			}
			@Override
			public Adapter caseEqualToOperator(EqualToOperator object) {
				return createEqualToOperatorAdapter();
			}
			@Override
			public Adapter caseDefaultDocumentCondition(DefaultDocumentCondition object) {
				return createDefaultDocumentConditionAdapter();
			}
			@Override
			public Adapter caseEnumField(EnumField object) {
				return createEnumFieldAdapter();
			}
			@Override
			public Adapter caseEnumLiteral(EnumLiteral object) {
				return createEnumLiteralAdapter();
			}
			@Override
			public Adapter caseEnumFieldValue(EnumFieldValue object) {
				return createEnumFieldValueAdapter();
			}
			@Override
			public Adapter caseLessThanOperator(LessThanOperator object) {
				return createLessThanOperatorAdapter();
			}
			@Override
			public Adapter caseGreaterThanOperator(GreaterThanOperator object) {
				return createGreaterThanOperatorAdapter();
			}
			@Override
			public Adapter caseEnumFieldAtom(EnumFieldAtom object) {
				return createEnumFieldAtomAdapter();
			}
			@Override
			public Adapter caseEnumLiteralAtom(EnumLiteralAtom object) {
				return createEnumLiteralAtomAdapter();
			}
			@Override
			public Adapter caseUnequalToOperator(UnequalToOperator object) {
				return createUnequalToOperatorAdapter();
			}
			@Override
			public Adapter caseAgentContainer(AgentContainer object) {
				return createAgentContainerAdapter();
			}
			@Override
			public Adapter caseOrganisation(Organisation object) {
				return createOrganisationAdapter();
			}
			@Override
			public Adapter caseGlobalAspect(GlobalAspect object) {
				return createGlobalAspectAdapter();
			}
			@Override
			public Adapter caseRuntimeGlobalAspect(RuntimeGlobalAspect object) {
				return createRuntimeGlobalAspectAdapter();
			}
			@Override
			public Adapter caseDocumentTypeContainer(DocumentTypeContainer object) {
				return createDocumentTypeContainerAdapter();
			}
			@Override
			public Adapter caseDocumentContainer(DocumentContainer object) {
				return createDocumentContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link workflow.TaskO <em>Task O</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.TaskO
	 * @generated
	 */
	public Adapter createTaskOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ActivityO <em>Activity O</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ActivityO
	 * @generated
	 */
	public Adapter createActivityOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.RuntimeInformation <em>Runtime Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.RuntimeInformation
	 * @generated
	 */
	public Adapter createRuntimeInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.TaskC <em>Task C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.TaskC
	 * @generated
	 */
	public Adapter createTaskCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ActivityC <em>Activity C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ActivityC
	 * @generated
	 */
	public Adapter createActivityCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.CaseC <em>Case C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.CaseC
	 * @generated
	 */
	public Adapter createCaseCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.PetriNet
	 * @generated
	 */
	public Adapter createPetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Marking
	 * @generated
	 */
	public Adapter createMarkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ModelRegistry
	 * @generated
	 */
	public Adapter createModelRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.TaskI <em>Task I</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.TaskI
	 * @generated
	 */
	public Adapter createTaskIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DocumentDescriptor <em>Document Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DocumentDescriptor
	 * @generated
	 */
	public Adapter createDocumentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DocumentType
	 * @generated
	 */
	public Adapter createDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ActivityI <em>Activity I</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ActivityI
	 * @generated
	 */
	public Adapter createActivityIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.CaseI <em>Case I</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.CaseI
	 * @generated
	 */
	public Adapter createCaseIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ModelAspect <em>Model Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ModelAspect
	 * @generated
	 */
	public Adapter createModelAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ProcessAspect <em>Process Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ProcessAspect
	 * @generated
	 */
	public Adapter createProcessAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.TaskAspect <em>Task Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.TaskAspect
	 * @generated
	 */
	public Adapter createTaskAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.RuntimeModelAspect <em>Runtime Model Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.RuntimeModelAspect
	 * @generated
	 */
	public Adapter createRuntimeModelAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.CaseAspect <em>Case Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.CaseAspect
	 * @generated
	 */
	public Adapter createCaseAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ActivityAspect <em>Activity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ActivityAspect
	 * @generated
	 */
	public Adapter createActivityAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.CoreModel <em>Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.CoreModel
	 * @generated
	 */
	public Adapter createCoreModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.RuntimeCoreModel <em>Runtime Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.RuntimeCoreModel
	 * @generated
	 */
	public Adapter createRuntimeCoreModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.OrganisationAspect <em>Organisation Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.OrganisationAspect
	 * @generated
	 */
	public Adapter createOrganisationAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ControlAspect <em>Control Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ControlAspect
	 * @generated
	 */
	public Adapter createControlAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.WorkflowEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.WorkflowEngine
	 * @generated
	 */
	public Adapter createWorkflowEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ProcessO <em>Process O</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ProcessO
	 * @generated
	 */
	public Adapter createProcessOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DocumentCondition <em>Document Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DocumentCondition
	 * @generated
	 */
	public Adapter createDocumentConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DefaultDocumentType <em>Default Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DefaultDocumentType
	 * @generated
	 */
	public Adapter createDefaultDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DefaultDocument <em>Default Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DefaultDocument
	 * @generated
	 */
	public Adapter createDefaultDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.FieldValue
	 * @generated
	 */
	public Adapter createFieldValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.InformationAspect <em>Information Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.InformationAspect
	 * @generated
	 */
	public Adapter createInformationAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.CaseO <em>Case O</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.CaseO
	 * @generated
	 */
	public Adapter createCaseOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.InformationRuntimeAspect <em>Information Runtime Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.InformationRuntimeAspect
	 * @generated
	 */
	public Adapter createInformationRuntimeAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DefaultDocumentDescriptor <em>Default Document Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DefaultDocumentDescriptor
	 * @generated
	 */
	public Adapter createDefaultDocumentDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ProcessDocument <em>Process Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ProcessDocument
	 * @generated
	 */
	public Adapter createProcessDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String2 Document Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createString2DocumentMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DocumentDescrAtom <em>Document Descr Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DocumentDescrAtom
	 * @generated
	 */
	public Adapter createDocumentDescrAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.FieldAtom <em>Field Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.FieldAtom
	 * @generated
	 */
	public Adapter createFieldAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.ConstantAtom <em>Constant Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.ConstantAtom
	 * @generated
	 */
	public Adapter createConstantAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DotOperator <em>Dot Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DotOperator
	 * @generated
	 */
	public Adapter createDotOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.EqualToOperator <em>Equal To Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.EqualToOperator
	 * @generated
	 */
	public Adapter createEqualToOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DefaultDocumentCondition <em>Default Document Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DefaultDocumentCondition
	 * @generated
	 */
	public Adapter createDefaultDocumentConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.EnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.EnumField
	 * @generated
	 */
	public Adapter createEnumFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.EnumLiteral
	 * @generated
	 */
	public Adapter createEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.EnumFieldValue <em>Enum Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.EnumFieldValue
	 * @generated
	 */
	public Adapter createEnumFieldValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.LessThanOperator <em>Less Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.LessThanOperator
	 * @generated
	 */
	public Adapter createLessThanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.GreaterThanOperator <em>Greater Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.GreaterThanOperator
	 * @generated
	 */
	public Adapter createGreaterThanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.EnumFieldAtom <em>Enum Field Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.EnumFieldAtom
	 * @generated
	 */
	public Adapter createEnumFieldAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.EnumLiteralAtom <em>Enum Literal Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.EnumLiteralAtom
	 * @generated
	 */
	public Adapter createEnumLiteralAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.UnequalToOperator <em>Unequal To Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.UnequalToOperator
	 * @generated
	 */
	public Adapter createUnequalToOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.AgentContainer <em>Agent Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.AgentContainer
	 * @generated
	 */
	public Adapter createAgentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.Organisation
	 * @generated
	 */
	public Adapter createOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.GlobalAspect <em>Global Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.GlobalAspect
	 * @generated
	 */
	public Adapter createGlobalAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.RuntimeGlobalAspect <em>Runtime Global Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.RuntimeGlobalAspect
	 * @generated
	 */
	public Adapter createRuntimeGlobalAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DocumentTypeContainer <em>Document Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DocumentTypeContainer
	 * @generated
	 */
	public Adapter createDocumentTypeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link workflow.DocumentContainer <em>Document Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see workflow.DocumentContainer
	 * @generated
	 */
	public Adapter createDocumentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WorkflowAdapterFactory
