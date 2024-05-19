package mize;
/**
 *
 PivskaSteklenica.java
 *
 * Opis:
 * Delo s pivskimi steklenicami
 *
 * @author Urška Bračun
 * @version Primer 16 (dedovanje)
 */

/**
 * Javni razred ki razširja razred steklenica
 */
 
public class PivskaSteklenica extends Steklenica  implements AlkoholnaPijaca {
	
	//Vse lastnosti od nadrazreda se prenesejo
	// DEklariramo dodatne zasebne lastnosti, ki so značilne za pivske steklenice
	
	private String znamka;
	private double temperatura;
	private double stopnjaAlkohola;
	
	// Statična lastnost, ki je enaka vsem pivskim steklenicam(objektom v razredu)
	
	private static String material = "Steklo"; // Vse pivske steklenice so steklene
	
	
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda Steklenica
	* @param z Znamka piva
	* @param k Kapaciteta v mililitrih
	* @return Nov objekt tipa pivska steklenica
	*/
	public PivskaSteklenica(String z, int k) {
		// Pokličemo konstruktor tega istega razreda
		this (z, k, 4.5);
	}
	
	
	
	
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda Steklenica
	* @param z Znamka piva
	* @param k Kapaciteta v mililitrih
	* @param s Stopnja alkohola
	* @return Nov objekt tipa pivska steklenica
	*/
	
	public PivskaSteklenica(String z, int k, double s) {
	
		//pokličem drug kontruktor tega istega razreda
	//	this (z, k, 4.5);
	
		//Pokličemo konstruktor nadrazreda 
		super(k, "Pivo");
		
		// Inicializiramo še dodatne lastnosti podrazreda
		znamka = z;
		temperatura = 5.0;
		
		// Inicializiramo privzeto stopnjo alkohola
		stopnjaAlkohola = s; 
		
		// Izpišemo pozdrav v konzolo
		System.out.println("Pivska steklenica je znamke " + z);
	}

	
	/** Javna metoda, ki vrne stopnjo alkohola
	* @return Stopnja alkohola
	*/
		public double getStopnjaAlkohola() {
			

			 return stopnjaAlkohola	;
			 
		}
		
		
	/** Javna getter metoda, ki vrne znamko piva
	* @return znamka piva
	*/
		public String getZnamka() {
			

			 return znamka;
			 
		}
}		

	

	
