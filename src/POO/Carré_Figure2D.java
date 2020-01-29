/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author formation_gep
 */
public class Carré_Figure2D extends Polymorphisme_Heritage_Figure2D {
    
   
    private double cote ; 

    public Carré_Figure2D(double cote , double x , double y) {
        super( x , y );
        this.cote = cote;
    }

    public Carré_Figure2D() {
    }
    
    @Override
   public  double calcSurface(){
   return cote * cote  ;
   }
   
}
