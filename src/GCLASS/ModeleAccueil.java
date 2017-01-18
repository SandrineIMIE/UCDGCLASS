package GCLASS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;

public class ModeleAccueil extends Observable {

	
		/******************ATTRIBUTS DE NOTRE CODE : données pour se logger  ******************/
	
		private String login;
		private String password;
		private String prenom, nom; 
		private String statut= "Etudiant";
		private int v=1;
		private boolean valide;
		
		/****************** GETTERS AND SETTERS  ******************/
		
		public int getV() {
			return v;
		}
		public void setV(int v) {
			this.v = v;
		}			
		
		
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getStatut() {
			return statut;
		}
		public void setStatut(String statut) {
			this.statut = statut;
		}
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {

			this.password = password;
		}
		public boolean isValide() {
			return valide;
		}
		public void setValide(boolean valide) {
			this.valide = valide;
		}
		/****************** CONSTRUCTEUR ******************/
	
		public ModeleAccueil() {
			
		}
		
		public ModeleAccueil(String login, String password) {
		
			this.login = login;
			this.password = password;
			valide = false;
		}
		

		/****************** METHODE VERIFICATION IDENTIFIANTS DE L UTILISATEUR ******************/
	
		
		
		/**** TRUE SI VERIF OK SINON FALSE en relation avec bouton oK de le VUE ********/
		 
		public boolean verifierIdentifiants(String log, String mdp)
		{
			boolean res = false;
			String query = "SELECT * FROM utilisateur WHERE login_user = ?";
			String query2 = "SELECT * FROM utilisateur WHERE login_user = ? AND mdp_user= ? ";
			
			try {
							
				PreparedStatement prepare = BDDConnectSingleton.getInstance().prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				System.out.println("login : " + log);
				prepare.setString(1, log);
				ResultSet result = prepare.executeQuery();
				  
			
				if(result.first())
				{
					PreparedStatement prepare2 = BDDConnectSingleton.getInstance().prepareStatement(query2, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
					prepare2.setString(1, log);
					prepare2.setString(2, mdp);
					
					ResultSet result2 = prepare2.executeQuery();
					
					if(result2.first())
					{
						System.out.println("\nIdentification OK (modèle)\n");
						this.login = log;
						this.password = mdp;
						this.valide = true;
						
						res = true;
					}
					
					
					else
					{
						System.out.println("\nAttention le mot de passe est invalide !\n");
					}
				}
				else
				{
					System.out.println("\nAttention le login saisi n'existe pas !\n");
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}

			setChanged();
			notifyObservers(this);
			
			return res;
		}

		
		/**** AFFICHAGE UTILISATEUR ********/
		 
	
		
			public void infoUser(){
				System.out.println("*** Votre compte Utilisateur ***");
				System.out.println("Login : "+ login);
				System.out.println("Mot de passe : "+ password);
				setChanged();
			    notifyObservers();
			}
			
			/**** VERIFICATION STATUT UTILISATEUR  ********/
			 
			
			public String verifStatut ()  {						
				String statutuser = null;
				try {
					
					Statement state;
					state = BDDConnectSingleton.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					String query = "SELECT statut_user FROM utilisateur WHERE login_user ='"+ login+"'";
				    ResultSet res = state.executeQuery(query);
				    res.first(); /*le premier*/
				    System.out.println(res.getString("statut_user"));	
				    statutuser=res.getString("statut_user");
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			   statut=statutuser;
			   return statutuser;
				
			}		  
							
	
			/**** VUE selon STATUT UTILISATEUR  ********/
			public void vueSelonStatut ()  {	
				switch (statut){
					case "Admin" : 
						v=4;
					break;
					case "Formateur" : 
						 v=2;
					break;
					case "Responsable" : 
						 v=3;
					break;
					default :
						 v=1;
					break;
				}
				//setChanged();
				//notifyObservers();
			}
}
			

	

	
	