/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj3;

/**
 *
 * @author petteri.linnero
 */
public class Harj3 {
    public static void main(String[] args) {
    // esimerkki Lukijan käytöstä:
    double bensa;
    double division;
// luetaan luku käyttäjältä
    System.out.println("Anna summa desimaaleissa kun bensa 3€/litra");
    bensa = Reader.readDouble();
    division = bensa/3.0;
    System.out.println(division);
    }
}
