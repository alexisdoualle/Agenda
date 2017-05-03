package villalem.reservations;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.Scrollbar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import static villalem.gestion.GestionAgenda.rq;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JRadioButton;

public class PanelJour extends JPanel {
	
	private int hauteurLigne;
	private int largeurEvenement;
	private List<Evenement> listeEvenements;
	
    private final int largeurColonneHeure = 40;//largeur de la première colonne, en px
    private final int largeurColonneJour = 140;//largeur de chaque colonne jour, en px
    private final int espacementHeure = 40;//espacement vertical entre chaque heure, en px
    
    
	public PanelJour() {
		this.setLayout(null);


		largeurEvenement = this.getWidth()/3;
		hauteurLigne = this.getHeight()/10; 
		listeEvenements = new ArrayList<>();
		this.repaint();
		this.updateUI();
		
		
	}	
	
	
	public void remplirAgenda(Calendar c) {
		try {
			ResultSet rs = rq.getEvenementsJour(c);
			while(rs.next()) {
				String[] strDebut = rs.getString("dateDebut").split("-");
          	  	String[] strFin = rs.getString("dateFin").split("-");
          	  
                Integer heureDebut = Integer.parseInt(rs.getString("heureDebut").split(":")[0]);
                Integer heureFin = Integer.parseInt(rs.getString("heureFin").split(":")[0]);
          
                Integer jourDebut = Integer.parseInt(rs.getString("dateDebut").split("-")[0]);
                Integer jourFin = Integer.parseInt(rs.getString("dateFin").split("-")[0]);
                
                int idEvenement = rs.getInt("evenement.id");
                String couleur = rq.getCouleurEvenement(idEvenement);
				
				//listeEvenements.add();
			}
 		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	@Override
    public void paintComponent(Graphics g) {
    	
    	super.paintComponent(g);
        //cette méthode construit l'arrière plan de l'agenda, avec une colonne par jour de la semaine
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        //Antialiasing pour lisser les chiffres et lettres éventuels:
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int hauteurFenetre = this.getHeight();
        g.drawRect(0, 0, this.getWidth()-1, hauteurFenetre/10);//première colonne où on placera les heures de 7 à 23h     
        
        for(int i=0; i<24; i++) { //affiche une colonne pour chaque jour de la semaine
            g.drawRect(0, i*(this.getHeight()/10), this.getWidth()-1, this.getHeight()/10);
        }
        for(int i=7; i<24; i++) { //affiche l'heure de 7 à 23h
            String heure = Integer.toString(i);
            g.drawString(heure + ":00", 0, (i-6)*(this.getHeight()/10));//une heure = 30px
            
            	
        }
        
        g.setColor(Color.DARK_GRAY);
        /**
         * méthode qui déssine les rectangles pour chaque évènement dans la liste:
         */   
        
        this.updateUI();
        
        
	}
	
	private void addScroll() {
		
	
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    


	public int getHauteurLigne() {
		return hauteurLigne;
	}


	public int getLargeurEvenement() {
		return largeurEvenement;
	}


	public List<Evenement> getListeEvenements() {
		return listeEvenements;
	}


	public int getLargeurColonneHeure() {
		return largeurColonneHeure;
	}


	public int getLargeurColonneJour() {
		return largeurColonneJour;
	}


	public int getEspacementHeure() {
		return espacementHeure;
	}


	public void setHauteurLigne(int hauteurLigne) {
		this.hauteurLigne = hauteurLigne;
	}


	public void setLargeurEvenement(int largeurEvenement) {
		this.largeurEvenement = largeurEvenement;
	}


	public void setListeEvenements(List<Evenement> listeEvenements) {
		this.listeEvenements = listeEvenements;
	}
}
