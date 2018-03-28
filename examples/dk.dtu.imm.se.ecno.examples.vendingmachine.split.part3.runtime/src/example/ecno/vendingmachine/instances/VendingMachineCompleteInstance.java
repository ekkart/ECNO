/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. This class defines an ECNO Instance which can
 * be started via the main method (Run As -> Java Application).
 */
package example.ecno.vendingmachine.instances;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;

public class VendingMachineCompleteInstance {

    final private example.emf.vendingmachine.VendingmachineFactory factory1;
    final private example.emf.vendingmachinebrewers.VendingmachinebrewersFactory factory2;
    final private example.emf.vendingmachineoutput.VendingmachineoutputFactory factory3;

	public VendingMachineCompleteInstance() {
		factory1 = example.emf.vendingmachine.VendingmachineFactory.eINSTANCE;
		factory2 = example.emf.vendingmachinebrewers.VendingmachinebrewersFactory.eINSTANCE;
		factory3 = example.emf.vendingmachineoutput.VendingmachineoutputFactory.eINSTANCE;
	}

	private void createInstance(ExecutionEngine engine) {
		// Create the objects
        example.emf.vendingmachine.Panel o1 = factory1.createPanel();
        example.emf.vendingmachineoutput.Output o2 = factory3.createOutput();
        example.emf.vendingmachine.Coin o3 = factory1.createCoin();
        example.emf.vendingmachine.Coin o4 = factory1.createCoin();
        example.emf.vendingmachine.Coin o5 = factory1.createCoin();
        example.emf.vendingmachine.Slot o6 = factory1.createSlot();
        example.emf.vendingmachine.Safe o7 = factory1.createSafe();
        example.emf.vendingmachine.Control o8 = factory1.createControl();
        example.emf.vendingmachinebrewers.CoffeeBrewer o9 = factory2.createCoffeeBrewer();
        example.emf.vendingmachinebrewers.CoffeeBrewer o10 = factory2.createCoffeeBrewer();
        example.emf.vendingmachinebrewers.TeaBrewer o11 = factory2.createTeaBrewer();	

		// Set the (simple) attributes	
   
		// Create the single references
        o6.setSafe(o7);
        o9.setControl(o8);
        o10.setControl(o8);
        o11.setControl(o8);	

		// Create the multi references
        o1.getControl().add(o8);
        o2.getBrewer().add(o9);
        o2.getBrewer().add(o10);
        o2.getBrewer().add(o11);
        o3.getSlot().add(o6);
        o4.getSlot().add(o6);
        o5.getSlot().add(o6);
        o8.getSlot().add(o6);	
   		
		// Register the GUI objects with the controllers (objects 
		// not visible at a GUI will be added to the engine on the fly)
        engine.addElement(o1);
        engine.addElement(o2);
        engine.addElement(o3);
        engine.addElement(o4);
        engine.addElement(o5);
	}

    public static void main(String[] args) {
    	ExecutionEngine engine = ExecutionEngine.createNewInstance();
    	engine.addPackageAdapter(example.ecno.vendingmachine.coordination.VendingMachineModel.getModel(engine));
    	engine.addPackageAdapter(example.ecno.vendingmachine.brewer.coordination.VendingMachineModel.getModel(engine));
    	engine.addPackageAdapter(example.ecno.vendingmachine.output.coordination.VendingMachineOutputModel.getModel(engine));
    	if (!engine.resolveNamespaceImports()) {
    		System.err.println("Package imports could not be resolved");
    	}
    	new ECNOGUI(engine);
    	VendingMachineCompleteInstance instance = new VendingMachineCompleteInstance();
    	instance.createInstance(engine);
    }

}
