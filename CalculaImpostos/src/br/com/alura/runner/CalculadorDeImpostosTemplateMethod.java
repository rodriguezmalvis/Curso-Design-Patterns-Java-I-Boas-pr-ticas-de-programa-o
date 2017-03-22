package br.com.alura.runner;
import br.com.alura.Impostos.ICCC;
import br.com.alura.Impostos.ICMS;
import br.com.alura.Impostos.ICPP;
import br.com.alura.Impostos.IKCV;
import br.com.alura.Impostos.ISS;
import br.com.alura.model.Item;
import br.com.alura.model.Orcamento;

public class CalculadorDeImpostosTemplateMethod {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(1000.00);
		orcamento.adicionaItem(new Item("item 1", 110.00));
		Double valorIcms = new ICMS().calcula(orcamento);
		Double valorISS =  new ISS().calcula(orcamento);
		Double valorICCC = new ICCC().calcula(orcamento);
		Double valorICPP = new ICPP().calcula(orcamento);
		Double valorIKCV = new IKCV().calcula(orcamento);
		
		System.out.println("valor ICPP: "+valorICPP+" -- valor IKCV: "+valorIKCV);
		
	}

}
