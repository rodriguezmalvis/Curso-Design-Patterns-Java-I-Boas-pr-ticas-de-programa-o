package br.com.alura.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private Double valor;
	private final List<Item> itens;

	public Orcamento(Double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public Double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
}
