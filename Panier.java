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
public class Panier {
    // Liste de produits
    private ArrayList<Produit> produits;

    //Création du panizr
    public Panier() {
        produits = new ArrayList<>();
    }

    // Methode ajout produit dans le panier
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Supprime un produit dans le panier
    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    //Affiche les produits du panier
    public void afficherPanier() {
        for (Produit produit : produits) {
            produit.afficherDetails();
        }
    }

    //Calcul total panier
    public int calculerTotal() {
        int total = 0;

        for (Produit produit : produits) {
            total = total + produit.getPrix();
        }

        return total;
    }

    // Récupération liste des produits
    public ArrayList<Produit> getProduits() {
        return produits;
    }
}
 
