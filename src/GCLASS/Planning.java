package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Planning extends JPanel{
	
	protected JPanel agenda;
	private String salle;
	private String cours;
	private String promo;
	private String prof;
	private String jourdate;
	private String date;
	protected JLabel nomdate;
	protected JLabel nomcours;
	protected JLabel nomprof;
	protected JLabel nompromo;
	protected JLabel nomsalle;
	protected JLabel nomjour;;
	
	public Planning (String adate,String ajour, String acours, String asalle, String aprof, String apromo){
		
		/*mise a jour des données*/
		date=adate;
		salle=asalle;
		cours=acours;
		promo=apromo;
		prof=aprof;
		jourdate=ajour;
		dessinerPlanning();
	}
	
	public Planning(){
	
		/*mise a jour des données*/
		date = "19/01/2017";
		salle="PROF";
		cours="HTML";
		promo="promo2";
		prof="tata";
		jourdate="Jour";
		dessinerPlanning();
	}
	
	public void dessinerPlanning(){
		String testedate=""+date;
		nomjour=new JLabel(jourdate,SwingConstants.CENTER);
		nomdate= new JLabel(testedate,SwingConstants.CENTER);
		nomcours =new JLabel(cours,SwingConstants.CENTER);
		nomprof =new JLabel(prof,SwingConstants.CENTER);
		nompromo =new JLabel(promo,SwingConstants.CENTER);
		nomsalle =new JLabel(salle,SwingConstants.CENTER); 
		agenda = new JPanel();

		/*mise en page*/
		this.setLayout(new BorderLayout());
		GridLayout jour = new GridLayout(6,1);
		this.setLayout(jour);
		this.setVisible(true);
		this.add(nomjour);
	    this.add(nomdate);
		this.add(nomcours);
	    this.add(nomprof);
	    this.add(nomsalle);
	    this.add(nompromo); 
		
	    /*mise en forme*/
		this.setBackground(Color.white);
	    nomjour.setBackground(Color.LIGHT_GRAY);
	    nomjour.setOpaque(true);
	    nomjour.setForeground(Color.white);
	    nomdate.setBackground(Color.orange);
	    nomdate.setOpaque(true);
	    nomdate.setForeground(Color.white);
	    Border border = LineBorder.createGrayLineBorder();
	    nomjour.setBorder(border);
	    nomdate.setBorder(border);
	    nomcours.setBorder(border);
	    nomprof.setBorder(border);
	    nomsalle.setBorder(border);
	    nompromo.setBorder(border);
	}
	

}
