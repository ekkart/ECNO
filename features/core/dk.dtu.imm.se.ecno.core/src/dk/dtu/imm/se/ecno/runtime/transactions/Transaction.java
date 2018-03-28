package dk.dtu.imm.se.ecno.runtime.transactions;

/**
 * Abstract class characterizing a transaction. The method stop is used to let the
 * Transaction clean up when it is stopped. Note that this method will be called
 * by the TransactionManager. 
 * 
 * @author eki
 *
 */
public abstract class Transaction {

	abstract void stop();

}
