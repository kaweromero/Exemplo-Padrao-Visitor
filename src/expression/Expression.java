package expression;

import visitor.Visitor;



public interface Expression {
	
	void accept(Visitor v);

}
