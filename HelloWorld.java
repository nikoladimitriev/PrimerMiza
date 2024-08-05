/**
 * HelloWorld.java
 *
 * Opis:
 * Program, ki v ukazno konzolo izpiše "Pozdravljen, Svet!"
 * V nadaljevanju služi prikazu delovanja razredov in objektov
 * 
 * @author Nikola Dimitriev
 * @version Primer 19a (vmesniki)   TEST TEST TEST
 */ 

// Uvozimo vse razrede iz paketa za delo z V/I napravami in pripomočke
import java.io.*;
import java.util.*;

/**
 * Javni razred za prikaz delovanja jave
 */
public class HelloWorld {
    
    // Deklariramo statične lastnosti 
    
    // Objekt za vnos iz konzole
    private static BufferedReader in;
    
    // Deklariramo Abstraktni seznam objektov razreda PivskaSteklenica
    private static ArrayList<PivskaSteklenica> pivskeSteklenice; 
    
    /**
     * Javna statična metoda, ki se izvede ob zagonu programa
     * @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
     */
    public static void main(String[] args) {
        // Inicializiramo statično lastnost za vnos iz tipkovnice
        // Konstruktor kot vhodni parameter prejme anonimni objekt razreda InputStreamReader
        in = new BufferedReader(new InputStreamReader(System.in));
        
        // Inicializiramo seznam pivskih steklenic
        pivskeSteklenice = new ArrayList<PivskaSteklenica>();
        
        // Izpišemo pozdrav v konzolo
        System.out.println("Pozdravljen, Svet!");
        
        // Ustvarimo objekt tipa/razreda Steklenica
        Steklenica zganje = new Steklenica(50, "Žganje");
        Steklenica voda = new Steklenica(500, "Voda");
        
        // Deklariramo in inicializiramo spremenljivko za količino vode
        int kv = 0;
        
        // Poskusimo prebrati niz s tipkovnice
        try {
            System.out.print("Koliko vode naj natočim v steklenico?");
            
            // Niz, vnešen preko tipkovnice, preberemo v spremenljivko    
            String kolicinaVode = in.readLine();
            
            // Niz zapišemo v celo število
            kv = Integer.parseInt(kolicinaVode);
            
            System.out.println("V kozarec bom natočil " + kolicinaVode + " ml vode");
        } catch(Exception e) {
            System.out.println("Prišlo je do napake pri vnosu: " + e);
        }
        
        // Iz steklenice za vodo poskusimo izprazniti toliko, kot smo vsnesli v konzoli 
        // (kličemo metodo izprazni objekta voda) 
        try {
            voda.odpri();
            String vsebinaKozarca = voda.izprazni(kv);
            System.out.println("Vsebina kozarca je " + vsebinaKozarca);
        }
        catch(Exception e) {
            System.out.println("Prišlo je do napake pri praznjenju steklenice: " + e);
        }
        
        // Odpremo steklenico z žganjem
        zganje.odpri();
        
        // Iz steklenice z žganjem poskusimo napraviti požirek
        try {    
            String pozirek = zganje.izprazni(20);
            System.out.println("Naredili smo požirek " + pozirek);
        }
        catch(Exception e) {
            System.out.println("Prišlo je do napake pri praznjenju steklenice zganja: " + e);
        }
        
        // Ustvarimo tri pivske steklenice (objekti)
        PivskaSteklenica velikoLasko = new PivskaSteklenica("Laško", 500);
        PivskaSteklenica maliUnion = new PivskaSteklenica("Union", 330);
        PivskaSteklenica heineken = new PivskaSteklenica("heineken", 330);
        
        // Steklenice dodamo v seznam 
        pivskeSteklenice.add(velikoLasko);
        pivskeSteklenice.add(maliUnion);
        pivskeSteklenice.add(heineken);
        
        // Dodamo novo brezalkoholno pivo (anonimni objekt)
        pivskeSteklenice.add(new PivskaSteklenica("Laško Malt", 500, 0.0));
        
        // Odpremo vse steklenice v seznamu
        for (int c = 0; c < pivskeSteklenice.size(); c++) {
            if (pivskeSteklenice.get(c).odpri()) {
                System.out.println("Steklenica št. " + c + " uspešno odprta");
            }
        }
        
        // Kličemo metode, ki so bile že deklarirane že v nadrazredu
        try {
            velikoLasko.odpri();
            System.out.println("Naredili smo požirek " + velikoLasko.izprazni(50));
        }
        catch(Exception e) {
            System.out.println("Prišlo je do napake pri praznjenju steklenice Laškega: " + e);
        }
    }
}
