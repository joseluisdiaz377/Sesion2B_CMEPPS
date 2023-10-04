package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, 0);
		float deseado = 2500;
		assertEquals(deseado, obtenido);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaVendedor() {
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, 0);
		float deseado = 2000;
		assertEquals(deseado, obtenido);
	}
	
	@Test
	void testCalculoNominaBrutaOtro() {
//		float obtenido = Empleado.calculoNominaBruta(null, 0, 0);
//		float deseado = 2000;
//		assertEquals(deseado, obtenido);
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesNegativa() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesMenor1000() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesEntre1000y1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesMayor1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasPositiva() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasNegativa() {
		fail("Not yet implemented");
	}
	
	

	@Test
	void testCalculoNominaNetaNegativa() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMenor2100() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaEntre2100y2500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMayor2500() {
		fail("Not yet implemented");
	}

}
