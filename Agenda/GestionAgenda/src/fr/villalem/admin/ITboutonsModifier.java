/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.villalem.admin;

import static gestionagenda.GestionAgenda.rq;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ITboutonsModifier extends javax.swing.JFrame {

    /**
     * Creates new form ITboutonsRechercher
     */
    public ITboutonsModifier() {
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
        btnClient = new javax.swing.JButton();
        btnDevis = new javax.swing.JButton();
        btnFacture = new javax.swing.JButton();
        btnReservation = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Que voulez vous modifier?");

        btnClient.setText("Client");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnDevis.setText("Devis");
        btnDevis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevisActionPerformed(evt);
            }
        });

        btnFacture.setText("Facture");
        btnFacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactureActionPerformed(evt);
            }
        });

        btnReservation.setText("Reservation");
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDevis, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnQuitter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDevis, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
       
    try {
            String[] clients = rq.getClients();
            String[] noms = rq.getnomsClients();
            String[] prenoms = rq.getprenomsClients();
            String client = "";
            client = (String)JOptionPane.showInputDialog(null, "Veuillez sélectionner un client","Rechercher un client",JOptionPane.QUESTION_MESSAGE, null,clients,clients[0]);
            if (client!=null){
                int longueur = noms.length;
                String[] client2 = new String[longueur];
                String leNom = "";
                String lePrenom = "";
                for(int i = 0; i<longueur; i++){
                    client2[i] = prenoms[i]+" "+noms[i];
                    if(client2[i] == null ? client == null : client2[i].equals(client)){
                        leNom = noms[i];
                        lePrenom = prenoms[i];
                    }
                }
                int idClient = rq.getIdClient(leNom, lePrenom);
                String[] dates = rq.getDatesReservations(idClient);
                String date = null;
                if (!"".equals(dates[0])){
                    date = (String)JOptionPane.showInputDialog(null, "Veuillez sélectionner une date de début de réservation","Rechercher une date",JOptionPane.QUESTION_MESSAGE, null,dates,dates[0]);
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Il n'y a pas de reservation pour ce client", "information",JOptionPane.INFORMATION_MESSAGE);
                }          
                if (date!=null){
                    int idReservation = rq.getIdReservation(idClient, date);
                    String infos[] = rq.getInfosReservation(idReservation);
                    System.out.println(infos);
                    String disposition = "";
                    String salle = infos[9];
                    String salles[] = {"studio", "cabane", "bureau", "atelier"};
                    String dispositions[] = {"ecole", "en U", "theatre", "salle vide", "central", "ilots"};
                    String[] lesChangements ={"validite de la réservation(option)", "date de début", "date de fin", "heure de début", "heure de fin","nombre de personnes", "nombre d'heures", "formule", "client", "modifier un service", "ajouter un service","modifier une option", "ajouter une option", "modifier une salle", "ajouter une salle", "disposition"};
                    String changement = "";
                    if (!"".equals(dates[0])){
                        changement = (String)JOptionPane.showInputDialog(null, "Veuillez sélectionner ce que vous voulez changer dans la réservation","Information à modifier",JOptionPane.QUESTION_MESSAGE, null,lesChangements,lesChangements[0]);
                        if (changement!=null){
                            if("validite de la réservation(option)".equals(changement)){
                                String validite[] = {"valider reservation", "invalider reservation"};
                                String validiteActuelle = rq.getValidite(idReservation);
                                String valide = (String)JOptionPane.showInputDialog(null, "Modifier la validite actuelle : "+validiteActuelle,"Validite",JOptionPane.QUESTION_MESSAGE, null,validite,validite[0]);
                                if (valide!=null){
                                    if ("valider reservation".equals(valide)){
                                        int valider = 1;
                                        rq.MAJvalide(valider, idReservation);
                                        JOptionPane.showMessageDialog(null, "La reservation a bien été validée ! ", "Information", JOptionPane.INFORMATION_MESSAGE); 
                                    }
                                    else {
                                        int valider = 0;
                                        rq.MAJvalide(valider, idReservation);
                                        JOptionPane.showMessageDialog(null, "La reservation a bien été invalidée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            }
                            if("date de début".equals(changement)){
                                String dateActuelle = infos[0];
                                String dateDe = (String)JOptionPane.showInputDialog(null, "Modifier la "+dateActuelle,"date de debut",JOptionPane.QUESTION_MESSAGE);
                                if (dateDe!=null){
                                    rq.MAJdateD(dateDe, idReservation);
                                    JOptionPane.showMessageDialog(null, "La date de début a bien été modifiée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("date de fin".equals(changement)){
                                String dateActuelle = infos[1];
                                String dateFi = (String)JOptionPane.showInputDialog(null, "Modifier la "+dateActuelle,"date de fin",JOptionPane.QUESTION_MESSAGE);
                                if (dateFi!=null){
                                    rq.MAJdateF(dateFi, idReservation);
                                    JOptionPane.showMessageDialog(null, "La date de fin a bien été modifiée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("heure de début".equals(changement)){
                                String heureActuelle = infos[2];
                                String heureDe = (String)JOptionPane.showInputDialog(null, "Modifier l'"+heureActuelle,"heure de debut",JOptionPane.QUESTION_MESSAGE);
                                if (heureDe!=null){
                                    rq.MAJheureD(heureDe, idReservation);
                                    JOptionPane.showMessageDialog(null, "L'heure de début a bien été modifiée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("heure de fin".equals(changement)){
                                String heureActuelle = infos[3];
                                String heureFi = (String)JOptionPane.showInputDialog(null, "Modifier l'"+heureActuelle,"heure de fin",JOptionPane.QUESTION_MESSAGE);
                                if (heureFi!=null){
                                    rq.MAJheureF(heureFi, idReservation);
                                    JOptionPane.showMessageDialog(null, "L'heure de fin a bien été modifiée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("nombre de personnes".equals(changement)){
                                String nbPActuel = infos[7];
                                String nbP = (String)JOptionPane.showInputDialog(null, "Modifier le "+nbPActuel,"nombre de personnes",JOptionPane.QUESTION_MESSAGE);
                                if (nbP!=null){
                                    int nb = Integer.parseInt(nbP, 10);
                                    rq.MAJnbPersonnes(nb, idReservation);
                                    JOptionPane.showMessageDialog(null, "Le nombre de personnes a bien été modifié ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("nombre d'heures".equals(changement)){
                                String nbHActuel = infos[8];
                                String nbH = (String)JOptionPane.showInputDialog(null, "Modifier le "+nbHActuel,"nombre d'heures",JOptionPane.QUESTION_MESSAGE);
                                if (nbH!=null){
                                    int nb = Integer.parseInt(nbH, 10);
                                    rq.MAJnbHeures(nb, idReservation);
                                    JOptionPane.showMessageDialog(null, "Le nombre d'heures a bien été modifié ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("modifier un service".equals(changement)){
                                String services[] = rq.getServices();
                                String serviceActuel = infos[4];
                                if (!"Service(s) : aucun service".equals(serviceActuel)){
                                    String service = (String)JOptionPane.showInputDialog(null, "Modifier le(s) "+serviceActuel,"modifier Service",JOptionPane.QUESTION_MESSAGE, null, services, services[0]);
                                    if (service!=null){
                                        rq.MAJchoix(idReservation, service);
                                        JOptionPane.showMessageDialog(null, "Le service a bien été modifié ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                else{
                                   JOptionPane.showMessageDialog(null, "Il n'y a aucun service à modifier", "modifier service",JOptionPane.INFORMATION_MESSAGE); 
                                }
                            }
                            if("ajouter un service".equals(changement)){
                                String services[] = rq.getServices();
                                String choix = (String)JOptionPane.showInputDialog(null, "quel service voulez vous ajouter?","ajouter service",JOptionPane.QUESTION_MESSAGE, null, services, services[0]);
                                if (choix!=null){
                                    rq.ajoutChoix(idReservation, choix);
                                    JOptionPane.showMessageDialog(null, "Le service a bien été ajouté ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("modifier une option".equals(changement)){
                                String options[] = rq.getOptions();
                                String optionActuelle = infos[5];
                                if (!"aucun service".equals(optionActuelle)){
                                    String option = (String)JOptionPane.showInputDialog(null, "Modifier l'"+optionActuelle,"modifier une option",JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                                    if (option!=null){
                                        rq.MAJchoix(idReservation, option);
                                        JOptionPane.showMessageDialog(null, "L'option a bien été modifié ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                else{
                                    
                                }      
                            }
                            if("ajouter une option".equals(changement)){
                                String options[] = rq.getOptions();
                                String choix = (String)JOptionPane.showInputDialog(null, "quel service voulez vous ajouter?","ajouter service",JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                                if (choix!=null){
                                    rq.ajoutChoix(idReservation, choix);   
                                    JOptionPane.showMessageDialog(null, "L'option a bien été ajouté ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                           
                            if("modifier une salle".equals(changement)){
                                String[] sallesActuelles = rq.getSalles(idReservation);
                                salle = (String)JOptionPane.showInputDialog(null, "Quelle salle voulez vous modifier?", "modifier une salle",JOptionPane.QUESTION_MESSAGE, null, sallesActuelles, sallesActuelles[0]);
                                disposition = rq.getDisposition(idReservation, salle);
                                if (salle!=null){
                                    salle = (String)JOptionPane.showInputDialog(null, "Par quelle salle voulez vous la modifier?","modifier une salle",JOptionPane.QUESTION_MESSAGE, null, salles, salles[0]);
                                }
                                if (salle!=null){
                                    rq.MAJsalle(salle, disposition, idReservation);
                                    JOptionPane.showMessageDialog(null, "La salle a bien été modifiée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("ajouter une salle".equals(changement)){
                                salle = (String)JOptionPane.showInputDialog(null, "quelle salle voulez vous ajouter?","ajouter salle",JOptionPane.QUESTION_MESSAGE, null, salles, salles[0]);
                                disposition = (String)JOptionPane.showInputDialog(null, "A quelle disposition voulez vous l'associer?","ajouter salle",JOptionPane.QUESTION_MESSAGE, null, dispositions, dispositions[0]);
                                if (salle!=null && disposition!=null){
                                    rq.ajoutSalle(idReservation, salle, disposition);  
                                    JOptionPane.showMessageDialog(null, "La salle a bien été ajoutée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("client".equals(changement)){
                                String clientActuel = infos[11];
                                String[] lesClients = rq.getClients();
                                String[] nom = rq.getnomsClients();
                                String[] prenom = rq.getprenomsClients();
                                String leClient = (String)JOptionPane.showInputDialog(null, "Modifier le "+clientActuel,"modifier une option",JOptionPane.QUESTION_MESSAGE, null, lesClients,lesClients[0]);
                                if (leClient!=null){
                                    int lg = lesClients.length;
                                    String[] leClient2 = new String[lg];
                                    String nom2 = "";
                                    String prenom2 = "";
                                    for(int i = 0; i<longueur; i++){
                                        leClient2[i] = prenom[i]+" "+nom[i];
                                        if(client2[i] == null ? client == null : client2[i].equals(client)){
                                            nom2 = noms[i];
                                            prenom2 = prenoms[i];
                                        }
                                    }
                                    rq.MAJclient(idReservation, prenom2, nom2);
                                    JOptionPane.showMessageDialog(null, "Le client a bien été modifié ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            if("disposition".equals(changement)){
                                String lesSalles[] = rq.getSalles(idReservation);
                                salle = (String)JOptionPane.showInputDialog(null, "de quelle salle voulez vous modifier la disposition","salle de la disposition",JOptionPane.QUESTION_MESSAGE, null, lesSalles, lesSalles[0]);
                                if(salle!=null){
                                    String dispositionActuelle = rq.getDisposition(idReservation, salle);
                                    disposition = (String)JOptionPane.showInputDialog(null, "Modifier la disposition : "+dispositionActuelle,"modifier une disposition",JOptionPane.QUESTION_MESSAGE, null, dispositions, dispositions[0]);
                                    if (disposition!=null){
                                        rq.MAJdisposition(salle, disposition, idReservation);
                                        JOptionPane.showMessageDialog(null, "La disposition a bien été modifiée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                
                                    }
                                }
                            }
                            if("formule".equals(changement)){
                                String formules[] = {"heure", "demi-journée", "journée"};
                                String formuleActuelle = infos[6];
                                String formule = (String)JOptionPane.showInputDialog(null, "Modifier la "+formuleActuelle,"modifier une formule",JOptionPane.QUESTION_MESSAGE, null, formules, formules[0]);
                                if (formule!=null){
                                    rq.MAJformule(idReservation, formule);
                                    JOptionPane.showMessageDialog(null, "La formule a bien été modifiée ! ", "Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }

                            
                        } 
                        else{
                            JOptionPane.showMessageDialog(null, "Il n'y a pas de reservation pour ce client", "information",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ITboutonsRechercher.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        

        
        
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        
       
        
        
    
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnDevisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevisActionPerformed
        
    }//GEN-LAST:event_btnDevisActionPerformed

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFactureActionPerformed

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
            java.util.logging.Logger.getLogger(ITboutonsModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITboutonsModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITboutonsModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITboutonsModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ITboutonsModifier().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnDevis;
    private javax.swing.JButton btnFacture;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnReservation;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
