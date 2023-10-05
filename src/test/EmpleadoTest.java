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
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Otro, 0, 0);
		float deseado = -1;
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaBrutaVentasMesNegativa() {
		float deseado = -1;
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, -20, 0);
		assertEquals(deseado, obtenido);

	}

	@Test
	void testCalculoNominaBrutaVentasMesMenor1000() {
		float deseado = 2000;
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 90, 0);
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaBrutaVentasMesEntre1000y1500() {
		float deseado = 2100;
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1112, 0);
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaBrutaVentasMesMayor1500() {
		float deseado = 2200;
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1501, 0);
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaBrutaHorasExtrasPositiva() {
		float ventasMes = 0;
		float horasExtras = 3;

		float deseado = 2000 + 30 * horasExtras;
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventasMes, horasExtras);
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaBrutaHorasExtrasNegativa() {
		float ventasMes = 0;
		float horasExtras = -3;

		float deseado = -1;
		float obtenido = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, ventasMes, horasExtras);
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaNetaNegativa() {
		float nominaBruta = -240;
		float deseado = -1;

		float obtenido = Empleado.calculoNomina(nominaBruta);
		assertEquals(deseado, obtenido);

	}

	@Test
	void testCalculoNominaNetaMenor2100() {
		float nominaBruta = 2099;
		float deseado = nominaBruta;

		float obtenido = Empleado.calculoNomina(nominaBruta);
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaNetaEntre2100y2500() {
		float nominaBruta = 2400;
		float deseado = nominaBruta * (1 - 0.15f);

		float obtenido = Empleado.calculoNomina(nominaBruta);
		assertEquals(deseado, obtenido);
	}

	@Test
	void testCalculoNominaNetaMayor2500() {
		float nominaBruta = 2550;
		float deseado = nominaBruta * (1 - 0.18f);

		float obtenido = Empleado.calculoNomina(nominaBruta);
		assertEquals(deseado, obtenido);	}

}
