package ar.edu.unlam.pb2.eda02;

public class Mesa {
	private Integer capacidad;
	private Integer id;
	private Boolean ubicacion =false;
	private Boolean libre=true;
	
	public Mesa(Integer capacidad, Integer id) {
		if (capacidad <=10)
			this.capacidad=capacidad;
		
		this.id= id;
		
	}
	public Integer getId() {
		return id;
	}

	public Boolean getEstado() {
		return libre;
	}


	public Integer getCapacidad() {
		return capacidad;
	}
	
	public void ocuparMesa() {
		
		this.libre=false;
	}
    public void liberarMesa() {
		
		this.libre=true;
	}
    public Boolean getUbicacion() {
    	return ubicacion;
    }
	public void setEstado(Boolean estado) {
		this.ubicacion = estado;
	}
	

}
