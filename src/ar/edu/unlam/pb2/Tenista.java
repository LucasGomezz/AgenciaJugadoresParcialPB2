package ar.edu.unlam.pb2;

public class Tenista extends Jugador {
	private Integer rankinMundialActual;
	private Integer mejorRankingMundial;

	public Tenista(String nombre, Integer dni, Double precio, Integer edad, Nacionalidad nacionalidad,
			Double altura, Club club, Integer rankinMundialActual, Integer mejorRankingMundial) {
		super(nombre, dni, precio, edad, nacionalidad, altura, club);
		this.rankinMundialActual = rankinMundialActual;
		this.mejorRankingMundial = mejorRankingMundial;
	}

	public Integer getRankinMundialActual() {
		return rankinMundialActual;
	}

	public void setRankinMundialActual(Integer rankinMundialActual) {
		this.rankinMundialActual = rankinMundialActual;
	}

	public Integer getMejorRankingMundial() {
		return mejorRankingMundial;
	}

	public void setMejorRankingMundial(Integer mejorRankingMundial) {
		this.mejorRankingMundial = mejorRankingMundial;
	}

}
