package GCLASS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class State {
public static void State(String[] args) {
		BDDConnectSingleton connectBDD = new BDDConnectSingleton();	
	
			  try {         
				    Class.forName("org.postgresql.Driver");
				   
			//	    String url = "jdbc:postgresql://localhost:5432/PROJECTSAE";
				   // String user = "postgres";
				   // String passwd = "s@mi1408";

				 //  Connection conn = DriverManager.getConnection(url, user, passwd);
				    //On autorise la mise à jour des données 
				    //Et la mise à jour de l'affichage
				    Statement state = connectBDD.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				  /*  PreparedStatement prepare = conn.prepareStatement("UPDATE U set id_user = ? ");*/

				    //On va chercher une ligne dans la base de données
				    String query = "SELECT * FROM utilisateur ";     

				    //On exécute la requête
				    ResultSet res = state.executeQuery(query);
				    res.first();
				    //On affiche
				    ResultSetMetaData resultmeta = res.getMetaData();
				    System.out.println("il y a "+resultmeta.getColumnCount()+" colonnes dans cette base de donnée");

				    res.close();
				    state.close();  
				    
				  } catch (ClassNotFoundException e) {
				    e.printStackTrace();
				  } catch (SQLException e) {
				    e.printStackTrace();
				  }      
		}
}