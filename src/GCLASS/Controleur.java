package GCLASS;


public class Controleur {
	
	/**************************** ATTRIBUTS **********************/

	
private ModeleAccueil modele;	


	/**************************** CONSTRUCTEUR **********************/

	
	public Controleur(ModeleAccueil mod) {
		modele = mod;
	}
	
	/**************************** METHODES QUI SIGNALENT CHANGEMENTS **********************/
	
	
	public void verifIdentifiants(String login, String mdp){
		modele.verifierIdentifiants(login, mdp);
	}
	
	public void verifStatut(String login){
		modele.verifStatut();
	}
	public void vueSelonStatut(String statut){
		modele.vueSelonStatut();
	}
	
}