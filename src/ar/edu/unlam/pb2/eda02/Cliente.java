package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;

public class Cliente extends Persona {
	private boolean membresia = false;
	private Integer acompañantes;
	private HashSet<Menu> pedido;
	
	
	public Cliente( Integer codigoCliente, Integer acompañantes, Integer edad, String apellido) {
		super();
		
		
		this.acompañantes= acompañantes;
		setId(codigoCliente);
		setEdad(edad);
		setApellido(apellido);
		pedido=new HashSet <>();
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

	public HashSet<Menu> getPedido() {
		return pedido;
	}

	public void setPedido(HashSet<Menu> pedido) {
		this.pedido = pedido;
	}
	
	
	

}
