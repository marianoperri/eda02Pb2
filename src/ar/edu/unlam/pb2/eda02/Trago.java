package ar.edu.unlam.pb2.eda02;
import java.util.HashSet;
import java.util.Set;

public class Trago extends Menu {
	
	private String nombre;
	private String descripcion;
	
	private Set<String> ingredientes = new HashSet<>();

	public Trago(String nombre, String descripcion, double importe) {

		this.nombre = nombre;
		this.descripcion = descripcion;
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
	
	public Set<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(Set<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
}
