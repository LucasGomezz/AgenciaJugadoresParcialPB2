package ar.edu.unlam.pb2;

public class Traspaso {
	private String clubOrigen;
	private String clubDestino;
	private String nombreJugador;
	private Double precio;

	public Traspaso(String clubOrigen, String clubDestino, String nombreJugador, Double precio) {
		this.clubOrigen = clubOrigen;
		this.clubDestino = clubDestino;
		this.nombreJugador = nombreJugador;
		this.precio = precio;
	}

	public String getClubOrigen() {
		return clubOrigen;
	}

	public void setClubOrigen(String clubOrigen) {
		this.clubOrigen = clubOrigen;
	}

	public String getClubDestino() {
		return clubDestino;
	}

	public void setClubDestino(String clubDestino) {
		this.clubDestino = clubDestino;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
