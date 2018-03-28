package dk.dtu.imm.se.ecno.model.ecno.diagram.advice;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;

/**
 * This command removes references to the coordination sets of all sychronisations
 * contained in the reference before the reference itself is deleted.
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 * 
 */
public class DeleteReferenceCommand extends AbstractTransactionalCommand {

	private Reference reference;
	
	public DeleteReferenceCommand(Reference object) { 
		super(TransactionUtil.getEditingDomain(object),
				"Remove synchronisations of reference from attached coordination set",
				Collections.singletonList(WorkspaceSynchronizer.getFile(object.eResource())));
		this.reference = object;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (reference == null) {
			return CommandResult.newErrorCommandResult("Invalid input");
		}
		
		for (Synchronisation synch: reference.getSynchronisations()) {
			synch.setCoordinationSet(null);
		}
		
		return CommandResult.newOKCommandResult();
	}

}
