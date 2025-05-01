package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaqueteTest {
	
	@Test
	public void dadoQueNoExisteUnPaqueteAlCrearsePuedoSaberSuVolumen() {
		
		Paquete paquete1 = new Paquete("P-01",0.7,1.0,0.5,6.0,"Florencio Varela 1903");
		
		Double volumenPaquete1 = paquete1.calcularVolumen();
		Double volumenEsperado = 0.35;
		
		assertEquals(volumenEsperado, volumenPaquete1);
	}
	
	@Test
	public void dadoQueNoExisteUnPaqueteAlCrearsePuedoSaberSuPeso() {
		
		Paquete paquete1 = new Paquete("P-01",0.7,1.0,0.5,6.0,"Florencio Varela 1903");
		
		Double pesoPaquete1 = paquete1.getPeso();
		Double pesoEsperado = 6.0;
		
		assertEquals(pesoEsperado, pesoPaquete1);
	}
	
	@Test
	public void dadoQueNoExisteUnPaqueteAlCrearsePuedoSaberSuDestino() {
		
		Paquete paquete1 = new Paquete("P-01",0.7,1.0,0.5,6.0,"Florencio Varela 1903");
		
		String destinoPaquete1 = paquete1.getDireccion();
		String destinoEsperado = "Florencio Varela 1903";
		
		assertEquals(destinoEsperado, destinoPaquete1);
	}
	
	
	
}
