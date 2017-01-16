package GCLASS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDDConnectSingleton {
		 //URL de connexion
		 private String url = "jdbc:postgresql://localhost:5432/PROJECTSAE";
		  private String user = "postgres";
		  private String passwd = "s@mi1408";
		  //Objet Connection
		  private static Connection connect;
		   
		  //Constructeur privé
		  BDDConnectSingleton(){
		    try {
		      connect = DriverManager.getConnection(url, user, passwd);
		      } 
		    catch (SQLException e) {   
		    	e.printStackTrace();
		    	}
		    }
		   
		  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
		   public static Connection getInstance(){
			   System.out.println("get! ");
			   if(connect == null){
				    new BDDConnectSingleton();
				    System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
				  }
				  else{
				    System.out.println("CONNEXION SQL EXISTANTE ! ");
				  }
				  return connect;    
		  }   
}
