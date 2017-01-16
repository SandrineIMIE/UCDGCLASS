package GCLASS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
			   if(connect == null){
				    new BDDConnectSingleton();
				  }
				  else{
				  }
				  return connect;    
		  }

		public Statement createStatement(int typeScrollSensitive, int concurUpdatable) {
			// TODO Auto-generated method stub
			return null;
		}

		public PreparedStatement prepareStatement(String string) {
			// TODO Auto-generated method stub
			return null;
		}   
}
