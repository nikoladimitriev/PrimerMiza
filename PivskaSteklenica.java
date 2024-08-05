/**
 * PivskaSteklenica.java
 *
 * Opis: 
 * Delo s pivskimi steklenicami.
 * 
 * @author Nikola Dimitriev
 * @version Primer 19a (vmesniki) 
 */

/**
 * Javni razred, ki razširja razred Steklenica in implementira vmesnik AlkoholnaPijaca.
 */
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca { 
    // Vse lastnosti od nadrazreda se prenesejo
    // Deklariramo dodatne lastnosti, ki so značilne le za pivske steklenice
    private String znamka; 
    private double temperatura;
    private double stopnjaAlkohola;
    
    // Statična lastnost, ki je enaka vsem pivskim steklenicam (vsem objektom razreda)
    private static String material = "Steklo"; // Vse pivske steklenice so steklene
    
    /**
     * Javni konstruktor za ustvarjanje novega objekta tipa/razreda PivskaSteklenica.
     * @param z Znamka piva.
     * @param k Kapaciteta v mililitrih.
     */
    public PivskaSteklenica(String z, int k) {    
        // Pokličemo drug konstruktor tega istega razreda
        this(z, k, 4.5);
    }
    
    /**
     * Javni konstruktor za ustvarjanje novega objekta tipa/razreda PivskaSteklenica.
     * @param z Znamka piva.
     * @param k Kapaciteta v mililitrih.
     * @param s Stopnja alkohola.
     */
    public PivskaSteklenica(String z, int k, double s) {
        // Pokličemo konstruktor nadrazreda
        super(k, "pivo");
        
        // Inicializiramo še dodatne lastnosti
        znamka = z;
        temperatura = 5.0;
        
        // Inicializiramo privzeto stopnjo alkohola
        stopnjaAlkohola = s;
        
        // Izpišemo podatke
        System.out.println("Pivska steklenica je znamke " + z);
    }
    
    /**
     * Javna metoda, ki vrne stopnjo alkohola.
     * @return Stopnja alkohola.
     */
    public double getStopnjaAlkohola() {
        // Vrnemo stopnjo alkohola
        return stopnjaAlkohola;
    }
    
