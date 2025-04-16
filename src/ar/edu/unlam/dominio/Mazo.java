package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Mazo {

	private static final int MAXIMO_CARTAS_DUPLICADAS = 2;
	private static final int MAXIMO_CARTAS = 5;
	
	private ArrayList<Carta> cartas;
	private HashSet<Carta> cartasSinDuplicados;

	public Mazo() {
		this.cartas = new ArrayList<>();
		this.cartasSinDuplicados = new HashSet<>();
	}

	public boolean agregarCarta(Carta carta) {
		// 1 2 3 4 5
		boolean agregado = false;
		
		// Si la coleccion contiene una carta de la que quiere agregar, entonces me fijo
		// cuantas hay

		int contador = this.obtenerCantidadDeDuplicados(carta);

		if (this.cartas.size() < MAXIMO_CARTAS && contador < MAXIMO_CARTAS_DUPLICADAS) {
			agregado = this.cartas.add(carta);
		}
		
		return agregado;
	}

	private int obtenerCantidadDeDuplicados(Carta carta) {
		int contador = 0;
		
		if (this.cartas.contains(carta)) {
			
			for (Carta cartaDeColeccion : this.cartas) {

				if (cartaDeColeccion.getNumero().equals(carta.getNumero())) {
					contador++;
				}
			}
		}
		return contador;
	}

	public boolean agregarCartaSinDuplicados(Carta carta) {
		return this.cartasSinDuplicados.add(carta);
	}

}
