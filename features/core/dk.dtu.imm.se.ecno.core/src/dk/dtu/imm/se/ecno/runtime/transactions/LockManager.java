package dk.dtu.imm.se.ecno.runtime.transactions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LockManager {

	private Set<LockingTransaction> blockedTransactions;
	private Set<LockingTransaction> abortedTransactions;

	private Map<Object,LockingTransaction> lockedObjects;

	public LockManager() {
		super();
		blockedTransactions = new HashSet<LockingTransaction>();
		abortedTransactions = new HashSet<LockingTransaction>();

		lockedObjects = new HashMap<Object,LockingTransaction>();
	}

	public synchronized boolean lock(LockingTransaction transaction, Object object) {
		if (transaction != null) {
			blockedTransactions.add(transaction);
			boolean locked = false;
			boolean aborted = false;
			long start = System.currentTimeMillis();
			do {
				aborted = abortedTransactions.contains(transaction) || Thread.currentThread().isInterrupted();
				if (!aborted) {
					LockingTransaction t = lockedObjects.get(object);
					if (t == null) {
						lockedObjects.put(object, transaction);
						locked = true;
					} else {
						System.err.println("Wait for lock occurred!");
						try {
							wait(1100);
						} catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						} 
						if ((System.currentTimeMillis() - start) > 1000 ) {
							System.err.println("Waited for lock more than a second!");
							start = System.currentTimeMillis();
						}
					}
				} else {
					abortedTransactions.remove(transaction);
				}
			} while (!locked && !aborted);

			blockedTransactions.remove(transaction);
			return locked;
		} else {
			return false;
		}
	}

	public synchronized void unlock(LockingTransaction transaction, Object object) {
		if (transaction != null) {
			LockingTransaction t = lockedObjects.get(object);
			if (t == transaction) {
				lockedObjects.remove(object);
				notifyAll();
			}
		}
	}

	public synchronized void abortLocking(LockingTransaction transaction) {
		if (transaction != null) {
			if (blockedTransactions.contains(transaction)) {
				abortedTransactions.add(transaction);
				notifyAll();
			}
		}
	}

}
