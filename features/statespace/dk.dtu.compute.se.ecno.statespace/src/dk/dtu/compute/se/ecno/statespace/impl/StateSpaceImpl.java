/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl#getStates <em>States</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl#getInit <em>Init</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl#getMaxUid <em>Max Uid</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateSpaceImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateSpaceImpl extends EObjectImpl implements StateSpace {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected State init;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The default value of the '{@link #getMaxUid() <em>Max Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUid()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxUid() <em>Max Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUid()
	 * @generated
	 * @ordered
	 */
	protected int maxUid = MAX_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected String config = CONFIG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatespacePackage.Literals.STATE_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE_SPACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE_SPACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, StatespacePackage.STATE_SPACE__STATES, StatespacePackage.STATE__STATESPACE);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInit() {
		if (init != null && init.eIsProxy()) {
			InternalEObject oldInit = (InternalEObject)init;
			init = (State)eResolveProxy(oldInit);
			if (init != oldInit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatespacePackage.STATE_SPACE__INIT, oldInit, init));
			}
		}
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(State newInit) {
		State oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE_SPACE__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, StatespacePackage.STATE_SPACE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxUid() {
		return maxUid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUid(int newMaxUid) {
		int oldMaxUid = maxUid;
		maxUid = newMaxUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE_SPACE__MAX_UID, oldMaxUid, maxUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(String newConfig) {
		String oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE_SPACE__CONFIG, oldConfig, config));
	}

	/*
	 * @generated NOT
	 * @author Ekkart Kindler. ekki@dtu.dk
	 */
	private Map<State, State> statesHashmap = null;

	/*
	 * @generated NOT
	 * @author Ekkart Kindler. ekki@dtu.dk
	 */
	private void updateHashedStates() {
		if (statesHashmap == null) {
			statesHashmap = new HashMap<State, State>();
			List<State> duplicates = new ArrayList<State>();
			for (State s: getStates()) {
				if (!statesHashmap.keySet().contains(s)) {
					statesHashmap.put(s,s);
				} else {
					duplicates.add(s);
				}
			}
			
			// TODO fix duplicates: adjust transitions referring to them and
			// then
			
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Ekkart Kindler, ekki@dtu.dk
	 */
	public State add(State state) {
		updateHashedStates();
		State existingState = statesHashmap.get(state);
		if (existingState == null) {
			if (this.getStates().isEmpty()) {
				this.setInit(state);
			}
			state.setNumber(this.getStates().size()+1);
			getStates().add(state);
			statesHashmap.put(state, state);
			return state;
		} else {
			return existingState;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition add(Transition Transition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatespacePackage.STATE_SPACE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatespacePackage.STATE_SPACE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StatespacePackage.STATE_SPACE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatespacePackage.STATE_SPACE__NAME:
				return getName();
			case StatespacePackage.STATE_SPACE__DESCRIPTION:
				return getDescription();
			case StatespacePackage.STATE_SPACE__STATES:
				return getStates();
			case StatespacePackage.STATE_SPACE__INIT:
				if (resolve) return getInit();
				return basicGetInit();
			case StatespacePackage.STATE_SPACE__TRANSITIONS:
				return getTransitions();
			case StatespacePackage.STATE_SPACE__MAX_UID:
				return getMaxUid();
			case StatespacePackage.STATE_SPACE__CONFIG:
				return getConfig();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatespacePackage.STATE_SPACE__NAME:
				setName((String)newValue);
				return;
			case StatespacePackage.STATE_SPACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StatespacePackage.STATE_SPACE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatespacePackage.STATE_SPACE__INIT:
				setInit((State)newValue);
				return;
			case StatespacePackage.STATE_SPACE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatespacePackage.STATE_SPACE__MAX_UID:
				setMaxUid((Integer)newValue);
				return;
			case StatespacePackage.STATE_SPACE__CONFIG:
				setConfig((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatespacePackage.STATE_SPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StatespacePackage.STATE_SPACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StatespacePackage.STATE_SPACE__STATES:
				getStates().clear();
				return;
			case StatespacePackage.STATE_SPACE__INIT:
				setInit((State)null);
				return;
			case StatespacePackage.STATE_SPACE__TRANSITIONS:
				getTransitions().clear();
				return;
			case StatespacePackage.STATE_SPACE__MAX_UID:
				setMaxUid(MAX_UID_EDEFAULT);
				return;
			case StatespacePackage.STATE_SPACE__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatespacePackage.STATE_SPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StatespacePackage.STATE_SPACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StatespacePackage.STATE_SPACE__STATES:
				return states != null && !states.isEmpty();
			case StatespacePackage.STATE_SPACE__INIT:
				return init != null;
			case StatespacePackage.STATE_SPACE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case StatespacePackage.STATE_SPACE__MAX_UID:
				return maxUid != MAX_UID_EDEFAULT;
			case StatespacePackage.STATE_SPACE__CONFIG:
				return CONFIG_EDEFAULT == null ? config != null : !CONFIG_EDEFAULT.equals(config);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", maxUid: ");
		result.append(maxUid);
		result.append(", config: ");
		result.append(config);
		result.append(')');
		return result.toString();
	}

} //StateSpaceImpl
