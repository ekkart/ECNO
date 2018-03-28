/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.compute.se.ecno.statespace.Event;
import dk.dtu.compute.se.ecno.statespace.Link;
import dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues;
import dk.dtu.compute.se.ecno.statespace.Parameter;
import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Transition;
import dk.dtu.compute.se.ecno.statespace.Value;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage
 * @generated
 */
public class StatespaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatespacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatespaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatespacePackage.eINSTANCE;
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
	protected StatespaceSwitch<Adapter> modelSwitch =
		new StatespaceSwitch<Adapter>() {
			@Override
			public Adapter caseStateSpace(StateSpace object) {
				return createStateSpaceAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseStateObject(StateObject object) {
				return createStateObjectAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseObjectFeatureValues(ObjectFeatureValues object) {
				return createObjectFeatureValuesAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseStateSpaceControllerState(StateSpaceControllerState object) {
				return createStateSpaceControllerStateAdapter();
			}
			@Override
			public Adapter caseControllerState(ControllerState object) {
				return createControllerStateAdapter();
			}
			@Override
			public Adapter caseObjectReference(ObjectReference object) {
				return createObjectReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.StateSpace <em>State Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace
	 * @generated
	 */
	public Adapter createStateSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.StateObject <em>State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.StateObject
	 * @generated
	 */
	public Adapter createStateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues <em>Object Feature Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues
	 * @generated
	 */
	public Adapter createObjectFeatureValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState <em>State Space Controller State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState
	 * @generated
	 */
	public Adapter createStateSpaceControllerStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState <em>Controller State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState
	 * @generated
	 */
	public Adapter createControllerStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference <em>Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference
	 * @generated
	 */
	public Adapter createObjectReferenceAdapter() {
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

} //StatespaceAdapterFactory
