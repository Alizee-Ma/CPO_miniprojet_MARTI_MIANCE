/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minijeu;

/**
 *
 * @author alize
 */
public class GrilleDeCellule {
    // Attribut représentant la grille de cellules lumineuses
    private final CelluleLumineuse[][] matriceCellules;

    // Constructeur pour initialiser la grille de cellules lumineuses
    public GrilleDeCellule(int taille) {
        matriceCellules = new CelluleLumineuse[taille][taille]; // Réservation de la mémoire pour une grille de taille x taille
        for (int i = 0; i < taille; i++) { // Parcourt chaque ligne de la grille
            for (int j = 0; j < taille; j++) { // Parcourt chaque colonne de la ligne
                matriceCellules[i][j] = new CelluleLumineuse(); // Initialisation de chaque cellule à éteinte
            }
        }
    }

    // Méthode toString pour représenter la grille sous forme de texte
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Utilisation de StringBuilder pour une construction efficace de la chaîne
        for (CelluleLumineuse[] matriceCellule : matriceCellules) {
            // Parcourt chaque ligne de la grille
            for (CelluleLumineuse matriceCellule1 : matriceCellule) {// Parcourt chaque cellule de la ligne
                sb.append(matriceCellule1.toString()).append(" "); // Ajoute l'état de chaque cellule à la chaîne
            }
            sb.append("\n"); // Ajoute un retour à la ligne après chaque ligne de la grille
        }
        return sb.toString(); // Retourne la représentation textuelle complète de la grille
}

 // Méthode pour activer une ligne de cellules
    public void activerLigneDeCellules(int idLigne) {
        for (CelluleLumineuse matriceCellule : matriceCellules[idLigne]) {
            matriceCellule.inverserEtat(); // Inverse l'état de chaque cellule de la ligne spécifiée
        }
    }

    // Méthode pour activer une colonne de cellules
    public void activerColonneDeCellules(int idColonne) {
        for (CelluleLumineuse[] matriceCellule : matriceCellules) {
            matriceCellule[idColonne].inverserEtat(); // Inverse l'état de chaque cellule de la colonne spécifiée
        }
    }

    // Méthode pour activer la diagonale descendante (de haut gauche à bas droit)
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][i].inverserEtat(); // Inverse l'état des cellules sur la diagonale descendante
        }
    }
    // Méthode pour activer la diagonale montante (de bas gauche à haut droit)
    public void activerDiagonaleMontante() {
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][matriceCellules.length - 1 - i].inverserEtat(); // Inverse l'état des cellules sur la diagonale montante
        }
    }

    // Méthode pour activer aléatoirement une ligne, une colonne ou une diagonale
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int choix = (int) (Math.random() * 4); // Génère un nombre aléatoire entre 0 et 3
        switch (choix) {
            case 0 -> activerLigneDeCellules((int) (Math.random() * matriceCellules.length));
            case 1 -> activerColonneDeCellules((int) (Math.random() * matriceCellules.length));
            case 2 -> activerDiagonaleDescendante();
            case 3 -> activerDiagonaleMontante();
        }
    }
 // Méthode pour mélanger la grille aléatoirement un certain nombre de tours
    public void melangerMatriceAleatoirement(int nbTours) {
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire(); // Active aléatoirement une ligne, une colonne ou une diagonale
        }
    }
}