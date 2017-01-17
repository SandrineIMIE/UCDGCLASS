package GCLASS;

public class Main {
	
	
	public static void main (String[]args)
	{
			BDDConnectSingleton BDD2 = new BDDConnectSingleton();
			Modele notremodele = new Modele();
			Controleur controleur = new Controleur (notremodele);
			Vue notrevue = new Vue (controleur);
			notremodele.addObserver(notrevue);
			System.out.println("ok!");
		
			Utilisateur a = new Utilisateur();
			a.verifUser();
			
			VueAccueil fen = new VueAccueil();
			
	}
	
	
	
	
	
}
