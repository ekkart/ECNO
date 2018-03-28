/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.impl;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.ptnet.impl.PTNetImpl;
import org.pnml.tools.epnk.structuredpntypemodel.Linker;

import dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet;
import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECLO Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ECNONetImpl extends PTNetImpl implements ECNONet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECNONetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnonetsPackage.Literals.ECNO_NET;
	}


	/* *
	 * @ generated NOT
	 * /
	@Override
	public Arc createArc() {
		// TODO: since the general implementation of this method
		//       in PetriNetType does not take the packages of
		//       the super classes into account, the P/T Arc
		//       must be created here explicitly (this should
		//       eventually be changed in the PetriNetType).
		return PtnetFactory.eINSTANCE.createArc();
	}
	
	/* *
	 * @ generated NOT
	 * /
	@Override
	public Place createPlace() {
		// TODO: since the general implementation of this method
		//       in PetriNetType does not take the packages of
		//       the super classes into account, the P/T Place
		//       must be created here explicitly (this should
		//       eventually be changed in the PetriNetType).
		return PtnetFactory.eINSTANCE.createPlace();
	}
	*/

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (eki: no linker needed)
	 */
	public Linker getLinker() {
		return null;
	}

} //ECLONetImpl
