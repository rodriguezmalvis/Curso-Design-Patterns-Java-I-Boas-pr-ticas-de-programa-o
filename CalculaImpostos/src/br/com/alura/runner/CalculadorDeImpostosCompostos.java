package br.com.alura.runner;
import br.com.alura.Impostos.ICMS;
import br.com.alura.Impostos.SuperImposto;
import br.com.alura.model.Orcamento;

public class CalculadorDeImpostosCompostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.00);
		Double valor = new SuperImposto(new ICMS()).calcula(orcamento);
		
		System.out.println("valor Composto: "+valor);
		
	}

}
