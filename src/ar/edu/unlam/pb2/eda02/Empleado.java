package ar.edu.unlam.pb2.eda02;

public class Empleado extends Persona {
	
	
	private Double sueldo;
	private Double horasTrabajadas;
	private Double horasExtras;
	private Double pagoExtras;
	
	public Empleado(Integer legajo,String nombre, String apellido, Integer edad) {
		setId(legajo);
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}

	public Double calcularImporteSueldo(){
		return sueldo + calcularImporteHorasExtras();
	}
	public Double calcularImporteHorasExtras(){
		return horasExtras * pagoExtras;
	}
	public Integer getLegajo() {
		return getId();
	}

	public void setLegajo(Integer legajo) {
		setId(legajo);
	}

	public Double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoBase() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
	
	public double getPagoExtras() {
        return pagoExtras;
    }

    public void setPagoExtras(Double pagoExtras) {
        this.pagoExtras = pagoExtras;
    }

	public Double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(Double horasExtras) {
		this.horasExtras = horasExtras;
	}
    

}
