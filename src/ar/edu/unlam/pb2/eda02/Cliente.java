package ar.edu.unlam.pb2.eda02;

import java.util.ArrayList;


public class Cliente extends Persona {
	private boolean membresia = false;
	private Integer acompañantes;
	private ArrayList<Menu> pedido;
	
	
	public Cliente( Integer codigoCliente, Integer acompañantes, Integer edad, String apellido) {
		super();
		
		
		this.acompañantes= acompañantes;
		setId(codigoCliente);
		setEdad(edad);
		setApellido(apellido);
		pedido=new ArrayList <>();
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

	public ArrayList<Menu> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Menu> pedido) {
		this.pedido = pedido;
	}
	
	
	

}
