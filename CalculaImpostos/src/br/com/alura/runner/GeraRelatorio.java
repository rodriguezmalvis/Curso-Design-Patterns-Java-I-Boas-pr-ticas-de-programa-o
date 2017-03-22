package br.com.alura.runner;

import java.util.ArrayList;

import br.com.alura.model.Conta;
import br.com.alura.relatorios.RelatorioComplexo;
import br.com.alura.relatorios.RelatorioSimples;

public class GeraRelatorio {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<>();
		Conta conta = new Conta("Ruben", "", "", "", "", null);
		conta.deposita(120.00);
		contas.add(conta);
		new RelatorioComplexo().imprime(contas);
		System.out.println("------------------------------------------");
		new RelatorioSimples().imprime(contas);
		
	}

}
