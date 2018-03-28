package coded.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.impl.EAttributeImpl;

import workflow.Process;
import workflow.coordination.WorkflowEcnoModel;
import workflow.impl.CaseImpl;
import workflow.impl.ProcessImpl;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;

public class CaseManagementGUI extends JFrameECNO implements IController, IWorkflowGUI, Adapter{

	private JPanel contentPane;
    
	private JLabel lblCases;
	private JLabel testLabel;
    private JList processList;
   
    private JButton btnCreateCase;
    private JList caseList;
   
	
    private DefaultListModel<String> caseListModel = new DefaultListModel<String>();
    private DefaultListModel<String> processListModel = new DefaultListModel<String>();
    
	public CaseManagementGUI(ExecutionEngine executionEngine, WorkflowEcnoModel model) {
		super(executionEngine, model);
		setResizable(false);
		initGUI();
		executionEngine.addController(this);
	}

	private void initGUI() {
		setTitle("Workflow Engine"); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 359, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Case Management");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 179, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblLoadedProcesses = new JLabel("Business Process Models");
		lblLoadedProcesses.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLoadedProcesses.setBounds(10, 50, 143, 14);
		contentPane.add(lblLoadedProcesses);
		
		btnCreateCase = new JButton("Create Case");
		btnCreateCase.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCreateCase.setBounds(10, 199, 100, 23);
		contentPane.add(btnCreateCase);
		
		btnCreateCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String string = (String) processList.getSelectedValue();
				if (string != null)
				{
					ProcessImpl process = (ProcessImpl) guiObject2ObjectMap.get(string);
					ECNOConnector connector = getEcnoConnector(process, "CreateCase");
					connector.execute();
				}

			}
		});
		
		lblCases = new JLabel("Cases");
		lblCases.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCases.setBounds(10, 251, 46, 14);
		contentPane.add(lblCases);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 75, 335, 113);
		contentPane.add(scrollPane);
		
		processList =  new JList(processListModel);
		scrollPane.setViewportView(processList);
		processList.setFont(new Font("Arial", Font.PLAIN, 10));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 278, 335, 125);
		contentPane.add(scrollPane_1);
		
		caseList = new JList(caseListModel);
		scrollPane_1.setViewportView(caseList);
		caseList.setFont(new Font("Arial", Font.PLAIN, 10));
		
		processList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
		
		String string = (String) processList.getSelectedValue();
		if (string != null) {
			
			ProcessImpl process = (ProcessImpl) guiObject2ObjectMap.get(string);
			ECNOConnector connector = getEcnoConnector(process, "CreateCase");
 			connector.putParameterValueWithUpdate("process", process);
			
		}

			}
		});
		
		
		setVisible(true);
		
		
		this.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e) {
						CaseManagementGUI.this.dispose();
					}

				});
	}

	@Override
	public void addElement(Object element) {
		
		if (element.getClass().equals(ProcessImpl.class))
			addProcess((ProcessImpl) element);
		
		if (element.getClass().equals(CaseImpl.class))
			addCase((CaseImpl) element);
   	
	}

	private void addCase(CaseImpl element) {
		
		// Add object to GUI and map
		
		String string = "(ID: "+element.getId()+") Client: "+element.getClient()
				+"    Process: "+((Process) element.getProcess()).getName();
		
		
		caseListModel.addElement(string);
		addGuiMapping(element, string);
		setVisible(true);
		
		// Add GUI as observer/adapter
		
		element.eAdapters().add(this);
			
	}

	
	private void addProcess(ProcessImpl element) {
		
		// add object to GUI and map
		
		String string = element.getName();
		processListModel.addElement(string);
		addGuiMapping(element, string);
		setVisible(true);
		
		// create ECNO connector for this element event
		
		ECNOConnector connector = this.registerEcnoConnector(element, "CreateCase");
		
	}
	
	@Override
	public void removeElement(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elementEncountered(Object element) {

		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventDidEnable(boolean enabled, ECNOConnector caller) {
		
		if (caller.element.getClass().equals(ProcessImpl.class))
			btnCreateCase.setEnabled(enabled);
		
	}
	
	
	
	private boolean disposing = false;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	
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

	@Override
	public void notifyChanged(Notification notification) {

		CaseImpl case_ = (CaseImpl) notification.getNotifier();
		Object feature = notification.getFeature();
		
		if (feature instanceof EAttributeImpl) {
			EAttributeImpl attribute = (EAttributeImpl) feature;
			if (attribute.getName().equals("finished")) {
				caseListModel.removeElement(object2GuiObjectMap.get(case_));
				object2GuiObjectMap.remove(case_);
				setVisible(true);
			}
		}
	
	}

	@Override
	public Notifier getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAdapterForType(Object type) {
		// TODO Auto-generated method stub
		return false;
	}
}
