package dk.dtu.imm.se.ecno.example.petrinets.gui;

import PetriNets.Transition;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ElementEventController;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

public class FireTransitionController extends ElementEventController {

	public FireTransitionController(ExecutionEngine engine, Transition transition,
			IEventType eventType) {
		super(engine, transition, eventType);
	}

	@Override
	protected void setEnabled(boolean enabled) {
		if (enabled) {
			Interaction interaction = this.interaction;
			if (interaction != null) {
				// NOTE: By no means call interaction.execute() here!!
				// We create and start a thread in which the execution is done instead:
				Thread thread = new FireTransitionThread(engine, interaction, 1.0);
				thread.start();
				
			}
		}
	}

	private class FireTransitionThread extends Thread{
		
		private ExecutionEngine engine;
		private Interaction interaction;
		private double rate;
		
		FireTransitionThread(ExecutionEngine engine, Interaction interaction, double rate) {
			this.engine = engine;
			this.interaction = interaction;
			this.rate = rate;
		}

		/* (non-Javadoc)
		 * @see java.lang.Thread#run()
		 */
		@Override
		public void run() {
			double random = Math.random();
			long delay = (long) (-1000 * ( Math.log(1-random) / rate));
			try {
				sleep(delay);
			} catch (InterruptedException e) {}
			
			if (!engine.isExiting() && interaction.isValid()) {
				try {
					interaction.execute();
				} catch (InvalidStateException e) {}
			}
		}
		
	}

}
