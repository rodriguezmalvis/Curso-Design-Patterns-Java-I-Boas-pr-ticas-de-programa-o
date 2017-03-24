package br.com.alura.runner;

import br.com.alura.model.Orcamento;

public class TesteDescontoExtra {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.00);
		
		orcamento.aplicaDescontoExtra();
		
		System.out.println(orcamento.getValor());
		
		orcamento.aprova();
		
		orcamento.aplicaDescontoExtra();
		
		System.out.println(orcamento.getValor());
		
		orcamento.finaliza();
		
		orcamento.aplicaDescontoExtra();
		
	}

}
