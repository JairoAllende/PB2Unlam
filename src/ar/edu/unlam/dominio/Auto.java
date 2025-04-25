package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Auto extends MedioDeTransporte{
	
	private final Integer MAXIMO_DE_CIUDADES = 3;
	
	public Auto() {
		super(2.0, 500.0);
	}
	
	@Override
	public void indicarDestino(String ciudad, String direccion) {
		Integer contador = 1;
		Boolean mismaDireccion = false;
		
		for (Destino destino : destinos) {
			if(!destino.getCiudad().equals(ciudad)) {
				contador++;
			}
			
			if(destino.getDireccion().equals(direccion)) {
				mismaDireccion = true;
			}
		}
		
		if(this.destinos.isEmpty() || contador <= MAXIMO_DE_CIUDADES) {
			if(mismaDireccion == false) {
				this.destinos.add(new Destino(ciudad, direccion));
			}
			
		}
		
	}
	
	

	public HashSet<Destino> getDestinos() {
		return destinos;
	}
}
