 package coded.gui;


 import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellEditor;

import workflow.Activity;
import workflow.ActivityI;
import workflow.Agent;
import workflow.Case;
import workflow.CaseI;
import workflow.DefaultDocument;
import workflow.Document;
import workflow.EnumLiteral;
import coded.util.GlobalUtil;

public class TaskGUI extends JFrame{
	GlobalUtil globalUtil = GlobalUtil.getInstance();
	
	private Activity activity;
	private Agent agent;
	
	Icon icon_in = new ImageIcon(getClass().getResource("/images/eye.png"));
	Icon icon_out = new ImageIcon(getClass().getResource("/images/edit.png"));
	
	protected AgentTerminalGUI parent;
	private JButton btnAccept;	
	private JTabbedPane tabs;
	
	private GlobalUtil util = GlobalUtil.getInstance();

	private JTable docTable;

	protected ElementItem item;

	// This is need so to remove self before disposing.

	
	public TaskGUI(AgentTerminalGUI parent, Activity activity, Agent agent, ElementItem item) {
		super();
		
		this.activity = activity;
		this.agent = agent;
		this.parent = parent;
		this.item = item;
		
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("Task Viewer");
		
		getContentPane().setLayout(null);
		setSize(469,570);
		
		Case case_ = (Case) activity.eContainer();
		//JLabel lblTaskName = new JLabel(activity.getTask().getName()+" (case id: "+((Case)activity.eContainer()).getId()+")");
		JLabel lblTaskName = new JLabel(activity.getTask().getName()+" -- in "+case_.getProcess().getName()+" ("+case_.getId()+")");
		
		lblTaskName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTaskName.setBounds(10, 11, 443, 22);
		getContentPane().add(lblTaskName);
		
		JLabel lblTaskDescription = new JLabel("[task description]");
		lblTaskDescription.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTaskDescription.setBounds(10, 38, 493, 40);
		getContentPane().add(lblTaskDescription);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 82, 443, 9);
		getContentPane().add(separator);
			
		tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setBounds(10, 96, 444, 392);
		getContentPane().add(tabs);
		
		ActivityI activityI = util.getActivityI(activity);		
		
		for (Document document : activityI.getIn()) {
			// If the same document is an output document we don't need to display
			// it as an input document.
			if(!(activityI.getOut().contains(document)))  
				insertTab(document, icon_in, true);
		}
		
		for (Document doc : activityI.getOut()) {
			DefaultDocument document = (DefaultDocument)doc;
			if (document.isPlaceholder()) {
				
				// Delegate to MissingDocumentPanal to create or find a document. It must known to caseI in 
				// order to add the document to the case.
				
				CaseI caseI = globalUtil.getCaseI((Case)activity.eContainer());
				tabs.addTab(document.getName(), icon_out, new MissingDocumentPanel(document, this, caseI));
				
			} else {
				
				insertTab(document, icon_out, false);
			}
			
		}
		
		setVisible(true);
		
		
		
		btnAccept = new JButton("Finish");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.finishActivity(item); // will also take down associated GUI (this one).
			}
		});
		btnAccept.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAccept.setBounds(10, 508, 113, 23);
		getContentPane().add(btnAccept);
		btnAccept.setIcon(new ImageIcon(getClass().getResource("/images/ok.png")));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 499, 443, 9);
		getContentPane().add(separator_1);
	}
	
	public void insertTab(Document document, Icon icon, boolean isReadOnly) {
		
		JTable docTable = createDocTable(document, isReadOnly);
	
		tabs.addTab(document.getName(), icon, new JScrollPane(docTable));
	}
	
	// This method is called by a MissingDocumentPanal from within a transaction. 
	
	public void replaceTab(MissingDocumentPanel panel, Document oldDocument, Document newDocument) {
		
		ActivityI activityI = util.getActivityI(activity);	
		activityI.getOut().remove(oldDocument);
		activityI.getOut().add(newDocument);
		
		JTable docTable = createDocTable(newDocument, false);
			
		int index = tabs.indexOfComponent(panel);
		
		//setVisible(false);
		tabs.setComponentAt(index, new JScrollPane(docTable));
		//setVisible(true);
	
	}
	
	public JTable createDocTable(Document document, boolean isReadOnly) {
		
		final DefaultDocument defDoc = (DefaultDocument)document;
		DocTableModel model = new DocTableModel(defDoc, this.item);
				
		final int enumStartRow = defDoc.getFieldValues().size();
		
		JTable docTable = new JTable(model)  {

			@Override
			public TableCellEditor getCellEditor(int row, int column)
			{
				int modelColumn = convertColumnIndexToModel( column );

				if (row < enumStartRow) 
					// The initial rows are fields.
					return super.getCellEditor(row, column);
				else {
					// The following rows are Enum fields.
					List<EnumLiteral> literals = defDoc.getEnumFieldValues().get(row-enumStartRow).getEnumField().getEnumLiterals();
					int size = literals.size();
					ComboBoxLiteral[] lit = new ComboBoxLiteral[size];
					for (int i = 0; i < size; i++) {
						lit[i] = new ComboBoxLiteral(literals.get(i));
					}
						
					JComboBox box = new JComboBox(lit);
		            return new DefaultCellEditor(box);
					
				}

			}
		};

		model.isReadOnly = isReadOnly;
		docTable.setRowSelectionAllowed(false);
		return docTable;
	}
	public void setFinishActivityEnabled(boolean enabled) {
		btnAccept.setEnabled(enabled);
		
	}
	
	@Override
	public void dispose() {
		
		parent.removeTaskGui(activity);
		super.dispose();		
	}
}
