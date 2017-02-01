/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.villalem.admin;

import static gestionagenda.GestionAgenda.rq;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Villalemons
 */
public class ITadmin extends javax.swing.JFrame {

    /**
     * Creates new form ITadmin
     */
    public ITadmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnQuitter = new javax.swing.JButton();
        btnOptionsUtilisateurs = new javax.swing.JButton();
        btnOptionsSalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paramètres administrateur");

        btnQuitter.setBackground(java.awt.Color.green);
        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        btnOptionsUtilisateurs.setText("Options Utilisateurs");

        btnOptionsSalles.setText("Options Salles");
        btnOptionsSalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsSallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addContainerGap(343, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOptionsUtilisateurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnOptionsSalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnOptionsUtilisateurs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(btnOptionsSalles, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnOptionsSallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsSallesActionPerformed
        String[] options = {"Ajouter une salle", "Modifier une salle", "Supprimer une salle"};
        String nom;
        nom = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une option","Options salles",JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        System.out.println(nom);
        switch(nom){
            case "Ajouter une salle":
                ITajout ajout = new ITajout();
                ajout.setLabelTitle(ajout.getLabelTitle()+"d'une salle");
                ajout.setLabelChoice(ajout.getLabelChoice()+"salle");
                ajout.setVisible(true);
                
                break;
                
            case "Modifier une salle":
                String nomsalle;
            try {
                nomsalle = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une salle", "Options salles - Modification -", JOptionPane.QUESTION_MESSAGE, null, rq.getSalle(), rq.getSalle()[0]);
                System.out.println("ICIIII : "+nomsalle);
                if(nomsalle != null){
                    ITmodif modif = new ITmodif();
                    modif.setTxtTitle("Salle : "+nomsalle);
                    modif.setLbNomSalle(nomsalle);
                    modif.getLbNomSalle().setVisible(false);
                    System.out.println("ICII LA COULEUR : "+rq.hex2Rgb(nomsalle));
                    modif.getBtnCouleur().setBackground(rq.hex2Rgb(nomsalle));
                    modif.setVisible(true); 
                }
            }catch (SQLException ex){Logger.getLogger(ITadmin.class.getName()).log(Level.SEVERE, null, ex);}
            
                break;
                
            case "Supprimer une salle":
            try {
                nomsalle = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une salle", "Options salles - Modification -", JOptionPane.QUESTION_MESSAGE, null, rq.getSalle(), rq.getSalle()[0]);
                if(nomsalle != null){
                    int choix = (int)JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer : "+nomsalle+"?", "Suppression de la salle : "+nomsalle, JOptionPane.YES_NO_OPTION);
                    if(choix == 0){
                        //Requete DELETE sur la BD
                        rq.delete("Salle", nomsalle);
                        JOptionPane.showMessageDialog(null, "La salle '"+nomsalle+"' a été supprimée !");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Annulation de la suppression !");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ITadmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
                break;
        }
    }//GEN-LAST:event_btnOptionsSallesActionPerformed

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dimEcran = tk.getScreenSize();
    int larg = dimEcran.width;
    int haut = dimEcran.height;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOptionsSalles;
    private javax.swing.JButton btnOptionsUtilisateurs;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
