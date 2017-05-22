/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static factures.Devis.creerDevis;
import static gestionagenda.GestionAgenda.rq;
import java.awt.Dimension;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Stagiaire
 */
public class ITgenerationDevis extends javax.swing.JFrame {

    /**
     * Creates new form ITgenerationDevis
     */
    public ITgenerationDevis() {
        initComponents();
        try {
            //On initialise les tableaux avec les données de la base de données.
            lesSalles = rq.getSalleTacheEntiteFormule("salles", "Salle");
            lesFormules = rq.getSalleTacheEntiteFormule("formule", "Formule");
            lesDispositions = rq.getSalleTacheEntiteFormule("disposition", "Disposition");
            lesOptions = rq.getOptionService("Option");
            lesServices = rq.getOptionService("Service");

            //On enlève tout les items associés aux combo box par défaut.
            cbDisposition.removeAllItems();
            cbFormuleSalle1.removeAllItems();
            cbFormuleSalle2.removeAllItems();
            cbSalle1.removeAllItems();
            cbSalle2.removeAllItems();
            cbOption1.removeAllItems();
            cbOption2.removeAllItems();
            cbOption3.removeAllItems();
            cbOption4.removeAllItems();
            cbOption5.removeAllItems();
            cbOption6.removeAllItems();
            cbService1.removeAllItems();
            cbService2.removeAllItems();
            cbService3.removeAllItems();
            cbService4.removeAllItems();
            cbService5.removeAllItems();
            cbService6.removeAllItems();
            
            //On ajoute l'item "Aucune".
            cbSalle2.addItem("Aucune");
            cbOption1.addItem("Aucune");
            cbOption2.addItem("Aucune");
            cbOption3.addItem("Aucune");
            cbOption4.addItem("Aucune");
            cbOption5.addItem("Aucune");
            cbOption6.addItem("Aucune");
            
            //On initialise les combo box des salles avec les données récupérées plus haut.
            for(int i = 0 ; i < lesSalles.length ; i++){
                cbSalle1.addItem(lesSalles[i]);
                cbSalle2.addItem(lesSalles[i]);
            }
            
            //Pareil pour les dispositions.
            for(int i = 0 ; i < lesDispositions.length ; i++){
                cbDisposition.addItem(lesDispositions[i]);
            }
            
            //Pareil pour les formules.
            for(int i = 0 ; i < lesFormules.length ; i++){
                cbFormuleSalle1.addItem(lesFormules[i]);
                cbFormuleSalle2.addItem(lesFormules[i]);
            }
            
            //Pareil pour les options.
            for(int i = 0 ; i < lesOptions.length ; i++){
                cbOption1.addItem(lesOptions[i]);
                cbOption2.addItem(lesOptions[i]);
                cbOption3.addItem(lesOptions[i]);
                cbOption4.addItem(lesOptions[i]);
                cbOption5.addItem(lesOptions[i]);
                cbOption6.addItem(lesOptions[i]);
            }
            
            //Pareil pour les services.
            for(int i = 0 ; i < lesServices.length ; i++){
                cbService1.addItem(lesServices[i]);
                cbService2.addItem(lesServices[i]);
                cbService3.addItem(lesServices[i]);
                cbService4.addItem(lesServices[i]);
                cbService5.addItem(lesServices[i]);
                cbService6.addItem(lesServices[i]);
            }
            
            //On le choisis par défaut pour ne pas faire apparaitre les données relatives à une deuxième salle qu'on ne souhaite pas avoir.
            cbOption1.setSelectedIndex(5);
            cbOption2.setSelectedIndex(6);
            cbOption3.setSelectedIndex(4);
            cbService1.setSelectedIndex(7);
            cbService2.setSelectedIndex(6);
            cbService3.setSelectedIndex(5);
            cbService4.setSelectedIndex(2);
            cbService5.setSelectedIndex(3);
            cbService6.setSelectedIndex(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(ITgenerationDevis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //On attribut une dimension minimale pour ne pas être embêté avec des soucis graphique.
        Dimension minimumSize = new Dimension(805, 680);
        this.setMinimumSize(minimumSize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbDisposition = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbFormuleSalle1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtNombreHeuresSalle1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNombreParticipantsSalle1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbSalle1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtHoraireDebutSalle1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtHoraireFinSalle1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbSalle2 = new javax.swing.JComboBox<>();
        panelSalle2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtHoraireDebutSalle2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtHoraireFinSalle2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbFormuleSalle2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtNombreHeuresSalle2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNombreParticipantsSalle2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtNombreFormuleSalle2 = new javax.swing.JTextField();
        txtDateJJSalle2 = new javax.swing.JTextField();
        txtDateMMSalle2 = new javax.swing.JTextField();
        txtDateAAAASalle2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGenerer = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cbOption1 = new javax.swing.JComboBox<>();
        cbOption2 = new javax.swing.JComboBox<>();
        cbOption3 = new javax.swing.JComboBox<>();
        cbOption4 = new javax.swing.JComboBox<>();
        cbOption5 = new javax.swing.JComboBox<>();
        cbOption6 = new javax.swing.JComboBox<>();
        txtNbOption1 = new javax.swing.JTextField();
        txtNbOption2 = new javax.swing.JTextField();
        txtNbOption3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cbService1 = new javax.swing.JComboBox<>();
        cbService2 = new javax.swing.JComboBox<>();
        cbService3 = new javax.swing.JComboBox<>();
        cbService4 = new javax.swing.JComboBox<>();
        cbService5 = new javax.swing.JComboBox<>();
        cbService6 = new javax.swing.JComboBox<>();
        txtNbService1 = new javax.swing.JTextField();
        txtNbService2 = new javax.swing.JTextField();
        txtNbService3 = new javax.swing.JTextField();
        txtNbService4 = new javax.swing.JTextField();
        txtNbService5 = new javax.swing.JTextField();
        txtNbService6 = new javax.swing.JTextField();
        txtNbOption4 = new javax.swing.JTextField();
        txtNbOption5 = new javax.swing.JTextField();
        txtNbOption6 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtNombreFormuleSalle1 = new javax.swing.JTextField();
        txtEntreprise = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtCp = new javax.swing.JTextField();
        txtDateJJSalle1 = new javax.swing.JTextField();
        txtDateMMSalle1 = new javax.swing.JTextField();
        txtDateAAAASalle1 = new javax.swing.JTextField();

        jLabel18.setText("Date du :");

        jLabel19.setText("jLabel19");

        jLabel25.setText("jLabel25");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Génération Manuelle d'un Devis");

        jLabel2.setText("Veuillez remplir tous les champs pour générer votre devis !");

        jLabel3.setText("Nom :");

        jLabel4.setText("Prenom :");

        jLabel5.setText("Tél :");

        jLabel6.setText("E-mail :");

        jLabel7.setText("Disposition :");

        cbDisposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Formule : ");

        cbFormuleSalle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Nombre d'heures :");

        jLabel10.setText("Nombre de participants :");

        jLabel11.setText("Coordonnés de facturation :");

        jLabel12.setText("Salle 1 :");

        cbSalle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Date :");

        jLabel15.setText("Horaire de :");

        jLabel16.setText("à :");

        jLabel17.setText("Salle 2 :");

        cbSalle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSalle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalle2ActionPerformed(evt);
            }
        });

        jLabel20.setText("Date :");

        jLabel22.setText("Horaire de :");

        jLabel23.setText("à :");

        jLabel14.setText("Formule : ");

        cbFormuleSalle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel27.setText("Nombre d'heures :");

        jLabel28.setText("Nombre de participants :");

        jLabel29.setText("Nombre formule :");

        javax.swing.GroupLayout panelSalle2Layout = new javax.swing.GroupLayout(panelSalle2);
        panelSalle2.setLayout(panelSalle2Layout);
        panelSalle2Layout.setHorizontalGroup(
            panelSalle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalle2Layout.createSequentialGroup()
                .addGroup(panelSalle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalle2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFormuleSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreFormuleSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSalle2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateJJSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateMMSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateAAAASalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraireDebutSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraireFinSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSalle2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreHeuresSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreParticipantsSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panelSalle2Layout.setVerticalGroup(
            panelSalle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalle2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSalle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(txtDateJJSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateMMSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateAAAASalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraireDebutSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtHoraireFinSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSalle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbFormuleSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtNombreFormuleSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSalle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtNombreHeuresSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtNombreParticipantsSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGenerer.setText("Générer le devis");
        btnGenerer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenererActionPerformed(evt);
            }
        });

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        jLabel24.setText("Options :");

        cbOption1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOption1ActionPerformed(evt);
            }
        });

