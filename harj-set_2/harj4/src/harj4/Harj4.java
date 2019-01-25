/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj4;

/**
 *
 * @author petteri.linnero
 */
public class Harj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int luku1;
        
        luku1=7;
        
        boolean ok = true;
        while(ok){
            if(luku1>=1 && luku1<=5){
                ok = false;
            }     
        else{
          ok = true;
                System.out.println("Anna kokonaisluku");
                luku1 = Reader.readInt();
                }
    }
    }
}
