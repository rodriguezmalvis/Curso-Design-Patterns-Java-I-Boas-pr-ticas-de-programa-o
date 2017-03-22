package br.com.alura.runner;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.filtros.FiltroMaior500Reais;
import br.com.alura.filtros.FiltroMenor100Reais;
import br.com.alura.model.Conta;

public class FiltraContas {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<>();
		Conta contaRuben = new Conta("Ruben");
		contaRuben.deposita(50.00);
		Conta contaAmina = new Conta("Amina");
		contaAmina.deposita(100.00);
		Conta contaAdrian = new Conta("Adrian");
		contaAdrian.deposita(600000.00);
		Conta contaPilar = new Conta("Pilar");
		contaPilar.deposita(5000.00);
		contas.add(contaRuben);
		contas.add(contaPilar);
		contas.add(contaAdrian);
		contas.add(contaAmina);
		
		List<Conta> filtradas = new FiltroMenor100Reais(new FiltroMaior500Reais()).filtra(contas);
		System.out.println(filtradas);
	}

}
