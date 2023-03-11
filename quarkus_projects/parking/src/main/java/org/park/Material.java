package org.park;

public class Material {

	private int id;
	private String descricao;
	private float preco;
	private Especificacao espc;
	
	
	
	public Material(int id, String descricao, float preco, Especificacao espc) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.espc = espc;
	}
	//get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Especificacao getEspc() {
		return espc;
	}
	public void setEspc(Especificacao espc) {
		this.espc = espc;
	}
	
	
	
	
}
