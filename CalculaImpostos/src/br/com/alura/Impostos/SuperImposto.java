package br.com.alura.Impostos;

import br.com.alura.model.Orcamento;

public class SuperImposto extends Imposto {
	
	public SuperImposto() {}
	
	public SuperImposto(Imposto imposto){
		super(imposto);
	}

	@Override
	public Double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoOutroImposto(orcamento);
	}

}
