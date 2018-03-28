/**
 */
package dk.dtu.compute.se.emf.processalgebra.impl;

import org.eclipse.emf.ecore.EClass;

import dk.dtu.compute.se.emf.processalgebra.Choice;
import dk.dtu.compute.se.emf.processalgebra.ProcessInstance;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChoiceImpl extends CompositeImpl implements Choice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessalgebraPackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createInstance() {
		dk.dtu.compute.se.emf.processalgebra.ChoiceInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createChoiceInst();
		java.util.List<ProcessInstance> children = instance.getChild();
		for (dk.dtu.compute.se.emf.processalgebra.Process subprocess: this.getSubprocess()) {
			children.add(subprocess.createInstance());
		}
		return instance;
	}

} //ChoiceImpl
