/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Bissextile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner reader = new Scanner(System.in);
        int a ;
        //CONSTANTES
        System.out.println("entrez une année");
         a=reader.nextInt();
         if( a%400==0 || a%100!=0 && a%4==0){
         System.out.println ("année bissextile");
         } else {System.out.println("année non bissextile");
         }
         
        
    }
    
}
