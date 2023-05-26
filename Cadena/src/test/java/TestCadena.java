import static org.junit.Assert.*;

import java.security.PublicKey;

import org.junit.Test;

public class TestCadena {

	@Test
	public void longitud() {
		Cadena target = new Cadena();
		String prueba = "manzana";
		int expected = 7;
		int actual = target.longitud(prueba);
		assertEquals(expected, actual);
	}
	@Test
	public void vocales() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("manzana");
		assertEquals(expected, actual);

	}
	@Test
	public void invertir() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("manzana");
		assertEquals(expected, actual);

	}
	@Test
	public void contarLetra() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("manzana");
		assertEquals(expected, actual);

	}
	@Test
	public void longitudTest() {
		Cadena target = new Cadena();
		String prueba = "";
		int expected = 7;
		int actual = target.longitud(prueba);
		assertEquals(expected, actual);
	}
	@Test
	public void vocalesTest() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("");
		assertEquals(expected, actual);

	}
	@Test
	public void invertirTest() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("");
		assertEquals(expected, actual);

	}
	@Test
	public void contarLetraTest() {
		Cadena target = new Cadena();
		int expected = 3;
		int actual = target.vocales("");
		assertEquals(expected, actual);

	}
}
