package GCLASS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Requete {
	
	private static BDDConnectSingleton connect;

	public static BDDConnectSingleton getConnect() {
		return connect;
	}

	public static void setConnect(BDDConnectSingleton connection) {
		Requete.connect = connection;
	}
	
	public Requete(){
	connect = new BDDConnectSingleton();
	connect.getInstance();	
	Statement state = connect.getInstance().createStatement();
	PreparedStatement prepare = connect.getInstance().prepareStatement("");
	String query = "SELECT prof_nom, prof_prenom FROM professeur "+"WHERE prof_nom ='MAMOU'";  
	}
	
	public Requete(BDDConnectSingleton connection){
		connect = connection;
		Statement state = connect.getInstance().createStatement();
		PreparedStatement prepare = connect.getInstance().prepareStatement("");
		}
}
