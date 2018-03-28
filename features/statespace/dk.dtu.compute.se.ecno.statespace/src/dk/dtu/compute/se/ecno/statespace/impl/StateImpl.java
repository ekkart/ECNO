/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues;
import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.compute.se.ecno.statespace.StatespaceFactory;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Transition;
import dk.dtu.compute.se.ecno.statespace.Value;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesFactory;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.model.runtime.ecnonets.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.runtime.internal.InheritingBehaviour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateImpl#getOut <em>Out</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateImpl#getIn <em>In</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateImpl#getStatespace <em>Statespace</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateImpl#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> out;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> in;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<StateObject> objects;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatespacePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOut() {
		if (out == null) {
			out = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, StatespacePackage.STATE__OUT, StatespacePackage.TRANSITION__SOURCE);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIn() {
		if (in == null) {
			in = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, StatespacePackage.STATE__IN, StatespacePackage.TRANSITION__TARGET);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<StateObject>(StateObject.class, this, StatespacePackage.STATE__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpace getStatespace() {
		if (eContainerFeatureID() != StatespacePackage.STATE__STATESPACE) return null;
		return (StateSpace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatespace(StateSpace newStatespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatespace, StatespacePackage.STATE__STATESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatespace(StateSpace newStatespace) {
		if (newStatespace != eInternalContainer() || (eContainerFeatureID() != StatespacePackage.STATE__STATESPACE && newStatespace != null)) {
			if (EcoreUtil.isAncestor(this, newStatespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatespace != null)
				msgs = ((InternalEObject)newStatespace).eInverseAdd(this, StatespacePackage.STATE_SPACE__STATES, StateSpace.class, msgs);
			msgs = basicSetStatespace(newStatespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE__STATESPACE, newStatespace, newStatespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE__NUMBER, oldNumber, number));
	}

	// @generated NOT
	private int hashCode = 0; // 0 indicating that no hashcode was computed yet

	// @generated NOT
	private int hashValue(Object object) {
		if (object instanceof StateObject) {
			return ((StateObject) object).getUid();
		} else if (object instanceof Collection) {
			int hashValue = 0;
			for (Object o: (Collection<?>) object) {
				hashValue ^= hashValue(o);
			}
			return hashValue;
		} else if (object instanceof String || object instanceof Integer || object instanceof Float) {
			return object.hashCode();
		}
		return 0;
	}
	
	private void setContentFromObject(EObject object, StateObject stateObject, Map<EObject,StateObject> stateMap) {
		EClass eClass = stateObject.getType();
		for (EStructuralFeature feature:eClass.getEAllStructuralFeatures()) {
			if (feature != StatespacePackage.eINSTANCE.getElement_Uid()) { 
				Object value = object.eGet(feature);
				if (value != null) {
					if (feature.getUpperBound() == 1) {
						ObjectFeatureValues ofv = StatespaceFactory.eINSTANCE.createObjectFeatureValues();
						ofv.setFeature(feature);					
						stateObject.getFeatures().add(ofv);
						Value v = StatespaceFactory.eINSTANCE.createValue();
						ofv.getValues().add(v);
						if (value instanceof Element) {
							StateObject stateObjectValue = stateMap.get(value);
							if (stateObjectValue != null) {
								v.getStateValues().add(stateObjectValue);
							}	
						} else if (value instanceof String) {
							v.getStringValues().add((String) value);
						}  else if (value instanceof Integer) {
							v.getIntValues().add((Integer) value);
						}
					} else {
						if (value instanceof Collection) {
							Collection<?> values = (Collection<?>) value;
							if (!values.isEmpty()) {
								ObjectFeatureValues ofv = StatespaceFactory.eINSTANCE.createObjectFeatureValues();
								ofv.setFeature(feature);
								stateObject.getFeatures().add(ofv);
								Value v = StatespaceFactory.eINSTANCE.createValue();
								ofv.getValues().add(v);
								boolean success = false;
								try {
									@SuppressWarnings("unchecked")
									Collection<? extends Element> add = (Collection<? extends Element>) values;
									for (Element element: add) {
										StateObject stateObjectValue = stateMap.get(element);
										if (stateObjectValue != null) {
											v.getStateValues().add(stateObjectValue);
										}
									}
									success = true;
								} catch (Exception e) {}
								if (! success) {
									try {
										@SuppressWarnings("unchecked")
										Collection<String> add = (Collection<String>) values;
										v.getStringValues().addAll(add);
										success = true;
									} catch (Exception e) {}
								}
								if (! success) {
									try {
										@SuppressWarnings("unchecked")
										Collection<Integer> add = (Collection<Integer>) values;
										v.getIntValues().addAll(add);
									} catch (Exception e) {}
								}
							}

						}
					}
				}
			}
		}
	}
	
	private Map<Integer,StateObject> uid2StateObject = null; 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Ekkart Kindler, ekki@dtu.dk
	 */
	public void init(EObject container, ExecutionEngine engine) {
		uid2StateObject = new HashMap<Integer,StateObject>();
		Map<EObject,StateObject> stateMap = new HashMap<EObject,StateObject>();

		Iterator<EObject> iterator = container.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof Element) {
				StateObject stateObject = StatespaceFactory.eINSTANCE.createStateObject();
				int uid = ((Element) object).getUid();
				stateObject.setUid(uid);
				stateObject.setType(object.eClass());
				this.getObjects().add(stateObject);
				uid2StateObject.put(uid, stateObject);
				stateMap.put(object, stateObject);
				
				IElementBehaviour behaviour = engine.getElementBehaviour(object);
				if (behaviour instanceof InheritingBehaviour) {
					InheritingBehaviour inheritingBehaviour = (InheritingBehaviour) behaviour;
					List<PTNetState> stateObjectBehaviours = stateObject.getBehaviourStates();
					for (IElementBehaviour b: inheritingBehaviour.getBehaviours()) {
						if (b instanceof AbstractPetrinetBehaviour) {
							AbstractPetrinetBehaviour<?> pnBehaviour = (AbstractPetrinetBehaviour<?>) b;
							BehaviourState state = pnBehaviour.getBehaviourState();
							if (state instanceof PTNetState) {
								PTNetState ptNetState = (PTNetState) state;
								PTNetState ptNetStateCopy = BehaviourstatesFactory.eINSTANCE.createPTNetState();
								for (int i =0; i < ptNetState.getMarking().size(); i++) {
									ptNetStateCopy.getMarking().add(ptNetState.getMarking().get(i));
								}
								stateObjectBehaviours.add(ptNetStateCopy);
							} else {
								// TODO: In case not all behaviours are ECNO net behaviours, we cannot
								// store the behaviour state for now.
								stateObjectBehaviours.clear();
								break;
							}
						}
					}
				}
			}
		}
		
		iterator = container.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof Element) {
				StateObject stateObject = stateMap.get(object);
				if (stateObject != null) {
					setContentFromObject(object, stateObject, stateMap);
				}
			}
		}
		
		computeHashCode();
	}
	
	public Map<Integer,StateObject> getUidMap() {
		if (this.uid2StateObject == null) {
			uid2StateObject = new HashMap<Integer,StateObject>();
			for (StateObject stateObject: this.getObjects()) {
				this.uid2StateObject.put(stateObject.getUid(), stateObject);
			}
		}
		return this.uid2StateObject;
	}
	//@generated NOT
	//@author Ekkart Kindler, ekki@dtu.dk
	private void computeHashCode() {
		hashCode = 0;
		for (StateObject object: this.getObjects()) {
			hashCode ^= object.getUid();
			int i = 1;
			for (PTNetState pnState: object.getBehaviourStates()) {
				hashCode ^= pnState.getMarking().hashCode() >> i;
				/*
				for (int j=0; j < pnState.getMarking().size(); j++) {
					hashCode ^= pnState.getMarking().get(j) >> i;
				}
				*/
			}
			for (ObjectFeatureValues values: object.getFeatures()) {
				EStructuralFeature feature = values.getFeature();
				i = 0;
				for (Value value: values.getValues()) {
					for (StateObject so: value.getStateValues()) {
						hashCode ^= hashValue(so) << i;
						if (i == 0) {
							hashCode ^= feature.hashCode();
						}
						i++;
					}
					for (String stringValue: value.getStringValues()) {
						hashCode ^= stringValue.hashCode() << i;
						if (i == 0) {
							hashCode ^= feature.hashCode();
						}
						i++;
					}
					for (Integer intValue: value.getIntValues()) {
						hashCode ^= intValue.hashCode() << i;
						if (i == 0) {
							hashCode ^= feature.hashCode();
						}
						i++;
					}
				}
			}
		}
		
		if (hashCode == 0) {
			// we use 0 to detect that hashcode was not yet computed. So we
			// need to make sure that a computed hashCode is never 0.
			hashCode = 1;
		}
		
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Ekkart Kindler, ekki@dtu.dk
	 */
	public StateObject getState(int uid) {
		if (this.uid2StateObject == null) {
			this.getUidMap();
		}
		return this.uid2StateObject.get(uid);
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
			case StatespacePackage.STATE__OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
			case StatespacePackage.STATE__IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
			case StatespacePackage.STATE__STATESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatespace((StateSpace)otherEnd, msgs);
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
			case StatespacePackage.STATE__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
			case StatespacePackage.STATE__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case StatespacePackage.STATE__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case StatespacePackage.STATE__STATESPACE:
				return basicSetStatespace(null, msgs);
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
			case StatespacePackage.STATE__STATESPACE:
				return eInternalContainer().eInverseRemove(this, StatespacePackage.STATE_SPACE__STATES, StateSpace.class, msgs);
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
			case StatespacePackage.STATE__OUT:
				return getOut();
			case StatespacePackage.STATE__IN:
				return getIn();
			case StatespacePackage.STATE__OBJECTS:
				return getObjects();
			case StatespacePackage.STATE__STATESPACE:
				return getStatespace();
			case StatespacePackage.STATE__NUMBER:
				return getNumber();
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
			case StatespacePackage.STATE__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatespacePackage.STATE__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatespacePackage.STATE__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends StateObject>)newValue);
				return;
			case StatespacePackage.STATE__STATESPACE:
				setStatespace((StateSpace)newValue);
				return;
			case StatespacePackage.STATE__NUMBER:
				setNumber((Integer)newValue);
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
			case StatespacePackage.STATE__OUT:
				getOut().clear();
				return;
			case StatespacePackage.STATE__IN:
				getIn().clear();
				return;
			case StatespacePackage.STATE__OBJECTS:
				getObjects().clear();
				return;
			case StatespacePackage.STATE__STATESPACE:
				setStatespace((StateSpace)null);
				return;
			case StatespacePackage.STATE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
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
			case StatespacePackage.STATE__OUT:
				return out != null && !out.isEmpty();
			case StatespacePackage.STATE__IN:
				return in != null && !in.isEmpty();
			case StatespacePackage.STATE__OBJECTS:
				return objects != null && !objects.isEmpty();
			case StatespacePackage.STATE__STATESPACE:
				return getStatespace() != null;
			case StatespacePackage.STATE__NUMBER:
				return number != NUMBER_EDEFAULT;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

	private boolean isEqual(StateObject so1, StateObject so2) {
		if ((so1.getUid() != so2.getUid()) || 
				!so1.getClass().equals(so2.getClass()) ||
				so1.getBehaviourStates().size() != so2.getBehaviourStates().size()) {
			return false;
		}
		
		for (int i = 0; i < so1.getBehaviourStates().size(); i++) {
			PTNetState pnState1 = so1.getBehaviourStates().get(i);
			PTNetState pnState2 = so2.getBehaviourStates().get(i);
			if (!pnState1.getMarking().equals(pnState2.getMarking())) {
				return false;
			}
		}
		
		List<ObjectFeatureValues> features1 = so1.getFeatures();
		List<ObjectFeatureValues> features2 = so2.getFeatures();
		
		if (features1.size() != features2.size()) {
			return false;
		}
		
		for (int i= 0; i < features1.size(); i++) {
			ObjectFeatureValues ofv1 = features1.get(i);
			ObjectFeatureValues ofv2 = features2.get(i);
			if (ofv1.getValues().size() != ofv2.getValues().size()) {
				return false;
			}
			for (int j=0; j < ofv1.getValues().size(); j++) {
				Value value1 = ofv1.getValues().get(j);
				Value value2 = ofv2.getValues().get(j);
				if (value1.getStateValues().size() != value2.getStateValues().size()) {
					return false;
				}
				for (int k=0; k < value1.getStateValues().size(); k++) {
					if (value1.getStateValues().get(k).getUid() != 
							value2.getStateValues().get(k).getUid())  {
						return false;
					}
				}
				
				if (!value1.getStringValues().equals(value2.getStringValues())) {
					return false;
				}
				
				if (!value1.getIntValues().equals(value2.getIntValues())) {
					return false;
				}
			}
		}
		
		return true;
	}
	/*
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @generated NOT
	 * @author Ekkart Kindler, ekki@dtu.dk
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else  if (!(object instanceof StateImpl)) {
			return false;
		} 
		
		StateImpl other = (StateImpl) object;
		if (this.hashCode() != other.hashCode() ||
				!this.getUidMap().keySet().equals(other.getUidMap().keySet())) {
			return false;
		}
		
		for (int uid: this.getUidMap().keySet()) {
			StateObject so1 = this.getState(uid);
			StateObject so2 = other.getState(uid);
			if (so1 == null || so2 == null) {
				return false;
			}
			if (!isEqual(so1, so2)) {
				return false;
			}
		}
		
		return true;
	}

	/*
	 * @see java.lang.Object#hashCode()
	 * @generated NOT
	 * @author Ekkart Kindler, ekki@dtu.dk
	 */
	@Override
	public int hashCode() {
		if (hashCode == 0) {
			// hashCode 0 indicates that is was not computed yet 
			computeHashCode();
		}
		return hashCode;
	}
} //StateImpl
