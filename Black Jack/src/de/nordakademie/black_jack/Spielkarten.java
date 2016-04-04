package de.nordakademie.black_jack;

public class Spielkarten {

	private final String farbe;
	private final String nummer; // unveränderlich definiert

	public Spielkarten(String farbe, String nummer) {
		// Konstruktor heist immer wie die Klasse

		this.farbe = farbe;
		this.nummer = nummer;
	}

	@Override
	public String toString() {
		return "Spielkarten [farbe=" + farbe + ", nummer=" + nummer + "]";
	}

	public static final String KARO = "Karo"; // Konstanten festlegen
	public static final String HERZ = "Herz";
	public static final String PIK = "Pik";
	public static final String KREUZ = "Kreuz";

	public static final String ZWEI = "Zwei";
	public static final String DREI = "Drei";
	public static final String VIER = "Vier";
	public static final String FUENF = "Fünf";
	public static final String SECHS = "Sechs";
	public static final String SIEBEN = "Sieben";
	public static final String ACHT = "Acht";
	public static final String NEUN = "Neun";
	public static final String ZEHN = "Zehn";
	public static final String BUBE = "Bube";
	public static final String DAME = "Dame";
	public static final String KOENIG = "König";
	public static final String ASS = "Ass";

	public static final String[] FARBEN = { KARO, HERZ, PIK, KREUZ };
	public static final String[] ZAHLEN = { ZWEI, DREI, VIER, FUENF, SECHS, SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME,
			KOENIG, ASS }; // Arrays erstellen und füllen

	public int kartenwert() {

		switch (nummer) {
		case ZWEI:
			return 2;
		case DREI:
			return 3;
		case VIER:
			return 4;
		case FUENF:
			return 5;
		case SECHS:
			return 6;
		case SIEBEN:
			return 7;
		case ACHT:
			return 8;
		case NEUN:
			return 9;
		case ZEHN:
			return 10;
		case BUBE:
			return 10;
		case DAME:
			return 10;
		case KOENIG:
			return 10;
		case ASS:
			return 11;

		} // Zuweiseung von einfachen Werten

		return 0;
	}

	public String getNummer() {
		return nummer; /*
						 * Katennummer trotz private zugänglich
						 * machen.(Vincen:"Das ist der Pressesprecher des
						 * Bundestages")
						 */

	}

}
