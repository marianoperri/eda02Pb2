package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;
import java.util.Set;

public class Plato extends Menu {
	
	private String nombre;
	private String descripcion;
<<<<<<< HEAD
=======
	
>>>>>>> c2fea71629bd8b1712e6996b7c1f42f29f923497
	private Set<String> ingredientes = new HashSet<>();

	public Plato(String nombre, String descripcion, double importe) {

		this.nombre = nombre;
		this.descripcion = descripcion;
<<<<<<< HEAD
=======
		
>>>>>>> c2fea71629bd8b1712e6996b7c1f42f29f923497
		setImporte(importe);
	}

	public Boolean agregarIngrediente(String ingrediente) {
		
		return ingredientes.add(ingrediente);
	
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
<<<<<<< HEAD
=======
	
>>>>>>> c2fea71629bd8b1712e6996b7c1f42f29f923497
	public Set<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(Set<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
}
