package ar.edu.unlam.pb2.eda02;

public class Cliente extends Persona {
	private boolean membresia;
	private Integer codigoCliente;
	private Integer acompa�antes;
	
	
	
	public Cliente( Integer codigoCliente, Integer acompa�antes, Integer edad, String apellido) {
		super();
		
		this.codigoCliente = codigoCliente;
		this.acompa�antes= acompa�antes;
		
		setEdad(edad);
		setApellido(apellido);
	}
	
	public void clienteVip() {
		this.membresia=true;
		
	}
	public boolean getMembresia() {
		return membresia;
	}
	
	public Integer getAcompa�antes() {
		return acompa�antes;
	}
	
	
	

}
