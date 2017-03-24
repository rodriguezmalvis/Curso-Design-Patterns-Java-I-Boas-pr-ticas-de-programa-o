package br.com.alura.estados;

import br.com.alura.model.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento{
	
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento){
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		}
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estado = new Reprovado();
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estado = new Aprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Em aprovação não pode ir direto para Finalizado");
	}

}
