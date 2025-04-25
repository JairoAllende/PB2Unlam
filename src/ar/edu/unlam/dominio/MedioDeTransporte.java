package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class MedioDeTransporte {
	
	protected ArrayList<Paquete> paquetes = new ArrayList<>();
	protected Double capacidadVolumenMaximo;
	protected Double capacidadPesoMaximo;
	
	public MedioDeTransporte(Double capacidadVolumenMaximo, Double capacidadPesoMaximo) {
		this.capacidadVolumenMaximo = capacidadVolumenMaximo;
		this.capacidadPesoMaximo = capacidadPesoMaximo;
	}
	
	public Boolean cargarPaquete(Paquete paquete) {
		
		Boolean paqueteCargado = false;
		
		if(paquete.calcularVolumen() <= this.capacidadVolumenMaximo && paquete.getPeso() <= this.capacidadPesoMaximo) {
			this.capacidadPesoMaximo -= paquete.calcularVolumen();
			this.capacidadPesoMaximo -= paquete.getPeso();
			
			return paquetes.add(paquete);
		}
		
		return paqueteCargado;
	}	
	
}
