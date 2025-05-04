package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Tienda {
	
	private ArrayList<Producto> productos = new ArrayList<>();
	
	public Tienda() {
		this.productos.add(new ProductoPerecedero("Manzana", 100, 2000d));
		this.productos.add(new ProductoPerecedero("Banana", 100, 2500d));
		this.productos.add(new ProductoNoPerecedero("Arroz", 100, 1500d));
		this.productos.add(new ProductoNoPerecedero("Fideos", 100, 1000d));
	}
	
	public Double obtenerTotalProductosNoPerecederos() {
		Double precioTotal = 0d;
		
		for (Producto producto : productos) {
			if(producto instanceof ProductoNoPerecedero) {
				precioTotal += producto.obtenerPrecio() * producto.getCantidad();
			}
		}
		
		return precioTotal;
	}
	
	public Double obtenerTotalProductosPerecederos() {
		Double precioTotal = 0d;
		
		for (Producto producto : productos) {
			if(producto instanceof ProductoPerecedero) {
				precioTotal += producto.obtenerPrecio() * producto.getCantidad();
			}
		}
		
		return precioTotal;
	}

	public Double obtenerTotalProductos() {
		return obtenerTotalProductosPerecederos() + obtenerTotalProductosNoPerecederos();
	}

	
	
	
}
