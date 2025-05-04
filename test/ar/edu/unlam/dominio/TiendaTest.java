package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TiendaTest {
	
	private Tienda tienda;
	
	@Before
	public void init() {
		this.tienda = new Tienda();
	}
	
	@Test
	public void dadoQueExisteUnaTiendaConProductosNoPerecederosAlConsultarLaSumaTotalDeLosPreciosUnitariosObtengoUnResultadoPositivo() {
		Double totalObtenido = this.tienda.obtenerTotalProductosNoPerecederos();
		Double totalEsperado = 267500d;
		
		assertEquals(totalEsperado, totalObtenido);
	}
	
	@Test
	public void dadoQueExisteUnaTiendaConProductosPerecederosAlConsultarLaSumaTotalDeLosPreciosUnitariosObtengoUnResultadoPositivo() {
		Double totalObtenido = this.tienda.obtenerTotalProductosPerecederos();
		Double totalEsperado = 472500d;
		
		assertEquals(totalEsperado, totalObtenido);
	}
	
	@Test
	public void dadoQueExisteUnaTiendaConProductosAlConsultarLaSumaTotalDeLosPreciosUnitariosObtengoUnResultadoPositivo() {
		Double totalObtenido = this.tienda.obtenerTotalProductos();
		Double totalEsperado = 740000d;
		
		assertEquals(totalEsperado, totalObtenido);
	}
}
