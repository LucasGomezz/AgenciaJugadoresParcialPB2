package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaAgencia {
	
	@Test
	public void queSePuedaCrearClubesYJugadores() {
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
		Futbolista futbolista1 = new Futbolista(nombreJugador1, dni1, precio1, edad1, nacionalidad1, altura1, posicion1, goles1, asistencias1);

		String nombreJugador2 = "Lucas";
		Integer dni2 = 43123321;
		Double precio2 = 200.0;
		Double altura2 = 1.80;
		Integer edad2 = 22;
		Integer triples2 = 50;
		Integer puntos2 = 300;
		Nacionalidad nacionalidad2 = Nacionalidad.PARAGUAY;
		PosicionBasquet posicion2 = PosicionBasquet.ESCOLTA;
		Basquetbolista basquetbolista1 = new Basquetbolista(nombreJugador2, dni2, precio2, edad2, nacionalidad2,
				altura2, posicion2, triples2, puntos2);

		padua.agregarFutbolista(futbolista1);
		agencia.asignarClubAJugador(padua, futbolista1);
		padua.agregarBasquetbolista(basquetbolista1);
		agencia.asignarClubAJugador(padua, basquetbolista1);
		assertNotNull(padua.getFutbolistas());
		assertNotNull(padua.getBasquetbolistas());

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
		Futbolista futbolista1 = new Futbolista(nombreJugador1, dni1, precio1, edad1, nacionalidad1, altura1, posicion1, goles1, asistencias1);

		agencia.agregarClub(castelar);
		agencia.agregarClub(padua);
		castelar.agregarFutbolista(futbolista1);
		agencia.asignarClubAJugador(castelar, futbolista1);

		agencia.paseFutbolista(padua, castelar, futbolista1);

		assertTrue(castelar.getFutbolistas().contains(futbolista1));
		assertFalse(padua.getFutbolistas().contains(futbolista1));

	}

	@Test
	public void queNoSePuedaPasarUnFutbolistaMayorDe28Años() {
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
		Integer edad1 = 29;
		Double altura1 = 1.70;
		Integer goles1 = 10;
		Integer asistencias1 = 20;
		Nacionalidad nacionalidad1 = Nacionalidad.ARGENTINA;
		PosicionFutbol posicion1 = PosicionFutbol.MEDIOCAMPISTA;
		Futbolista futbolista1 = new Futbolista(nombreJugador1, dni1, precio1, edad1, nacionalidad1, altura1, posicion1, goles1, asistencias1);

		agencia.agregarClub(castelar);
		agencia.agregarClub(padua);
		castelar.agregarFutbolista(futbolista1);
		agencia.asignarClubAJugador(castelar, futbolista1);
		agencia.paseFutbolista(castelar, padua, futbolista1);

		assertTrue(castelar.getFutbolistas().contains(futbolista1));
		assertFalse(padua.getFutbolistas().contains(futbolista1));

	}

	@Test
	public void queNoSePuedaPasarUnNadadorConMenosDe5Medallas() {
		String nombreAgencia = "Lion Agency";
		Agencia agencia = new Agencia(nombreAgencia);
		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombreClub2 = "Argentino de Castelar";
		String localidad2 = "Castelar";
		Club castelar = new Club(nombreClub2, localidad2);

		String nombreJugador3 = "Juan";
		Integer dni3 = 24098765;
		Double precio3 = 500.0;
		Integer edad3 = 22;
		Nacionalidad nacionalidad3 = Nacionalidad.BRASIL;
		Double altura3 = 1.90;
		Double mejorTiempo1000Mts3 = 50.91;
		Integer medallasGanadas3 = 4;
		Estilo estiloDestacado3 = Estilo.ESPALDA;

		Nadador nadador1 = new Nadador(nombreJugador3, dni3, precio3, edad3, nacionalidad3, altura3, mejorTiempo1000Mts3, medallasGanadas3, estiloDestacado3);

		agencia.agregarClub(castelar);
		agencia.agregarClub(padua);
		castelar.agregarNadador(nadador1);
		agencia.asignarClubAJugador(castelar, nadador1);

		agencia.paseNadador(castelar, padua, nadador1);

		assertTrue(castelar.getNadadores().contains(nadador1));
		assertFalse(padua.getNadadores().contains(nadador1));
	}

	@Test
	public void queNoSePuedaPasarUnBasquetbolistaConPrecioMenorA1500() {
		String nombreAgencia = "Lion Agency";
		Agencia agencia = new Agencia(nombreAgencia);
		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombreClub2 = "Argentino de Castelar";
		String localidad2 = "Castelar";
		Club castelar = new Club(nombreClub2, localidad2);

		String nombreJugador2 = "Lucas";
		Integer dni2 = 43123321;
		Double precio2 = 200.0;
		Double altura2 = 1.80;
		Integer edad2 = 22;
		Integer triples2 = 50;
		Integer puntos2 = 300;
		Nacionalidad nacionalidad2 = Nacionalidad.PARAGUAY;
		PosicionBasquet posicion2 = PosicionBasquet.ESCOLTA;
		Basquetbolista basquetbolista1 = new Basquetbolista(nombreJugador2, dni2, precio2, edad2, nacionalidad2, altura2, posicion2, triples2, puntos2);

		agencia.agregarClub(castelar);
		agencia.agregarClub(padua);
		padua.agregarBasquetbolista(basquetbolista1);
		agencia.asignarClubAJugador(padua, basquetbolista1);
		agencia.paseBasquetbolista(padua, castelar, basquetbolista1);

		assertTrue(padua.getBasquetbolistas().contains(basquetbolista1));
		assertFalse(castelar.getBasquetbolistas().contains(basquetbolista1));

	}

	@Test
	public void queNoSePuedaPasarUnBasquetbolistaConMenosDe100Puntos() {
		String nombreAgencia = "Lion Agency";
		Agencia agencia = new Agencia(nombreAgencia);
		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombreClub2 = "Argentino de Castelar";
		String localidad2 = "Castelar";
		Club castelar = new Club(nombreClub2, localidad2);

		String nombreJugador2 = "Lucas";
		Integer dni2 = 43123321;
		Double precio2 = 12200.0;
		Double altura2 = 1.80;
		Integer edad2 = 22;
		Integer triples2 = 50;
		Integer puntos2 = 99;
		Nacionalidad nacionalidad2 = Nacionalidad.PARAGUAY;
		PosicionBasquet posicion2 = PosicionBasquet.ESCOLTA;
		Basquetbolista basquetbolista1 = new Basquetbolista(nombreJugador2, dni2, precio2, edad2, nacionalidad2, altura2, posicion2, triples2, puntos2);

		agencia.agregarClub(castelar);
		agencia.agregarClub(padua);
		padua.agregarBasquetbolista(basquetbolista1);
		agencia.asignarClubAJugador(padua, basquetbolista1);
		agencia.paseBasquetbolista(padua, castelar, basquetbolista1);

		assertTrue(padua.getBasquetbolistas().contains(basquetbolista1));
		assertFalse(castelar.getBasquetbolistas().contains(basquetbolista1));

	}

	@Test
	public void queNoSePuedaPasarUnTenistaQueNoEsteEnElTop100() {
		String nombreAgencia = "Lion Agency";
		Agencia agencia = new Agencia(nombreAgencia);
		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombreClub2 = "Argentino de Castelar";
		String localidad2 = "Castelar";
		Club castelar = new Club(nombreClub2, localidad2);

		String nombre4 = "Rafael";
		Integer dni4 = 33456857;
		Double precio4 = 20000.0;
		Integer edad4 = 30;
		Nacionalidad nacionalidad4 = Nacionalidad.URUGUAY;
		Double altura4 = 1.98;
		Integer rankingMunidialActual4 = 101;
		Integer mejorRankinMundial = 90;

		Tenista tenista1 = new Tenista(nombre4, dni4, precio4, edad4, nacionalidad4, altura4, rankingMunidialActual4,
				mejorRankinMundial);

		agencia.agregarClub(castelar);
		agencia.agregarClub(padua);
		castelar.agregarTenista(tenista1);
		agencia.asignarClubAJugador(castelar, tenista1);
		agencia.paseTenista(castelar, padua, tenista1);

		assertTrue(castelar.getTenistas().contains(tenista1));
		assertFalse(padua.getTenistas().contains(tenista1));

	}

	@Test
	public void queSePuedaSaberCuantoValeUnClub() {
		String nombreAgencia = "Lion Agency";
		Agencia agencia = new Agencia(nombreAgencia);
		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombre4 = "Rafael";
		Integer dni4 = 33456857;
		Double precio4 = 20000.0;
		Integer edad4 = 30;
		Nacionalidad nacionalidad4 = Nacionalidad.URUGUAY;
		Double altura4 = 1.98;
		Integer rankingMunidialActual4 = 101;
		Integer mejorRankinMundial = 90;
		Tenista tenista1 = new Tenista(nombre4, dni4, precio4, edad4, nacionalidad4, altura4, rankingMunidialActual4, mejorRankinMundial);

		String nombreJugador2 = "Lucas";
		Integer dni2 = 43123321;
		Double precio2 = 200.0;
		Double altura2 = 1.80;
		Integer edad2 = 22;
		Integer triples2 = 50;
		Integer puntos2 = 300;
		Nacionalidad nacionalidad2 = Nacionalidad.PARAGUAY;
		PosicionBasquet posicion2 = PosicionBasquet.ESCOLTA;
		Basquetbolista basquetbolista1 = new Basquetbolista(nombreJugador2, dni2, precio2, edad2, nacionalidad2, altura2, posicion2, triples2, puntos2);

		String nombreJugador3 = "Juan";
		Integer dni3 = 24098765;
		Double precio3 = 500.0;
		Integer edad3 = 22;
		Nacionalidad nacionalidad3 = Nacionalidad.BRASIL;
		Double altura3 = 1.90;
		Double mejorTiempo1000Mts3 = 50.91;
		Integer medallasGanadas3 = 4;
		Estilo estiloDestacado3 = Estilo.ESPALDA;
		Nadador nadador1 = new Nadador(nombreJugador3, dni3, precio3, edad3, nacionalidad3, altura3, mejorTiempo1000Mts3, medallasGanadas3, estiloDestacado3);

		String nombreJugador1 = "Pablo";
		Integer dni1 = 24000908;
		Double precio1 = 400.0;
		Integer edad1 = 24;
		Double altura1 = 1.70;
		Integer goles1 = 10;
		Integer asistencias1 = 20;
		Nacionalidad nacionalidad1 = Nacionalidad.ARGENTINA;
		PosicionFutbol posicion1 = PosicionFutbol.MEDIOCAMPISTA;
		Futbolista futbolista1 = new Futbolista(nombreJugador1, dni1, precio1, edad1, nacionalidad1, altura1, posicion1, goles1, asistencias1);

		agencia.agregarClub(padua);
		padua.agregarBasquetbolista(basquetbolista1);
		agencia.asignarClubAJugador(padua, basquetbolista1);
		padua.agregarFutbolista(futbolista1);
		agencia.asignarClubAJugador(padua, futbolista1);
		padua.agregarNadador(nadador1);
		agencia.asignarClubAJugador(padua, nadador1);
		padua.agregarTenista(tenista1);
		agencia.asignarClubAJugador(padua, tenista1);


		Double valorEsperado = 400.0 + 500.0 + 200.0 + 20000.0;
		Double valorObtenido = agencia.cuantoValeUnClub(padua);

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaConocerElJugadorMasCaroDeUnClub() {
		String nombreAgencia = "Lion Agency";
		Agencia agencia = new Agencia(nombreAgencia);
		String nombreClub1 = "C.A.S.A Padua";
		String localidad1 = "San Antonio De Padua";
		Club padua = new Club(nombreClub1, localidad1);

		String nombre4 = "Rafael";
		Integer dni4 = 33456857;
		Double precio4 = 20000.0;
		Integer edad4 = 30;
		Nacionalidad nacionalidad4 = Nacionalidad.URUGUAY;
		Double altura4 = 1.98;
		Integer rankingMunidialActual4 = 101;
		Integer mejorRankinMundial = 90;
		Tenista tenista1 = new Tenista(nombre4, dni4, precio4, edad4, nacionalidad4, altura4, rankingMunidialActual4, mejorRankinMundial);

		String nombreJugador2 = "Lucas";
		Integer dni2 = 43123321;
		Double precio2 = 200.0;
		Double altura2 = 1.80;
		Integer edad2 = 22;
		Integer triples2 = 50;
		Integer puntos2 = 300;
		Nacionalidad nacionalidad2 = Nacionalidad.PARAGUAY;
		PosicionBasquet posicion2 = PosicionBasquet.ESCOLTA;
		Basquetbolista basquetbolista1 = new Basquetbolista(nombreJugador2, dni2, precio2, edad2, nacionalidad2,
				altura2, posicion2, triples2, puntos2);

		String nombreJugador3 = "Juan";
		Integer dni3 = 24098765;
		Double precio3 = 500.0;
		Integer edad3 = 22;
		Nacionalidad nacionalidad3 = Nacionalidad.BRASIL;
		Double altura3 = 1.90;
		Double mejorTiempo1000Mts3 = 50.91;
		Integer medallasGanadas3 = 4;
		Estilo estiloDestacado3 = Estilo.ESPALDA;
		Nadador nadador1 = new Nadador(nombreJugador3, dni3, precio3, edad3, nacionalidad3, altura3, mejorTiempo1000Mts3, medallasGanadas3, estiloDestacado3);

		String nombreJugador1 = "Pablo";
		Integer dni1 = 24000908;
		Double precio1 = 400.0;
		Integer edad1 = 24;
		Double altura1 = 1.70;
		Integer goles1 = 10;
		Integer asistencias1 = 20;
		Nacionalidad nacionalidad1 = Nacionalidad.ARGENTINA;
		PosicionFutbol posicion1 = PosicionFutbol.MEDIOCAMPISTA;
		Futbolista futbolista1 = new Futbolista(nombreJugador1, dni1, precio1, edad1, nacionalidad1, altura1, posicion1, goles1, asistencias1);

		agencia.agregarClub(padua);
		padua.agregarBasquetbolista(basquetbolista1);
		agencia.asignarClubAJugador(padua, basquetbolista1);
		padua.agregarFutbolista(futbolista1);
		agencia.asignarClubAJugador(padua, futbolista1);
		padua.agregarNadador(nadador1);
		agencia.asignarClubAJugador(padua, nadador1);
		padua.agregarTenista(tenista1);
		agencia.asignarClubAJugador(padua, tenista1);

		Jugador valorEsperado = tenista1;
		Jugador valorObtenido = padua.jugadorMasCaroDelClub();
		assertEquals(valorEsperado, valorObtenido);

	}
}
