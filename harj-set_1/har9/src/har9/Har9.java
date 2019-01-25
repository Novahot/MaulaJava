/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package har9;

/**
 *
 * @author petteri.linnero
 */
public class Har9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int luku1;
        int luku2;
        int toimi;
        double endpoint;
        
        System.out.println("Anna luku 1");
        luku1 = Reader.readInt();
        System.out.println("Anna luku 2");
        luku2 = Reader.readInt();
        System.out.println("Anna laskutoimitus:");
        System.out.println("Plus - Syötä 1");
        System.out.println("Minus - Syötä 2");
        System.out.println("Jako - Syötä 3");
        System.out.println("Kerto - Syötä 4");
        toimi = Reader.readInt();
        
        if(toimi == 1){
        endpoint = luku1 + luku2;
        System.out.println("Lukusi on:" + endpoint);
        }
        else if(toimi == 2){
       endpoint = luku1 - luku2;
       System.out.println("Lukusi on:" + endpoint);
    }
        else if(toimi == 3){
        endpoint = luku1 / luku2;
        System.out.println("Lukusi on:" + endpoint);
        }
        else if(toimi == 4){
        endpoint = luku1 * luku2;
        System.out.println("Lukusi on:" + endpoint);
        }
        else{
        System.out.println("Laskutoimitus on virheellisesti ilmoitettu!");
        }
    }
    
}
