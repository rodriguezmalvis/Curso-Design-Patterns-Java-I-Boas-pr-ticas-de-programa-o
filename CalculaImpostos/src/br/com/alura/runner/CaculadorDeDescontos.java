package br.com.alura.runner;

import br.com.alura.descontos.DescontoMaisDe500Reais;
import br.com.alura.descontos.DescontoMaisDeCincoItens;
import br.com.alura.descontos.DescontoPorVendaCasada;
import br.com.alura.descontos.SemDesconto;
import br.com.alura.model.Desconto;
import br.com.alura.model.Item;
import br.com.alura.model.Orcamento;


public class CaculadorDeDescontos {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("MMO2", 250.0));
		orcamento.adicionaItem(new Item("MMO3", 250.0));
		orcamento.adicionaItem(new Item("MMO4", 250.0));
		
		Double valorDoDesconto = calcula(orcamento);
		
		System.out.println("Valor do deconto: "+valorDoDesconto);
	}
	
	public static Double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoMaisDeCincoItens();
		Desconto d2 = new DescontoPorVendaCasada();
		Desconto d3 = new DescontoMaisDe500Reais();
		Desconto d4 = new SemDesconto();
		
		d1.SetProximoDesconto(d2);
		d2.SetProximoDesconto(d3);
		d3.SetProximoDesconto(d4);
		
		return d1.calcula(orcamento);
	}

}
