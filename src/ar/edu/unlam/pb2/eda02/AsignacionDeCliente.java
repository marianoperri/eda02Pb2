package ar.edu.unlam.pb2.eda02;

public class AsignacionDeCliente {
	private Cliente cliente;
	private Mesa mesa;
	private Integer id;
	
	
	public AsignacionDeCliente(Cliente cliente, Mesa mesa, Integer id) {
		
		this.cliente = cliente;
		this.mesa = mesa;
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AsignacionDeCliente other = (AsignacionDeCliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
