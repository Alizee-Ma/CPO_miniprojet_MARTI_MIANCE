/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minijeu;

/**
 *
 * @author alize
 */
public class Minijeu {

    /**
     * @param args the command line arguments
     */
         // Méthode main pour tester la classe CelluleLumineuse
    public static void main(String[] args) {
        // Création de cellules lumineuses et test des méthodes
        CelluleLumineuse cellule1 = new CelluleLumineuse(); // Par défaut éteinte
        CelluleLumineuse cellule2 = new CelluleLumineuse(true); // Initialisée à allumée

        // Affichage de l'état initial des cellules
        System.out.println("Cellule 1 - État initial : " + cellule1); // Devrait afficher "Éteinte"
        System.out.println("Cellule 2 - État initial : " + cellule2); // Devrait afficher "Allumée"

        // Inversion de l'état des cellules
        cellule1.inverserEtat();
        cellule2.inverserEtat();

        // Affichage de l'état des cellules après inversion
        System.out.println("Cellule 1 - Après inversion : " + cellule1); // Devrait afficher "Allumée"
        System.out.println("Cellule 2 - Après inversion : " + cellule2); // Devrait afficher "Éteinte"
  
   // Création d'une grille de cellules lumineuses et test d'affichage
        GrilleDeCellule grille = new GrilleDeCellule(3); // Création d'une grille 3x3
        System.out.println(grille); // Affichage de la grille

        // Test des méthodes de GrilleDeCellules
        grille.activerLigneDeCellules(0); // Active la ligne 0
        System.out.println("Grille après activation de la ligne 0 :\n" + grille);

        grille.activerColonneDeCellules(2); // Active la colonne 2
        System.out.println("Grille après activation de la colonne 2 :\n" + grille);

        grille.activerDiagonaleDescendante(); // Active la diagonale descendante
        System.out.println("Grille après activation de la diagonale descendante :\n" + grille);

        grille.activerDiagonaleMontante(); // Active la diagonale montante
        System.out.println("Grille après activation de la diagonale montante :\n" + grille);

        grille.melangerMatriceAleatoirement(5); // Mélange la grille avec 5 tours
        System.out.println("Grille après mélange aléatoire :\n" + grille);
    }
}

