package ar.edu.unlam.pb2.eda02;

public class Empleado extends Persona {
	
	private Integer legajo;
	private Double sueldoBase;
	private Integer horasTrabajadas;
	private Integer horasExtras;
	private Double pagoExtras;
	
	public Empleado(Integer legajo,String nombre, String apellido, Integer edad) {
		this.legajo=legajo;
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}

	public Double calcularImporteSueldo(){
		return sueldoBase + calcularImporteHorasExtras();
	}
	public Double calcularImporteHorasExtras(){
		return horasExtras * pagoExtras;
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

	public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
	
	public double getPagoExtras() {
        return pagoExtras;
    }

    public void setPagoExtras(double pagoExtras) {
        this.pagoExtras = pagoExtras;
    }

}
