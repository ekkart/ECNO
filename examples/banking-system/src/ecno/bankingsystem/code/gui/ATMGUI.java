package ecno.bankingsystem.code.gui;

import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.text.NumberFormatter;

import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.engine.EngineTerminatedException;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.gui.ElementEventButton;
import dk.dtu.imm.se.ecno.gui.SwingOperation;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.Parameter;
import emf.bankingsystem.HW;

@SuppressWarnings("serial")
public class ATMGUI extends JFrame implements IController  {

	private ExecutionEngine engine;

	private TextFieldIntegerInput pinInput;
	private TextFieldIntegerInput amountInput;
	
	private ElementEventButtonWithParameter<Integer> enterPinButton;
	private ElementEventButtonWithParameter<Integer> withdrawButton;

	private ElementEventButton balanceButton;
	private ElementEventButton exitButton;
	
	private JTextArea outputField;

	public ATMGUI(ExecutionEngine engine, HW atm) {
		super();
		this.engine = engine;
		
		dk.dtu.imm.se.ecno.model.ecno.Package ecnoPackage = null;
		INamespace namespace = engine.getNamespace("http://bankingsystem");
		if (namespace instanceof dk.dtu.imm.se.ecno.model.ecno.Package) {
			ecnoPackage = (dk.dtu.imm.se.ecno.model.ecno.Package) namespace;
		}
		
		ToolTipManager.sharedInstance().setInitialDelay(1000);
		ToolTipManager.sharedInstance().setDismissDelay(5*60*1000);
		
		this.setTitle("Banking Example: ATM " + atm.getUid());
		this.setSize(480,270);
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));

		NumberFormat pinformat = NumberFormat.getIntegerInstance();
		pinformat.setGroupingUsed(false);
		pinformat.setMaximumIntegerDigits(4);

		NumberFormatter pinFormatter = new NumberFormatter(pinformat);
		pinFormatter.setValueClass(Integer.class); 
		pinFormatter.setAllowsInvalid(false);
		pinFormatter.setMinimum(0);
		
		EventType enterPIN = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("enterPIN")) {
				enterPIN = et;
				break;
			}
		}
		if (enterPIN != null) {
			IFormalParameter pinParameter = null;
			for (IFormalParameter fp: enterPIN.getFormalParametersList()) {
				if (fp.getName().equals("pin")) {
					pinParameter = fp;
					break;
				}
			}
			if (pinParameter != null) {
				pinInput = new TextFieldIntegerInput(pinFormatter);
				pinInput.setValue(1);
				enterPinButton = new ElementEventButtonWithParameter<Integer>(engine, atm, enterPIN, pinParameter, pinInput)  {
					@Override
					protected void showResult(Interaction interaction) {
						if (SwingUtilities.isEventDispatchThread()) {
							outputField.setText("");
						} else {
							SwingUtilities.invokeLater(new Runnable() {
								public void run() {
									outputField.setText("");
								}
							});
						}
					}
				};
			}
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Enter PIN"));
		panel.setLayout(new GridLayout(1,1));
		panel.add(pinInput);
		panel.add(enterPinButton);
		this.add(panel);
		
		NumberFormat amountformat = NumberFormat.getIntegerInstance();

		NumberFormatter amountFormatter = new NumberFormatter(amountformat);
		amountFormatter.setValueClass(Integer.class); 
		amountFormatter.setAllowsInvalid(false);
		amountFormatter.setMinimum(0);

		EventType withdraw = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("withdraw")) {
				withdraw = et;
				break;
			}
		}
		if (withdraw != null) {
			IFormalParameter amountParameter = null;
			for (IFormalParameter fp: withdraw.getFormalParametersList()) {
				if (fp.getName().equals("amount")) {
					amountParameter = fp;
					break;
				}
			}
			if (amountParameter != null) {
				amountInput = new TextFieldIntegerInput(amountFormatter);
				amountInput.setValue(1);
				withdrawButton = new ElementEventButtonWithParameter<Integer>(engine, atm, withdraw, amountParameter, amountInput) {
					@Override
					protected void showResult(Interaction interaction) {
						if (SwingUtilities.isEventDispatchThread()) {
							outputField.setText("");
						} else {
							SwingUtilities.invokeLater(new Runnable() {
								public void run() {
									outputField.setText("");
								}
							});
						}
					}
				};
			}
		}
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Widthdraw Money"));
		panel.setLayout(new GridLayout(1,1));
		panel.add(amountInput);
		panel.add(withdrawButton);
		this.add(panel);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Other actions"));
		panel.setLayout(new GridLayout(1,1));
		
		EventType balance = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("balance")) {
				balance = et;
				break;
			}
		}
		
		if (balance != null) {
			IFormalParameter amountParameter = null;
			for (IFormalParameter fp: balance.getFormalParametersList()) {
				if (fp.getName().equals("balance")) {
					amountParameter = fp;
					break;
				}
			}
			final IFormalParameter formParam = amountParameter;
			balanceButton = new ElementEventButton(engine, null, atm, balance, panel) {
				@Override
				protected void showResult(Interaction interaction) {
					IChoice choice = interaction.getElementsChoice(this.element);
					Event event = choice.getEvent(this.eventType);
					if (event != null && formParam != null) {
						final Parameter param = event.getParameter(formParam);
						if ( param.getValue() instanceof Integer) {
							if (SwingUtilities.isEventDispatchThread()) {
								outputField.setText("Current balance is: " + param.getValue());
							} else {
								SwingUtilities.invokeLater(new Runnable() {
									public void run() {
										outputField.setText("Current balance is: " + param.getValue());
									}
								});
							}
						}
					}
				}
			};
			balanceButton.initialize();
		}
		
		EventType exit = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("exit")) {
				exit = et;
				break;
			}
		}
		if (exit != null) {
			exitButton = new ElementEventButton(engine, null, atm, exit, panel) {
				@Override
				protected void showResult(Interaction interaction) {
					if (SwingUtilities.isEventDispatchThread()) {
						outputField.setText("Bye! Please, remove your card.");
					} else {
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								outputField.setText("Bye! Please, remove your card.");
							}
						});
					}
				}
			};
			exitButton.initialize();
		}
		this.add(panel);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Output"));
		panel.setLayout(new GridLayout(1,1));
		
		this.outputField = new JTextArea();
		this.outputField.setEditable(false);
		panel.add(outputField);
		this.add(panel);

		this.setVisible(true);
		
		engine.addController(this);
	}
	
	public void addElement(Object element) {
		// DO NOTHING
	}

	public void removeElement(Object element) {
		// DO NOTHING
	}

	public synchronized void elementEncountered(Object element) {
		// DO NOTHING
	}

	/* (non-Javadoc)
	 * @see java.awt.Window#dispose()
	 */
	@Override
	public void dispose() {
		if (!isDisposed()) {
			try {
				engine.removeController(this);
			} catch (EngineTerminatedException e) {}
			if (SwingUtilities.isEventDispatchThread()) {
				dodispose();
			} else {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						ATMGUI.this.dodispose();
					}
				});
			}
		}
	}
	
	private void dodispose() {
		enterPinButton.dispose();
		withdrawButton.dispose();;

		balanceButton.dispose();
		exitButton.dispose();
		
		engine.removeController(this);
		super.dispose();
	}
	
	private boolean isDisposed = false;
	
	private synchronized boolean isDisposed() {
		if (!isDisposed) {
			isDisposed = true;
			return false;
		} else {
			return true;
		}
	}

	static public ATMGUI createATMGUI(final ExecutionEngine engine, final HW atm) {
		if (SwingUtilities.isEventDispatchThread()) {
			return new ATMGUI(engine, atm);
		} else {
			
			SwingOperation<ATMGUI> operation =
					new SwingOperation<ATMGUI>() {

						@Override
						public ATMGUI execute() {
							return new ATMGUI(engine, atm);
						}
				
			};
			return operation.invokeAndWait();
		}
	}

}
