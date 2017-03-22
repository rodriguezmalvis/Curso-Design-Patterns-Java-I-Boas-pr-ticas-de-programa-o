package br.com.alura.Impostos;

import br.com.alura.model.Orcamento;

public abstract class TemplateImpostosDoisCondicoes extends Imposto{
	
	public TemplateImpostosDoisCondicoes() {}
	
	public TemplateImpostosDoisCondicoes(Imposto imposto){
		super(imposto);
	}

	@Override
	public Double calcula(Orcamento orcamento) {
		if(temImpostoMaximo(orcamento)){
			return impostoMaximo(orcamento) + calculoOutroImposto(orcamento);
		}else{
			return impostoMinimo(orcamento) + calculoOutroImposto(orcamento);
		}
	}

	protected abstract boolean temImpostoMaximo(Orcamento orcamento);

	protected abstract Double impostoMaximo(Orcamento orcamento);

	protected abstract Double impostoMinimo(Orcamento orcamento);

}
