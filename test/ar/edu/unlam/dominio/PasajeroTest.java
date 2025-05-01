package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PasajeroTest {
	
	private Pasajero pasajero1;
	
	@Before
	public void init() {
		this.pasajero1 = new Pasajero("Pepe", 75d);
	}
	
	@Test
	public void dadoQueExisteUnPasajeroCuandoConsultoSunNombreObtengoUnResultadoPositivo() {
		String nombrePasajero1 = this.pasajero1.getNombre();
		String nombrePasajeroEsperado = "Pepe";
		
		assertEquals(nombrePasajeroEsperado, nombrePasajero1);
	}
	
	@Test
	public void dadoQueExisteUnPasajeroCuandoConsultoSunPesoObtengoUnResultadoPositivo() {
		Double pesoPasajero1 = this.pasajero1.getPeso();
		Double pesoPasajeroEsperado = 75d;
		
		assertEquals(pesoPasajeroEsperado, pesoPasajero1);
	}
	
	
}
