package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ColectivoTest {
	
	private Colectivo colectivo;
	
	@Before
	public void init() {
		this.colectivo = new Colectivo("PDJ-048", 4800d, 60);
	}
	
	@Test
	public void dadoQueExisteUnColectivoAlConsultarSuPatenteObtengoUnResultadoPositivo() {
		String patenteColectivo = this.colectivo.getPatente();
		String patenteEsperada = "PDJ-048";
		
		assertEquals(patenteColectivo, patenteEsperada);
	}
	
	@Test
	public void dadoQueExisteUnColectivoAlConsultarSuCapacidadDePesoMaximoObtengoUnResultadoPositivo() {
		Double pesoMaximoSoportado = this.colectivo.obtenerPesoMaximo();
		Double pesoMaximoEsperado = 4800d;
		
		assertEquals(pesoMaximoSoportado, pesoMaximoEsperado);
	}
	
	@Test
	public void dadoQueExisteUnColectivoAlConsultarSuCapacidadMaximaDePasajerosObtengoUnResultadoPositivo() {
		Integer capacidadMaxima = this.colectivo.obtenerCapacidadMaximaDePasajeros();
		Integer capacidadMaximaEsperada = 60;
		
		assertEquals(capacidadMaxima, capacidadMaximaEsperada);
	}
	
	@Test
	public void dadoQueExisteUnColectivoAlCargarUnPasajeroObtengoUnResultadoPositivo() {
		
		Pasajero pasajero1 = new Pasajero("Romina", 65d);
		
		Boolean pasajeroCargado = this.colectivo.cargarpasajeros(pasajero1);
		
		assertTrue(pasajeroCargado);
	}
	
	@Test
	public void dadoQueExisteUnColectivoAlCargarMasPasajerosDeLosSoportadosObtengoUnResultadoNegativo() {
		Colectivo miniColectivo = new Colectivo("MIN-001", 200d, 2);
		Pasajero pasajero1 = new Pasajero ("Jorge", 80d);
		Pasajero pasajero2 = new Pasajero("Romina", 65d);
		Pasajero pasajero3 = new Pasajero("Ezequiel", 20d);
		
		miniColectivo.cargarpasajeros(pasajero1);
		miniColectivo.cargarpasajeros(pasajero2);
		miniColectivo.cargarpasajeros(pasajero3);
		Integer pasajerosEnColectivo = miniColectivo.getPasajeros().size();
		Integer cantidadEsperada = 2;
		
		assertEquals(cantidadEsperada, pasajerosEnColectivo);
	}
	
	@Test
	public void dadoQueExisteUnColectivoAlCargarMasPesoDeLosSoportadoObtengoUnResultadoNegativo() {
		Colectivo miniColectivo = new Colectivo("MIN-002", 100d, 3);
		Pasajero pasajero1 = new Pasajero ("Jorge", 80d);
		Pasajero pasajero2 = new Pasajero("Romina", 65d);
		Pasajero pasajero3 = new Pasajero("Ezequiel", 20d);
		
		miniColectivo.cargarpasajeros(pasajero1);
		miniColectivo.cargarpasajeros(pasajero2);
		miniColectivo.cargarpasajeros(pasajero3);
		Integer pasajerosEnColectivo = miniColectivo.getPasajeros().size();
		Integer cantidadEsperada = 2;
		
		assertEquals(cantidadEsperada, pasajerosEnColectivo);
	}

}
