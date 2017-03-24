package br.com.alura.estados;

import br.com.alura.model.Conta;

public interface EstadoDeUmaConta {
	
	void deposita(Double valor, Conta conta);
	void saque(Double valor, Conta conta);
	
}
