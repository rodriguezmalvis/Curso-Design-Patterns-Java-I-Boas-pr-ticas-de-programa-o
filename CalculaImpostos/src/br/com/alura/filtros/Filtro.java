package br.com.alura.filtros;

import java.util.List;

import br.com.alura.model.Conta;

public abstract class Filtro {
	
	protected Filtro proximoFiltro;
	
	public Filtro() {}

	public Filtro(Filtro proximoFiltro) {
		this.proximoFiltro = proximoFiltro;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proximoFiltro(List<Conta> contas){
		return proximoFiltro.filtra(contas);
	}

}
