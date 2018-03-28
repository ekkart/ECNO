/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. This class defines ECNO Model and provides the
 * adapter to the ECNO EMF engine.
 */
package ecno.bankingsystem.model;

import org.eclipse.emf.common.util.EList;

import emf.bankingsystem.BankingsystemPackage;
import ecno.bankingsystem.localbehaviour.BankingAutomataFactory;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.EventExtension_Values;
import dk.dtu.imm.se.ecno.runtime.Event_Values;

import dk.dtu.imm.se.ecno.model.adapter.EMFPackageAdapter;
import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoFactory;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import dk.dtu.imm.se.ecno.model.ecno.SynchronisationType;

public class BankingSystemECNOModel extends EMFPackageAdapter {

	private FormalParameter formalparameter_enterPIN_pin;
	private FormalParameter formalparameter_createSession_card;
	private FormalParameter formalparameter_createSession_issuer;
	private FormalParameter formalparameter_createSession_account;
	private FormalParameter formalparameter_createSession_bcard;
	private FormalParameter formalparameter_exitSession_atm;
	private FormalParameter formalparameter_takeMoney_money;
	private FormalParameter formalparameter_presentMoney_amount;
	private FormalParameter formalparameter_retractMoney_amount;
	private FormalParameter formalparameter_withdraw_amount;
	private FormalParameter formalparameter_cancelWithdraw_amount;
	private FormalParameter formalparameter_balance_balance;
	private FormalParameter formalparameter_selectATM_atm;
	private FormalParameter formalparameter_userCardAction_card;
	private FormalParameter formalparameter_userMainAction_session;
	private FormalParameter formalparameter_systemAction_session;

	private EventType eventtype_insertCard;
	private EventType eventtype_enterPIN;
	private EventType eventtype_takeCard;
	private EventType eventtype_presentCard;
	private EventType eventtype_createSession;
	private EventType eventtype_keepCard;
	private EventType eventtype_exitSession;
	private EventType eventtype_exit;
	private EventType eventtype_timeout;
	private EventType eventtype_takeMoney;
	private EventType eventtype_presentMoney;
	private EventType eventtype_retractMoney;
	private EventType eventtype_withdraw;
	private EventType eventtype_cancelWithdraw;
	private EventType eventtype_balance;
	private EventType eventtype_selectATM;
	private EventType eventtype_userCardAction;
	private EventType eventtype_userMainAction;
	private EventType eventtype_userAuxAction;
	private EventType eventtype_ATMAction;
	private EventType eventtype_systemAction;


	private ElementType elementtype_NaturalPerson;
	private ElementType elementtype_PhysicalBankCard;
	private ElementType elementtype_HW;
	private ElementType elementtype_ATMController;
	private ElementType elementtype_BankGateway;
	private ElementType elementtype_SwiftNetwork;
	private ElementType elementtype_AccountMngr;
	private ElementType elementtype_Account;
	private ElementType elementtype_BankCard;
	private ElementType elementtype_Session;
	private ElementType elementtype_BankNote;

	private Reference referencetype_NaturalPerson_uses;
	private Reference referencetype_PhysicalBankCard_owner;
	private Reference referencetype_HW_controller;
	private Reference referencetype_HW_ready;
	private Reference referencetype_ATMController_gateway;
	private Reference referencetype_ATMController_hw;
	private Reference referencetype_BankGateway_accountMngrs;
	private Reference referencetype_BankGateway_swift;
	private Reference referencetype_SwiftNetwork_gateways;
	private Reference referencetype_AccountMngr_accounts;
	private Reference referencetype_AccountMngr_sessions;
	private Reference referencetype_Account_cards;
	private Reference referencetype_Session_owner;
	private Reference referencetype_Session_account;


	private BankingSystemECNOModel(ExecutionEngine engine) {
		super (new BankingAutomataFactory(engine));
		createModel();
	}

