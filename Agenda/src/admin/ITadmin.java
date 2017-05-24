/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.ITmodifUtilisateur.getNomPrenom;
import static gestionagenda.GestionAgenda.rq;
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
        btnOptionsTaches = new javax.swing.JButton();
        btnGenerationDevis = new javax.swing.JButton();
        btnRechercher = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnReservation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paramètres administrateur");

        btnQuitter.setBackground(java.awt.Color.white);
        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        btnOptionsUtilisateurs.setText("Options Utilisateurs");
        btnOptionsUtilisateurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsUtilisateursActionPerformed(evt);
            }
        });

        btnOptionsSalles.setText("Options Salles");
        btnOptionsSalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsSallesActionPerformed(evt);
            }
        });

        btnOptionsTaches.setText("Options Tâches");
        btnOptionsTaches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsTachesActionPerformed(evt);
            }
        });

        btnGenerationDevis.setText("Auto Génération Devis Manuelle");
        btnGenerationDevis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerationDevisActionPerformed(evt);
            }
        });

        btnRechercher.setText("Rechercher des informations");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });

        btnModifier.setText("Modifier des informations");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnReservation.setText("Creer une nouvelle réservation");
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOptionsUtilisateurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOptionsTaches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerationDevis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372))
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
                .addGap(86, 86, 86)
                .addComponent(btnOptionsUtilisateurs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOptionsTaches, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerationDevis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(btnOptionsSalles, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(403, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuitterActionPerformed
/**
 * Cette fonction sert à choisir une option (Ajout, Modification, Suppression) relative à une salle.
 * @param evt 
 */
    private void btnOptionsSallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsSallesActionPerformed
        String[] options = {"Ajouter une salle", "Modifier une salle", "Supprimer une salle"};
        String nom = "";
        nom = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une option","Options salles",JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        if(nom != null){
        switch(nom){
            case "Ajouter une salle":
                ITajout ajout = new ITajout();
                ajout.setLabelTitle(ajout.getLabelTitle()+"d'une salle");
                ajout.setLabelChoice(ajout.getLabelChoice()+"votre salle");
                ajout.setLabelTable("Salle");
                ajout.getLabelTable().setVisible(false);
                ajout.setVisible(true);
                
                break;
                
            case "Modifier une salle":
                String nomsalle;
            try {
                nomsalle = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une salle", "Options salles - Modification -", JOptionPane.QUESTION_MESSAGE, null, rq.getElementByIdFromTable("salles", "Salle", "libelle"), rq.getElementByIdFromTable("salles", "Salle", "libelle")[0]);
                if(nomsalle != null){
                    ITmodif modif = new ITmodif();
                    modif.setTxtTitle("Salle : "+nomsalle);
                    modif.setLbNom(nomsalle);
                    modif.getLbNom().setVisible(false);
                    modif.setLbTable("Salle");
                    modif.getLbTable().setVisible(false);
                    //modif.getBtnCouleur().setBackground(rq.hex2Rgb("Salle", nomsalle));
                    modif.setVisible(true); 
                }
            }catch (SQLException ex){Logger.getLogger(ITadmin.class.getName()).log(Level.SEVERE, null, ex);}
            
                break;
                
            case "Supprimer une salle":
            try {
                nomsalle = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une salle", "Options salles - Suppression -", JOptionPane.QUESTION_MESSAGE, null, rq.getElementByIdFromTable("salles", "Salle", "libelle"), rq.getElementByIdFromTable("salles", "Salle", "libelle")[0]);
                if(nomsalle != null){
                    int choix = (int)JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer : "+nomsalle+"?", "Suppression de la salle : "+nomsalle, JOptionPane.YES_NO_OPTION);
                    if(choix == 0){
                        //Requete DELETE sur la BD
                        rq.delete("salles", "libelle", nomsalle);
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
        }
    }//GEN-LAST:event_btnOptionsSallesActionPerformed
/**
 * Cette fonction sert pour choisir une option (Ajout, Modification, Suppression) relative à un utilisateur.
 * @param evt 
 */
    private void btnOptionsUtilisateursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsUtilisateursActionPerformed
        String[] options = {"Ajouter un utilisateur", "Modifier un utilisateur", "Supprimer un utilisateur"};
        String nom;
        nom = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une option","Options utilisateurs",JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        switch(nom){
            case "Ajouter un utilisateur":
                ITajoutUtilisateur ajout = new ITajoutUtilisateur();
                ajout.setVisible(true);
                
                break;
                
            case "Modifier un utilisateur":
                String nomutilisateur;
            try {
                nomutilisateur = (String)JOptionPane.showInputDialog(null, "Veuillez choisir un utilisateur à modifier", "Options utilisateurs - Modification -", JOptionPane.QUESTION_MESSAGE, null, rq.getElementByIdFromTable("usager", "Usager", "login"), rq.getElementByIdFromTable("usager", "Usager", "nom")[0]);
                if(nomutilisateur != null){
                    ITmodifUtilisateur modif = new ITmodifUtilisateur();
                    modif.setTxtTitle("Utilisateur : "+nomutilisateur);
                    modif.setLbUser(nomutilisateur);
                    modif.getLbUser().setVisible(false);
                    modif.setVisible(true); 
                }
            }catch (SQLException ex){Logger.getLogger(ITadmin.class.getName()).log(Level.SEVERE, null, ex);}
            
                break;
                
            case "Supprimer un utilisateur":
            try {
                nomutilisateur = (String)JOptionPane.showInputDialog(null, "Veuillez choisir un utilisateur à supprimer", "Options utilisateurs - Suppression -", JOptionPane.QUESTION_MESSAGE, null, rq.getElementByIdFromTable("usager", "Usager", "login"), rq.getElementByIdFromTable("usager", "Usager", "nom")[0]);
                if(nomutilisateur != null){
                    int choix = (int)JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer : "+nomutilisateur+"?", "Suppression de l'utilisateur : "+nomutilisateur, JOptionPane.YES_NO_OPTION);
                    if(choix == 0){
                        //Requete DELETE sur la BD
                        //String[] nomUsager = getNomPrenom(nomutilisateur);
                        //String log = rq.getUtilisateur(nomUsager[1], nomUsager[0])[1];
                        rq.delete("usager", "login", nomutilisateur);
                        JOptionPane.showMessageDialog(null, "L'utilisateur '"+nomutilisateur+"' a été supprimé !");
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
    }//GEN-LAST:event_btnOptionsUtilisateursActionPerformed
/**
 * Cette fonction sert pour choisir une option (Ajout, Modification, Suppression) relative à une tache.
 * @param evt 
 */
    private void btnOptionsTachesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsTachesActionPerformed
        String[] options = {"Ajouter une tache", "Modifier une tache", "Supprimer une tache"};
        String nom = "";
        nom = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une option","Options taches",JOptionPane.QUESTION_MESSAGE,null,options,options[0]);;
        if(nom != null){
        switch(nom){
            case "Ajouter une tache":
                ITajout ajout = new ITajout();
                ajout.setLabelTitle(ajout.getLabelTitle()+"d'une tache");
                ajout.setLabelChoice(ajout.getLabelChoice()+"une tache");
                ajout.getPanelSalle().setVisible(false);
                ajout.setLabelTable("Tache");
                ajout.getLabelTable().setVisible(false);
                ajout.setVisible(true);
                
                break;
                
            case "Modifier une tache":
                String nomTache;
            try {
                nomTache = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une tache", "Options taches - Modification -", JOptionPane.QUESTION_MESSAGE, null, rq.getSalleTacheEntiteFormule("tache"), rq.getSalleTacheEntiteFormule("tache")[0]);
                System.out.println("ICIIII : "+nomTache);
                if(nomTache != null){
                    ITmodif modif = new ITmodif();
                    modif.setTxtTitle("tache : "+nomTache);
                    modif.setLbNom(nomTache);
                    modif.getLbNom().setVisible(false);
                    modif.getBtnCouleur().setBackground(rq.hex2Rgb("Tache", nomTache));
                    modif.getBtnSuperficie().setVisible(false);
                    modif.setLbTable("Tache");
                    modif.getLbTable().setVisible(false);
                    modif.setVisible(true); 
                }
            }catch (SQLException ex){Logger.getLogger(ITadmin.class.getName()).log(Level.SEVERE, null, ex);}
            
                break;
                
            case "Supprimer une tache":
            try {
                nomTache = (String)JOptionPane.showInputDialog(null, "Veuillez choisir une tache", "Options taches - Suppression -", JOptionPane.QUESTION_MESSAGE, null, rq.getSalleTacheEntiteFormule("tache"), rq.getSalleTacheEntiteFormule("tache")[0]);
                if(nomTache != null){
                    int choix = (int)JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer : "+nomTache+"?", "Suppression de la tache : "+nomTache, JOptionPane.YES_NO_OPTION);
                    if(choix == 0){
                        //Requete DELETE sur la BD
                        rq.delete("Tache", nomTache);
                        JOptionPane.showMessageDialog(null, "La tache '"+nomTache+"' a été supprimée !");
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
        }
    }//GEN-LAST:event_btnOptionsTachesActionPerformed

    private void btnGenerationDevisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerationDevisActionPerformed
        ITgenerationDevis devis = new ITgenerationDevis();
        devis.setVisible(true);
    }//GEN-LAST:event_btnGenerationDevisActionPerformed

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        ITboutonsRechercher rechercher = new ITboutonsRechercher();
        rechercher.setVisible(true);
    }//GEN-LAST:event_btnRechercherActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        ITboutonsModifier modifier = new ITboutonsModifier();
        modifier.setVisible(true);
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        ITcreerReservation1 nouvelleResa = new ITcreerReservation1();
        nouvelleResa.setVisible(true);
    }//GEN-LAST:event_btnReservationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerationDevis;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnOptionsSalles;
    private javax.swing.JButton btnOptionsTaches;
    private javax.swing.JButton btnOptionsUtilisateurs;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnReservation;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
