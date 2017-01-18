package GCLASS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDConnectSingleton {
	private static final Statement state = null;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public static Connection getConnect() {
		return connect;
	}

	public static void setConnect(Connection connect) {
		BDDConnectSingleton.connect = connect;
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

	public Statement createStatement() {
		int a= ResultSet.TYPE_SCROLL_SENSITIVE;
		int b=ResultSet.CONCUR_UPDATABLE;//(modifiable) ou lsible CONCUR_READONLY
		System.out.println("-Statement-");
		Statement state = null;
		try {
			state = connect.createStatement(a,b);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

	public PreparedStatement prepareStatement(String texte, int f) {
		PreparedStatement state = null;
		f = ResultSet.TYPE_SCROLL_SENSITIVE;
		System.out.println("-Prepare-");
		try {
			state = connect.prepareStatement(texte, f);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return state;
	}

}