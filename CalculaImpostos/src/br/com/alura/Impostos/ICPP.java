package br.com.alura.Impostos;

import br.com.alura.model.Orcamento;

public class ICPP extends TemplateImpostosDoisCondicoes{

	@Override
	protected boolean temImpostoMaximo(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	protected Double impostoMaximo(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected Double impostoMinimo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.05;
	}

}
