package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProductoRopaTest {
	
	private ProductoRopa productoRopa;
	
	@Before
	public void init() {
		this.productoRopa = new ProductoRopa("Remera", 30000d, "Remera 100% algodon");
	}
	
	@Test
	public void dadoQueExisteUnProductoRopaAlConsultarSuNombreObtengoUnResultadoPositivo() {
		
		String nombreProductoRopa = this.productoRopa.getNombre();
		String nombreEsperado = "Remera";
		
		assertEquals(nombreProductoRopa, nombreEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoRopaAlConsultarSuPrecioBaseObtengoUnResultadoPositivo() {
		
		Double precioBaseProductoRopa = this.productoRopa.getPrecio();
		Double precioBaseeEsperado = 30000d;
		
		assertEquals(precioBaseProductoRopa, precioBaseeEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoRopaAlConsultarSuDescripcionObtengoUnResultadoPositivo() {
		
		String descripcionProductoRopa = this.productoRopa.getDescripcion();
		String descripcionEsperada = "Remera 100% algodon";
		
		assertEquals(descripcionProductoRopa, descripcionEsperada);
	}
	
	@Test 
	public void dadoQueExisteUnProductoRopaAlCalcularSuPrecioFinalObtengoUnResultadoPositivo(){
		
		Double preciofinal = this.productoRopa.calcularPrecioFinal();
		Double precioFinalEsperado = 31500d;
		
		assertEquals(preciofinal, precioFinalEsperado);
	}
}
