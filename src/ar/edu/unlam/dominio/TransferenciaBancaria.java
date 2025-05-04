package ar.edu.unlam.dominio;

public class TransferenciaBancaria extends MetodoDePago{
	
	private final Double MONTO_COMISION = 100000d;
	
	@Override
	public Double procesarPago(Double monto) {
		
		if(this.MONTO_COMISION < monto) {
			return monto * 1.01;
		}
		
		return monto;
	}
}
