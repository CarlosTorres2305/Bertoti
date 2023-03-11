package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Material> carros = new LinkedList<Material>();

	public Model() {
		addCarro(new Material("AAA1111", new Especificacao("gol", "vw", "verde")));
	}
	
	public void addCarro(Material carro){
		carros.add(carro);
	}
	
	public Material buscarPlaca(String placa){
		for(Material carro:carros){
			if(carro.getPlaca().equals(placa)) return carro;
		}
		
		return null;
	}
	
	
	public List<Material> buscarEspecificacao(Especificacao esp){
		List<Material> carrosEncontrados = new LinkedList<Material>();
		
		for(Material carro:carros){
			 if(esp.comparar(carro.getEspc())) carrosEncontrados.add(carro);
		}
		
		return carrosEncontrados;
		
	}
	
	
	public List<Material> buscarModelo(String modelo){
		List<Material> carrosEncontrados = new LinkedList<Material>();
		for(Material carro:carros) {
			if(carro.getEspc().getModelo().equals(modelo)) carrosEncontrados.add(carro);
		}
		return carrosEncontrados;
	}
	
	public List<Material> getCarros(){
		return carros;
	}

}
