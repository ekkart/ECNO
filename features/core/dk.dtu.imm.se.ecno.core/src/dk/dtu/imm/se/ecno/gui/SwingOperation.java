package dk.dtu.imm.se.ecno.gui;

import javax.swing.SwingUtilities;

public abstract class SwingOperation<G> {

	private boolean started;
	private boolean terminated;	
	private G result;
	
	public SwingOperation() {
		super();
		this.terminated = false;
		this.started = false;
		this.result = null;
	}

	abstract public G execute();

	public synchronized G invokeAndWait() {
		if (!started) {
			started = true;

			SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {

					result = execute();
					synchronized(SwingOperation.this) {
						terminated = true;
						SwingOperation.this.notifyAll();
					}
				}
			});

			while (!terminated) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}

			return result;
		} else {
			throw new IllegalStateException("Execution of SwingOperation can only be invoked once");
		}
	}
	
}
