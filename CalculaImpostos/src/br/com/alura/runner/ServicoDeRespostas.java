package br.com.alura.runner;

import br.com.alura.model.Conta;
import br.com.alura.model.Formato;
import br.com.alura.model.Requisicao;
import br.com.alura.repostas.Resposta;
import br.com.alura.repostas.RespostaCSV;
import br.com.alura.repostas.RespostaPorcento;
import br.com.alura.repostas.RespostaSemFormato;
import br.com.alura.repostas.RespostaXML;

public class ServicoDeRespostas {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta("Ruben Rodriguez");
		conta.deposita(200.0);
		Requisicao requisicao = new Requisicao(Formato.XML);
		
		Resposta r1 = new RespostaXML();
		Resposta r2 = new RespostaCSV();
		Resposta r3 = new RespostaPorcento();
		
		Resposta r4 = new RespostaSemFormato();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		r3.setProxima(r4);
		
		 String contaFormatada = r1.responde(requisicao, conta);
		 
		 System.out.println(contaFormatada);
	}

}
