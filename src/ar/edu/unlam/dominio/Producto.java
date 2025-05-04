package ar.edu.unlam.dominio;

public class Producto {
	
	protected String nombre;
	protected Integer cantidad;
	protected Double precioUnitario;
	
	public Producto(String nombre, Integer cantidad, Double precioUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	
	public Double obtenerPrecio() {
		return null;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecioUnitario() {
		return this.precioUnitario;
	}
	
	public Integer getCantidad() {
		return this.cantidad;
	}
}
