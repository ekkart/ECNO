package dk.dtu.imm.se.ecno.pn.example.vendingmachine;

import dk.dtu.imm.se.ecno.core.SynchronisationType;
import dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Eventinsert_Values;
import dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Eventpass_Values;
import dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Eventreturn__Values;
import dk.dtu.imm.se.ecno.pn.model.CoordinationReference;
import dk.dtu.imm.se.ecno.pn.model.ElementType;
import dk.dtu.imm.se.ecno.pn.model.EventType;
import dk.dtu.imm.se.ecno.pn.model.FormalParameter;
import dk.dtu.imm.se.ecno.pn.model.Package;
import dk.dtu.imm.se.ecno.pn.model.Reference;

public class VendingMachineModel extends Package {
	
	private static VendingMachineModel vendingMachineModel;
	
	private FormalParameter formalparameter_insert_coin;
	private FormalParameter formalparameter_insert_slot;
	private FormalParameter formalparameter_return_slot;
	private FormalParameter formalparameter_pass_coin;
	private FormalParameter formalparameter_pass_slot;

	private EventType eventtype_insert;
	private EventType eventtype_cancel;
	private EventType eventtype_reset;
	private EventType eventtype_return_;
	private EventType eventtype_pass;
	private EventType eventtype_coffee;
	private EventType eventtype_tea;
	private EventType eventtype_cup_in;
	private EventType eventtype_cup_out;
	
	private ElementType elementtype_coin;
	private ElementType elementtype_safe;
	private ElementType elementtype_slot;
	private ElementType elementtype_panel;
	private ElementType elementtype_control;
	private ElementType elementtype_brewer;
	private ElementType elementtype_coffeeBrewer;
	private ElementType elementtype_teaBrewer;
	private ElementType elementtype_output;
	
	private Reference referencetype_coin_slot;
	private Reference referencetype_slot_coin;
	private Reference referencetype_slot_safe;
	private Reference referencetype_control_slot;
	private Reference referencetype_control_brewer;
	private Reference referencetype_panel_control;
	private Reference referencetype_output_brewer;
	
	private VendingMachineModel() {
		super(null, "VendingMachineModel");
		vendingMachineModel = this;
		createModel();
	}

	public FormalParameter getFormalParameter_Insert_Coin() {
		return formalparameter_insert_coin;
	}
	
	public FormalParameter getFormalParameter_Insert_Slot() {
		return formalparameter_insert_slot;
	}
	
	public FormalParameter getFormalParameter_Return_Slot() {
		return formalparameter_return_slot;
	}
	
	public FormalParameter getFormalParameter_Pass_Coin() {
		return formalparameter_pass_coin;
	}
	
	public FormalParameter getFormalParameter_Pass_Slot() {
		return formalparameter_pass_slot;
	}
	
	public EventType getEventType_Insert() {
		return eventtype_insert;
	}
	
	public EventType getEventType_Cancel() {
		return eventtype_cancel;
	}
	
	public EventType getEventType_Reset() {
		return eventtype_reset;
	}
	
	public EventType getEventType_Return_() {
		return eventtype_return_;
	}
	
	public EventType getEventType_Pass() {
		return eventtype_pass;
	}
	
	public EventType getEventType_Coffee() {
		return eventtype_coffee;
	}
	
	public EventType getEventType_Tea() {
		return eventtype_tea;
	}
	
	public EventType getEventType_Cup_in() {
		return eventtype_cup_in;
	}
	
	public EventType getEventType_Cup_out() {
		return eventtype_cup_out;
	}
	
	public ElementType getElementType_Coin() {
		return elementtype_coin;
	}
	
	public ElementType getElementType_Safe() {
		return elementtype_safe;
	}
	
	public ElementType getElementType_Slot() {
		return elementtype_slot;
	}

	public ElementType getElementType_Panel() {
		return elementtype_panel;
	}
	
	public ElementType getElementType_Control() {
		return elementtype_control;
	}

	public ElementType getElementType_Brewer() {
		return elementtype_brewer;
	}
	
	public ElementType getElementType_CoffeeBrewer() {
		return elementtype_coffeeBrewer;
	}
	
	public ElementType getElementType_TeaBrewer() {
		return elementtype_teaBrewer;
	}
	
	public ElementType getElementType_Output() {
		return elementtype_output;
	}
	
	public Reference getReference_coin_slot() {
		return referencetype_coin_slot;
	}
	
