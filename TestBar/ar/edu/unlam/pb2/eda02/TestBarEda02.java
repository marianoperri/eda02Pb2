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
		assertTrue(miBar.agregarAlaCarta(nuevoPlato, 001));
		
	}
	
	@Test
	public void queSePuedaAgregarTrago() {
		Bar miBar = new Bar("El bar de Andy");
		Trago nuevoTrago = new Trago("Fernet con coca", "Fernet con coca y hielo justo", 800.0);
		
		assertTrue(miBar.agregarAlaCarta(nuevoTrago, 004));
		
	}
	
	@Test
	public void queSePuedaCargarElPedido() {
		Bar miBar = new Bar("El bar de Andy");
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		miBar.agregarAlaCarta(nuevoPlato, 001);
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
		miBar.agregarAlaCarta(nuevoPlato, 001);
		miBar.agregarAlaCarta(nuevoTrago, 004);
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
		miBar.agregarAlaCarta(nuevoPlato, 001);
		miBar.agregarAlaCarta(nuevoTrago, 004);
		miBar.cargarAPedido(001, 21);
		miBar.cargarAPedido(004, 21);
		miBar.hacerUnClienteVip(21);
		assertEquals(miBar.cerrarCuenta(21),975.0,0.0);
		
	}
	@Test
	public void queSePuedaPagarElSueldoAUnEmpleado() {
		Bar miBar = new Bar("El bar de Andy");
		Empleado andres = new Empleado(101, "Andres", "Borgiat", 40);
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		
		miBar.agregarUnEmpleado(andres);
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		andres.setHorasTrabajadas(8.3);
		andres.setHorasExtras(4.3);
		assertTrue(miBar.pagarSueldos(101));
		
		
		
	}
	@Test
	public void queElSueldoAUnEmpleadoSeaElEsperado() {
		Bar miBar = new Bar("El bar de Andy");
		Empleado andres = new Empleado(101, "Andres", "Borgiat", 40);
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		Double sueldoEsperado = 1660.0;
		Double extrasEsperadas = 1290.0;
		miBar.agregarUnEmpleado(andres);
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		andres.setHorasTrabajadas(8.3);
		andres.setHorasExtras(4.3);
		miBar.pagarSueldos(101);
		
		assertEquals(sueldoEsperado, andres.getSueldoBase(), 0.1);
		
		assertEquals(extrasEsperadas, andres.getPagoExtras(), 0.1);
	}
	
	@Test
	public void queSePuedaCerrarElDia() {
		Bar miBar = new Bar("El bar de Andy");
		Plato nuevoPlato = new Plato("Fideos ", "Fideos con salsa", 500.0);
		Trago nuevoTrago = new Trago("Fernet con coca", "Fernet con coca y hielo justo", 800.0);
		Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
		Cliente carlos = new Cliente(13, 2, 43, "Acuña");
		miBar.iniciarActividadBar();
		miBar.sentarCliente(juan);
		miBar.sentarCliente(carlos);
		miBar.agregarAlaCarta(nuevoPlato, 001);
		miBar.agregarAlaCarta(nuevoTrago, 004);
		miBar.cargarAPedido(001, 21);
		miBar.cargarAPedido(004, 21);
		miBar.cargarAPedido(004, 13);
		miBar.cargarAPedido(004, 13);
		assertEquals(miBar.consumosDelDia(),2900.0,0.0);

	}
	
	public void queNoPuedaIngresarClienteSinIniciarLaActividad(){
        Bar miBar = new Bar("El bar de Andy");
        Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
        assertFalse(miBar.sentarCliente(juan));
    }

    @Test
    public void queNoAcepteClientesConElMismoId(){
        Bar miBar = new Bar("El bar de Andy");
        Cliente juan = new Cliente(21, 9, 23, "Gonzalez");
        Cliente carlos = new Cliente(21, 2, 43, "Acuña");
        miBar.iniciarActividadBar();
        miBar.sentarCliente(juan);
        assertFalse(miBar.sentarCliente(carlos));
    }

    @Test
    public void queNoAcepteEmpleadoConElMismoId(){
        Bar miBar = new Bar("El bar de Andy");
        Empleado andres = new Empleado(101, "Andres", "Borgiat", 40);
        Empleado ruben = new Empleado(101, "ruben", "perez", 30);
        miBar.agregarUnEmpleado(andres);
        assertFalse(miBar.agregarUnEmpleado(ruben));
    }

	//que no acepte clientes con mismo ID, ni clientes y empleados con mis ID
	//plato y trago con mismo ID

}
