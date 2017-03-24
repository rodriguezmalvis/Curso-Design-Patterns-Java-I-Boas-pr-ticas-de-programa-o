package br.com.alura.estados;

import br.com.alura.model.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento{
	
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento){
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		}
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento aprovado nçao pode ser reprovado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já aprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estado = new Finalizado();
	}

}
