package visitor;

import expression.ElementoTerminal;
import expression.Expression;
import expression.Soma;
import expression.Subtracao;

public class ConcreteVisitor implements Visitor{

	@Override
	public int visitaSoma(Soma s) {
		int t1 = this.visitaExpressao(s.t1);
		int t2 = this.visitaExpressao(s.t2);
		return (t1 + t2);
	}

	@Override
	public int visitaSubtracao(Subtracao s) {
		int t1 = this.visitaExpressao(s.t1);
		int t2 = this.visitaExpressao(s.t2);
		return (t1- t2);
	}

	@Override
	public int visitaElemTerminal(ElementoTerminal e) {
		return e.value;
	}

	@Override
	public int visitaExpressao(Expression e) {
		int ret;
		if(e instanceof Soma) {
			ret = this.visitaSoma((Soma) e);
		} else if (e instanceof Subtracao) {
			ret = this.visitaSubtracao((Subtracao) e);
		} else if (e instanceof ElementoTerminal) {
			ret = this.visitaElemTerminal((ElementoTerminal) e);
		} else {
			throw new UnsupportedOperationException(e.getClass().toString());
		}
		
		return ret;
	}


	

}
