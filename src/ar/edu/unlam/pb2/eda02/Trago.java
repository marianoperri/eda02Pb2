package ar.edu.unlam.pb2.eda02;

public class Trago extends Menu {
	
	private String nombre;
	private String descripcion;
	private double importe;
	private Set<String> ingredientes = new Hashset<>();

	public Trago(String nombre, String descripcion, double importe) {

		this.nombre = nombre;
		this.descripcion = descripcion;
		this.importe=importe;
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
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Set<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(Set<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
}
