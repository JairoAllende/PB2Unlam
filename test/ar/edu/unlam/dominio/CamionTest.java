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
		this.camion = new Camion();
	}
	
	@Test
	public void dadoQueExisteUnCamionCuandoLeIndicoUnDestinoElResultadoEsPositivo() {
		this.camion.indicarDestino("Ramos Mejia", "Marmol 111");
		
		Destino destinoIndicado = this.camion.getDestino("Ramos Mejia", "Marmol 111");
		Destino destinoEsperado = new Destino("Ramos Mejia", "Marmol 111");
		
		assertEquals(destinoIndicado, destinoEsperado);
		
	}
	
	@Test
	public void dadoQueExisteUnCamionCuandoLeCargoUnPaqueteConUnVolumenSoportadoElResultadoEsPositivo() {
		
		Paquete paquete1 = new Paquete("P-01", 3.0, 4.0, 1.0, 4000.0, new Destino("San Justo", "Florencio Varela 1601"));
		
		Boolean paquete1Cargado = this.camion.cargarPaquete(paquete1);
		
		assertTrue(paquete1Cargado);
	}
	
	@Test
	public void dadoQueExisteUnCamionCuandoLeCargoUnPaqueteConUnVolumenNoSoportadoElResultadoEsNegativo() {
		
		Paquete paquete1 = new Paquete("P-01", 5.0, 4.0, 2.0, 4000.0, new Destino("San Justo", "Florencio Varela 1601"));
		
		Boolean paquete1Cargado = this.camion.cargarPaquete(paquete1);
		
		assertFalse(paquete1Cargado);
	}
	
	@Test
	public void dadoQueExisteUnCamionCuandoLeCargoUnPaqueteConUnPesoSoportadoElResultadoEsPositivo() {
		
		Paquete paquete1 = new Paquete("P-01", 1.0, 1.0, 2.0, 16000.0, new Destino("San Justo", "Florencio Varela 1601"));
		
		Boolean paquete1Cargado = this.camion.cargarPaquete(paquete1);
		
		assertTrue(paquete1Cargado);
	}
	
	@Test
	public void dadoQueExisteUnCamionCuandoLeCargoUnPaqueteConUnPesoNoSoportadoElResultadoEsNegativo() {
		
		Paquete paquete1 = new Paquete("P-01", 1.0, 1.0, 2.0, 18000.0, new Destino("San Justo", "Florencio Varela 1601"));
		
		Boolean paquete1Cargado = this.camion.cargarPaquete(paquete1);
		
		assertFalse(paquete1Cargado);
	}
	
	
}
