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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int luku1;
        int luku2;
        
        System.out.println("Anna kokonaisluku!");
        luku1 = Reader.readInt();
        luku2 = luku1+10;
        while(luku1<=luku2){
        System.out.println(luku1);
        ++luku1;
        }
    }
    
}
