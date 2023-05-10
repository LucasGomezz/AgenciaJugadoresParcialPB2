package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public class Agencia {
	private HashSet<Club> clubes = new HashSet<>();
	private ArrayList<Traspaso> traspasos= new ArrayList<>();

	public void agregarClub(Club club) {
		clubes.add(club);
	}

	public void paseBasquetbolista(Club origen, Club destino, Basquetbolista basquetbolista) {
		Double seguro = basquetbolista.getPrecio() * 0.1;
		origen.sacarBasquetbolista(basquetbolista);
		destino.agregarBasquetbolista(basquetbolista);
		Double precioTotal = basquetbolista.getPrecio() + seguro;
		Traspaso traspaso=new Traspaso(origen.getNombre(), destino.getNombre(), basquetbolista.getNombre(), precioTotal, Disciplina.BASQUET);
	}

	public void paseTenista(Club origen, Club destino, Tenista tenista) {
		Double viatico=100.0;
		origen.sacarTenista(tenista);
		destino.agregarTenista(tenista);
		Double precioTotal = tenista.getPrecio() + viatico;
		Traspaso traspaso=new Traspaso(origen.getNombre(), destino.getNombre(), tenista.getNombre(), precioTotal, Disciplina.TENIS);
	}

	public void paseFutbolista(Club origen, Club destino, Futbolista futbolista) {
		Double seguro = futbolista.getPrecio() * 0.1;
		origen.sacarFutbolista(futbolista);
		destino.agregarFutbolista(futbolista);
		Double precioTotal = futbolista.getPrecio() + seguro;
		Traspaso traspaso=new Traspaso(origen.getNombre(), destino.getNombre(), futbolista.getNombre(), precioTotal, Disciplina.FUTBOL);
	}

	public void paseNadador(Club origen, Club destino, Nadador nadador) {
		Double bono=(double) (nadador.getMedallasGanadas()*200);
		origen.sacarNadador(nadador);
		destino.agregarNadador(nadador);
		Double precioTotal = nadador.getPrecio() + bono;
		Traspaso traspaso=new Traspaso(origen.getNombre(), destino.getNombre(), nadador.getNombre(), precioTotal, Disciplina.NATACION);

	}

	public HashSet<Club> getClubes() {
		return clubes;
	}

	public void setClubes(HashSet<Club> clubes) {
		this.clubes = clubes;
	}
}
