/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static gestionagenda.GestionAgenda.rq;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import reservations.ITagenda;
import reservations.ITagenda;
import usager.Usager;

/**
 *
 * @author Villalemons
 */
public class ITconnexion extends javax.swing.JFrame {

    /**
     * Creates new form ITconnexion
     */
    public ITconnexion() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdentifiant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAuthentification = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        labelErreur = new javax.swing.JLabel();
        txtMdp = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Veuillez vous authentifier :");

        jLabel2.setText("Identifiant : ");

        txtIdentifiant.setText("alexis");
        txtIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentifiantActionPerformed(evt);
            }
        });
        txtIdentifiant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdentifiantKeyReleased(evt);
            }
        });

        jLabel3.setText("Mot de passe :");

        btnAuthentification.setText("S'authentifier");
        btnAuthentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthentificationActionPerformed(evt);
            }
        });

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        labelErreur.setBackground(new java.awt.Color(255, 51, 51));
        labelErreur.setForeground(new java.awt.Color(255, 51, 51));

        txtMdp.setText("alexis");
        txtMdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMdpKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAuthentification)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuitter))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMdp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdentifiant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelErreur)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAuthentification)
                    .addComponent(btnQuitter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(labelErreur)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentifiantActionPerformed

    }//GEN-LAST:event_txtIdentifiantActionPerformed
/**
 * Cette fonction sert à authentifier l'utilisateur qui tente de se connecter.
 * @param evt 
 */
    private void btnAuthentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthentificationActionPerformed
        String login = txtIdentifiant.getText();
        String pwd = txtMdp.getText();
        try {
            if(rq.authentification(login, pwd)){
                //Transmettre les données de la personne connecté
                Usager unUsager = rq.getUsager(login, pwd);
                //Fin transmission
                this.dispose();
                ITagenda it = new ITagenda();
                if(unUsager.getAdmin() != 1){
                    it.getBtnAdmin().setVisible(false);
                }
                it.getTxtWelcome().setText("Vous êtes connecté "+unUsager.getPrenom());
                it.setVisible(true);
            }
            else{
                labelErreur.setText("Erreur lors de l'authentification");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ITconnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAuthentificationActionPerformed
/**
 * Quitte la fenêtre courante.
 * @param evt 
 */
    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitterActionPerformed
/**
 * Comme le bouton d'authentification, cette fonction authentifie la personne en appuyant sur la toucher "ENTER".
 * @param evt 
 */
    private void txtMdpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMdpKeyReleased
        String login = txtIdentifiant.getText();
        String pwd = txtMdp.getText();
        try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                if(rq.authentification(login, pwd)){
                //Transmettre les données de la personne connecté
                Usager unUsager = rq.getUsager(login, pwd);
                System.out.println(unUsager);
                //Fin transmission
                this.dispose();
                System.out.println(System.getProperty("user.name"));
                ITagenda it = new ITagenda();
                if(unUsager.getAdmin() != 1){
                    it.getBtnAdmin().setVisible(false);
                }
                it.getTxtWelcome().setText("Vous êtes connecté "+unUsager.getPrenom());
                it.setVisible(true);
            }
            else{
                labelErreur.setText("Erreur lors de l'authentification");
            }  
            }

        } catch (SQLException ex) {
            Logger.getLogger(ITconnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtMdpKeyReleased
/**
 * Comme le bouton d'authentification, cette fonction authentifie la personne en appuyant sur la toucher "ENTER".
 * @param evt 
 */
    private void txtIdentifiantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentifiantKeyReleased
        String login = txtIdentifiant.getText();
        String pwd = txtMdp.getText();
        try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                if(rq.authentification(login, pwd)){
                //Transmettre les données de la personne connecté
                Usager unUsager = rq.getUsager(login, pwd);
                System.out.println(unUsager);
                //Fin transmission
                this.dispose();
                System.out.println(System.getProperty("user.name"));
                ITagenda it = new ITagenda();
                if(unUsager.getAdmin() != 1){
                    it.getBtnAdmin().setVisible(false);
                }
                it.getTxtWelcome().setText("Vous êtes connecté "+unUsager.getPrenom());
                it.setVisible(true);
            }
            else{
                labelErreur.setText("Erreur lors de l'authentification");
            }  
            }

        } catch (SQLException ex) {
            Logger.getLogger(ITconnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtIdentifiantKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthentification;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelErreur;
    private javax.swing.JTextField txtIdentifiant;
    private javax.swing.JPasswordField txtMdp;
    // End of variables declaration//GEN-END:variables
}
