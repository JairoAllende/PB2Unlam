package ar.edu.unlam.dominio;

import java.util.Objects;

public class Carta {
	
	private Integer salud;
	private Integer numero;
	
	
	public Carta() {
		this.salud = 100;
	}

	public int getSalud() {
		return this.salud;
	}

	public void recibirDanio(int cantidadDeDanio) {
		this.salud -= cantidadDeDanio;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return this.numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, salud);
	}

	@Override
	public boolean equals(Object obj) {
		
		// Verifica si son el mismo objeto
		if (this == obj)
			return true;
		
		// Verifica que el parametro sea una instancia
		if (obj == null)
			return false;
		
		// Verifica que sean de la misma clase
		if (getClass() != obj.getClass())
			return false;
		
		Carta other = (Carta) obj;
		return Objects.equals(numero, other.numero) && Objects.equals(salud, other.salud);
	}
}
