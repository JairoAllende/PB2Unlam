package ar.edu.unlam.dominio;

public class ProductoAlimenticio extends Producto{
	
	private final Double VALOR_FIJO_AGREGADO = 1000d;
	
	public ProductoAlimenticio(String nombre, Double precio, String descripcion) {
		super(nombre, precio, descripcion);
	}

	@Override
	public Double calcularPrecioFinal() {
		return (this.precio + VALOR_FIJO_AGREGADO) * 1.075;
	}
	
	
}
