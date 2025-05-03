package ar.edu.unlam.dominio;

public abstract class Producto {
	
	protected String nombre;
	protected Double precio;
	protected String descripcion;
	
	public Producto(String nombre, Double precio, String descripcion) {
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	public abstract Double calcularPrecioFinal();

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}	
	
}
