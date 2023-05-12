package ar.edu.unlam.pb2;

public abstract class Traspaso {
	private String clubOrigen;
	private String clubDestino;
	private String nombreJugador;
	private Disciplina disciplinas;

	public Traspaso(String clubOrigen, String clubDestino, String nombreJugador, Disciplina disciplinas) {
		super();
		this.clubOrigen = clubOrigen;
		this.clubDestino = clubDestino;
		this.nombreJugador = nombreJugador;
		this.disciplinas = disciplinas;
	}
	
	public abstract String toString();

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

	public Disciplina getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}
	

}
