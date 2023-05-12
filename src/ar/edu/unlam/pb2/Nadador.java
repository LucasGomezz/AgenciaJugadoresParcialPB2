package ar.edu.unlam.pb2;

public class Nadador extends Jugador {
	private Double mejorTiempo1000mts;
	private Integer medallasGanadas;
	private Estilo estiloDestacado;

	public Nadador(String nombre, Integer dni, Double precio, Integer edad, Nacionalidad nacionalidad,
			Double altura, Club club, Double mejorTiempo1000mts, Integer medallasGanadas, Estilo estiloDestacado) {
		super(nombre, dni, precio, edad, nacionalidad, altura, club);
		this.mejorTiempo1000mts = mejorTiempo1000mts;
		this.medallasGanadas = medallasGanadas;
		this.estiloDestacado = estiloDestacado;
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
