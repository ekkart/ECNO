package dk.dtu.imm.se.ecno.examples.workers.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.Border;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.examples.workers.Worker;

@SuppressWarnings("serial")
public class WorkerSelector extends JPanel {
	
	private Map<Worker,WorkerItem> workers;
	
	final WorkersGUI gui;
	
	final JComboBox<WorkerItem> comboBox;

	public WorkerSelector(ExecutionEngine engine, WorkersGUI gui) {
		super();
		this.gui = gui;
		
		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, " Select a worker ");
		
		this.setBorder(titled);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		workers = new HashMap<Worker,WorkerItem>();
		
		comboBox = new WideComboBox<WorkerItem>();
		comboBox.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  WorkerSelector.this.gui.updateSelectedWorker();
		      }
		    });
		this.add(comboBox);
	}
	
	void addWorker(Worker worker) {
		if (workers != null) {
			WorkerItem item = new WorkerItem(worker);
			workers.put(worker,item);
			comboBox.addItem(item);
		}
	}
	
	void removeWorker(Worker worker) {
		if (workers != null) {
			WorkerItem item = workers.get(worker);
			if (item != null) {
				workers.remove(worker);
				comboBox.removeItem(item);
			}
		}
	}
	
	Worker getSelectedWorker() {
		if (comboBox != null) {
			Object item = comboBox.getSelectedItem();
			if (item instanceof WorkerItem) {
				return ((WorkerItem) item).worker;
			}
		}
		return null;
	}
	
	void dispose() {
		if (workers != null) {
			comboBox.removeAllItems();
			this.remove(comboBox);
			workers = null;
		}
	}

}
