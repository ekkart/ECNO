package dk.dtu.imm.se.ecno.model.ecno.diagram.advice;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import dk.dtu.imm.se.ecno.model.ecno.Reference;



/**
 * This advice guarantees that the coordination sets of all sychronisations
 * contained in the reference are removed before the reference itself is deleted.
 * If this would not be done, the editor might contain dangling synchronisation
 * objects. 
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 *
 */
public class DeleteReferenceAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getBeforeDestroyElementCommand(
			DestroyElementRequest request) {
		
		EObject reference = request.getElementToDestroy();
		if (reference instanceof Reference && reference.eResource() != null) {
			return new DeleteReferenceCommand((Reference) reference);
		}

		return super.getBeforeDestroyElementCommand(request);
	}

}
