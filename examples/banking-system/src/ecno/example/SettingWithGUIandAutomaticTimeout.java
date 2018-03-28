package ecno.example;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import ecno.bankingsystem.code.gui.ATMGUI;
import ecno.bankingsystem.code.gui.AutomaticElementEventController;
import ecno.bankingsystem.code.gui.PersonGUI;
import emf.bankingsystem.AccountMngr;
import emf.bankingsystem.HW;
import emf.bankingsystem.NaturalPerson;
import emf.bankingsystem.Session;

public class SettingWithGUIandAutomaticTimeout {

    @SuppressWarnings("serial")
	public static void main(String[] args) {
    	final ExecutionEngine engine = ExecutionEngine.createNewInstance();
    	engine.addPackageAdapter(ecno.bankingsystem.model.BankingSystemECNOModel.getModel(engine));
    	if (!engine.resolveNamespaceImports()) {
    		System.err.println("Package imports could not be resolved");
    	}
    	new ECNOGUI(engine) {
    		private boolean disposing = false;
    		
			@Override
			public void dispose() {
                if (! disposing) {
                	disposing = true;
                	super.dispose();
                	engine.exit();
                }
			}
    		
    	};
    	Setting instance = new Setting();
    	EObject container = instance.createInstance(engine);
    	emf.bankingsystem.Setting setting = null;
    	if (container instanceof emf.bankingsystem.Setting) {
    		setting = (emf.bankingsystem.Setting) container;
    	} else {
    		engine.exit();
    		return;
    	}
    			
		dk.dtu.imm.se.ecno.model.ecno.Package ecnoPackage = null;
		INamespace namespace = engine.getNamespace("http://bankingsystem");
		if (namespace instanceof dk.dtu.imm.se.ecno.model.ecno.Package) {
			ecnoPackage = (dk.dtu.imm.se.ecno.model.ecno.Package) namespace;
		}
		EventType timeout = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("timeout")) {
				timeout = et;
				break;
			}
		}	
		
		for (Element element: setting.getObjects()) {
			if (element instanceof NaturalPerson) {
				new PersonGUI(engine, setting, (NaturalPerson) element);
			} else if (element instanceof HW) {
				new ATMGUI(engine, (HW) element);
				if (timeout != null) {
					AutomaticElementEventController controller = 
							new AutomaticElementEventController(engine, element, timeout, 10000);
					controller.initialize();
				}
			} else if (element instanceof AccountMngr && timeout != null) {
				AccountMngr accountMngr = (AccountMngr) element;
				for (Session session: accountMngr.getIdleSessions()) {
					AutomaticElementEventController controller =
							new AutomaticElementEventController(engine, session, timeout, 15000);
					controller.initialize();
				}
				for (Session session: accountMngr.getSessions()) {
					AutomaticElementEventController controller =
							new AutomaticElementEventController(engine, session, timeout, 15000);
					controller.initialize();
				}
			}
		}
    }
}
