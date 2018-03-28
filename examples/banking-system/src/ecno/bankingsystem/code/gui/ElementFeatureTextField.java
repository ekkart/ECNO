package ecno.bankingsystem.code.gui;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EStructuralFeature;

import dk.dtu.compute.se.ecno.statespace.Element;

@SuppressWarnings("serial")
public class ElementFeatureTextField extends JTextArea {
	
	final Element element;
	final EStructuralFeature feature;
	
	private Adapter adapter;

	public ElementFeatureTextField(Element element, EStructuralFeature feature) {
		super();
		
		this.element = element;
		this.feature = feature;
		
		update();
		
		adapter = new Adapter() {

			@Override
			public Notifier getTarget() {
				return null;
			}

			@Override
			public boolean isAdapterForType(Object arg0) {
				return false;
			}

			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getNotifier().equals(ElementFeatureTextField.this.element) &&
						(notification.getEventType() == Notification.ADD ||
						 notification.getEventType() == Notification.ADD_MANY ||
						 notification.getEventType() == Notification.MOVE ||
						 notification.getEventType() == Notification.REMOVE ||
						 notification.getEventType() == Notification.REMOVE_MANY ||
						 notification.getEventType() == Notification.SET ||
						 notification.getEventType() == Notification.UNSET)) {
					if (SwingUtilities.isEventDispatchThread()) {
						ElementFeatureTextField.this.update();
					} else {
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								ElementFeatureTextField.this.update();
							}
						});
					}
				}
				
			}

			@Override
			public void setTarget(Notifier arg0) {
			}
			
		};
		
		element.eAdapters().add(adapter);
		
		this.setEditable(false);
	}
	
	void update() {
		Object object = element.eGet(feature);
		if (object != null) {
			this.setText(object.toString());
		} else {
			this.setText("<none>");
		}
	}

	void dispose() {
		if (adapter != null) {
			element.eAdapters().remove(adapter);
			adapter = null;
		}
	}

}
