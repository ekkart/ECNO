package dk.dtu.imm.se.ecno.examples.workers.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.examples.workers.Worker;
import dk.dtu.imm.se.ecno.examples.workers.coordination.WorkersModel;
import dk.dtu.imm.se.ecno.gui.ElementButtonPanel;

@SuppressWarnings("serial")
public class WorkersGUI extends JFrame implements IController  {
	
	private ExecutionEngine engine;
	
	private List<Worker> workers;
	
	private WorkerSelector workerSelector;
	private WorklistPanel worklistPanel;
	
	private ElementButtonPanel workerPanel;
	
	public WorkersGUI(final ExecutionEngine engine, final WorkersModel model) {
		super();
		this.engine = engine;
		workers = new ArrayList<Worker>();
		
		ToolTipManager.sharedInstance().setInitialDelay(300);
		ToolTipManager.sharedInstance().setDismissDelay(5*60*1000);
		
		this.setTitle("Workers Example: Worklist");
		this.setSize(480,270);
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		JButton button = new JButton();
		button.setText("New worklist panel");
		button.setToolTipText("Creates a new worklist panel.");

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				WorkersGUI workersGUI = new WorkersGUI(engine, model);
				for (Worker worker: workers) {
					workersGUI.addElement(worker);
				}
			}

		};
		button.addActionListener(actionListener);
		
		JPanel newPanel = new JPanel();
		newPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Open other worklist panel"));
		newPanel.add(button);
		newPanel.setLayout(new GridLayout(1,1));
		this.add(newPanel);

		
		workerSelector = new WorkerSelector(engine, this);
		this.add(workerSelector);
		
		worklistPanel = new WorklistPanel(engine, this, model);
		this.add(worklistPanel);
		this.setVisible(true);
		
		workerPanel = null;
		
		// Add a listener that terminates the WorkersGUI and unregisters it
		// from the engine. Note that the ECNO application terminates only
		// when all WorkersGUIs registered with the engine are terminated.
		this.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e) {
						WorkersGUI.this.dispose();
					}
				});
		
		engine.addController(this);
	}
	
	Worker lastSelected = null;
	
	void updateSelectedWorker() {
		Worker selected = workerSelector.getSelectedWorker();
		if (lastSelected != selected) {
			lastSelected = selected;
			if (workerPanel != null) {
				this.remove(workerPanel);
				workerPanel.dispose();
			}
			WorklistPanel worklistPanel = this.worklistPanel;
			if (worklistPanel != null) {
				worklistPanel.update();
			}
			workerPanel = new ElementButtonPanel(engine, null, selected);
			this.add(workerPanel);
			this.setVisible(true);
		}	
	}
	
	public synchronized void addElement(Object element) {
		if (element instanceof Worker) {
			Worker worker = (Worker) element;
			workers.add(worker);
			if (workerSelector != null ) {
				workerSelector.addWorker(worker);
			}
		}
	}

	public synchronized void removeElement(Object element) {
		if (element instanceof Worker) {
			Worker worker = (Worker) element;
			workers.remove(worker);
			if (workerSelector != null) {
				workerSelector.removeWorker(worker);
			}
		}
	}

	public synchronized void elementEncountered(Object element) {
		// DO NOTHING
	}
	
	Worker getSelectedWorker() {
		if (workerSelector != null) {
			return workerSelector.getSelectedWorker();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see java.awt.Window#dispose()
	 */
	@Override
	public void dispose() {
		if (!isDisposed()) {
			engine.removeController(this);
			super.dispose();
		}
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
	
	

}