	protected void createModel() {
		EcnoFactory ecno_factory = EcnoFactory.eINSTANCE;
		BankingsystemPackage pack = BankingsystemPackage.eINSTANCE;

		getNamespace().setEPackage(pack);
		getNamespace().setUri("http://bankingsystem");

		formalparameter_enterPIN_pin = ecno_factory.createFormalParameter();
		formalparameter_enterPIN_pin.setName("pin");
		formalparameter_enterPIN_pin.setEType(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEIntegerObject());
		formalparameter_createSession_card = ecno_factory.createFormalParameter();
		formalparameter_createSession_card.setName("card");
		formalparameter_createSession_card.setEType(pack.getPhysicalBankCard());
		formalparameter_createSession_issuer = ecno_factory.createFormalParameter();
		formalparameter_createSession_issuer.setName("issuer");
		formalparameter_createSession_issuer.setEType(pack.getAccountMngr());
		formalparameter_createSession_account = ecno_factory.createFormalParameter();
		formalparameter_createSession_account.setName("account");
		formalparameter_createSession_account.setEType(pack.getAccount());
		formalparameter_createSession_bcard = ecno_factory.createFormalParameter();
		formalparameter_createSession_bcard.setName("bcard");
		formalparameter_createSession_bcard.setEType(pack.getBankCard());
		formalparameter_exitSession_atm = ecno_factory.createFormalParameter();
		formalparameter_exitSession_atm.setName("atm");
		formalparameter_exitSession_atm.setEType(pack.getATMController());
		formalparameter_takeMoney_money = ecno_factory.createFormalParameter();
		formalparameter_takeMoney_money.setName("money");
		formalparameter_takeMoney_money.setEType(pack.getBankNote());
		formalparameter_takeMoney_money.setCollective(true);
		formalparameter_presentMoney_amount = ecno_factory.createFormalParameter();
		formalparameter_presentMoney_amount.setName("amount");
		formalparameter_presentMoney_amount.setEType(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEIntegerObject());
		formalparameter_retractMoney_amount = ecno_factory.createFormalParameter();
		formalparameter_retractMoney_amount.setName("amount");
		formalparameter_retractMoney_amount.setEType(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEIntegerObject());
		formalparameter_withdraw_amount = ecno_factory.createFormalParameter();
		formalparameter_withdraw_amount.setName("amount");
		formalparameter_withdraw_amount.setEType(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEIntegerObject());
		formalparameter_cancelWithdraw_amount = ecno_factory.createFormalParameter();
		formalparameter_cancelWithdraw_amount.setName("amount");
		formalparameter_cancelWithdraw_amount.setEType(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEIntegerObject());
		formalparameter_balance_balance = ecno_factory.createFormalParameter();
		formalparameter_balance_balance.setName("balance");
		formalparameter_balance_balance.setEType(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEIntegerObject());
		formalparameter_selectATM_atm = ecno_factory.createFormalParameter();
		formalparameter_selectATM_atm.setName("atm");
		formalparameter_selectATM_atm.setEType(pack.getHW());
		formalparameter_userCardAction_card = ecno_factory.createFormalParameter();
		formalparameter_userCardAction_card.setName("card");
		formalparameter_userCardAction_card.setEType(pack.getPhysicalBankCard());
		formalparameter_userMainAction_session = ecno_factory.createFormalParameter();
		formalparameter_userMainAction_session.setName("session");
		formalparameter_userMainAction_session.setEType(pack.getSession());
		formalparameter_systemAction_session = ecno_factory.createFormalParameter();
		formalparameter_systemAction_session.setName("session");
		formalparameter_systemAction_session.setEType(pack.getSession());

		EList<FormalParameter> parameters;
		
		eventtype_insertCard = ecno_factory.createEventType();
		eventtype_insertCard.setName("insertCard");
		eventtype_insertCard.setGui(true);
		addEventType(eventtype_insertCard);

		eventtype_enterPIN = ecno_factory.createEventType();
		eventtype_enterPIN.setName("enterPIN");
		parameters = eventtype_enterPIN.getParameters();
		parameters.add(formalparameter_enterPIN_pin);
		addEventType(eventtype_enterPIN);

		eventtype_takeCard = ecno_factory.createEventType();
		eventtype_takeCard.setName("takeCard");
		addEventType(eventtype_takeCard);

		eventtype_presentCard = ecno_factory.createEventType();
		eventtype_presentCard.setName("presentCard");
		addEventType(eventtype_presentCard);

		eventtype_createSession = ecno_factory.createEventType();
		eventtype_createSession.setName("createSession");
		parameters = eventtype_createSession.getParameters();
		parameters.add(formalparameter_createSession_card);
		parameters.add(formalparameter_createSession_issuer);
		parameters.add(formalparameter_createSession_account);
		parameters.add(formalparameter_createSession_bcard);
		addEventType(eventtype_createSession);

		eventtype_keepCard = ecno_factory.createEventType();
		eventtype_keepCard.setName("keepCard");
		addEventType(eventtype_keepCard);

		eventtype_exitSession = ecno_factory.createEventType();
		eventtype_exitSession.setName("exitSession");
		parameters = eventtype_exitSession.getParameters();
		parameters.add(formalparameter_exitSession_atm);
		addEventType(eventtype_exitSession);

		eventtype_exit = ecno_factory.createEventType();
		eventtype_exit.setName("exit");
		addEventType(eventtype_exit);

		eventtype_timeout = ecno_factory.createEventType();
		eventtype_timeout.setName("timeout");
		eventtype_timeout.setGui(true);
		addEventType(eventtype_timeout);

		eventtype_takeMoney = ecno_factory.createEventType();
		eventtype_takeMoney.setName("takeMoney");
		eventtype_takeMoney.setGui(true);
		parameters = eventtype_takeMoney.getParameters();
		parameters.add(formalparameter_takeMoney_money);
		addEventType(eventtype_takeMoney);

		eventtype_presentMoney = ecno_factory.createEventType();
		eventtype_presentMoney.setName("presentMoney");
		parameters = eventtype_presentMoney.getParameters();
		parameters.add(formalparameter_presentMoney_amount);
		addEventType(eventtype_presentMoney);

		eventtype_retractMoney = ecno_factory.createEventType();
		eventtype_retractMoney.setName("retractMoney");
		parameters = eventtype_retractMoney.getParameters();
		parameters.add(formalparameter_retractMoney_amount);
		addEventType(eventtype_retractMoney);

		eventtype_withdraw = ecno_factory.createEventType();
		eventtype_withdraw.setName("withdraw");
		parameters = eventtype_withdraw.getParameters();
		parameters.add(formalparameter_withdraw_amount);
		addEventType(eventtype_withdraw);

		eventtype_cancelWithdraw = ecno_factory.createEventType();
		eventtype_cancelWithdraw.setName("cancelWithdraw");
		parameters = eventtype_cancelWithdraw.getParameters();
		parameters.add(formalparameter_cancelWithdraw_amount);
		addEventType(eventtype_cancelWithdraw);

		eventtype_balance = ecno_factory.createEventType();
		eventtype_balance.setName("balance");
		parameters = eventtype_balance.getParameters();
		parameters.add(formalparameter_balance_balance);
		addEventType(eventtype_balance);

		eventtype_selectATM = ecno_factory.createEventType();
		eventtype_selectATM.setName("selectATM");
		parameters = eventtype_selectATM.getParameters();
		parameters.add(formalparameter_selectATM_atm);
		addEventType(eventtype_selectATM);

		eventtype_userCardAction = ecno_factory.createEventType();
		eventtype_userCardAction.setName("userCardAction");
		eventtype_userCardAction.setGui(true);
		parameters = eventtype_userCardAction.getParameters();
		parameters.add(formalparameter_userCardAction_card);
		addEventType(eventtype_userCardAction);

		eventtype_userMainAction = ecno_factory.createEventType();
		eventtype_userMainAction.setName("userMainAction");
		eventtype_userMainAction.setGui(true);
		parameters = eventtype_userMainAction.getParameters();
		parameters.add(formalparameter_userMainAction_session);
		addEventType(eventtype_userMainAction);

		eventtype_userAuxAction = ecno_factory.createEventType();
		eventtype_userAuxAction.setName("userAuxAction");
		eventtype_userAuxAction.setGui(true);
		addEventType(eventtype_userAuxAction);

		eventtype_ATMAction = ecno_factory.createEventType();
		eventtype_ATMAction.setName("ATMAction");
		addEventType(eventtype_ATMAction);

		eventtype_systemAction = ecno_factory.createEventType();
		eventtype_systemAction.setName("systemAction");
		parameters = eventtype_systemAction.getParameters();
		parameters.add(formalparameter_systemAction_session);
		addEventType(eventtype_systemAction);

		eventtype_insertCard.setSuper(eventtype_userCardAction);
		eventtype_enterPIN.setSuper(eventtype_userAuxAction);
		eventtype_takeCard.setSuper(eventtype_userCardAction);
		eventtype_presentCard.setSuper(eventtype_ATMAction);
		eventtype_createSession.setSuper(eventtype_systemAction);
		eventtype_keepCard.setSuper(eventtype_ATMAction);
		eventtype_exitSession.setSuper(eventtype_systemAction);
		eventtype_exit.setSuper(eventtype_userAuxAction);
		eventtype_presentMoney.setSuper(eventtype_ATMAction);
		eventtype_retractMoney.setSuper(eventtype_ATMAction);
		eventtype_withdraw.setSuper(eventtype_userMainAction);
		eventtype_cancelWithdraw.setSuper(eventtype_systemAction);
		eventtype_balance.setSuper(eventtype_userMainAction);


		elementtype_NaturalPerson = ecno_factory.createElementType();
		elementtype_NaturalPerson.setEClass(pack.getNaturalPerson());
		elementtype_NaturalPerson.setGui(true);
		addElementType(elementtype_NaturalPerson);

		elementtype_PhysicalBankCard = ecno_factory.createElementType();
		elementtype_PhysicalBankCard.setEClass(pack.getPhysicalBankCard());
		elementtype_PhysicalBankCard.setGui(true);
		addElementType(elementtype_PhysicalBankCard);

		elementtype_HW = ecno_factory.createElementType();
		elementtype_HW.setEClass(pack.getHW());
		addElementType(elementtype_HW);

		elementtype_ATMController = ecno_factory.createElementType();
		elementtype_ATMController.setEClass(pack.getATMController());
		addElementType(elementtype_ATMController);

		elementtype_BankGateway = ecno_factory.createElementType();
		elementtype_BankGateway.setEClass(pack.getBankGateway());
		addElementType(elementtype_BankGateway);

		elementtype_SwiftNetwork = ecno_factory.createElementType();
		elementtype_SwiftNetwork.setEClass(pack.getSwiftNetwork());
		addElementType(elementtype_SwiftNetwork);

		elementtype_AccountMngr = ecno_factory.createElementType();
		elementtype_AccountMngr.setEClass(pack.getAccountMngr());
		addElementType(elementtype_AccountMngr);

		elementtype_Account = ecno_factory.createElementType();
		elementtype_Account.setEClass(pack.getAccount());
		addElementType(elementtype_Account);

		elementtype_BankCard = ecno_factory.createElementType();
		elementtype_BankCard.setEClass(pack.getBankCard());
		addElementType(elementtype_BankCard);

		elementtype_Session = ecno_factory.createElementType();
		elementtype_Session.setEClass(pack.getSession());
		elementtype_Session.setGui(true);
		addElementType(elementtype_Session);

		elementtype_BankNote = ecno_factory.createElementType();
		elementtype_BankNote.setEClass(pack.getBankNote());
		addElementType(elementtype_BankNote);



		EList<Reference> references;

		references = elementtype_NaturalPerson.getReferences();
		referencetype_NaturalPerson_uses = ecno_factory.createReference();
		referencetype_NaturalPerson_uses.setEReference(pack.getNaturalPerson_Uses());
		referencetype_NaturalPerson_uses.setTarget(elementtype_HW);
		references.add(referencetype_NaturalPerson_uses);

		references = elementtype_PhysicalBankCard.getReferences();
		referencetype_PhysicalBankCard_owner = ecno_factory.createReference();
		referencetype_PhysicalBankCard_owner.setEReference(pack.getPhysicalBankCard_Owner());
		referencetype_PhysicalBankCard_owner.setTarget(elementtype_NaturalPerson);
		references.add(referencetype_PhysicalBankCard_owner);

		references = elementtype_HW.getReferences();
		referencetype_HW_controller = ecno_factory.createReference();
		referencetype_HW_controller.setEReference(pack.getHW_Controller());
		referencetype_HW_controller.setTarget(elementtype_ATMController);
		references.add(referencetype_HW_controller);

		referencetype_HW_ready = ecno_factory.createReference();
		referencetype_HW_ready.setEReference(pack.getHW_Ready());
		referencetype_HW_ready.setTarget(elementtype_BankNote);
		references.add(referencetype_HW_ready);

		references = elementtype_ATMController.getReferences();
		referencetype_ATMController_gateway = ecno_factory.createReference();
		referencetype_ATMController_gateway.setEReference(pack.getATMController_Gateway());
		referencetype_ATMController_gateway.setTarget(elementtype_BankGateway);
		references.add(referencetype_ATMController_gateway);

		referencetype_ATMController_hw = ecno_factory.createReference();
		referencetype_ATMController_hw.setEReference(pack.getATMController_Hw());
		referencetype_ATMController_hw.setTarget(elementtype_HW);
		references.add(referencetype_ATMController_hw);

		references = elementtype_BankGateway.getReferences();
		referencetype_BankGateway_accountMngrs = ecno_factory.createReference();
		referencetype_BankGateway_accountMngrs.setEReference(pack.getBankGateway_AccountMngrs());
		referencetype_BankGateway_accountMngrs.setTarget(elementtype_AccountMngr);
		references.add(referencetype_BankGateway_accountMngrs);

		referencetype_BankGateway_swift = ecno_factory.createReference();
		referencetype_BankGateway_swift.setEReference(pack.getBankGateway_Swift());
		referencetype_BankGateway_swift.setTarget(elementtype_SwiftNetwork);
		references.add(referencetype_BankGateway_swift);

		references = elementtype_SwiftNetwork.getReferences();
		referencetype_SwiftNetwork_gateways = ecno_factory.createReference();
		referencetype_SwiftNetwork_gateways.setEReference(pack.getSwiftNetwork_Gateways());
		referencetype_SwiftNetwork_gateways.setTarget(elementtype_BankGateway);
		references.add(referencetype_SwiftNetwork_gateways);

		references = elementtype_AccountMngr.getReferences();
		referencetype_AccountMngr_accounts = ecno_factory.createReference();
		referencetype_AccountMngr_accounts.setEReference(pack.getAccountMngr_Accounts());
		referencetype_AccountMngr_accounts.setTarget(elementtype_Account);
		references.add(referencetype_AccountMngr_accounts);

		referencetype_AccountMngr_sessions = ecno_factory.createReference();
		referencetype_AccountMngr_sessions.setEReference(pack.getAccountMngr_Sessions());
		referencetype_AccountMngr_sessions.setTarget(elementtype_Session);
		references.add(referencetype_AccountMngr_sessions);

		references = elementtype_Account.getReferences();
		referencetype_Account_cards = ecno_factory.createReference();
		referencetype_Account_cards.setEReference(pack.getAccount_Cards());
		referencetype_Account_cards.setTarget(elementtype_BankCard);
		references.add(referencetype_Account_cards);

		references = elementtype_Session.getReferences();
		referencetype_Session_owner = ecno_factory.createReference();
		referencetype_Session_owner.setEReference(pack.getSession_Owner());
		referencetype_Session_owner.setTarget(elementtype_AccountMngr);
		references.add(referencetype_Session_owner);

		referencetype_Session_account = ecno_factory.createReference();
		referencetype_Session_account.setEReference(pack.getSession_Account());
		referencetype_Session_account.setTarget(elementtype_Account);
		references.add(referencetype_Session_account);


		Synchronisation synch;
		CoordinationSet cset;

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userAuxAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_NaturalPerson_uses);
		synch.setEventType(eventtype_userAuxAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_NaturalPerson.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userCardAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_NaturalPerson_uses);
		synch.setEventType(eventtype_userCardAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_NaturalPerson.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userMainAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_NaturalPerson_uses);
		synch.setEventType(eventtype_userMainAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_NaturalPerson.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_takeMoney);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_NaturalPerson_uses);
		synch.setEventType(eventtype_takeMoney);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_NaturalPerson.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_selectATM);
		elementtype_NaturalPerson.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_timeout);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_NaturalPerson_uses);
		synch.setEventType(eventtype_timeout);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_NaturalPerson.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_insertCard);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_PhysicalBankCard_owner);
		synch.setEventType(eventtype_insertCard);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_PhysicalBankCard.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userCardAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_HW_controller);
		synch.setEventType(eventtype_userCardAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_HW.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userAuxAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_HW_controller);
		synch.setEventType(eventtype_userAuxAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_HW.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_ATMAction);
		elementtype_HW.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_timeout);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_HW_controller);
		synch.setEventType(eventtype_timeout);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_HW.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userMainAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_HW_controller);
		synch.setEventType(eventtype_userMainAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_HW.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_takeMoney);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_HW_controller);
		synch.setEventType(eventtype_takeMoney);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_HW_ready);
		synch.setEventType(eventtype_takeMoney);
		synch.setType(SynchronisationType.ALL);
		cset.getSynchronisations().add(synch);
		elementtype_HW.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userCardAction);
		elementtype_ATMController.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userAuxAction);
		elementtype_ATMController.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_timeout);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_ATMController_hw);
		synch.setEventType(eventtype_timeout);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_ATMController.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_systemAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_ATMController_gateway);
		synch.setEventType(eventtype_systemAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_ATMController.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_ATMAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_ATMController_hw);
		synch.setEventType(eventtype_ATMAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_ATMController.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_takeMoney);
		elementtype_ATMController.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userMainAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_ATMController_gateway);
		synch.setEventType(eventtype_userMainAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_ATMController.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_systemAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_BankGateway_accountMngrs);
		synch.setEventType(eventtype_systemAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_BankGateway.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userMainAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_BankGateway_accountMngrs);
		synch.setEventType(eventtype_userMainAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_BankGateway.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_createSession);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_AccountMngr_accounts);
		synch.setEventType(eventtype_createSession);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_AccountMngr.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_systemAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_AccountMngr_sessions);
		synch.setEventType(eventtype_systemAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_AccountMngr.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userMainAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_AccountMngr_sessions);
		synch.setEventType(eventtype_userMainAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_AccountMngr.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_createSession);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_Account_cards);
		synch.setEventType(eventtype_createSession);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_Account.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userMainAction);
		elementtype_Account.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_cancelWithdraw);
		elementtype_Account.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_createSession);
		elementtype_BankCard.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_exitSession);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_Session_owner);
		synch.setEventType(eventtype_exitSession);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_Session.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_timeout);
		elementtype_Session.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_userMainAction);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_Session_account);
		synch.setEventType(eventtype_userMainAction);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_Session.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_cancelWithdraw);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_Session_account);
		synch.setEventType(eventtype_cancelWithdraw);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_Session.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_takeMoney);
		elementtype_BankNote.getCoordinationSets().add(cset);

	}

	public Class<? extends Event_Values> getEventValuesClass(IEventType type) {
		if (type.equals(eventtype_insertCard)) {
			return ecno.bankingsystem.events.UserCardAction.class;
		} else if (type.equals(eventtype_enterPIN)) {
			return ecno.bankingsystem.events.EnterPIN.class;
		} else if (type.equals(eventtype_takeCard)) {
			return ecno.bankingsystem.events.UserCardAction.class;
		} else if (type.equals(eventtype_createSession)) {
			return ecno.bankingsystem.events.CreateSession.class;
		} else if (type.equals(eventtype_exitSession)) {
			return ecno.bankingsystem.events.ExitSession.class;
		} else if (type.equals(eventtype_takeMoney)) {
			return ecno.bankingsystem.events.TakeMoney.class;
		} else if (type.equals(eventtype_presentMoney)) {
			return ecno.bankingsystem.events.PresentMoney.class;
		} else if (type.equals(eventtype_retractMoney)) {
			return ecno.bankingsystem.events.RetractMoney.class;
		} else if (type.equals(eventtype_withdraw)) {
			return ecno.bankingsystem.events.Withdraw.class;
		} else if (type.equals(eventtype_cancelWithdraw)) {
			return ecno.bankingsystem.events.CancelWithdraw.class;
		} else if (type.equals(eventtype_balance)) {
			return ecno.bankingsystem.events.Balance.class;
		} else if (type.equals(eventtype_selectATM)) {
			return ecno.bankingsystem.events.SelectATM.class;
		} else if (type.equals(eventtype_userCardAction)) {
			return ecno.bankingsystem.events.UserCardAction.class;
		} else if (type.equals(eventtype_userMainAction)) {
			return ecno.bankingsystem.events.UserMainAction.class;
		} else if (type.equals(eventtype_systemAction)) {
			return ecno.bankingsystem.events.SystemAction.class;
		} else {
			return null;
		}
	}

	public Class<? extends EventExtension_Values> getEventValuesClass(IEventTypeExtension eventTypeExtension) {
		{
			return null;
		}
	}

	public static BankingSystemECNOModel getModel(ExecutionEngine engine) {
		return new BankingSystemECNOModel(engine);
	}

}
