package br.com.alura.descontos;

import br.com.alura.model.Desconto;
import br.com.alura.model.Orcamento;

public class DescontoMaisDe500Reais implements Desconto{

	private Desconto desconto;

	@Override
	public Double calcula(Orcamento orcamento) {
		if(orcamento.getValor() > 500){
			return orcamento.getValor() * 0.07;
		}
		return this.desconto.calcula(orcamento);
	}

	@Override
	public void SetProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}
