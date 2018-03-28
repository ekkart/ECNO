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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl#getElementTypes <em>Element Types</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl#getEventTypes <em>Event Types</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl#getEventTypeExtensions <em>Event Type Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements dk.dtu.imm.se.ecno.model.ecno.Package {
	/**
	 * The cached value of the '{@link #getElementTypes() <em>Element Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementType> elementTypes;

	/**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage ePackage;

	/**
	 * The cached value of the '{@link #getEventTypes() <em>Event Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EventType> eventTypes;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<dk.dtu.imm.se.ecno.model.ecno.Package> uses;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventTypeExtensions() <em>Event Type Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTypeExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventTypeExtension> eventTypeExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementType> getElementTypes() {
		if (elementTypes == null) {
			elementTypes = new EObjectContainmentEList<ElementType>(ElementType.class, this, EcnoPackage.PACKAGE__ELEMENT_TYPES);
		}
		return elementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getEPackage() {
		if (ePackage != null && ePackage.eIsProxy()) {
			InternalEObject oldEPackage = (InternalEObject)ePackage;
			ePackage = (EPackage)eResolveProxy(oldEPackage);
			if (ePackage != oldEPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.PACKAGE__EPACKAGE, oldEPackage, ePackage));
			}
		}
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetEPackage() {
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPackage(EPackage newEPackage) {
		EPackage oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.PACKAGE__EPACKAGE, oldEPackage, ePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventType> getEventTypes() {
		if (eventTypes == null) {
			eventTypes = new EObjectContainmentEList<EventType>(EventType.class, this, EcnoPackage.PACKAGE__EVENT_TYPES);
		}
		return eventTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<dk.dtu.imm.se.ecno.model.ecno.Package> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<dk.dtu.imm.se.ecno.model.ecno.Package>(dk.dtu.imm.se.ecno.model.ecno.Package.class, this, EcnoPackage.PACKAGE__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.PACKAGE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventTypeExtension> getEventTypeExtensions() {
		if (eventTypeExtensions == null) {
			eventTypeExtensions = new EObjectContainmentEList<EventTypeExtension>(EventTypeExtension.class, this, EcnoPackage.PACKAGE__EVENT_TYPE_EXTENSIONS);
		}
		return eventTypeExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnoPackage.PACKAGE__ELEMENT_TYPES:
				return ((InternalEList<?>)getElementTypes()).basicRemove(otherEnd, msgs);
			case EcnoPackage.PACKAGE__EVENT_TYPES:
				return ((InternalEList<?>)getEventTypes()).basicRemove(otherEnd, msgs);
			case EcnoPackage.PACKAGE__EVENT_TYPE_EXTENSIONS:
				return ((InternalEList<?>)getEventTypeExtensions()).basicRemove(otherEnd, msgs);
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
			case EcnoPackage.PACKAGE__ELEMENT_TYPES:
				return getElementTypes();
			case EcnoPackage.PACKAGE__EPACKAGE:
				if (resolve) return getEPackage();
				return basicGetEPackage();
			case EcnoPackage.PACKAGE__EVENT_TYPES:
				return getEventTypes();
			case EcnoPackage.PACKAGE__USES:
				return getUses();
			case EcnoPackage.PACKAGE__URI:
				return getUri();
			case EcnoPackage.PACKAGE__EVENT_TYPE_EXTENSIONS:
				return getEventTypeExtensions();
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
			case EcnoPackage.PACKAGE__ELEMENT_TYPES:
				getElementTypes().clear();
				getElementTypes().addAll((Collection<? extends ElementType>)newValue);
				return;
			case EcnoPackage.PACKAGE__EPACKAGE:
				setEPackage((EPackage)newValue);
				return;
			case EcnoPackage.PACKAGE__EVENT_TYPES:
				getEventTypes().clear();
				getEventTypes().addAll((Collection<? extends EventType>)newValue);
				return;
			case EcnoPackage.PACKAGE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends dk.dtu.imm.se.ecno.model.ecno.Package>)newValue);
				return;
			case EcnoPackage.PACKAGE__URI:
				setUri((String)newValue);
				return;
			case EcnoPackage.PACKAGE__EVENT_TYPE_EXTENSIONS:
				getEventTypeExtensions().clear();
				getEventTypeExtensions().addAll((Collection<? extends EventTypeExtension>)newValue);
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
			case EcnoPackage.PACKAGE__ELEMENT_TYPES:
				getElementTypes().clear();
				return;
			case EcnoPackage.PACKAGE__EPACKAGE:
				setEPackage((EPackage)null);
				return;
			case EcnoPackage.PACKAGE__EVENT_TYPES:
				getEventTypes().clear();
				return;
			case EcnoPackage.PACKAGE__USES:
				getUses().clear();
				return;
			case EcnoPackage.PACKAGE__URI:
				setUri(URI_EDEFAULT);
				return;
			case EcnoPackage.PACKAGE__EVENT_TYPE_EXTENSIONS:
				getEventTypeExtensions().clear();
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
			case EcnoPackage.PACKAGE__ELEMENT_TYPES:
				return elementTypes != null && !elementTypes.isEmpty();
			case EcnoPackage.PACKAGE__EPACKAGE:
				return ePackage != null;
			case EcnoPackage.PACKAGE__EVENT_TYPES:
				return eventTypes != null && !eventTypes.isEmpty();
			case EcnoPackage.PACKAGE__USES:
				return uses != null && !uses.isEmpty();
			case EcnoPackage.PACKAGE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case EcnoPackage.PACKAGE__EVENT_TYPE_EXTENSIONS:
				return eventTypeExtensions != null && !eventTypeExtensions.isEmpty();
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

	private Map<String,INamedElement> name2Elements = null;
	private List<INamedElement> elementsList = null;
	
	// @generated NOT
	@Override
	public List<INamedElement> getElements() {
		if (name2Elements == null) {
			elementsList = new ArrayList<INamedElement>();
			name2Elements = new HashMap<String,INamedElement>(); 
			for (ElementType elementType: this.getElementTypes()) {
				// return the non-imported element types only
				String importedURI = elementType.getPackageURI();
				if (importedURI == null || importedURI.equals("")) {
					elementsList.add(elementType);
				}
				name2Elements.put(elementType.getName(), elementType);
			}
			for (EventType eventType: this.getEventTypes()) {
				// return the non-imported event types only
				String importedURI = eventType.getPackageURI();
				if (importedURI == null || importedURI.equals("")) {
					elementsList.add(eventType);
				}
				name2Elements.put(eventType.getName(), eventType);
			}
			for (EventTypeExtension extension: this.getEventTypeExtensions()) {
				// return the non-imported event type extensions only
				String importedURI = extension.getPackageURI();
				if (importedURI == null || importedURI.equals("")) {
					elementsList.add(extension);
				}
				name2Elements.put(extension.getName(), extension);
			}
		}
		return Collections.unmodifiableList(elementsList);
	}

	// @generated NOT
	@Override
	public INamedElement getElement(String name) {
		if (name2Elements == null) {
			getElements();
		}
		INamedElement element = name2Elements.get(name);
		if (element instanceof ElementTypeImpl) {
			ElementTypeImpl type = (ElementTypeImpl) element;
			if (type.resolvedTo != null) {
				return type.resolvedTo;
			} else if (type.getPackageURI() == null || type.getPackageURI().equals("")) {
				return type;
			} else {
				return null;
			}
		} else if (element instanceof EventTypeImpl) {
			EventTypeImpl type = (EventTypeImpl) element;
			if (type.resolvedTo != null) {
				return type.resolvedTo;
			} else if (type.getPackageURI() == null || type.getPackageURI().equals("")) {
				return type;
			} else {
				return null;
			}
		} else if (element instanceof EventTypeExtensionImpl) {
			EventTypeExtensionImpl extension = (EventTypeExtensionImpl) element;
			if (extension.resolvedTo != null) {
				return extension.resolvedTo;
			} else if (extension.getPackageURI() == null || extension.getPackageURI().equals("")) {
				return extension;
			} else {
				return null;
			}
		} else {
			return element;
		}
		
	}

	// @generated NOT
	@Override
	public String getName() {
		// TODO not implemented yet
		return null;
	}

	// @generated NOT
	@Override
	public INamespace getNamespace() {
		// TODO not implemented yet
		return null;
	}

	// @generated NOT
	@Override
	public String getURI() {
		return this.getUri();
	}

	// @generated NOT
	@Override
	public boolean resolveImportedElements(ExecutionEngine engine) {
		boolean success = true;
		
		// resolve element types themselves
		for (ElementType elementType: this.getElementTypes()) {
			if (elementType instanceof ElementTypeImpl) {
				ElementTypeImpl type = (ElementTypeImpl) elementType;
				if (!type.resolved) {
					type.resolved = true;
					String uri = elementType.getPackageURI();
					if (uri != null && !uri.equals("")) {
						INamespace namespace = engine.getNamespace(uri);
						if (namespace != null) {
							INamedElement namedElement = namespace.getElement(type.getTypeName());
							if (namedElement instanceof IElementType) {
								type.resolvedTo = (IElementType) namedElement;
							} else {
								success = false;
							}
						} else {
							success = false;
						}
					} else {
						type.resolvedTo = type;
					}
				}
			}
		}
		
		// resolve super types and references of ElementTypes
		for (ElementType elementType: this.getElementTypes()) {
			if (elementType instanceof ElementTypeImpl) {
				ElementTypeImpl type = (ElementTypeImpl) elementType;
				
				// resolve the super types
				ElementType superElementType = type.getSuper();
				if (superElementType != null) {
					if (superElementType instanceof ElementTypeImpl) {
						ElementTypeImpl superType = (ElementTypeImpl) superElementType;
						if (superType.resolvedTo != null) {
							type.resolvedSuperElementType = superType.resolvedTo;
						} else {
							success = false;
						}

					} else {
						success = false;
					}
				}
			}
			
			// resolve targets of references
			for (Reference reference: elementType.getReferences()) {
				if (reference instanceof ReferenceImpl) {
					ReferenceImpl ref = (ReferenceImpl) reference;
					IElementType targetElementType = reference.getTargetElementType();
					if (targetElementType instanceof ElementTypeImpl) {
						ref.resolvedTarget = ((ElementTypeImpl) targetElementType).resolvedTo;
						if (ref.resolvedTarget == null) {
							success = false;
						}
					} else {
						success = false;
					}
					
				} else {
					success = false;
				}
			}
		}
		
		for (EventType eventType: this.getEventTypes()) {
			if (eventType instanceof EventTypeImpl) {
				EventTypeImpl type = (EventTypeImpl) eventType;
				if (!type.resolved) {
					type.resolved = true;
					String uri = eventType.getPackageURI();
					if (uri != null && !uri.equals("")) {
						INamespace namespace = engine.getNamespace(uri);
						if (namespace != null) {
							INamedElement namedElement = namespace.getElement(type.getTypeName());
							if (namedElement instanceof IEventType) {
								type.resolvedTo = (IEventType) namedElement;
							} else {
								success = false;
							}
						} else {
							success = false;
						}
					} else {
						type.resolvedTo = type;
					}
				}
			}
		}
		
		// resolve super types EventTypes
		for (EventType eventType: this.getEventTypes()) {
			if (eventType instanceof EventTypeImpl) {
				EventTypeImpl type = (EventTypeImpl) eventType;
				
				// resolve the super types
				EventType superEventType = type.getSuper();
				if (superEventType != null) {
					if (superEventType instanceof EventTypeImpl) {
						EventTypeImpl superType = (EventTypeImpl) superEventType;
						if (superType.resolvedTo != null) {
							type.resolvedSuperEventType = superType.resolvedTo;
						} else {
							success = false;
						}

					} else {
						success = false;
					}
				}
			}
		}
		
		for (ElementType elementType: this.getElementTypes()) {
			for (CoordinationSet coordSet: elementType.getCoordinationSets()) {
				// resolve the trigger event type of each coordination set
				EventType trigger =  coordSet.getTriggerEvent();
				if (trigger instanceof EventTypeImpl && coordSet instanceof CoordinationSetImpl) {
					 ((CoordinationSetImpl) coordSet).resolvedTriggerEventType = ((EventTypeImpl) trigger).resolvedTo;
					 if (((CoordinationSetImpl) coordSet).resolvedTriggerEventType == null) {
						 success = false;
					 }
				}
				for (Synchronisation synch: coordSet.getSynchronisations()) {
					// and resolve the event type of each synchronisation
					trigger =  synch.getEventType();
					if (trigger instanceof EventTypeImpl && synch instanceof SynchronisationImpl) {
						((SynchronisationImpl) synch).resolvedEventType = ((EventTypeImpl) trigger).resolvedTo;
						if (((SynchronisationImpl) synch).resolvedEventType == null) {
							 success = false;
						}
					}
				}
			}
		}
		
		// resolve event type extensions themselves
		for (EventTypeExtension ext: this.getEventTypeExtensions()) {
			if (ext instanceof EventTypeExtensionImpl) {
				EventTypeExtensionImpl extension = (EventTypeExtensionImpl) ext;
				if (!extension.resolved) {
					extension.resolved = true;
					String uri = extension.getPackageURI();
					if (uri != null && !uri.equals("")) {
						INamespace namespace = engine.getNamespace(uri);
						if (namespace != null) {
							INamedElement namedElement = namespace.getElement(extension.getTypeName());
							if (namedElement instanceof IEventTypeExtension) {
								extension.resolvedTo = (IEventTypeExtension) namedElement;
							} else {
								success = false;
							}
						} else {
							success = false;
						}
					} else {
						extension.resolvedTo = extension;
					}
				}
			}
		}
		
		// resolve extensions base type and super event type extensions
		for (EventTypeExtension ext: this.getEventTypeExtensions()) {
			if (ext instanceof EventTypeExtensionImpl) {
				EventTypeExtensionImpl extension = (EventTypeExtensionImpl) ext;
				
				// resolve the base type
				EventType baseEventType = extension.getBase();
				if (baseEventType != null) {
					if (baseEventType instanceof EventTypeImpl) {
						EventTypeImpl baseType = (EventTypeImpl) baseEventType;
						if (baseType.resolvedTo != null) {
							extension.resolvedBaseEventType = baseType.resolvedTo;
						} else {
							success = false;
						}

					} else {
						success = false;
					}
				}
				
				// resolve and set the superEventTypeExtensions for all keys
				if (extension.key2superEventTypeExt == null) {
					extension.key2superEventTypeExt = new HashMap<String,IEventTypeExtension>();
					for (String key: extension.getSuperEventTypeExtensionKeys()) {
						EventTypeExtension superExt = extension.getSuper().get(key);
						if (superExt instanceof EventTypeExtensionImpl) {
							EventTypeExtensionImpl superExtension = (EventTypeExtensionImpl) superExt;
							if (superExtension.resolvedTo != null) {
								extension.key2superEventTypeExt.put(key, superExtension.resolvedTo);
							} else {
								success = false;
							}
						} else {
							success = false;
						}
					}
				}
			}
		}
		
		return success;
		
	}

} //PackageImpl
