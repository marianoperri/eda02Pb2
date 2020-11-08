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
	public void iniciarActividadBar() {
				
		for(int i=0; i<=6;i++) {
			Mesa mesaCuadruples = new Mesa(4, i);
			this.mesas.add(mesaCuadruples);
			
		}
		for(int i=7; i<=11;i++) {
			Mesa mesaDobles = new Mesa(2, i);
			this.mesas.add(mesaDobles);
			
		}
		for(int i=12; i<=15;i++) {
			Mesa mesaDeDiez = new Mesa(10, i);
			this.mesas.add(mesaDeDiez);
			
		}
		
	}
	
	
	

}
