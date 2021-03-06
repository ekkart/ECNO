/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of an element, as defined by the Petri net.
 */
package ecno.bankingsystem.localbehaviour;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.model.runtime.ecnonets.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.model.runtime.ecnonets.PetriNetChoice;
import dk.dtu.imm.se.ecno.runtime.ParentAction;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine; 

@SuppressWarnings("unused")
public class NaturalPerson extends AbstractPetrinetBehaviour<emf.bankingsystem.NaturalPerson> {
	
	public NaturalPerson(ExecutionEngine engine, IElementType type,  EObject element) {
		super(engine, (emf.bankingsystem.NaturalPerson) element, new int[]{}, new String[]{"t16", "t17", "t18", "t19", "t20", "t21", "t38", "t39", "t40", "t52", "t57"}, type );
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
                    
		case 3:
			return true;
                    
		case 4:
			return true;
                    
		case 5:
			return true;
                    
		case 6:
			return true;
                    
		case 7:
			return true;
                    
		case 8:
			return true;
                    
		case 9:
			return true;
                    
		case 10:
			return true;
                    
		default:
			return false;	
		}
	}
	
	@Override
	public void consumeTokens(int t, int[] m) {
		switch (t) {
		case 0:
            break;
                    
		case 1:
            break;
                    
		case 2:
            break;
                    
		case 3:
            break;
                    
		case 4:
            break;
                    
		case 5:
            break;
                    
		case 6:
            break;
                    
		case 7:
            break;
                    
		case 8:
            break;
                    
		case 9:
            break;
                    
		case 10:
            break;
                    
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
		case 3:
			return false;                    
		case 4:
			return false;                    
		case 5:
			return false;                    
		case 6:
			return false;                    
		case 7:
			return false;                    
		case 8:
			return false;                    
		case 9:
			return false;                    
		case 10:
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
			
		case 3:		
			break;
			
		case 4:		
			break;
			
		case 5:		
			break;
			
		case 6:		
			break;
			
		case 7:		
			break;
			
		case 8:		
			break;
			
		case 9:		
			break;
			
		case 10:		
			break;
						
		}
	}
	
	@Override
	public String[] getTransitionEventParameterNames(int transition, int event) {
		switch (transition) {
		case 0:
			switch (event) {
			case 0:
				return new String[] {  };
            default: return new String[] {};
                }
		case 1:
			switch (event) {
			case 0:
				return new String[] { "pin" };
            default: return new String[] {};
                }
		case 2:
			switch (event) {
			case 0:
				return new String[] { "pin" };
            default: return new String[] {};
                }
		case 3:
			switch (event) {
			case 0:
				return new String[] {  };
            default: return new String[] {};
                }
		case 4:
			switch (event) {
			case 0:
				return new String[] {  };
            default: return new String[] {};
                }
		case 5:
			switch (event) {
			case 0:
				return new String[] {  };
            default: return new String[] {};
                }
		case 6:
			switch (event) {
			case 0:
				return new String[] { "amount" };
            default: return new String[] {};
                }
		case 7:
			switch (event) {
			case 0:
				return new String[] { "amount" };
            default: return new String[] {};
                }
		case 8:
			switch (event) {
			case 0:
				return new String[] {  };
            default: return new String[] {};
                }
		case 9:
			switch (event) {
			case 0:
				return new String[] {  };
            default: return new String[] {};
                }
		case 10:
			switch (event) {
			case 0:
				return new String[] {  };
            default: return new String[] {};
                }
		default: return new String[] {};
		}  
	}	
	
	@Override
	public Object getParamAssignment(PetriNetChoice choice, int event, int param) {
		int transition = choice.getTransition();
		// Note that this attribute self will be deleted in future versions 
		// of the ECNO code generator for ECNO nets. Therefore, the method
		// self() should be used instead of the variable self in your 
		// ECNO Net Java code snippets.
		emf.bankingsystem.NaturalPerson self = self();
				
		switch (transition) {
		case 0: {
			ecno.bankingsystem.events.UserCardAction i = 
			    (ecno.bankingsystem.events.UserCardAction) choice.getEventValues("insertCard");
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 1: {
			ecno.bankingsystem.events.EnterPIN e = 
			    (ecno.bankingsystem.events.EnterPIN) choice.getEventValues("enterPIN");
			switch (event) {
			case 0:
				switch (param) {      
				case 0: return 0;			    
                default: return null;
                }
			default: return null;
			}
		}
		case 2: {
			ecno.bankingsystem.events.EnterPIN e = 
			    (ecno.bankingsystem.events.EnterPIN) choice.getEventValues("enterPIN");
			switch (event) {
			case 0:
				switch (param) {      
				case 0: return 1;			    
                default: return null;
                }
			default: return null;
			}
		}
		case 3: {
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 4: {
			ecno.bankingsystem.events.UserCardAction r = 
			    (ecno.bankingsystem.events.UserCardAction) choice.getEventValues("takeCard");
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 5: {
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 6: {
			ecno.bankingsystem.events.Withdraw w = 
			    (ecno.bankingsystem.events.Withdraw) choice.getEventValues("withdraw");
			switch (event) {
			case 0:
				switch (param) {      
				case 0: return 1;			    
                default: return null;
                }
			default: return null;
			}
		}
		case 7: {
			ecno.bankingsystem.events.Withdraw w = 
			    (ecno.bankingsystem.events.Withdraw) choice.getEventValues("withdraw");
			switch (event) {
			case 0:
				switch (param) {      
				case 0: return 2;			    
                default: return null;
                }
			default: return null;
			}
		}
		case 8: {
			ecno.bankingsystem.events.TakeMoney t = 
			    (ecno.bankingsystem.events.TakeMoney) choice.getEventValues("takeMoney");
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 9: {
			ecno.bankingsystem.events.Balance b = 
			    (ecno.bankingsystem.events.Balance) choice.getEventValues("balance");
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		case 10: {
			ecno.bankingsystem.events.SelectATM s = 
			    (ecno.bankingsystem.events.SelectATM) choice.getEventValues("selectATM");
			switch (event) {
			case 0:
				switch (param) {    
                default: return null;
                }
			default: return null;
			}
		}
		default: return null;
		}  
	}	

	@Override
	public boolean evaluateCondition(PetriNetChoice choice) {
		int transition = choice.getTransition();
		// Note that this attribute self will be deleted in future versions 
		// of the ECNO code generator for ECNO nets. Therefore, the method
		// self() should be used instead of the variable self in your 
		// ECNO Net Java code snippets.
		emf.bankingsystem.NaturalPerson self = self();
		
		switch (transition) {
		case 0: {
			ecno.bankingsystem.events.UserCardAction i = 
                (ecno.bankingsystem.events.UserCardAction) choice.getEventValues("insertCard");
			return true; 
		}
		case 1: {
			ecno.bankingsystem.events.EnterPIN e = 
                (ecno.bankingsystem.events.EnterPIN) choice.getEventValues("enterPIN");
			return true; 
		}
		case 2: {
			ecno.bankingsystem.events.EnterPIN e = 
                (ecno.bankingsystem.events.EnterPIN) choice.getEventValues("enterPIN");
			return true; 
		}
		case 3: {
			return true; 
		}
		case 4: {
			ecno.bankingsystem.events.UserCardAction r = 
                (ecno.bankingsystem.events.UserCardAction) choice.getEventValues("takeCard");
			return r.card != null; 
		}
		case 5: {
			return true; 
		}
		case 6: {
			ecno.bankingsystem.events.Withdraw w = 
                (ecno.bankingsystem.events.Withdraw) choice.getEventValues("withdraw");
			return true; 
		}
		case 7: {
			ecno.bankingsystem.events.Withdraw w = 
                (ecno.bankingsystem.events.Withdraw) choice.getEventValues("withdraw");
			return true; 
		}
		case 8: {
			ecno.bankingsystem.events.TakeMoney t = 
                (ecno.bankingsystem.events.TakeMoney) choice.getEventValues("takeMoney");
			return true; 
		}
		case 9: {
			ecno.bankingsystem.events.Balance b = 
                (ecno.bankingsystem.events.Balance) choice.getEventValues("balance");
			return true; 
		}
		case 10: {
			ecno.bankingsystem.events.SelectATM s = 
                (ecno.bankingsystem.events.SelectATM) choice.getEventValues("selectATM");
			return true; 
		}
		default: return false;
		}  
	}	
	
	@Override
	public void executeAction(PetriNetChoice choice) {
		int transition = choice.getTransition();
		ParentAction parent = new ParentAction(choice);
		// Note that this attribute self will be deleted in future versions 
		// of the ECNO code generator for ECNO nets. Therefore, the method
		// self() should be used instead of the variable self in your 
		// ECNO Net Java code snippets.
		emf.bankingsystem.NaturalPerson self = self();
		
		switch (transition) {
		case 0: {
			ecno.bankingsystem.events.UserCardAction i =
                (ecno.bankingsystem.events.UserCardAction) choice.getEventValues("insertCard");
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 1: {
			ecno.bankingsystem.events.EnterPIN e =
                (ecno.bankingsystem.events.EnterPIN) choice.getEventValues("enterPIN");
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 2: {
			ecno.bankingsystem.events.EnterPIN e =
                (ecno.bankingsystem.events.EnterPIN) choice.getEventValues("enterPIN");
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 3: {
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 4: {
			ecno.bankingsystem.events.UserCardAction r =
                (ecno.bankingsystem.events.UserCardAction) choice.getEventValues("takeCard");
{
self().getAvailableCards().add(r.card);
}
            fire(transition);
			return; 
		}
		case 5: {
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 6: {
			ecno.bankingsystem.events.Withdraw w =
                (ecno.bankingsystem.events.Withdraw) choice.getEventValues("withdraw");
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 7: {
			ecno.bankingsystem.events.Withdraw w =
                (ecno.bankingsystem.events.Withdraw) choice.getEventValues("withdraw");
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 8: {
			ecno.bankingsystem.events.TakeMoney t =
                (ecno.bankingsystem.events.TakeMoney) choice.getEventValues("takeMoney");
{
self().getOwns().addAll(t.money);
}
            fire(transition);
			return; 
		}
		case 9: {
			ecno.bankingsystem.events.Balance b =
                (ecno.bankingsystem.events.Balance) choice.getEventValues("balance");
/* DO NOTHING */
            fire(transition);
			return; 
		}
		case 10: {
			ecno.bankingsystem.events.SelectATM s =
                (ecno.bankingsystem.events.SelectATM) choice.getEventValues("selectATM");
{
self.getUses().clear();
if (s.atm != null) {
  self().getUses().add(s.atm);
}
}
            fire(transition);
			return; 
		}
		default: return;
		}  
	}	
	
	@Override
	public String[] getTransitionEvents(int transition) {
			switch (transition) {
		case 0: 
			return new String[] { "insertCard" };
		case 1: 
			return new String[] { "enterPIN" };
		case 2: 
			return new String[] { "enterPIN" };
		case 3: 
			return new String[] { "timeout" };
		case 4: 
			return new String[] { "takeCard" };
		case 5: 
			return new String[] { "exit" };
		case 6: 
			return new String[] { "withdraw" };
		case 7: 
			return new String[] { "withdraw" };
		case 8: 
			return new String[] { "takeMoney" };
		case 9: 
			return new String[] { "balance" };
		case 10: 
			return new String[] { "selectATM" };
		default: return null;
		}  
	}
		
}

