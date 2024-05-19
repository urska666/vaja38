package mize;
/**
 
* Miza.java
 *
 * Opis:
 * Program za delovanje GUI na primeru razredov poslovne logike Steklenica in Pivska steklenica
 *
 */
 
 // Uvozimo paket za delo z V/I napravami, pripomočke, GUI in dogodke 
 import java.io.*;
 import java.util.*;
 import javax.swing.*;
 import javax.swing.table.*;
 import java.awt.event.*;

/**
 * Javni razred za zagon uporabniškega vmesnika
 *
 * @author Urška Bračun
 * @version Primer 20 (GUI)
 */
 
public class Miza extends JFrame implements ActionListener {
	
	//deklaracija zasebnih lastnosti
	private JPanel povrsina;
	private JButton dodajButton;
	private JTextField znamkaVnos;
	private JTextField alkoholVnos;
	private JTable tabela;
	private PivskaSteklenicaTableModel modelTabele;
	
	/** Javno statična metoda, ki se izvede ob zagonu programa
	* @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	* @return Metoda ne vrača nič (ker je tipa void)
	*/
	public static void main(String[] args)  {
		
		// Izpišemo pozdrav v konzolo
		System.out.println("Zaganjam GUI...");
		
		// ustvarimo objekt tipa miza (kličemo konstruktor razreda Miza  	)
		Miza m = new Miza();
	}
	
	/* Javni konstruktor za ustvarjanje novega okna s prikazom steklenic
	*/
	
	public Miza() {
	// pokličemo konstruktor nadrazreda
		super("Miza s steklenicami");
		
	// nastavimo obnašanje križca (x) tako, da konča aplikacijo
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	// nastavimo velikost okna
	setSize(800, 600);
	
		// inicializiramo lastnosti
	povrsina = new JPanel();
	dodajButton = new JButton("Dodaj steklenico");
	znamkaVnos = new JTextField(32);
	alkoholVnos = new JTextField(4);
	modelTabele = new PivskaSteklenicaTableModel();
	tabela = new JTable(modelTabele);
	
	// Gumbu za dodajanje dodamo ActionListener
	dodajButton.addActionListener(this);
	
	
	//na povrsino dodamo vnosna polja
	povrsina.add(new JLabel("Znamka: "));
	povrsina.add(znamkaVnos);
	povrsina.add(new JLabel("Stopnja alkohola: "));
	povrsina.add(alkoholVnos);
	
	//na povrsino dodamo gumb
	povrsina.add(dodajButton);
	
	// na povrsino dodamo tabelo
	povrsina.add(tabela);
	
	// na okno dodamo povrsino
	add(povrsina);
	
	// napravimo okno vidno
		setVisible(true);
	}
	
	/*Metoda, ki izvaja aktivnosti glede na dogodke
	* @param e Dogodek, ki je sprožil, klical metodo
	*/
	
	public void actionPerformed (ActionEvent e) {
		
		//Izpišemo indikator klika gumba
		System.out.println("Dodajam steklenico...");
		System.out.println("Znamka: " + znamkaVnos.getText());
		System.out.println("Stopnja alkohola: " + alkoholVnos.getText());
		
		// Ustvarimo sprmenljivko za stopnjo alkohola
		double sa = Double.parseDouble (alkoholVnos.getText());
		
		// ustvarimo objekt tipa PivskaSteklenica
		PivskaSteklenica nova = new PivskaSteklenica(znamkaVnos.getText(), 500, sa);
		
		// Pivsko steklenico dodamo v model tabele
		modelTabele.addPivskaSteklenica(nova);
	
	}
	
	
	

}