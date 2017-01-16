package GCLASS;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;



public class Vue extends JFrame implements Observer {

	
	
	//POUR ORGANISER DONNES / ATTRIBUTS PANNEAUX BOUTONS  
	private Controleur _controleur;
	
	public Vue (Controleur controleur){
		super("Modele MVC");
		this._controleur = controleur;
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//_panneau.setlayout(LAYOUT ALEXIS)
		//
		
	}


	public void update(Observable arg0, Object arg1) {
		/*if(o instanceof Modele) {
			Modele m = (Modele)arg;
			_texte.setForeground(m.getCouleur());
			_bouton.setText(m.getTexte());*/
		
	}
}
