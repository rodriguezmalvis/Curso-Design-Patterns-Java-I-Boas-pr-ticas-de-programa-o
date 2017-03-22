package br.com.alura.Impostos;
import br.com.alura.model.Orcamento;

public class ISS extends Imposto{

	public ISS(){}
			
	public ISS(Imposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoOutroImposto(orcamento);
	}

}
