package ecno.bankingsystem.code.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.imm.se.ecno.runtime.IInvalidationListener;

@SuppressWarnings("serial")
public class FromElementFeatureSelector<TYPE extends Element> extends JComboBox<Item<TYPE>> implements IDynamicValueProvider<TYPE> {
	
	final private EObject element;
	final private EStructuralFeature feature;
	final private Class<?> clazz;
	final private boolean withNull;
	
	private TYPE selected;
	
	private Set<IInvalidationListener> listeners;
	private Adapter adapter;

	public FromElementFeatureSelector(EObject element, EStructuralFeature feature, Class<TYPE> clazz, boolean withNull) {
		super();
		if (!feature.getEType().getInstanceClass().isAssignableFrom(clazz) ||
				feature.getUpperBound() != -1) {
			throw new RuntimeException("Illegal use of FromElementFeatureSelector");
		}
		
		this.element = element;
		this.feature = feature;
		this.clazz = clazz;
		this.withNull = withNull;

		//  = new HashMap<TYPE,Item<TYPE>>();
		selected = null;
		
		update();
		
		listeners = new HashSet<IInvalidationListener>();
		
		this.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				Object selectedItem = FromElementFeatureSelector.super.getSelectedItem();
				if (selectedItem instanceof Item) {
					Object selectedObject =  ((Item<?>) selectedItem).element;
					if (selectedObject == null || FromElementFeatureSelector.this.clazz.isInstance(selectedObject)) {
						if (selectedObject != FromElementFeatureSelector.this.selected) {
							FromElementFeatureSelector.this.selected = (TYPE) selectedObject;
							for (IInvalidationListener listener: listeners) {
								listener.notifyInvalidation(FromElementFeatureSelector.this);
							}
						}
					}
				}
			}
		});
		
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
				if (notification.getNotifier().equals(FromElementFeatureSelector.this.element) &&
						(notification.getEventType() == Notification.ADD ||
						 notification.getEventType() == Notification.ADD_MANY ||
						 notification.getEventType() == Notification.MOVE ||
						 notification.getEventType() == Notification.REMOVE ||
						 notification.getEventType() == Notification.REMOVE_MANY ||
						 notification.getEventType() == Notification.SET ||
						 notification.getEventType() == Notification.UNSET)) {
					if (SwingUtilities.isEventDispatchThread()) {
						FromElementFeatureSelector.this.update();
					} else {
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								FromElementFeatureSelector.this.update();
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
	}
	
	private void update() {
		this.removeAllItems();
		Object objects = element.eGet(feature);
		if (objects instanceof Collection) {
			if (withNull) {
				Item<TYPE> item = new Item<TYPE>(null);
				this.addItem(item);
			}
			for (Object object: (Collection<?>) objects) {
				if (clazz.isInstance(object) ) {
					@SuppressWarnings("unchecked")
					TYPE e = (TYPE) object;
					Item<TYPE> item = new Item<TYPE>(e);
					this.addItem(item);
					if (e == selected) {
						this.setSelectedItem(item);
					}
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public TYPE getCurrentValue() {
		Object object = this.getSelectedItem();
		if (object instanceof Item) {
			return ((Item<TYPE>) object).element;
		}
		return null;
	}

	@Override
	public void registerListener(IInvalidationListener listener) {
		if (!this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}
		
	}

	@Override
	public void unregisterListener(IInvalidationListener listener) {
		listeners.remove(listener);
	}

	void dispose() {
		this.removeAllItems();
		if (adapter != null) {
			element.eAdapters().remove(adapter);
			adapter = null;
		}
	}

}
