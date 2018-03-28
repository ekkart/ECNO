package coded.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import workflow.CaseI;
import workflow.DefaultDocument;
import workflow.Document;
import workflow.DocumentContainer;
import workflow.DocumentType;
import workflow.FieldValue;
import workflow.RuntimeGlobalAspect;
import workflow.WorkflowEngine;
import coded.util.GlobalUtil;

public class FindDocumentDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private GlobalUtil util = GlobalUtil.getInstance();
	private DocumentType type;
	private DocumentContainer database;
	
	private JTree tree;
	private MissingDocumentPanel parent;
	

	public FindDocumentDialog(MissingDocumentPanel parent, CaseI caseI, DocumentType type) {
		
		WorkflowEngine workflowEngine = (WorkflowEngine) caseI.getCore().getRuntimeCoreModel().eContainer();
		for (RuntimeGlobalAspect runtimeGlobalAspect : workflowEngine.getRuntimeGlobalAspects()) {
			if (runtimeGlobalAspect instanceof DocumentContainer) {
				this.database = (DocumentContainer)runtimeGlobalAspect;		
			}
		}

		this.type = type;
		this.parent = parent;
		
		initGUI();
	}
	
	@SuppressWarnings("serial")
	private void initGUI() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Document Browser");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 36, 414, 182);
			contentPanel.add(scrollPane);
			{
				tree = new JTree();
				tree.setModel(new DefaultTreeModel(
					new DefaultMutableTreeNode("Documents") {
						{
							DefaultMutableTreeNode node_1;
							
							for (Document d : database.getDocuments()) {
								DefaultDocument doc = (DefaultDocument)d;
								if (doc.getDocumentType() == type) {
									node_1 = new DefaultMutableTreeNode(new ElementItem(doc));
									
									for (FieldValue fieldValue : doc.getFieldValues()) {
										String string = fieldValue.getField().getName() +" = "+fieldValue.getValue(); 
										node_1.add(new DefaultMutableTreeNode(string));
									}
	
									add(node_1);
								}
							}
							
					
						}
					}
				));
				tree.setRootVisible(false);
				scrollPane.setViewportView(tree);
			}
		}
		
		JLabel lblChoseADocument = new JLabel("Chose a document to use...");
		lblChoseADocument.setFont(new Font("Arial", Font.PLAIN, 11));
		lblChoseADocument.setBounds(10, 11, 215, 14);
		contentPanel.add(lblChoseADocument);
		
		JButton btnNewButton = new JButton("Select");

		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				if (node != null) {
					
					if (!(node.getUserObject() instanceof ElementItem))
						node = (DefaultMutableTreeNode) node.getParent();
					
					if (node.getUserObject() instanceof ElementItem) {
						ElementItem item = (ElementItem) node.getUserObject();
						if (item.getElement() instanceof Document) {
							parent.setDocument((Document) item.getElement());
							FindDocumentDialog.this.dispose();
						}
					
					}
					
					
				}
			}
		});
		btnNewButton.setBounds(10, 228, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindDocumentDialog.this.dispose();
			}
		});
		btnNewButton_1.setBounds(110, 229, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		setVisible(true);
		
	}
}
