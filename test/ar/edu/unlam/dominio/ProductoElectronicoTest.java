package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProductoElectronicoTest {
	
	private ProductoElectronico productoElectronico;
	
	@Before
	public void init() {
		this.productoElectronico = new ProductoElectronico("Smart-TV", 300000d, "Smart TV 40''");
	}
	
	@Test
	public void dadoQueExisteUnProductoElectronicoAlConsultarSuNombreObtengoUnResultadoPositivo() {
		
		String nombreProductoElectronico = this.productoElectronico.getNombre();
		String nombreEsperado = "Smart-TV";
		
		assertEquals(nombreProductoElectronico, nombreEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoElectronicoAlConsultarSuPrecioBaseObtengoUnResultadoPositivo() {
		
		Double precioBaseProductoElectronico = this.productoElectronico.getPrecio();
		Double precioBaseeEsperado = 300000d;
		
		assertEquals(precioBaseProductoElectronico, precioBaseeEsperado);
	}
	
	@Test
	public void dadoQueExisteUnProductoElectronicoAlConsultarSuDescripcionObtengoUnResultadoPositivo() {
		
		String descripcionProductoElectronico = this.productoElectronico.getDescripcion();
		String descripcionEsperada = "Smart TV 40''";
		
		assertEquals(descripcionProductoElectronico, descripcionEsperada);
	}
	
	@Test 
	public void dadoQueExisteUnProductoElectronicoAlCalcularSuPrecioFinalObtengoUnResultadoPositivo(){
		
		Double preciofinal = this.productoElectronico.calcularPrecioFinal();
		Double precioFinalEsperado = 345000d;
		
		assertEquals(preciofinal, precioFinalEsperado);
	}
	
	
	//CUando hacemos TDD es necesario/importante hacerlo tambien a una clase padre o abstracta?
}
