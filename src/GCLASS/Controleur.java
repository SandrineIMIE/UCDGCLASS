package GCLASS;

import java.util.Scanner;

public class Controleur {
private ModeleAccueil modele;	

	
	public Controleur(ModeleAccueil mod) {
		modele = mod;
	}
	
	/**
	 * VUE SIGNALE LES ACTIONS QUI ONT CHANGE
	 */
	public void verifIdentifiants(String login, String mdp){
		modele.verifierIdentifiants(login, mdp);
	}
	
	
}