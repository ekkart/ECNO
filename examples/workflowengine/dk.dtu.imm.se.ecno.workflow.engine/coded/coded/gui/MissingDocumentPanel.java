package coded.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import workflow.CaseI;
import workflow.DefaultDocumentDescriptor;
import workflow.Document;
import workflow.Information;
import workflow.ProcessDocument;
import workflow.WorkflowFactory;
import coded.util.DefaultDocumentDescriptorUtil;

public class MissingDocumentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	private Document tmpDoc;
	private TaskGUI taskGui;
	private CaseI caseI;
	
	DefaultDocumentDescriptorUtil descrUtil = DefaultDocumentDescriptorUtil.getInstance();
	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;	
	
	public MissingDocumentPanel(Document tmpDoc, TaskGUI taskGui, CaseI caseI) {

		this.tmpDoc = tmpDoc;
		this.taskGui = taskGui;
		this.caseI = caseI;
		
		initGUI();
	}
	
	private void initGUI() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New Document");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// Re-construct a descriptor.
				
				final DefaultDocumentDescriptor descriptor = factory.createDefaultDocumentDescriptor();
				descriptor.setName(tmpDoc.getName());
				descriptor.setDocumentType(tmpDoc.getDocumentType());
				Information processI = (Information) caseI.getProcess();
				for (ProcessDocument processDoc : processI.getProcessDocuments()) 
					if (processDoc.getName().equals(tmpDoc.getName())) // required strict use of process document name as document name
						descriptor.setProcessDocument(processDoc);
	
				// The descriptor is needed here. A transaction is required as the EMF model is 
				// changed from the editing domain (a GUI panel).
				
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(caseI);
				domain.getCommandStack().execute(new RecordingCommand(domain) {
	        	   public void doExecute() {
	        		  
	        	      Document document = descrUtil.createDocument(descriptor, caseI);
	        	      taskGui.replaceTab(MissingDocumentPanel.this, tmpDoc, document);
	        	      
	        	   }
	        	});
				
				taskGui.item.getConnector().update();

			}
		});
		
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBounds(10, 48, 111, 23);
		add(btnNewButton);
		
		JLabel message = new JLabel("The document was not found within the current case.");
		message.setVerticalAlignment(SwingConstants.TOP);
		message.setHorizontalAlignment(SwingConstants.LEFT);
		message.setFont(new Font("Arial", Font.PLAIN, 11));
		message.setBounds(10, 18, 356, 23);
		add(message);
		
		JButton btnNewButton_1 = new JButton("Find...");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FindDocumentDialog(MissingDocumentPanel.this, caseI, tmpDoc.getDocumentType());
				
			}
		});
		btnNewButton_1.setBounds(131, 48, 111, 23);
		add(btnNewButton_1);
		
	}
	
	// Used for dialog callback.
	
	public void setDocument(final Document document){
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(caseI);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
    	   public void doExecute() {
    		  
    		  // Make the document exist in the context of this case.
    		  // Make it exist under the key that could not be found, not the original key. 
    		  caseI.getCaseDocuments().put(tmpDoc.getName(), document);
    		  // Replace the panel with the document.
    	      taskGui.replaceTab(MissingDocumentPanel.this, tmpDoc, document);
    	      
    	   }
    	});
	}
	
}
