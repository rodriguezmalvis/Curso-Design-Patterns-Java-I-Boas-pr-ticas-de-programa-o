package br.com.alura.estados;

import br.com.alura.model.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento{
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento){

		throw new RuntimeException("Orçamentos reprovados não recebem descontos");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já reprovado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estado = new Finalizado();
	}

}
