package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaAgencia {

	@Test
	public void queSePuedaCrearClubesYJugadores() {

		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombreClub2 = "Argentino de Castelar";
		String localidad2 = "Castelar";
		Club castelar = new Club(nombreClub2, localidad2);

		String nombreJugador1 = "Pablo";
		Integer dni1 = 24000908;
		Double precio1 = 400.0;
		Integer edad1 = 24;
		Double altura1 = 1.70;
		Integer goles1 = 10;
		Integer asistencias1 = 20;
		Nacionalidad nacionalidad1 = Nacionalidad.ARGENTINA;
		PosicionFutbol posicion1 = PosicionFutbol.MEDIOCAMPISTA;
		Futbolista futbolista1 = new Futbolista(nombreJugador1, dni1, precio1, edad1, nacionalidad1, altura1, castelar, posicion1, goles1, asistencias1);

		String nombreJugador2 = "Lucas";
		Integer dni2 = 43123321;
		Double precio2 = 200.0;
		Double altura2 = 1.80;
		Integer edad2 = 22;
		Club club2 = castelar;
		Integer triples2 = 50;
		Integer puntos2 = 300;
		Nacionalidad nacionalidad2 = Nacionalidad.PARAGUAY;
		PosicionBasquet posicion2 = PosicionBasquet.ESCOLTA;
		Basquetbolista basquetbolista1 = new Basquetbolista(nombreJugador2, dni2, precio2, edad2, nacionalidad1, altura2, castelar, posicion2, triples2, puntos2);

		padua.agregarFutbolista(futbolista1);

		assertNotNull(padua.getFutbolistas());

	}

	@Test
	public void queSePuedaHacerUnPaseDeUnClubAlOtro() {
		String nombreAgencia = "Lion Agency";
		Agencia agencia = new Agencia(nombreAgencia);
		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombreClub2 = "Argentino de Castelar";
		String localidad2 = "Castelar";
		Club castelar = new Club(nombreClub2, localidad2);
		
		String nombreJugador1 = "Pablo";
		Integer dni1 = 24000908;
		Double precio1 = 400.0;
		Integer edad1 = 24;
		Double altura1 = 1.70;
		Integer goles1 = 10;
		Integer asistencias1 = 20;
		Nacionalidad nacionalidad1 = Nacionalidad.ARGENTINA;
		PosicionFutbol posicion1 = PosicionFutbol.MEDIOCAMPISTA;
		Futbolista futbolista1 = new Futbolista(nombreJugador1, dni1, precio1, edad1, nacionalidad1, altura1, castelar, posicion1, goles1, asistencias1);
		
		agencia.agregarClub(castelar);
		agencia.agregarClub(padua);
		
		agencia.paseFutbolista(padua, castelar,futbolista1);
		
		assertTrue(castelar.getFutbolistas().contains(futbolista1));
		assertFalse(padua.getFutbolistas().contains(futbolista1));
	
	}


}
