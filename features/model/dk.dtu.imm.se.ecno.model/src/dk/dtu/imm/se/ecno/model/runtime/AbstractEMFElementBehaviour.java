package dk.dtu.imm.se.ecno.model.runtime;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.AbstractElementBehaviour;

/**
 * @author kindler
 *
 */
public abstract class AbstractEMFElementBehaviour extends AbstractElementBehaviour {

	public AbstractEMFElementBehaviour(ExecutionEngine engine, IElementType type, EObject element) {
		super(engine, type, element);

		// add a listener to the element behind this behaviour, which
		// in turn notifies the ECNO change listeners about the changes.
		element.eAdapters().add(new Adapter() {

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
				// TODO: we could do this a bit more carefully, since
				//       not all changes here have an effect on ECNO
				int type = notification.getEventType();
				if (type >= Notification.SET && type <= Notification.MOVE) {
					// i.e type is one of the following;
					//       Notification.SET,      Notification.UNSET,
					//       Notification.ADD,      Notification.REMOVE, 
					//       Notification.ADD_MANY, Notification.REMOVE_MANY,
					//       Notification.MOVE 
					AbstractEMFElementBehaviour.this.notifyChangeListeners();
				}
			}

			@Override
			public void setTarget(Notifier arg0) {
			}

		});
	}

}