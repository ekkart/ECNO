package coded.gui;

import workflow.Case;
import workflow.Task;
import dk.dtu.imm.se.ecno.runtime.Interaction;

class InteractionItem {

	final Interaction interaction;
	final Task task;
	final Case case_;
	
	private String name;

	InteractionItem(Interaction interaction, Task task, Case case_) {
        this.interaction = interaction;
		this.task = task;
		this.case_ = case_;
	}
	
	public String toString() {
		if (case_.isStarted())
			return task.getName()+" -- in "+case_.getProcess().getName()+" ("+case_.getId()+")";
		else
			return "Start a new "+case_.getProcess().getName()+" ("+case_.getId()+")";
	}

}
