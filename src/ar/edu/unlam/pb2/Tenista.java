package ar.edu.unlam.pb2;

public class Tenista extends Jugador {
	private Double peso;
	private Integer rankinMundialActual;
	private Integer mejorRankingMundial;

	public Tenista(String nombre, Integer dni, Double precio, Integer anioNacimiento, Nacionalidad nacionalidad,
			Double altura, Double peso, Integer rankinMundialActual, Integer mejorRankingMundial) {
		super(nombre, dni, precio, anioNacimiento, nacionalidad, altura);
		this.peso = peso;
		this.rankinMundialActual = rankinMundialActual;
		this.mejorRankingMundial = mejorRankingMundial;
	}

	@Override
	public void paseJugador(Club origen, Jugador jugador, Club destino) {
		// TODO Auto-generated method stub

	}

	@Override
	public void comprarJugador(Jugador jugador, Club comprador) {
		// TODO Auto-generated method stub

	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
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