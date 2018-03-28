package ecno.bankingsystem.code.gui;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ElementEventController;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

public class AutomaticElementEventController extends ElementEventController {

	private int delay;
	
	public AutomaticElementEventController(ExecutionEngine engine, EObject element,
			IEventType eventType, int delay) {
		super(engine, element, eventType);
		this.delay = delay;
	}

	@Override
	protected void setEnabled(boolean enabled) {
		if (enabled) {
			Interaction interaction = this.interaction;
			if (interaction != null) {
				// NOTE: By no means call interaction.execute() here!!
				// We create and start a thread in which the execution is done instead:
				Thread thread = new AutomaticExecutionThread(engine, interaction, delay);
				thread.start();
				
			}
		}
	}

	private class AutomaticExecutionThread extends Thread{
		
		private ExecutionEngine engine;
		private Interaction interaction;
		private int delay;
		
		AutomaticExecutionThread(ExecutionEngine engine, Interaction interaction, int delay) {
			this.engine = engine;
			this.interaction = interaction;
			this.delay = delay;
		}

		/* (non-Javadoc)
		 * @see java.lang.Thread#run()
		 */
		@Override
		public void run() {
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
