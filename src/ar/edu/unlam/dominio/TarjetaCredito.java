package ar.edu.unlam.dominio;

public class TarjetaCredito extends MetodoDePago{
	
	private Double creditoDisponible;
	
	public TarjetaCredito() {
		super();
		this.creditoDisponible = 3000d;
	}
	
	@Override
	public Double procesarPago(Double monto) {
		Double montoProcesado = null;
		
		if (this.creditoDisponible >= monto) {
			montoProcesado = monto * 1.227;
			return montoProcesado;
		}
		
		return montoProcesado;
	}
	
}
