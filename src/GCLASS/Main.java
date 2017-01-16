package GCLASS;

public class Main {
	
	
	public static void main (String[]args)
	{
			Connect BDD2 = new Connect();
			Modele notremodele = new Modele();
			Controleur controleur = new Controleur (notremodele);
			Vue notrevue = new Vue (controleur);
			notremodele.addObserver(notrevue);
			System.out.println("ok!");
	}
	
	
	
	
	
}
