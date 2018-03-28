package dk.dtu.imm.se.ecno.runtime;

/**
 * This class encapsulates an choice as an action, that can be
 * called to execute the parent's choice or to drop the
 * parents choice.
 * 
 * @author eki
 *
 */
public final class ParentAction {
	
	private Choice choice;

	public ParentAction(Choice choice) {
		this.choice = choice;
	}
	
	public void execute() {
		choice.executeParent();
	}
	
	public void drop() {
		choice.dropExecuteParent();
	}

}
