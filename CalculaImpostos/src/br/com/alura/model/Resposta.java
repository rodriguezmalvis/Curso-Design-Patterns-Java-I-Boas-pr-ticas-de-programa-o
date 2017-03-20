package br.com.alura.model;

public interface Resposta {
	
	String responde(Requisicao req, Conta conta);
	
    void setProxima(Resposta resposta);
    
}
