package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProductoAlimenticionTest {
	
	private ProductoAlimenticio productoAlimenticio;
	
	@Before
	public void init() {
		this.productoAlimenticio = new ProductoAlimenticio("Hamburguesa", 10000d, "Hamburguesa Doble");
	}
	
	@Test
	public void dadoQueExisteUnProductoAlimenticioAlConsultarSuNombreObtengoUnResultadoPositivo() {
		
		String nombreProductoAlimenticio = this.productoAlimenticio.getNombre();
		String nombreEsperado = "Hamburguesa";
		
		assertEquals(nombreProductoAlimenticio, nombreEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoAlimenticioAlConsultarSuPrecioBaseObtengoUnResultadoPositivo() {
		
		Double precioBaseProductoAlimenticio = this.productoAlimenticio.getPrecio();
		Double precioBaseeEsperado = 10000d;
		
		assertEquals(precioBaseProductoAlimenticio, precioBaseeEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoAlimenticioAlConsultarSuDescripcionObtengoUnResultadoPositivo() {
		
		String descripcionProductoAlimenticio = this.productoAlimenticio.getDescripcion();
		String descripcionEsperada = "Hamburguesa Doble";
		
		assertEquals(descripcionProductoAlimenticio, descripcionEsperada);
	}
	
	@Test 
	public void dadoQueExisteUnProductoAlimenticioAlCalcularSuPrecioFinalObtengoUnResultadoPositivo(){
		
		Double preciofinal = this.productoAlimenticio.calcularPrecioFinal();
		Double precioFinalEsperado = 11825d;
		
		assertEquals(preciofinal, precioFinalEsperado);
	}
}
