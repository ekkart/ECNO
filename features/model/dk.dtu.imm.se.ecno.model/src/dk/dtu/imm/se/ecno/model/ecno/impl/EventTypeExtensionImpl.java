/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.ImportedType;
import dk.dtu.imm.se.ecno.model.ecno.Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Type Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#isImported <em>Imported</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventTypeExtensionImpl extends EObjectImpl implements EventTypeExtension {
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
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected EventType base;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameter> parameters;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EventTypeExtension> super_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTypeExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.EVENT_TYPE_EXTENSION;
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
	public void setPackageURI(String newPackageURI) {
		String oldPackageURI = packageURI;
		packageURI = newPackageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE_EXTENSION__PACKAGE_URI, oldPackageURI, packageURI));
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
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE_EXTENSION__TYPE_NAME, oldTypeName, typeName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT, oldImport, import_));
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
	public void setImport(ImportedType newImport) {
		ImportedType oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT, oldImport, import_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (EventType)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.EVENT_TYPE_EXTENSION__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(EventType newBase) {
		EventType oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE_EXTENSION__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE_EXTENSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<FormalParameter>(FormalParameter.class, this, EcnoPackage.EVENT_TYPE_EXTENSION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EventTypeExtension> getSuper() {
		if (super_ == null) {
			super_ = new EcoreEMap<String,EventTypeExtension>(EcnoPackage.Literals.STRING2_EVENT_TYPE_EXTENSION_MAP, String2EventTypeExtensionMapImpl.class, this, EcnoPackage.EVENT_TYPE_EXTENSION__SUPER);
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnoPackage.EVENT_TYPE_EXTENSION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case EcnoPackage.EVENT_TYPE_EXTENSION__SUPER:
				return ((InternalEList<?>)getSuper()).basicRemove(otherEnd, msgs);
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
			case EcnoPackage.EVENT_TYPE_EXTENSION__PACKAGE_URI:
				return getPackageURI();
			case EcnoPackage.EVENT_TYPE_EXTENSION__TYPE_NAME:
				return getTypeName();
			case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORTED:
				return isImported();
			case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT:
				if (resolve) return getImport();
				return basicGetImport();
			case EcnoPackage.EVENT_TYPE_EXTENSION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case EcnoPackage.EVENT_TYPE_EXTENSION__NAME:
				return getName();
			case EcnoPackage.EVENT_TYPE_EXTENSION__PARAMETERS:
				return getParameters();
			case EcnoPackage.EVENT_TYPE_EXTENSION__SUPER:
				if (coreType) return getSuper();
				else return getSuper().map();
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
			case EcnoPackage.EVENT_TYPE_EXTENSION__PACKAGE_URI:
				setPackageURI((String)newValue);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT:
				setImport((ImportedType)newValue);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__BASE:
				setBase((EventType)newValue);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__NAME:
				setName((String)newValue);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FormalParameter>)newValue);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__SUPER:
				((EStructuralFeature.Setting)getSuper()).set(newValue);
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
			case EcnoPackage.EVENT_TYPE_EXTENSION__PACKAGE_URI:
				setPackageURI(PACKAGE_URI_EDEFAULT);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT:
				setImport((ImportedType)null);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__BASE:
				setBase((EventType)null);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__PARAMETERS:
				getParameters().clear();
				return;
			case EcnoPackage.EVENT_TYPE_EXTENSION__SUPER:
				getSuper().clear();
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
			case EcnoPackage.EVENT_TYPE_EXTENSION__PACKAGE_URI:
				return PACKAGE_URI_EDEFAULT == null ? packageURI != null : !PACKAGE_URI_EDEFAULT.equals(packageURI);
			case EcnoPackage.EVENT_TYPE_EXTENSION__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORTED:
				return isImported() != IMPORTED_EDEFAULT;
			case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT:
				return import_ != null;
			case EcnoPackage.EVENT_TYPE_EXTENSION__BASE:
				return base != null;
			case EcnoPackage.EVENT_TYPE_EXTENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcnoPackage.EVENT_TYPE_EXTENSION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case EcnoPackage.EVENT_TYPE_EXTENSION__SUPER:
				return super_ != null && !super_.isEmpty();
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
				case EcnoPackage.EVENT_TYPE_EXTENSION__PACKAGE_URI: return EcnoPackage.IMPORTED_TYPE__PACKAGE_URI;
				case EcnoPackage.EVENT_TYPE_EXTENSION__TYPE_NAME: return EcnoPackage.IMPORTED_TYPE__TYPE_NAME;
				case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORTED: return EcnoPackage.IMPORTED_TYPE__IMPORTED;
				case EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT: return EcnoPackage.IMPORTED_TYPE__IMPORT;
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
				case EcnoPackage.IMPORTED_TYPE__PACKAGE_URI: return EcnoPackage.EVENT_TYPE_EXTENSION__PACKAGE_URI;
				case EcnoPackage.IMPORTED_TYPE__TYPE_NAME: return EcnoPackage.EVENT_TYPE_EXTENSION__TYPE_NAME;
				case EcnoPackage.IMPORTED_TYPE__IMPORTED: return EcnoPackage.EVENT_TYPE_EXTENSION__IMPORTED;
				case EcnoPackage.IMPORTED_TYPE__IMPORT: return EcnoPackage.EVENT_TYPE_EXTENSION__IMPORT;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	// @generated NOT 
	boolean resolved = false;
	
	// @generated NOT 
	IEventTypeExtension resolvedTo = null;
	
	// @generated NOT 
	IEventType resolvedBaseEventType = null;
	
	Map<String,IEventTypeExtension> key2superEventTypeExt = null;
	
	// @generated NOT
	@Override
	public IEventType getBaseEventType() {
		if (resolvedBaseEventType != null) {
			return resolvedBaseEventType;
		} else {
			EventType result = this.getBase();
			if  (result!= null) {
				result = EventTypeImpl.resolveImport(result);
			}
			return result;
		}
	}


	// @generated NOT
	@Override
	public Collection<String> getSuperEventTypeExtensionKeys() {
		return this.getSuper().keySet();
	}

	// @generated NOT
	@Override
	public IEventTypeExtension getSuperTypeExtension(String key) {
		if (key2superEventTypeExt != null) {
			return key2superEventTypeExt.get(key);
		} else {
			EventTypeExtension result = this.getSuper().get(key);
			if  (result!= null) {
				result = resolveImport(result);
			}
			return result;
		}
	}

	// @generated NOT
	static EventTypeExtension resolveImport(EventTypeExtension extension) {
		EventTypeExtension result = extension;
		Set<EventTypeExtension> touched = new HashSet<EventTypeExtension>();
		while (result != null && result.isImported() && !touched.contains(result)) {
			touched.add(result);
			if (result.getImport() instanceof EventTypeExtension) {
				result = (EventTypeExtension) result.getImport();
			} else {
				result = null;
			}
		}
		if (touched.contains(result)) {
			return null;
		} else {
			return result;
		}
	}
	
	// @generated NOT
	@Override
	public List<IFormalParameter> getFormalParametersList() {
		// Note that this returns the parameters of this extension only. It does
		// not return the parameter of the extended extensions or the based EventType!
		// TODO this is extremely in efficient, since it copies the list!
		return new ArrayList<IFormalParameter>(this.getParameters());
	}

	// @generated NOT
	@Override
	public INamespace getNamespace() {
		EObject container = this.eContainer();
		if (container instanceof Package) {
			return (Package) container;
		}
		return null;
	}

} //EventTypeExtensionImpl
