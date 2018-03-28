package dk.dtu.imm.se.ecno.examples.workers.gui;

import javax.swing.*; 
import javax.swing.plaf.basic.BasicComboPopup;

import java.awt.*; 
import java.util.Vector; 

/**
 * An extension of JComboBox, which adjust the width of the popup list to its
 * actual width. This is a slightly adjusted version from
 * 
 * http://www.jroller.com/santhosh/entry/make_jcombobox_popup_wide_enough
 * 
 */
// got this workaround from the following bug: 
//      http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4618607 
@SuppressWarnings("serial")
public class WideComboBox<E> extends JComboBox<E> { 


	public WideComboBox() { 
    } 

    public WideComboBox(final E items[]){ 
        super(items); 
    } 

    public WideComboBox(Vector<E> items) { 
        super(items); 
    } 

        public WideComboBox(ComboBoxModel<E> aModel) { 
        super(aModel); 
    } 

    private boolean layingOut = false; 

    public void doLayout(){ 
        try{ 
            layingOut = true; 
                super.doLayout(); 
        }finally{ 
            layingOut = false; 
        } 
    } 

    public Dimension getSize(){ 
        Dimension dim = super.getSize(); 
        if(!layingOut) {
        	Object child = this.getAccessibleContext().getAccessibleChild(0);

        	if (child instanceof BasicComboPopup) {
        		BasicComboPopup popup = (BasicComboPopup)child;
        		// dim.width = Math.max(dim.width, getPreferredSize().width);
        		// eki: replaced the above line by the preferred width of the list:
        		JList<?> list = popup.getList();
        		dim.width = Math.max(dim.width, list.getPreferredSize().width);
        	}
        }
        return dim; 
    } 
}