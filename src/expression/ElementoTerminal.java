package expression;

import visitor.Visitor;

public class ElementoTerminal implements Expression{

	public int value;
	
	public ElementoTerminal(int value) {
		this.value = value;
	}

	@Override
	public void accept(Visitor v) {
		v.visitaElemTerminal(this);
	}

}
