/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.util;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.*;

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
 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage
 * @generated
 */
public class BehaviourstatesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourstatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourstatesSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviourstatesPackage.eINSTANCE;
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
			case BehaviourstatesPackage.BEHAVIOUR_STATES: {
				BehaviourStates behaviourStates = (BehaviourStates)theEObject;
				T result = caseBehaviourStates(behaviourStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.BEHAVIOUR_STATE: {
				BehaviourState behaviourState = (BehaviourState)theEObject;
				T result = caseBehaviourState(behaviourState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.DEFAULT_STATE: {
				DefaultState defaultState = (DefaultState)theEObject;
				T result = caseDefaultState(defaultState);
				if (result == null) result = caseBehaviourState(defaultState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.PT_NET_STATE: {
				PTNetState ptNetState = (PTNetState)theEObject;
				T result = casePTNetState(ptNetState);
				if (result == null) result = caseBehaviourState(ptNetState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.INHERITED_BEHAVIOUR_STATE: {
				InheritedBehaviourState inheritedBehaviourState = (InheritedBehaviourState)theEObject;
				T result = caseInheritedBehaviourState(inheritedBehaviourState);
				if (result == null) result = caseBehaviourState(inheritedBehaviourState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.DEFAULT_CONTAINER: {
				DefaultContainer defaultContainer = (DefaultContainer)theEObject;
				T result = caseDefaultContainer(defaultContainer);
				if (result == null) result = caseBehaviourState(defaultContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE: {
				ElementBehaviourState elementBehaviourState = (ElementBehaviourState)theEObject;
				T result = caseElementBehaviourState(elementBehaviourState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.CONTROLLER_CONFIGURATOR: {
				ControllerConfigurator controllerConfigurator = (ControllerConfigurator)theEObject;
				T result = caseControllerConfigurator(controllerConfigurator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.CONTROLLER_STATE: {
				ControllerState controllerState = (ControllerState)theEObject;
				T result = caseControllerState(controllerState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourstatesPackage.OBJECT_REFERENCE: {
				ObjectReference objectReference = (ObjectReference)theEObject;
				T result = caseObjectReference(objectReference);
				if (result == null) result = caseControllerState(objectReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviourStates(BehaviourStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviourState(BehaviourState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultState(DefaultState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Net State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Net State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTNetState(PTNetState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inherited Behaviour State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inherited Behaviour State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritedBehaviourState(InheritedBehaviourState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultContainer(DefaultContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Behaviour State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Behaviour State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementBehaviourState(ElementBehaviourState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Configurator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerConfigurator(ControllerConfigurator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerState(ControllerState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectReference(ObjectReference object) {
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

} //BehaviourstatesSwitch
