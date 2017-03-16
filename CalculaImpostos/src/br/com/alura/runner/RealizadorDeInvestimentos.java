package br.com.alura.runner;

import br.com.alura.model.Conta;
import br.com.alura.model.Investimento;

public class RealizadorDeInvestimentos {
	
	public void realiza(Conta conta,Investimento investimento){
		
		Double resultado = investimento.calculaInvestimento(conta);
		
		conta.deposita(resultado);
		
		System.out.println("Novo saldo da conta: "+conta.getSaldo());
	}
	
}
