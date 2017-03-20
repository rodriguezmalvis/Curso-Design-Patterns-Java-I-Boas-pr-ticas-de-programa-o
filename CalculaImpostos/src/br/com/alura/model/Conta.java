package br.com.alura.model;

public class Conta {
	
	private Double saldo;
	private String titular;
	
	public Conta(String titular) {
		super();
		this.saldo = 0.0;
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposita(Double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	

}
