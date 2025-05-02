package ar.edu.unlam.dominio;

public class Camion extends Vehiculo{
	
	public Camion(String patente, Double pesoMaximo, Integer capacidadDeCarga) {
		super(patente, pesoMaximo, capacidadDeCarga);
	}
	
	public Boolean ponerCarga(Double carga) {
		Boolean cargaPuesta = false;
		
		if(this.pesoMaximo >= carga) {
			this.pesoMaximo -= carga;
			return cargaPuesta = true;
		}
		
		return cargaPuesta;
	}
}
