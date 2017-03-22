package br.com.alura.Impostos;
import br.com.alura.model.Orcamento;

public class ICCC extends Imposto{

	public ICCC(){}
	
	public ICCC(Imposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcula(Orcamento orcamento) {
		Double valorDoImposto = 0.0;
		
		if(orcamento.getValor() < 1000.00){
			valorDoImposto = orcamento.getValor() * 0.05;
		}else if ( orcamento.getValor() > 3000){
			valorDoImposto = (orcamento.getValor() * 0.08) + 30;
		}else{
			valorDoImposto = orcamento.getValor() * 0.07;
		}

		return valorDoImposto + calculoOutroImposto(orcamento);
	}

}
