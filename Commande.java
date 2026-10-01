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
public class Commande {

    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private int total;

    //Création commande
    public Commande(int idCommande, Client client, ArrayList<Produit> produitsCommandes) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = produitsCommandes;
        total = 0;

        //Calcul du total de la commande
        for (Produit produit : produitsCommandes) {
            total = total + produit.getPrix();
        }
    }

    //Détail commande
    public void afficherDetailsCommande() {
        System.out.println("Id commande : " + idCommande);
        System.out.println("Client : " + client.getNom());
        System.out.println("Produits commande :");

        // Affichage produits 
        for (Produit produit : produitsCommandes) {
            produit.afficherDetails();
        }

        // Affichage total
        System.out.println("Total : " + total);
    }
}
