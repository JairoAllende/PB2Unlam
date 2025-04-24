package ar.edu.unlam.dominio;

import java.util.Objects;

public class Destino {
	
	private String ciudad;
	private String direccion;
	
	public Destino(String ciudad, String direccion) {
		this.ciudad = ciudad;
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, direccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(direccion, other.direccion);
	}
	
	
}
