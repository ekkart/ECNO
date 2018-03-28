package coded.gui;

import javax.swing.table.AbstractTableModel;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import workflow.DefaultDocument;

@SuppressWarnings("serial")
class DocTableModel extends AbstractTableModel {
   
    private final int cols = 2;
    private DefaultDocument document;
    private ElementItem item;
    public boolean isReadOnly = false;
    
    public DocTableModel(DefaultDocument document, ElementItem item) {
    	
    	this.document = document;
    	this.item = item;

    }
    
    public int getColumnCount() {
        return cols;
    }

    public int getRowCount() {

        return document.getFieldValues().size()+document.getEnumFieldValues().size();
    }

    public String getColumnName(int col) {
        if (col==0) return "Fields";
        if (col==1) return "Values";
    	
    	throw new RuntimeException("Column "+col+" does not exists");
    }

    public Object getValueAt(int row, int col) {
        
    	if (row < document.getFieldValues().size()) {
    		if (col==0) return document.getFieldValues().get(row).getField().getName();
        	if (col==1) return document.getFieldValues().get(row).getValue();    		
    	}
    	else {
    		if (col==0) return document.getEnumFieldValues().get(row-document.getFieldValues().size()).getEnumField().getName();
    		if (col==1) return document.getEnumFieldValues().get(row-document.getFieldValues().size()).getEnumValue().getName();
    	}
    	
    	
    	throw new RuntimeException("Column "+col+" does not exists");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    

    public boolean isCellEditable(int row, int col) {

    	if (isReadOnly) return false;
    	
        if (col == 0) {
            return false;
        } else {
        	return true;
        }
    }


    public void setValueAt(final Object value, final int row, int col) {
        
    	if (col!=1) throw new RuntimeException("Column "+col+" cannot be edited");
        
    	if (col==1) {
        	
    		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(document);
        	domain.getCommandStack().execute(new RecordingCommand(domain) {
        	   public void doExecute() {
        		   if(row < document.getFieldValues().size())
        			   document.getFieldValues().get(row).setValue((String) value);
        		   else
        			   document.getEnumFieldValues().get(row-document.getFieldValues().size()).setEnumValue(((ComboBoxLiteral) value).getLiteral());
        	   }
        	});

        }
    	
    	fireTableCellUpdated(row, col);
    	
    	// ECNO update needed for re-evaluation of finish conditions.
    	item.getConnector().update();
    }	   
}
