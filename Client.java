/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author elfar
 */
public class Client {
    // Déclaration des attributs
    private int id;
    private String nom;
    private String email;
    
    //Constructeur pour initialiser les attributs
    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    
    // Création du getter pour id, nom, email
    public int getId() {
        return id;
    }
 
    public String getNom() {
        return nom;
    }
 
    public String getEmail() {
        return email;
    }
    

    // Création du setter pour id, nom, email
    public void setId(int id) {
        this.id = id;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    
    //Detail client
    public void afficherDetails() {
        System.out.println("Id : " + id + " Nom : " + nom + " Email : " + email );
    }
}
