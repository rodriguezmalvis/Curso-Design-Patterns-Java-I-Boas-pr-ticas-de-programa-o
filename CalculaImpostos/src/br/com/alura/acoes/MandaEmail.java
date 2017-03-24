package br.com.alura.acoes;

import br.com.alura.notafiscal.NotaFiscal;

public class MandaEmail implements Acoes{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando Email");
	}

}
