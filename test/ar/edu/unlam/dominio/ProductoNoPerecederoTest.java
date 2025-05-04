package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProductoNoPerecederoTest {
	
	private ProductoNoPerecedero productoNoPerecedero;
	
	@Before
	public void init() {
		this.productoNoPerecedero = new ProductoNoPerecedero("Arroz", 100, 1500d);
	}
	
	@Test
	public void dadoQueExisteUnProductoNoPerecederoAlconsultarElNombreDelProductoObtengoUnResultadoPositivo() {
		String nombreObtenido = this.productoNoPerecedero.getNombre();
		String nombreEsperado = "Arroz";
		
		assertEquals(nombreObtenido, nombreEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoNoPerecederoAlConsultarLaCantidadObtengoUnResultadoPositivo() {
		Integer cantidadObtenida = this.productoNoPerecedero.getCantidad();
		Integer cantidadEsperada = 100;
		
		assertEquals(cantidadObtenida, cantidadEsperada);
	}
	
	@Test
	public void dadoQueExisteUnProductoNoPerecederoAlconsultarElPrecioUnitarioBaseObtengoUnResultadoPositivo() {
		Double precioUnitarioObtenido = this.productoNoPerecedero.getPrecioUnitario();
		Double precioUnitarioEsperado = 1500d;
		
		assertEquals(precioUnitarioObtenido, precioUnitarioEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoPerecederoAlconsultarElPrecioUnitarioTotalObtengoUnResultadoPositivo() {
		Double precioUnitarioTotalObtenido = this.productoNoPerecedero.obtenerPrecio();
		Double precioUnitarioTotalEsperado = 1605d;
		
		assertEquals(precioUnitarioTotalObtenido, precioUnitarioTotalEsperado);
	}
}
