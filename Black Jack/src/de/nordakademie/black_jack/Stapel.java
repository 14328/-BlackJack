package de.nordakademie.black_jack;

import java.util.Arrays;
import java.util.Random;

public class Stapel {

	private final Spielkarten[] stapel = new Spielkarten[52];// Array definition
	private int zeiger = 0;

	public Stapel() { // Konstruktor

		int i = 0;
		for (String farbe : Spielkarten.FARBEN) {
			for (String zahl : Spielkarten.ZAHLEN) {
				stapel[i++] = new Spielkarten(farbe, zahl);
			} /*
				 * füllen vom Stapel:: for (Kompiler1eigenschaft : erstellung
				 * Karte: zufüllendesArray2.Array1 aus dem Komiler1) erzeugen
				 * eines Objekts (Spielkarten)+Karte in den Stapel:
				 * stapel[i++]=new Spielkarten(farbe, zahl)
				 */
		}
		shuffle();
	}

	public void shuffle() {

		for (int i = stapel.length; i > 1; i--)
			swap(stapel, i - 1, new Random().nextInt(i));
	}// bestehende Methode zum Mischen

	private static void swap(Object[] arr, int i, int j) {
		Object tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}// bestehende Methode zum tauschen von Arrayplätzen

	public Spielkarten gibKarte() {
		return stapel[zeiger++];
		// Gibt eine neue Karte aus
	}
}
