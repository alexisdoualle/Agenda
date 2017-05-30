/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static gestionagenda.GestionAgenda.rq;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;

/**
 *
 * @author Stagiaire
 */
public class ITajoutTache extends javax.swing.JFrame {
	Ioperation Io;
    /**
     * Creates new form ITajout
     */
    public ITajoutTache(Ioperation Io){
    	this.Io=Io;
    	setMinimumSize(new Dimension(520, 545));
        initComponents();
        cbHeureDebut.removeAllItems();
        cbHeureFin.removeAllItems();
        for (String heures : heures){
        	cbHeureDebut.addItem(heures);
        	cbHeureFin.addItem(heures);
        }
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
        panelSalle = new javax.swing.JPanel();
        calendarDebut = new JCalendar();
        calendarFin = new JCalendar();
        cbHeureFin = new javax.swing.JComboBox<String>();
        cbHeureDebut = new javax.swing.JComboBox<String>();

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
        
        
        
        JLabel label = new JLabel();
        label.setText("Horaire de : (HH:MM)");
        
        
        label_1 = new JLabel();
        label_1.setText("\u00C3\u00A0 :");
        
        

        javax.swing.GroupLayout panelSalleLayout = new javax.swing.GroupLayout(panelSalle);
        panelSalleLayout.setHorizontalGroup(
        	panelSalleLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelSalleLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelSalleLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelSalleLayout.createSequentialGroup()
        					.addComponent(calendarDebut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
        					.addComponent(calendarFin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(panelSalleLayout.createSequentialGroup()
        					.addComponent(label, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(cbHeureDebut, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(cbHeureFin, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        panelSalleLayout.setVerticalGroup(
        	panelSalleLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelSalleLayout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(panelSalleLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(label)
        				.addComponent(cbHeureDebut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(label_1)
        				.addComponent(cbHeureFin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(panelSalleLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(calendarDebut, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(calendarFin, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        );
        panelSalle.setLayout(panelSalleLayout);
        txtComment = new javax.swing.JTextArea();
        
                txtComment.setColumns(20);
                txtComment.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(178)
        							.addComponent(lbTable))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(95)
        									.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(lbHautGauche)
        									.addGap(34)
        									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        									.addGap(5)
        									.addComponent(lbHautDroit)
        									.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
        									.addComponent(btnColor)))
        							.addGap(8)))
        					.addContainerGap())))
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(120)
        					.addComponent(labelTitle))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(labelChoice)))
        			.addContainerGap(179, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(14, Short.MAX_VALUE)
        			.addComponent(lbBasGauche)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(txtComment, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
        			.addGap(43))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnSubmit)
        			.addPreferredGap(ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
        			.addComponent(btnCancel)
        			.addContainerGap())
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panelSalle, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(labelTitle)
        			.addGap(18)
        			.addComponent(labelChoice)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lbHautGauche)
        						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbHautDroit)
        						.addComponent(btnColor))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(panelSalle, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lbTable))
        			.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtComment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbBasGauche))
        			.addGap(82)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCancel)
        				.addComponent(btnSubmit))
        			.addGap(27)
        			.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addGap(38))
        );
        getContentPane().setLayout(layout);

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
            String horaireDebut = (String)cbHeureDebut.getSelectedItem();
            String horaireFin = (String)cbHeureFin.getSelectedItem();
            int aire = 0;
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String dateDebut = format1.format(calendarDebut.getDate());
            String dateFin = format1.format(calendarFin.getDate());
            System.out.println(dateDebut);
            System.out.println(dateFin);
            
            
            if(comparerheures(horaireDebut, horaireFin)){
            	JOptionPane.showMessageDialog(null, "L'heure de d�but doit preceder l'heure de fin", "Erreur", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(comparerdates(dateDebut,dateFin))
            	JOptionPane.showMessageDialog(null, "La date de d�but doit preceder la date de fin", "Erreur", JOptionPane.INFORMATION_MESSAGE);
            
            else{
            
            if(nom == null || nom.equals("")){
                JOptionPane.showMessageDialog(null, "Veuillez rentrer un nom de "+lbTable.getText());
            }
            else if(this.hex == null){
                JOptionPane.showMessageDialog(null, "Veuillez choisir une couleur pour la "+lbTable.getText());
            }
            else{
                //if(rq.checkErreurAjout("salle", nom, hex)){
                    //if(aire != 0){
                        //rq.ajoutSalle(nom, aire, hex, comment);
                        //JOptionPane.showMessageDialog(null, "Nouvelle salle créée avec succès !");
                        //this.dispose();
                    //}
                    //else{
                    	Io.operationTache(nom, hex, comment, dateDebut, dateFin, horaireDebut+":00",horaireFin+":00");
                        //rq.ajoutTache(nom, hex, comment);
                        JOptionPane.showMessageDialog(null, "Nouvelle tache créée avec succès !");
                        this.dispose();
                    //} 
                //}
                //else{
                    //JOptionPane.showMessageDialog(null, "Nom de "+lbTable.getText()+" déjà existant ou code couleur déjà utilisé !");
                //}
            }  
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Veuillez remplir tout les champs.");
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
    
    public Boolean comparerheures (String horaireDebut, String horaireFin){
    	String heureDebut=horaireDebut.split(":")[0];
    	String heureFin=horaireFin.split(":")[0];
    	String minDebut=horaireDebut.split(":")[1];
    	String minFin=horaireFin.split(":")[1];
    	if(Integer.parseInt(heureDebut) > Integer.parseInt(heureFin)){
    		 return true;
    	}
    	if(Integer.parseInt(heureDebut) > Integer.parseInt(heureFin) && Integer.parseInt(minDebut) > Integer.parseInt(minFin)){
    		 return true;
    	}
    	return false;
    }
    
    public Boolean comparerdates (String dateDebut, String dateFin){
    	String jourDebut = dateDebut.split("-")[0];
    	String jourFin = dateFin.split("-")[0];
    	String moisDebut = dateDebut.split("-")[1];
    	String moisFin = dateFin.split("-")[1];
    	String anDebut = dateDebut.split("-")[2];
    	String anFin = dateFin.split("-")[2];
    	if(Integer.parseInt(anFin)<Integer.parseInt(anDebut)){
    		return true;
    	}
    	if(Integer.parseInt(moisFin)<Integer.parseInt(moisDebut) && Integer.parseInt(anFin)==Integer.parseInt(anDebut)){
    		return true;
    	}
    	if(Integer.parseInt(moisFin)==Integer.parseInt(moisDebut) && Integer.parseInt(anFin)==Integer.parseInt(anDebut) && Integer.parseInt(jourFin)<Integer.parseInt(jourDebut)){
    		return true;
    	}
    	return false;
    }

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
    
    public void setDateDebut (String dateStr){
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    	Date date;
		try {
			date = formatter.parse(dateStr);
			calendarDebut.setDate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void setDateFin (String dateStr){
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    	Date date;
		try {
			date = formatter.parse(dateStr);
			calendarFin.setDate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void setHeureFin (String heure){
    	cbHeureFin.setSelectedItem(heure);
    }
    
    public void setHeureDebut (String heure){
    	cbHeureDebut.setSelectedItem(heure);
    }
    
    public void setComment(String comment){
    	txtComment.setText(comment);
    }
    
    public void setCouleur(String couleur){
    	this.hex=couleur;
    	btnColor.setBackground(Color.decode(couleur));
    }
    
    public void setNom(String nom){
    	txtName.setText(nom);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelChoice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel lbBasGauche;
    private javax.swing.JLabel lbHautDroit;
    private javax.swing.JLabel lbHautGauche;
    private javax.swing.JLabel lbTable;
    private javax.swing.JPanel panelSalle;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtName;
    private JCalendar calendarDebut;
    private JCalendar calendarFin;
    private javax.swing.JComboBox<String> cbHeureDebut;
    private javax.swing.JComboBox<String> cbHeureFin;
    private String[] heures= {"09:00","09:30","10:00","10:30","11:00","11:30","12:00","12:30","13:00","13:30","14:00","14:30","15:00","15:30","16:00","16:30","17:00","17:30","18:00","18:30","19:00","19:30","20:00","20:30","21:00","21:30","22:00","22:30","23:00"};

    
    // End of variables declaration//GEN-END:variables
    private String hex;
    private JLabel label_1;
    
}
