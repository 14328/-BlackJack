package de.nordakademie.black_jack;

import java.util.Arrays;

public class Kartenhand {

	private Spielkarten[] kartenhand = new Spielkarten[21]; // definiert leeres
															// "Blatt"
	private int zeiger = 0; // Zählt anzahl der Karten

	public void karteZiehen(Spielkarten handkarte) { // Methode, nimmt blind
														// Karte auf
		kartenhand[zeiger] = handkarte;
		zeiger++;// hochzählen von Blattgröße

	}

	public int punktezaehler() {

		int punkte = 0; // definition Varialbel zum Punkte zählen
		int assZaehler = 0; // definition Variable zum Assezählen(Assregel)

		for (Spielkarten karte : kartenhand) { // Alle Karten im Blatt angucken
			if (karte != null) {

				if (karte.getNummer().equals(Spielkarten.ASS)) {
					assZaehler++; // Asse zählen
				}

				punkte = punkte + karte.kartenwert(); // Kartenwert ausgeben und
														// zum
														// Punktewert addieren
			}
		}
		if (punkte > 21 && assZaehler > 0) {
			punkte = punkte - 10;
			if (punkte > 21 && assZaehler > 1) {
				punkte = punkte - 10;
				if (punkte > 21 && assZaehler > 2) {
					punkte = punkte - 10;
					if (punkte > 21 && assZaehler > 3) {
						punkte = punkte - 10;
					}
				}
			}
		} // Zählt Asse als 1, wenn das Blatt mehr als 21 Punkte hat.(und behält
			// höchst mögliche Punkzahl)

		return punkte; // Ausgebe von dem aktuellem Puntestand des Blatts.

	}

	@Override
	public String toString() {
		return "Kartenhand [kartenhand=" + Arrays.toString(kartenhand) + ", zeiger=" + zeiger + "]";
	}

}
