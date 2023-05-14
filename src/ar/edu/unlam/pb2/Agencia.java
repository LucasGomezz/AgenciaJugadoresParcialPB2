package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Agencia {
	private String nombre;
	private HashSet<Club> clubes = new HashSet<>();
	private ArrayList<Traspaso> traspasos = new ArrayList<>();

	public Agencia(String nombre) {
		this.nombre = nombre;
		this.clubes = new HashSet<>();
		this.traspasos = new ArrayList<>();
	}

	public void agregarClub(Club club) {
		clubes.add(club);
	}

	public String historialDeTraspasos() {
		String historial = "";
		Integer traspasoN = 1;
		for (Traspaso traspaso : traspasos) {
			historial += "Traspaso N° " + traspasoN + " " + traspaso.toString()+"\n";
			traspasoN++;
		}
		return historial;
	}

	public Boolean paseBasquetbolista(Club origen, Club destino, Basquetbolista basquetbolista) {

		if (basquetbolista.getPrecio() > 1500.0 && basquetbolista.getPuntos() > 100) {
			Double seguro = basquetbolista.getPrecio() * 0.1;
			origen.sacarBasquetbolista(basquetbolista);
			destino.agregarBasquetbolista(basquetbolista);
			basquetbolista.setClub(destino);
			Double precioTotal = basquetbolista.getPrecio() + seguro;
			Traspaso traspaso = new Pase(origen.getNombre(), destino.getNombre(), basquetbolista.getNombre(),
					Disciplina.BASQUET, precioTotal);
			traspasos.add(traspaso);
			return true;
		} else {
			return false;
		}
	}

	public Boolean paseTenista(Club origen, Club destino, Tenista tenista) {

		if (tenista.getRankinMundialActual() < 100) {
			Double viatico = 100.0;
			origen.sacarTenista(tenista);
			destino.agregarTenista(tenista);
			tenista.setClub(destino);
			Double precioTotal = tenista.getPrecio() + viatico;
			Traspaso traspaso = new Pase(origen.getNombre(), destino.getNombre(), tenista.getNombre(), Disciplina.TENIS,
					precioTotal);
			traspasos.add(traspaso);
			return true;
		} else {
			return false;
		}
	}

	public Boolean paseFutbolista(Club origen, Club destino, Futbolista futbolista) {

		if (futbolista.getEdad() > 28) {
			return false;
		} else {
			Double seguro = futbolista.getPrecio() * 0.1;
			origen.sacarFutbolista(futbolista);
			destino.agregarFutbolista(futbolista);
			futbolista.setClub(destino);
			Double precioTotal = futbolista.getPrecio() + seguro;
			Traspaso traspaso = new Pase(origen.getNombre(), destino.getNombre(), futbolista.getNombre(),
					Disciplina.FUTBOL, precioTotal);
			traspasos.add(traspaso);
			return true;
		}
	}

	public Boolean paseNadador(Club origen, Club destino, Nadador nadador) {
		if (nadador.getMedallasGanadas() >= 5) {
			Double bono = (double) (nadador.getMedallasGanadas() * 200);
			origen.sacarNadador(nadador);
			destino.agregarNadador(nadador);
			nadador.setClub(destino);
			Double precioTotal = nadador.getPrecio() + bono;
			Traspaso traspaso = new Pase(origen.getNombre(), destino.getNombre(), nadador.getNombre(),
					Disciplina.NATACION, precioTotal);
			traspasos.add(traspaso);
			return true;
		}
		return false;

	}

	public void cambiarBasquetbolistaPorOtro(Club origen, Basquetbolista basquetbolistaOrigen, Club destino,
			Basquetbolista basquetbolistaDestino) {
		origen.sacarBasquetbolista(basquetbolistaOrigen);
		destino.sacarBasquetbolista(basquetbolistaDestino);
		origen.agregarBasquetbolista(basquetbolistaDestino);
		destino.agregarBasquetbolista(basquetbolistaDestino);
		basquetbolistaDestino.setClub(origen);
		basquetbolistaOrigen.setClub(destino);
		Traspaso traspaso = new Intercambio(origen.getNombre(), destino.getNombre(), basquetbolistaOrigen.getNombre(),
				Disciplina.BASQUET, basquetbolistaDestino.getNombre());
		traspasos.add(traspaso);
	}

	public void cambiarFutbolistaPorOtro(Club origen, Futbolista futbolistaOrigen, Club destino,
			Futbolista futbolistaDestino) {
		origen.sacarFutbolista(futbolistaOrigen);
		destino.sacarFutbolista(futbolistaDestino);
		origen.agregarFutbolista(futbolistaDestino);
		destino.agregarFutbolista(futbolistaOrigen);
		futbolistaOrigen.setClub(destino);
		futbolistaDestino.setClub(origen);
		Traspaso traspaso = new Intercambio(origen.getNombre(), destino.getNombre(), futbolistaOrigen.getNombre(),
				Disciplina.FUTBOL, futbolistaDestino.getNombre());
		traspasos.add(traspaso);
	}

	public void cambiarTenistaPorOtro(Club origen, Tenista tenistaOrigen, Club destino, Tenista tenistaDestino) {
		origen.sacarTenista(tenistaOrigen);
		destino.sacarTenista(tenistaDestino);
		origen.agregarTenista(tenistaDestino);
		destino.agregarTenista(tenistaOrigen);
		tenistaOrigen.setClub(destino);
		tenistaDestino.setClub(origen);
		Traspaso traspaso = new Intercambio(origen.getNombre(), destino.getNombre(), tenistaOrigen.getNombre(),
				Disciplina.TENIS, tenistaDestino.getNombre());
		traspasos.add(traspaso);
	}

	public void cambiarNadadorPorOtro(Club origen, Nadador nadadorOrigen, Club destino, Nadador nadadorDestino) {
		origen.sacarNadador(nadadorOrigen);
		destino.sacarNadador(nadadorDestino);
		origen.agregarNadador(nadadorDestino);
		destino.agregarNadador(nadadorOrigen);
		nadadorOrigen.setClub(destino);
		nadadorDestino.setClub(origen);
		Traspaso traspaso = new Intercambio(origen.getNombre(), destino.getNombre(), nadadorOrigen.getNombre(),
				Disciplina.NATACION, nadadorDestino.getNombre());
		traspasos.add(traspaso);
	}

	public String queClubValeMas() {

		Double precioTotalMayor = 0.0;
		Club clubValeMas = null;
		for (Club club : clubes) {
			Double precioTotal = 0.0;
			HashSet<Basquetbolista> basquetbolistas = club.getBasquetbolistas();
			Iterator<Basquetbolista> iterador = basquetbolistas.iterator();
			while (iterador.hasNext()) {
				Basquetbolista basquetbolista = iterador.next();
				precioTotal += basquetbolista.getPrecio();
			}
			HashSet<Futbolista> futbolistas = club.getFutbolistas();
			Iterator<Futbolista> iterador2 = futbolistas.iterator();
			while (iterador2.hasNext()) {
				Futbolista futbolista = iterador2.next();
				precioTotal += futbolista.getPrecio();
			}
			HashSet<Tenista> tenistas = club.getTenistas();
			Iterator<Tenista> iterador3 = tenistas.iterator();
			while (iterador3.hasNext()) {
				Tenista tenista = iterador3.next();
				precioTotal += tenista.getPrecio();
			}
			HashSet<Nadador> nadadores = club.getNadadores();
			Iterator<Nadador> iterador4 = nadadores.iterator();
			while (iterador4.hasNext()) {
				Nadador nadador = iterador4.next();
				precioTotal += nadador.getPrecio();
			}
			if (precioTotal > precioTotalMayor) {
				precioTotalMayor = precioTotal;
				clubValeMas = club;
			}
		}
		return "NOMBRE:" + clubValeMas.getNombre() + "\n" + "PRECIO:" + precioTotalMayor;

	}

	public Double cuantoValeUnClub(Club club) {
		Double precioClub = 0.0;
		HashSet<Basquetbolista> basquetbolistas = club.getBasquetbolistas();
		Iterator<Basquetbolista> iterador = basquetbolistas.iterator();
		while (iterador.hasNext()) {
			Basquetbolista basquetbolista = iterador.next();
			precioClub += basquetbolista.getPrecio();
		}
		HashSet<Futbolista> futbolistas = club.getFutbolistas();
		Iterator<Futbolista> iterador2 = futbolistas.iterator();
		while (iterador2.hasNext()) {
			Futbolista futbolista = iterador2.next();
			precioClub += futbolista.getPrecio();
		}
		HashSet<Tenista> tenistas = club.getTenistas();
		Iterator<Tenista> iterador3 = tenistas.iterator();
		while (iterador3.hasNext()) {
			Tenista tenista = iterador3.next();
			precioClub += tenista.getPrecio();
		}
		HashSet<Nadador> nadadores = club.getNadadores();
		Iterator<Nadador> iterador4 = nadadores.iterator();
		while (iterador4.hasNext()) {
			Nadador nadador = iterador4.next();
			precioClub += nadador.getPrecio();
		}
		return precioClub;
	}

	public String queClubtieneElNadadorMasRapidoEn1000mts() {
		Nadador nadadorMasRapido = null;
		for (Club club : clubes) {
			HashSet<Nadador> nadadores = club.getNadadores();
			for (Nadador nadador : nadadores) {
				if (nadadorMasRapido == null
						|| nadador.getMejorTiempo1000mts() > nadadorMasRapido.getMejorTiempo1000mts()) {
					nadadorMasRapido = nadador;
				}
			}
		}
		return nadadorMasRapido.getClub().getNombre();
	}

	public String queClubtieneElBasquetbolistaConMasTriples() {
		Basquetbolista basquetbolistaConMasTriples = null;
		for (Club club : clubes) {
			HashSet<Basquetbolista> basquetbolistas = club.getBasquetbolistas();
			for (Basquetbolista basquetbolista : basquetbolistas) {
				if (basquetbolistaConMasTriples == null
						|| basquetbolista.getTriples() > basquetbolistaConMasTriples.getTriples()) {
					basquetbolistaConMasTriples = basquetbolista;
				}
			}
		}
		return basquetbolistaConMasTriples.getClub().getNombre();
	}

	public void asignarClubAJugador(Club club, Jugador jugador) {
		jugador.setClub(club);
		if (jugador instanceof Basquetbolista) {
			club.agregarBasquetbolista((Basquetbolista) jugador);
		} else if (jugador instanceof Tenista) {
			club.agregarTenista((Tenista) jugador);
		} else if (jugador instanceof Nadador) {
			club.agregarNadador((Nadador) jugador);
		} else if (jugador instanceof Futbolista) {
			club.agregarFutbolista((Futbolista) jugador);
		}

	}

	public HashSet<Club> getClubes() {
		return clubes;
	}

	public void setClubes(HashSet<Club> clubes) {
		this.clubes = clubes;
	}

	public ArrayList<Traspaso> getTraspasos() {
		return traspasos;
	}

	public void setTraspasos(ArrayList<Traspaso> traspasos) {
		this.traspasos = traspasos;
	}
}
