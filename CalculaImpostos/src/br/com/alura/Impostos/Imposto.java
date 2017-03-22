package br.com.alura.Impostos;

import br.com.alura.model.Orcamento;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto() {}

	public Imposto(Imposto imposto) {
		this.outroImposto = imposto;
	}
	
	public abstract Double calcula(Orcamento orcamento);
	
	protected double calculoOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0.0;
		return outroImposto.calcula(orcamento);
	}

}
