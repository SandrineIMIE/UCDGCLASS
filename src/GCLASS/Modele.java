package GCLASS;

import java.awt.Color;
import java.util.Observable;
import java.util.Scanner;

public class Modele extends Observable {

	
	//ATTRIBUTS DE NOTRE CODE
	
	//CONSTRUCTEUR
	
	//GETTERS
	
	//METHODES

	
	
	public void verifResponsable(){    //on avertit le modele du changement
				
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrer votre statut");
	while (!sc.hasNext("responsable")) {
	    System.out.println("Vous n'�tes pas autoris�(e) � cr�er une r�servation");
	    sc.next();
	}
	String responsable = sc.next();
	System.out.println("Merci. Vous �tes bien le " + responsable);
		setChanged();				
		notifyObservers(this); 		
	}
	
	/*Ajouter � CHACUNE DES METHODES 
	setChanged();
	notifyObservers(this);*/
}
