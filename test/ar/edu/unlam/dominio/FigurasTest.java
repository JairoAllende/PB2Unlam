package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FigurasTest {
	
	
	@Test
	public void dadoQueExisteUnRectanguloSePuedeCalcularElPerimetro() {
		Rectangulo rectangulo1 = new Rectangulo(10, 20);
		
		Integer perimetro = rectangulo1.calcularPerimetroRectangulo();
		Integer perimetroEsperado = 60;
		
		assertEquals(perimetroEsperado, perimetro);
	}
	
	@Test
	public void dadoQueExisteUnCirculoSePuedeCalcularElPerimetro() {
		Circulo circulo1 = new Circulo(10);
		
		Double perimetro = circulo1.calcularPerimetroCirculo();
		Double perimetroEsperado = 62.832;
		
		assertEquals(perimetroEsperado, perimetro);
	}
}
