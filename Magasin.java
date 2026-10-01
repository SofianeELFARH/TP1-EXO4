/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.ArrayList;
/**
 *
 * @author elfar
 */
public class Magasin {

    // liste des produits
    private ArrayList<Produit> produits;

    // création du magasin
    public Magasin() {
        produits = new ArrayList<>();
    }

    // ajout produit dans le magasin
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // affichage produit dispos
    public void afficherProduitsDisponibles() {
        for (Produit produit : produits) {
            if (produit.getQuantite() > 0) {
                produit.afficherDetails();
            }
        }
    }

    // Recherche produit par nom
    public Produit trouverProduitParNom(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom().equals(nom)) {
                return produit;
            }
        }
        return null;
    }
}
