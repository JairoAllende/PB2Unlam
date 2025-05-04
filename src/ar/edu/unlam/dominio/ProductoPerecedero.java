package ar.edu.unlam.dominio;

public class ProductoPerecedero extends Producto{
	
	private Double VALOR_AGREGADO = 1.05;
	
	public ProductoPerecedero(String nombre, Integer cantidad, Double precioUnitario) {
		super(nombre, cantidad, precioUnitario);
	}
	
	@Override
	public Double obtenerPrecio() {
		return this.precioUnitario * VALOR_AGREGADO;
	}
	
	
}
