package br.com.alura.descontos;

import br.com.alura.model.Desconto;
import br.com.alura.model.Orcamento;

public class DescontoMaisDeZincoItens implements Desconto{

	private Desconto desconto;

	@Override
	public Double calcula(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}
		return this.desconto.calcula(orcamento);
	}

	@Override
	public void SetProximoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}
