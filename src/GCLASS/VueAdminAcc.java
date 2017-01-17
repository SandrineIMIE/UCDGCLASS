package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
//
public class VueAdminAcc extends JFrame {

	protected JPanel container = new JPanel();
	protected JMenu menu = new JMenu("Menu");
	protected JMenuItem parametres = new JMenuItem("Paramètres");
	protected JMenuItem deconnexion = new JMenuItem("Déconnexion");
	protected JLabel nomuser = new JLabel("Nom Utilisateur");
	protected JButton comptes = new JButton("Comptes");
	protected JButton promos = new JButton("Promos");
	protected JButton monplanning = new JButton("Mon Planning");
	protected JButton planninggene = new JButton("Planning Général");
	protected JPanel user = new JPanel();
	protected JPanel fonctions1 = new JPanel();
	protected JPanel fonctions2 = new JPanel();
	
	public VueAdminAcc(){
		
		JFrame fenetre = new JFrame("Admin");
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
		
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		//nomuser.setBackground(Color.LIGHT_GRAY);
		//nomuser.setOpaque(true);
		//nomuser.setSize(new Dimension(400, 100));
		//
		
		container.add(nomuser);
		
		fonctions1.setLayout(new BoxLayout(fonctions1, BoxLayout.LINE_AXIS));
		fonctions1.add(comptes);
		fonctions1.add(promos);
		fonctions2.setLayout(new BoxLayout(fonctions2, BoxLayout.LINE_AXIS));
		fonctions2.add(monplanning);
		fonctions2.add(planninggene);
		
		container.add(fonctions1);
		container.add(fonctions2);
		
		comptes.setSize(new Dimension(200, 30));
		promos.setSize(new Dimension(150, 30));
		
		this.setVisible(true);
	}
}
