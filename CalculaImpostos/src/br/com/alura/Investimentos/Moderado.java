package br.com.alura.Investimentos;

import java.util.Random;

import br.com.alura.model.Conta;

public class Moderado implements Investimento {

	@Override
	public Double calculaInvestimento(Conta conta) {
		Double valorDoInvestimento = 0.0;
		
		if(new Random().nextDouble() > 0.50){
			valorDoInvestimento = conta.getSaldo() * 0.025;
		}else{
			valorDoInvestimento = conta.getSaldo() * 0.007;
		}
		
		return valorDoInvestimento;
	}

}
