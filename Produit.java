/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author elfar
 */
public class Produit {
    // Déclaration des attributs
    private int id;
    private String nom;
    private int prix;
    private int quantite;
    
    //Constructeur pour initialiser les attributs
    public Produit(int id, String nom, int prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }
    
    // Création du getter pour id, nom, prix,quantite
    public int getId() {
        return id;
    }
 
    public String getNom() {
        return nom;
    }
 
    public int getPrix() {
        return prix;
    }
    
    public int getQuantite() {
        return quantite;
    }


    // Création du setter pour id, nom, prix,quantite
    public void setId(int id) {
        this.id = id;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    // Détail Produit
    public void afficherDetails() {
        System.out.println("Id : " + id + " Nom : " + nom + " Prix : " + prix + " Quantite : " + quantite );
    }


}
