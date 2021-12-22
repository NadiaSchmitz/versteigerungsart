import Prog1Tools.IOTools;

public class Preis {

	public static void main(String[] args) {
		
		int karton_summe, preis, min_preis, runden, i;
		
		min_preis = IOTools.readInteger("Geben Sie ein minimalen Preis ein: ");
		runden = IOTools.readInteger("Geben Sie Anzahl der Runden ein: ");
		
		preis = min_preis;
		karton_summe = preis;
		
		System.out.println("Ich biete " + preis);
		System.out.println("Beitrag im Karton beträgt: " + karton_summe);
		
		for (i = 0; i < runden; i++) {
			
			preis = preis + 1;
			System.out.println("Ich biete " + preis);
			
			karton_summe = karton_summe + preis;
			System.out.println("Beitrag im Karton beträgt: " + karton_summe);
			
		}
		
	}

}
