package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Transporte implements Vehiculo {

	//private ArrayList<String> ciudades;

	protected final Double VOLUMEN_MAXIMO;
	protected final Double PESO_MAXIMO;
	private Double peso;
	private Double volumen;
	private List<Paquete> paquetes;
	
	private Transporte() {
		VOLUMEN_MAXIMO = 0d;
		PESO_MAXIMO = 0d;
	}
	
	public Transporte(Double dimensionMaxima, Double pesoMaximo) {
		VOLUMEN_MAXIMO = dimensionMaxima;
		PESO_MAXIMO = pesoMaximo;
		
		this.peso = 0d;
		this.volumen = 0d;
		this.paquetes = new ArrayList<>();
//		this.paquetes = new LinkedList<>();
	}
	
	@Override
	public boolean agregarPaquete(Paquete paqueteValido, String ciudadDeDestino) {
		// Lanzar una excepcion
		return false;
	}
	
	@Override
	public boolean realizarEntrega(Paquete paquete) {
		// Lanzar una excepcion
		return false;
	}
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Double getVolumen() {
		return volumen;
	}
	
	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public List<Paquete> getPaquetes() {
		return this.paquetes;
	}
}
