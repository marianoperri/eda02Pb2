package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;

public class Bar {
	private String nombre;
	private HashSet<Persona> personas;
	private HashSet<Menu> carta;
	private HashSet<Mesa> mesas;
	
	
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
		this.personas =new HashSet<Persona>();
		this.carta = new HashSet<Menu>();
		this.mesas = new HashSet<Mesa>();
	}
	
	
	
	

}
