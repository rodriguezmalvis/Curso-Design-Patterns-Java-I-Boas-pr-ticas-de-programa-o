package br.com.alura.model;

import java.time.LocalDate;

import br.com.alura.estados.EstadoDeUmaConta;

public class Conta {
	
	private Double saldo;
	private String titular;
	private String banco;
	private String endereco;
	private String telefone;
	private String email;
	private LocalDate data;
	private EstadoDeUmaConta estado;
	
	public Conta(String titular) {
		super();
		this.saldo = 0.0;
		this.titular = titular;
	}
	
	public Conta(String titular, String banco, String endereco, String telefone, String email,
			LocalDate data) {
		super();
		this.saldo = 0.0;
		this.titular = titular;
		this.banco = banco;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.data = data;
	}
	
	public void deposita(Double valor) {
		this.saldo += valor;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + ", banco=" + banco + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", email=" + email + ", data=" + data + "]";
	}

	public EstadoDeUmaConta getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeUmaConta estado) {
		this.estado = estado;
	}		
	

}
