package dk.dtu.imm.se.ecno.diagram.decorators;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import dk.dtu.imm.se.ecno.model.ecno.ImportedType;

/**
 * First experiments with ePNK decoration providers based on an example from
 * http://publib.boulder.ibm.com/infocenter/rsasehlp/v7r5m0/index.jsp?topic=/com.ibm.xtools.modeler.doc.isv/prog-guide/cust-shapes.html
 * 
 * @author eki
 *
 */
public class DecoratorProvider extends AbstractProvider implements
		IDecoratorProvider {
	
	private Image icon;
	
    public DecoratorProvider() {
		super();
		URL imageURL = Platform.getBundle("dk.dtu.imm.se.ecno.diagram.extensions").getEntry("icons/shortcut.gif");
		if (imageURL != null) {
			icon = ImageDescriptor.createFromURL(imageURL).createImage();	
		} else {
			icon = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);
		}
	}

	public void createDecorators(IDecoratorTarget decoratorTarget) {
        IGraphicalEditPart editPart = (IGraphicalEditPart)decoratorTarget.getAdapter(IGraphicalEditPart.class);
        if (editPart instanceof IPrimaryEditPart) {
            EObject eObject = editPart.resolveSemanticElement();
            if (eObject instanceof ImportedType) {
                decoratorTarget.installDecorator("ECNO-import-decorator", new ImportDecorator(decoratorTarget, icon));
            }
        }
    }

    public boolean provides(IOperation operation) {
        if (!(operation instanceof CreateDecoratorsOperation)) {
            return false;
        }
        IDecoratorTarget decoratorTarget = ((CreateDecoratorsOperation) operation).getDecoratorTarget();
        IGraphicalEditPart editPart = (IGraphicalEditPart)decoratorTarget.getAdapter(IGraphicalEditPart.class);
        if (editPart instanceof IPrimaryEditPart) {
            EObject eObject = editPart.resolveSemanticElement();
            return eObject instanceof ImportedType;
        }
        return false;
    }

}
