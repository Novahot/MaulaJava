/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj6;

/**
 *
 * @author petteri.linnero
 */
public class Harj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ika;
        int palkka;
        
        System.out.println("Syötä ikäsi:");
        ika = Reader.readInt();
        
        System.out.println("Syötä kk-palkkasi:");
        palkka = Reader.readInt();
        
        if(ika>40 && palkka>20000){
        System.out.println("Rikas vanhus!");}
        
        else if(ika>40 && palkka<=20000){
        System.out.println("Köyhä Rahjus");}
        
        else{
        System.out.println("Palkalla ei väliä!");}
    }
    
}
