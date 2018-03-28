package dk.dtu.imm.se.ecno.eclipse.emf.utils;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;

public class WeakEList<E> extends DelegatingEcoreEList<E> {

	private static final long serialVersionUID = 1L;
	
	private final EStructuralFeature feature;
	private final WeakList<E> weakList;

	public WeakEList(InternalEObject owner, EStructuralFeature feature) {
		super(owner);
		this.feature = feature;
		this.weakList = new WeakList<E>();
	}

	@Override
	protected List<E> delegateList() {
		return weakList;
	}

	@Override
	public EStructuralFeature getEStructuralFeature() {
		return feature;
	}
	
	public boolean cleanPhantoms() {
		return weakList.cleanPhantoms();
		// TODO we might eventually create a notification for this change. The problem, however, is
		//      that we do not have the old value available any more (elements were and should remain)
		//      garbage collected. Moreover, we might not need a notification here anyway, since nobody
		//      holds references to the removed elements anyway. This needs some more experimentation.				
	}
	
	public void makeWeak() {
	   weakList.makeWeak();	
	}
	
	public void makeStrong() {
		weakList.makeStrong();
	}

}
