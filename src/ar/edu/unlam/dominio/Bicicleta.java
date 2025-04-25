package ar.edu.unlam.dominio;

import java.util.HashSet;

public class Bicicleta extends MedioDeTransporte{
	
	public Bicicleta() {
		super(0.125, 15.0);
	}

	@Override
	public Boolean cargarPaquete(Paquete paquete) {
	    Boolean paqueteCargado = super.cargarPaquete(paquete);

	    if (paqueteCargado && this.destinos.isEmpty()) {
	        this.destinos.add(paquetes.get(0).getDestino());
	    }

	    return paqueteCargado;
	}
	

	public void indicarDestino(String ciudad, String direccion) {
		Boolean ciudadIndicada = false;
		
		for (Destino destino : destinos) {
			if(destino.getCiudad().equals(ciudad)) {
				ciudadIndicada = true;
			}
		}
		
		if(this.destinos.isEmpty() || ciudadIndicada) {
			this.destinos.add(new Destino(ciudad, direccion));
		}
		
	}

	

	public HashSet<Destino> getDestinos() {
		return destinos;
	}

	public void setDestinos(HashSet<Destino> destinos) {
		this.destinos = destinos;
	}
	
	
}
