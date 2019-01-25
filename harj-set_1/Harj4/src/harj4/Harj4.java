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
    public static void main(String[] args) {
        int luku;
        
        System.out.println("Anna luku!");
        luku = Reader.readInt();
        if (luku > 0) {
        System.out.println("Lukusi on positiivinen");}
        else if (luku == 0){
        System.out.println("Lukusi on nolla!");}
        else{
        System.out.println("Lukusi on negatiivinen");
    }
        
    }
    
}
