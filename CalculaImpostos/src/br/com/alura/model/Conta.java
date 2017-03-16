package br.com.alura.model;

public class Conta {
	
	private Double saldo;

	public Double getSaldo() {
		return saldo;
	}

	public void deposita(Double valor) {
		this.saldo += valor;
	}
	
	

}
