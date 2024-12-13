/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minijeu;

/**
 *
 * @author alize
 */
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    GrilleDeCellule grille;
    int nbCoups;

    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        this.grille = new GrilleDeCellule(nbLignes);
        initialiserPartie();
        
     messageVictoire.setVisible(false); // Masqué au début
    
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleLumineuseGraphique bouton_cellule = new CelluleLumineuseGraphique(i,j, this.grille.recupCellule(i, j)); // création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
    }

    public void initialiserPartie() {
        grille.toutesCellulesEteintes();
        grille.melangerMatriceAleatoirement(10);
    }
       
  
// Méthode pour vérifier si la grille est éteinte et gérer la fin de partie
private void verifierFinPartie() {
    if (grille.toutesCellulesEteintes()) {
        messageVictoire.setText("Vous avez gagné!");
        messageVictoire.setVisible(true);
        desactiverBoutons(); // Désactiver tous les boutons
    }
    else {
        messageVictoire.setText(""); // Efface le message si la partie continue
    }
}

// Méthode pour désactiver les boutons une fois la partie terminée
private void desactiverBoutons() {
    btnLigne0.setEnabled(false);
    btnLigne1.setEnabled(false);
    btnLigne2.setEnabled(false);
    btnLigne3.setEnabled(false);
    btnLigne4.setEnabled(false);
    btnLigne5.setEnabled(false);
    btnLigne6.setEnabled(false);
    btnLigne7.setEnabled(false);
    btnLigne8.setEnabled(false);
    btnLigne9.setEnabled(false);
    btnColonne0.setEnabled(false);
    btnColonne1.setEnabled(false);
    btnColonne2.setEnabled(false);
    btnColonne3.setEnabled(false);
    btnColonne4.setEnabled(false);
    btnColonne5.setEnabled(false);
    btnColonne6.setEnabled(false);
    btnColonne7.setEnabled(false);
    btnColonne8.setEnabled(false);
    btnColonne9.setEnabled(false);
    btnDiagDescendante.setEnabled(false);
    btnDiagMontante.setEnabled(false);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        btnLigne0 = new javax.swing.JButton();
        btnLigne1 = new javax.swing.JButton();
        btnLigne2 = new javax.swing.JButton();
        btnLigne3 = new javax.swing.JButton();
        btnLigne4 = new javax.swing.JButton();
        btnLigne5 = new javax.swing.JButton();
        btnLigne6 = new javax.swing.JButton();
        btnLigne7 = new javax.swing.JButton();
        btnLigne8 = new javax.swing.JButton();
        btnLigne9 = new javax.swing.JButton();
        btnColonne0 = new javax.swing.JButton();
        btnColonne1 = new javax.swing.JButton();
        btnColonne2 = new javax.swing.JButton();
        btnColonne3 = new javax.swing.JButton();
        btnColonne4 = new javax.swing.JButton();
        btnColonne5 = new javax.swing.JButton();
        btnColonne6 = new javax.swing.JButton();
        btnColonne7 = new javax.swing.JButton();
        btnColonne8 = new javax.swing.JButton();
        btnColonne9 = new javax.swing.JButton();
        btnDiagDescendante = new javax.swing.JButton();
        btnDiagMontante = new javax.swing.JButton();
        messageVictoire = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 750, 430));

        btnLigne0.setText("L0");
        btnLigne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, -1));

        btnLigne1.setText("L1");
        btnLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, -1));

        btnLigne2.setText("L2");
        btnLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, -1));

        btnLigne3.setText("L3");
        btnLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, -1));

        btnLigne4.setText("L4");
        btnLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, -1));

        btnLigne5.setText("L5");
        btnLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, -1));

        btnLigne6.setText("L6");
        btnLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, -1));

        btnLigne7.setText("L7");
        btnLigne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 50, -1));

        btnLigne8.setText("L8");
        btnLigne8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 50, -1));

        btnLigne9.setText("L9");
        btnLigne9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 50, -1));

        btnColonne0.setText("C0");
        btnColonne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, -1));

        btnColonne1.setText("C1");
        btnColonne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 50, -1));

        btnColonne2.setText("C2");
        btnColonne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, -1));

        btnColonne3.setText("C3");
        btnColonne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, -1));

        btnColonne4.setText("C4");
        btnColonne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 50, -1));

        btnColonne5.setText("C5");
        btnColonne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 50, -1));

        btnColonne6.setText("C6");
        btnColonne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 50, -1));

        btnColonne7.setText("C7");
        btnColonne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 50, -1));

        btnColonne8.setText("C8");
        btnColonne8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 50, -1));

        btnColonne9.setText("C9");
        btnColonne9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 50, -1));

        btnDiagDescendante.setText("DD");
        btnDiagDescendante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagDescendanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagDescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, -1));

        btnDiagMontante.setText("DM");
        btnDiagMontante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagMontanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagMontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 50, -1));

        messageVictoire.setText("jjj");
        messageVictoire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageVictoireActionPerformed(evt);
            }
        });
        getContentPane().add(messageVictoire, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne0ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(0);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne0ActionPerformed

    private void btnLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne1ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(1);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne1ActionPerformed

    private void btnLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(3);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne3ActionPerformed

    private void btnLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne2ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(2);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne2ActionPerformed

    private void btnLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(4);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne4ActionPerformed

    private void btnLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(5);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne5ActionPerformed

    private void btnLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(6);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne6ActionPerformed

    private void btnLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(7);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne7ActionPerformed

    private void btnLigne8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne8ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(8);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne8ActionPerformed

    private void btnLigne9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne9ActionPerformed
        // TODO add your handling code here:
        this.grille.activerLigneDeCellules(9);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnLigne9ActionPerformed

    private void btnColonne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne0ActionPerformed
        this.grille.activerColonneDeCellules(0);
        repaint(); // TODO add your handling code here:
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne0ActionPerformed

    private void btnColonne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne1ActionPerformed
        // TODO add your handling code here:
           this.grille.activerColonneDeCellules(1);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne1ActionPerformed

    private void btnColonne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne2ActionPerformed
        // TODO add your handling code here:
         this.grille.activerColonneDeCellules(2);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne2ActionPerformed

    private void btnColonne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne3ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(3);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne3ActionPerformed

    private void btnColonne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne4ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(4);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne4ActionPerformed

    private void btnColonne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne5ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(5);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne5ActionPerformed

    private void btnColonne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne6ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(6);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne6ActionPerformed

    private void btnColonne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne7ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(7);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne7ActionPerformed

    private void btnColonne8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne8ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(8);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne8ActionPerformed

    private void btnColonne9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne9ActionPerformed
        // TODO add your handling code here:
        this.grille.activerColonneDeCellules(9);
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnColonne9ActionPerformed

    private void btnDiagDescendanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagDescendanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnDiagDescendanteActionPerformed

    private void btnDiagMontanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagMontanteActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_btnDiagMontanteActionPerformed

    private void messageVictoireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageVictoireActionPerformed
        // TODO add your handling code here:
         this.verifierFinPartie();
        repaint();
        verifierFinPartie();
    }//GEN-LAST:event_messageVictoireActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnColonne0;
    private javax.swing.JButton btnColonne1;
    private javax.swing.JButton btnColonne2;
    private javax.swing.JButton btnColonne3;
    private javax.swing.JButton btnColonne4;
    private javax.swing.JButton btnColonne5;
    private javax.swing.JButton btnColonne6;
    private javax.swing.JButton btnColonne7;
    private javax.swing.JButton btnColonne8;
    private javax.swing.JButton btnColonne9;
    private javax.swing.JButton btnDiagDescendante;
    private javax.swing.JButton btnDiagMontante;
    private javax.swing.JButton btnLigne0;
    private javax.swing.JButton btnLigne1;
    private javax.swing.JButton btnLigne2;
    private javax.swing.JButton btnLigne3;
    private javax.swing.JButton btnLigne4;
    private javax.swing.JButton btnLigne5;
    private javax.swing.JButton btnLigne6;
    private javax.swing.JButton btnLigne7;
    private javax.swing.JButton btnLigne8;
    private javax.swing.JButton btnLigne9;
    private javax.swing.JTextField messageVictoire;
    // End of variables declaration//GEN-END:variables
}
