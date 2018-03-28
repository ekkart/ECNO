package dk.dtu.imm.se.ecno.runtime.transactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dk.dtu.imm.se.ecno.runtime.InvalidStateException;
import dk.dtu.imm.se.ecno.runtime.InvalidationNotifier;

/**
 * A simple transaction manager. Other objects can register with this transaction manager
 * to be notified, when the transaction finishes. This is used to defer the update of
 * other controllers until all changes of an interaction are made, and only update
 * once.
 * 
 * @author eki
 *
 */
public class TransactionManager {
		
	private Map<Thread,Transaction> thread2transaction;
	
	private Map<Transaction,List<InvalidationNotifier>> transaction2invalidationNotifier;
	
	final private LockManager lockManager;
	
	public TransactionManager(LockManager lockManager) {
		 thread2transaction = java.util.Collections.synchronizedMap(new HashMap<Thread,Transaction>());
		 transaction2invalidationNotifier = java.util.Collections.synchronizedMap(new HashMap<Transaction,List<InvalidationNotifier>>());
		 this.lockManager = lockManager;
	}
	
	/**
	 * This starts a new transaction. Only one transaction can be started in a thread.
	 * Otherwise, an exception will be raised. The returned Transaction (or rather
	 * a transaction handle), must eventually be terminated by calling the stopTransaction()
	 * method from within the same thread.
	 * 
	 * @return the transaction handle
	 * @throws InvalidStateException
	 */
	public Transaction startTransaction() throws InvalidStateException {
		Thread thread = Thread.currentThread();
		Transaction transaction = thread2transaction.get(thread);
		if (transaction != null) {
			throw new InvalidStateException();
		}
		
		transaction = new LockingTransaction(lockManager);
		thread2transaction.put(thread,transaction);
		List<InvalidationNotifier> list = new ArrayList<InvalidationNotifier>();
		transaction2invalidationNotifier.put(transaction,list);
		return transaction;
	}

	/**
	 * This stops the transaction. It must be called with the Transaction handle obtained
	 * by the startTransaction method and must be called from the same thread.  If the
	 * stopTransaction is called with an illegal (outdated, from another thread, or null)
	 * an exception is raised. When successful, all registered objects will be notified
	 * about the termination of the transaction.
	 * 
	 * @param transaction
	 * @throws InvalidStateException
	 */
	public void stopTransaction(Transaction transaction) throws InvalidStateException {
		Thread thread = Thread.currentThread();
		Transaction runningTransaction = thread2transaction.get(thread);
		if (transaction == null || runningTransaction == null || transaction != runningTransaction ) {
			throw new InvalidStateException();
		} else {
			transaction.stop();
			thread2transaction.remove(thread);
			List<InvalidationNotifier> list = transaction2invalidationNotifier.get(transaction);
			transaction2invalidationNotifier.remove(transaction);
			if (list != null) {
				for (InvalidationNotifier notifier: list) {
					notifier.notifyTransactionStopped();
				}
			}
		}
	}

	/**
	 * Checks whether there is a transaction active in the current thread.
	 * 
	 * @return true, if an transaction is active in the current thread
	 */
	public boolean inTransaction() {
		Thread thread = Thread.currentThread();
		return thread2transaction.get(thread) != null;
	}

	/**
	 * Registers an InvalidationNotifier to be notified, when the transaction on this thread is
	 * finished. Before calling this method, it should be checker with inTransation() whether
	 * there is a transaction active in the current thread; if there is no active transaction
	 * in the current thread, an exception will be raised.
	 * 
	 * @param notifier
	 * @throws InvalidStateException
	 */
	public void registerTransactionStoppedListener(InvalidationNotifier notifier) throws InvalidStateException {
		Thread thread = Thread.currentThread();
		Transaction transaction = thread2transaction.get(thread);
		if (transaction != null) {
			List<InvalidationNotifier> list = transaction2invalidationNotifier.get(transaction);
			list.add(notifier);
		} else {
			throw new InvalidStateException();
		}
	}
	
	
	/**
	 * Retunrs the lock manager associated with this transaction manager
	 * @return
	 */
	public LockManager getLockManager() {
		return lockManager;
	}

}
