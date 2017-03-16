package br.com.alura.runner;
import br.com.alura.Impostos.ICCC;
import br.com.alura.Impostos.ICMS;
import br.com.alura.Impostos.ISS;
import br.com.alura.model.Orcamento;

public class CalculadorDeImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(10000.00);
		Double valorIcms = new ICMS().calcula(orcamento);
		Double valorISS =  new ISS().calcula(orcamento);
		Double valorICCC = new ICCC().calcula(orcamento);
		
		System.out.println("valor ISS: "+valorISS+" -- valor ICMS: "+valorIcms+" valor ICCC: "+valorICCC);
		
	}

}
