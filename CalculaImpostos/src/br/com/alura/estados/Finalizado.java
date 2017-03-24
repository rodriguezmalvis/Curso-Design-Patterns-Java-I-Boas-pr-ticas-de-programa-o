package br.com.alura.estados;

import br.com.alura.model.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {

		throw new RuntimeException("Orçamentos finalizados não recebem descontos");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizado não podem mudar de estado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizado não podem mudar de estado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizado não podem mudar de estado");
	}

}
