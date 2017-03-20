package br.com.alura.descontos;

import br.com.alura.model.Desconto;
import br.com.alura.model.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public Double calcula(Orcamento orcamento) {
		return 0.0;
	}

	@Override
	public void SetProximoDesconto(Desconto desconto) {
		// nao tem
	}

}
