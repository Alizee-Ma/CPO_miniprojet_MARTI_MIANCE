/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minijeu;

import java.util.Scanner;

/**
 *
 * @author alize
 */
public class Partie {
    private final GrilleDeCellule grille;

    // Constructeur de la classe Partie
    public Partie(GrilleDeCellule grille) {
        this.grille = grille; // Initialise la grille de cellules lumineuses
    }

    // Méthode pour lancer la partie
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu de LightOff !");
        System.out.println("Voici la grille initiale :");
        System.out.println(grille); // Affiche l'état initial de la grille
        
        boolean partieEnCours = true;
        
        while (partieEnCours) {
            if (grille.toutesCellulesEteintes()) {
                System.out.println("Félicitations ! Vous avez éteint toutes les lumières !");
                partieEnCours = false;
                break;
            }

        // Boucle principale de la partie
        while (partieEnCours) {
            System.out.println("Entrez votre coup (ligne/colonne/diagonale descendante/diagonale montante/melanger/quit) :");
            String coup = scanner.nextLine().toLowerCase(); // Lit le coup de l'utilisateur et le convertit en minuscules

            switch (coup) {
                case "ligne" -> {
                    System.out.print("Entrez le numéro de la ligne à activer (0-" + (grille.getTaille() - 1) + ") : ");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne); // Active la ligne spécifiée
                    }
                case "colonne" -> {
                    System.out.print("Entrez le numéro de la colonne à activer (0-" + (grille.getTaille() - 1) + ") : ");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne); // Active la colonne spécifiée
                    }
                case "diagonale descendante" -> grille.activerDiagonaleDescendante(); // Active la diagonale descendante
                case "diagonale montante" -> grille.activerDiagonaleMontante(); // Active la diagonale montante
                case "melanger" -> {
                    System.out.print("Entrez le nombre de tours de mélange : ");
                    int nbTours = scanner.nextInt();
                    grille.melangerMatriceAleatoirement(nbTours); // Mélange la grille aléatoirement pour le nombre de tours spécifié
                    }
                case "quit" -> partieEnCours = false; // Met fin à la partie
                default -> System.out.println("Commande invalide,"+coup+"+ veuillez réessayer."); // Message d'erreur pour une commande invalide
            }

            // Affiche la grille après chaque action
            System.out.println("\nÉtat de la grille après le coup :");
            System.out.println(grille); // Affiche l'état actuel de la grille
          //  scanner.nextLine(); // Consomme le saut de ligne restant
        }

        System.out.println("Merci d'avoir joué !");
        scanner.close(); // Ferme le scanner pour libérer les ressources
    }
    }
}
