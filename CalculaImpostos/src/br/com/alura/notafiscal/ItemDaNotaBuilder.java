package br.com.alura.notafiscal;

import br.com.alura.model.Item;

public class ItemDaNotaBuilder {
	
	private String nome;
	private Double valor;

	public ItemDaNotaBuilder comNome(String nome){
		this.nome = nome;
		return this;
	}
	
	public ItemDaNotaBuilder comValor(Double valor){
		this.valor = valor;
		return this;
	}
	
	public Item constroi(){
		return new Item(nome, valor);
	}

}
