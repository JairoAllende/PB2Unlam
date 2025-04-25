package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AutoTest {

	private Auto auto;
	
	@Before
	public void init() {
		this.auto = new Auto();	
	}
	
	@Test
	public void dadoQueExisteUnAutoCuandoLeCargoUnVolumenSoportadoElResultadoEsPositivo() {
		Paquete paquete1 = new Paquete("P-01", 1.0, 1.0, 1.0, 10.0, new Destino("Ciudadela" , "Saavedra 3400"));
		
		Boolean paquete1Cargado = this.auto.cargarPaquete(paquete1);
		
		assertTrue(paquete1Cargado);
	}
	
	@Test
	public void dadoQueExisteUnAutoCuandoLeCargoUnVolumenNoSoportadoElResultadoEsNegativo() {
		Paquete paquete2 = new Paquete("P-02", 1.0, 1.5, 2.0, 10.0, new Destino("Ciudadela" , "Saavedra 3400"));
		
		Boolean paquete2Cargado = this.auto.cargarPaquete(paquete2);
		
		assertFalse(paquete2Cargado);
	}
	
	@Test
	public void dadoQueExisteUnAutoCuandoLeCargoUnPesoSoportadoElResultadoEsPositivo() {
		Paquete paquete3 = new Paquete("P-03", 1.0, 1.0, 1.0, 499.0, new Destino("Ciudadela" , "Saavedra 3400"));
		
		Boolean paquete3Cargado = this.auto.cargarPaquete(paquete3);
		
		assertTrue(paquete3Cargado);
	}
	
	@Test
	public void dadoQueExisteUnAutoCuandoLeCargoUnPesoNoSoportadoElResultadoEsNegativo() {
		Paquete paquete4 = new Paquete("P-04", 1.0, 1.0, 1.0, 520.0, new Destino("Ciudadela" , "Saavedra 3400"));
		
		Boolean paquete4Cargado = this.auto.cargarPaquete(paquete4);
		
		assertFalse(paquete4Cargado);
	}
	
	@Test
	public void dadoQueExisteUnAutoCuandoLeIndicoUnaDestinoElResultadoEsPositivo() {
		this.auto.indicarDestino("Ciudadela", "Saavedra 3400");
		
		Destino destinoIndicado = this.auto.getDestino("Ciudadela", "Saavedra 3400");
		Destino destinoEsperado = new Destino("Ciudadela", "Saavedra 3400");
		
		assertEquals(destinoEsperado, destinoIndicado);
	}
	
	@Test
	public void dadoQueExisteUnAutoCuandoLeIndicoMasdeTresCiudadesDistintasSoloSeAgreganTresCiudades() {
		this.auto.indicarDestino("Ciudadela", "Saavedra 3400");
		this.auto.indicarDestino("Moron", "Rivadavia 3000");
		this.auto.indicarDestino("Casanova", "Brasil 333");
		this.auto.indicarDestino("La tablada", "Jose ingenieros 3131");
		
		Integer cantidadDeCiudades = this.auto.getDestinos().size();
		Integer cantidadDeCiudadesEsperadas = 3;
		
		assertEquals(cantidadDeCiudadesEsperadas, cantidadDeCiudades);
	}
	
	@Test
	public void dadoQueExisteUnAutoCuandoSeLeIndicaElDestinoMasDeUnaVezSoloSeGuardaUnaVez() {
		this.auto.indicarDestino("Ciudadela", "Saavedra 3400");
		this.auto.indicarDestino("Moron", "Rivadavia 3000");
		this.auto.indicarDestino("Ciudadela", "Saavedra 3400");
		
		Integer cantidadDeCiudades = this.auto.getDestinos().size();
		Integer cantidadDeCiudadesEsperadas = 2;
		
		assertEquals(cantidadDeCiudadesEsperadas, cantidadDeCiudades);
	}
}
