package br.com.alura.repostas;

import br.com.alura.model.Conta;
import br.com.alura.model.Formato;
import br.com.alura.model.Requisicao;
import br.com.alura.model.Resposta;

public class RespostaXML implements Resposta{

	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.XML)){
			return "<conta><titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo></conta>";
		}
		return resposta.responde(req, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
