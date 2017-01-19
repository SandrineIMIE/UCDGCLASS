package GCLASS;

import java.util.Scanner;
//
public class Resa {
	
	/***************************** ATTRIBUTS DE MA CLASSE ***************************************/
	
	private String salle;
	private String cours;
	private String promo;
	private String prof;
	private String date;
	private int idcours;
	private int idsalle;
	private int idpromo;
	private int idprof;
	
	/******************************* CONSTRUCTEURS ************************************************/

	public Resa( String salle, String cours, String promo, String prof, String date) {
		super();
		this.date=date;
		this.salle = salle;
		this.cours = cours;
		this.promo = promo;
		this.prof = prof;
	}
	
	public Resa() {
		ajoutResa();
	}
	
	/******************************** GETTERS AND SETTERS *******************************************/

	
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public String getCours() {
		return cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public int getIdcours() {
		return idcours;
	}
	public int getIdsalle() {
		return idsalle;
	}
	public int getIdpromo() {
		return idpromo;
	}

	public int getIdprof() {
		return idprof;
	}	

	/**************** METHODE DE CREATION D UNE RESERVATION POUR LE RESPONSABLE ****************/

	
	public void ajoutResa() {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Saisir le nom de la salle :");
		salle=sc.nextLine();
		System.out.println("Saisir le nom du cours  :");
		cours=sc.nextLine();
		System.out.println("Saisir le nom du promo  :");
		promo=sc.nextLine();
		System.out.println("Saisir le nom du formateur  :");
		prof=sc.nextLine();
		System.out.println("Saisir la date de la réservation");
		date=sc.nextLine();
	}	
	
	public String toString() {
		String texte = " Le " +date + ", le formateur " + prof + 
				" donnera un cours de " + cours + " aux élèves de la promo " + promo + " dans la salle " + salle + ".";
		return texte;
	}
	
	
	
	/**************** METHODE DE MODIFICATION D UNE RESERVATION  POUR LE RESPONSABLE ****************/

	public void modifResa (String nvsalle, String nvcours, String nvpromo, String nvformateur){ 	
		modifPromoR(nvpromo);
		modifSalleR(nvsalle);
		modifCoursR(nvcours);
		modifProfR(nvformateur);
	
	}	
	
	public void modifResa() {
	}	
	
	public void modifSalleR() {
		String ancien=getSalle();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir la nouvelle  salle qui sera affectée :");
		salle=sc.nextLine();
		System.out.println("La salle est passée de "+ancien+" à  "+salle);	
	}
	public void modifSalleR(String nouveau) {
		setSalle(nouveau);
	}
	
	public void modifCoursR(){	
		String ancien=getCours();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir le nouveau cours qui sera affecté :");
		cours=sc.nextLine();
		System.out.println("Le cours est passé de "+ancien+" à  "+salle);
	}	
	public void modifCoursR(String nouveau) {
		setCours(nouveau);	
	}
	
	public void modifPromoR() {
		String ancien=getPromo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir la nouvelle promotion qui sera affectée :");
		promo=sc.nextLine();
		System.out.println("La promotion est passée de "+ancien+" à  "+promo);	
	}
	public void modifPromoR(String nouveau) {
		setPromo(nouveau);
	}
	
	public void modifProfR() {
		String ancien=getPromo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir le nom du nouveau formateur qui sera affectée :");
		prof=sc.nextLine();
		System.out.println("Le formateur est passé de "+ancien+" à "+prof);	
	}
	public void modifProfR(String nouveau) {
		setProf(nouveau);
	}
	
	public void modifDate() {
		String ancien=getDate();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir la nouvelle date de la réservation");
		System.out.println("- le jour (format 00) : ");
		int jour=sc.nextInt();
		System.out.println("- le mois (format 00) : ");
		int mois=sc.nextInt();
		System.out.println(" - l'année (format 0000) :");
		int annee=sc.nextInt();
		date=jour+"/"+mois+"/"+annee;
		System.out.println("La date est passée de "+ancien+" à "+date);			
	}
	public void modifDate(String nouveau) {
		setDate(nouveau);
	}
	
	
}
