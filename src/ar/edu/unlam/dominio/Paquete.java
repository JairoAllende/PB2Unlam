package ar.edu.unlam.dominio;

public class Paquete {

	private Double alto;
	private Double profundidad;
	private Double peso;
	private String ciudad;
	private Double ancho;

	public Paquete() {
		this.alto = 0d;
		this.profundidad = 0d;
		this.peso = 0d;
		this.ciudad = "";
		this.ancho = 0d;
	}
	
	public Paquete(Double alto, Double profundidad, Double peso, String ciudad, Double ancho) {
		this.alto = alto;
		this.profundidad = profundidad;
		this.peso = peso;
		this.ciudad = ciudad;
		this.ancho = ancho;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public Double getAlto() {
		return this.alto;
	}

	public Double getAncho() {
		return this.ancho;
	}

	public Double getProfundidad() {
		return this.profundidad;
	}

	public Double getPeso() {
		return this.peso;
	}
	
	public Double obtenerVolumen() {
		return this.profundidad * this.ancho * this.alto;
	}

}
