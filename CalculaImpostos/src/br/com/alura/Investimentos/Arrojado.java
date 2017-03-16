package br.com.alura.Investimentos;

import java.util.Random;

import br.com.alura.model.Conta;
import br.com.alura.model.Investimento;

public class Arrojado implements Investimento {

	@Override
	public Double calculaInvestimento(Conta conta) {
		Double valorDoInvestimento = 0.0;
		
		Double chance = new Random().nextDouble();
		
		if(chance < 0.20){
			valorDoInvestimento = conta.getSaldo() * 0.05;
		}else if(chance > 0.50){
			valorDoInvestimento = conta.getSaldo() * 0.03;
		}else{
			valorDoInvestimento = conta.getSaldo() * 0.006;
		}
			
		return valorDoInvestimento;
	}

}
