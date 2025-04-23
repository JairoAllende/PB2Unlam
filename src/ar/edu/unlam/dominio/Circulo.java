package ar.edu.unlam.dominio;

public class Circulo extends Figura{
	
	private Integer radio;
	private final Double pi = 3.1416;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}
	
	@Override
	public Double calcularPerimetroCirculo() {
		return 2 * (pi) * (this.radio);
	}
	
	
	

}
