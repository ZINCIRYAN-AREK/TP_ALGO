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
public class degresradians {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES
        Scanner reader = new Scanner(System.in);
         double angle , resultat;
        
        //CONSTANTES
        System.out.print("Entrez la valeur de l'angle en degres : ");
        angle = reader.nextDouble();
        resultat = Math.PI * angle/180;
        System.out.println("radians : " + resultat);
    
    
    
    }
    
}
