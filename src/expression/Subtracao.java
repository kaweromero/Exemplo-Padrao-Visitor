package expression;

import visitor.Visitor;

public class Subtracao implements Expression{
	
	public Expression t1;
	public Expression t2;
	
	public Subtracao(Expression t1, Expression t2) {
		this.t1 = t1; 
		this.t2 = t2;
	}

	@Override
	public void accept(Visitor v) {
		v.visitaSubtracao(this);
	}

}
