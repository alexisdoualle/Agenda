/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.villalem.labd;
import fr.villalem.usager.Usager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Villalemons
 */
public class BdDAO {
    
    	//Variables
	private Connexion co = null;
	private ResultSet rs = null;
	
	//Constructeur
	public BdDAO(Connexion uneCo){
		this.co = uneCo;
		this.co.connect();
	}
	
	//Accès à la BD
	public void nomClients() throws SQLException{
		String request = "Select nom From Client";
		rs = co.query(request);
		while(rs.next()){
			System.out.println("Nom du client : "+rs.getString("nom"));
		}
	}
	
	public boolean authentification(String log, String pwd) throws SQLException{
		String request = "Select login, password From Usager Where login='"+log+"' And password='"+pwd+"'";
		rs = co.query(request);
		if(rs.next()){
                    //co.close();
                    return true;
		}
		return false;
	}
        
        public Usager getUsager(String login, String pwd) throws SQLException{
            String request = "SELECT * FROM Usager WHERE login='"+login+"' AND password='"+pwd+"'";
            rs = co.query(request);
            
            int identifiant = rs.getInt("idUsager");
            int admin = rs.getInt("administrateur");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            
            Usager unUsager = new Usager(identifiant, admin, nom, prenom);
            
            return unUsager;
        }
    
}
