package ar.edu.unlam.dominio;

public class Pasajero {

	private String nombre;
	private Double peso;
	
	public Pasajero(String nombre, Double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPeso() {
		return this.peso;
	}

}
