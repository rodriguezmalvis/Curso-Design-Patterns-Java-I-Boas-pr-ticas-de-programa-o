package br.com.alura.repostas;

import br.com.alura.model.Conta;
import br.com.alura.model.Requisicao;
import br.com.alura.model.Resposta;

public class RespostaSemFormato implements Resposta{

	@Override
	public String responde(Requisicao req, Conta conta) {
		return conta.toString();
	}

	@Override
	public void setProxima(Resposta resposta) {
		//nao tem proxima resposta		
	}

}
