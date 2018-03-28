/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.ecno.statespace.Event;
import dk.dtu.compute.se.ecno.statespace.Link;
import dk.dtu.compute.se.ecno.statespace.Parameter;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.EventImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.EventImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EObjectImpl implements Event {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

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
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatespacePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectWithInverseResolvingEList.ManyInverse<Link>(Link.class, this, StatespacePackage.EVENT__LINKS, StatespacePackage.LINK__EVENTS);
		}
		return links;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, StatespacePackage.EVENT__PARAMETERS);
		}
		return parameters;
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
			case StatespacePackage.EVENT__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
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
			case StatespacePackage.EVENT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case StatespacePackage.EVENT__PARAMETERS:
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
			case StatespacePackage.EVENT__LINKS:
				return getLinks();
			case StatespacePackage.EVENT__NAME:
				return getName();
			case StatespacePackage.EVENT__PARAMETERS:
				return getParameters();
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
			case StatespacePackage.EVENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case StatespacePackage.EVENT__NAME:
				setName((String)newValue);
				return;
			case StatespacePackage.EVENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case StatespacePackage.EVENT__LINKS:
				getLinks().clear();
				return;
			case StatespacePackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StatespacePackage.EVENT__PARAMETERS:
				getParameters().clear();
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
			case StatespacePackage.EVENT__LINKS:
				return links != null && !links.isEmpty();
			case StatespacePackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StatespacePackage.EVENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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

	// @generated NOT
	// @author Ekkart Kindler, ekki@dtu.dk
	private int hashCode = 0;

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	// @generated NOT
	// @author Ekkart Kindler, ekki@dtu.dk
	@Override
	public int hashCode() {
		if (hashCode == 0) {
			if (this.getName() != null) {
			   hashCode ^= this.getName().hashCode();
			}
			int i = 0;
			for (Parameter param: this.getParameters()) {
				i++;
				if (param.isCollection()) {
					hashCode ^= 1 << i;
				}
				if (param.getName() != null) {
					hashCode ^= param.getName().hashCode() << i;
				}
				Value value = param.getValue();
				if (value != null) {
					hashCode ^= value.getIntValues().hashCode() << i;
					hashCode ^= value.getStringValues().hashCode() << i;
					hashCode ^= value.getStateValues().hashCode() << i;
					/* for testing
					for (Integer iv: value.getIntValues()) {
						hashCode ^= iv.hashCode() << 1;
					}
					for (String sv: value.getStringValues()) {
						hashCode ^= sv.hashCode() << 1;
					}
					for (StateObject so: value.getStateValues()) {
						hashCode ^= so.hashCode() << 1;
					}
*/
				}
			}
			if (hashCode == 0) {
				hashCode = 1;
			}
		}
		return hashCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// @generated NOT
	// @author Ekkart Kindler, ekki@dtu.dk
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		
		if (!(object instanceof EventImpl)) {
			return false;
		}
		
		EventImpl other = (EventImpl) object;
		if (this.hashCode() != other.hashCode()) {
			return false;
		}
		
		if (this.getName() == null) {
			if (other.getName() != null) {
				return false;
			}
		} else {
			if (!this.getName().equals(other.getName())) {
				return false;
			}
		}
		
		if (this.getParameters().size() != other.getParameters().size()) {
			return false;
		}
		
		for (int i=0; i < this.getParameters().size(); i++) {
			Parameter thisParam = this.getParameters().get(i);
			Parameter otherParam = other.getParameters().get(i);
			if (thisParam.isCollection() != otherParam.isCollection()) {
				return false;
			}
			if (thisParam.getName() == null) {
				if (otherParam.getName() != null) {
					return false;
				}
			} else {
				if (!thisParam.getName().equals(otherParam.getName())) {
					return false;
				}
			}
			
			Value thisValue = thisParam.getValue();
			Value otherValue = otherParam.getValue();
			if (thisValue == null) {
				if (otherValue != null) {
					return false;
				}
			} else {
				if (otherValue == null) {
					return false;
				}
				if (!thisValue.getIntValues().equals(otherValue.getIntValues()) ||
						!thisValue.getStringValues().equals(otherValue.getStringValues()) ||
						!thisValue.getStateValues().equals(otherValue.getStateValues())) {
					/*
					boolean equal = true;
					if (thisValue.getIntValues().size() == otherValue.getIntValues().size()) {
						for (int j = 0; i < thisValue.getIntValues().size(); i++) {
							if (thisValue.getIntValues().get(j) != otherValue.getIntValues().get(j)) {
								equal = false;
								break;
							}
						}
					}
					if (thisValue.getStringValues().size() == otherValue.getStringValues().size()) {
						for (int j = 0; i < thisValue.getStringValues().size() && equal; i++) {
							if (!thisValue.getStringValues().get(j).equals(otherValue.getStringValues().get(j))) {
								equal = false;
								break;
							}
						}
					}
					if (thisValue.getStateValues().size() == otherValue.getStateValues().size()) {
						for (int j = 0; i < thisValue.getStateValues().size() && equal; i++) {
							if (thisValue.getStateValues().get(j).equals(otherValue.getStateValues().get(j))) {
								equal = false;
								break;
							}
						}
					}
					if (equal) {
						System.err.println("Equals on Elists is not equality");
					}
					*/
					return false;
				}
			}
		}
		
		// TODO move to an earlier point: this is done in the end to track possible
		//      problems with the hashvalues
		/*
		if (this.hashCode() != other.hashCode()) {
			System.err.println("Events are only different due to hashcode");
			return false;
		}
		*/
		return true;
	}

} //EventImpl
