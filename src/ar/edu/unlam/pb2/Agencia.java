package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Agencia {
	private HashSet<Club> clubes = new HashSet<>();
	private ArrayList<Traspaso> traspasos = new ArrayList<>();

	public void agregarClub(Club club) {
		clubes.add(club);
	}

	public Boolean paseBasquetbolista(Club origen, Club destino, Basquetbolista basquetbolista) {

		if (basquetbolista.getPrecio() < 1500) {
			Double seguro = basquetbolista.getPrecio() * 0.1;
			origen.sacarBasquetbolista(basquetbolista);
			destino.agregarBasquetbolista(basquetbolista);
			basquetbolista.setClub(destino);
			Double precioTotal = basquetbolista.getPrecio() + seguro;
			Traspaso traspaso = new Traspaso(origen.getNombre(), destino.getNombre(), basquetbolista.getNombre(),
					precioTotal, Disciplina.BASQUET);
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
			Traspaso traspaso = new Traspaso(origen.getNombre(), destino.getNombre(), tenista.getNombre(), precioTotal,
					Disciplina.TENIS);
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
			Traspaso traspaso = new Traspaso(origen.getNombre(), destino.getNombre(), futbolista.getNombre(),
					precioTotal, Disciplina.FUTBOL);
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
			Traspaso traspaso = new Traspaso(origen.getNombre(), destino.getNombre(), nadador.getNombre(), precioTotal,
					Disciplina.NATACION);
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
	}

	public void cambiarFutbolistaPorOtro(Club origen, Futbolista futbolistaOrigen, Club destino,
			Futbolista futbolistaDestino) {
		origen.sacarFutbolista(futbolistaOrigen);
		destino.sacarFutbolista(futbolistaDestino);
		origen.agregarFutbolista(futbolistaDestino);
		destino.agregarFutbolista(futbolistaOrigen);
		futbolistaOrigen.setClub(destino);
		futbolistaDestino.setClub(origen);
	}

	public void cambiarTenistaPorOtro(Club origen, Tenista tenistaOrigen, Club destino, Tenista tenistaDestino) {
		origen.sacarTenista(tenistaOrigen);
		destino.sacarTenista(tenistaDestino);
		origen.agregarTenista(tenistaDestino);
		destino.agregarTenista(tenistaOrigen);
		tenistaOrigen.setClub(destino);
		tenistaDestino.setClub(origen);
	}

	public void cambiarNadadorPorOtro(Club origen, Nadador nadadorOrigen, Club destino, Nadador nadadorDestino) {
		origen.sacarNadador(nadadorOrigen);
		destino.sacarNadador(nadadorDestino);
		origen.agregarNadador(nadadorDestino);
		destino.agregarNadador(nadadorOrigen);
		nadadorOrigen.setClub(destino);
		nadadorDestino.setClub(origen);
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
		return "NOMBRE:" + clubValeMas.getNombre() + "/n" + "PRECIO:" + precioTotalMayor;

	}

	public HashSet<Club> getClubes() {
		return clubes;
	}

	public void setClubes(HashSet<Club> clubes) {
		this.clubes = clubes;
	}
}
