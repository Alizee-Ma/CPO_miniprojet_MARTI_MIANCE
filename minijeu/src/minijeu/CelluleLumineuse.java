/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minijeu;

/**
 *
 * @author alize
 */
public class CelluleLumineuse {
    // Attribut pour représenter l'état de la cellule (allumée ou éteinte)
    private boolean estAllumee; // Utilisation de 'private' pour assurer l'encapsulation

    // Constructeur pour initialiser l'état de la cellule (par défaut éteinte)
    public CelluleLumineuse() {
        this.estAllumee = false; // La cellule est initialement éteinte
    }

    // Constructeur avec un paramètre pour initialiser l'état de la cellule
    public CelluleLumineuse(boolean etatInitial) {
        this.estAllumee = etatInitial; // Permet de définir un état initial (allumée ou éteinte)
    }

    // Méthode pour inverser l'état de la cellule
    public void inverserEtat() {
        estAllumee = !estAllumee; // Inverse l'état actuel : si allumée, devient éteinte, et vice-versa
    }

    // Méthode pour vérifier si la cellule est allumée
    public boolean estAllumee() {
        return estAllumee; // Retourne true si la cellule est allumée, sinon false
    }

    // Méthode pour représenter l'état de la cellule en tant que texte
    @Override
    public String toString() {
        return estAllumee ? "Allumée" : "Éteinte"; // Renvoie une représentation textuelle de l'état
    }
}
