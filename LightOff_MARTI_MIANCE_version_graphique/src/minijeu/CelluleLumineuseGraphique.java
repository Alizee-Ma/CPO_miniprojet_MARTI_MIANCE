/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minijeu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author benoit
 */
public class CelluleLumineuseGraphique extends JButton {
    int x;
    int y;
    CelluleLumineuse cellule_associee;

    public CelluleLumineuseGraphique(int x, int y, CelluleLumineuse cellule_associee) {
        this.x = x;
        this.y = y;
        this.cellule_associee = cellule_associee;
         this.setPreferredSize(new Dimension(50, 50)); // Définir une taille préférée pour chaque cellule
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Ajouter une bordure pour l'espace en
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Appel de la méthode de la superclasse pour préserver les fonctionnalités de base
        
        // Définir la couleur en fonction de l'état de la cellule associée
        if (cellule_associee.estAllumee()) {
            g.setColor(Color.YELLOW); // Couleur jaune si la cellule est allumée
        } else {
            g.setColor(Color.GRAY); // Couleur grise si la cellule est éteinte
        }
        
        // Remplir le bouton avec la couleur définie
        g.fillRect(0, 0, getWidth(), getHeight());
    }    
    
}
