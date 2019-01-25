/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj5;

/**
 *
 * @author petteri.linnero
 */
public class Harj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int luku1;
        int luku2;
        int luku3;
        
        luku2 = 0;
        boolean magic = true;
        while(magic){
        System.out.println("Anna luku");
        luku1 = Reader.readInt();
        
        if(luku1 == -1){
            magic = false;
        }
        else {
            luku2 = luku2 + luku1;
        }
        }
        System.out.println(luku2);
    }
    
}
