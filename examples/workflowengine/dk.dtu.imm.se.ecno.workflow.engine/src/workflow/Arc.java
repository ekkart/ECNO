/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Arc#getSourcePlace <em>Source Place</em>}</li>
 *   <li>{@link workflow.Arc#getTargetPlace <em>Target Place</em>}</li>
 *   <li>{@link workflow.Arc#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Arc#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link workflow.Arc#getTargetTransition <em>Target Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Place#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Place</em>' reference.
	 * @see #setSourcePlace(Place)
	 * @see workflow.WorkflowPackage#getArc_SourcePlace()
	 * @see workflow.Place#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Place getSourcePlace();

	/**
	 * Sets the value of the '{@link workflow.Arc#getSourcePlace <em>Source Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Place</em>' reference.
	 * @see #getSourcePlace()
	 * @generated
	 */
	void setSourcePlace(Place value);

	/**
	 * Returns the value of the '<em><b>Target Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Place#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Place</em>' reference.
	 * @see #setTargetPlace(Place)
	 * @see workflow.WorkflowPackage#getArc_TargetPlace()
	 * @see workflow.Place#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Place getTargetPlace();

	/**
	 * Sets the value of the '{@link workflow.Arc#getTargetPlace <em>Target Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Place</em>' reference.
	 * @see #getTargetPlace()
	 * @generated
	 */
	void setTargetPlace(Place value);

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
	 * @see workflow.WorkflowPackage#getArc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Arc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Transition#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Transition</em>' reference.
	 * @see #setSourceTransition(Transition)
	 * @see workflow.WorkflowPackage#getArc_SourceTransition()
	 * @see workflow.Transition#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Transition getSourceTransition();

	/**
	 * Sets the value of the '{@link workflow.Arc#getSourceTransition <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Transition</em>' reference.
	 * @see #getSourceTransition()
	 * @generated
	 */
	void setSourceTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Target Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Transition#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Transition</em>' reference.
	 * @see #setTargetTransition(Transition)
	 * @see workflow.WorkflowPackage#getArc_TargetTransition()
	 * @see workflow.Transition#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Transition getTargetTransition();

	/**
	 * Sets the value of the '{@link workflow.Arc#getTargetTransition <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Transition</em>' reference.
	 * @see #getTargetTransition()
	 * @generated
	 */
	void setTargetTransition(Transition value);

} // Arc
