/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import dk.dtu.imm.se.ecno.model.ecno.SynchronisationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl#getType <em>Type</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl#getCoordinationSet <em>Coordination Set</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl#getEventName <em>Event Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronisationImpl extends EObjectImpl implements Synchronisation {
	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventType eventType;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronisationType TYPE_EDEFAULT = SynchronisationType.ONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SynchronisationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinationSet() <em>Coordination Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationSet()
	 * @generated
	 * @ordered
	 */
	protected CoordinationSet coordinationSet;

	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.SYNCHRONISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getEventType() {
		if (eventType != null && eventType.eIsProxy()) {
			InternalEObject oldEventType = (InternalEObject)eventType;
			eventType = (EventType)eResolveProxy(oldEventType);
			if (eventType != oldEventType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.SYNCHRONISATION__EVENT_TYPE, oldEventType, eventType));
			}
		}
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType basicGetEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTypeGen(EventType newEventType) {
		EventType oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.SYNCHRONISATION__EVENT_TYPE, oldEventType, eventType));
	}
	
	/**
	 * @generated NOT (Implemented notification of change of derived attribute: eventName)
	 * @author eki
	 */
	public void setEventType(EventType newEventType) {
		if (eNotificationRequired()) {
			String oldEventName = getEventName();
			setEventTypeGen(newEventType);
			String newEventName = getEventName();
			if (newEventName != oldEventName) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.SYNCHRONISATION__EVENT_NAME, oldEventName, newEventName));
			}
		} else {
			setEventTypeGen(newEventType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronisationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SynchronisationType newType) {
		SynchronisationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.SYNCHRONISATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		if (eContainerFeatureID() != EcnoPackage.SYNCHRONISATION__REFERENCE) return null;
		return (Reference)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReference, EcnoPackage.SYNCHRONISATION__REFERENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		if (newReference != eInternalContainer() || (eContainerFeatureID() != EcnoPackage.SYNCHRONISATION__REFERENCE && newReference != null)) {
			if (EcoreUtil.isAncestor(this, newReference))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EcnoPackage.REFERENCE__SYNCHRONISATIONS, Reference.class, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.SYNCHRONISATION__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSet getCoordinationSet() {
		if (coordinationSet != null && coordinationSet.eIsProxy()) {
			InternalEObject oldCoordinationSet = (InternalEObject)coordinationSet;
			coordinationSet = (CoordinationSet)eResolveProxy(oldCoordinationSet);
			if (coordinationSet != oldCoordinationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.SYNCHRONISATION__COORDINATION_SET, oldCoordinationSet, coordinationSet));
			}
		}
		return coordinationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSet basicGetCoordinationSet() {
		return coordinationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationSet(CoordinationSet newCoordinationSet, NotificationChain msgs) {
		CoordinationSet oldCoordinationSet = coordinationSet;
		coordinationSet = newCoordinationSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcnoPackage.SYNCHRONISATION__COORDINATION_SET, oldCoordinationSet, newCoordinationSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationSet(CoordinationSet newCoordinationSet) {
		if (newCoordinationSet != coordinationSet) {
			NotificationChain msgs = null;
			if (coordinationSet != null)
				msgs = ((InternalEObject)coordinationSet).eInverseRemove(this, EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS, CoordinationSet.class, msgs);
			if (newCoordinationSet != null)
				msgs = ((InternalEObject)newCoordinationSet).eInverseAdd(this, EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS, CoordinationSet.class, msgs);
			msgs = basicSetCoordinationSet(newCoordinationSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.SYNCHRONISATION__COORDINATION_SET, newCoordinationSet, newCoordinationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (implemented derived attribute: name)
	 * @author eki
	 */
	public String getEventName() {
		EventType eventType = this.getEventType();
		if (eventType != null) {
			return eventType.getName();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnoPackage.SYNCHRONISATION__REFERENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReference((Reference)otherEnd, msgs);
			case EcnoPackage.SYNCHRONISATION__COORDINATION_SET:
				if (coordinationSet != null)
					msgs = ((InternalEObject)coordinationSet).eInverseRemove(this, EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS, CoordinationSet.class, msgs);
				return basicSetCoordinationSet((CoordinationSet)otherEnd, msgs);
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
			case EcnoPackage.SYNCHRONISATION__REFERENCE:
				return basicSetReference(null, msgs);
			case EcnoPackage.SYNCHRONISATION__COORDINATION_SET:
				return basicSetCoordinationSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcnoPackage.SYNCHRONISATION__REFERENCE:
				return eInternalContainer().eInverseRemove(this, EcnoPackage.REFERENCE__SYNCHRONISATIONS, Reference.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcnoPackage.SYNCHRONISATION__EVENT_TYPE:
				if (resolve) return getEventType();
				return basicGetEventType();
			case EcnoPackage.SYNCHRONISATION__TYPE:
				return getType();
			case EcnoPackage.SYNCHRONISATION__REFERENCE:
				return getReference();
			case EcnoPackage.SYNCHRONISATION__COORDINATION_SET:
				if (resolve) return getCoordinationSet();
				return basicGetCoordinationSet();
			case EcnoPackage.SYNCHRONISATION__EVENT_NAME:
				return getEventName();
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
			case EcnoPackage.SYNCHRONISATION__EVENT_TYPE:
				setEventType((EventType)newValue);
				return;
			case EcnoPackage.SYNCHRONISATION__TYPE:
				setType((SynchronisationType)newValue);
				return;
			case EcnoPackage.SYNCHRONISATION__REFERENCE:
				setReference((Reference)newValue);
				return;
			case EcnoPackage.SYNCHRONISATION__COORDINATION_SET:
				setCoordinationSet((CoordinationSet)newValue);
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
			case EcnoPackage.SYNCHRONISATION__EVENT_TYPE:
				setEventType((EventType)null);
				return;
			case EcnoPackage.SYNCHRONISATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EcnoPackage.SYNCHRONISATION__REFERENCE:
				setReference((Reference)null);
				return;
			case EcnoPackage.SYNCHRONISATION__COORDINATION_SET:
				setCoordinationSet((CoordinationSet)null);
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
			case EcnoPackage.SYNCHRONISATION__EVENT_TYPE:
				return eventType != null;
			case EcnoPackage.SYNCHRONISATION__TYPE:
				return type != TYPE_EDEFAULT;
			case EcnoPackage.SYNCHRONISATION__REFERENCE:
				return getReference() != null;
			case EcnoPackage.SYNCHRONISATION__COORDINATION_SET:
				return coordinationSet != null;
			case EcnoPackage.SYNCHRONISATION__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? getEventName() != null : !EVENT_NAME_EDEFAULT.equals(getEventName());
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
	// @generated NOT
	// @author eki
	public dk.dtu.imm.se.ecno.core.SynchronisationType getSyncType() {
		SynchronisationType type = this.getType();
		if (type == null || type.ordinal() == 0) {
			return dk.dtu.imm.se.ecno.core.SynchronisationType.ONE;
		} else  {
			return dk.dtu.imm.se.ecno.core.SynchronisationType.ALL;
		}
	}

	// @generated NOT
	IEventType resolvedEventType = null;
	
	// @generated NOT
	@Override
	public IEventType getEvent() {
		if (resolvedEventType != null) {
			return resolvedEventType;
		} else {
			return this.getEventType();
		}
	}

} //SynchronisationImpl
