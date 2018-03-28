package dk.dtu.imm.se.ecno.examples.workers.gui;

import dk.dtu.imm.se.ecno.examples.workers.Worker;

class WorkerItem {

	final Worker worker;
	
	WorkerItem(Worker worker) {
		this.worker = worker;
	}
	
	public String toString() {
		return worker.getName();
	}

}
