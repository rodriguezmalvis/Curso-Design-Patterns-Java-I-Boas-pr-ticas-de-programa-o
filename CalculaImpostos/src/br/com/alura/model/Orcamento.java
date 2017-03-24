package br.com.alura.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.estados.EmAprovacao;
import br.com.alura.estados.EstadoDeUmOrcamento;

public class Orcamento {

	public Double valor;
	public EstadoDeUmOrcamento estado;
	private final List<Item> itens;

	public Orcamento(Double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		estado = new EmAprovacao();
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
	
	public boolean existe(String nomeItem){
		for (Item item : itens) {
			if(item.getNome().equals(nomeItem)){
				return true;
			}
		}
		return false;
	}

	public void aplicaDescontoExtra() {
		estado.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		estado.aprova(this);
	}
	
	public void reprova(){
		estado.reprova(this);
	}
	
	public void finaliza(){
		estado.finaliza(this);
	}
}
