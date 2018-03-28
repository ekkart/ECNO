package dk.dtu.imm.se.ecno.eclipse.recordingcommand;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import dk.dtu.imm.se.ecno.eclipse.enginesregistry.EngineWrapper;
import dk.dtu.imm.se.ecno.runtime.IInteractionExecutionCommand;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

public class RecordingInteractionExecutionCommand implements
		IInteractionExecutionCommand {


	private EngineWrapper engineWrapper;
	private IInteractionExecutionCommand command;
	
	RecordingInteractionExecutionCommand(
			EngineWrapper engineWrapper,
			// TransactionalEditingDomain domain,
			// BehaviourStates states, 
			IInteractionExecutionCommand command) {
		this.engineWrapper = engineWrapper;
		this.command = command;
	}
		
	@Override
	public Interaction getInteraction() {
		if (command != null) {
			return command.getInteraction();
		} else {
			return null;
		}
	}

	@Override
	public void doExecute() throws InvalidStateException {
		Interaction interaction = getInteraction();
		
		if (interaction != null && interaction.isValid()) {
			TransactionalEditingDomain domain = engineWrapper.getDomain();
			if (domain != null) {
				RecordingInteractionExecution execution =
						new RecordingInteractionExecution(engineWrapper, command);
				domain.getCommandStack().execute(execution);
			} else {
				command.doExecute();
			}
		} else {
			throw new InvalidStateException();
		}
	}

	private class RecordingInteractionExecution extends RecordingCommand {

		private EngineWrapper engineWrapper;
		private IInteractionExecutionCommand command;

		public RecordingInteractionExecution(
				EngineWrapper engineWrapper,
				IInteractionExecutionCommand command) {
			super(engineWrapper.getDomain(), command.getInteraction().getLabel(), "Execute an interaction (" + command.getInteraction().getLabel() +")");
			this.engineWrapper = engineWrapper;
			this.command = command;
		}

		@Override
		protected void doExecute() {
			// Add ElementBehaviours for the involved elements to the behaviour container,
			// if it is not there yet
			Interaction interaction = command.getInteraction();
			if (interaction != null && interaction.isValid()) {
				for (Object object: interaction.getElements()) {
					if (object instanceof EObject) {
						EObject element = (EObject) object;
						if (engineWrapper.getElementBehaviourState(element) == null) {
							canUndo = false;
						}
						if (element.eResource() == null) {
							engineWrapper.addOrphan(element);
						} else if (canUndo && !engineWrapper.getDomain().equals(TransactionUtil.getEditingDomain(element))) {
							canUndo = false;
						}
					}
				}
			}

			try {
				command.doExecute();
			} catch (InvalidStateException e) {

			}			
		}
		
		private boolean canUndo = true;
		
		/** 
		 * Indicates whether command can be undone. For undoing a command, all
		 * involved elements should be under the control of the EngineWrapper's
		 * editing domain, or not in a resource at all, and the involved element
		 * behaviours must have a savable state.
		 * 
		 * @see org.eclipse.emf.transaction.RecordingCommand#canUndo()
		 */
		@Override
		public boolean canUndo() {
			return canUndo && super.canUndo();
		}

	}

}
