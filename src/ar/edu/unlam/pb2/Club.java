package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Club {
	private String nombre;
	private String localidad;
	private HashSet<Basquetbolista> basquetbolistas;
	private HashSet<Futbolista> futbolistas;
	private HashSet<Tenista> tenistas;
	private HashSet<Nadador> nadadores;

	public Club(String nombre, String localidad) {
		this.nombre = nombre;
		this.localidad = localidad;
		this.basquetbolistas = new HashSet<>();
		this.futbolistas = new HashSet<>();
		this.tenistas = new HashSet<>();
		this.nadadores = new HashSet<>();
	}

	public Double edadPromedioDeLosJugadoresDelClub() {
		Integer edadTotal = 0;
		Iterator<Basquetbolista> iterador = basquetbolistas.iterator();
		while (iterador.hasNext()) {
			Basquetbolista basquetbolista = iterador.next();
			edadTotal += basquetbolista.getEdad();
		}
		Iterator<Futbolista> iterador2 = futbolistas.iterator();
		while (iterador2.hasNext()) {
			Futbolista futbolista = iterador2.next();
			edadTotal += futbolista.getEdad();
		}
		Iterator<Tenista> iterador3 = tenistas.iterator();
		while (iterador3.hasNext()) {
			Tenista tenista = iterador3.next();
			edadTotal += tenista.getEdad();
		}
		Integer cantidad = basquetbolistas.size() + futbolistas.size() + tenistas.size() + nadadores.size();
		Double edadPromedio = (double) (edadTotal) / (double) (cantidad);
		return edadPromedio;
	}

	public void agregarTenista(Tenista tenista) {
		tenistas.add(tenista);

	}

	public void agregarBasquetbolista(Basquetbolista basquetbolista) {
		basquetbolistas.add(basquetbolista);
	}

	public void agregarFutbolista(Futbolista futbolista) {
		futbolistas.add(futbolista);
	}

	public void agregarNadador(Nadador nadador) {
		nadadores.add(nadador);
	}

	public String futbolistaConMejoresEstadisticas() {
		Futbolista mejorFutbolista = null;
		Integer mejorEstadistica = 0;
		for (Futbolista futbolista : futbolistas) {
			Integer sumaEstadisticas = 0;
			sumaEstadisticas = futbolista.getAsistencias() + futbolista.getGoles();
			if (sumaEstadisticas > mejorEstadistica) {
				mejorEstadistica = sumaEstadisticas;
				mejorFutbolista = futbolista;
			}

		}
		return mejorFutbolista.getNombre() + " con la suma de " + mejorEstadistica + " goles y asistencias.";
	}

	public String tenistaConMejorTopMundialActual() {
		Tenista mejorConRanking = null;
		for (Tenista tenista : tenistas) {

			if (mejorConRanking == null
					|| tenista.getRankinMundialActual() < mejorConRanking.getRankinMundialActual()) {
				mejorConRanking = tenista;
			}
		}
		return mejorConRanking.getNombre() + " se encuentra en el top " + mejorConRanking.getRankinMundialActual();
	}

	public Jugador jugadorMasCaroDelClub() {
		Basquetbolista basMasCaro = null;
		Tenista tenMasCaro = null;
		Nadador nadMasCaro = null;
		Futbolista futMasCaro = null;

		for (Basquetbolista basquetbolista : basquetbolistas) {
			if (basMasCaro == null || basquetbolista.getPrecio() > basMasCaro.getPrecio()) {
				basMasCaro = basquetbolista;
			}
		}
		for (Tenista tenista : tenistas) {
			if (tenMasCaro == null || tenista.getPrecio() > tenMasCaro.getPrecio()) {
				tenMasCaro = tenista;
			}
		}
		for (Nadador nadador : nadadores) {
			if (nadMasCaro == null || nadador.getPrecio() > nadMasCaro.getPrecio()) {
				nadMasCaro = nadador;
			}
		}
		for (Futbolista futbolista : futbolistas) {
			if (futMasCaro == null || futbolista.getPrecio() > futMasCaro.getPrecio()) {
				futMasCaro = futbolista;
			}
		}
		if (basMasCaro.getPrecio() > tenMasCaro.getPrecio() && basMasCaro.getPrecio() > nadMasCaro.getPrecio()
				&& basMasCaro.getPrecio() > futMasCaro.getPrecio()) {
			return basMasCaro;
		} else if (tenMasCaro.getPrecio() > nadMasCaro.getPrecio() && tenMasCaro.getPrecio() > futMasCaro.getPrecio()) {
			return tenMasCaro;
		} else if (nadMasCaro.getPrecio() > futMasCaro.getPrecio()) {
			return nadMasCaro;
		} else {
			return futMasCaro;
		}

	}

	public PosicionBasquet posicionConMasTriples() {
		Integer triplesBase = 0;
		Integer triplesAlero = 0;
		Integer triplesAlapivot = 0;
		Integer triplesEscolta = 0;
		Integer triplesPivot = 0;
		for (Basquetbolista basquetbolista : basquetbolistas) {
			switch (basquetbolista.getPosicion()) {
			case BASE:
				triplesBase += basquetbolista.getTriples();
				break;
			case ALERO:
				triplesAlero += basquetbolista.getTriples();
				break;
			case ALAPIVOT:
				triplesAlapivot += basquetbolista.getTriples();
				break;
			case ESCOLTA:
				triplesEscolta += basquetbolista.getTriples();
				break;
			case PIVOT:
				triplesPivot += basquetbolista.getTriples();
				break;
			default:
				break;
			}
		}
		if (triplesBase > triplesAlero && triplesBase > triplesAlapivot && triplesBase > triplesEscolta
				&& triplesBase > triplesPivot) {
			return PosicionBasquet.BASE;
		} else if (triplesAlero > triplesAlapivot && triplesAlero > triplesEscolta && triplesAlero > triplesPivot) {
			return PosicionBasquet.ALERO;
		} else if (triplesAlapivot > triplesEscolta && triplesAlapivot > triplesPivot) {
			return PosicionBasquet.ALAPIVOT;
		} else if (triplesEscolta > triplesPivot) {
			return PosicionBasquet.ESCOLTA;
		} else {
			return PosicionBasquet.PIVOT;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public HashSet<Basquetbolista> getBasquetbolistas() {
		return basquetbolistas;
	}

	public void setBasquetbolistas(HashSet<Basquetbolista> basquetbolistas) {
		this.basquetbolistas = basquetbolistas;
	}

	public HashSet<Futbolista> getFutbolistas() {
		return futbolistas;
	}

	public void setFutbolistas(HashSet<Futbolista> futbolistas) {
		this.futbolistas = futbolistas;
	}

	public HashSet<Tenista> getTenistas() {
		return tenistas;
	}

	public void setTenistas(HashSet<Tenista> tenistas) {
		this.tenistas = tenistas;
	}

	public HashSet<Nadador> getNadadores() {
		return nadadores;
	}

	public void setNadadores(HashSet<Nadador> nadadores) {
		this.nadadores = nadadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void sacarBasquetbolista(Basquetbolista basquetbolista) {
		basquetbolistas.remove(basquetbolista);

	}

	public void sacarTenista(Tenista tenista) {
		tenistas.remove(tenista);

	}

	public void sacarNadador(Nadador nadador) {
		nadadores.remove(nadador);

	}

	public void sacarFutbolista(Futbolista futbolista) {
		futbolistas.remove(futbolista);

	}

}
