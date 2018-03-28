/**
 */
package dk.dtu.compute.se.emf.processalgebra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Composite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='dk.dtu.compute.se.emf.processalgebra.ParallelInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createParallelInst();\r\njava.util.List<ProcessInstance> children = instance.getChild();\r\nfor (dk.dtu.compute.se.emf.processalgebra.Process subprocess: this.getSubprocess()) {\r\n\tchildren.add(subprocess.createInstance());\r\n}\r\nreturn instance;'"
	 * @generated
	 */
	ProcessInstance createInstance();
} // Parallel
