package GCLASS;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

//*import com.sun.org.apache.bcel.internal.generic.NEW;*/

public class VueAdminComptes extends JFrame {

		protected JPanel container = new JPanel();
		protected JMenu menu = new JMenu("Menu");
		protected JMenu promos = new JMenu("Promos >");
		protected JMenu nomuser = new JMenu("Nom Utilisateur > Accueil");
		protected JMenuItem parametres = new JMenuItem("Paramètres");
		protected JMenuItem deconnexion = new JMenuItem("Déconnexion");
		//protected JLabel nomuser = new JLabel("Nom Utilisateur");
		protected JButton ajouter = new JButton("Ajouter");
		//protected JButton promos = new JButton("Promos");
		protected JButton modifier = new JButton("Modifier");
		protected JButton supprimer = new JButton("Supprimer");
		//protected JPanel user = new JPanel();
		protected JPanel fonctions = new JPanel();
		//protected JPanel fonctions2 = new JPanel();
		
		public VueAdminComptes(){
			
			JFrame fenetre = new JFrame("Admincomptes");
			this.setTitle("Logiciel");
			setSize(700,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.getContentPane().setVisible(true);
			this.setContentPane(container);
			this.setVisible(true);
			
			JMenuBar barreMenu = new JMenuBar();
			//barreMenu.setSize(700, 50);
			this.setJMenuBar(barreMenu);
			barreMenu.add(menu);
			menu.add(parametres);
			menu.addSeparator();
			menu.add(deconnexion);
			barreMenu.add(promos);
			barreMenu.add(nomuser);
			
			container.setLayout(new BorderLayout());
			
			JComboBox box1 = new JComboBox<>();
			box1.addItem(" Compte numero 1, imie le mans");
			box1.addItem(" Compte numero 2, imie le mans");
			box1.addItem(" Compte numero 3, imie le mans");
			
			container.add(box1, BorderLayout.CENTER);
			
			GridLayout grille = new GridLayout(3, 1);
			fonctions.setLayout(grille);
			fonctions.add(ajouter);
			fonctions.add(modifier);
			fonctions.add(supprimer);
			
			container.add(fonctions, BorderLayout.EAST);
			
			setVisible(true);
			
}
}

