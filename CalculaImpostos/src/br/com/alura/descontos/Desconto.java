package br.com.alura.descontos;

import br.com.alura.model.Orcamento;

public interface Desconto {
	
	public Double calcula(Orcamento orcamento);
	public void SetProximoDesconto(Desconto desconto);

}
