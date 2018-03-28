/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workflow.Arc;
import workflow.Place;
import workflow.Transition;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.ArcImpl#getSourcePlace <em>Source Place</em>}</li>
 *   <li>{@link workflow.impl.ArcImpl#getTargetPlace <em>Target Place</em>}</li>
 *   <li>{@link workflow.impl.ArcImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.ArcImpl#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link workflow.impl.ArcImpl#getTargetTransition <em>Target Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends EObjectImpl implements Arc {
	/**
	 * The cached value of the '{@link #getSourcePlace() <em>Source Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePlace()
	 * @generated
	 * @ordered
	 */
	protected Place sourcePlace;

	/**
	 * The cached value of the '{@link #getTargetPlace() <em>Target Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlace()
	 * @generated
	 * @ordered
	 */
	protected Place targetPlace;

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
	 * The cached value of the '{@link #getSourceTransition() <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition sourceTransition;

	/**
	 * The cached value of the '{@link #getTargetTransition() <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition targetTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getSourcePlace() {
		if (sourcePlace != null && sourcePlace.eIsProxy()) {
			InternalEObject oldSourcePlace = (InternalEObject)sourcePlace;
			sourcePlace = (Place)eResolveProxy(oldSourcePlace);
			if (sourcePlace != oldSourcePlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ARC__SOURCE_PLACE, oldSourcePlace, sourcePlace));
			}
		}
		return sourcePlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetSourcePlace() {
		return sourcePlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcePlace(Place newSourcePlace, NotificationChain msgs) {
		Place oldSourcePlace = sourcePlace;
		sourcePlace = newSourcePlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__SOURCE_PLACE, oldSourcePlace, newSourcePlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePlace(Place newSourcePlace) {
		if (newSourcePlace != sourcePlace) {
			NotificationChain msgs = null;
			if (sourcePlace != null)
				msgs = ((InternalEObject)sourcePlace).eInverseRemove(this, WorkflowPackage.PLACE__OUT, Place.class, msgs);
			if (newSourcePlace != null)
				msgs = ((InternalEObject)newSourcePlace).eInverseAdd(this, WorkflowPackage.PLACE__OUT, Place.class, msgs);
			msgs = basicSetSourcePlace(newSourcePlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__SOURCE_PLACE, newSourcePlace, newSourcePlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getTargetPlace() {
		if (targetPlace != null && targetPlace.eIsProxy()) {
			InternalEObject oldTargetPlace = (InternalEObject)targetPlace;
			targetPlace = (Place)eResolveProxy(oldTargetPlace);
			if (targetPlace != oldTargetPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ARC__TARGET_PLACE, oldTargetPlace, targetPlace));
			}
		}
		return targetPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetTargetPlace() {
		return targetPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPlace(Place newTargetPlace, NotificationChain msgs) {
		Place oldTargetPlace = targetPlace;
		targetPlace = newTargetPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__TARGET_PLACE, oldTargetPlace, newTargetPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPlace(Place newTargetPlace) {
		if (newTargetPlace != targetPlace) {
			NotificationChain msgs = null;
			if (targetPlace != null)
				msgs = ((InternalEObject)targetPlace).eInverseRemove(this, WorkflowPackage.PLACE__IN, Place.class, msgs);
			if (newTargetPlace != null)
				msgs = ((InternalEObject)newTargetPlace).eInverseAdd(this, WorkflowPackage.PLACE__IN, Place.class, msgs);
			msgs = basicSetTargetPlace(newTargetPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__TARGET_PLACE, newTargetPlace, newTargetPlace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSourceTransition() {
		if (sourceTransition != null && sourceTransition.eIsProxy()) {
			InternalEObject oldSourceTransition = (InternalEObject)sourceTransition;
			sourceTransition = (Transition)eResolveProxy(oldSourceTransition);
			if (sourceTransition != oldSourceTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ARC__SOURCE_TRANSITION, oldSourceTransition, sourceTransition));
			}
		}
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSourceTransition() {
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceTransition(Transition newSourceTransition, NotificationChain msgs) {
		Transition oldSourceTransition = sourceTransition;
		sourceTransition = newSourceTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__SOURCE_TRANSITION, oldSourceTransition, newSourceTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTransition(Transition newSourceTransition) {
		if (newSourceTransition != sourceTransition) {
			NotificationChain msgs = null;
			if (sourceTransition != null)
				msgs = ((InternalEObject)sourceTransition).eInverseRemove(this, WorkflowPackage.TRANSITION__OUT, Transition.class, msgs);
			if (newSourceTransition != null)
				msgs = ((InternalEObject)newSourceTransition).eInverseAdd(this, WorkflowPackage.TRANSITION__OUT, Transition.class, msgs);
			msgs = basicSetSourceTransition(newSourceTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__SOURCE_TRANSITION, newSourceTransition, newSourceTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTargetTransition() {
		if (targetTransition != null && targetTransition.eIsProxy()) {
			InternalEObject oldTargetTransition = (InternalEObject)targetTransition;
			targetTransition = (Transition)eResolveProxy(oldTargetTransition);
			if (targetTransition != oldTargetTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ARC__TARGET_TRANSITION, oldTargetTransition, targetTransition));
			}
		}
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTargetTransition() {
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetTransition(Transition newTargetTransition, NotificationChain msgs) {
		Transition oldTargetTransition = targetTransition;
		targetTransition = newTargetTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__TARGET_TRANSITION, oldTargetTransition, newTargetTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTransition(Transition newTargetTransition) {
		if (newTargetTransition != targetTransition) {
			NotificationChain msgs = null;
			if (targetTransition != null)
				msgs = ((InternalEObject)targetTransition).eInverseRemove(this, WorkflowPackage.TRANSITION__IN, Transition.class, msgs);
			if (newTargetTransition != null)
				msgs = ((InternalEObject)newTargetTransition).eInverseAdd(this, WorkflowPackage.TRANSITION__IN, Transition.class, msgs);
			msgs = basicSetTargetTransition(newTargetTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ARC__TARGET_TRANSITION, newTargetTransition, newTargetTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.ARC__SOURCE_PLACE:
				if (sourcePlace != null)
					msgs = ((InternalEObject)sourcePlace).eInverseRemove(this, WorkflowPackage.PLACE__OUT, Place.class, msgs);
				return basicSetSourcePlace((Place)otherEnd, msgs);
			case WorkflowPackage.ARC__TARGET_PLACE:
				if (targetPlace != null)
					msgs = ((InternalEObject)targetPlace).eInverseRemove(this, WorkflowPackage.PLACE__IN, Place.class, msgs);
				return basicSetTargetPlace((Place)otherEnd, msgs);
			case WorkflowPackage.ARC__SOURCE_TRANSITION:
				if (sourceTransition != null)
					msgs = ((InternalEObject)sourceTransition).eInverseRemove(this, WorkflowPackage.TRANSITION__OUT, Transition.class, msgs);
				return basicSetSourceTransition((Transition)otherEnd, msgs);
			case WorkflowPackage.ARC__TARGET_TRANSITION:
				if (targetTransition != null)
					msgs = ((InternalEObject)targetTransition).eInverseRemove(this, WorkflowPackage.TRANSITION__IN, Transition.class, msgs);
				return basicSetTargetTransition((Transition)otherEnd, msgs);
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
			case WorkflowPackage.ARC__SOURCE_PLACE:
				return basicSetSourcePlace(null, msgs);
			case WorkflowPackage.ARC__TARGET_PLACE:
				return basicSetTargetPlace(null, msgs);
			case WorkflowPackage.ARC__SOURCE_TRANSITION:
				return basicSetSourceTransition(null, msgs);
			case WorkflowPackage.ARC__TARGET_TRANSITION:
				return basicSetTargetTransition(null, msgs);
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
			case WorkflowPackage.ARC__SOURCE_PLACE:
				if (resolve) return getSourcePlace();
				return basicGetSourcePlace();
			case WorkflowPackage.ARC__TARGET_PLACE:
				if (resolve) return getTargetPlace();
				return basicGetTargetPlace();
			case WorkflowPackage.ARC__NAME:
				return getName();
			case WorkflowPackage.ARC__SOURCE_TRANSITION:
				if (resolve) return getSourceTransition();
				return basicGetSourceTransition();
			case WorkflowPackage.ARC__TARGET_TRANSITION:
				if (resolve) return getTargetTransition();
				return basicGetTargetTransition();
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
			case WorkflowPackage.ARC__SOURCE_PLACE:
				setSourcePlace((Place)newValue);
				return;
			case WorkflowPackage.ARC__TARGET_PLACE:
				setTargetPlace((Place)newValue);
				return;
			case WorkflowPackage.ARC__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.ARC__SOURCE_TRANSITION:
				setSourceTransition((Transition)newValue);
				return;
			case WorkflowPackage.ARC__TARGET_TRANSITION:
				setTargetTransition((Transition)newValue);
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
			case WorkflowPackage.ARC__SOURCE_PLACE:
				setSourcePlace((Place)null);
				return;
			case WorkflowPackage.ARC__TARGET_PLACE:
				setTargetPlace((Place)null);
				return;
			case WorkflowPackage.ARC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.ARC__SOURCE_TRANSITION:
				setSourceTransition((Transition)null);
				return;
			case WorkflowPackage.ARC__TARGET_TRANSITION:
				setTargetTransition((Transition)null);
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
			case WorkflowPackage.ARC__SOURCE_PLACE:
				return sourcePlace != null;
			case WorkflowPackage.ARC__TARGET_PLACE:
				return targetPlace != null;
			case WorkflowPackage.ARC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.ARC__SOURCE_TRANSITION:
				return sourceTransition != null;
			case WorkflowPackage.ARC__TARGET_TRANSITION:
				return targetTransition != null;
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
		result.append(')');
		return result.toString();
	}

} //ArcImpl
