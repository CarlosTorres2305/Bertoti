package org.park;

import java.util.List;
import java.util.LinkedList;

public class Model2 {
	
	private List<Produto> produtos = new LinkedList<Produto>();

	public Model2() {
		addProduto(new Produto("lampada", 15.00, 10, new Informacoes("FLC", "Galeria ltda")));
		addProduto(new Produto("fusível",10.00, 13, new Informacoes("FLC", "Galeria ltda")));
		addProduto(new Produto("disjuntor",50.00, 5, new Informacoes("FLC", "Galeria ltda")));
		addProduto(new Produto("tomada",5.00, 8, new Informacoes("TMX", "Brasil watts")));
		addProduto(new Produto("chuveiro",75.00, 15, new Informacoes("TMX", "Brasil watts")));
		addProduto(new Produto("lampada",10.00, 13, new Informacoes("TMX", "Brasil watts")));
		addProduto(new Produto("fio cx ",8.00, 40, new Informacoes("CVN", "Galeria ltda")));
		addProduto(new Produto("tomada",10.00, 13, new Informacoes("CVN", "Galeria ltda")));
		addProduto(new Produto("diodo",25.00, 13, new Informacoes("CVN", "Galeria ltda")));
	}
	
	public void addProduto(Produto produto){
		produtos.add(produto);
	}
	
	public Produto buscarDescricao(String descricao){
		for(Produto produto:produtos){
			if(produto.getDescricao().equals(descricao)) return produto;
		}
		
		return null;
	}
	
	
	public List<Produto> buscarInformacoes(Informacoes info){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		
		for(Produto produto:produtos){
			 if(info.comparar(produto.getInfo())) produtosEncontrados.add(produto);
		}
		
		return produtosEncontrados;
		
	}
	
	
	public List<Produto> buscarFornecedor(String fornecedor){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		for(Produto produto:produtos) {
			if(produto.getInfo().getFornecedor().equals(fornecedor)) produtosEncontrados.add(produto);
		}
		return produtosEncontrados;
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}

}

