package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Planning extends JPanel{
	
	protected JPanel agenda;
	private String salle="dodo";
	private String cours="dada";
	private String promo="promo";
	private String prof="tata";
	private String datedujour="aujourd'hui";
	private MaDate date;
	JLabel bandeau;
	protected JLabel nomcours =new JLabel("Cours : "+cours);
	protected JLabel nomprof =new JLabel("Formateur : "+prof);
	protected JLabel nomsalle =new JLabel("Emplacement : "+salle);
	protected JLabel nompromo =new JLabel("Pour : "+promo);
	
	public Planning(){
		date = new MaDate (19,1,2017);
		agenda = new JPanel();
		setVisible(true);
		setLayout(new BorderLayout());
		GridLayout jour = new GridLayout(5,1);
		agenda.setBackground(Color.cyan);
		agenda.setLayout(jour);
		//String textedate=date.toString();
		bandeau =new JLabel(datedujour);
		bandeau.setBackground(Color.white);
		bandeau.setOpaque(true);
		agenda.add(bandeau);
		nomcours.setVisible(true);
	    agenda.add(nomcours);
	    agenda.add(nomprof);
	    agenda.add(nomsalle);
	    agenda.add(nompromo);
	    agenda.add(nompromo);
	}

}
