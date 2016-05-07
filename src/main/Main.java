package main;

import visitor.ConcreteVisitor;
import visitor.Visitor;
import expression.ElementoTerminal;
import expression.Expression;
import expression.Soma;
import expression.Subtracao;

/**
 * Exemplo de como funciona um visitor.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 15 + 30
		Expression soma = new Soma(new ElementoTerminal(15), new ElementoTerminal(30));
		
		// 10 - 90
		Expression sub = new Subtracao(new ElementoTerminal(10), new ElementoTerminal(90));
		
		// (15 + 30) + (10 - 90)
		Expression total = new Soma(soma, sub);

		Visitor visitor = new ConcreteVisitor();

		System.out.println(visitor.visitaExpressao(total));

	}

}
