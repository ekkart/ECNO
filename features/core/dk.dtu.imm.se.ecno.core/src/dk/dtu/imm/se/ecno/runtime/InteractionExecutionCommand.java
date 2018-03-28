package dk.dtu.imm.se.ecno.runtime;

import java.util.Arrays;
import java.util.Comparator;

public class InteractionExecutionCommand implements IInteractionExecutionCommand {

	private Interaction interaction;
	
	public InteractionExecutionCommand(Interaction interaction) {
		this.interaction = interaction;
	}
	
	@Override
	public Interaction getInteraction() {
		return interaction;
	}

	@Override
	public void doExecute() throws InvalidStateException {

		if (interaction != null && interaction.isValid()) {
			// interaction.getElements();
			Comparator<Object> order = interaction.engine.getElementOrder();
			Object[] elements = interaction.getElements().toArray();
			if (order != null) {
				Arrays.sort(elements,order);
			}
			// for(Object element: interaction.getElements()) {
			for(Object element: elements) {
				IChoice choice = interaction.getElementsChoice(element);
				if (choice != null) {
					try {
						choice.execute();
					} catch (Exception e) {
						// ignore exceptions
					} catch (Error e) {
						// try to dispose interaction
						interaction.dispose();
						interaction = null;
						// and throw error again
						throw e;
					} catch (Throwable e) {
						interaction.dispose();
						interaction = null;
						throw new Error(e);
					}
				}
			}
			interaction.engine.noExecutedSuccess++;
			interaction.dispose();
			interaction = null;
		} else {
			throw new InvalidStateException();
		}	
	}

}
