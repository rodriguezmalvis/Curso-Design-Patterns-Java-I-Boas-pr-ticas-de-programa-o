package br.com.alura.Impostos;

import br.com.alura.model.Orcamento;

public abstract class TemplateImpostosDoisCondicoes implements Imposto{

	@Override
	public Double calcula(Orcamento orcamento) {
		if(temImpostoMaximo(orcamento)){
			return impostoMaximo(orcamento);
		}else{
			return impostoMinimo(orcamento);
		}
	}

	protected abstract boolean temImpostoMaximo(Orcamento orcamento);

	protected abstract Double impostoMaximo(Orcamento orcamento);

	protected abstract Double impostoMinimo(Orcamento orcamento);

}
