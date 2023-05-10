package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Agencia {
	private HashSet<Club> clubes = new HashSet<>();
	
	public void agregarClub(Club club) {
		clubes.add(club);
	}

	public HashSet<Club> getClubes() {
		return clubes;
	}

	public void setClubes(HashSet<Club> clubes) {
		this.clubes = clubes;
	}

}
