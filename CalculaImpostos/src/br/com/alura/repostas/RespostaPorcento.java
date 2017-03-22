package br.com.alura.repostas;

import br.com.alura.model.Conta;
import br.com.alura.model.Formato;
import br.com.alura.model.Requisicao;

public class RespostaPorcento implements Resposta{

	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta) {
		if(req.getFormato().equals(Formato.PORCENTO)){
			return "Formato Porcento da Conta de "+conta.getTitular()+" com saldo: "+conta.getSaldo();
		}
		return resposta.responde(req, conta);
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
