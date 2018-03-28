package ecno.bankingsystem.code.controllerconfig;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState;
import dk.dtu.compute.se.ecno.statespace.controller.configurator.StatespaceRecorderConfiguration;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import ecno.bankingsystem.code.gui.ATMGUI;
import ecno.bankingsystem.code.gui.AutomaticElementEventController;
import ecno.bankingsystem.code.gui.PersonGUI;
import emf.bankingsystem.AccountMngr;
import emf.bankingsystem.HW;
import emf.bankingsystem.NaturalPerson;
import emf.bankingsystem.Session;
import emf.bankingsystem.Setting;

/**
 * This is a controller configurator, which installs the GUI for the Banking application.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class BankingSystemConfigurator implements IControllerConfigurator, IController {

	private ExecutionEngine engine;
	private EventType timeout;
	
	private Set<AutomaticElementEventController> controllers;
	
	private StatespaceRecorderConfiguration statespaceRecorderConfig;
	
	@Override
	public void initializeControllers(ExecutionEngine engine,
			ControllerState state) {

		this.engine = engine;
		this.controllers = new HashSet<AutomaticElementEventController>();
		
		dk.dtu.imm.se.ecno.model.ecno.Package ecnoPackage = null;
		INamespace namespace = engine.getNamespace("http://bankingsystem");
		if (namespace instanceof dk.dtu.imm.se.ecno.model.ecno.Package) {
			ecnoPackage = (dk.dtu.imm.se.ecno.model.ecno.Package) namespace;
		}
		timeout = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("timeout")) {
				timeout = et;
				break;
			}
		}	
		
		this.statespaceRecorderConfig = new StatespaceRecorderConfiguration();
		
		if (state instanceof StateSpaceControllerState) {
			StateSpaceControllerState config = (StateSpaceControllerState) state;
			this.statespaceRecorderConfig = new StatespaceRecorderConfiguration();
			this.statespaceRecorderConfig.initializeControllers(engine, config);
			
			EObject object = config.getObject();
			if (object instanceof Setting) {
				Setting setting = (Setting) object;
				for (Element element: setting.getObjects()) {
					if (element instanceof NaturalPerson) {
						PersonGUI.createPersonGUI(engine, setting, (NaturalPerson) element);
					} else if (element instanceof HW) {
						ATMGUI.createATMGUI(engine, (HW) element);
						if (timeout != null) {
							AutomaticElementEventController controller = new AutomaticElementEventController(engine, element, timeout, 10000);
							controller.initialize();
							controllers.add(controller);
						}
					} else if (element instanceof AccountMngr && timeout != null) {
						AccountMngr accountMngr = (AccountMngr) element;
						for (Session session: accountMngr.getIdleSessions()) {
							AutomaticElementEventController controller = new AutomaticElementEventController(engine, session, timeout, 15000);
							controller.initialize();
							controllers.add(controller);
						}
						for (Session session: accountMngr.getSessions()) {
							AutomaticElementEventController controller = new AutomaticElementEventController(engine, session, timeout, 15000);
							controller.initialize();
							controllers.add(controller);
						}
					}
				}
			}
		}
		ECNOGUI.createECNOGUI(engine);
		engine.addController(this);
	}


	
	@Override
	public void addElement(Object element) {
		/*
		if (element instanceof Session) {
			AutomaticElementEventController controller = controllers.get(element);
			if (controller != null && timeout != null) {
				controllers.put((Session) element,
						new AutomaticElementEventController(engine, (Session) element, timeout, 10000));
			}
		}
		*/
	}

	@Override
	public void removeElement(Object element) {
		/*
		if (element instanceof Session) {
			AutomaticElementEventController controller = controllers.get(element);
			if (controller != null) {
				controller.dispose();
				controllers.remove(element);
			}
		}
		*/
	}

	@Override
	public void elementEncountered(Object element) {
		// we could also automatically install automatic controllers here.
	}

	@Override
	synchronized public void dispose() {
		/*
		try {
			resource.save(new HashMap<String,Object>());
		} catch (IOException e) {
			// Do nothing for now if file could not be saved.
		}
		*/
		
		for (AutomaticElementEventController controller : controllers) {
			controller.dispose();
		}
		controllers.clear();
		
		if (engine != null) {
			engine.removeController(this);
			engine = null;
		}
	}

}
