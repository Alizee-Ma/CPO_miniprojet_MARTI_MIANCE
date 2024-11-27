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
    }
    
}
