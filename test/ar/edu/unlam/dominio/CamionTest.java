package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CamionTest {
	
	private Camion camion;
	
	@Before
	public void init() {
		this.camion = new Camion("CAM-001", 10000d, 3);
	}
	
	@Test
	public void dadoQueExisteUnCamionAlConsultarSuPatenteObtengoUnResultadoPositivo() {
		String patenteCamion = this.camion.getPatente();
		String patenteEsperada = "CAM-001";
		
		assertEquals(patenteCamion, patenteEsperada);
	}
	
	@Test
	public void dadoQueExisteUnCamionAlConsultarSuCapacidadDePesoMaximoObtengoUnResultadoPositivo() {
		Double pesoMaximoSoportado = this.camion.obtenerPesoMaximo();
		Double pesoMaximoEsperado = 10000d;
		
		assertEquals(pesoMaximoSoportado, pesoMaximoEsperado);
	}
	
	@Test
	public void dadoQueExisteUnCamionAlConsultarSuCapacidadMaximaDePasajerosObtengoUnResultadoPositivo() {
		Integer capacidadMaxima = this.camion.obtenerCapacidadMaximaDePasajeros();
		Integer capacidadMaximaEsperada = 3;
		
		assertEquals(capacidadMaxima, capacidadMaximaEsperada);
	}
	
	@Test
	public void dadoQueExisteUnCamionAlCargarUnPasajeroObtengoUnResultadoPositivo() {
		
		Pasajero pasajero1 = new Pasajero("Romina", 65d);
		
		Boolean pasajeroCargado = this.camion.cargarpasajeros(pasajero1);
		
		assertTrue(pasajeroCargado);
	}
	
	@Test
	public void dadoQueExisteUnCamionAlCargarMasPasajerosDeLosSoportadosObtengoUnResultadoNegativo() {
		Pasajero pasajero1 = new Pasajero ("Jorge", 80d);
		Pasajero pasajero2 = new Pasajero("Romina", 65d);
		Pasajero pasajero3 = new Pasajero("Ezequiel", 20d);
		Pasajero pasajero4 = new Pasajero("Roman", 20d);
		
		this.camion.cargarpasajeros(pasajero1);
		this.camion.cargarpasajeros(pasajero2);
		this.camion.cargarpasajeros(pasajero3);
		this.camion.cargarpasajeros(pasajero4);
		Integer pasajerosEnColectivo = this.camion.getPasajeros().size();
		Integer cantidadEsperada = 3;
		
		assertEquals(cantidadEsperada, pasajerosEnColectivo);
	}
	
	@Test
	public void dadoQueExisteUnCamionAlCargarMasPesoDeLosSoportadoObtengoUnResultadoNegativo() {
		Pasajero pasajero1 = new Pasajero ("Jorge", 80d);
		Pasajero pasajero2 = new Pasajero("Romina", 65d);
		
		this.camion.cargarpasajeros(pasajero1);
		this.camion.cargarpasajeros(pasajero2);
		Boolean pesoCargado = this.camion.ponerCarga(10000d);
		
		assertFalse(pesoCargado);
	}
	
	@Test
	public void dadoQueExisteUnCamionAlCargarUnPesoSoportadoObtengoUnResultadoPositivo() {
		Pasajero pasajero1 = new Pasajero ("Jorge", 80d);
		Pasajero pasajero2 = new Pasajero("Romina", 65d);
		
		this.camion.cargarpasajeros(pasajero1);
		this.camion.cargarpasajeros(pasajero2);
		Boolean pesoCargado = this.camion.ponerCarga(9855d);
		
		assertTrue(pesoCargado);
	}
}