	public Reference getReference_slot_coin() {
		return referencetype_slot_coin;
	}
	
	public Reference getReference_slot_safe() {
		return referencetype_slot_safe;
	}

	public Reference getReference_control_slot() {
		return referencetype_control_slot;
	}
	
	public Reference getReference_control_brewer() {
		return referencetype_control_brewer;
	}
	
	public Reference getReference_panel_control() {
		return referencetype_panel_control;
	}
	
	public Reference getReference_output_brewer() {
		return referencetype_output_brewer;
	}

    private void createModel() {
    	formalparameter_insert_coin = new FormalParameter("coin", Coin.class);
    	formalparameter_insert_slot = new FormalParameter("slot", Slot.class);
    	formalparameter_return_slot = new FormalParameter("slot", Slot.class);
    	formalparameter_pass_coin = new FormalParameter("coin", Coin.class);
    	formalparameter_pass_slot = new FormalParameter("slot", Slot.class);

    	eventtype_insert = new EventType(vendingMachineModel,"insert", 
    			new FormalParameter[]{formalparameter_insert_coin, formalparameter_insert_slot},
    			Eventinsert_Values.class);
    	eventtype_cancel = new EventType(vendingMachineModel,"cancel");
    	eventtype_reset = new EventType(vendingMachineModel,"reset");
    	eventtype_return_ = new EventType(vendingMachineModel,"return_",
    			new FormalParameter[]{formalparameter_return_slot},
    			Eventreturn__Values.class);
    	eventtype_pass = new EventType(vendingMachineModel,"pass",
    			new FormalParameter[]{formalparameter_pass_coin, formalparameter_pass_slot},
    			Eventpass_Values.class);
    	eventtype_coffee = new EventType(vendingMachineModel,"coffee");
    	eventtype_tea = new EventType(vendingMachineModel,"tea");
    	eventtype_cup_in = new EventType(vendingMachineModel,"cup_in");
    	eventtype_cup_out = new EventType(vendingMachineModel,"cup_out");

    	elementtype_coin = new ElementType(vendingMachineModel,"Coin", Coin.class, dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Coin.class);
    	elementtype_safe = new ElementType(vendingMachineModel,"Safe");
        elementtype_slot = new ElementType(vendingMachineModel,"Slot", Slot.class, dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Slot.class);
    	elementtype_panel= new ElementType(vendingMachineModel,"Panel");
    	elementtype_control= new ElementType(vendingMachineModel,"Control", Control.class, dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Control.class);
    	elementtype_brewer = new ElementType(vendingMachineModel,"Brewer");
    	elementtype_coffeeBrewer = new ElementType(vendingMachineModel,"CoffeeBrewer", elementtype_brewer, Coffee.class, dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Coffee.class);
    	elementtype_teaBrewer = new ElementType(vendingMachineModel,"TeaBrewer", elementtype_brewer, Tea.class, dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Tea.class);
    	elementtype_output = new ElementType(vendingMachineModel,"Output", Output.class, dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours.Output.class);

        referencetype_coin_slot =
        	new Reference(elementtype_coin, "slot", elementtype_slot);
  
        referencetype_slot_coin =
        	new Reference(elementtype_slot, "coin", elementtype_coin);
        referencetype_slot_safe =
        	new Reference(elementtype_slot, "safe", elementtype_safe);

        referencetype_control_slot =
        	new Reference(elementtype_control, "slot", elementtype_slot);
        referencetype_control_brewer =
        	new Reference(elementtype_control, "brewer", elementtype_brewer);

        referencetype_panel_control =
        	new Reference(elementtype_panel, "control", elementtype_control);
        
        referencetype_output_brewer = 
        	new Reference(elementtype_output, "brewer", elementtype_brewer);


        // setting the coordinations (all except the last two would be the default)

       	elementtype_coin.addEventTypeCoordinationSet(eventtype_insert,
       			new CoordinationReference[] {
       			new CoordinationReference(referencetype_coin_slot, eventtype_insert, SynchronisationType.ONE)});
       	elementtype_coin.addEventTypeCoordinationSet(eventtype_pass, new CoordinationReference[]{});
       	elementtype_coin.addEventTypeCoordinationSet(eventtype_return_, new CoordinationReference[]{});
    	elementtype_coin.addGUIEventType(eventtype_insert);
    	
    	elementtype_slot.addEventTypeCoordinationSet(eventtype_return_,  
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_slot_coin, eventtype_return_, SynchronisationType.ALL)});
    	elementtype_slot.addEventTypeCoordinationSet(eventtype_pass,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_slot_coin, eventtype_pass, SynchronisationType.ONE),
    			new CoordinationReference(referencetype_slot_safe, eventtype_pass, SynchronisationType.ONE)});
    	elementtype_slot.addEventTypeCoordinationSet(eventtype_insert, new CoordinationReference[]{});
    	elementtype_slot.addEventTypeCoordinationSet(eventtype_reset, new CoordinationReference[]{});
    	
    	elementtype_control.addEventTypeCoordinationSet(eventtype_reset,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_control_slot, eventtype_reset, SynchronisationType.ALL),
    			new CoordinationReference(referencetype_control_brewer, eventtype_reset, SynchronisationType.ALL)});
    	elementtype_control.addEventTypeCoordinationSet(eventtype_pass,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_control_slot, eventtype_pass, SynchronisationType.ONE)});  
    	elementtype_control.addEventTypeCoordinationSet(eventtype_coffee,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_control_brewer, eventtype_coffee, SynchronisationType.ONE)});
    	elementtype_control.addEventTypeCoordinationSet(eventtype_tea,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_control_brewer, eventtype_tea, SynchronisationType.ONE)});
    	elementtype_control.addEventTypeCoordinationSet(eventtype_cancel, new CoordinationReference[]{});
    	
    	elementtype_panel.addEventTypeCoordinationSet(eventtype_coffee,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_panel_control, eventtype_coffee, SynchronisationType.ONE)});
    	elementtype_panel.addEventTypeCoordinationSet(eventtype_tea,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_panel_control, eventtype_tea, SynchronisationType.ONE)});
    	elementtype_panel.addEventTypeCoordinationSet(eventtype_cancel, 
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_panel_control, eventtype_cancel, SynchronisationType.ALL)});
    	elementtype_panel.addGUIEventType(eventtype_coffee);
    	elementtype_panel.addGUIEventType(eventtype_tea);
    	elementtype_panel.addGUIEventType(eventtype_cancel);
    	
    	// the two non-default coordinations (and alternative between different coordination 
    	// references for the same event type)
    	elementtype_output.addEventTypeCoordinationSet(eventtype_cup_in,
    			new CoordinationReference[] {
    			new CoordinationReference(referencetype_output_brewer, eventtype_cup_in, SynchronisationType.ONE)});
    	
    	// the remove button is just local; therefore, this is an empty coordination reference (since this
        // this is the default, we do not need to state that.
    	elementtype_output.addEventTypeCoordinationSet(eventtype_cup_out, new CoordinationReference[] {});
    	elementtype_output.addGUIEventType(eventtype_cup_in);
    	elementtype_output.addGUIEventType(eventtype_cup_out);
    	
    	elementtype_safe.addEventTypeCoordinationSet(eventtype_pass, new CoordinationReference[] {});
    	
    	elementtype_brewer.addEventTypeCoordinationSet(eventtype_reset, new CoordinationReference[] {});
    	elementtype_brewer.addEventTypeCoordinationSet(eventtype_coffee, new CoordinationReference[] {});
    	elementtype_brewer.addEventTypeCoordinationSet(eventtype_cup_in, new CoordinationReference[] {});
    	elementtype_brewer.addEventTypeCoordinationSet(eventtype_tea, new CoordinationReference[] {});
    	
    	/*
    	elementtype_coffeeBrewer.addEventTypeCoordinationSet(eventtype_reset, new CoordinationReference[] {});
    	elementtype_coffeeBrewer.addEventTypeCoordinationSet(eventtype_coffee, new CoordinationReference[] {});
    	elementtype_coffeeBrewer.addEventTypeCoordinationSet(eventtype_cup_in, new CoordinationReference[] {});
    	
    	elementtype_teaBrewer.addEventTypeCoordinationSet(eventtype_reset, new CoordinationReference[] {});
    	elementtype_teaBrewer.addEventTypeCoordinationSet(eventtype_tea, new CoordinationReference[] {});
    	elementtype_teaBrewer.addEventTypeCoordinationSet(eventtype_cup_in, new CoordinationReference[] {});
    	*/

    }
    
	public static VendingMachineModel getVendingMachineModel() {
		if (vendingMachineModel  == null) {
			new VendingMachineModel();
		}
		return vendingMachineModel ;
	}

}
