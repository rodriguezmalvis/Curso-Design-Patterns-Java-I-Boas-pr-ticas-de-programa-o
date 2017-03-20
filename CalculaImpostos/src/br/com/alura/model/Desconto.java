package br.com.alura.model;

public interface Desconto {
	
	public Double calcula(Orcamento orcamento);
	public void SetProximoDesconto(Desconto desconto);

}
