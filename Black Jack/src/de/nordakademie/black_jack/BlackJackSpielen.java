package de.nordakademie.black_jack;

public class BlackJackSpielen {

	public static void main(String[] args) {
		new BlackJackSpielen().spielStarten();
	}

	private Stapel stapelA = new Stapel();
	private Geber ohrqualle = new Geber();
	private Spieler natascha = new Spieler();

	public void spielStarten() {// Spielverlauf:

		natascha.karteAufnehmen(stapelA.gibKarte());
		natascha.karteAufnehmen(stapelA.gibKarte());
		ohrqualle.karteAufnehmen(stapelA.gibKarte());
		// erste Runde Kartenausgabe
		spielStand();

		while (natascha.punktezaehler() < 21 && natascha.karteZiehen() == true) {
			natascha.karteAufnehmen(stapelA.gibKarte());
		}
		// weitere Runden Spieler zieht
		while (ohrqualle.punktezaehler() < 17) {
			ohrqualle.karteAufnehmen(stapelA.gibKarte());
		}
		// Geber zieht
		spielStand();
		//Spielstand ausgeben.
		if (natascha.punktezaehler() < 22) {
			if (ohrqualle.punktezaehler() < natascha.punktezaehler()) {
				System.out.println("Du bist der Babbo!");
			}
			if (ohrqualle.punktezaehler() == natascha.punktezaehler()) {
				System.out.println("Chabos wissen nicht soo genau, wer der Babbo ist...");
			} else {
				System.out.println("Du bist der Chabo...");
			}
		} else {
			System.out.println("Du bist der alpha Chabo...");
		}//Wer gewinnt
	}

	private void spielStand() {
		System.out.println("Der Geber hat " + ohrqualle.punktezaehler() + " Punkte.");
		System.out.println("Der Spieler hat " + natascha.punktezaehler() + " Punkte.");
		//Methode zur Ausgabe des Spielstand
	}
}
