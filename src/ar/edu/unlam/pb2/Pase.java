package ar.edu.unlam.pb2;

public class Pase extends Traspaso {

	private Double precio;

	public Pase(String clubOrigen, String clubDestino, String nombreJugador, Disciplina disciplinas, Double precio) {
		super(clubOrigen, clubDestino, nombreJugador, disciplinas);
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pase del jugador: " + getNombreJugador() + " con un precio de $" + precio + " , desde el club: "
				+ getClubOrigen() + ", hacia el club: " + getClubDestino() + ", en la disciplina: " + getDisciplinas();
	}

}
