package de.nordakademie.black_jack;

public class Geber {

	private Kartenhand blatt = new Kartenhand();// Hand dem Geber zuweisen

	public boolean karteZiehen() {

		if (blatt.punktezaehler() < 17) {
			return true;
		} else {
			return false;
		} // Regel wann der Geber ziehen darf
	}

	public void karteAufnehmen(Spielkarten karte) {
		// Methode zum Aufnehmen der Karte

		blatt.karteZiehen(karte);
		// weißt Karte dem Blatt zu

	}

	public int punktezaehler() {
		return blatt.punktezaehler();
	}
}
