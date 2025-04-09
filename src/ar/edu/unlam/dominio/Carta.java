package ar.edu.unlam.dominio;

public class Carta {
	
	private Integer salud;
	
	public Carta() {
		this.salud = 100;
	}

	public int getSalud() {
		return this.salud;
	}

	public void recibirDanio(int cantidadDeDanio) {
		this.salud -= cantidadDeDanio;
	}

}
