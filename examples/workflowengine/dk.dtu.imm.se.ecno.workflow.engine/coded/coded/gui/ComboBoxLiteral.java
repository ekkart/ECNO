package coded.gui;

import workflow.EnumLiteral;

public class ComboBoxLiteral {
	
	private EnumLiteral literal;
	
	public ComboBoxLiteral(EnumLiteral literal) {
		this.literal = literal;
	}
	
	@Override
	public String toString() {
		
		return literal.getName();
	
	}
	
	public EnumLiteral getLiteral() {
		return this.literal;
	}

}
