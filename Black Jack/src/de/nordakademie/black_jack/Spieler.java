package de.nordakademie.black_jack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spieler {

	private Kartenhand blatt = new Kartenhand();// Hand dem Spieler zuweisen

	public boolean karteZiehen() {

		System.out.println("Du hast " + blatt.punktezaehler() + " Punkte. Möchtest du eine weitere Karte ziehen?");
		// Ausgabe Punkte und Frage nach neuer Karte

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Michi:liest die Konsole gibt alles aus.

		try {
			String eingabe = reader.readLine();
			// eingabe enthält die Eingabe in der Konsole (ja/nein)
			if (eingabe.equalsIgnoreCase("ja")) {
				return true;
			}
			if (eingabe.equalsIgnoreCase("nein")) {
				return false;
			} else {
				System.out.println("Die Eingabe ist nicht korrekt. Bitte antworte mit ja oder nein.");
				return karteZiehen();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

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
