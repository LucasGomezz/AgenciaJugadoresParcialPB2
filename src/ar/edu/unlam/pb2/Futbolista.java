package ar.edu.unlam.pb2;

public class Futbolista extends Jugador {
	private Double peso;
	private PosicionFutbol posicionFutbol;
	private Club club;
	private Integer goles;
	private Integer asistencias;

	public Futbolista(String nombre, Integer dni, Double precio, Integer anioNacimiento, Nacionalidad nacionalidad,
			Double altura, Club club, Double peso, PosicionFutbol posicionFutbol, Club club2, Integer goles,
			Integer asistencias) {
		super(nombre, dni, precio, anioNacimiento, nacionalidad, altura, club);
		this.peso = peso;
		this.posicionFutbol = posicionFutbol;
		club = club2;
		this.goles = goles;
		this.asistencias = asistencias;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public PosicionFutbol getPosicionFutbol() {
		return posicionFutbol;
	}

	public void setPosicionFutbol(PosicionFutbol posicionFutbol) {
		this.posicionFutbol = posicionFutbol;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public Integer getGoles() {
		return goles;
	}

	public void setGoles(Integer goles) {
		this.goles = goles;
	}

	public Integer getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
	}

}
