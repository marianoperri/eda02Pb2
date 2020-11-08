package ar.edu.unlam.pb2.eda02;

public class Cliente extends Persona {
	private boolean membresia;
	private Integer codigoCliente;
	private Integer acompañantes;
	
	
	
	public Cliente( Integer codigoCliente, Integer acompañantes, Integer edad, String apellido) {
		super();
		
		this.codigoCliente = codigoCliente;
		this.acompañantes= acompañantes;
		
		setEdad(edad);
		setApellido(apellido);
	}
	
	public void clienteVip() {
		this.membresia=true;
		
	}
	public boolean getMembresia() {
		return membresia;
	}
	
	public Integer getAcompañantes() {
		return acompañantes;
	}
	
	
	

}
