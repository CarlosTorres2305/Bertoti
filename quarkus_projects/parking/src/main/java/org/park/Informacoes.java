package org.park;

public class Informacoes {
	private String marca;
	private String fornecedor;
	
	
	
	
	public Informacoes(String marca, String fornecedor) {
		
		this.marca = marca;
		this.fornecedor = fornecedor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	public boolean comparar(Informacoes info){
		if(marca.equals(info.marca) && fornecedor.equals(info.fornecedor)){
			return true;
		} else {
			return false;
		}
	}
}
