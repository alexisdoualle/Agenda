/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static gestionagenda.GestionAgenda.rq;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Stagiaire
 */
public class ITajout extends javax.swing.JFrame {
	Ioperation Io;
    /**
     * Creates new form ITajout
     */
    public ITajout(Ioperation Io) {
    	this.Io = Io;
        initComponents();
    }
    
    /*
    ============================================================================
    /!\ MANQUE L'AJOUT D'UNE IMAGE DANS LA BD (POSSIBILITE PLUSIEURS ???) /!\
    ============================================================================
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTable = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelChoice = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbHautGauche = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbHautDroit = new javax.swing.JLabel();
        btnColor = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnCancel = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lbBasGauche = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        panelSalle = new javax.swing.JPanel();
        lbCentreGauche = new javax.swing.JLabel();
        txtSuperficie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbCentreDroit = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Option Administrateur : Création ");

        labelChoice.setText("Vous pouvez ici créer ");

        lbHautGauche.setText("Nom : ");

        lbHautDroit.setText("Couleur : ");

        btnColor.setText("Choisir la couleur");
        btnColor.setBorderPainted(false);
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        btnCancel.setText("Retourner à l'accueil");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSubmit.setText("Valider la création");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lbBasGauche.setText("Commentaire : ");

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane1.setViewportView(txtComment);

        lbCentreGauche.setText("Superficie :");

        jLabel6.setText("m²");

        lbCentreDroit.setText("Image : ");

        btnImg.setText("Ajouter une image");

        javax.swing.GroupLayout panelSalleLayout = new javax.swing.GroupLayout(panelSalle);
        panelSalle.setLayout(panelSalleLayout);
        panelSalleLayout.setHorizontalGroup(
            panelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalleLayout.createSequentialGroup()
                .addComponent(lbCentreGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(74, 74, 74)
                .addComponent(lbCentreDroit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImg)
                .addContainerGap())
        );
        panelSalleLayout.setVerticalGroup(
            panelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalleLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCentreGauche)
                    .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lbCentreDroit)
                    .addComponent(btnImg))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addGap(29, 29, 29)
                                .addComponent(lbTable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbBasGauche)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbHautGauche)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(lbHautDroit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnColor)))
                                .addGap(8, 8, 8)))
                        .addContainerGap())
                    .addComponent(panelSalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(labelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelChoice)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(labelChoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHautGauche)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHautDroit)
                            .addComponent(btnColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBasGauche)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnCancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTable)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Cette fonction sert à quitter l'interface de création.
 * @param evt 
 */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int choice;
        choice = (int)JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment annuler la création ?", "Annuler", JOptionPane.YES_NO_OPTION);
        if(choice == 0){
           this.dispose(); 
        }  
    }//GEN-LAST:event_btnCancelActionPerformed
/**
 * Cette fonction sert à créer la salle ou la tache en question en vérifiant que les différents champs sont remplis.
 * @param evt 
 */
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //Mettre l'insertion dans la BD + gérer les éventuelles erreurs
        try{
        	if(!getTitle().equals("")){
        	    Io.recevoirId(Integer.parseInt(getTitle()));
        	   }
            String nom = txtName.getText();
            String comment = txtComment.getText();
            int aire = 0;
            
            
            	try{
                int superficie = Integer.parseInt(txtSuperficie.getText());
                if(superficie < 0){
                    JOptionPane.showMessageDialog(null, "La superficie doit être un nombre entier positif. \nVeuillez corriger.");
                }
                else{
                    aire = superficie;
                }
                }catch (NumberFormatException e){
                	JOptionPane.showMessageDialog(null, "La superficie doit être un nombre entier positif. \nVeuillez corriger.");
                	nom=null;
                }
            
            
            if(nom == null || nom.equals("")){
                JOptionPane.showMessageDialog(null, "Veuillez rentrer un nom de "+lbTable.getText());
            }
            else if(this.hex == null){
                JOptionPane.showMessageDialog(null, "Veuillez choisir une couleur pour la "+lbTable.getText());
            }
            else{
                //if(rq.checkErreurAjout("salle", nom, hex)){
                    	Io.operationSalle(nom,aire,hex,comment);
                        //rq.ajoutSalle(nom, aire, hex, comment);
                        JOptionPane.showMessageDialog(null, "Nouvelle salle créée avec succès !");
                        this.dispose();
                    
                    
                        //rq.ajoutTache(nom, hex, comment);
                        //JOptionPane.showMessageDialog(null, "Nouvelle tache créée avec succès !");
                        //this.dispose();
                    
                //}
                //else{
                //    JOptionPane.showMessageDialog(null, "Nom de "+lbTable.getText()+" déjà existant ou code couleur déjà utilisé !");
                //}
            }  
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "La superficie doit être un nombre entier positif. \nVeuillez corriger.");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs.");
        } catch (SQLException ex) {
            Logger.getLogger(ITajout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
/**
 * Cette fonction sert à choisir une nouvelle couleur et repaint le bouton avec celle-ci.
 * @param evt 
 */
    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        Color couleur = JColorChooser.showDialog(null, "Code couleur de la "+lbTable.getText(), Color.WHITE);
        System.out.println(couleur);
        //Transcription du code couleur RGB en HEX
        if(couleur == null){
        }
        else{
            String hexa = "#"+Integer.toHexString(couleur.getRGB()).substring(2);
            System.out.println("Le hex : "+hexa);
            btnColor.setBackground(couleur);
            this.hex = hexa; 
        }
    }//GEN-LAST:event_btnColorActionPerformed

    public String getLabelChoice() {
        return labelChoice.getText();
    }

    public String getLabelTitle() {
        return labelTitle.getText();
    }

    public void setLabelChoice(String labelChoice) {
        this.labelChoice.setText(labelChoice);
    }

    public void setLabelTitle(String labelTitle) {
        this.labelTitle.setText(labelTitle);
    }

    public JPanel getPanelSalle() {
        return panelSalle;
    }
    
    public JLabel getLabelTable() {
        return lbTable;
    }

    public void setLabelTable(String labelTable) {
        this.lbTable.setText(labelTable);
    }
    
    public void setSuperficie(int superficie) {
		txtSuperficie.setText(Integer.toString(superficie));
		
	}

	public void setCouleur(String couleur) {
		
	    this.hex=couleur;
	    btnColor.setBackground(Color.decode(couleur));
		
	}

	public void setNom(String nomsalle) {
		txtName.setText(nomsalle);
		
	}
    
	public void setComment(String comment) {
		txtComment.setText(comment);
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnImg;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelChoice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel lbBasGauche;
    private javax.swing.JLabel lbCentreDroit;
    private javax.swing.JLabel lbCentreGauche;
    private javax.swing.JLabel lbHautDroit;
    private javax.swing.JLabel lbHautGauche;
    private javax.swing.JLabel lbTable;
    private javax.swing.JPanel panelSalle;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSuperficie;
    // End of variables declaration//GEN-END:variables
    private String hex;
	
	
}
