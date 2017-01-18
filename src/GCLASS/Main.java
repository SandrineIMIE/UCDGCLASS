package GCLASS;

public class Main {
	//
	
	public static void main (String[]args)
	{
		
			ModeleAccueil notremodele = new ModeleAccueil();
			Controleur controleur = new Controleur (notremodele);
			VueAccueil notrevue = new VueAccueil (controleur);
			notremodele.addObserver(notrevue);		
			
	}

	

	  
	
	
}
			
			
			
			//Statement state= BDD2.createStatement() ;
			
			/*parametère regarde*/
			
			/*PreparedStatement prepare = BDD2.prepareStatement(texteams);
			System.out.println(prepare.toString());*/
			
			
			/****creation requete
			String query = "SELECT * FROM utilisateur WHERE prenom_user='Test'";  
			
			try {    
				 Class.forName("org.postgresql.Driver");

			    //On exécute la requête
				 System.out.println(query);
				 ResultSet res = state.executeQuery(query);	

				ajout
			//state.executeUpdate("INSERT INTO utilisateur "
			//	+ "(id_user, prenom_user, nom_user, mdp_user, statut_user, fk_id_promo, login_user) "
			  	//	+ "VALUES (16,'test','test','test','ETUDIANT',1,'test')");
			  
			  supprimer
			  
			  state.executeUpdate("DELETE FROM utilisateur WHERE (id_user=16)");
				
			  modifier */
	
//				  PreparedStatement prepare = BDD2.prepareStatement("UPDATE utilisateur "
//				  + "SET prenom_user=?, nom_user=?, mdp_user=?, statut_user=?, fk_id_promo=?, login_user=? "
//				  + "WHERE prenom_user='Test'");
//				  
//			      //On exécute
//				  prepare.setString(1, "Axel");
//				  prepare.setString(2, "Aire");
//				  prepare.setString(3, "Aire");
//				  prepare.setString(4, "Etudiant");
//				  prepare.setInt(5, 1);
//				  prepare.setString(6, "Aire");
//				  prepare.executeUpdate();
//				  prepare.close();
//				 
//				  
//				  res.close();
//			    state.close();  
//			    
//			} 
//			
//			catch (ClassNotFoundException e) {
//			    e.printStackTrace();
//			  } catch (SQLException e) {
//			    e.printStackTrace();
//			  }     
			
		
