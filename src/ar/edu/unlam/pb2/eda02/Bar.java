package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;

public class Bar {
	private String nombre;
	private HashSet<Persona> personas;
	private HashSet<Menu> carta;
	private HashSet<Mesa> mesas;
	private HashSet<AsignacionDeCliente> asignacion;
	private static Double PAGO_POR_HORA = 200.0;
	private static Double PAGO_POR_HORA_EXTRA = 1.5;
	
	public Bar(String nombre) {
		super();
		this.nombre = nombre;
		this.personas = new HashSet<Persona>();
		this.carta = new HashSet<Menu>();
		this.mesas = new HashSet<Mesa>();
		this.asignacion = new HashSet<AsignacionDeCliente>();
	}

	public void iniciarActividadBar() {

		for (int i = 0; i <= 6; i++) {
			Mesa mesaCuadruples = new Mesa(4, i);
			this.mesas.add(mesaCuadruples);

		}
		for (int i = 7; i <= 11; i++) {
			Mesa mesaDobles = new Mesa(2, i);
			this.mesas.add(mesaDobles);

		}
		for (int i = 12; i <= 15; i++) {
			Mesa mesaDeDiez = new Mesa(10, i);
			this.mesas.add(mesaDeDiez);

		}

	}

	public boolean sentarCliente(Cliente nuevoCliente) {

		for (Mesa mesa : mesas) {
			Integer clientesASentar = nuevoCliente.getAcompañantes() + 1;
			if (mesa.getCapacidad() >= clientesASentar && mesa.getEstado() == true) {
				AsignacionDeCliente clienteAsignado = new AsignacionDeCliente(nuevoCliente, mesa, mesa.getId());

				mesa.ocuparMesa();
				personas.add(nuevoCliente);
				return asignacion.add(clienteAsignado);

			}

		}
		return false;

	}

	public Cliente buscarCliente(Integer idCliente) {
		for (Persona clienteAbuscar : personas) {
			if (clienteAbuscar instanceof Cliente) {
				if (clienteAbuscar.getId() == idCliente) {
					return (Cliente) clienteAbuscar;
				}
			}
		}
		return null;
	}

	public void hacerUnClienteVip(Integer idCliente) {
		Cliente cliente = buscarCliente(idCliente);
		cliente.clienteVip();

	}

	public Boolean agregarUnEmpleado(Empleado empleado) {
		if (empleado != null)
			return personas.add(empleado);

		return false;

	}

	public Empleado buscarEmpleado(Integer legajo) {
		for (Persona empleadoAbuscar : personas) {
			if (empleadoAbuscar instanceof Empleado) {
				if (empleadoAbuscar.getId() == legajo) {
					return (Empleado) empleadoAbuscar;
				}
			}
		}
		return null;
	}

	public Boolean agregarAlaCarta(Menu platoOTrago, Integer id) {
		if (platoOTrago != null) {
			platoOTrago.setId(id);
			return carta.add(platoOTrago);
		}
		return false;
	}

	public Boolean cargarAPedido(Integer idCarta, Integer idCliente) {
		Cliente clienteDeLaMesa = buscarCliente(idCliente);
		for (Menu pedidoDelCliente : carta) {
			if (pedidoDelCliente.getId() == idCarta) {

				return clienteDeLaMesa.getPedido().add(pedidoDelCliente);

			}

		}
		return false;
	}

	public Double cerrarCuenta(Integer idCliente) {

		Cliente cuentaCliente = buscarCliente(idCliente);
		Double totalPedidos = 0.0;
		for (Menu pedidos : cuentaCliente.getPedido()) {
			totalPedidos += pedidos.getImporte();

		}
		if (cuentaCliente.getMembresia()) {
			totalPedidos = (totalPedidos * 0.75);
		}

		return totalPedidos;
	}

	public void pagarSueldos(Integer legajo) {
		Empleado empleadoApagar = buscarEmpleado(legajo);
			if (empleadoApagar!= null) {
				if(empleadoApagar.getHorasTrabajadas()>0)
				empleadoApagar.setSueldo((PAGO_POR_HORA*empleadoApagar.getHorasTrabajadas()));
			}
			 if (empleadoApagar.getHorasExtras()>0) {
				empleadoApagar.setPagoExtras((PAGO_POR_HORA*empleadoApagar.getHorasExtras()*PAGO_POR_HORA_EXTRA));
				
			}
		
	}

}
