package ar.edu.unlam.pb2;

public class Basquetbolista extends Jugador {

	private PosicionBasquet posicionBasquet;
	private Integer triples;
	private Integer puntos;

	public Basquetbolista(String nombre, Integer dni, Double precio, Integer edad, Nacionalidad nacionalidad,
			Double altura, Club club, PosicionBasquet posicionBasquet, Integer triples, Integer puntos) {
		super(nombre, dni, precio, edad, nacionalidad, altura, club);
		this.posicionBasquet = posicionBasquet;
		this.triples = triples;
		this.puntos = puntos;
	}

	public PosicionBasquet getPosicion() {
		return posicionBasquet;
	}

	public void setPosicion(PosicionBasquet posicion) {
		this.posicionBasquet = posicion;
	}

	public Integer getTriples() {
		return triples;
	}

	public void setTriples(Integer triples) {
		this.triples = triples;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

}
