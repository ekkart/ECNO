package ecno.bankingsystem.code.gui;

import dk.dtu.compute.se.ecno.statespace.Element;

class Item<TYPE extends Element> {

	final TYPE element;
	
	Item(TYPE object) {
		this.element = object;
	}
	
	public String toString() {
		if (element == null) {
			return "<none>";
		}
		return element.getUid()+"";
	}

}
