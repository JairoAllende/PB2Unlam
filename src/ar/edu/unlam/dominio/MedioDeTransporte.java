package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class MedioDeTransporte {
	
	protected ArrayList<Paquete> paquetes = new ArrayList<>();
	protected HashSet<Destino> destinos = new HashSet<>();
	protected Double capacidadVolumenMaximo;
	protected Double capacidadPesoMaximo;
	
	public MedioDeTransporte(Double capacidadVolumenMaximo, Double capacidadPesoMaximo) {
		this.capacidadVolumenMaximo = capacidadVolumenMaximo;
		this.capacidadPesoMaximo = capacidadPesoMaximo;
	}
	
	public Boolean cargarPaquete(Paquete paquete) {
		
		Boolean paqueteCargado = false;
		
		if(paquete.calcularVolumen() <= this.capacidadVolumenMaximo && paquete.getPeso() <= this.capacidadPesoMaximo) {
			this.capacidadVolumenMaximo -= paquete.calcularVolumen();
			this.capacidadPesoMaximo -= paquete.getPeso();
			
			return paquetes.add(paquete);
		}
		
		return paqueteCargado;
	}
	
	
	public void indicarDestino(String ciudad, String direccion) {
		
		this.destinos.add(new Destino(ciudad, direccion));
		
	}
	
	public Destino getDestino(String ciudad, String direccion) {
		Destino destinoBuscado = null;
		
		if(this.destinos.contains(new Destino(ciudad, direccion))) {
			return destinoBuscado = new Destino(ciudad, direccion);
		}
		
		return destinoBuscado;
	}
}
