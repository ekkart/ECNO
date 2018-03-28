package coded.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTable;

import workflow.coordination.WorkflowEcnoModel;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;

public class RuntimeEnvironmentStartupGUI extends JFrameECNO implements IController, IWorkflowGUI {
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	
	

	public RuntimeEnvironmentStartupGUI(ExecutionEngine executionEngine, WorkflowEcnoModel model) {
		super(executionEngine, model);
		// TODO Auto-generated constructor stub
		initGUI();
	}
	private void initGUI() {
		getContentPane().setLayout(null);
		
		JLabel lblWelcomeToRuntime = new JLabel("Workflow Runtime Environment ");
		lblWelcomeToRuntime.setForeground(new Color(0, 102, 0));
		lblWelcomeToRuntime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcomeToRuntime.setBounds(10, 33, 405, 25);
		getContentPane().add(lblWelcomeToRuntime);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 61, 363, 2);
		getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("Terminal Session");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AgentTerminalGUI(executionEngine, model);
				
			}
		});
		btnNewButton.setBounds(10, 90, 170, 60);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Resource Manager");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new OrganisationGUI(executionEngine, model);
			}
		});
		btnNewButton_1.setBounds(207, 90, 170, 60);
		getContentPane().add(btnNewButton_1);
		
		setVisible(true);
	}

	@Override
	public void addElement(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElement(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elementEncountered(Object element) {
		// TODO Auto-generated method stub
		
	}
}
