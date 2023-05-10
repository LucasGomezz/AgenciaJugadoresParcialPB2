package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Club {
	private String nombre;
	private String localidad;
	private HashSet<Jugador> jugadores = new HashSet<>();

	public Club(String nombre, String localidad, HashSet<Jugador> jugadores) {
		this.nombre = nombre;
		this.localidad = localidad;
		this.jugadores = jugadores;
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
	public HashSet<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(HashSet<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
}
