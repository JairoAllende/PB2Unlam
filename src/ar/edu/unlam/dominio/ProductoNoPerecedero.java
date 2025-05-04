package ar.edu.unlam.dominio;

public class ProductoNoPerecedero extends Producto{

	private Double VALOR_AGREGADO = 1.07;
	
	public ProductoNoPerecedero(String nombre, Integer cantidad, Double precioUnitario) {
		super(nombre, cantidad, precioUnitario);
	}
	
	@Override
	public Double obtenerPrecio() {
		return this.precioUnitario * VALOR_AGREGADO;
	}
}
