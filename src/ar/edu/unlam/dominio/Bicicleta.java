package ar.edu.unlam.dominio;

public class Bicicleta extends MedioDeTransporte{
		
	public Bicicleta() {
		super(0.125, 15.0);
	}

	@Override
	public Boolean cargarPaquete(Paquete paquete) {
	    Boolean paqueteCargado = super.cargarPaquete(paquete);

	    if (paqueteCargado && this.destino == null) {
	        this.destino = paquetes.get(0).getDestino(); 
	    }

	    return paqueteCargado;
	}

	
	
}
