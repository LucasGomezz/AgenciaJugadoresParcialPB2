package ar.edu.unlam.pb2;

import java.util.Objects;

abstract public class Jugador {
	private String nombre;
	private Integer dni;
	private Double precio;
	private Integer edad;
	private Nacionalidad nacionalidad;
	private Double altura;
	private Club club = null;

	public Jugador(String nombre, Integer dni, Double precio, Integer edad, Nacionalidad nacionalidad,
			Double altura) {
		this.nombre = nombre;
		this.dni = dni;
		this.precio = precio;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(dni, other.dni);
	}

}
