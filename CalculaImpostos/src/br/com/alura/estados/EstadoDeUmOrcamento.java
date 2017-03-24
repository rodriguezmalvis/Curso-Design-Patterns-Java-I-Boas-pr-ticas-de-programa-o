package br.com.alura.estados;

import br.com.alura.model.Orcamento;

public interface EstadoDeUmOrcamento {
	
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void reprova(Orcamento orcamento);
	void aprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
