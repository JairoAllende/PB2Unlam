package ar.edu.unlam.dominio;

public class Rectangulo extends Figura{

	Integer longitudBase;
	Integer longitudAltura;
	
	public Rectangulo(Integer longitudBase, Integer longitudAltura) {
		super();
		this.longitudBase = longitudBase;
		this.longitudAltura = longitudAltura;
	}
	
	
	@Override
	public Integer calcularPerimetroRectangulo() {
		return (this.longitudBase + this.longitudAltura) *2;
	}
	
	
}
