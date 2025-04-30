package ar.edu.unlam.dominio;

public interface Vehiculo {
	boolean agregarPaquete(Paquete paquete, String ciudadDeDestino);
	boolean realizarEntrega(Paquete paquete);
}
