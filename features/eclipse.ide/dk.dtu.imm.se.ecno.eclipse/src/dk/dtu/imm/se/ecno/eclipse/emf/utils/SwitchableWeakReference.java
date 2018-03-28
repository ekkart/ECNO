package dk.dtu.imm.se.ecno.eclipse.emf.utils;

import java.lang.ref.WeakReference;

public class SwitchableWeakReference<E> extends WeakReference<E> {

	/**
	 * A strong reference used to hold the reference, if the reference
	 * is in strong mode. Not used for anything else.
	 */
	@SuppressWarnings("unused")
	private E hold;
	
	public SwitchableWeakReference(E object) {
		super(object);
		hold = object;
	}
	
	public void makeWeak() {
			hold = null;
	}
	
	public void makeStrong() {
		hold = this.get();
	}

}
