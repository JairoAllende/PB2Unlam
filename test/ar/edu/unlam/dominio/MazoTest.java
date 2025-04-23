package ar.edu.unlam.dominio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MazoTest {
	
	private Mazo mazo;
	
	@Before
	public void init() {
		this.mazo = new Mazo();
	}

	// mazo con 5 cartas (maximo)
	// se admiten cartas duplicadas (hasta 2 iguales)

	@Test
	public void dadoQueExistenCartasCuandoAgregoUnaCartaAlMazoObtengoUnResultadoPositivo() {
		
		// preparacion
		Carta carta = new Carta();
		
		// ejecucion
		boolean cartaAgregada = this.mazo.agregarCarta(carta);
		
		// verificacion
		assertTrue(cartaAgregada);
	}
	
	@Test
	public void dadoQueExistenCartasCuandoAgregoUnaCartaMasQueElMaximoPermitidoObtengoUnResultadoNegativo() {
		
		// preparacion
		Carta carta = new Carta();
		carta.setNumero(1);
		
		Carta cartaDos = new Carta();
		cartaDos.setNumero(2);
		
		Carta cartaTres = new Carta();
		cartaTres.setNumero(3);
		
		// ejecucion
		boolean cartaUnoAgregada = this.mazo.agregarCarta(carta);
		boolean cartaDosAgregada = this.mazo.agregarCarta(carta);
		boolean cartaTresAgregada = this.mazo.agregarCarta(cartaDos);
		boolean cartaCuatroAgregada = this.mazo.agregarCarta(cartaDos);
		boolean cartaCincoAgregada = this.mazo.agregarCarta(cartaTres);
		boolean cartaSeisAgregada = this.mazo.agregarCarta(cartaTres);
		
		// verificacion
		assertTrue(cartaUnoAgregada);
		assertTrue(cartaDosAgregada);
		assertTrue(cartaTresAgregada);
		assertTrue(cartaCuatroAgregada);
		assertTrue(cartaCincoAgregada);
		assertFalse(cartaSeisAgregada);
	}
	
	@Test
	public void dadoQueExistenCartasCuandoAgregoUnaCartaTriplicadaObtengoUnResultadoNegativo() {
		
		// preparacion
		Carta carta = new Carta();
		carta.setNumero(1);
		
		// ejecucion
		boolean cartaUnoAgregada = this.mazo.agregarCarta(carta);
		boolean cartaDosAgregada = this.mazo.agregarCarta(carta);
		boolean cartaTresAgregada = this.mazo.agregarCarta(carta);
		
		// verificacion
		assertTrue(cartaUnoAgregada);
		assertTrue(cartaDosAgregada);
		assertFalse(cartaTresAgregada);
	}
	
	@Test
	public void dadoQueExisteUnaCartaCuandoLaAgregoAlMazoSinDuplicadosObtengoUnResultadoExitoso() {
		Carta carta = new Carta();
		carta.setNumero(1);
		
		boolean cartaAgregada = this.mazo.agregarCartaSinDuplicados(carta);
		
		assertTrue(cartaAgregada);
	}
	
	@Test
	public void dadoQueExistenCartasIgualesCuandoLasAgregoAlMazoSinDuplicadosObtengoUnResultadoNegativo() {
		Carta carta = new Carta();
		carta.setNumero(1);
		
		Carta cartaDos = new Carta();
		
		System.out.println(carta);
		cartaDos.setNumero(1);
		cartaDos.recibirDanio(10);
		
		boolean cartaAgregada = this.mazo.agregarCartaSinDuplicados(carta);
		boolean cartaDosAgregada = this.mazo.agregarCartaSinDuplicados(cartaDos);
		
		assertTrue(cartaAgregada);
		assertFalse(cartaDosAgregada);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
