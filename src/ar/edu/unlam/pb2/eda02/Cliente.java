package ar.edu.unlam.pb2.eda02;

import java.util.ArrayList;


public class Cliente extends Persona {
	private boolean membresia = false;
	private Integer acompa�antes;
	private ArrayList<Menu> pedido;
	
	
	public Cliente( Integer codigoCliente, Integer acompa�antes, Integer edad, String apellido) {
		super();
		
		
		this.acompa�antes= acompa�antes;
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
	
	public Integer getAcompa�antes() {
		return acompa�antes;
	}

	public ArrayList<Menu> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Menu> pedido) {
		this.pedido = pedido;
	}
	
	
	

}
