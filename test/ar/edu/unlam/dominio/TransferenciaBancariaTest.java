package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TransferenciaBancariaTest {
	
	private TransferenciaBancaria transferenciaBancaria;
	
	@Before
	public void init() {
		this.transferenciaBancaria = new TransferenciaBancaria();
	}
	
	@Test 
	public void dadoQueExisteUnaTransferenciaBancariaAlProcesarUnPagoMenorA100000ObtengoElMontoTotalAPagar(){
		
		Double montoTotal = this.transferenciaBancaria.procesarPago(1000d);
		Double montoEsperado = 1000d;
		
		assertEquals(montoEsperado, montoTotal);
	}
	
	@Test 
	public void dadoQueExisteUnaTransferenciaBancariaAlProcesarUnPagoMayorA100000ObtengoElMontoTotalAPagar(){
		
		Double montoTotal = this.transferenciaBancaria.procesarPago(200000d);
		Double montoEsperado = 202000d;
		
		assertEquals(montoEsperado, montoTotal);
	}
}
