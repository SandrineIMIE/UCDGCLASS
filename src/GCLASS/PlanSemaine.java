package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PlanSemaine extends JPanel {
	
	protected JPanel semaine;
	private Planning j1;
	private Planning j2;
	private Planning j3;
	private Planning j4;
	private Planning j5;
	
	public  PlanSemaine(){
		semaine = new JPanel();
		j1 = new Planning(new String("19/01/2017"),new String("Lundi"), new String("cours1"),new String("Salle1"),new String("prof1"),new String("promo1"));
		j2 = new Planning(new String("20/01/2017"), new String("Marddi"),new String("cours2"),new String("Salle2"),new String("prof2"),new String("promo2"));;
		j3 = new Planning(new String("21/01/2017"), new String("Mercredi"),new String("cours3"),new String("Salle3"),new String("prof3"),new String("promo3"));;
		j4 = new Planning(new String("(22/01/2017"), new String("Jeudi"),new String("cours4"),new String("Salle4"),new String("prof4"),new String("promo4"));;
		j5 = new Planning(new String("23/01/2017"),new String("Vendredi"), new String("cours5"),new String("Salle5"),new String("prof5"),new String("promo5"));;
		
		/*mise en page*/
		this.setLayout(new BorderLayout());
		GridLayout semaine = new GridLayout(1,5);
		this.setLayout(semaine);
		this.setVisible(true);
		 this.add(j1);
		 this.add(j2);
	    this.add(j3);    
	    this.add(j4);    
	    this.add(j5);
		
	    /*mise en forme*/
		this.setBackground(Color.white);
		Border border = LineBorder.createGrayLineBorder();
	    j1.setBorder(border);
	    j2.setBorder(border);
	    j3.setBorder(border);
	    j4.setBorder(border);
	    j5.setBorder(border);
	}
}
