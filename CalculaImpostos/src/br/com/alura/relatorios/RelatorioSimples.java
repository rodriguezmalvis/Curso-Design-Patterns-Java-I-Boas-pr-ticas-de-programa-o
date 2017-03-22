package br.com.alura.relatorios;

import java.util.List;

import br.com.alura.model.Conta;

public class RelatorioSimples extends Relatorio{

	@Override
	protected void cabecalho() {
		System.out.println("Banco Itau");
	}

	@Override
	protected void rodape() {
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta : contas) {
          System.out.println( conta.getTitular() + " - " + conta.getSaldo());
        }
	}

}
