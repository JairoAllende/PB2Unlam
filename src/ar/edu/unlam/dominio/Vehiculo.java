package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
	
	protected String patente;
	protected Double pesoMaximo;
	protected Integer capacidadCargaMaxima;
	protected List<Pasajero> pasajeros = new ArrayList<>();
	
	public Vehiculo(String patente, Double pesoMaximo,Integer capacidadDeCarga) {
		this.patente = patente;
		this.pesoMaximo = pesoMaximo;
		this.capacidadCargaMaxima = capacidadDeCarga;
	}
	
	public String getPatente() {
		return this.patente;
	}
	
	public Boolean cargarpasajeros(Pasajero pasajero) {
		Boolean pasajeroCargado = false;
		
		if(this.pesoMaximo >= pasajero.getPeso() && this.capacidadCargaMaxima > 0) {
			this.pesoMaximo -= pasajero.getPeso();
			this.capacidadCargaMaxima--;
			
			pasajeroCargado = pasajeros.add(pasajero);
			return pasajeroCargado;
		}
		
		return pasajeroCargado;
	}
	
	public Double obtenerPesoMaximo() {
		return this.pesoMaximo;
	}
	
	public Integer obtenerCapacidadMaximaDePasajeros() {
		return this.capacidadCargaMaxima;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}
	
}
