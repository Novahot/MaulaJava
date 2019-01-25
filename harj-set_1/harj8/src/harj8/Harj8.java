/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj8;

/**
 *
 * @author petteri.linnero
 */
public class Harj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pisteet;
        int max;
        int min;
        
        min = 0;
        max = 40;
        System.out.println("Syötä pisteesi!");
        pisteet = Reader.readInt();
        
        if(pisteet < 10 && pisteet  > min){
        System.out.println("Arvosanasi on: 0");
        }
        else if(pisteet > 10 && pisteet <= 20){
        System.out.println("Arvosanasi on: 1");
        }
        else if(pisteet >= 21 && pisteet <= 30){
        System.out.println("Arvosanasi on: 2");
        }
        else if(pisteet >= 31 && pisteet < max){
        System.out.println("Arvosanasi on: 3");
        }
        else{
        System.out.println("Lukusi on virheellinen");
        }
    }
    
}
