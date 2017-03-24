package br.com.alura.estados;

import br.com.alura.model.Conta;

public class ContaPositiva implements EstadoDeUmaConta{

	@Override
	public void deposita(Double valor, Conta conta) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.98));
		if(conta.getSaldo() < 0){
			conta.setEstado(new ContaNegativa());
		}
	}

	@Override
	public void saque(Double valor, Conta conta) {
		conta.setSaldo(conta.getSaldo() - valor);
	}

}
