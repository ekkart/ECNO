package dk.dtu.imm.se.ecno.diagram.decorators;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Image;

import dk.dtu.imm.se.ecno.model.ecno.ImportedType;

public class ImportDecorator extends AbstractDecorator {


    private ImportedType importedType;
    private Image icon;
    
    private TransactionalEditingDomain domain;
    private ChangeListener listener;
    
    private class ChangeListener implements NotificationListener {

        IDecorator decorator;

        public ChangeListener(IDecorator decorator) {
            this.decorator = decorator;
        }

        public void notifyChanged(Notification evt) {
            decorator.refresh();
        }

    }
   
    public ImportDecorator(IDecoratorTarget decoratorTarget, Image icon) {
        super(decoratorTarget);
    	IGraphicalEditPart editPart = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
    	EObject eObject = editPart.resolveSemanticElement();
        if (eObject instanceof ImportedType) {
        	importedType = (ImportedType) eObject;
        	domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(importedType);
            listener = new ChangeListener(this);
            
        }
        this.icon = icon;

        
        
    }
   
	@Override
    public void activate() {
    	if (importedType != null) {
    		DiagramEventBroker.getInstance(domain).addNotificationListener(importedType, listener);
    	}
    	refresh();
    }

	@Override
	public void deactivate() {
    	if (importedType != null) {
    		DiagramEventBroker.getInstance(domain).removeNotificationListener(importedType, listener);
    	}
		super.deactivate();
	}

	public void refresh() {
		removeDecoration();
		if (importedType.isImported() ) {
			setDecoration(getDecoratorTarget().addShapeDecoration(icon, IDecoratorTarget.Direction.NORTH_EAST, -1, false));
			Label tooltip = new Label("Imported Type");
			getDecoration().setToolTip(tooltip);
		}
	}

}

