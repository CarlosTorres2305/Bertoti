package org.park;

public class Produto {
	private String descricao;
	private double preco;
	private double quantidade;
	private Informacoes info;
	
	
	
	
	
	public Produto(String descricao, double preco, double quantidade, Informacoes info) {
		
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.info = info;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public Informacoes getInfo() {
		return info;
	}
	public void setInfo(Informacoes info) {
		this.info = info;
	}
	
	
}
