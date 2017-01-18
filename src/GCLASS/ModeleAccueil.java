package GCLASS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;

public class ModeleAccueil extends Observable {

	
		/******************ATTRIBUTS DE NOTRE CODE : données pour se logger  ******************/
	
		private String nom;
		private String prenom;
		private String login;
		private String password;
		private boolean valide;
		
		/****************** GETTERS AND SETTERS  ******************/
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
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
		
		public ModeleAccueil(String nom, String prenom, String login, String password) {
			this.nom = nom;
			this.prenom = prenom;
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
				System.out.println("bouh");
				  
				//Si login existe
				if(result.first())
				{
					PreparedStatement prepare2 = BDDConnectSingleton.getInstance().prepareStatement(query2, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
					prepare2.setString(1, log);
					prepare2.setString(2, mdp);
					
					ResultSet result2 = prepare2.executeQuery();
					//user identifie
					if(result2.first())
					{
						System.out.println("\nIdentification OK...\n");
						this.login = log;
						this.password = mdp;
						this.valide = true;
						
						res = true;
					}
					//Mot de passe non valide !
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
				System.out.println("Nom : "+ nom);
				System.out.println("Prénom : "+ prenom);
				System.out.println("Mot de passe : "+ password);
				setChanged();
			    notifyObservers();
			}
	}

	

	
	