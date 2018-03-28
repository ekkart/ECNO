/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourstatesFactoryImpl extends EFactoryImpl implements BehaviourstatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourstatesFactory init() {
		try {
			BehaviourstatesFactory theBehaviourstatesFactory = (BehaviourstatesFactory)EPackage.Registry.INSTANCE.getEFactory("http://ecno.se.imm.dtu.dk/ecno/save/bahaviourstates"); 
			if (theBehaviourstatesFactory != null) {
				return theBehaviourstatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourstatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourstatesFactoryImpl() {
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
			case BehaviourstatesPackage.BEHAVIOUR_STATES: return createBehaviourStates();
			case BehaviourstatesPackage.DEFAULT_STATE: return createDefaultState();
			case BehaviourstatesPackage.PT_NET_STATE: return createPTNetState();
			case BehaviourstatesPackage.INHERITED_BEHAVIOUR_STATE: return createInheritedBehaviourState();
			case BehaviourstatesPackage.DEFAULT_CONTAINER: return createDefaultContainer();
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE: return createElementBehaviourState();
			case BehaviourstatesPackage.CONTROLLER_CONFIGURATOR: return createControllerConfigurator();
			case BehaviourstatesPackage.OBJECT_REFERENCE: return createObjectReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourStates createBehaviourStates() {
		BehaviourStatesImpl behaviourStates = new BehaviourStatesImpl();
		return behaviourStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultState createDefaultState() {
		DefaultStateImpl defaultState = new DefaultStateImpl();
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTNetState createPTNetState() {
		PTNetStateImpl ptNetState = new PTNetStateImpl();
		return ptNetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritedBehaviourState createInheritedBehaviourState() {
		InheritedBehaviourStateImpl inheritedBehaviourState = new InheritedBehaviourStateImpl();
		return inheritedBehaviourState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultContainer createDefaultContainer() {
		DefaultContainerImpl defaultContainer = new DefaultContainerImpl();
		return defaultContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementBehaviourState createElementBehaviourState() {
		ElementBehaviourStateImpl elementBehaviourState = new ElementBehaviourStateImpl();
		return elementBehaviourState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerConfigurator createControllerConfigurator() {
		ControllerConfiguratorImpl controllerConfigurator = new ControllerConfiguratorImpl();
		return controllerConfigurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference createObjectReference() {
		ObjectReferenceImpl objectReference = new ObjectReferenceImpl();
		return objectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourstatesPackage getBehaviourstatesPackage() {
		return (BehaviourstatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourstatesPackage getPackage() {
		return BehaviourstatesPackage.eINSTANCE;
	}

} //BehaviourstatesFactoryImpl
