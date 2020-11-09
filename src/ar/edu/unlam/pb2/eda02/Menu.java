package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;
import java.util.Set;

public  class Menu {
	private String nombre;
	private Set<String> ingredientes = new HashSet<>();
	private Integer id;
	private Double importe;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Set<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean agregarIngrediente(String ingrediente) {
		
		return ingredientes.add(ingrediente);
		
		
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
