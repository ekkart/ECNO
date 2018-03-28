package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.helpers;

import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import dk.dtu.imm.se.ecno.model.ecno.diagram.advice.DeleteReferenceAdvice;


/**
 * @generated
 */
public class ReferenceEditHelper extends EcnoBaseEditHelper {
	
	/**
	 * Add the edit helper advice that makes sure that the references to
	 * the coordination sets are deleted when the reference is deleted
	 * (along with its synchronisations). This is needed for making
	 * sure that the editor does not contain references to orphaned
	 * synchronisations.
	 * 
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	protected IEditHelperAdvice[] getEditHelperAdvice(IEditCommandRequest req) {
		IEditHelperAdvice[] advice = super.getEditHelperAdvice(req);

		if (req instanceof DestroyElementRequest) {
			IEditHelperAdvice[] tmp = advice;
			advice = new IEditHelperAdvice[tmp.length + 1];
			for (int i = 0; i < tmp.length; i++) {
				advice[i] = tmp[i];
			}
			// add the delete reference advice
			advice[tmp.length] = new DeleteReferenceAdvice();
		}

		return advice;
	}
}
