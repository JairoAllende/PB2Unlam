package ar.edu.unlam.dominio;

public class MercadoPago extends MetodoDePago{
	
	@Override
	public Double procesarPago(Double monto) {
		return monto * 1.12;
	}

}
