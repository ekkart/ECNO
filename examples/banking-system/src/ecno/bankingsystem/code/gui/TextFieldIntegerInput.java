package ecno.bankingsystem.code.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;

import dk.dtu.imm.se.ecno.runtime.IInvalidationListener;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

@SuppressWarnings("serial")
public class TextFieldIntegerInput extends JFormattedTextField implements IDynamicValueProvider<Integer> {

	// TODO this class could be implemented in a much more generic way

	private Set<IInvalidationListener> listeners;
	
	// private NumberFormatter formatter; 

	public TextFieldIntegerInput(NumberFormatter formatter) {
		// super();
		super(formatter);
		// this.formatter = formatter;
		
		this.listeners = new HashSet<IInvalidationListener>();
		
		this.setEditable(true);
		this.setPreferredSize( new Dimension(150,27));
		this.setText("0");
		
		this.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg) {
						// TODO could do this only when input changed
						TextFieldIntegerInput.this.notifyListeners();
					}

				});
		
		this.addMouseListener(
				new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) { }

					@Override
					public void mouseEntered(MouseEvent arg0) {
						TextFieldIntegerInput.this.setFocusable(true);
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						TextFieldIntegerInput.this.setFocusable(false);
						// TODO could do this only when input changed
						TextFieldIntegerInput.this.notifyListeners();
					}

					@Override
					public void mousePressed(MouseEvent arg0) { }

					@Override
					public void mouseReleased(MouseEvent arg0) { }

				});
		
		this.addFocusListener(
				new FocusListener() {

					@Override
					public void focusGained(FocusEvent arg0) { }

					@Override
					public void focusLost(FocusEvent arg0) {
						// TODO could do this only when input changed
						TextFieldIntegerInput.this.notifyListeners();
					}

				});
	}

	@Override
	public Integer getCurrentValue() {
		try {
			this.commitEdit();
		} catch (ParseException e) {}
		Object o = super.getValue();
		if (o instanceof Integer) {
			return (Integer) o;
		} else {
			return 0;
		}
	}

	@Override
	public void registerListener(IInvalidationListener listener)
			throws InvalidStateException {
		if (listeners != null) {
			listeners.add(listener);
		}
	}

	@Override
	public void unregisterListener(IInvalidationListener listener) {
		if (listeners != null) {
			listeners.remove(listener);
		}
	}

	private void notifyListeners() {
		for (IInvalidationListener listener: listeners) {
			listener.notifyInvalidation(this);
		}
	}

}
