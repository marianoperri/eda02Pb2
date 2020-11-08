package ar.edu.unlam.pb2.eda02;

public class Cliente extends Persona {
	private boolean membresia;
	private Integer codigoCliente;
	private Integer acompaņantes;
	
	
	
	public Cliente( Integer codigoCliente, Integer acompaņantes, Integer edad, String apellido) {
		super();
		
		this.codigoCliente = codigoCliente;
		this.acompaņantes= acompaņantes;
		
		setEdad(edad);
		setApellido(apellido);
	}
	
	public void clienteVip() {
		this.membresia=true;
		
	}
	public boolean getMembresia() {
		return membresia;
	}
	
	public Integer getAcompaņantes() {
		return acompaņantes;
	}
	
	
	

}
