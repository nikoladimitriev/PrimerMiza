/**
 * Steklenica.java
 *
 * Opis: Delo s steklenicami.
 * 
 * @author Nikola Dimitriev
 * @version Primer 19a (vmesniki) 
 */

/**
 * Javni razred za prikaz dela z razredi in objekti.
 */
public class Steklenica {
    
    // Deklariramo zasebne lastnosti steklenice
    private int kapaciteta; // v mililitrih
    private boolean jeOdprta;
    private String vrstaVsebine;
    private int kolicinaVsebine;  // v mililitrih
    
    /**
     * Javni konstruktor za ustvarjanje novega objekta tipa/razreda Steklenica.
     * @param k Kapaciteta steklenice v mililitrih.
     * @param v Vrsta vsebine steklenice.
     */
    public Steklenica(int k, String v) {    
        // Inicializiramo lastnosti
        kapaciteta = k;
        jeOdprta = false;
        vrstaVsebine = v;
        kolicinaVsebine = k;
        // Izpišemo podatke
        System.out.println("Ustvarjam objekt tipa Steklenica kapacitete " + k + " z vsebino " + v);
    }
    
    /**
     * Javna metoda, ki izprazni vsebino iz steklenice.
     * @param k Količina, ki jo želimo izprazniti v mililitrih.
     * @return Vrsta vsebine steklenice.
     * @throws Exception Če je steklenica zaprta, vrže izjemo.
     */
    public String izprazni(int k) throws Exception {    
        // Če je steklenica odprta
        if (jeOdprta) {
            // Zmanjšamo količino vsebine za iztočeno količino
            System.out.println("Količina pred praznjenjem: " + kolicinaVsebine);

            kolicinaVsebine = kolicinaVsebine - k;
            System.out.println("Količina po praznjenju: " + kolicinaVsebine);
            
            // Vrnemo vrsto vsebine
            return vrstaVsebine;
        } else {
            // Če je steklenica zaprta, vrže izjemo
            throw new Exception("Ne morem izprazniti steklenice, ker je zaprta");
        }
    }
    
    /**
     * Javna metoda, ki odpre steklenico.
     * @return Vrne true, če je bilo odpiranje uspešno, ali false, če je bila steklenica že odprta.
     */
    public boolean odpri() {    
        // Če je steklenica že odprta
        if (jeOdprta) {
            // Vrnemo false (ker je bila že odprta)
            return false;
        } else {
            // Če je steklenica zaprta, spremenimo lastnost 
            jeOdprta = true;
            // Vrnemo true (ker je bilo odpiranje uspešno)
            return true;
        }
    }
    
    /**
     * Javna metoda, ki vrne količino vsebine.
     * @return Vrne količino vsebine steklenice v mililitrih.
     */
    public int getKolicinaVsebine() {    
        // Vrnemo količino vsebine    
        return kolicinaVsebine;
    }
}
