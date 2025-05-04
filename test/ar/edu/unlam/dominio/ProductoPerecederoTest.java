package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProductoPerecederoTest {
	
	private ProductoPerecedero productoPerecedero;
	
	@Before
	public void init() {
		this.productoPerecedero = new ProductoPerecedero("Manzana", 100, 2000d);
	}
	
	@Test
	public void dadoQueExisteUnProductoPerecederoAlconsultarElNombreDelProductoObtengoUnResultadoPositivo() {
		String nombreObtenido = this.productoPerecedero.getNombre();
		String nombreEsperado = "Manzana";
		
		assertEquals(nombreObtenido, nombreEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoPerecederoAlConsultarLaCantidadObtengoUnResultadoPositivo() {
		Integer cantidadObtenida = this.productoPerecedero.getCantidad();
		Integer cantidadEsperada = 100;
		
		assertEquals(cantidadObtenida, cantidadEsperada);
	}
	
	@Test
	public void dadoQueExisteUnProductoPerecederoAlconsultarElPrecioUnitarioBaseObtengoUnResultadoPositivo() {
		Double precioUnitarioObtenido = this.productoPerecedero.getPrecioUnitario();
		Double precioUnitarioEsperado = 2000d;
		
		assertEquals(precioUnitarioObtenido, precioUnitarioEsperado);
	}
}
