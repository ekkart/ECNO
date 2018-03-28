/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.util;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage
 * @generated
 */
public class BehaviourstatesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourstatesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourstatesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviourstatesPackage.eINSTANCE;
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
	protected BehaviourstatesSwitch<Adapter> modelSwitch =
		new BehaviourstatesSwitch<Adapter>() {
			@Override
			public Adapter caseBehaviourStates(BehaviourStates object) {
				return createBehaviourStatesAdapter();
			}
			@Override
			public Adapter caseBehaviourState(BehaviourState object) {
				return createBehaviourStateAdapter();
			}
			@Override
			public Adapter caseDefaultState(DefaultState object) {
				return createDefaultStateAdapter();
			}
			@Override
			public Adapter casePTNetState(PTNetState object) {
				return createPTNetStateAdapter();
			}
			@Override
			public Adapter caseInheritedBehaviourState(InheritedBehaviourState object) {
				return createInheritedBehaviourStateAdapter();
			}
			@Override
			public Adapter caseDefaultContainer(DefaultContainer object) {
				return createDefaultContainerAdapter();
			}
			@Override
			public Adapter caseElementBehaviourState(ElementBehaviourState object) {
				return createElementBehaviourStateAdapter();
			}
			@Override
			public Adapter caseControllerConfigurator(ControllerConfigurator object) {
				return createControllerConfiguratorAdapter();
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
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates <em>Behaviour States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates
	 * @generated
	 */
	public Adapter createBehaviourStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState <em>Behaviour State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState
	 * @generated
	 */
	public Adapter createBehaviourStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultState
	 * @generated
	 */
	public Adapter createDefaultStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState <em>PT Net State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState
	 * @generated
	 */
	public Adapter createPTNetStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState <em>Inherited Behaviour State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState
	 * @generated
	 */
	public Adapter createInheritedBehaviourStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultContainer <em>Default Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultContainer
	 * @generated
	 */
	public Adapter createDefaultContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState <em>Element Behaviour State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState
	 * @generated
	 */
	public Adapter createElementBehaviourStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator <em>Controller Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator
	 * @generated
	 */
	public Adapter createControllerConfiguratorAdapter() {
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

} //BehaviourstatesAdapterFactory
