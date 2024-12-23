
public class CashRegister {

	public static void main(String[] args) {
		// der Kunde zahlt einen Betrag
		double kosten = 16.09;
		// der Kassierer nimmt den Betrag entgegen
		double zahlung = 20;
		// Gesamtbetrag soll vom Zahlbetrag abgezogen werden
		double rueckGeld = zahlung - kosten;
		// Restgeld erstellen
		double restGeld = 0;
		// die Differenz wird ausgegeben
		System.out.println("Das Rückgeld beträgt "+rueckGeld+" EUR.");
		// eine Liste mit allen Scheinen und Münzen erstellen
		double[] scheineUndMuenzen = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.10, 0.05, 0.02, 0.01};
		// diese Liste mit einer foreach-Schleife durchlaufen 
		for (double i: scheineUndMuenzen) {
			// das Restgeld ausrechnen
			if (i == rueckGeld) {
				System.out.println("exakter Betrag - kein Wechselgeld");
			// den Rest
			} else if ((rueckGeld - i) >= 0) {
				rueckGeld = rueckGeld - i;
				restGeld = rueckGeld;
				// entsprechende Scheine und Münzen ausgeben
				System.out.println("Rückgeldausgabe: € " + i);
			}
		}
		// Wenn noch was übrig bleibt, den Rest ausgeben
		if(restGeld > 0){
			for (double i: scheineUndMuenzen) {
				if((restGeld - i) >= 0) {
					restGeld = restGeld - i;
					System.out.println("Rückgeldausgabe: € " + i);
				}
			}
		}
	}
}
