package dk.dtu.imm.se.ecno.examples.workers.gui;

import dk.dtu.imm.se.ecno.examples.workers.Job;
import dk.dtu.imm.se.ecno.examples.workers.Worker;
import dk.dtu.imm.se.ecno.runtime.Interaction;

class InteractionItem {

	final Interaction interaction;
	final Job job;
	
	private String name;

	InteractionItem(Interaction interaction, Job job) {
        this.interaction = interaction;
		this.job = job;
		
		if (job != null) {
			String participants = " (";
			boolean first = true;
			for (Worker worker: job.getNeeded()) {
				if (first) {
					first = false;
					participants = participants + worker.getName();
				} else {
					participants = participants + ", " + worker.getName();
				}
			}
			participants = participants + ")";
			name = job.getName() + participants;
		} else {
			name = "<none>";
		}
	}
	
	public String toString() {
		return name;
	}

}
