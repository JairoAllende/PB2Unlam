package ar.edu.unlam.dominio;

public class ProductoRopa extends Producto{

	public ProductoRopa(String nombre, Double precio, String descripcion) {
		super(nombre, precio, descripcion);
	}
	
	@Override
	public Double calcularPrecioFinal() {
		return this.precio * 1.05;
	}
}
