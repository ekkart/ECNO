package dk.dtu.imm.se.ecno.runtime.transactions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * A transaction that can lock elements (but only once), so that transactions
 * of this type run in isolation (I as in ACID). The locks will automatically
 * be released when the transaction stops.
 * 
 * @author eki
 *
 */
public class LockingTransaction extends Transaction {
	
	final static CanonicalComparator cmp = new CanonicalComparator();
	
	private LockManager lockManager;
	
	private List<Object> lockedElements;
	

	LockingTransaction(LockManager lockManager) {
		super();
		this.lockManager = lockManager;
		lockedElements = null;
	}
	
	@Override
	final void stop() {
		unlockAll();
	}
	
	private void unlockAll() {
		if (lockedElements != null) {
			for (Object element: lockedElements) {
				lockManager.unlock(this,element);
			}
			lockedElements.clear();
		}
	}

	public boolean lock(Set<Object> elements) {
		if (lockedElements != null) {
			throw new IllegalUseException("Locks may only be acquired once within the transaction.");
		} else {
			lockedElements = new ArrayList<Object>(elements.size());
		}

		// Note that in order to make sure that different LockingTransactions do not mutually block
		// each other, we acquire the locks in the same order for all LockingTransactions. 
		List<Object> sortedElements = new ArrayList<Object>(elements);  		
		Collections.sort(sortedElements, cmp);
		
		for (Object element: sortedElements) {
			if (lockManager.lock(this, element)) {
				lockedElements.add(element);
			} else {
				// If the lock on a single element is returning unsuccessfully, then all
				// operation returns false; note that the acquired locks will be released
				// when the transaction is stopped (in order to avoid concurrent modifications
				// of the list, we do not remove them here)!
				//
				// Note that a lock of a single element is returning unsuccessfully only
				// when  the single lock is aborted explicitly by calling abortLocking.
				return false;
			}
		}
		return true;
	}
	
	public void abortLocking() {
		lockManager.abortLocking(this);
	}

}
