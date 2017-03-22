package br.com.alura.descontos;

import br.com.alura.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto desconto;

	@Override
	public Double calcula(Orcamento orcamento) {
		if(orcamento.existe("LAPIS") || orcamento.existe("CANETA")){
			return orcamento.getValor() * 0.05;
		}
		return this.desconto.calcula(orcamento);
	}

	@Override
	public void SetProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}
