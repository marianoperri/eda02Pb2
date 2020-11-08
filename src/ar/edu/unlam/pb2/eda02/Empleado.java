package ar.edu.unlam.pb2.eda02;

public class Empleado extends Persona {
	
	private Integer legajo;
	private Double Sueldo;
	private Integer horasTrabajadas;
	
	public Empleado(Integer legajo,String nombre, String apellido, Integer edad) {
		this.legajo=legajo;
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	

}
