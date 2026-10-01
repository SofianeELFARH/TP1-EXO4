/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author elfar
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Création du scanner
        Scanner sc = new Scanner(System.in);
        
        //Création du client
        Client client = new Client(1, "Elfarh", "soso@gmail.com");

        //Création des produits
        Produit produit1 = new Produit(1, "Basket", 400, 2);
        Produit produit2 = new Produit(2, "jouet", 300, 3);
        Produit produit3 = new Produit(3, "Chaussettes", 20, 2);
        
        //Création du magasin
        Magasin magasin = new Magasin();

        //ajout produits dans le magasin
        magasin.ajouterProduit(produit1);
        magasin.ajouterProduit(produit2);
        magasin.ajouterProduit(produit3);

        //panier
        Panier panier = new Panier();

        int choix = 0;

        // Boucle pour que le client choisisse l'action qu'il souhaite
        while (choix != 5) {

            System.out.println("--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");

            System.out.println("Entrez votre choix :");
            choix = sc.nextInt();
            sc.nextLine();

            if (choix == 1) {
                magasin.afficherProduitsDisponibles();
            }

            else if (choix == 2) {
                System.out.println("Entrez le nom du produit :");
                String nom = sc.nextLine();

                Produit produit = magasin.trouverProduitParNom(nom);

                if (produit != null) {
                    panier.ajouterProduit(produit);
                    System.out.println("Produit ajouté au panier.");
                }
                else {
                    System.out.println("Produit introuvable.");
                }
            }

            else if (choix == 3) {
                panier.afficherPanier();
                System.out.println("Total : " + panier.calculerTotal());
            }

            else if (choix == 4) {
                Commande commande = new Commande(1, client, panier.getProduits());
                commande.afficherDetailsCommande();
            }

            else if (choix == 5) {
                System.out.println("Au revoir.");
            }

            else {
                System.out.println("Erreur");
            }
        }
    }
}