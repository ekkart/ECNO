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
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.ImportedType;
import dk.dtu.imm.se.ecno.model.ecno.Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#isImported <em>Imported</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#isGui <em>Gui</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventTypeImpl extends EObjectImpl implements EventType {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameter> parameters;

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
	protected EventType super_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.EVENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE__PACKAGE_URI, oldPackageURI, packageURI));
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
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE__TYPE_NAME, oldTypeName, typeName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.EVENT_TYPE__IMPORT, oldImport, import_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE__IMPORT, oldImport, import_));
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
	public EList<FormalParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<FormalParameter>(FormalParameter.class, this, EcnoPackage.EVENT_TYPE__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE__GUI, oldGui, gui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (EventType)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.EVENT_TYPE__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(EventType newSuper) {
		EventType oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.EVENT_TYPE__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnoPackage.EVENT_TYPE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case EcnoPackage.EVENT_TYPE__PACKAGE_URI:
				return getPackageURI();
			case EcnoPackage.EVENT_TYPE__TYPE_NAME:
				return getTypeName();
			case EcnoPackage.EVENT_TYPE__IMPORTED:
				return isImported();
			case EcnoPackage.EVENT_TYPE__IMPORT:
				if (resolve) return getImport();
				return basicGetImport();
			case EcnoPackage.EVENT_TYPE__PARAMETERS:
				return getParameters();
			case EcnoPackage.EVENT_TYPE__NAME:
				return getName();
			case EcnoPackage.EVENT_TYPE__GUI:
				return isGui();
			case EcnoPackage.EVENT_TYPE__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
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
			case EcnoPackage.EVENT_TYPE__PACKAGE_URI:
				setPackageURI((String)newValue);
				return;
			case EcnoPackage.EVENT_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case EcnoPackage.EVENT_TYPE__IMPORT:
				setImport((ImportedType)newValue);
				return;
			case EcnoPackage.EVENT_TYPE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FormalParameter>)newValue);
				return;
			case EcnoPackage.EVENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case EcnoPackage.EVENT_TYPE__GUI:
				setGui((Boolean)newValue);
				return;
			case EcnoPackage.EVENT_TYPE__SUPER:
				setSuper((EventType)newValue);
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
			case EcnoPackage.EVENT_TYPE__PACKAGE_URI:
				setPackageURI(PACKAGE_URI_EDEFAULT);
				return;
			case EcnoPackage.EVENT_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case EcnoPackage.EVENT_TYPE__IMPORT:
				setImport((ImportedType)null);
				return;
			case EcnoPackage.EVENT_TYPE__PARAMETERS:
				getParameters().clear();
				return;
			case EcnoPackage.EVENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcnoPackage.EVENT_TYPE__GUI:
				setGui(GUI_EDEFAULT);
				return;
			case EcnoPackage.EVENT_TYPE__SUPER:
				setSuper((EventType)null);
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
			case EcnoPackage.EVENT_TYPE__PACKAGE_URI:
				return PACKAGE_URI_EDEFAULT == null ? packageURI != null : !PACKAGE_URI_EDEFAULT.equals(packageURI);
			case EcnoPackage.EVENT_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case EcnoPackage.EVENT_TYPE__IMPORTED:
				return isImported() != IMPORTED_EDEFAULT;
			case EcnoPackage.EVENT_TYPE__IMPORT:
				return import_ != null;
			case EcnoPackage.EVENT_TYPE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case EcnoPackage.EVENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcnoPackage.EVENT_TYPE__GUI:
				return gui != GUI_EDEFAULT;
			case EcnoPackage.EVENT_TYPE__SUPER:
				return super_ != null;
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
				case EcnoPackage.EVENT_TYPE__PACKAGE_URI: return EcnoPackage.IMPORTED_TYPE__PACKAGE_URI;
				case EcnoPackage.EVENT_TYPE__TYPE_NAME: return EcnoPackage.IMPORTED_TYPE__TYPE_NAME;
				case EcnoPackage.EVENT_TYPE__IMPORTED: return EcnoPackage.IMPORTED_TYPE__IMPORTED;
				case EcnoPackage.EVENT_TYPE__IMPORT: return EcnoPackage.IMPORTED_TYPE__IMPORT;
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
				case EcnoPackage.IMPORTED_TYPE__PACKAGE_URI: return EcnoPackage.EVENT_TYPE__PACKAGE_URI;
				case EcnoPackage.IMPORTED_TYPE__TYPE_NAME: return EcnoPackage.EVENT_TYPE__TYPE_NAME;
				case EcnoPackage.IMPORTED_TYPE__IMPORTED: return EcnoPackage.EVENT_TYPE__IMPORTED;
				case EcnoPackage.IMPORTED_TYPE__IMPORT: return EcnoPackage.EVENT_TYPE__IMPORT;
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
		result.append(", gui: ");
		result.append(gui);
		result.append(')');
		return result.toString();
	}

	private IEventType topSuper;
	private Set<IEventType> allSuper;
	private List<IFormalParameter> allFormalParameters;

	// @generated NOT 
	@Override
	public IEventType getDirectSuperType() {
		if (resolvedSuperEventType != null) {
			return resolvedSuperEventType;
		} else {
			EventType resolve = resolveImport(this);
			if (resolve != null) {
				return resolveImport(resolve.getSuper());
			} else {
				return null;
			}
		}
	}
	
	// @generated NOT
	static EventType resolveImport(EventType eventType) {
		EventType result = eventType;
		Set<EventType> touched = new HashSet<EventType>();
		while (result != null && result.isImported() && !touched.contains(result)) {
			touched.add(result);
			if (result.getImport() instanceof EventType) {
				result = (EventType) result.getImport();
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
	public IEventType getTopSuper() {
		// See comment of getSuperTypes
		if (topSuper == null) {
			getSuperTypes();
		}
		return topSuper;
	}

	// @generated NOT 
	@Override
	public Set<IEventType> getSuperTypes() {
		// In order to make this more efficient, we calculate this only
		// once. This, however, requires that getSuperTypes is called
		// only after all event types are fully created (in particular,
		// the directSuper must be set).
		if (allSuper == null) {
			Set<IEventType> touched = new HashSet<IEventType>();
			// List<IFormalParameter> formalParameters = new ArrayList<IFormalParameter>();
			IEventType current = resolveImport(this);
			IEventType previous = current;
			
			while (current != null &&  !touched.contains(current)) {
				touched.add(current);
				// formalParameters.addAll(current.getParameters());
				previous = current;
				current = current.getDirectSuperType();
			}
			
			if (current == null) {
				allSuper = Collections.unmodifiableSet(touched);
				List<IFormalParameter> formalParameters = new ArrayList<IFormalParameter>(this.getParameters());
				IEventType superType = this.getDirectSuperType();
				if (superType != null) {
					formalParameters.addAll(superType.getFormalParametersList());
				}
				allFormalParameters = Collections.unmodifiableList(formalParameters);
				topSuper = previous;
			} else {
				// If this occurs, there is a cycle in the type hierarchy
				// of the event type. And this should actually not happen.
				// We could raise an exception here. The topSuper is some
				// event type on the cycle.
				// TODO maybe, raise an exception here instead
				allSuper = Collections.unmodifiableSet(touched);
				List<IFormalParameter> formalParameters = new ArrayList<IFormalParameter>(this.getParameters());
				allFormalParameters = Collections.unmodifiableList(formalParameters);
				topSuper = previous;
			}
		}
		return allSuper;
	}

	// @generated NOT 
	@Override
	public List<IFormalParameter> getFormalParametersList() {
		// See comment of getSuperTypes
		if (allFormalParameters == null) {
			getSuperTypes();
		}
		return allFormalParameters;
	}

	// @generated NOT 
	@Override
	public Package getNamespace() {
		EObject container = this.eContainer;
		if (container instanceof Package) {
			return (Package) container;
		}
		return null;
	}
	
	// @generated NOT 
	@Override
	public boolean isCompatibleWith(IEventType eventType) {
		if (this.getTopSuper() != eventType.getTopSuper()) {
			return false;
		} else {
			return this.getSuperTypes().contains(eventType) ||
					eventType.getSuperTypes().contains(this);
		}
	}
	
	// @generated NOT 
	boolean resolved = false;
	// @generated NOT 
	IEventType resolvedTo = null;
	
	// @generated NOT 
	IEventType resolvedSuperEventType = null;

} //EventTypeImpl
