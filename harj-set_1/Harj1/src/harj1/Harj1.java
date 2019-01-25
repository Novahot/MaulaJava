/*
 * 7.1.2019 Petteri Linnero / Novahot
 *
 * 
 */
package harj1;

import harj1.Reader;

/**
 *
 * @author petteri.linnero
 */
public class Harj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // esimerkki Lukijan käytöstä:
int luku;
// luetaan luku käyttäjältä
System.out.println("Anna jokin luku");
luku = Reader.readInt();
System.out.println("annoit luvun " + luku);
    }
    
}
