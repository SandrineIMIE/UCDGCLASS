package GCLASS;

import java.util.Scanner;

public class Controleur {
private Modele modele;	
	
	public Controleur(Modele mod) {
		modele = mod;
	}
	
	/**
	 * VUE SIGNALE LES ACTIONS QUI ONT CHANGE
	 */
	
			/*********************************** METHODE DE VERIFICATION USER est RESPONSABLE pour créer RESERVATION ***********/
			
			
			public void verifResponsable(){    //on avertit le modele du changement
				modele.verifResponsable();
			}
		
}


