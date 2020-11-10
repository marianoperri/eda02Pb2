package ar.edu.unlam.pb2.eda02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBarEda02 {

	@Test
	public void queSePuedanInstanciaLasClases() {
		Cliente juan = new Cliente(1, 0, 23, "Gonzalez");
		assertEquals(23, juan.getEdad(),0);
		
		Empleado andres = new Empleado(101, "Andres", "Borgiat", 40);
		assertNotNull(andres);
		
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		assertNotNull(nuevoPlato);

		Trago nuevoTrago = new Trago("Fernet con coca", "Fernet con coca y hielo justo", 800.0);
		assertNotNull(nuevoTrago);

		Mesa nuevaMesa = new Mesa(4,004);
		assertNotNull(nuevaMesa);
	}
	
	@Test
	public void queSePuedaAgregarUnEmpleado() {
		Bar miBar = new Bar("El bar de Andy");
		Empleado andres = new Empleado(101, "Andres", "Borgiat", 40);
		miBar.agregarUnEmpleado(andres);
		assertEquals(andres, miBar.buscarEmpleado(101));
	}
	
	@Test
	public void queSePuedaSentarAlCliente() {
		Bar miBar = new Bar("El bar de Andy");
		Cliente juan = new Cliente(1, 9, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		assertTrue(miBar.sentarCliente(juan));
	}
	
	@Test
	public void queNoSePuedaSentarSegunCapacidad() {
		Bar miBar = new Bar("El bar de Andy");
		Cliente juan = new Cliente(1, 10, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		assertFalse(miBar.sentarCliente(juan));
	}
	
	@Test
	public void queSePuedanCargarLosIngredientesALosTragos() {
		Bar miBar = new Bar("El bar de Andy");
		Trago nuevoTrago = new Trago("Fernet con coca", "Fernet con coca y hielo justo", 800.0);
		nuevoTrago.agregarIngrediente("Fernet");
		nuevoTrago.agregarIngrediente("Coca");
		nuevoTrago.agregarIngrediente("Menta");
		nuevoTrago.agregarIngrediente("Hielo");
		assertEquals(4,nuevoTrago.getIngredientes().size());
	}
	
	@Test
	public void queSePuedanCargarLosIngredientesALosPlatos() {
		Bar miBar = new Bar("El bar de Andy");
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		nuevoPlato.agregarIngrediente("Fideos");
		nuevoPlato.agregarIngrediente("Salsa");
		nuevoPlato.agregarIngrediente("Queso rayado");
		assertEquals(3,nuevoPlato.getIngredientes().size());
	}
	
	@Test
	public void queSePuedaBuscarUnCliente() {
		Bar miBar = new Bar("El bar de Andy");
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		assertEquals(juan,miBar.buscarCliente(21));
	}

	@Test
	public void queSePuedaHacerVIPAUnCliente() {
		Bar miBar = new Bar("El bar de Andy");
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		miBar.hacerUnClienteVip(21);
		assertTrue(juan.getMembresia());
	}
	
	@Test
	public void queSePuedaAgregarPlato() {
		Bar miBar = new Bar("El bar de Andy");
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		assertTrue(miBar.agregarPlatos(nuevoPlato, 001));
		
	}
	
	@Test
	public void queSePuedaAgregarTrago() {
		Bar miBar = new Bar("El bar de Andy");
		Trago nuevoTrago = new Trago("Fernet con coca", "Fernet con coca y hielo justo", 800.0);
		
		assertTrue(miBar.agregarTrago(nuevoTrago, 004));
		
	}
	
	@Test
	public void queSePuedaCargarElPedido() {
		Bar miBar = new Bar("El bar de Andy");
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		miBar.agregarPlatos(nuevoPlato, 001);
		assertTrue(miBar.cargarAPedido(001, 21));	

	}
	
	@Test
	public void queSePuedaCerrarLaCuenta() {
		Bar miBar = new Bar("El bar de Andy");
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		Trago nuevoTrago = new Trago("Fernet con coca", "Fernet con coca y hielo justo", 800.0);
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		miBar.agregarPlatos(nuevoPlato, 001);
		miBar.agregarTrago(nuevoTrago, 004);
		miBar.cargarAPedido(001, 21);
		miBar.cargarAPedido(004, 21);
		assertEquals(miBar.cerrarCuenta(21),1300.0,0.0);

	}
	@Test
	public void queFuncioneElDescuentoAlClienteVip() {
		Bar miBar = new Bar("El bar de Andy");
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		Trago nuevoTrago = new Trago("Fernet con coca", "Fernet con coca y hielo justo", 800.0);
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		miBar.agregarPlatos(nuevoPlato, 001);
		miBar.agregarTrago(nuevoTrago, 004);
		miBar.cargarAPedido(001, 21);
		miBar.cargarAPedido(004, 21);
		miBar.hacerUnClienteVip(21);
		assertEquals(miBar.cerrarCuenta(21),975.0,0.0);
		
	}

	

}
