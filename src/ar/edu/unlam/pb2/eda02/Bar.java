package ar.edu.unlam.pb2.eda02;

import java.util.HashSet;

public class Bar {
	private String nombre;
	private HashSet<Persona> personas;
	private HashSet<Menu> carta;
	private HashSet<Mesa> mesas;
	private HashSet<AsignacionDeCliente> asignacion;

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
			if (clienteAbuscar.getId()==idCliente) {
				return (Cliente) clienteAbuscar;
				
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
			if (empleadoAbuscar.getId() == legajo) {
				return (Empleado) empleadoAbuscar;
			}

		}
		return null;
	}

	public Boolean agregarPlatos(Plato platoAlMenu, Integer id) {
		if (platoAlMenu != null) {
			platoAlMenu.setId(id);
			return carta.add(platoAlMenu);
		}
		return false;
	}

	public Boolean agregarTrago(Trago tragoAlMenu, Integer id) {
		if (tragoAlMenu != null) {
			tragoAlMenu.setId(id);
			return carta.add(tragoAlMenu);
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

}
