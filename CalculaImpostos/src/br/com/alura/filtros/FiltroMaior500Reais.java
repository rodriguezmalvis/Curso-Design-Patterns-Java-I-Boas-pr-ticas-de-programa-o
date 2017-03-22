package br.com.alura.filtros;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.model.Conta;

public class FiltroMaior500Reais extends Filtro {

public FiltroMaior500Reais() {}
	
	public FiltroMaior500Reais(Filtro filtro){
		super(filtro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		ArrayList<Conta> contasFiltradas = new ArrayList<>();
		
		for (Conta conta : contas) {
			if(conta.getSaldo() > 500000.00){
				contasFiltradas.add(conta);
			}
		}
		
		if(proximoFiltro != null) contasFiltradas.addAll(proximoFiltro.filtra(contas));
		
		return contasFiltradas;
	}

}
