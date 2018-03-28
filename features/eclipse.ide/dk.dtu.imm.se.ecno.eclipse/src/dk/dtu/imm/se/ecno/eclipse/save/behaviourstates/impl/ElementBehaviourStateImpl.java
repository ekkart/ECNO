/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import dk.dtu.imm.se.ecno.eclipse.emf.utils.SwitchableWeakReference;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Behaviour State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ElementBehaviourStateImpl#getState <em>State</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ElementBehaviourStateImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementBehaviourStateImpl extends EObjectImpl implements ElementBehaviourState {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected BehaviourState state;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * Note that this reference is a weak reference!
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated NOT
	 * @ordered
	 * @author ekki@dtu.dk 
	 */
	protected SwitchableWeakReference<EObject> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementBehaviourStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourstatesPackage.Literals.ELEMENT_BEHAVIOUR_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(BehaviourState newState, NotificationChain msgs) {
		BehaviourState oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(BehaviourState newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getElement() {
		EObject element = basicGetElement();
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject basicGetElement() {
		if (element != null) {
			return element.get();
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = basicGetElement();
		if (newElement != null && newElement.eIsProxy()) {
			newElement = eResolveProxy((InternalEObject) newElement);
		}
		element = new SwitchableWeakReference<EObject>(newElement);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__ELEMENT, oldElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE:
				return basicSetState(null, msgs);
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
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE:
				return getState();
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE:
				setState((BehaviourState)newValue);
				return;
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__ELEMENT:
				setElement((EObject)newValue);
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
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE:
				setState((BehaviourState)null);
				return;
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__ELEMENT:
				setElement((EObject)null);
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
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__STATE:
				return state != null;
			case BehaviourstatesPackage.ELEMENT_BEHAVIOUR_STATE__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}
	
	public void makeWeak() {
		if (element != null) {
			element.makeWeak();
		}
	}
	
	public void makeStrong() {
		if (element != null) {
			element.makeStrong();
		}
	}

} //ElementBehaviourStateImpl
