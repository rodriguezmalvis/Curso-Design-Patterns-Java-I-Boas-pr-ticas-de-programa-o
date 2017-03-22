package br.com.alura.Investimentos;

import br.com.alura.model.Conta;

public class Conservador implements Investimento {

	@Override
	public Double calculaInvestimento(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
