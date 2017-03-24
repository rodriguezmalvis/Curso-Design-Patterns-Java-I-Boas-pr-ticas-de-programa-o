package br.com.alura.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.model.Item;

public class NotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private Double valorBruto;
	private Double impostos;
	List<Item> itens = new ArrayList<>();
	private String observacoes;
	
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, Double valorBruto, Double impostos,
			List<Item> itens, String observacoes) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Double getImpostos() {
		return impostos;
	}

	public void setImpostos(Double impostos) {
		this.impostos = impostos;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	

}
