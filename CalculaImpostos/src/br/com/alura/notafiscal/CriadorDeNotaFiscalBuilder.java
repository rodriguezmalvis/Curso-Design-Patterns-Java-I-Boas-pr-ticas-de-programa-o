package br.com.alura.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.acoes.Acoes;
import br.com.alura.model.Item;

public class CriadorDeNotaFiscalBuilder {
	
	private String empresa;
	private String cnpj;
	private ArrayList<Item> todosOsItens = new ArrayList<>();
	private Double valorbruto = 0.0;
	private Double imposto = 0.0;
	private String observacoes;
	private Calendar dataAtual;
	private List<Acoes> acoes;

	public CriadorDeNotaFiscalBuilder() {
		dataAtual = Calendar.getInstance();
		acoes = new ArrayList<>();
	}
	
	public CriadorDeNotaFiscalBuilder paraEmpresa(String empresa){
		this.empresa = empresa;
		return this;
	}
	
	public CriadorDeNotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	
	public CriadorDeNotaFiscalBuilder comItem(Item item){
		todosOsItens.add(item);
		valorbruto = valorbruto += item.getValor();
		imposto = imposto += item.getValor() * 0.05;
		return this;
	}
	
	public CriadorDeNotaFiscalBuilder comObservacoes(String observacoes){
		this.observacoes = observacoes;
		return this;
	}
	
	public CriadorDeNotaFiscalBuilder naData(Calendar data){
		if(data == null){
			dataAtual = Calendar.getInstance();
		}
		dataAtual = data;
		return this;
	}
	
	public void adicionaAcao(Acoes acao){
		acoes.add(acao);
	}
	
	public NotaFiscal constroi(){
		
		NotaFiscal notaFiscal = new NotaFiscal(empresa, cnpj, dataAtual, valorbruto, imposto, todosOsItens, observacoes);
		
		for (Acoes acao : acoes) {
			acao.executa(notaFiscal);
		}
		
		return notaFiscal;
	}
	
}
