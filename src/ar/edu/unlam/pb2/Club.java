package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;

public class Club {
	private String nombre;
	private String localidad;
	private HashSet<Basquetbolista> basquetbolistas = new HashSet<>();
	private HashSet<Futbolista> futbolistas = new HashSet<>();
	private HashSet<Tenista> tenistas = new HashSet<>();
	private HashSet<Nadador> nadadores = new HashSet<>();

	public Club(String nombre, String localidad, HashSet<Basquetbolista> basquetbolistas,
			HashSet<Futbolista> futbolistas, HashSet<Tenista> tenistas, HashSet<Nadador> nadadores) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.basquetbolistas = basquetbolistas;
		this.futbolistas = futbolistas;
		this.tenistas = tenistas;
		this.nadadores = nadadores;
	}

	public void agregarTenista(Tenista tenista) {
		tenistas.add(tenista);
	}

	public void agregarTenista(Basquetbolista basquetbolista) {
		basquetbolistas.add(basquetbolista);
	}

	public void agregarTenista(Futbolista futbolista) {
		futbolistas.add(futbolista);
	}

	public void agregarNadador(Nadador nadador) {
		nadadores.add(nadador);
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

}
