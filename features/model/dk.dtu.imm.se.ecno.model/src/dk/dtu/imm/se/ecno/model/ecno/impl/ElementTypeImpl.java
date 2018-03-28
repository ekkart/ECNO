/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.ImportedType;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#isImported <em>Imported</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getCoordinationSets <em>Coordination Sets</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#isGui <em>Gui</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl#getParallelTriggerEvents <em>Parallel Trigger Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTypeImpl extends EObjectImpl implements ElementType {
	/**
	 * The default value of the '{@link #getPackageURI() <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageURI() <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageURI()
	 * @generated
	 * @ordered
	 */
	protected String packageURI = PACKAGE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isImported() <em>Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected ImportedType import_;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getCoordinationSets() <em>Coordination Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationSets()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationSet> coordinationSets;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

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
	 * The default value of the '{@link #isGui() <em>Gui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGui()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GUI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGui() <em>Gui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGui()
	 * @generated
	 * @ordered
	 */
	protected boolean gui = GUI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected ElementType super_;

	/**
	 * The cached value of the '{@link #getParallelTriggerEvents() <em>Parallel Trigger Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelTriggerEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventType> parallelTriggerEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageURI() {
		return packageURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageURIGen(String newPackageURI) {
		String oldPackageURI = packageURI;
		packageURI = newPackageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__PACKAGE_URI, oldPackageURI, packageURI));
	}
	
	/**
	 * @generated NOT
	 */
	public void setPackageURI(String newPackageURI) {
		if (eNotificationRequired()) {
			boolean oldIsImported = isImported();
			setPackageURIGen(newPackageURI);
			if (oldIsImported != isImported()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.IMPORTED_TYPE__IMPORTED, oldIsImported, isImported()));
			}
		} else {
			setPackageURIGen(newPackageURI);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNameGen(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__TYPE_NAME, oldTypeName, typeName));
	}
	
	/*
	 * @generated NOT
	 */
	public void setTypeName(String newTypeName) {
		if (eNotificationRequired()) {
			String oldName = getName();
			setTypeNameGen(newTypeName);
			String newName = getName();
			if ((oldName != null && !oldName.equals(newName)) || (newName != null && !newName.equals(oldName))) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__NAME, oldName, newName));
			}
		} else {
			setTypeNameGen(newTypeName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isImported() {
		return (getImport() != null) || (this.getPackageURI() != null && !this.getPackageURI().isEmpty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedType getImport() {
		if (import_ != null && import_.eIsProxy()) {
			InternalEObject oldImport = (InternalEObject)import_;
			import_ = (ImportedType)eResolveProxy(oldImport);
			if (import_ != oldImport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.ELEMENT_TYPE__IMPORT, oldImport, import_));
			}
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedType basicGetImport() {
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportGen(ImportedType newImport) {
		ImportedType oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__IMPORT, oldImport, import_));
	}
	
	/**
	 * @generated NOT
	 */
	public void setImport(ImportedType newImport) {
		if (newImport != null && newImport.eClass() != this.eClass()) {
			throw new IllegalArgumentException("The imported element needs to be of the same kind as this element");
		}
		
		if (eNotificationRequired()) {
			boolean oldIsImported = isImported();
			setImportGen(newImport);
			if (oldIsImported != isImported()) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.IMPORTED_TYPE__IMPORTED, oldIsImported, isImported()));
			}
		} else {
			setImportGen(newImport);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.ELEMENT_TYPE__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClassGen(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__ECLASS, oldEClass, eClass));
	}
	
	/**
	 * @generated NOT (make sure to notify about the change of the derived attribute: name)
	 * @author eki
	 */
	public void setEClass(EClass newEClass) {
		if (eNotificationRequired()) {
			String oldName = getName();

			setEClassGen(newEClass);

			String newName = getName();
			if ((newName != null && !newName.equals(oldName)) || (newName == null && oldName != null)) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__NAME, oldName, newName));
			}
		} else {
			setEClassGen(newEClass);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinationSet> getCoordinationSets() {
		if (coordinationSets == null) {
			coordinationSets = new EObjectContainmentEList<CoordinationSet>(CoordinationSet.class, this, EcnoPackage.ELEMENT_TYPE__COORDINATION_SETS);
		}
		return coordinationSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentWithInverseEList.Unsettable<Reference>(Reference.class, this, EcnoPackage.ELEMENT_TYPE__REFERENCES, EcnoPackage.REFERENCE__SOURCE);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferences() {
		if (references != null) ((InternalEList.Unsettable<?>)references).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferences() {
		return references != null && ((InternalEList.Unsettable<?>)references).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author eki
	 */
	public String getName() {
		EClass eClass = this.getEClass();
		if (eClass != null) {
			return eClass.getName();
		}
		return this.getTypeName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGui() {
		return gui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGui(boolean newGui) {
		boolean oldGui = gui;
		gui = newGui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__GUI, oldGui, gui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (ElementType)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.ELEMENT_TYPE__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(ElementType newSuper) {
		ElementType oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.ELEMENT_TYPE__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventType> getParallelTriggerEvents() {
		if (parallelTriggerEvents == null) {
			parallelTriggerEvents = new EObjectResolvingEList<EventType>(EventType.class, this, EcnoPackage.ELEMENT_TYPE__PARALLEL_TRIGGER_EVENTS);
		}
		return parallelTriggerEvents;
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
			case EcnoPackage.ELEMENT_TYPE__REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
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
			case EcnoPackage.ELEMENT_TYPE__COORDINATION_SETS:
				return ((InternalEList<?>)getCoordinationSets()).basicRemove(otherEnd, msgs);
			case EcnoPackage.ELEMENT_TYPE__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case EcnoPackage.ELEMENT_TYPE__PACKAGE_URI:
				return getPackageURI();
			case EcnoPackage.ELEMENT_TYPE__TYPE_NAME:
				return getTypeName();
			case EcnoPackage.ELEMENT_TYPE__IMPORTED:
				return isImported();
			case EcnoPackage.ELEMENT_TYPE__IMPORT:
				if (resolve) return getImport();
				return basicGetImport();
			case EcnoPackage.ELEMENT_TYPE__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case EcnoPackage.ELEMENT_TYPE__COORDINATION_SETS:
				return getCoordinationSets();
			case EcnoPackage.ELEMENT_TYPE__REFERENCES:
				return getReferences();
			case EcnoPackage.ELEMENT_TYPE__NAME:
				return getName();
			case EcnoPackage.ELEMENT_TYPE__GUI:
				return isGui();
			case EcnoPackage.ELEMENT_TYPE__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case EcnoPackage.ELEMENT_TYPE__PARALLEL_TRIGGER_EVENTS:
				return getParallelTriggerEvents();
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
			case EcnoPackage.ELEMENT_TYPE__PACKAGE_URI:
				setPackageURI((String)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__IMPORT:
				setImport((ImportedType)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__ECLASS:
				setEClass((EClass)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__COORDINATION_SETS:
				getCoordinationSets().clear();
				getCoordinationSets().addAll((Collection<? extends CoordinationSet>)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__GUI:
				setGui((Boolean)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__SUPER:
				setSuper((ElementType)newValue);
				return;
			case EcnoPackage.ELEMENT_TYPE__PARALLEL_TRIGGER_EVENTS:
				getParallelTriggerEvents().clear();
				getParallelTriggerEvents().addAll((Collection<? extends EventType>)newValue);
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
			case EcnoPackage.ELEMENT_TYPE__PACKAGE_URI:
				setPackageURI(PACKAGE_URI_EDEFAULT);
				return;
			case EcnoPackage.ELEMENT_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case EcnoPackage.ELEMENT_TYPE__IMPORT:
				setImport((ImportedType)null);
				return;
			case EcnoPackage.ELEMENT_TYPE__ECLASS:
				setEClass((EClass)null);
				return;
			case EcnoPackage.ELEMENT_TYPE__COORDINATION_SETS:
				getCoordinationSets().clear();
				return;
			case EcnoPackage.ELEMENT_TYPE__REFERENCES:
				unsetReferences();
				return;
			case EcnoPackage.ELEMENT_TYPE__GUI:
				setGui(GUI_EDEFAULT);
				return;
			case EcnoPackage.ELEMENT_TYPE__SUPER:
				setSuper((ElementType)null);
				return;
			case EcnoPackage.ELEMENT_TYPE__PARALLEL_TRIGGER_EVENTS:
				getParallelTriggerEvents().clear();
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
			case EcnoPackage.ELEMENT_TYPE__PACKAGE_URI:
				return PACKAGE_URI_EDEFAULT == null ? packageURI != null : !PACKAGE_URI_EDEFAULT.equals(packageURI);
			case EcnoPackage.ELEMENT_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case EcnoPackage.ELEMENT_TYPE__IMPORTED:
				return isImported() != IMPORTED_EDEFAULT;
			case EcnoPackage.ELEMENT_TYPE__IMPORT:
				return import_ != null;
			case EcnoPackage.ELEMENT_TYPE__ECLASS:
				return eClass != null;
			case EcnoPackage.ELEMENT_TYPE__COORDINATION_SETS:
				return coordinationSets != null && !coordinationSets.isEmpty();
			case EcnoPackage.ELEMENT_TYPE__REFERENCES:
				return isSetReferences();
			case EcnoPackage.ELEMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EcnoPackage.ELEMENT_TYPE__GUI:
				return gui != GUI_EDEFAULT;
			case EcnoPackage.ELEMENT_TYPE__SUPER:
				return super_ != null;
			case EcnoPackage.ELEMENT_TYPE__PARALLEL_TRIGGER_EVENTS:
				return parallelTriggerEvents != null && !parallelTriggerEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ImportedType.class) {
			switch (derivedFeatureID) {
				case EcnoPackage.ELEMENT_TYPE__PACKAGE_URI: return EcnoPackage.IMPORTED_TYPE__PACKAGE_URI;
				case EcnoPackage.ELEMENT_TYPE__TYPE_NAME: return EcnoPackage.IMPORTED_TYPE__TYPE_NAME;
				case EcnoPackage.ELEMENT_TYPE__IMPORTED: return EcnoPackage.IMPORTED_TYPE__IMPORTED;
				case EcnoPackage.ELEMENT_TYPE__IMPORT: return EcnoPackage.IMPORTED_TYPE__IMPORT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ImportedType.class) {
			switch (baseFeatureID) {
				case EcnoPackage.IMPORTED_TYPE__PACKAGE_URI: return EcnoPackage.ELEMENT_TYPE__PACKAGE_URI;
				case EcnoPackage.IMPORTED_TYPE__TYPE_NAME: return EcnoPackage.ELEMENT_TYPE__TYPE_NAME;
				case EcnoPackage.IMPORTED_TYPE__IMPORTED: return EcnoPackage.ELEMENT_TYPE__IMPORTED;
				case EcnoPackage.IMPORTED_TYPE__IMPORT: return EcnoPackage.ELEMENT_TYPE__IMPORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (packageURI: ");
		result.append(packageURI);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", gui: ");
		result.append(gui);
		result.append(')');
		return result.toString();
	}

	@Override
	// @generated NOT
	// @author eki
	public ISynchronisation[][] getCoordinationSets(IEventType eventType) {
		List<ISynchronisation[]> list = new ArrayList<ISynchronisation[]>();
		
		for (CoordinationSet set: this.getCoordinationSets()) {
			if (set.getTriggerEventType().equals(eventType)) {
				list.add((ISynchronisation[])set.getSynchronisations().toArray());
			}
		}
		return list.toArray(new ISynchronisation[0][]);
	}

	
	private List<IEventType> guiEventTypes = null;
	
	@Override
	// @generated NOT
	// @author eki
	public List<IEventType> getGUIEventTypes() {
		if (guiEventTypes == null && this.isGui()) {
			ArrayList<IEventType> result = new  ArrayList<IEventType>();
			
			// TODO quick fix to collect event types among all relevant packages
			//      this can be done much more efficiently and combined with
			//      the calculations below.
		    //    
			Set<IEventType> eventTypes = new HashSet<IEventType>();
			Set<IElementType> touched = new HashSet<IElementType>();
			
			IElementType current = this;
			while (current != null && !touched.contains(current)) {
				// in order to avoid infinite cycles
				touched.add(current);
				for (ICoordinationSet coordSet: current.getCoordinationSetsList()) {
					IEventType trigger = coordSet.getTriggerEventType();
					if (trigger instanceof EventType) {
						if (((EventType) trigger).isGui()) {
							eventTypes.add(trigger);
						}
					}
				}
			}
			
			/*
			List<INamedElement> namedElements = this.getNamespace().getElements();
			List<EventType> packageEventTypes = new ArrayList<EventType>();
			for (INamedElement namedElement: namedElements) {
				if (namedElement instanceof EventType) {
					EventType eventType = (EventType) namedElement;
					if (eventType.isGui()) {
						packageEventTypes.add((EventType) namedElement);
					}
				}
			}
			*/

			ElementType iterate = this;
			Set<ElementType> metElements = new HashSet<ElementType>();
			while (iterate != null && !metElements.contains(iterate)) {
				metElements.add(iterate);
				for (CoordinationSet set: iterate.getCoordinationSets()) {
					IEventType eventType = set.getTriggerEventType();
					if (eventType instanceof EventType && ((EventType) eventType).isGui() && !result.contains(eventType)) {
						result.add(eventType);
					}
					
					// also include package eventTypes which are GUI events and that are 
					// derived from the eventType
					// for (EventType eventType2: packageEventTypes) {
					for (IEventType eventType2: eventTypes) {
						if (eventType2.getSuperTypes().contains(eventType) && !result.contains(eventType2)) {
							result.add(eventType2);
						}
					}
				}
				iterate = iterate.getSuper();
			}
			guiEventTypes = Collections.unmodifiableList(result);
		}
		return guiEventTypes;
	}

	// @generated NOT 
	@Override
	public List<ICoordinationSet> getCoordinationSetsList() {
		List<CoordinationSet> result = getCoordinationSets();
		return new ArrayList<ICoordinationSet>(result);
	}

	// @generated NOT 
	@Override
	public Package getNamespace() {
		EObject container = this.eContainer();
		if (container instanceof Package) {
			return (Package) container;
		}
		return null;
	}

	// @generated NOT
	@Override
	public IElementType getSuperElementType() {
		if (this.resolvedSuperElementType != null) {
			// if there is a resolved super type, return this
			return this.resolvedSuperElementType;
		} else {
			return getSuper();
		}
	}

	/**
	 * The set of all (true) super types. Note that this set is calculated, when the
	 * isDerivedFrom is called for the first time. It is assumed that, after this
	 * first call of isDerivedFrom, the super types do not change anymore!

	 * @generated NOT
	 */
	private Set<IElementType> superTypes;
	
	// @generated NOT
	@Override
	public boolean isDerivedFrom(IElementType elementType) {
		if (this.equals(elementType)) {
			return true;
		}
		if (superTypes == null) {
			// calculate super types (but only once)
			superTypes = new HashSet<IElementType>();
			IElementType superIterator = this.getSuperElementType();
			while (superIterator != null) {
				if (superTypes.contains(superIterator)) {
					// avoid non-termination if there are cycles in
					// super structure; but this should better not
					// happen (model would be invalid).
					break;
				}
				superTypes.add(superIterator);
				superIterator = superIterator.getSuperElementType();
			}
		}
		return superTypes.contains(elementType);
	}

	// @generated NOT
	@Override
	public boolean isParallelTriggerEvent(IEventType eventType) {
		// TODO eki: we assume that the parallelTriggerEvents are top-level EventTypes
		//           but this is not checked yet in the model
		return this.getParallelTriggerEvents().contains(eventType.getTopSuper());
	}
	
	// @generated NOT 
	boolean resolved = false;
	// @generated NOT 
	IElementType resolvedTo = null;
	
	// @generated NOT 
	IElementType resolvedSuperElementType = null;

} //ElementTypeImpl
