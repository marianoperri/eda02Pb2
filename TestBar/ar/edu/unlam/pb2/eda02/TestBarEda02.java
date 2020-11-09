package ar.edu.unlam.pb2.eda02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBarEda02 {

	@Test
	public void test() {
		Cliente juan = new Cliente(1, 0, 23, "Gonzalez");
		
		assertEquals(23, juan.getEdad(),0);
	}

}
