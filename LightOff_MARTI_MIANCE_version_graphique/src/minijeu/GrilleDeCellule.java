/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minijeu;

/**
 *
 * @author alize
 */
class GrilleDeCellule {
    // Attribut représentant la grille de cellules lumineuses
    private  CelluleLumineuse[][] matriceCellules;

    // Constructeur pour initialiser la grille de cellules lumineuses
    public GrilleDeCellule(int taille) {
        matriceCellules = new CelluleLumineuse[taille][taille]; // Réservation de la mémoire pour une grille de taille x taille
        for (int i = 0; i < taille; i++) { // Parcourt chaque ligne de la grille
            for (int j = 0; j < taille; j++) { // Parcourt chaque colonne de la ligne
                matriceCellules[i][j] = new CelluleLumineuse(); // Initialisation de chaque cellule à éteinte
            }
        }
    }
    
    public CelluleLumineuse recupCellule(int i, int j) {
        return matriceCellules[i][j];
    }

    // Méthode pour obtenir la taille de la grille
    public int getTaille() {
        return matriceCellules.length; // Retourne la taille de la grille (nombre de lignes ou colonnes)
    }

    // Méthode toString pour représenter la grille sous forme de texte
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Utilisation de StringBuilder pour une construction efficace de la chaîne
        for (int i = 0; i < matriceCellules.length; i++) { // Parcourt chaque ligne de la grille
            for (int j = 0; j < matriceCellules[i].length; j++) { // Parcourt chaque cellule de la ligne
                sb.append(matriceCellules[i][j].toString()).append(" "); // Ajoute l'état de chaque cellule à la chaîne
            }
            sb.append("\n"); // Ajoute un retour à la ligne après chaque ligne de la grille
        }
        return sb.toString(); // Retourne la représentation textuelle complète de la grille
    }

    // Méthode pour activer une ligne de cellules
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < matriceCellules.length) { // Vérifie que l'indice est valide
            for (int j = 0; j < matriceCellules[idLigne].length; j++) {
                matriceCellules[idLigne][j].inverserEtat(); // Inverse l'état de chaque cellule de la ligne spécifiée
            }
        }
    }

    // Méthode pour activer une colonne de cellules
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < matriceCellules[0].length) { // Vérifie que l'indice est valide
            for (int i = 0; i < matriceCellules.length; i++) {
                matriceCellules[i][idColonne].inverserEtat(); // Inverse l'état de chaque cellule de la colonne spécifiée
            }
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
            case 0:
                activerLigneDeCellules((int) (Math.random() * matriceCellules.length));
                break;
            case 1:
                activerColonneDeCellules((int) (Math.random() * matriceCellules.length));
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }

    // Méthode pour mélanger la grille aléatoirement un certain nombre de tours
    public boolean melangerMatriceAleatoirement(int nbTours) {
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire(); // Active aléatoirement une ligne, une colonne ou une diagonale
        }
        return false;
    }
         // Méthode pour vérifier si toutes les cellules sont éteintes
       public boolean toutesCellulesEteintes() {
         for (int i = 0; i < matriceCellules.length; i++) {
            for (int j = 0; j < matriceCellules[i].length; j++) {
                if (matriceCellules[i][j].estAllumee()) {
                    return false; // Si une cellule est allumée, retourne false
                }
            }
        }
                             return true; // Si aucune cellule n'est allumée, retourne true
    }
}


