package ar.edu.unlam.pb2;

abstract public class Jugador {
	private String nombre;
	private Integer dni;
	private Double precio;
	private Integer anioNacimiento;
	private Enum nacionalidad;
	private Double altura;

	public Jugador(String nombre, Integer dni, Double precio, Integer anioNacimiento, Enum nacionalidad,
			Double altura) {
		this.nombre = nombre;
		this.dni = dni;
		this.precio = precio;
		this.anioNacimiento = anioNacimiento;
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

	public Integer getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(Integer anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public Enum getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Enum nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
