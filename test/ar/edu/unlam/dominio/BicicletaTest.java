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

	
	@Test
	public void dadoQueExisteUnaBicicletaCuandoLeCargoUnVolumenSoportadoElResultadoEsPositivo() {
		
		Paquete paquete1 = new Paquete("P-01",0.9,0.1,0.5,2.0,"Florencio Varela 1903");
		
		Boolean paquete1Cargado = this.bicicleta.cargarPaquete(paquete1);
		
		assertTrue(paquete1Cargado);	
		
	}
	
	@Test
	public void dadoQueExisteUnaBicicletaCuandoLeCargoMasDelVolumenSoportadoElResultadoEsNegativo() {
		
		Paquete paquete2 = new Paquete("P-02",1.0,1.0,1.0,2.0,"Florencio Varela 1903");
		
		Boolean paquete2Cargado = this.bicicleta.cargarPaquete(paquete2);
		
		assertFalse(paquete2Cargado);
	}
	
	@Test
	public void dadoQueExisteUnaBicicletaCuandoLeCargoUnPesoSoportadoElResultadoEsPositivo() {
		
		Paquete paquete3 = new Paquete("P-03",0.9,0.1,0.5,15.0,"Florencio Varela 1903");
		
		Boolean paquete2Cargado = this.bicicleta.cargarPaquete(paquete3);
		
		assertTrue(paquete2Cargado);
	}
	
	@Test
	public void dadoQueExisteUnaBicicletaCuandoLeCargoMasPesoDelSoportadoElResultadoEsNegativo() {
		
		Paquete paquete4 = new Paquete("P-04",0.9,0.1,0.5,25.0,"Florencio Varela 1903");
		
		Boolean paquete2Cargado = this.bicicleta.cargarPaquete(paquete4);
		
		assertFalse(paquete2Cargado);
	}
	
	@Test
	public void dadoQueExisteUnaBicicletaAlIndicarleUnDestinoElResultadoEsPositivo() {
		
		this.bicicleta.indicarDestino("San Justo", "Florencio Varela 1903");
		
		Destino destinoIndicado = this.bicicleta.getDestino();
		Destino destinoEsperado = new Destino("San Justo", "Florencio Varela 1903");
		
		assertEquals(destinoEsperado, destinoIndicado);
	}
	
	@Test
	public void dadoQueExistenDosPaquetesAlCargarlosEnLaBicicletaSiNoSeIndicaElDestinoElPrimerPaqueteDefineElDestino() {
		
		Paquete paquete5 = new Paquete("P-05",0.1,0.1,0.1,1.0, new Destino("Ramos Mejia", "Av. Rivadavia 13000"));
		Paquete paquete6 = new Paquete("P-06",0.1,0.1,0.1,11.0, new Destino("San Justo", "Florencio Varela 1903"));
		
		this.bicicleta.cargarPaquete(paquete5);
		this.bicicleta.cargarPaquete(paquete6);
		
		Destino destinoEsperado = new Destino("Ramos Mejia", "Av. Rivadavia 13000");
		
		assertEquals(destinoEsperado, this.bicicleta.getDestino());
		
	}
	
	//Falta el test de moverse en una unica ciudad
	
	
}
