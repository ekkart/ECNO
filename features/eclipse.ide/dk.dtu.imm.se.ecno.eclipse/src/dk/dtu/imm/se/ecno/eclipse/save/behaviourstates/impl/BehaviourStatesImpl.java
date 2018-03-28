/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.imm.se.ecno.eclipse.emf.utils.WeakEList;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour States</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl#getStates <em>States</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl#getOrphans <em>Orphans</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl#getControllerConfig <em>Controller Config</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviourStatesImpl extends EObjectImpl implements BehaviourStates {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementBehaviourState> states;

	/**
	 * The cached value of the '{@link #getOrphans() <em>Orphans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphans()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> orphans;
	/**
	 * The cached value of the '{@link #getAdded() <em>Added</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdded()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> added;

	/**
	 * The cached value of the '{@link #getControllerConfig() <em>Controller Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerConfig()
	 * @generated
	 * @ordered
	 */
	protected ControllerConfigurator controllerConfig;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourStatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourstatesPackage.Literals.BEHAVIOUR_STATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementBehaviourState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<ElementBehaviourState>(ElementBehaviourState.class, this, BehaviourstatesPackage.BEHAVIOUR_STATES__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	public EList<EObject> getOrphans() {
		if (orphans == null) {
			// orphans = new EObjectContainmentEList<EObject>(EObject.class, this, BehaviourstatesPackage.BEHAVIOUR_STATES__ORPHANS);
			// ekki: made the references to the orphans a weak list
			orphans = new WeakEList<EObject>(this, BehaviourstatesPackage.eINSTANCE.getBehaviourStates_Orphans());
		}
		return orphans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * 	 * @author ekki@dtu.dk
	 */
	public EList<EObject> getAdded() {
		if (added == null) {
			// added = new EObjectResolvingEList<EObject>(EObject.class, this, BehaviourstatesPackage.BEHAVIOUR_STATES__ADDED);
			// ekki: made the references to the added elements a weak list
			added = new WeakEList<EObject>(this,  BehaviourstatesPackage.eINSTANCE.getBehaviourStates_Added());
		}
		return added;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerConfigurator getControllerConfig() {
		return controllerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllerConfig(ControllerConfigurator newControllerConfig, NotificationChain msgs) {
		ControllerConfigurator oldControllerConfig = controllerConfig;
		controllerConfig = newControllerConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG, oldControllerConfig, newControllerConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerConfig(ControllerConfigurator newControllerConfig) {
		if (newControllerConfig != controllerConfig) {
			NotificationChain msgs = null;
			if (controllerConfig != null)
				msgs = ((InternalEObject)controllerConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG, null, msgs);
			if (newControllerConfig != null)
				msgs = ((InternalEObject)newControllerConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG, null, msgs);
			msgs = basicSetControllerConfig(newControllerConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG, newControllerConfig, newControllerConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPackages() {
		if (packages == null) {
			packages = new EDataTypeUniqueEList<String>(String.class, this, BehaviourstatesPackage.BEHAVIOUR_STATES__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourstatesPackage.BEHAVIOUR_STATES__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ORPHANS:
				return ((InternalEList<?>)getOrphans()).basicRemove(otherEnd, msgs);
			case BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG:
				return basicSetControllerConfig(null, msgs);
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
			case BehaviourstatesPackage.BEHAVIOUR_STATES__STATES:
				return getStates();
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ORPHANS:
				return getOrphans();
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ADDED:
				return getAdded();
			case BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG:
				return getControllerConfig();
			case BehaviourstatesPackage.BEHAVIOUR_STATES__PACKAGES:
				return getPackages();
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
			case BehaviourstatesPackage.BEHAVIOUR_STATES__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends ElementBehaviourState>)newValue);
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ORPHANS:
				getOrphans().clear();
				getOrphans().addAll((Collection<? extends EObject>)newValue);
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ADDED:
				getAdded().clear();
				getAdded().addAll((Collection<? extends EObject>)newValue);
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG:
				setControllerConfig((ControllerConfigurator)newValue);
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends String>)newValue);
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
			case BehaviourstatesPackage.BEHAVIOUR_STATES__STATES:
				getStates().clear();
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ORPHANS:
				getOrphans().clear();
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ADDED:
				getAdded().clear();
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG:
				setControllerConfig((ControllerConfigurator)null);
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__PACKAGES:
				getPackages().clear();
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
			case BehaviourstatesPackage.BEHAVIOUR_STATES__STATES:
				return states != null && !states.isEmpty();
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ORPHANS:
				return orphans != null && !orphans.isEmpty();
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ADDED:
				return added != null && !added.isEmpty();
			case BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG:
				return controllerConfig != null;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__PACKAGES:
				return packages != null && !packages.isEmpty();
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
		result.append(" (packages: ");
		result.append(packages);
		result.append(')');
		return result.toString();
	}
	
	public void makeWeak() {
		if (this.orphans instanceof WeakEList) {
			((WeakEList<EObject>) this.orphans).makeWeak();
		}
		if (this.added instanceof WeakEList) {
			((WeakEList<EObject>) this.added).makeWeak();
		}
		
		for (ElementBehaviourState state: this.getStates()) {
			if (state instanceof ElementBehaviourStateImpl) {
				((ElementBehaviourStateImpl) state).makeWeak();
		}
			
		}
	}
	
	public void makeStrong() {
		if (this.orphans instanceof WeakEList) {
			((WeakEList<EObject>) this.orphans).makeStrong();
		}
		if (this.added instanceof WeakEList) {
			((WeakEList<EObject>) this.added).makeStrong();
		}
		
		for (ElementBehaviourState state: this.getStates()) {
			if (state instanceof ElementBehaviourStateImpl) {
				((ElementBehaviourStateImpl) state).makeStrong();
		}
			
		}
	}
	
	public void cleanPhantomElementsAndPhantomBehaviours() {
		Set<ElementBehaviourState> voidBehaviours = new HashSet<ElementBehaviourState>();
		for (ElementBehaviourState state: getStates()) {
			EObject element = state.getElement();
			if (element == null) {
				voidBehaviours.add(state);
			}
		}
	    getStates().removeAll(voidBehaviours);
	    
	    this.cleanPhantomElements();
	}
	
	public void cleanPhantomElements() {	    
	    if (added instanceof WeakEList) {
	    	((WeakEList<EObject>) added).cleanPhantoms();
	    }
	    if (orphans instanceof WeakEList) {
	    	((WeakEList<EObject>) orphans).cleanPhantoms();
	    }
	}

} //BehaviourStatesImpl
