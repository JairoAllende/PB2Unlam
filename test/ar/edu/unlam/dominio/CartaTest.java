package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CartaTest {

	public void miTest() {

		// Preparacion: Información necesaria para ejecutar la prueba.

		// Ejecucion: ejecutar el metodo a probar

		// Verificacion: verificar que el escenario final sea el requerido

		// ################################################################

		// Lineamientos

		// Escribir un metodo, hacer que compile, ejecutarlo y tiene que fallar.

		// Agregar la menor cantidad de codigo necesaria para que la prueba pase.

		// Revisión de código: se revisa qué se puede mejorar
	}

	@Test
	public void dadoQueNoExisteUnaCartaAlCrearseLaSaludEs100() {

		// Preparacion

		Carta carta = new Carta();
		// carta.setSalud(100);

		// Ejecucion

		// Verificacion
		int saludEsperada = 100;

		int saludObtenida = carta.getSalud();

		assertEquals(saludEsperada, saludObtenida);
	}

	@Test
	public void dadoQueExisteUnaCartaCon100DeSaludAlRecibir20DanioDebeQuedarCon80DeSalud() {

		// Preparacion
		Carta carta = new Carta();

		// Ejecucion
		carta.recibirDanio(100);

		// Verificacion
		int saludEsperada = 0;
		int saludObtenida = carta.getSalud();
		assertEquals(saludEsperada, saludObtenida);
	}

	@Test
	public void dadoQueExistenDosCartasPuedoComprobarQueSonIguales() {

		Carta cartaUno = new Carta();
		cartaUno.setNumero(1);

		Carta cartaDos = new Carta();
		cartaDos.setNumero(1);
		// cartaDos.recibirDanio(10);

		boolean sonIguales = cartaUno.equals(cartaDos);

		assertTrue(sonIguales);
	}

	@Test
	public void dadoQueExistenDosCartasPuedoComprobarQueTieneElMismoHashCode() {

		Carta cartaUno = new Carta();
		cartaUno.setNumero(1);

		Carta cartaDos = new Carta();
		cartaDos.setNumero(1);

		assertEquals(cartaUno.hashCode(), cartaDos.hashCode());
	}

}
