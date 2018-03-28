package ecno.bankingsystem.code.gui;

import java.awt.GridLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.engine.EngineTerminatedException;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.gui.ElementEventButton;
import dk.dtu.imm.se.ecno.gui.SwingOperation;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.HW;
import emf.bankingsystem.NaturalPerson;
import emf.bankingsystem.PhysicalBankCard;
import emf.bankingsystem.Setting;

@SuppressWarnings("serial")
public class PersonGUI extends JFrame implements IController  {

	private ExecutionEngine engine;

	private ElementFeatureTextField cashStatus;
	private ElementFeatureTextField cardStatus;
	private ElementFeatureTextField atmStatus;

	private FromElementFeatureSelector<HW> atmSelector;
	private ElementEventButtonWithParameter<HW> selectATMButton;
	private FromElementFeatureSelector<PhysicalBankCard> cardSelector;
	
	private ElementEventButtonWithParameter<PhysicalBankCard> insertButton; 
	
	private ElementEventButton takeMoneyButton;
	private ElementEventButton takeCardButton;

	public PersonGUI(ExecutionEngine engine, Setting setting, NaturalPerson person) {
		super();
		this.engine = engine;
		dk.dtu.imm.se.ecno.model.ecno.Package ecnoPackage = null;
		INamespace namespace = engine.getNamespace("http://bankingsystem");
		if (namespace instanceof dk.dtu.imm.se.ecno.model.ecno.Package) {
			ecnoPackage = (dk.dtu.imm.se.ecno.model.ecno.Package) namespace;
		}
		
		ToolTipManager.sharedInstance().setInitialDelay(1000);
		ToolTipManager.sharedInstance().setDismissDelay(5*60*1000);
		
		this.setTitle("Banking Example: User " + person.getName());
		this.setSize(480,270);
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		cashStatus = new ElementFeatureTextField(person, BankingsystemPackage.eINSTANCE.getNaturalPerson_Owns()) {
			
			@Override
			void update() {
				Object object = element.eGet(feature);
				if (object instanceof Collection) {
					this.setText("Cash status: " + ((Collection<?>) object).size());
				} else {
					this.setText("<none>");
				}
			}
			
		};
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), ""));
		panel.setLayout(new GridLayout(1,1));
		panel.add(cashStatus);
		this.add(panel);
		
		cardStatus = new ElementFeatureTextField(person, BankingsystemPackage.eINSTANCE.getNaturalPerson_AvailableCards()) {
			
			@Override
			void update() {
				Object objects = element.eGet(feature);
				if (objects instanceof Collection) {
					String text = "Available cards:";
					for (Object card: (Collection<?>) objects) {
						if (card instanceof PhysicalBankCard) {
							text += "\n\r" + ((PhysicalBankCard) card).getNumber() + 
									"(" + ((PhysicalBankCard) card).getUid() +")";
						}
					}
					this.setText(text);
				} else {
					this.setText("<none>");
				}
			}
			
		};
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), ""));
		panel.setLayout(new GridLayout(1,1));
		panel.add(cardStatus);
		this.add(panel);
		
		EventType selectATM = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("selectATM")) {
				selectATM = et;
				break;
			}
		}
		if (selectATM != null) {
			IFormalParameter atmParameter = null;
			for (IFormalParameter fp: selectATM.getFormalParametersList()) {
				if (fp.getName().equals("atm")) {
					atmParameter = fp;
					break;
				}
			}
			if (atmParameter != null) {
				atmSelector = new FromElementFeatureSelector<HW>(setting, BankingsystemPackage.eINSTANCE.getSetting_Objects(), HW.class, true);
				selectATMButton = new ElementEventButtonWithParameter<HW>(engine, person, selectATM, atmParameter, atmSelector);
			}
		}
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Select ATM"));
		panel.setLayout(new GridLayout(1,1));
		panel.add(atmSelector);
		panel.add(selectATMButton);
		this.add(panel);
		
		atmStatus = new ElementFeatureTextField(person, BankingsystemPackage.eINSTANCE.getNaturalPerson_Uses()) {
			
			@Override
			void update() {
				Object objects = element.eGet(feature);
				String text = "ATM in use: ";
				if (objects instanceof Collection) {
					for (Object object: (Collection<?>) objects) {
						if (object instanceof HW) {
							text += ((HW) object).getUid() + " ";
						}
					}
					this.setText(text);
				} else {
					this.setText("<none>");
				}
			}
			
		};
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), ""));
		panel.setLayout(new GridLayout(1,1));
		panel.add(atmStatus);
		this.add(panel);
		
		EventType insertCard = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("insertCard")) {
				insertCard = et;
				break;
			}
		}
		if (insertCard != null) {
			IFormalParameter cardParameter = null;
			for (IFormalParameter fp: insertCard.getFormalParametersList()) {
				if (fp.getName().equals("card")) {
					cardParameter = fp;
					break;
				}
			}
			if (cardParameter != null) {
				cardSelector = new FromElementFeatureSelector<PhysicalBankCard>(person, BankingsystemPackage.eINSTANCE.getNaturalPerson_AvailableCards(), PhysicalBankCard.class, false);
				insertButton = new ElementEventButtonWithParameter<PhysicalBankCard>(engine, person, insertCard, cardParameter, cardSelector);
			}
		}
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Insert Bank Card"));
		panel.setLayout(new GridLayout(1,1));
		panel.add(cardSelector);
		panel.add(insertButton);
		this.add(panel);

		/*
		personPanel = new ElementButtonPanel(engine, null, person);
		this.add(personPanel);
		*/
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "ATM interactions"));
		panel.setLayout(new GridLayout(1,1));
		
		EventType takeMoney = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("takeMoney")) {
				takeMoney = et;
				break;
			}
		}
		if (takeMoney != null) {
			takeMoneyButton = new ElementEventButton(engine, null, person, takeMoney, panel);
			takeMoneyButton.initialize();
		}
		
		EventType takeCard = null;
		for (EventType et  : ecnoPackage.getEventTypes()) {
			if (et.getName().equals("takeCard")) {
				takeCard = et;
				break;
			}
		}
		if (takeCard != null) {
			takeCardButton = new ElementEventButton(engine, null, person, takeCard, panel);
			takeCardButton.initialize();
		}
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
						PersonGUI.this.dodispose();	
					}
				});
			}

		}
	}
	
	private void dodispose() {
		if (cashStatus != null) {
			cashStatus.dispose(); 
		}
		if (cardStatus != null) {
			cardStatus.dispose();
		}
		if (atmStatus != null) {
			atmStatus.dispose();
		}
		if (atmSelector != null) {
			atmSelector.dispose();
		}
		if (selectATMButton != null) {
			selectATMButton.dispose();
		}
		if (cardSelector != null) {
			cardSelector.dispose();
		}
		if (insertButton != null) {
			insertButton.dispose();
		}
		if (takeCardButton != null) {
			takeCardButton.dispose();
		}
		if (takeMoneyButton != null) {
			takeMoneyButton.dispose();
		}

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

	static public PersonGUI createPersonGUI(final ExecutionEngine engine, final Setting setting,
			final NaturalPerson person) {
		if (SwingUtilities.isEventDispatchThread()) {
			return new PersonGUI(engine, setting, person);
		} else {
			SwingOperation<PersonGUI> operation =
					new SwingOperation<PersonGUI>() {

						@Override
						public PersonGUI execute() {
							return new PersonGUI(engine, setting, person);
						}
				
			};
			return operation.invokeAndWait();
		}
	}
	
	/*
	static public PersonGUI createPersonGUI(final ExecutionEngine engine, final Setting setting,
			final NaturalPerson person) {
		if (SwingUtilities.isEventDispatchThread()) {
			return new PersonGUI(engine, setting, person);
		} else {
			final List<PersonGUI> result = new ArrayList<PersonGUI>();
			
			try {
				SwingUtilities.invokeAndWait(new Runnable() {

					@Override
					public void run() {
						result.add(new PersonGUI(engine, setting, person));
					}

				} );
			} catch (InvocationTargetException e) {
			} catch (InterruptedException e) {
			}
			
			if (result.size() == 1) {
				return result.get(0);
			} else {
				return null;
			}
		}
	}
	*/

}
