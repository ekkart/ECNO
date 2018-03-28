/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of a element, as defined by the Petri net.
 */
package ecno.bankingsystem.localbehaviour;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import emf.bankingsystem.BankingsystemPackage;
import dk.dtu.imm.se.ecno.model.adapter.EMFBehaviourAdaptor;
import dk.dtu.imm.se.ecno.model.runtime.SimpleEMFBehaviour;

public class BankingAutomataFactory extends EMFBehaviourAdaptor {

	public BankingAutomataFactory(ExecutionEngine engine) {
		super(engine);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getHW(), HW.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getATMController(), ATMController.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getNaturalPerson(), NaturalPerson.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getPhysicalBankCard(), PhysicalBankCard.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getBankGateway(), BankGateway.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getAccountMngr(), AccountMngr.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getAccount(), Account.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getBankCard(), BankCard.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getSession(), Session.class);		
		this.addElementBehaviour(BankingsystemPackage.eINSTANCE.getBankNote(), BankNote.class);		
		
		this.addPackage(BankingsystemPackage.eINSTANCE, SimpleEMFBehaviour.class);
	}

}