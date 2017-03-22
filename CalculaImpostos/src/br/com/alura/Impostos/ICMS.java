package br.com.alura.Impostos;
import br.com.alura.model.Orcamento;

public class ICMS extends Imposto{

	public ICMS() {}
	
	public ICMS(Imposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50 + calculoOutroImposto(orcamento);
	}

}
