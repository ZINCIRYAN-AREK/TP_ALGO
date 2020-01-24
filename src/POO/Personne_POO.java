/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Calendar;

/**
 *
 * @author formation_gep
 */
public class Personne_POO {
    private String nom;
    private int anneeNaissance;
    private int salaire;
    
    public Personne_POO(){}
    
    public Personne_POO(String n, int a, int s){
            nom = n ;
            anneeNaissance = a ; 
            salaire = s ;
    
    // SI LA VARIABLE ET L'ATTRIBUT ONT LE MEME NOM ALORS RAJOUTER " this. " DEVANT L'ATTRBUT POUR LE DETECTER
    //public Personne_POO(String nom, int anneeNaissance, int salaire){
    //       this.nom = nom ;
    //    this.anneeNaissance = anneeNaissance ;
    //    this.salaire = salaire ; }
    }
    public  int calculAge(){
        Calendar c = Calendar.getInstance();
        int YEAR = c.get(Calendar.YEAR);
        return YEAR - anneeNaissance ;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // VARIABLES 
        Personne_POO P1 = new Personne_POO("JOE",1990,12000) ;
        Personne_POO P2 = new Personne_POO("JOE",1990,12000) ;
        if( P1.equals(P2)){
        System.out.print("ce sont les memes");
        }else{
        System.out.print(" Ce ne sont pas les memes");
        }
    }
    
}
