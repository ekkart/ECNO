/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of a element, as defined by the Petri net.
 */
package dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours;

import dk.dtu.imm.se.ecno.runtime.ParentAction;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import dk.dtu.imm.se.ecno.pn.model.ElementType;
import dk.dtu.imm.se.ecno.pn.runtime.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.pn.runtime.Element;
import dk.dtu.imm.se.ecno.pn.runtime.PetriNetChoice;

import dk.dtu.imm.se.ecno.pn.model.Reference;
import dk.dtu.imm.se.ecno.pn.example.vendingmachine.VendingMachineModel;

public class Slot extends AbstractPetrinetBehaviour {

final Reference slot_coin_ref = VendingMachineModel.getVendingMachineModel().getReference_slot_coin();  

	public Slot(ExecutionEngine engine, ElementType type, Element self) {
		super(engine, new int[]{}, new String[]{"t13", "t14", "t15"}, type, self);
	}

	@Override
	public boolean enabled(int t) {
		switch (t) {
		case 0:
			return true;
                    
		case 1:
			return true;
                    
		case 2:
			return true;
                    
		default:
			return false;	
		}
	}

	@Override
	public boolean dropParentChoice(int t) {
		switch (t) {
		case 0:
			return false;                    
		case 1:
			return false;                    
		case 2:
			return false;                    
		default:
			return false;	
		}
	}

	@Override
	public void fireImpl(int t) {
		if (! enabled(t))
			return;
		
		switch (t) {
		case 0:		
			break;
			
		case 1:		
			break;
			
		case 2:		
			break;
						
		}
	}
	
	@Override
	public boolean doesAssignParam(int transition, int event, int param) {
		switch (transition) {
		case 0:
			switch (event) {
			case 0:
				switch (param) {
				case 0: return false;			
				case 1: return true;			    
                default: return false;
                }
			default: return false;
			}
		case 1:
			switch (event) {
			case 0:
				switch (param) {
				case 0: return false;			
				case 1: return true;			    
                default: return false;
                }
			default: return false;
			}
		case 2:
			switch (event) {
			case 0:
				switch (param) {    
                default: return false;
                }
			case 1:
				switch (param) {
				case 0: return true;			    
                default: return false;
                }
			default: return false;
			}
		default: return false;
		}  
	}	
	
	@Override
	public Object getParamAssignment(PetriNetChoice choice, int event, int param) {
		int transition = choice.getTransition();
		{
			dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot self = (dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot) getElement();		
			switch (transition) {
			case 0: {
				Eventpass_Values p = (Eventpass_Values) choice.getEventValues("pass");
				switch (event) {
				case 0:
					switch (param) {      
					case 1: return self;			    
                	default: return null;
                	}
				default: return null;
				}
			}
			case 1: {
				Eventinsert_Values i = (Eventinsert_Values) choice.getEventValues("insert");
				switch (event) {
				case 0:
					switch (param) {      
					case 1: return self;			    
                	default: return null;
                	}
				default: return null;
				}
			}
			case 2: {
				Eventreturn__Values r = (Eventreturn__Values) choice.getEventValues("return_");
				switch (event) {
				case 0:
					switch (param) {    
                	default: return null;
                	}
				case 1:
					switch (param) {      
					case 0: return self;			    
                	default: return null;
                	}
				default: return null;
				}
			}
			default: return null;
			}
		}
	}

	@Override
	public boolean evaluateCondition(PetriNetChoice choice) {
		int transition = choice.getTransition();
		{
			dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot self = (dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot) getElement();
			switch (transition) {
			case 0: {
				Eventpass_Values p = (Eventpass_Values) choice.getEventValues("pass");
				return true; 
			}
			case 1: {
				Eventinsert_Values i = (Eventinsert_Values) choice.getEventValues("insert");
				return self.getLinks(slot_coin_ref).length < 2; 
			}
			case 2: {
				Eventreturn__Values r = (Eventreturn__Values) choice.getEventValues("return_");
				return true; 
			}
			default: return false;
			}
		}
	}	
	
	@Override
	public void executeAction(PetriNetChoice choice) {
		int transition = choice.getTransition();
		{
			dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot self = (dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot) getElement();		
			ParentAction parent = new ParentAction(choice);
			switch (transition) {
			case 0: {
				Eventpass_Values p = (Eventpass_Values) choice.getEventValues("pass");
{
  self.removeLink(slot_coin_ref,p.coin);
}

            	fire(transition);
				return; 
			}
			case 1: {
				Eventinsert_Values i = (Eventinsert_Values) choice.getEventValues("insert");
{
  self.addLink(slot_coin_ref,i.coin);
}

            	fire(transition);
				return; 
			}
			case 2: {
				Eventreturn__Values r = (Eventreturn__Values) choice.getEventValues("return_");
{
  self.removeAllLinks(slot_coin_ref);
}

            	fire(transition);
				return; 
			}
			default: return;
			}
		}
	}	
	
	@Override
	public String[] getTransitionEvents(int transition) {
			switch (transition) {
		case 0: 
			return new String[] { "pass" };
		case 1: 
			return new String[] { "insert" };
		case 2: 
			return new String[] { "reset", "return_" };
		default: return null;
		}  
	}
		
}

