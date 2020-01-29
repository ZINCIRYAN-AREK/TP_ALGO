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
public class Cercle_Heritage_Figure2D_rayon extends Polymorphisme_Heritage_Figure2D{
   
    private double rayon;

    public Cercle_Heritage_Figure2D_rayon() {
    }

    public Cercle_Heritage_Figure2D_rayon(double rayon, double x , double y) {
        super (x , y );
        this.rayon = rayon;
    }
    @Override
    public double calcSurface(){
    return Math.PI*(rayon*rayon);
    }
}
