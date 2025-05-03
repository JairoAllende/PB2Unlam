package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MercadoPagoTest {
	
	private MercadoPago mercadoPago;
	
	@Before
	public void init() {
		this.mercadoPago = new MercadoPago();
	}
	
	@Test 
	public void dadoQueExisteUnMercadoPagoAlProcesarUnPagoObtengoElMontoTotalAPagar(){
		Double montoTotal = this.mercadoPago.procesarPago(1000d);
		Double montoEsperado = 1120d;
		
		assertEquals(montoTotal, montoEsperado);
	}
}
