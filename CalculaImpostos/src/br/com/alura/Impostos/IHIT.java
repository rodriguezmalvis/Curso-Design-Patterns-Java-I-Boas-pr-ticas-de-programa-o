package br.com.alura.Impostos;

import java.util.ArrayList;

import br.com.alura.model.Item;
import br.com.alura.model.Orcamento;

public class IHIT extends TemplateImpostosDoisCondicoes{

	public IHIT(Imposto imposto){
		super(imposto);
	}
	
	public IHIT(){}
	
	@Override
	protected boolean temImpostoMaximo(Orcamento orcamento) {
		return temDoisItensMesmoNome(orcamento);
	}

	private boolean temDoisItensMesmoNome(Orcamento orcamento) {
		ArrayList<Item> itensNoOrcamento = new ArrayList<>();
		
		for (Item item : orcamento.getItens()) {
			if(itensNoOrcamento.contains(item.getNome())){
				return true;
			}else{
				itensNoOrcamento.add(item);
			}
		}
		return false;
	}

	@Override
	protected Double impostoMaximo(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected Double impostoMinimo(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

}
