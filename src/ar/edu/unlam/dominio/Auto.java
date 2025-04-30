package ar.edu.unlam.dominio;

import java.util.HashSet;
import java.util.Set;

public class Auto extends Transporte {

	// Se pasaron a la clase Transporte
	//	private static final double DIMENSION_MAXIMA = 2;
	//	private static final int PESO_MAXIMO = 500;
	//	private Double peso;
	//	private ArrayList<Paquete> paquetes;

	// • Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
	// • Puede llevar hasta 2m3 de carga y hasta 500kg.
	
	// Se cambio el tipo de dato por la interfaz Set
	private Set<String> ciudades;

	public Auto() {
		super(2d, 500d); // Esto es similar a tener las constantes en esta clase.
		this.ciudades = new HashSet<String>(); // La implementacion se mantiene.
	}

	// No permitimos usar este constructor
	private Auto(Double dimensionMaxima, Double pesoMaximo) {
		super(dimensionMaxima, pesoMaximo);
		this.ciudades = new HashSet<String>();
	}

	public boolean agregarPaquete(Paquete paquete, String ciudadDeDestino) {
		boolean paqueteAgregado = false;
		Double nuevoPeso = super.getPeso() + paquete.getPeso();
		Double nuevoVolumen = super.getVolumen() + paquete.obtenerVolumen();
		
		if(this.ciudades.size() < 3
				&& this.pesoValido(nuevoPeso)
				&& this.volumenValido(nuevoVolumen)) {
			
			this.ciudades.add(ciudadDeDestino);
			super.setPeso(nuevoPeso);
			super.setVolumen(nuevoVolumen);
			paqueteAgregado = super.getPaquetes().add(paquete);
		}
		
		return paqueteAgregado;
	}

	private boolean volumenValido(Double nuevoVolumen) {
		return nuevoVolumen <= VOLUMEN_MAXIMO;
	}

	private boolean pesoValido(Double nuevoPeso) {
		return nuevoPeso < PESO_MAXIMO;
	}

}
