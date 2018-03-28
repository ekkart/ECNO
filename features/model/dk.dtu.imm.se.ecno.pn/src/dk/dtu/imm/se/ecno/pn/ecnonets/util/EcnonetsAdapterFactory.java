/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.util;

import dk.dtu.imm.se.ecno.pn.ecnonets.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pnmlcoremodel.ID;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import org.pnml.tools.epnk.pntypes.ptnet.PTNet;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage
 * @generated
 */
public class EcnonetsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcnonetsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnonetsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcnonetsPackage.eINSTANCE;
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
	protected EcnonetsSwitch<Adapter> modelSwitch =
		new EcnonetsSwitch<Adapter>() {
			@Override
			public Adapter caseECNONet(ECNONet object) {
				return createECNONetAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseEventBinding(EventBinding object) {
				return createEventBindingAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseEventUses(EventUses object) {
				return createEventUsesAdapter();
			}
			@Override
			public Adapter caseEventUse(EventUse object) {
				return createEventUseAdapter();
			}
			@Override
			public Adapter caseJavaExpression(JavaExpression object) {
				return createJavaExpressionAdapter();
			}
			@Override
			public Adapter caseJavaStatement(JavaStatement object) {
				return createJavaStatementAdapter();
			}
			@Override
			public Adapter caseImports(Imports object) {
				return createImportsAdapter();
			}
			@Override
			public Adapter caseAttributeDeclarations(AttributeDeclarations object) {
				return createAttributeDeclarationsAdapter();
			}
			@Override
			public Adapter caseNamedParameter(NamedParameter object) {
				return createNamedParameterAdapter();
			}
			@Override
			public Adapter casePetriNetType(PetriNetType object) {
				return createPetriNetTypeAdapter();
			}
			@Override
			public Adapter casePTNet(PTNet object) {
				return createPTNetAdapter();
			}
			@Override
			public Adapter caseStructuredPetriNetType(StructuredPetriNetType object) {
				return createStructuredPetriNetTypeAdapter();
			}
			@Override
			public Adapter caseID(ID object) {
				return createIDAdapter();
			}
			@Override
			public Adapter caseObject(org.pnml.tools.epnk.pnmlcoremodel.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseTransitionNode(TransitionNode object) {
				return createTransitionNodeAdapter();
			}
			@Override
			public Adapter casePnmlcoremodel_Transition(org.pnml.tools.epnk.pnmlcoremodel.Transition object) {
				return createPnmlcoremodel_TransitionAdapter();
			}
			@Override
			public Adapter casePnmlcoremodel_Page(org.pnml.tools.epnk.pnmlcoremodel.Page object) {
				return createPnmlcoremodel_PageAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseStructuredLabel(StructuredLabel object) {
				return createStructuredLabelAdapter();
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
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet <em>ECNO Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet
	 * @generated
	 */
	public Adapter createECNONetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding <em>Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding
	 * @generated
	 */
	public Adapter createEventBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUses <em>Event Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUses
	 * @generated
	 */
	public Adapter createEventUsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse <em>Event Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUse
	 * @generated
	 */
	public Adapter createEventUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression <em>Java Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression
	 * @generated
	 */
	public Adapter createJavaExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement <em>Java Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement
	 * @generated
	 */
	public Adapter createJavaStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Imports
	 * @generated
	 */
	public Adapter createImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations <em>Attribute Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations
	 * @generated
	 */
	public Adapter createAttributeDeclarationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter <em>Named Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter
	 * @generated
	 */
	public Adapter createNamedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.PetriNetType <em>Petri Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNetType
	 * @generated
	 */
	public Adapter createPetriNetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.ptnet.PTNet <em>PT Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.ptnet.PTNet
	 * @generated
	 */
	public Adapter createPTNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType <em>Structured Petri Net Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType
	 * @generated
	 */
	public Adapter createStructuredPetriNetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.TransitionNode <em>Transition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.TransitionNode
	 * @generated
	 */
	public Adapter createTransitionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Transition
	 * @generated
	 */
	public Adapter createPnmlcoremodel_TransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Page
	 * @generated
	 */
	public Adapter createPnmlcoremodel_PageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel <em>Structured Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel
	 * @generated
	 */
	public Adapter createStructuredLabelAdapter() {
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

} //EcnonetsAdapterFactory
