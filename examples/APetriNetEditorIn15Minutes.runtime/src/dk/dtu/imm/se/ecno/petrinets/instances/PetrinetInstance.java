/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. This class defines an ECNO Instance which can
 * be started via the main method (Run As -> Java Application).
 */
package dk.dtu.imm.se.ecno.petrinets.instances;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;

public class PetrinetInstance {

    final private PetriNets.PetriNetsFactory factory1;

	public PetrinetInstance() {
		factory1 = PetriNets.PetriNetsFactory.eINSTANCE;
	}

	private void createInstance(ExecutionEngine engine) {
		// Create the objects
        PetriNets.Place o1 = factory1.createPlace();
        PetriNets.Transition o2 = factory1.createTransition();
        PetriNets.Place o3 = factory1.createPlace();
        PetriNets.Token o4 = factory1.createToken();
        PetriNets.Transition o5 = factory1.createTransition();
        PetriNets.Arc o6 = factory1.createArc();
        PetriNets.Arc o7 = factory1.createArc();
        PetriNets.Arc o8 = factory1.createArc();
        PetriNets.Arc o9 = factory1.createArc();
        PetriNets.Transition o10 = factory1.createTransition();
        PetriNets.Arc o11 = factory1.createArc();
        PetriNets.Transition o12 = factory1.createTransition();
        PetriNets.Arc o13 = factory1.createArc();	

		// Set the (simple) attributes
        o1.setName("p1");
        o1.setCapacity(0);
        o2.setName("t1");
        o3.setName("p2");
        o3.setCapacity(2);
        o5.setName("t2");
        o10.setName("t3");
        o12.setName("t4");	
   
		// Create the single references
        o6.setSource(o1);
        o6.setTarget(o2);
        o7.setSource(o2);
        o7.setTarget(o3);
        o8.setSource(o3);
        o8.setTarget(o5);
        o9.setSource(o5);
        o9.setTarget(o1);
        o11.setSource(o10);
        o11.setTarget(o3);
        o13.setSource(o3);
        o13.setTarget(o12);	

		// Create the multi references
        o3.getToken().add(o4);	
   		
		// Register the GUI objects with the controllers (objects 
		// not visible at a GUI will be added to the engine on the fly)
        engine.addElement(o2);
        engine.addElement(o5);
        engine.addElement(o10);
        engine.addElement(o12);
	}

    public static void main(String[] args) {
    	ExecutionEngine engine = ExecutionEngine.createNewInstance();
    	engine.addPackageAdapter(dk.dtu.imm.se.ecno.example.petrinets.coordination.PetrinetsModel.getModel(engine));
    	if (!engine.resolveNamespaceImports()) {
    		System.err.println("Package imports could not be resolved");
    	}
    	new ECNOGUI(engine);
    	PetrinetInstance instance = new PetrinetInstance();
    	instance.createInstance(engine);
    }

}
