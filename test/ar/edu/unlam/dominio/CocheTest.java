package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CocheTest {
	
	private Coche coche;
	
	@Before
	public void init() {
		this.coche = new Coche("AUT-001", 4800d, 60);
	}
	
	@Test
	public void dadoQueExisteUnCocheAlConsultarSuPatenteObtengoUnResultadoPositivo() {
		String patenteColectivo = this.coche.getPatente();
		String patenteEsperada = "PDJ-048";
		
		assertEquals(patenteColectivo, patenteEsperada);
	}
	
	@Test
	public void dadoQueExisteUnCocheAlConsultarSuCapacidadDePesoMaximoObtengoUnResultadoPositivo() {
		Double pesoMaximoSoportado = this.coche.obtenerPesoMaximo();
		Double pesoMaximoEsperado = 4800d;
		
		assertEquals(pesoMaximoSoportado, pesoMaximoEsperado);
	}
	
	@Test
	public void dadoQueExisteUnCocheAlConsultarSuCapacidadMaximaDePasajerosObtengoUnResultadoPositivo() {
		Integer capacidadMaxima = this.coche.obtenerCapacidadMaximaDePasajeros();
		Integer capacidadMaximaEsperada = 60;
		
		assertEquals(capacidadMaxima, capacidadMaximaEsperada);
	}
	
	@Test
	public void dadoQueExisteUnCocheAlCargarUnPasajeroObtengoUnResultadoPositivo() {
		
		Pasajero pasajero1 = new Pasajero("Romina", 65d);
		
		Boolean pasajeroCargado = this.coche.cargarpasajeros(pasajero1);
		
		assertTrue(pasajeroCargado);
	}
	
	@Test
	public void dadoQueExisteUnCocheAlCargarMasPasajerosDeLosSoportadosObtengoUnResultadoNegativo() {
		Coche smart = new Coche("AUT-002", 200d, 2);
		Pasajero pasajero1 = new Pasajero ("Jorge", 80d);
		Pasajero pasajero2 = new Pasajero("Romina", 65d);
		Pasajero pasajero3 = new Pasajero("Ezequiel", 20d);
		
		smart.cargarpasajeros(pasajero1);
		smart.cargarpasajeros(pasajero2);
		smart.cargarpasajeros(pasajero3);
		Integer pasajerosEnColectivo = smart.getPasajeros().size();
		Integer cantidadEsperada = 2;
		
		assertEquals(cantidadEsperada, pasajerosEnColectivo);
	}
	
	@Test
	public void dadoQueExisteUnCocheAlCargarMasPesoDeLosSoportadoObtengoUnResultadoNegativo() {
		Coche smart = new Coche("AUT-002", 120d, 2);
		Pasajero pasajero1 = new Pasajero ("Jorge", 80d);
		Pasajero pasajero2 = new Pasajero("Romina", 65d);
		
		smart.cargarpasajeros(pasajero1);
		smart.cargarpasajeros(pasajero2);
		Integer pasajerosEnColectivo = smart.getPasajeros().size();
		Integer cantidadEsperada = 1;
		
		assertEquals(cantidadEsperada, pasajerosEnColectivo);
	}

}

