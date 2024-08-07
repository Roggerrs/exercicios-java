package lambdas;

import java.util.function.Predicate;

public class Produto extends Object {
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	
			Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
			
			Produto produto = new Produto("Notebook", 3893.89, 0.15);
			System.out.println(isCaro.test(produto));
		
	}
}
