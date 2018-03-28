/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.Composite#getSubprocess <em>Subprocess</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getComposite()
 * @model abstract="true"
 * @generated
 */
public interface Composite extends dk.dtu.compute.se.emf.processalgebra.Process {
	/**
	 * Returns the value of the '<em><b>Subprocess</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprocess</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprocess</em>' containment reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getComposite_Subprocess()
	 * @model containment="true"
	 * @generated
	 */
	EList<dk.dtu.compute.se.emf.processalgebra.Process> getSubprocess();

} // Composite
