package dk.dtu.imm.se.ecno.runtime;

import dk.dtu.imm.se.ecno.core.IReference;

public class Link {

	final public Object source;
	final public Object target;
	
	final public IReference reference;
	final public int index;
	
	final int hashCode;
	
	public Link(Object source, Object target, IReference refernce, int index) {
		super();
		this.source = source;
		this.target = target;
		this.reference = refernce;
		this.index = index;
		
		this.hashCode = this.source.hashCode() ^ 
				this.target.hashCode() ^
				this.reference.hashCode() ^
				index;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Link) {
			Link other = (Link) obj;
			if (this.hashCode != other.hashCode) {
				return false;
			}
			if (this.source.equals(other.source) &&
					this.target.equals(other.target) &&
					this.reference.equals(other.reference) &&
					this.index == other.index) {
				return true;
			} 
		} 
		return false;
	}

	@Override
	public int hashCode() {
		return hashCode;
	}
}
