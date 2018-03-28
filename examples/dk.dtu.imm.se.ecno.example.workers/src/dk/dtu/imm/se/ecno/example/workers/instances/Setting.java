/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. This class defines an ECNO Instance which can
 * be started via the main method (Run As -> Java Application).
 */
package dk.dtu.imm.se.ecno.example.workers.instances;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;

public class Setting {

    final private dk.dtu.imm.se.emf.example.workers.WorkersFactory factory1;

	public Setting() {
		factory1 = dk.dtu.imm.se.emf.example.workers.WorkersFactory.eINSTANCE;
	}

	private void createInstance(ExecutionEngine engine) {
		// Create the objects
        dk.dtu.imm.se.emf.example.workers.Car o1 = factory1.createCar();
        dk.dtu.imm.se.emf.example.workers.Car o2 = factory1.createCar();
        dk.dtu.imm.se.emf.example.workers.Worker o3 = factory1.createWorker();
        dk.dtu.imm.se.emf.example.workers.Worker o4 = factory1.createWorker();
        dk.dtu.imm.se.emf.example.workers.Worker o5 = factory1.createWorker();
        dk.dtu.imm.se.emf.example.workers.Worker o6 = factory1.createWorker();
        dk.dtu.imm.se.emf.example.workers.Job o7 = factory1.createJob();
        dk.dtu.imm.se.emf.example.workers.Job o8 = factory1.createJob();
        dk.dtu.imm.se.emf.example.workers.Job o9 = factory1.createJob();
        dk.dtu.imm.se.emf.example.workers.Job o10 = factory1.createJob();	

		// Set the (simple) attributes
        o1.setName("VW_ali_bert");
        o2.setName("BMW_cleo_dan");
        o3.setName("ali");
        o4.setName("bert");
        o5.setName("cleo");
        o6.setName("dan");
        o7.setName("(ali, bert)");
        o8.setName("(ali, cleo, dan)");
        o9.setName("(dan)");
        o10.setName("(ali, bert, cleo, dan)");	
   
		// Create the single references
        o3.setCar(o1);
        o4.setCar(o1);
        o5.setCar(o2);
        o6.setCar(o2);	

		// Create the multi references
        o3.getAssigned().add(o7);
        o3.getAssigned().add(o8);
        o3.getAssigned().add(o10);
        o4.getAssigned().add(o7);
        o4.getAssigned().add(o10);
        o5.getAssigned().add(o8);
        o5.getAssigned().add(o10);
        o6.getAssigned().add(o8);
        o6.getAssigned().add(o9);
        o6.getAssigned().add(o10);	
   		
		// Register the GUI objects with the controllers (objects 
		// not visible at a GUI will be added to the engine on the fly)
        engine.addElement(o1);
        engine.addElement(o2);
        engine.addElement(o3);
        engine.addElement(o4);
        engine.addElement(o5);
        engine.addElement(o6);
        engine.addElement(o7);
        engine.addElement(o8);
        engine.addElement(o9);
        engine.addElement(o10);
	}

    public static void main(String[] args) {
    	ExecutionEngine engine = ExecutionEngine.createNewInstance();
    	engine.addPackageAdapter(dk.dtu.imm.se.ecno.example.workers.coordination.WorkersModel.getModel(engine));
    	if (!engine.resolveNamespaceImports()) {
    		System.err.println("Package imports could not be resolved");
    	}
    	new ECNOGUI(engine);
    	Setting instance = new Setting();
    	instance.createInstance(engine);
    }

}