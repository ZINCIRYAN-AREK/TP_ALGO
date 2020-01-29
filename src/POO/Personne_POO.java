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

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the anneeNaissance
     */
    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    /**
     * @param anneeNaissance the anneeNaissance to set
     */
    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    private String nom;
    private int anneeNaissance;
    private int salaire;

    public Personne_POO() {
    }

    public Personne_POO(String nom, int anneeNaissance, int salaire) {
        this.nom = nom;
        this.anneeNaissance = anneeNaissance;
        this.salaire = salaire;
    }
    
    /*public Personne_POO(){}
   
    
    
    public Personne_POO(String n, int a, int s){
            nom = n ;
            anneeNaissance = a ; 
            salaire = s ;
    
    // SI LA VARIABLE ET L'ATTRIBUT ONT LE MEME NOM ALORS RAJOUTER " this. " DEVANT L'ATTRBUT POUR LE DETECTER
    //public Personne_POO(String nom, int anneeNaissance, int salaire){
    //       this.nom = nom ;
    //    this.anneeNaissance = anneeNaissance ;
    //    this.salaire = salaire ; }
        
    }/*
    
    /* public String getNom(){
    return nom ; 
    }
     public void setNom(String nom){
    this.nom = nom;
    }
   
    
    public int getSalaire(){
    return salaire ;
    }
    
    public void setSalaire(int salaire){
    this.salaire = salaire ;
    }
    
    public int getanneeNaissance(){
    return anneeNaissance ;
    }
    
    public void setanneeNaissance(int anneeNaissance){
    this.anneeNaissance = anneeNaissance ; 
    }*/
    
    public  int calculAge(){
        Calendar c = Calendar.getInstance();
        int YEAR = c.get(Calendar.YEAR);
        return YEAR - getAnneeNaissance() ;
    }
    
    public void affiche(){
        System.out.printf("%s agé de %d ans\n : " , getNom(), calculAge() );
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
