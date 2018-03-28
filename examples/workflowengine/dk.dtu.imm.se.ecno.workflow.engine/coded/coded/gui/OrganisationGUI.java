package coded.gui;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import workflow.coordination.WorkflowEcnoModel;
import workflow.impl.AgentImpl;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;

public class OrganisationGUI extends JFrameECNO implements IController, IWorkflowGUI {

	private JPanel contentPane;
	
	private DefaultListModel<String> agentListModel = new DefaultListModel<String>();

	public OrganisationGUI (ExecutionEngine executionEngine, WorkflowEcnoModel model) {
		super(executionEngine, model);
		setResizable(false);
		setTitle("Workflow Engine");
		initGUI();
		executionEngine.addController(this);
	}
	
	public void initGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 286, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Human Resources");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 268, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Hire");
		btnNewButton.setBounds(10, 278, 120, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setEnabled(false);
		
		JButton btnS = new JButton("Lay off");
		btnS.setBounds(140, 278, 128, 23);
		contentPane.add(btnS);
		btnS.setEnabled(false);
		
		JLabel lblEmployees = new JLabel("Agents");
		lblEmployees.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEmployees.setBounds(10, 53, 89, 14);
		contentPane.add(lblEmployees);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 258, 189);
		contentPane.add(scrollPane);
		
		JList list = new JList(agentListModel);
		scrollPane.setViewportView(list);
		list.setFont(new Font("Arial", Font.PLAIN, 10));

		setVisible(true);
		
	}

	@Override
	public void addElement(Object element) {
		
		if (element.getClass().equals(AgentImpl.class))
			addAgent((AgentImpl) element);
		
	}

	@Override
	public void removeElement(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elementEncountered(Object element) {
		// TODO Auto-generated method stub
		
	}
	
	
	private void addAgent(AgentImpl element) {
		
		// add object to GUI and map

		//String role = element.getAgentRole().getName();
		String name = element.getName();
		//String string = name + " ("+role+")";
		//agentListModel.addElement(string);
		//addGuiMapping(element, string);
		setVisible(true);

	}
	
	
	private boolean disposing = false;
	private JTextField textField;
	private JTextField textField_1;
	
	private synchronized boolean isFirstDispose() {
		if (!disposing) {
            disposing = true;
            return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void dispose() {
		if (isFirstDispose()) {
			this.executionEngine.removeController(this);
			super.dispose();		
		}
	}
}
