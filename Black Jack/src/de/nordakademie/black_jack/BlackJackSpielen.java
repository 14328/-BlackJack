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
	}

	private void spielStand() {
		System.out.println("Der Geber hat " + ohrqualle.punktezaehler() + " Punkte.");
		System.out.println("Der Spieler hat " + natascha.punktezaehler() + " Punkte.");
	}
}
