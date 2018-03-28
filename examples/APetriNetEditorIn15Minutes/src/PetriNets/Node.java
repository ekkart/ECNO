/**
 */
package PetriNets;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNets.Node#getName <em>Name</em>}</li>
 *   <li>{@link PetriNets.Node#getIn <em>In</em>}</li>
 *   <li>{@link PetriNets.Node#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNets.PetriNetsPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends PetriNets.Object {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PetriNets.PetriNetsPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PetriNets.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link PetriNets.Arc}.
	 * It is bidirectional and its opposite is '{@link PetriNets.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see PetriNets.PetriNetsPackage#getNode_In()
	 * @see PetriNets.Arc#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Arc> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link PetriNets.Arc}.
	 * It is bidirectional and its opposite is '{@link PetriNets.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see PetriNets.PetriNetsPackage#getNode_Out()
	 * @see PetriNets.Arc#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arc> getOut();

} // Node
