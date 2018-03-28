package dk.dtu.imm.se.ecno.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ElementEventController;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

public class ElementEventButton extends ElementEventController {

	private JPanel panel;
	private JButton button;
	private ActionListener actionListener;
	private IPresentationUtil presentation;

	public ElementEventButton(ExecutionEngine engine, IPresentationUtil presentation, Object element, IEventType eventType, 
			JPanel panel) {
		super(engine, element, eventType);

		this.panel = panel;
		this.presentation = presentation;

		// create the button and the action listener; note that the
		// button is added to the panel only during the initialization (by
		// indirectly calling init()); also the action listener is added only 
		// to the button during the initialization.
		button = new EventButton();
		button.setText(eventType.getName());
		button.setToolTipText("No interaction available");

		actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if ((arg0.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
					// Switch to the next possible interaction
					ElementEventButton.this.next();
				} else if ((arg0.getModifiers() & ActionEvent.CTRL_MASK) != 0) {
					// Recompute possible interactions (start from beginning)
					ElementEventButton.this.update();
				} else {
					// Execute the currently selected interaction
					ElementEventButton.this.execute();
				}
			}

		};
	}

	@Override
	protected void init() {
		panel.add(button);
		button.addActionListener(actionListener);
	}

	/* (non-Javadoc)
	 * @see dk.dtu.imm.se.ecno.engine.ElementEventController#update()
	 */
	@Override
	public void update() {
		if (SwingUtilities.isEventDispatchThread()) {
			super.update();
		} else {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					ElementEventButton.super.update();
				}
			});
		}
	}

	/* (non-Javadoc)
	 * @see dk.dtu.imm.se.ecno.engine.ElementEventController#next()
	 */
	@Override
	public void next() {
		if (SwingUtilities.isEventDispatchThread()) {
			super.next();
		} else {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					ElementEventButton.super.next();
				}
			});
		}
	}

	@Override
	protected void setEnabled(boolean enabled) {
		String decoration = "";
		button.setEnabled(enabled);
		if (enabled) {
			try {
				InteractionIterator iterator = ElementEventButton.this.getInteractionIterator();
				if (iterator != null && iterator.hasNext()) {
					decoration = "*";
				}
			} catch (InvalidStateException e) {

			}
			Event type = null;
			if (interaction != null) {
				// eki 18. 4. 2012
				// type = interaction.getEvent(element, eventType);
				type = interaction.getElementsChoice(element).getEvent(eventType);
				if (presentation != null) {
					button.setToolTipText(presentation.getInteractionLabel(interaction));
				} else {
					button.setToolTipText("Interaction for " + eventType.getName() + " enabled");
				}
			}
			if (type != null) {
				button.setText(type.getType().getName() + decoration);
			} else {
				button.setText(eventType.getName() + decoration);
			}
		} else {
			button.setText(eventType.getName() + decoration);
			button.setToolTipText("No interaction enabled");
		}
	}

	@Override
	protected void setNext() {
		String decoration = "";
		try {
			InteractionIterator iterator = this.getInteractionIterator();
			if (iterator != null && iterator.hasNext()) {
				decoration = "*";
			} else {
				decoration = "!";
			}
		} catch (InvalidStateException e) {

		}
		Event event = null;
		if (interaction != null) {
			// eki 18. 4. 2012
			// type = interaction.getEvent(element, eventType);
			event = interaction.getElementsChoice(element).getEvent(eventType);
			if (presentation != null) {
				button.setToolTipText(presentation.getInteractionLabel(interaction));
			} else {
				button.setToolTipText("Interaction for " + eventType.getName() + " enabled");
			}
		}
		if (event != null) {
			button.setText(event.getType().getName() + decoration);
		} else {
			button.setText(eventType.getName() + decoration);
		}
	}

	@Override
	protected void destroy() {
		button.removeActionListener(actionListener);
		panel.remove(button);
		actionListener = null;
		panel = null;
		button = null;
	}

}
