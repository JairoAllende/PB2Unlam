package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Camion extends Transporte {

//	private static final double DIMENSION_MAXIMA = 20;
//	private static final int PESO_MAXIMO = 16000;
	private ArrayList<String> ciudades;
//	private Double peso;
//	private ArrayList<Paquete> paquetes;

	// • Abarca todas las cuidades necesarias.
	// • Puede llevar hasta 20 m3 de carga y máximo de 16 toneladas

	public Camion() {
		super(20d, 16000d);
		this.ciudades = new ArrayList<String>();
	}

	public Camion(Double dimensionMaxima, Double pesoMaximo) {
		super(dimensionMaxima, pesoMaximo);
		this.ciudades = new ArrayList<String>();
	}

	public boolean agregarPaquete(Paquete paquete, String ciudadDeDestino) {
		return false;
	}
}
