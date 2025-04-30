package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AutoTest {

	private Auto auto;
	
	@Before
	public void init() {
		this.auto = new Auto();
	}
	
	//	• Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
	//	• Puede llevar hasta 2m3 de carga y hasta 500kg.
	
	
	@Test
	public void dadoQueExisteUnAutoCuandoAgregoUnPaqueteValidoObtengoUnResultadoPositivo() {
		Paquete paqueteValido = new Paquete();
		//alto, ancho y profundo -> m3 = alto * ancho * profundidad
		paqueteValido.setAlto(1d);
		paqueteValido.setAncho(1d);
		paqueteValido.setProfundidad(1d);
		paqueteValido.setPeso(10d); // kg
		paqueteValido.setCiudad("San Justo");
		
		boolean paqueteAgregado = this.auto.agregarPaquete(paqueteValido, "San Justo");
		
		Double pesoEsperado = 10d;
		Double volumenEsperado = 1d;
		assertTrue(paqueteAgregado);
		assertEquals(pesoEsperado, this.auto.getPeso());
		assertEquals(volumenEsperado, this.auto.getVolumen());
	}
}
