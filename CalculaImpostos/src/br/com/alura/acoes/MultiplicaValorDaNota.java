package br.com.alura.acoes;

import br.com.alura.notafiscal.NotaFiscal;

public class MultiplicaValorDaNota implements Acoes{
	
	private Double numero;

	public MultiplicaValorDaNota(Double numero) {
		this.numero = numero;
	}

	@Override
	public void executa(NotaFiscal notaFiscal) {

		System.out.println(notaFiscal.getValorBruto() * numero);
		
	}
	
}
