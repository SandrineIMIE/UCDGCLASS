package GCLASS;

import java.util.InputMismatchException;
import java.util.Scanner;



	/***************************** ATTRIBUTS DE MA CLASSE ***************************************/

public class Equipt {
	private String nom;
	private String salle;
	private int quantite;
	private String type;
	private int idsalle;
	
		
	/******************************* CONSTRUCTEURS ************************************************/

	public Equipt(String nom, String salle, int quantite, String type) {
		super();
		this.nom = nom;
		this.salle = salle;
		this.quantite = quantite;
		this.type = type;
	}
	public Equipt() {
		ajoutEquipt();
	}

	
	/******************************** GETTERS AND SETTERS *******************************************/

	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public int getIdsalle() {
		return idsalle;
	}
	
	
	/**************** METHODE DE CREATION D UN EQUIPEMENT POUR LE RESPONSABLE ****************/

	public void ajoutEquipt() {
		boolean isEntier;
		Scanner sc= new Scanner(System.in);

		System.out.println("Saisir le nom de l'équipement :");
		nom=sc.nextLine();
		System.out.println("Indiquer le type de l'équipement :");
		type=sc.nextLine();
		System.out.println("Saisir l'emplacement de l'équipement (nom de la salle) :");
		salle=sc.nextLine();
		System.out.println("Veuillez saisir la quantité de cet équipement dans la salle : ");
		do {
				isEntier = true;
				  try{
				  Scanner s = new Scanner(System.in);
			    quantite = s.nextInt();
			  } catch (InputMismatchException e) 
			  {
			    System.out.println("La valeur saisie n'est pas un entier. Merci de saisir une quantité. ");
			    isEntier = false;
			  }
			} while (isEntier != true);
			
	}
 
 
	public String toString() {
		String texte = " Nom : "+ nom + "\n Type : " + type + "\n Nom de la salle : "+ salle + "\n Quantité :" + quantite+ " ";
		return texte;
	}
	
	/**************** METHODE DE MODIFICATION D UN EQUIPEMENT POUR LE RESPONSABLE ****************/

	public void modifEquipt() {
		modifNomE() ;
		modifTypeE();
		modifSalleE();
		modifQuantiteE() ;
	}
	
	public void modifNomE() {
		Scanner sc= new Scanner(System.in);
		String ancien=getNom();
		System.out.println("Saisir le nouveau nom de l'équipement :");
		nom=sc.nextLine();
		System.out.println("Le nom de l'équipement est passé de "+ ancien + " à "+ nom);
	}
	
	public void modifTypeE() {
		Scanner sc= new Scanner(System.in);
		String ancien=getType();
		System.out.println("Saisir le nouveau type de l'équipement :");
		type=sc.nextLine();
		System.out.println("Le type de l'équipement est passé de "+ ancien + " à "+ type);
	}
	
	public void modifSalleE() {
		Scanner sc= new Scanner(System.in);
		String ancien=getSalle();
		System.out.println("Saisir la nouvelle salle de l'équipement :");
		salle=sc.nextLine();
		System.out.println("L'emplacement de l'équipement est passé de "+ ancien + " à "+ salle);
	}
	
	public void modifQuantiteE() {
		Scanner sc= new Scanner(System.in);
		int ancien=getQuantite();
		System.out.println("Saisir la nouvelle quantité de l'équipement :");
		quantite=sc.nextInt();
		System.out.println("La quantité de l'équipement est passée de "+ ancien + " à "+ quantite);
	}
}
