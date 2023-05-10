package ar.edu.unlam.pb2;

public class Nadador extends Jugador {
	private Double mejorTiempo100mts;
	private Double mejorTiempo1000mts;
	private Integer medallasGanadas;
	private Estilo estiloDestacado;

	public Nadador(String nombre, Integer dni, Double precio, Integer anioNacimiento, Nacionalidad nacionalidad,
			Double altura, Double mejorTiempo100mts, Double mejorTiempo1000mts, Integer medallasGanadas,
			Estilo estiloDestacado) {
		super(nombre, dni, precio, anioNacimiento, nacionalidad, altura);
		this.mejorTiempo100mts = mejorTiempo100mts;
		this.mejorTiempo1000mts = mejorTiempo1000mts;
		this.medallasGanadas = medallasGanadas;
		this.estiloDestacado = estiloDestacado;
	}

	@Override
	public void paseJugador(Club origen, Jugador jugador, Club destino) {
		// TODO Auto-generated method stub

	}

	@Override
	public void comprarJugador(Jugador jugador, Club comprador) {
		// TODO Auto-generated method stub

	}

	public Double getMejorTiempo100mts() {
		return mejorTiempo100mts;
	}

	public void setMejorTiempo100mts(Double mejorTiempo100mts) {
		this.mejorTiempo100mts = mejorTiempo100mts;
	}

	public Double getMejorTiempo1000mts() {
		return mejorTiempo1000mts;
	}

	public void setMejorTiempo1000mts(Double mejorTiempo1000mts) {
		this.mejorTiempo1000mts = mejorTiempo1000mts;
	}

	public Integer getMedallasGanadas() {
		return medallasGanadas;
	}

	public void setMedallasGanadas(Integer medallasGanadas) {
		this.medallasGanadas = medallasGanadas;
	}

	public Estilo getEstiloDestacado() {
		return estiloDestacado;
	}

	public void setEstiloDestacado(Estilo estiloDestacado) {
		this.estiloDestacado = estiloDestacado;
	}

}