        cbOption2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOption2ActionPerformed(evt);
            }
        });

        cbOption3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOption3ActionPerformed(evt);
            }
        });

        cbOption4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOption4ActionPerformed(evt);
            }
        });

        cbOption5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOption5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOption5ActionPerformed(evt);
            }
        });

        cbOption6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOption6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOption6ActionPerformed(evt);
            }
        });

        jLabel26.setText("Services :");

        cbService1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbService1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbService1ActionPerformed(evt);
            }
        });

        cbService2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbService2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbService2ActionPerformed(evt);
            }
        });

        cbService3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbService3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbService3ActionPerformed(evt);
            }
        });

        cbService4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbService4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbService4ActionPerformed(evt);
            }
        });

        cbService5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbService5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbService5ActionPerformed(evt);
            }
        });

        cbService6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbService6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbService6ActionPerformed(evt);
            }
        });

        jLabel21.setText("Nombre formule :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDisposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEntreprise))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtVille))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtCp)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDateJJSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDateMMSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDateAAAASalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtHoraireDebutSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtHoraireFinSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbFormuleSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNombreHeuresSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNombreParticipantsSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNombreFormuleSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbOption5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbOption6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNbOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNbOption6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbOption5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(83, 83, 83)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbService1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNbService1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cbService3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbService2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbService4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbService5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbService6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNbService2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbService3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbService4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbService5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNbService6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbDisposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cbOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(cbService1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbService1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOption5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbOption5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOption6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbOption6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbService2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbService2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbService3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbService3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbService4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbService4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbService5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbService5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbService6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbService6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(txtHoraireDebutSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtHoraireFinSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateJJSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateMMSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateAAAASalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbFormuleSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombreFormuleSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreHeuresSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreParticipantsSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        this.dispose();
        //lol
        
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnGenererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenererActionPerformed
        try {
            //CLIENT
            String nomContact = txtNom.getText()+" "+txtPrenom.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            String entreprise = txtEntreprise.getText();
            String ville = txtVille.getText();
            String codepostal = txtCp.getText();
            String facturation = entreprise+" "+ville+" "+codepostal; //Coordonnées de facturation
            
            //SALLE 1
            String nomSalle1 = (String)cbSalle1.getSelectedItem();
            String formuleSalle1 = (String)cbFormuleSalle1.getSelectedItem();
            String horaireDebutSalle1 = txtHoraireDebutSalle1.getText();
            String horaireFinSalle1 = txtHoraireFinSalle1.getText();
            String nbHeuresSalle1 = txtNombreHeuresSalle1.getText();
            String nbParticipantsSalle1 = txtNombreParticipantsSalle1.getText();
            String jj1 = txtDateJJSalle1.getText();
            String mm1 = txtDateMMSalle1.getText(); //MOIS EN CHIFFRE QUI SERVIRA POUR LE NOM DU FICHIER
            //ON UTILISE LA FONCTION "getMois(String mm)" DE LA CLASSE POUR OBTENIR LE MOIS EN TOUTE LETTRE EN FONCTION DU NUMERO RENTREE PAR L'UTILISATEUR
            String mois1 = getMois(mm1); //MOIS EN LETTRE QUI SERVIRA POUR L'ECRITURE SUR LE DEVIS
            String aaaa1 = txtDateAAAASalle1.getText();
            String dateSalle1 = jj1+" "+mois1+" "+aaaa1; //POUR LE DEVIS
            String dateFichier = jj1+mm1+aaaa1; //POUR LE NOM DU FICHIER
            
            //SALLE 2
            String nomSalle2 = "";
            String formuleSalle2 = "";
            String dateSalle2 = "";
            String horaireDebutSalle2 = "";
            String horaireFinSalle2 = "";
            String nbHeuresSalle2 = "";
            String nbParticipantsSalle2 = "";
            String jj2 = "";
            String mm2 = "";
            String aaaa2 = "";
            String mois2 = "";
            
            
            //LES OPTIONS
            String o1 = (String)cbOption1.getSelectedItem();
            String o2 = (String)cbOption2.getSelectedItem();
            String o3 = (String)cbOption3.getSelectedItem();
            String o4 = (String)cbOption4.getSelectedItem();
            String o5 = (String)cbOption5.getSelectedItem();
            String o6 = (String)cbOption6.getSelectedItem();
            
            //LE NOMBRE D'OPTIONS CHOISIS
            String nbO1 = txtNbOption1.getText();
            String nbO2 = txtNbOption2.getText();
            String nbO3 = txtNbOption3.getText();
            String nbO4 = txtNbOption4.getText();
            String nbO5 = txtNbOption5.getText();
            String nbO6 = txtNbOption6.getText();
            
            //LES SERVICES
            String s1 = (String)cbService1.getSelectedItem();
            String s2 = (String)cbService2.getSelectedItem();
            String s3 = (String)cbService3.getSelectedItem();
            String s4 = (String)cbService4.getSelectedItem();
            String s5 = (String)cbService5.getSelectedItem();
            String s6 = (String)cbService6.getSelectedItem();
            
            //LE NOMBRE DE FORMULE CHOISIE
            if(txtNombreFormuleSalle1.getText().equals("")){
                txtNombreFormuleSalle1.setText("1");
            }

            int nbFormuleSalle1 = Integer.parseInt(txtNombreFormuleSalle1.getText());
            int nbFormuleSalle2 = 0;
            
            //GESTION DES GETTEXT() POUR LE NOMBRE DE SERVICES (SINON PROBLEME AVEC LE PARSE)
            if(txtNbService1.getText().equals("")){
                txtNbService1.setText("0");
            }
            if(txtNbService2.getText().equals("")){
                txtNbService2.setText("0");
            }
            if(txtNbService3.getText().equals("")){
                txtNbService3.setText("0");
            }
            if(txtNbService4.getText().equals("")){
                txtNbService4.setText("0");
            }
            if(txtNbService5.getText().equals("")){
                txtNbService5.setText("0");
            }
            if(txtNbService6.getText().equals("")){
                txtNbService6.setText("0");
            }

            //LE NOMBRE DE SERVICES CHOISIS
            int nbS1 = Integer.parseInt(txtNbService1.getText());
            int nbS2 = Integer.parseInt(txtNbService2.getText());
            int nbS3 = Integer.parseInt(txtNbService3.getText());
            int nbS4 = Integer.parseInt(txtNbService4.getText());
            int nbS5 = Integer.parseInt(txtNbService5.getText());
            int nbS6 = Integer.parseInt(txtNbService6.getText());
            
            //LA DISPOSITION
            String dispo = (String)cbDisposition.getSelectedItem();
            
            
            //LES COMMENTAIRES DES SALLES
            String commentSalle1 = rq.getCommentSalle(nomSalle1);
            String commentSalle2 = "";
            
            
            //LES COMMENTAIRES DES SERVICES
            String commentS1 = rq.getCommentService(s1);
            String commentS2 = rq.getCommentService(s2);
            String commentS3 = rq.getCommentService(s3);
            String commentS4 = rq.getCommentService(s4);
            String commentS5 = rq.getCommentService(s5);
            String commentS6 = rq.getCommentService(s6);
            
            //LE PRIX UNITAIRE HT DES SERVICES
            double prixS1 = rq.getTarifService(s1);
            double prixS2 = rq.getTarifService(s2);
            double prixS3 = rq.getTarifService(s3);
            double prixS4 = rq.getTarifService(s4);
            double prixS5 = rq.getTarifService(s5);
            double prixS6 = rq.getTarifService(s6);
            
            //TVA SERVICES
            double tvaS1 = 0;
            double tvaS2 = 0;
            double tvaS3 = 0;
            double tvaS4 = 0;
            double tvaS5 = 0;
            double tvaS6 = 0;
                
            //LE TARIF DES SALLES
            double tarifSalle1 = rq.getTarifSalle(nomSalle1, formuleSalle1);
            double tarifSalle2 = 0;
                     
            //Création des tableaux pour transmettre les valeurs à la fonction créer devis
            String[] fichier = {entreprise, dateFichier};
            String[] client = {entreprise, ville, codepostal, nomContact, email, tel};
            String[] salle1 = {nomSalle1, formuleSalle1, nbHeuresSalle1, nbParticipantsSalle1, dateSalle1, horaireDebutSalle1, horaireFinSalle1, commentSalle1};
            String[] salle2 = new String[8];
            String[] equipements = {o1, o2, o3, o4, o5, o6, dispo};
            String[] services = {s1,  s2,   s3,   s4,   s5,   s6};
            String[] commentairesServices = {commentS1, commentS2, commentS3, commentS4, commentS5, commentS6};
            String[] nbOptions = {nbO1, nbO2, nbO3, nbO4, nbO5, nbO6};
            int[] nbServices = {nbS1, nbS2, nbS3, nbS4, nbS5, nbS6};
            double[] prixServices = {prixS1, prixS2, prixS3, prixS4, prixS5, prixS6};
            double[] tarifSalle = new double[2]; tarifSalle[0] = tarifSalle1;
            double[] tvaServices = new double[3];
            int[] nbFormules = new int[2]; nbFormules[0] = nbFormuleSalle1;
     
            //REMPLACEMENT DES "AUCUNE" DANS EQUIPEMENTS
            for(int i = 0 ; i < equipements.length ; i++){
                if(equipements[i].equals("Aucune")){
                    equipements[i] = "";
                }
            }
            
            //CALCUL DU TVA DES SERVICES
            double totalTVA5 = 0; //TOTAL DU TVA 5,5%
            double totalTVA10 = 0; //TOTAL DU TVA 10%
            double totalTVA20 = 0; //TOTAL DU TVA 20%
            
            for(int i = 0 ; i < services.length ; i++){
                if(services[i].substring(0,5).equals("Pause") || services[i].equals("Accueil petit déjeuner")){
                    totalTVA5 += nbServices[i] * prixServices[i] * 0.055;
                }
                else if(services[i].equals("Plateaux repas") || services[i].equals("Afterwork") || services[i].equals("Champagne")){
                    totalTVA10 += nbServices[i] * prixServices[i] * 0.1;
                }
                else{
                    totalTVA20 += nbServices[i] * prixServices[i] * 0.2;
                }
            }
            
            /*java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");
            tvaServices[0] = df.format(tvaServices[0]);*/
            
            tvaServices[0] = round(totalTVA5, 2); //VOIR METHODE "ROUND" PLUS BAS SUR LA PAGE
            tvaServices[1] = round(totalTVA10, 2);
            tvaServices[2] = round(totalTVA20, 2); 
            
            //SI IL EXISTE UNE DEUXIEME SALLE
            String choix = (String)cbSalle2.getSelectedItem();
            if(!(choix.equals("Aucune"))){
                nomSalle2 = (String)cbSalle2.getSelectedItem();
                formuleSalle2 = (String)cbFormuleSalle2.getSelectedItem();
                horaireDebutSalle2 = txtHoraireDebutSalle2.getText();
                horaireFinSalle2 = txtHoraireFinSalle2.getText();
                nbHeuresSalle2 = txtNombreHeuresSalle2.getText();
                nbParticipantsSalle2 = txtNombreParticipantsSalle2.getText();
                if(txtNombreFormuleSalle2.getText().equals("")){ //ON GERE L'ERREUR DU PARSE
                txtNombreFormuleSalle2.setText("1");
                }
                nbFormuleSalle2 = Integer.parseInt(txtNombreFormuleSalle2.getText());
                tarifSalle2 = rq.getTarifSalle(nomSalle2, formuleSalle2);
                if(!(nomSalle2.equals("Aucune"))){
                    commentSalle2 = rq.getCommentSalle(nomSalle2);
                }
                jj2 = txtDateJJSalle2.getText();
                mm2 = txtDateMMSalle2.getText();
                aaaa2 = txtDateAAAASalle2.getText();
                mois2 = getMois(mm2);
                dateSalle2 = jj2+" "+mois2+" "+aaaa2;                
                
                salle2[0] = nomSalle2;
                salle2[1] = formuleSalle2;
                salle2[2] = nbHeuresSalle2;
                salle2[3] = nbParticipantsSalle2;
                salle2[4] = dateSalle2;
                salle2[5] = horaireDebutSalle2;
                salle2[6] = horaireFinSalle2;
                salle2[7] = commentSalle2;
                tarifSalle[1] = tarifSalle2;
                nbFormules[1] = nbFormuleSalle2;
                
                
                if(nomContact.equals("") || email.equals("") || tel.equals("") || facturation.equals("") || dateSalle1.equals("") ||
                        horaireDebutSalle1.equals("") || horaireFinSalle1.equals("") || nbParticipantsSalle1.equals("") ||
                        dateSalle2.equals("") || horaireDebutSalle2.equals("") || horaireFinSalle2.equals("") || nbParticipantsSalle2.equals("")){
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs !");
                }
                else{
                    try {
                        creerDevis(fichier, client, salle1, salle2, equipements, services, commentairesServices, nbOptions, nbServices, tarifSalle, prixServices, nbFormules, tvaServices);
                        JOptionPane.showMessageDialog(null, "Devis créé !\nRetour aux paramètres administrateurs.");
                        this.dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(ITgenerationDevis.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else{
                
                salle2[0] = "";
                salle2[1] = "";
                salle2[2] = "";
                salle2[3] = "";
                salle2[4] = "";
                salle2[5] = "";
                salle2[6] = "";
                salle2[7] = "";
                tarifSalle[1] = 0;
                
                if(nomContact.equals("") || email.equals("") || tel.equals("") ||
                facturation.equals("") || dateSalle1.equals("") || horaireDebutSalle1.equals("") || horaireFinSalle1.equals("") || nbParticipantsSalle1.equals("")){
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs !");
                }
                else{
                    try {
                        creerDevis(fichier, client, salle1, salle2, equipements, services, commentairesServices, nbOptions, nbServices, tarifSalle, prixServices, nbFormules, tvaServices);
                        JOptionPane.showMessageDialog(null, "Devis créé !\nRetour aux paramètres administrateurs.");
                        this.dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(ITgenerationDevis.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ITgenerationDevis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenererActionPerformed

    private void cbSalle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalle2ActionPerformed
        String choix = (String)cbSalle2.getSelectedItem();
        System.out.println(choix);
        if(choix != null){
            if(choix.equals("Aucune")){
                panelSalle2.setVisible(false);
            }
            else{
                panelSalle2.setVisible(true);
            }
        }
    }//GEN-LAST:event_cbSalle2ActionPerformed

    private void cbOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOption1ActionPerformed
        String choix = (String)cbOption1.getSelectedItem();
        System.out.println(choix);
        if(choix != null){
            if(choix.equals("Aucune")){
                txtNbOption1.setVisible(false);
            }
            else{
                txtNbOption1.setVisible(true);
            }
        }
    }//GEN-LAST:event_cbOption1ActionPerformed

    private void cbOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOption2ActionPerformed
        String choix = (String)cbOption2.getSelectedItem();
        System.out.println(choix);
        if(choix != null){
            if(choix.equals("Aucune")){
                txtNbOption2.setVisible(false);
            }
            else{
                txtNbOption2.setVisible(true);
            }
        }
    }//GEN-LAST:event_cbOption2ActionPerformed

    private void cbOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOption3ActionPerformed
        String choix = (String)cbOption3.getSelectedItem();
        System.out.println(choix);
        if(choix != null){
            if(choix.equals("Aucune")){
                txtNbOption3.setVisible(false);
            }
            else{
                txtNbOption3.setVisible(true);
            }
        }
    }//GEN-LAST:event_cbOption3ActionPerformed

    private void cbOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOption4ActionPerformed
        /*String choix = (String)cbOption4.getSelectedItem();
        System.out.println(choix);
        if(choix != null){
            if(choix.equals("Aucune")){     
                txtNbOption4.setVisible(false);
            }
            else{
                System.out.println("1111111");
                txtNbOption4.setVisible(true);
                System.out.println("2222222");
            }
        }*/
    }//GEN-LAST:event_cbOption4ActionPerformed

    private void cbOption5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOption5ActionPerformed
        /*String choix = (String)cbOption5.getSelectedItem();
        System.out.println(choix);
        if(choix != null){
            if(choix.equals("Aucune")){
                txtNbOption5.setVisible(false);
            }
            else{
                txtNbOption5.setVisible(true);
            }
        }*/
    }//GEN-LAST:event_cbOption5ActionPerformed

    private void cbOption6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOption6ActionPerformed
        /*String choix = (String)cbOption6.getSelectedItem();
        System.out.println(choix);
        if(choix != null){
            if(choix.equals("Aucune")){
                txtNbOption6.setVisible(false);
            }
            else{
                txtNbOption6.setVisible(true);
            }
        }*/
    }//GEN-LAST:event_cbOption6ActionPerformed

    private void cbService1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbService1ActionPerformed
        String choix = (String)cbService1.getSelectedItem();
        if(choix != null){
            if(choix.equals("Plateaux repas")){
                gestionPrix();
            } 
        }
    }//GEN-LAST:event_cbService1ActionPerformed

    private void cbService2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbService2ActionPerformed
        String choix = (String)cbService2.getSelectedItem();
        if(choix != null){
            if(choix.equals("Plateaux repas")){
                gestionPrix();
            } 
        }
    }//GEN-LAST:event_cbService2ActionPerformed

    private void cbService3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbService3ActionPerformed
        String choix = (String)cbService3.getSelectedItem();
        if(choix != null){
            if(choix.equals("Plateaux repas")){
                gestionPrix();
            } 
        }
    }//GEN-LAST:event_cbService3ActionPerformed

    private void cbService4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbService4ActionPerformed
        String choix = (String)cbService4.getSelectedItem();
        if(choix != null){
            if(choix.equals("Plateaux repas")){
                gestionPrix();
            } 
        }
    }//GEN-LAST:event_cbService4ActionPerformed

    private void cbService5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbService5ActionPerformed
        String choix = (String)cbService5.getSelectedItem();
        if(choix != null){
            if(choix.equals("Plateaux repas")){
                gestionPrix();
            } 
        }
    }//GEN-LAST:event_cbService5ActionPerformed

    private void cbService6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbService6ActionPerformed
        String choix = (String)cbService6.getSelectedItem();
        if(choix != null){
            if(choix.equals("Plateaux repas")){
                gestionPrix();
            } 
        }
    }//GEN-LAST:event_cbService6ActionPerformed

    private String getMois(String mm){
        String mois = null;
        switch(mm){
                case "01": mois = "Janvier"; break;
                case "02": mois = "Février"; break;
                case "03": mois = "Mars"; break;
                case "04": mois = "Avril"; break;
                case "05": mois = "Mai"; break;
                case "06": mois = "Juin"; break;
                case "07": mois = "Juillet"; break;
                case "08": mois = "Août"; break;
                case "09": mois = "Septembre"; break;
                case "10": mois = "Octobre"; break;
                case "11": mois = "Novembre"; break;
                case "12": mois = "Décembre"; break;
            }
        return mois;
    }
    
    private void gestionPrix(){
        String nouveauPrix;
        double prix;
        nouveauPrix = (String)JOptionPane.showInputDialog(null, "Quel sera le prix unitaire pour le plateaux repas ?", "Modification du prix du plateau repas", JOptionPane.QUESTION_MESSAGE);
        prix = Double.parseDouble(nouveauPrix);
        rq.MAJprixPlateauxRepas(prix);
    }
    
    //POUR ARRONDIR A DEUX CHIFFRES APRÈS LA VIRGULE D'UN "DOUBLE"
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnGenerer;
    private javax.swing.JComboBox<String> cbDisposition;
    private javax.swing.JComboBox<String> cbFormuleSalle1;
    private javax.swing.JComboBox<String> cbFormuleSalle2;
    private javax.swing.JComboBox<String> cbOption1;
    private javax.swing.JComboBox<String> cbOption2;
    private javax.swing.JComboBox<String> cbOption3;
    private javax.swing.JComboBox<String> cbOption4;
    private javax.swing.JComboBox<String> cbOption5;
    private javax.swing.JComboBox<String> cbOption6;
    private javax.swing.JComboBox<String> cbSalle1;
    private javax.swing.JComboBox<String> cbSalle2;
    private javax.swing.JComboBox<String> cbService1;
    private javax.swing.JComboBox<String> cbService2;
    private javax.swing.JComboBox<String> cbService3;
    private javax.swing.JComboBox<String> cbService4;
    private javax.swing.JComboBox<String> cbService5;
    private javax.swing.JComboBox<String> cbService6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panelSalle2;
    private javax.swing.JTextField txtCp;
    private javax.swing.JTextField txtDateAAAASalle1;
    private javax.swing.JTextField txtDateAAAASalle2;
    private javax.swing.JTextField txtDateJJSalle1;
    private javax.swing.JTextField txtDateJJSalle2;
    private javax.swing.JTextField txtDateMMSalle1;
    private javax.swing.JTextField txtDateMMSalle2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEntreprise;
    private javax.swing.JTextField txtHoraireDebutSalle1;
    private javax.swing.JTextField txtHoraireDebutSalle2;
    private javax.swing.JTextField txtHoraireFinSalle1;
    private javax.swing.JTextField txtHoraireFinSalle2;
    private javax.swing.JTextField txtNbOption1;
    private javax.swing.JTextField txtNbOption2;
    private javax.swing.JTextField txtNbOption3;
    private javax.swing.JTextField txtNbOption4;
    private javax.swing.JTextField txtNbOption5;
    private javax.swing.JTextField txtNbOption6;
    private javax.swing.JTextField txtNbService1;
    private javax.swing.JTextField txtNbService2;
    private javax.swing.JTextField txtNbService3;
    private javax.swing.JTextField txtNbService4;
    private javax.swing.JTextField txtNbService5;
    private javax.swing.JTextField txtNbService6;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNombreFormuleSalle1;
    private javax.swing.JTextField txtNombreFormuleSalle2;
    private javax.swing.JTextField txtNombreHeuresSalle1;
    private javax.swing.JTextField txtNombreHeuresSalle2;
    private javax.swing.JTextField txtNombreParticipantsSalle1;
    private javax.swing.JTextField txtNombreParticipantsSalle2;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
    private String[] lesSalles = null;
    private String[] lesFormules = null;
    private String[] lesDispositions = null;
    private String[] lesOptions = null;
    private String[] lesServices = null;
}
