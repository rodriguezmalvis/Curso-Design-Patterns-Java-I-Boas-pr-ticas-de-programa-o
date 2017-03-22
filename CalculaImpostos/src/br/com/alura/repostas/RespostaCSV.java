package br.com.alura.repostas;

import br.com.alura.model.Conta;
import br.com.alura.model.Formato;
import br.com.alura.model.Requisicao;

public class RespostaCSV implements Resposta{

	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.CSV)){
			return "titular:"+conta.getTitular()+";saldo:"+conta.getSaldo();
		}
		return resposta.responde(req, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
