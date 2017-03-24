package br.com.alura.acoes;

import br.com.alura.notafiscal.NotaFiscal;

public class PersisteNota implements Acoes{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Persistindo nota Email");
	}

}
