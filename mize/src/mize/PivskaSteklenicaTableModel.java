package mize;
/**
 
* PivskaSteklenicaTableModel.java
 *
 * Opis:
 * Razred za prikaz delovanja tabel v GUI
 * na primeru razredov poslovne logike Steklenica in Pivska steklenica
 *
 */
 
 // Uvozimo paket za delo z V/I napravami, pripomočke, GUI in dogodke 
 import java.io.*;
 import java.util.*;
 import javax.swing.*;
 import javax.swing.table.*;
 import java.awt.event.*;

/**
 * Javni razred za strukturo tabele steklenic na mizi
 *
 * @author Urška Bračun
 * @version Primer 20 (GUI)
 */
 
public class PivskaSteklenicaTableModel extends DefaultTableModel {
	
	/** Javni konstruktor za ustvarjanje novega modela tabele steklenic na mizi
	*/
	
	public PivskaSteklenicaTableModel() {
	// pokličemo konstruktor nadrazreda
		super();
	
	//dodamo stolpce
	addColumn("Znamka");
	addColumn("Stopnja alkohola");
	
	// dodamo prvi testni seznam objektov za dodajanje v tabelo
	Object[] vrstica = new Object[] {"Testna znamka", "5.0"};
	
	// dodamo prvi testni vnos (vrstico) v tabelo
	addRow(vrstica);
	

	}
	
	/** Javna metoda, ki doda PivskoSteeklenico v tabelo
	*/
	public void addPivskaSteklenica(PivskaSteklenica ps) {
		
		// dodamo seznam objektov za dodajanje v tabelo
	Object[] vrstica = new Object[] {ps.getZnamka(), ps.getStopnjaAlkohola() };
	
	// dodamo prvi testni vnos (vrstico) v tabelo
	addRow(vrstica);
		
	}


}