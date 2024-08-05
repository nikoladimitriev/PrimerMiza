/**
 * AlkoholnaPijaca.java
 *
 * Opis: 
 * Vmesnik za alkoholne pijače.
 * Delo s pivskimi steklenicami.
 * 
 * @author Nikola Dimitriev
 * @version Primer 19a (vmesniki) 
 */

/**
 * Javni vmesnik, ki ga morajo implementirati vse steklenice, kozarci in sodi.
 */
public interface AlkoholnaPijaca {
    
    /**
     * Javna abstraktna metoda, ki vrne stopnjo alkohola.
     * @return Stopnja alkohola
     */
    public double getStopnjaAlkohola();
}
