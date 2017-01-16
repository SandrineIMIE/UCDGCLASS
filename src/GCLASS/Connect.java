package GCLASS;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Connect 
{
	  public static void main(String[] args) {
	    try {
	      Class.forName("org.postgresql.Driver");
	      System.out.println("***********************");
	       System.out.println("Base de donnnées SAE");
	      String url = "jdbc:postgresql://localhost:5432/PROJECTSAE";
	      String user = "postgres";
	      String passwd = "s@mi1408";
	         
	      Connection conn = DriverManager.getConnection(url, user, passwd);
	      System.out.println("***********************");
	      System.out.println("Connexion ok "); 
	      System.out.println("***********************");
	    /*//Création d'un objet Statement
	      Statement state = conn.createStatement();
	   
	      //L'objet ResultSet contient le résultat de la requête SQL
	      ResultSet result = state.executeQuery("SELECT * FROM USER");
	     
	      //On récupère les MetaData
	      ResultSetMetaData resultMeta = result.getMetaData();
	         
	      
	      //On affiche le nom des colonnes
	      for(int i = 1; i <= resultMeta.getColumnCount(); i++)
	        System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
	         
	         
	      while(result.next()){         
	        for(int i = 1; i <= resultMeta.getColumnCount(); i++)
	          System.out.print("\t" + result.getObject(i).toString() + "\t |");
	            
	        System.out.println("\n---------------------------------");

	      }
	      
	      result.close();
	      state.close();*/
	         
	    } 
	    catch (Exception e) {
	      e.printStackTrace();
	    }   
	  }  
}
