package br.com.alura.Impostos;

import br.com.alura.model.Item;
import br.com.alura.model.Orcamento;

public class IKCV extends TemplateImpostosDoisCondicoes{

	@Override
	protected boolean temImpostoMaximo(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaisDe100Reais(orcamento);
	}

	private boolean temItemMaisDe100Reais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Double impostoMaximo(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected Double impostoMinimo(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
