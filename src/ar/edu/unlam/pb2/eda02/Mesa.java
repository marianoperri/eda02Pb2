package ar.edu.unlam.pb2.eda02;

public class Mesa {
	private Integer capacidad;
	private Integer id;
	private Boolean estado =false;
	
	public Mesa(Integer capacidad, Integer id) {
		if (capacidad <=10)
			this.capacidad=capacidad;
		
		this.id= id;
		
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	

}
