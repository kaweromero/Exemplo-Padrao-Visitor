package visitor;

import expression.ElementoTerminal;
import expression.Expression;
import expression.Soma;
import expression.Subtracao;



public interface Visitor {
	
	int visitaSoma(Soma e);
	int visitaSubtracao(Subtracao e);
	int visitaElemTerminal(ElementoTerminal e);
	int visitaExpressao(Expression e);

}
