/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.impl;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.Reference;

import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl#getEReference <em>EReference</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl#getSynchronisations <em>Synchronisations</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends EObjectImpl implements Reference {
	/**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference eReference;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ElementType target;

	/**
	 * The cached value of the '{@link #getSynchronisations() <em>Synchronisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Synchronisation> synchronisations;

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
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference() {
		if (eReference != null && eReference.eIsProxy()) {
			InternalEObject oldEReference = (InternalEObject)eReference;
			eReference = (EReference)eResolveProxy(oldEReference);
			if (eReference != oldEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.REFERENCE__EREFERENCE, oldEReference, eReference));
			}
		}
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetEReference() {
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReferenceGen(EReference newEReference) {
		EReference oldEReference = eReference;
		eReference = newEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.REFERENCE__EREFERENCE, oldEReference, eReference));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (make sure to notify about the change of the derived attributes: name and upperBound)
	 * @author eki
	 */
	public void setEReference(EReference newEReference) {
		if (eNotificationRequired()) {
			String oldName = getName();
			int oldUpperBound = getUpperBound();
			setEReferenceGen(newEReference);
			String newName = getName();
			int newUpperBound = getUpperBound();
			if ((newName != null && !newName.equals(oldName)) || (newName == null && oldName != null)) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.REFERENCE__NAME, oldName, newName));				
			}
			if (newUpperBound != oldUpperBound) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.REFERENCE__UPPER_BOUND, oldUpperBound, newUpperBound));				
			}
		} else {
			setEReferenceGen(newEReference);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ElementType)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.REFERENCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetGen(ElementType newTarget) {
		ElementType oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.REFERENCE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (make sure to notify about the change of the derived attribute name)
	 * @author ekki@dtu.dk
	 */
	public void setTarget(ElementType newTarget) {
		if (eNotificationRequired()) {
			String oldName = getName();
			setTargetGen(newTarget);
			String newName = getName();
			if ((newName != null && !newName.equals(oldName)) || (newName == null && oldName != null)) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.REFERENCE__NAME, oldName, newName));				
			}
		} else {
			setTargetGen(newTarget);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getSource() {
		if (eContainerFeatureID() != EcnoPackage.REFERENCE__SOURCE) return null;
		return (ElementType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ElementType newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, EcnoPackage.REFERENCE__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceGen(ElementType newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != EcnoPackage.REFERENCE__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EcnoPackage.ELEMENT_TYPE__REFERENCES, ElementType.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.REFERENCE__SOURCE, newSource, newSource));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (make sure to notify about the change of the derived attribute name)
	 * @author ekki@dtu.dk
	 */
	public void setSource(ElementType newSource) {
		if (eNotificationRequired()) {
			String oldName = getName();
			setSourceGen(newSource);
			String newName = getName();
			if ((newName != null && !newName.equals(oldName)) || (newName == null && oldName != null)) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.REFERENCE__NAME, oldName, newName));				
			}
		} else {
			setSourceGen(newSource);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronisation> getSynchronisations() {
		if (synchronisations == null) {
			synchronisations = new EObjectContainmentWithInverseEList<Synchronisation>(Synchronisation.class, this, EcnoPackage.REFERENCE__SYNCHRONISATIONS, EcnoPackage.SYNCHRONISATION__REFERENCE);
		}
		return synchronisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (implemented derived method)
	 * @author eki
	 */
	public String getName() {
		EReference eReference = this.getEReference();
		if (eReference != null) {
			String name = eReference.getName();
			ElementType target = this.getTarget();
			if (target != null && target.getEClass() != null && !target.getEClass().equals(eReference.getEReferenceType())) {
				name = "(" + name + ")";
			}
			return name;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (implemented derived method)
	 * @author eki
	 */
	public int getUpperBound() {
		EReference eReference = this.getEReference();
		if (eReference != null) {
			return eReference.getUpperBound();
		}
		return -2;
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
			case EcnoPackage.REFERENCE__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((ElementType)otherEnd, msgs);
			case EcnoPackage.REFERENCE__SYNCHRONISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronisations()).basicAdd(otherEnd, msgs);
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
			case EcnoPackage.REFERENCE__SOURCE:
				return basicSetSource(null, msgs);
			case EcnoPackage.REFERENCE__SYNCHRONISATIONS:
				return ((InternalEList<?>)getSynchronisations()).basicRemove(otherEnd, msgs);
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
			case EcnoPackage.REFERENCE__SOURCE:
				return eInternalContainer().eInverseRemove(this, EcnoPackage.ELEMENT_TYPE__REFERENCES, ElementType.class, msgs);
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
			case EcnoPackage.REFERENCE__EREFERENCE:
				if (resolve) return getEReference();
				return basicGetEReference();
			case EcnoPackage.REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case EcnoPackage.REFERENCE__SOURCE:
				return getSource();
			case EcnoPackage.REFERENCE__SYNCHRONISATIONS:
				return getSynchronisations();
			case EcnoPackage.REFERENCE__NAME:
				return getName();
			case EcnoPackage.REFERENCE__UPPER_BOUND:
				return getUpperBound();
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
			case EcnoPackage.REFERENCE__EREFERENCE:
				setEReference((EReference)newValue);
				return;
			case EcnoPackage.REFERENCE__TARGET:
				setTarget((ElementType)newValue);
				return;
			case EcnoPackage.REFERENCE__SOURCE:
				setSource((ElementType)newValue);
				return;
			case EcnoPackage.REFERENCE__SYNCHRONISATIONS:
				getSynchronisations().clear();
				getSynchronisations().addAll((Collection<? extends Synchronisation>)newValue);
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
			case EcnoPackage.REFERENCE__EREFERENCE:
				setEReference((EReference)null);
				return;
			case EcnoPackage.REFERENCE__TARGET:
				setTarget((ElementType)null);
				return;
			case EcnoPackage.REFERENCE__SOURCE:
				setSource((ElementType)null);
				return;
			case EcnoPackage.REFERENCE__SYNCHRONISATIONS:
				getSynchronisations().clear();
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
			case EcnoPackage.REFERENCE__EREFERENCE:
				return eReference != null;
			case EcnoPackage.REFERENCE__TARGET:
				return target != null;
			case EcnoPackage.REFERENCE__SOURCE:
				return getSource() != null;
			case EcnoPackage.REFERENCE__SYNCHRONISATIONS:
				return synchronisations != null && !synchronisations.isEmpty();
			case EcnoPackage.REFERENCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EcnoPackage.REFERENCE__UPPER_BOUND:
				return getUpperBound() != UPPER_BOUND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	// @generated NOT
	@Override
	public IElementType getSourceElementType() {
		return getSource();
	}

	// @generated NOT
	@Override
	public IElementType getTargetElementType() {
		if (resolvedTarget != null) {
			return resolvedTarget;
		} else {
			return getTarget();
		}
	}
	
	// @generated NOT 
	IElementType resolvedTarget = null;

} //ReferenceImpl
