package GCLASS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Requete {
	
	/***liste des requetes***/
	/** Supp d'un User **/
	public void suppUser
	(int iduser) {
		try {
			Statement state;
			state = BDDConnectSingleton.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			state.executeUpdate("DELETE FROM utilisateur WHERE (id_user="+iduser+")");} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	/** Modif d'un User **/
	public void modifUser
	(int iduser, String prenom, String nom, String login, String password, String statut,int promo){
		try {
			PreparedStatement prepare;
		        prepare = BDDConnectSingleton.getInstance().prepareStatement("UPDATE utilisateur SET prenom_user=?, nom_user=?, mdp_user=?, statut_user=?, fk_id_promo=?,  login_user=? "
				  + "WHERE id-user='"+iduser+"'");
		     	 	  prepare.setString(1, prenom);
				  prepare.setString(2, nom);
				  prepare.setString(3, password);
				  prepare.setString(4, statut);
				  prepare.setInt(5, promo);
				  prepare.setString(6, login);
				  prepare.executeUpdate();
				  prepare.close();	  
		} catch (SQLException e) {
			e.printStackTrace();
			} 
	}
	/** ajout d'un User **/
	public void ajoutUser 
	(String prenom, String nom, String login, String password, String Statut, int Promo) {
	try {
		Statement state;
		state = BDDConnectSingleton.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		state.executeUpdate("INSERT INTO utilisateur "
		+ "(prenom_user, nom_user, mdp_user, statut_user, fk_id_promo, login_user) "
    		+ "VALUES ('"+ prenom +"','"+ nom+"','"+password+"','"+Statut+"',"+Promo+",'"+login+"')");
	} catch (SQLException e) {
		e.printStackTrace();
		} 
	}
	
	/** ajout d'un resa **/
	
	public void ajoutResa 
	(String date, int salle, int cours, int promo, int prof) {
	try {
		Statement state;
		state = BDDConnectSingleton.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		state.executeUpdate("INSERT INTO resa "
		+ "(date_resa, fk_id_salle, fk_id_cours, fk_id_promo, fk_id_user) "
        	 + "VALUES ('"+ date +"','"+ salle+"','"+cours+"','"+promo+"',"+prof+"')");
	} catch (SQLException e) {
		e.printStackTrace();
		} 
	}

	/** Modif d'une resa **/
	public void modifresa
	(int idresa,int salle, int cours, int promo, int prof) {
		try {
			PreparedStatement prepare;
		        prepare = BDDConnectSingleton.getInstance().prepareStatement("UPDATE resa SET date_resa=?, fk_id_salle=?, fk_id_cours=?, fk_id_promo=?, fk_id_user=? "
				  + "WHERE id-resa='"+idresa+"'");
		     	 	  prepare.setString(1, date);
				  prepare.setString(2, salle);
				  prepare.setString(3, cours);
				  prepare.setString(4, promo);
				  prepare.setInt(5, prof);
				  prepare.executeUpdate();
				  prepare.close();	  
		} catch (SQLException e) {
			e.printStackTrace();
			} 
	}

	public void supResa 
	(int idresa) {
	try {
		Statement state;
		state = BDDConnectSingleton.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		state.executeUpdate("DELETE FROM esa WHERE (id_resa="+idresa+")");
	} catch (SQLException e) {
		e.printStackTrace();
		} 
	}

	/** recherche id user **/


	/** recherche id salle **/
	/** recherche id cours **/
	/** recherche id promo **/
	/** recherche id resa **/
	/** recherche id equipement **/
	/** recherche id equipement selon salle **/

	/** lister user **/
	public void listUser
	()  {
	try {
		Statement state;
		state = BDDConnectSingleton.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		state.executeUpdate("DELETE FROM esa WHERE (id_resa="+idresa+")");
		
		String query = "SELECT prenom_user, nom_user, statut_user, fk_id_promo, FROM utilisateur";         
   		ResultSet res = state.executeQuery(query);
		int i = 1;
		while(res.next()){
     			System.out.println("Nom : "+res.getString("prof_nom") +" \t prénom : "+res.getString("prof_prenom"));
    
      		if(res.isLast()){
       		 System.out.println("\t* DERNIER RESULTAT !\n");}
      		i++;
		}
		if(res.isAfterLast()){
     		System.out.println("Nous venons de terminer !\n");}
		res.close();/*???*/
   		state.close();/*???*/
    } 
} 
	} catch (SQLException e) {
		e.printStackTrace();
		} 
	}
	/** lister salle **/
	/** lister cours **/
	/** lister promo **/
	/** lister resa **/
	/** lister equipement **/
	/** lister equipement selon salle**/
	
	/**Imprimer resa**/
	/**Imprimer formateur**/
	/**Imprimer promo**/
	
}
