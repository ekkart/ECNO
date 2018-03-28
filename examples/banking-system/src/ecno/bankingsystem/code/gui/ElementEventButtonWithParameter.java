package ecno.bankingsystem.code.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IInvalidationListener;
import dk.dtu.imm.se.ecno.runtime.IInvalidationNotifier;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;
import dk.dtu.imm.se.ecno.runtime.Parameter;

@SuppressWarnings("serial")
public class ElementEventButtonWithParameter<TYPE> extends JButton implements IInvalidationListener {

	final private ExecutionEngine engine; 
	final private Element element;
	final private EventType eventType;
	final private IFormalParameter parameter;
	final private IValueProvider<TYPE> valueprovider;
	
	private ActionListener buttonListener;
	
	private InteractionIterator iterator;
	private Interaction interaction;

	public ElementEventButtonWithParameter(ExecutionEngine engine,
			Element element, EventType eventType, IFormalParameter parameter, IValueProvider<TYPE> valueprovider) {
		super();
		this.engine = engine;
		this.element = element;
		this.eventType = eventType;
		this.parameter = parameter;
		this.valueprovider = valueprovider;
		
		this.iterator = null;
		this.interaction = null;

		this.setText(eventType.getName());
		this.setToolTipText("No interaction available");
		buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg) {
				ElementEventButtonWithParameter.this.execute();
			}

		};
		this.addActionListener(buttonListener);
		
		if (valueprovider instanceof IDynamicValueProvider) {
			try {
				((IDynamicValueProvider<TYPE>) valueprovider).registerListener(this);
			} catch (InvalidStateException e) {}
		}
		
		update();
	}
	
	private boolean unclean = false;
	private boolean updating = false;
	
	private synchronized boolean enterUpdate() {
		if (!updating) {
			unclean = false;
			updating = true;
			return true;
		} else {
		  unclean = false;
		  return false;
		}
	}
	
	private synchronized boolean leaveUpdate() {
		if (unclean) {
			unclean = false;
			return false;
		} else {
			updating = false;
			return true;
		}
	}
	
	void update () {
		// the enterUpdate and leaveUpdate make sure that concurrent updates
		// do not interfere; but more recent updates result in a re-evaluation
		// at the end of a running update cycle.
		if (enterUpdate()) {
			do {
				TYPE value = valueprovider.getCurrentValue();
				if (element != null) {
					if (iterator != null) {
						iterator.unregisterListener(this);
						iterator = null;
					}
					
					if (interaction != null) {
						interaction.dispose();
						interaction = null;
					}

					boolean success = false;
					do {
						Event event = engine.createInstance(eventType);
						if (event != null) {
							Parameter param = event.getParameter(parameter);
							if (param != null) {
								param.setValue(value);
							}
							iterator = engine.getInteractions(element, event);
						}

						success = true;
						try {
							iterator.registerListener(this);
							if (iterator.hasNext()) {
								interaction = iterator.next();
							} 
						} catch (InvalidStateException e) {
							iterator.unregisterListener(this);
							iterator.dispose();
							success = false;
						}
					} while (!success);

					if (interaction != null) {
						this.setEnabled(true);
					} else {
						this.setEnabled(false);
					}
				}
			} while (!leaveUpdate());
		}
	}
		
	
	void execute() {
		if (interaction != null && interaction.isValid()) {
			try {
				interaction.execute();
				showResult(interaction);
			} catch (InvalidStateException e) {}
		}
	}
	
	protected void showResult(Interaction interaction) {
		// This is a bit ad hoc way of allowing subclasses of this controller
		// to update the GUI based on the outcome of the execution. This could
		// eventually be done in a uniform way for all controllers.
		// Sub classes should overwrite this method.
	}
	
	void dispose() {
		this.removeActionListener(buttonListener);
		if (interaction != null) {
			interaction.dispose();
		}
		if (iterator != null) {
			iterator.unregisterListener(this);
		}
		if (valueprovider instanceof IDynamicValueProvider) {
			((IDynamicValueProvider<TYPE>) valueprovider).unregisterListener(this);
		}
	}

	@Override
	public void notifyInvalidation(IInvalidationNotifier invalidationNotifier) {
		if (SwingUtilities.isEventDispatchThread()) {
			update();
		} else {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					update();
				}
			});
		}
	}

}
