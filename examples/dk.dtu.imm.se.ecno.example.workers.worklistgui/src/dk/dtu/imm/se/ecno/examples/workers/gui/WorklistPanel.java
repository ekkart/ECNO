package dk.dtu.imm.se.ecno.examples.workers.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.examples.workers.Job;
import dk.dtu.imm.se.ecno.examples.workers.Worker;
import dk.dtu.imm.se.ecno.examples.workers.coordination.WorkersModel;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.IInvalidationListener;
import dk.dtu.imm.se.ecno.runtime.IInvalidationNotifier;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;
import dk.dtu.imm.se.ecno.runtime.Parameter;

@SuppressWarnings("serial")
public class WorklistPanel extends JPanel implements IInvalidationListener{

	final ExecutionEngine engine; 
	final WorkersGUI gui;
	
	private JTextField textField;
	private JComboBox<InteractionItem> jobsComboBox;
	private JButton button;
	
	private ActionListener buttonListener;
	
	private InteractionIterator iterator;
	
	private EventType doJob;
	private IFormalParameter jobParam;
	private IFormalParameter nameParam;

	public WorklistPanel(ExecutionEngine engine, WorkersGUI gui, WorkersModel model) {
		super();
		this.engine = engine;
		this.gui = gui;
		
		doJob = null;
		List<EventType> events = model.getNamespace().getEventTypes();
		for (EventType type: events) {
			if ("doJob".equals(type.getName())) {
				doJob = type;
				break;
			}
		}
		if (doJob != null) {
			jobParam = doJob.getFormalParametersList().get(0);
			nameParam = doJob.getFormalParametersList().get(2);
		} else {
			throw new RuntimeException("DoJob event type not available");
		}
		
		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, " Select a work item ");
		
		this.setBorder(titled);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		textField = new JTextField();
		textField.setEditable(true);
		textField.setPreferredSize( new Dimension(150,27));
		textField.setText("Some name");
		
		textField.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg) {
						WorklistPanel.this.update();
					}

				});
		
		textField.addMouseListener(
				new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) { }

					@Override
					public void mouseEntered(MouseEvent arg0) {
						textField.setFocusable(true);
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						textField.setFocusable(false);
						WorklistPanel.this.update();
					}

					@Override
					public void mousePressed(MouseEvent arg0) { }

					@Override
					public void mouseReleased(MouseEvent arg0) { }

				});
		
		textField.addFocusListener(
				new FocusListener() {

					@Override
					public void focusGained(FocusEvent arg0) { }

					@Override
					public void focusLost(FocusEvent arg0) {
						WorklistPanel.this.update();
					}

				});
		
		this.add(textField);
		
		
		jobsComboBox = new WideComboBox<InteractionItem>();
		jobsComboBox.setPreferredSize(new Dimension(200,27));
		this.add(jobsComboBox);
		
		button= new JButton();
		button.setText("DoJob");
		button.setToolTipText("No interaction available");
		buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg) {
				WorklistPanel.this.execute();
			}

		};
		button.addActionListener(buttonListener);
		this.add(button);
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
				jobsComboBox.removeAllItems();
				Worker worklist = gui.getSelectedWorker();
				if (worklist != null) {
					if (iterator != null) {
						iterator.unregisterListener(this);
					}

					List<InteractionItem> interactions = new ArrayList<InteractionItem>();
					boolean success = false;
					do {
						Event event = engine.createInstance(doJob);
						if (event != null) {
							Parameter param = event.getParameter(nameParam);
							if (param != null) {
								param.setValue(textField.getText());
							}
							iterator = engine.getInteractions(worklist, event);
						}

						success = true;
						try {
							iterator.registerListener(this);
							while (iterator.hasNext()) {
								Interaction interaction = iterator.next();
								IChoice choice = interaction.getElementsChoice(worklist);
								event = choice.getEvent(doJob);

								Parameter jobP = event.getParameter(jobParam);
								if (jobP != null) {
									Object job = jobP.getValue();
									if (job instanceof Job) {
										interactions.add(new InteractionItem(interaction, (Job) job));
									}
								}
							} 
						} catch (InvalidStateException e) {
							iterator.unregisterListener(this);
							iterator.dispose();
							success = false;
						}
					} while (!success);

					for (InteractionItem item: interactions) {
						jobsComboBox.addItem(item);
					}

					if (!interactions.isEmpty()) {
						button.setEnabled(true);
						button.setToolTipText("Execute Job.");
						jobsComboBox.setSelectedIndex(0);
					} else {
						button.setEnabled(false);
						button.setToolTipText("No interaction available");
					}
				}
			} while (!leaveUpdate());
		}
	}
		
	
	void execute() {
		Object selected = jobsComboBox.getSelectedItem();
		if (selected instanceof InteractionItem) {
			Interaction interaction = ((InteractionItem) selected).interaction;
			if (interaction.isValid()) {
				try {
					interaction.execute();
				} catch (InvalidStateException e) { }
			}
		}
	}
	
	void dispose() {
		button.removeActionListener(buttonListener);
		this.remove(button);
		this.remove(jobsComboBox);
		this.remove(textField);
		gui.remove(this);

	}

	@Override
	public void notifyInvalidation(IInvalidationNotifier invalidationNotifier) {
		update();
	}


}
