/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj2;

/**
 *
 * @author petteri.linnero
 */
public class Harj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int luku1;
        int luku2;
        
        luku1 = 1;
        System.out.print("Syötä luku!");
        luku2 = Reader.readInt();
        while(luku1<=luku2){
        System.out.println("Hejsan! " +luku1);
                ++luku1;
        }
    }
    
}
