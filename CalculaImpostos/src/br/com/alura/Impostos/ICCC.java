package br.com.alura.Impostos;
import br.com.alura.model.Orcamento;

public class ICCC implements Imposto{

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

		return valorDoImposto;
	}

}
