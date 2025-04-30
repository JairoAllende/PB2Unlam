package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Bicicleta extends Transporte {

	// Se pasaron a la clase Transporte
	//	private static final double DIMENSION_MAXIMA = 0.125;
	//	private static final int PESO_MAXIMO = 15;
	//	private Double peso;
	//	private ArrayList<Paquete> paquetes;
	
	private static final int CANTIDAD_MAXIMA = 2;
	private String ciudad;

	// Misma ciudad
	// 2 paquetes
	// 0.125 m3 maximo entre los dos
	// 15kg maximo entre los dos
	// NOTA: Si no tengo destino, el primer paquete me define el destino hacia dónde
	// va la bicicleta.

	public Bicicleta() {
		super(0.125d, 15d);
		this.ciudad = "";
	}

	private Bicicleta(Double dimensionMaxima, Double pesoMaximo) {
		super(dimensionMaxima, pesoMaximo);
		// super.setPeso(0d);
		this.ciudad = "";
	}

	/**
	 * Ejemplo de javadoc
	 * Agrega paquetes a la bicicleta
	 * 
	 * @return verdadero si aplica las validaciones
	 * @see <a href="https://www.baeldung.com/javadoc">Documentación de javadoc en Baeldung</a>
	 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html">Documentación de javadoc en Oracle</a>
	 * @since   1.0
	 * */
	@Override
	public boolean agregarPaquete(Paquete paquete, String ciudadDeDestino) {
		boolean agregado = false;

		if (this.ciudad.isEmpty() && ciudadDeDestino.isEmpty()) {
			this.ciudad = paquete.getCiudad();
		}

		Double volumenNuevo = super.getVolumen() + paquete.obtenerVolumen();
		Double pesoNuevo = super.getPeso() + paquete.getPeso();

		if (this.volumenValido(volumenNuevo) 
				&& this.pesoValido(pesoNuevo) 
				&& super.getPaquetes().size() < CANTIDAD_MAXIMA
				&& this.ciudad.equals(paquete.getCiudad())) {
			
			// Falto acumular el volumen y peso a la bici
			super.setVolumen(volumenNuevo);
			super.setPeso(pesoNuevo);
			agregado = super.getPaquetes().add(paquete);
		}

		return agregado;
	}

	private boolean pesoValido(Double peso) {
		return peso <= super.PESO_MAXIMO;
	}

	private boolean volumenValido(Double dimension) {
		return dimension <= super.VOLUMEN_MAXIMO;
	}
}
