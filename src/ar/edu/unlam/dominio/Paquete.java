package ar.edu.unlam.dominio;

import java.util.Objects;

public class Paquete {

	private String codigo;
	private Double alto;
	private Double ancho;
	private Double profundidad;
	private Double peso;
	private String direccion;
	private Destino destino;

	public Paquete(String codigo, Double alto, Double ancho, Double profundidad, Double peso, String direccion) {
		this.codigo = codigo;
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
		this.direccion = direccion;
	}
	
	public Paquete(String codigo, Double alto, Double ancho, Double profundidad, Double peso, Destino destino) {
		this.codigo = codigo;
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
		this.destino = destino;
	}

	public Double calcularVolumen() {
		return this.alto * this.ancho * this.profundidad;
	}
	
	public Double getPeso() {
		return this.peso;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public Destino getDestino() {
		return this.destino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho, codigo, destino, peso, profundidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		return Objects.equals(alto, other.alto) && Objects.equals(ancho, other.ancho)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(destino, other.destino)
				&& Objects.equals(peso, other.peso) && Objects.equals(profundidad, other.profundidad);
	}

	@Override
	public String toString() {
		return "Paquete [codigo=" + codigo + ", alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad
				+ ", peso=" + peso + ", direccion=" + direccion + ", destino=" + destino + "]";
	}
	
	
}
