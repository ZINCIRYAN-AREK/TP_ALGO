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
public abstract class Polymorphisme_Heritage_Figure2D {
    
    private double x ;
    private double y ; 
    
    // clique droit sur les attributs (variables), insert code , constructor, ne cochez pas les cases et entrer. 
    public Polymorphisme_Heritage_Figure2D() {
    }
     // clique droit sur les attributs (variables), insert code , constructor, cochez les cases et entrer.
    public Polymorphisme_Heritage_Figure2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double calcSurface();
}
