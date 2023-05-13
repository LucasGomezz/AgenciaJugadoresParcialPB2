package ar.edu.unlam.pb2;

public class Futbolista extends Jugador {
	private PosicionFutbol posicionFutbol;
	private Integer goles;
	private Integer asistencias;

	public Futbolista(String nombre, Integer dni, Double precio, Integer edad, Nacionalidad nacionalidad,
			Double altura, PosicionFutbol posicionFutbol, Integer goles, Integer asistencias) {
		super(nombre, dni, precio, edad, nacionalidad, altura);
		this.posicionFutbol = posicionFutbol;
		this.goles = goles;
		this.asistencias = asistencias;
	}

	public PosicionFutbol getPosicionFutbol() {
		return posicionFutbol;
	}

	public void setPosicionFutbol(PosicionFutbol posicionFutbol) {
		this.posicionFutbol = posicionFutbol;
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
