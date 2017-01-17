package GCLASS;

import java.util.Scanner;

public class Promo {
	String nom;
	String description;
	int nbplaces;
	MaDate ddebut;
	MaDate dfin;
	boolean plein=false;
	int nbetudiant=0;
	String site;
	int idsite;
	
	// getter & setter
	
	public String getSite() {
		return site;
	}
	public int getNbetudiant() {
		return nbetudiant;
	}
	public void setNbetudiant(int nbetudiant) {
		this.nbetudiant = nbetudiant;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public int getIdsite() {
		return idsite;
	}
	public void setIdsite(int idsite) {
		this.idsite = idsite;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNbplaces() {
		return nbplaces;
	}
	public void setNbplaces(int nbplaces) {
		this.nbplaces = nbplaces;
	}
	public MaDate getDdebut() {
		return ddebut;
	}
	public void setDdebut(MaDate debut) {
		this.ddebut = debut;
	}
	public MaDate getDfin() {
		return dfin;
	}
	public void setDfin(MaDate fin) {
		this.dfin = fin;
	}
	public boolean isPlein() {
		return plein;
	}
	public void setPlein(boolean plein) {
		this.plein = plein;
	}
	
	public Promo ()
	{
		creerPromo();
	}
	
	public Promo(String nom, String description, int nbplaces, MaDate ddebut, MaDate dfin, String site) {
		super();
		this.nom = nom;
		this.description = description;
		this.nbplaces = nbplaces;
		this.ddebut = ddebut;
		this.dfin = dfin;
		this.site = site;
	}
	public void creerPromo() {
		ajoutNom();
		ajoutNbplaces();
		ajoutDescription();
		ajoutSite();
		ajoutDateDeb();
		ajoutDateFin();
			}
	
	public String toString() {
		String texte = " Promo : "+ nom + 
				"\n Dates de : " + ddebut + " à  : " + dfin + 
				"\n Description :" + description + 
				"\n Site : " + site+
				"\n Nombre de places :" + nbetudiant + "/"+nbplaces  ; 
		if (plein==true)		
			texte = texte +  "\n  promotion : complète" ;
		else 
			texte = texte +  "\n  promotion : non complète" ;
		return texte;
	}
	
	public boolean verifCapaciteP (){
		if (nbetudiant==nbplaces)		
			plein=true;
		return plein;
	}
	
	public void modifierPromo(){
		modifNom();
		modifNbplaces();
		modifDescription();
		modifSite();
		modifDateDeb();
		modifDateFin();
	}
	public void ajoutNom(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Saisir le nom : ");
		nom = sc.nextLine();		
	}
	public void ajoutNbplaces(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Saisir le nombre de place : ");   
		nbplaces = sc.nextInt();
	}
	public void ajoutDescription(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Saisir la description : ");
		description= sc.nextLine();
	}
	public void ajoutSite(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Choisir le site : ");// voir alexis menu déroulant
		site = sc.nextLine();
	}
	public void ajoutDateDeb(){
		System.out.println("Saisir la date de début : ");
		ddebut = new MaDate() ;
	}
	public void ajoutDateFin(){
		System.out.println("Saisir la date de fin: ");
		dfin = new MaDate();
	}
	
	public void modifNom(String nouveau){
		String ancien=getNom();
		setNom(nouveau);
		System.out.println("Le nom de la promo est passée de "+ancien+" à  "+nom);	
	}
	public void modifNbplaces(int nouveau){
		int ancien=getNbplaces();
		setNbplaces(nouveau);
		System.out.println("La capacité de la promo est passée de "+ancien+" à "+nbplaces);	
	}
	public void modifDescription(String nouveau){
		String ancien=getNom();
		setNom(nouveau);
		System.out.println("La description de la promo est passée de "+ancien+" à "+nom);	
	}
	public void modifSite(String nouveau){
		String ancien=getNom();
		setNom(nouveau);
		System.out.println("Le site de la promo est passée de "+ancien+" à "+nom);	
	}
	public void modifDateDeb(MaDate nouvelle){
		MaDate ancien=getDdebut();
		setDdebut(nouvelle);
		System.out.println("La date de début est passée de "+ancien+" à "+ddebut);	
	}
	public void modifDateFin(MaDate nouvelle){
		MaDate ancien=getDfin();
		setDfin(nouvelle);
		System.out.println("La date de fin est passée de "+ancien+" à "+dfin);	
	}
	
	public void modifNom(){
		String ancien=getNom();
		Scanner sc = new Scanner (System.in);
		System.out.println("Modifier le nom : ");
		setNom(sc.nextLine());
		System.out.println("Le nom de la promo est passée de "+ancien+" à  "+nom);	
	}
	public void modifNbplaces(){
		int ancien=getNbplaces();
		Scanner sc = new Scanner (System.in);
		System.out.println("Modifier la capacité : ");
		setNbplaces(sc.nextInt());
		System.out.println("La capacité de la promo est passée de "+ancien+" à "+nbplaces);	
	}
	public void modifDescription(){
		String ancien=getNom();
		Scanner sc = new Scanner (System.in);
		System.out.println("Modifier la description : ");
		setNom(sc.nextLine());
		System.out.println("La description de la promo est passée de "+ancien+" à "+nom);	
	}
	public void modifSite(){
		String ancien=getNom();
		Scanner sc = new Scanner (System.in);
		System.out.println("Modifier le site : ");// voir alexis menu déroulant
		setSite(sc.nextLine());
		System.out.println("Le site de la promo est passée de "+ancien+" à "+nom);	
	}
	public void modifDateDeb(){
		MaDate ancien=getDdebut();
		ddebut=new MaDate();
		System.out.println("La date de début est passée de "+ancien+" à "+ddebut);	
	}
	public void modifDateFin(){
		MaDate ancien=getDfin();
		dfin=new MaDate();
		System.out.println("La date de fin est passée de "+ancien+" à "+dfin);	
	}
}
