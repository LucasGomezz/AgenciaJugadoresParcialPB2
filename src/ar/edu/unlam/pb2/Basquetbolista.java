package ar.edu.unlam.pb2;

public class Basquetbolista extends Jugador {

	private Club club;
	private Enum posicion;
	private Integer triples;
	private Integer puntos;
	


	public Basquetbolista(String nombre, Integer dni, Double precio, Integer anioNacimiento, Enum nacionalidad,
			Double altura, Club club, Enum posicion, Integer triples, Integer puntos) {
		super(nombre, dni, precio, anioNacimiento, nacionalidad, altura);
		this.club = club;
		this.posicion = posicion;
		this.triples = triples;
		this.puntos = puntos;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public Enum getPosicion() {
		return posicion;
	}

	public void setPosicion(Enum posicion) {
		this.posicion = posicion;
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
