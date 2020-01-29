/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public abstract class TEST_ extends Polymorphisme_Heritage_Figure2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*Personne_POO p1= new Personne_POO("MARTIN",1980,10000);
        p1.setNom("DURAND");
        p1.affiche();
        
        Personne_POO p2 = new Personne_POO ();
        p2.setNom("LEPIC");
        p2.setAnneeNaissance(2001);
        p2.setSalaire(12000);
        p2.affiche();*/
       Polymorphisme_Heritage_Figure2D[] tab = {
       new Carré_Figure2D(0,0,10),
       new Cercle_Heritage_Figure2D_rayon(15,10,10)
       };
       double surfTotale = 0 ; 
       for ( int i =0 ; i< tab.length ; i++){
       surfTotale += tab[i].calcSurface();
       }
           
        System.out.printf("Surface total est de :ù5;2f\n " , surfTotale  );
       
        
        // OU ALORS 
        
        /*Figure2D[] toto = new Polymorphisme_Heritage_Figure2D [2];
     toto[0]= new Carre_Figure2D (0, 0, 10);
     toto[1]= new Cercle_Heritage_Figure2D_rayon (15, 10, 10);
     double surfTotale=0;
       for (int i=0 ; i<toto.length ; i++) {
      surfTotale = surfTotale + toto[i].calcSurface();
              }
     System.out.printf ("Surface totale : %5.2f\n", surfTotale);
}*/
       
    }
    
}
