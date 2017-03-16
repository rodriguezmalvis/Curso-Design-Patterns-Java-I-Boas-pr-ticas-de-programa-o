package br.com.alura.Impostos;
import br.com.alura.model.Imposto;
import br.com.alura.model.Orcamento;

public class ISS implements Imposto{

	@Override
	public Double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
