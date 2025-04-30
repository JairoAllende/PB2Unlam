package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BicicletaTest {

	private Bicicleta bicicleta;
	
	@Before
	public void init() {
		this.bicicleta = new Bicicleta();
	}
	
	// Bicicleta:
	//	• Se mueve dentro de la ciudad.
	//	• Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
	//	NOTA: Si no tengo destino, el primer paquete me define el destino hacia
	//	dónde va la bicicleta.
	
	// Misma ciudad
	// 2 paquetes
	// 0.125 m3 maximo entre los dos
	// 15kg maximo entre los dos
	
	@Test
	public void dadoQueExisteUnaBicicletaCuandoAgregoUnPaqueteValidoEntoncesObtengoUnResultadoPositivo() {
		// preparacion
		Paquete paqueteValido = new Paquete();
		//alto, ancho y profundo -> m3 = alto * ancho * profundidad
		paqueteValido.setAlto(0.1d);
		paqueteValido.setAncho(0.1d);
		paqueteValido.setProfundidad(0.1d);
		paqueteValido.setPeso(10d); // kg
		paqueteValido.setCiudad("San Justo");
		
		// ejecucion
		boolean paqueteAgregado = this.bicicleta.agregarPaquete(paqueteValido, "");
		
		// verificacion
		Double pesoEsperado = 10d;
		Double volumenEsperado = 0.0010000000000000002;
		assertTrue(paqueteAgregado);
		assertEquals(pesoEsperado, this.bicicleta.getPeso());
		assertEquals(volumenEsperado, this.bicicleta.getVolumen());
	}
	
	@Test
	public void dadoQueExisteUnaBicicletaCuandoAgregoUnPaqueteNoValidoPorElPesoEntoncesObtengoUnResultadoNegativo() {
		// preparacion
		Paquete paqueteValido = new Paquete();
		//alto, ancho y profundo -> m3 = alto * ancho * profundidad
		paqueteValido.setAlto(1.04);
		paqueteValido.setAncho(0.04);
		paqueteValido.setProfundidad(0.04);
		paqueteValido.setPeso(20d); // kg
		paqueteValido.setCiudad("San Justo");
		
		// ejecucion
		boolean paqueteAgregado = this.bicicleta.agregarPaquete(paqueteValido, "");
		
		// verificacion
		Double pesoEsperado = 0d;
		Double volumenEsperado = 0d;
		assertFalse(paqueteAgregado);
		assertEquals(pesoEsperado, this.bicicleta.getPeso());
		assertEquals(volumenEsperado, this.bicicleta.getVolumen());
	}
}
