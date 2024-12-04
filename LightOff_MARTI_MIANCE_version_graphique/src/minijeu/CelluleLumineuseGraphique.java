/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minijeu;

import java.awt.Graphics;
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
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        this.setText(cellule_associee.toString());
    }
    
    
    
}
