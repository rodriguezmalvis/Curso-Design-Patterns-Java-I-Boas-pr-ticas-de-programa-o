package br.com.alura.runner;

import br.com.alura.acoes.Impresora;
import br.com.alura.acoes.MandaEmail;
import br.com.alura.acoes.MultiplicaValorDaNota;
import br.com.alura.acoes.PersisteNota;
import br.com.alura.model.Item;
import br.com.alura.notafiscal.CriadorDeNotaFiscalBuilder;
import br.com.alura.notafiscal.ItemDaNotaBuilder;
import br.com.alura.notafiscal.NotaFiscal;

public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		
		CriadorDeNotaFiscalBuilder builder = new CriadorDeNotaFiscalBuilder();
		
		builder.adicionaAcao(new Impresora());
		builder.adicionaAcao(new PersisteNota());
		builder.adicionaAcao(new MandaEmail());
		builder.adicionaAcao(new MultiplicaValorDaNota(2.0));
		
		builder.comCnpj("06274267786")
		.paraEmpresa("Caixa Assistencia Servidores da CEDAE")
		.comItem(
				new ItemDaNotaBuilder()
				.comNome("Item1")
				.comValor(100.00)
				.constroi()
				)
		.comItem(new Item("Item2", 200.00))
		.comItem(new Item("Item3", 300.00))
		.comObservacoes("Observações!!");
		
		NotaFiscal notaFiscal = builder.constroi();
		System.out.println(notaFiscal.getValorBruto());
		
	}

}
