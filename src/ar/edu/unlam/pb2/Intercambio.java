package ar.edu.unlam.pb2;

public class Intercambio extends Traspaso {

	private String nombreJugador2;

	public Intercambio(String clubOrigen, String clubDestino, String nombreJugador, Disciplina disciplinas,
			String nombreJugador2) {
		super(clubOrigen, clubDestino, nombreJugador, disciplinas);
		this.nombreJugador2 = nombreJugador2;
	}

	@Override
	public String toString() {
		return "Intercambio de un jugador llamado " + nombreJugador2 + ", del club: " + getClubDestino() + " con el jugador" + getNombreJugador() + " del club : " + getClubOrigen()			
				+ " de la disciplina: " + getDisciplinas();
	}

	

	

	
}
