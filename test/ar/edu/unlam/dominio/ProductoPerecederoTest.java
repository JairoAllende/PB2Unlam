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
		Double precioUnitarioBaseObtenido = this.productoPerecedero.getPrecioUnitario();
		Double precioUnitarioBaseEsperado = 2000d;
		
		assertEquals(precioUnitarioBaseObtenido, precioUnitarioBaseEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoPerecederoAlconsultarElPrecioUnitarioTotalObtengoUnResultadoPositivo() {
		Double precioUnitarioTotalObtenido = this.productoPerecedero.obtenerPrecio();
		Double precioUnitarioTotalEsperado = 2100d;
		
		assertEquals(precioUnitarioTotalObtenido, precioUnitarioTotalEsperado);
	}
}
