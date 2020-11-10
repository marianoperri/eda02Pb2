package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;

public class Cliente extends Persona {
	private boolean membresia = false;
	private Integer acompaņantes;
	private HashSet<Menu> pedido;
	
	
	public Cliente( Integer codigoCliente, Integer acompaņantes, Integer edad, String apellido) {
		super();
		
		
		this.acompaņantes= acompaņantes;
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
	
	public Integer getAcompaņantes() {
		return acompaņantes;
	}

	public HashSet<Menu> getPedido() {
		return pedido;
	}

	public void setPedido(HashSet<Menu> pedido) {
		this.pedido = pedido;
	}
	
	
	

}
