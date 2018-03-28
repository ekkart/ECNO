/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.util;

import dk.dtu.imm.se.ecno.pn.ecnonets.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.pnml.tools.epnk.pnmlcoremodel.ID;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;
import org.pnml.tools.epnk.pntypes.ptnet.PTNet;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType;

import dk.dtu.imm.se.ecno.pn.ecnonets.Action;
import dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations;
import dk.dtu.imm.se.ecno.pn.ecnonets.Condition;
import dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet;
import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUse;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUses;
import dk.dtu.imm.se.ecno.pn.ecnonets.Imports;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement;
import dk.dtu.imm.se.ecno.pn.ecnonets.Page;
import dk.dtu.imm.se.ecno.pn.ecnonets.Transition;

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
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage
 * @generated
 */
public class EcnonetsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcnonetsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnonetsSwitch() {
		if (modelPackage == null) {
			modelPackage = EcnonetsPackage.eINSTANCE;
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
			case EcnonetsPackage.ECNO_NET: {
				ECNONet ecnoNet = (ECNONet)theEObject;
				T result = caseECNONet(ecnoNet);
				if (result == null) result = casePTNet(ecnoNet);
				if (result == null) result = caseStructuredPetriNetType(ecnoNet);
				if (result == null) result = casePetriNetType(ecnoNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = casePnmlcoremodel_Transition(transition);
				if (result == null) result = caseTransitionNode(transition);
				if (result == null) result = caseNode(transition);
				if (result == null) result = caseObject(transition);
				if (result == null) result = caseID(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = casePnmlcoremodel_Page(page);
				if (result == null) result = caseNode(page);
				if (result == null) result = caseObject(page);
				if (result == null) result = caseID(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseStructuredLabel(condition);
				if (result == null) result = caseLabel(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.EVENT_BINDING: {
				EventBinding eventBinding = (EventBinding)theEObject;
				T result = caseEventBinding(eventBinding);
				if (result == null) result = caseStructuredLabel(eventBinding);
				if (result == null) result = caseLabel(eventBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseStructuredLabel(action);
				if (result == null) result = caseLabel(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.EVENT_USES: {
				EventUses eventUses = (EventUses)theEObject;
				T result = caseEventUses(eventUses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.EVENT_USE: {
				EventUse eventUse = (EventUse)theEObject;
				T result = caseEventUse(eventUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.JAVA_EXPRESSION: {
				JavaExpression javaExpression = (JavaExpression)theEObject;
				T result = caseJavaExpression(javaExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.JAVA_STATEMENT: {
				JavaStatement javaStatement = (JavaStatement)theEObject;
				T result = caseJavaStatement(javaStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.IMPORTS: {
				Imports imports = (Imports)theEObject;
				T result = caseImports(imports);
				if (result == null) result = caseLabel(imports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.ATTRIBUTE_DECLARATIONS: {
				AttributeDeclarations attributeDeclarations = (AttributeDeclarations)theEObject;
				T result = caseAttributeDeclarations(attributeDeclarations);
				if (result == null) result = caseLabel(attributeDeclarations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcnonetsPackage.NAMED_PARAMETER: {
				NamedParameter namedParameter = (NamedParameter)theEObject;
				T result = caseNamedParameter(namedParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECNO Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECNO Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECNONet(ECNONet object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBinding(EventBinding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event Uses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Uses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventUses(EventUses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventUse(EventUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaExpression(JavaExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaStatement(JavaStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImports(Imports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Declarations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDeclarations(AttributeDeclarations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedParameter(NamedParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Net Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Net Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetriNetType(PetriNetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTNet(PTNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Petri Net Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Petri Net Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredPetriNetType(StructuredPetriNetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID(ID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(org.pnml.tools.epnk.pnmlcoremodel.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionNode(TransitionNode object) {
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
	public T casePnmlcoremodel_Transition(org.pnml.tools.epnk.pnmlcoremodel.Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePnmlcoremodel_Page(org.pnml.tools.epnk.pnmlcoremodel.Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredLabel(StructuredLabel object) {
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

} //EcnonetsSwitch
