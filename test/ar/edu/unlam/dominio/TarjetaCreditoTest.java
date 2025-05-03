package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TarjetaCreditoTest {
	
	private TarjetaCredito tarjetaCredito;
	
	@Before
	public void init() {
		this.tarjetaCredito = new TarjetaCredito();
	}
	
	@Test 
	public void dadoQueExisteUnaTarjetaDeCreditoAlProcesarUnPagoObtengoElMontoTotalAPagar(){
		Double montoTotal = this.tarjetaCredito.procesarPago(1000d);
		Double montoEsperado = 1227d;
		
		assertEquals(montoTotal, montoEsperado);
	}
	
	@Test 
	public void dadoQueExisteUnaTarjetaDeCreditoAlProcesarUnPagoPorUnMontoMayorAlDisponibleElPagoNoSeProcesa(){
		Double montoTotal = this.tarjetaCredito.procesarPago(4000d);
		Double montoEsperado = null;
		
		assertEquals(montoTotal, montoEsperado);
	}
}
