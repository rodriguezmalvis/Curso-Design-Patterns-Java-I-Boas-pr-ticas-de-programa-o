package br.com.alura.repostas;

import br.com.alura.model.Conta;
import br.com.alura.model.Requisicao;

public interface Resposta {
	
	String responde(Requisicao req, Conta conta);
	
    void setProxima(Resposta resposta);
    
}
