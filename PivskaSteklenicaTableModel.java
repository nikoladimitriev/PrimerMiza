/**
 * PivskaSteklenicaTableModel.java
 *
 * Opis:
 * Razred za prikaz delovanja tabele steklenic v GUI-ju
 * na primeru razredov poslovne logike Steklenica in PivskaSteklenica
 * 
 */

// Uvozimo vse razrede iz paketa za delo z V/I napravami in pripomočke, GUI, dogodke in tabele
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

/**
 * Javni razred, ki predstavlja model tabele za prikaz pivskih steklenic.
 * Razred razširja DefaultTableModel in omogoča dodajanje novih vrstic z informacijami o pivskih steklenicah.
 * 
 * @author Nikola Dimitriev
 * @version Primer 20 (GUI)
 */
public class PivskaSteklenicaTableModel extends DefaultTableModel {
	
	/**
	 * Javni konstruktor za ustvarjanje novega modela tabele za pivske steklenice.
	 * Inicializira tabelo s stolpci "Znamka" in "Stopnja alkohola" ter doda eno testno vrstico.
	 */
	public PivskaSteklenicaTableModel() {
		// Pokličemo konstruktor nadrazreda
		super();		

		// Dodamo stolpce
		addColumn("Znamka");
		addColumn("Stopnja alkohola");

		// Ustvarimo testno vrstico
		Object[] vrstica = new Object[] {"Testna znamka", "5.0"};
		// Dodamo testno vrstico v tabelo
		addRow(vrstica);
	}

	/**
	 * Javna metoda, ki doda pivsko steklenico v tabelo.
	 * 
	 * @param ps Objekt tipa PivskaSteklenica, ki ga želimo dodati v tabelo.
