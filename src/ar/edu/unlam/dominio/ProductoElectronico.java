package ar.edu.unlam.dominio;

public class ProductoElectronico extends Producto{
	
	public ProductoElectronico(String nombre, Double precio, String descripcion) {
		super(nombre, precio, descripcion);
	}
	
	@Override
	public Double calcularPrecioFinal() {
		return this.precio * 1.15;
	}
	
	
}
