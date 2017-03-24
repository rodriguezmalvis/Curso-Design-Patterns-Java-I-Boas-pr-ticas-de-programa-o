package br.com.alura.estados;

import br.com.alura.model.Conta;

public class ContaNegativa implements EstadoDeUmaConta{

	@Override
	public void deposita(Double valor, Conta conta) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.95));
		if(conta.getSaldo() > 0){
			conta.setEstado(new ContaPositiva());
		}
	}

	@Override
	public void saque(Double valor, Conta conta) {
		throw new RuntimeException("Conta negativa não aceita saques");
	}

}
