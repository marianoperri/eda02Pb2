package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;
import java.util.Set;

public abstract class Menu {
	private String nombre;
	private Set<String> ingredientes = new HashSet<>();
	private Integer id;
	
	public Boolean agregarIngrediente(String ingrediente) {
		
		return ingredientes.add(ingrediente);
		
		
	}
	
}
