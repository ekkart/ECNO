package dk.dtu.imm.se.ecno.pn.example.vendingmachine;

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;
import dk.dtu.imm.se.ecno.pn.runtime.Element;
import dk.dtu.imm.se.ecno.pn.runtime.ElementAdapter;

public class VendingMachineInstance  {
	
	private List<Element> elements;
	
	private VendingMachineInstance(ExecutionEngine engine) {
		createInstance(engine);
	}

    private void createInstance(ExecutionEngine engine) {
    	VendingMachineModel model = VendingMachineModel.getVendingMachineModel(); 
 
    	Element coin1 = model.getElementType_Coin().createInstance(engine);
    	Element coin2 = model.getElementType_Coin().createInstance(engine);
    	Element coin3 = model.getElementType_Coin().createInstance(engine);
    	
    	Element slot = model.getElementType_Slot().createInstance(engine);
    	Element safe = model.getElementType_Safe().createInstance(engine);
    	Element panel = model.getElementType_Panel().createInstance(engine);
    	Element control = model.getElementType_Control().createInstance(engine);
    	Element coffee1 = model.getElementType_CoffeeBrewer().createInstance(engine);
    	Element coffee2 = model.getElementType_CoffeeBrewer().createInstance(engine);
    	Element tea1 = model.getElementType_TeaBrewer().createInstance(engine);
    	Element output = model.getElementType_Output().createInstance(engine);
    	
    	coin1.addLink(model.getReference_coin_slot(), slot);
    	coin2.addLink(model.getReference_coin_slot(), slot);
    	coin3.addLink(model.getReference_coin_slot(), slot);
    	
    	slot.addLink(model.getReference_slot_safe(), safe);
    	
    	panel.addLink(model.getReference_panel_control(), control);
    	
    	control.addLink(model.getReference_control_slot(), slot);
    	control.addLink(model.getReference_control_brewer(), coffee1);
    	control.addLink(model.getReference_control_brewer(), coffee2);
    	control.addLink(model.getReference_control_brewer(), tea1);
    	
    	output.addLink(model.getReference_output_brewer(), coffee1);
    	output.addLink(model.getReference_output_brewer(), coffee2);
        output.addLink(model.getReference_output_brewer(), tea1);
        
        elements = new ArrayList<Element>();
        // elements.add(slot);
        // elements.add(safe);
        elements.add(panel);
        // elements.add(control);
        elements.add(output);
        elements.add(coin1);
        elements.add(coin2);
        elements.add(coin3);
    }
    
	public List<Element> getElements() {
		return elements;
	}

    public static void main(String[] args) {
    	ExecutionEngine engine = ExecutionEngine.createNewInstance();
    	engine.addPackageAdapter(new ElementAdapter(engine, VendingMachineModel.getVendingMachineModel()));
    	engine.resolveNamespaceImports();
    	new ECNOGUI(engine);
    	VendingMachineInstance instance = new VendingMachineInstance(engine);
    	
    	for (Element element: instance.getElements()) {
    		engine.addElement(element);
    	}
    }
    
}
