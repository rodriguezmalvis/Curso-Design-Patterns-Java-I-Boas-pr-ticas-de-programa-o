package br.com.alura.acoes;

import br.com.alura.notafiscal.NotaFiscal;

public class Impresora implements Acoes{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo nota fiscal");
	}

}
