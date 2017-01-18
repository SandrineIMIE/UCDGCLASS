package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;



public class Vue extends JFrame implements Observer {

	//POUR ORGANISER DONNES / ATTRIBUTS PANNEAUX BOUTONS  //
	protected Controleur _controleur;

	// VUE CONNEXION
	protected JLabel login1 = new JLabel("Login", SwingConstants.CENTER);
	protected JLabel mdp1 = new JLabel("Mot de passe", SwingConstants.CENTER);
	protected JTextField login2 = new JTextField();
	protected JPasswordField mdp2 = new JPasswordField();
	protected JPanel panelid1 = new JPanel();
	protected JPanel panelid2 = new JPanel();
	protected JPanel panelbouton = new JPanel();
	protected JPanel panelBienvenue = new JPanel();
	protected JLabel bienvenue = new JLabel("Bienvenue sur UCD, connectez-vous !", SwingConstants.CENTER);
	protected JButton boutonOk = new JButton("Ok");

	// VUE ADMIN ACCUEIL
	protected JPanel container = new JPanel();
	protected JMenu menu = new JMenu("Menu");
	protected JMenuItem parametres = new JMenuItem("Paramètres");
	protected JMenuItem deconnexion = new JMenuItem("Déconnexion");
	protected JButton boutonComptes = new JButton("Comptes");
	protected JButton boutonSalles = new JButton("Salles");
	protected JButton boutonPromos = new JButton("Promos");
	protected JButton boutonPlaPerso = new JButton("Mon Planning");
	protected JButton BoutonPlaGe = new JButton("Planning Général");
	protected JPanel user = new JPanel();
	protected JPanel panelFonc = new JPanel();
	protected JPanel panelFonc2 = new JPanel();
	protected JPanel panelFonc3 = new JPanel();

	//VUE ADMIN COMPTES


	protected JMenu menuPromos = new JMenu("Promos");
	protected JMenu menuPlaPerso = new JMenu("Planning Personnel");
	protected JButton boutonAjouter = new JButton("Ajouter");
	protected JButton boutonModifier = new JButton("Modifier");
	protected JButton boutonSupprimer = new JButton("Supprimer");
	protected JComboBox box1 = new JComboBox<>();
	protected JPanel listeArea = new JPanel ();

	// VUE ADMIN PROMOS


	protected JMenu menuComptes = new JMenu("Comptes");
	protected JMenu menuAccueil = new JMenu("Accueil");
	protected JMenu menuSalles = new JMenu("Salles");
	protected JMenu menuPlaG = new JMenu("Planning Général");
	protected JMenu separator1 = new JMenu(" | ");
	protected JMenu separator2 = new JMenu(" | ");
	protected JMenu separator3 = new JMenu(" | ");
	protected JMenu separator4 = new JMenu(" | ");
	protected JMenu separator5 = new JMenu(" | ");

	// VUE RESPONSABLE ACCUEIL

	protected JLabel nomuser = new JLabel("Nom Utilisateur", SwingConstants.CENTER);
	protected JButton resa = new JButton("Gérer Réservation");
	protected JPanel panelboutons1 = new JPanel();
	protected JPanel panelboutons2 = new JPanel();

	// VUE RESPONSABLE PLANNING PERSO
	protected JLabel labelPlanning = new JLabel();

	//VUE FENETRE AJOUTER
	protected JLabel prenom = new JLabel("Prenom :");
	protected JLabel nom = new JLabel("Nom :");
	protected JLabel login = new JLabel("Login :");
	protected JLabel mdp = new JLabel("Mot de passe :");
	protected JLabel statut = new JLabel("Statut :");
	protected JTextField nomtext = new JTextField();
	protected JTextField prenomtext = new JTextField();
	protected JTextField statutext = new JTextField();
	protected JComboBox<Object> statutCombo = new JComboBox<>();
	
	
	public Vue (){
		super("Modele MVC");
		//this._controleur = controleur;
		JFrame fenetre = new JFrame("Fenêtre Logiciel");
		this.setTitle("G-CLASS");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		fenetre.setIconImage(new ImageIcon("logoucd.png").getImage());
		this.getContentPane().setVisible(true);
		this.setContentPane(container);
		this.setVisible(true);

		//VueConnexion();
		//VueAdminAccueil();
		VueAdminComptes();
		//VueAdminPromos();
		//VueAdminSalles();
		//VueAdminPlaPerso();
		//VueAdminPlaGeneral();
		//VueRespAccueil();
		//VueRespReservation();
		//VueRespSalles();
		//VueRespPlaPerso();
		//VueRespPlaGeneral();
		//VueFormateurAccueil();
		//VueFormateurPlaPerso();
		//VueFormateurPlaGeneral();
		//VueEtudiantPlaGeneral();
		//FenetreAjoutCompte();
	}


	public void VueConnexion() {


		container.setBackground(Color.DARK_GRAY);
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		panelBienvenue.add(bienvenue);
		bienvenue.setPreferredSize(new Dimension(400, 100));
		container.add(panelBienvenue);
		panelBienvenue.setOpaque(false);
		bienvenue.setForeground(Color.WHITE);
		bienvenue.setFont(new Font("Arial", Font.BOLD,18));

		login1.setPreferredSize(new Dimension(150, 30));
		login1.setBackground(Color.white);
		login1.setOpaque(true);
		login2.setPreferredSize(new Dimension(200, 30));
		login2.setBackground(Color.white);
		login2.setOpaque(true);
		panelid1.add(login1);
		panelid1.add(login2);
		container.add(panelid1);
		panelid1.setOpaque(false);

		mdp1.setPreferredSize(new Dimension(150, 30));
		mdp1.setBackground(Color.white);
		mdp1.setOpaque(true);
		mdp2.setPreferredSize(new Dimension(200, 30));
		mdp2.setBackground(Color.white);
		mdp2.setOpaque(true);

		panelid2.add(mdp1);
		panelid2.add(mdp2);
		container.add(panelid2);
		panelid2.setOpaque(false);

		boutonOk.setPreferredSize(new Dimension(60,40));
		boutonOk.setBackground(Color.WHITE);
		panelbouton.add(boutonOk);
		container.add(panelbouton);
		panelbouton.setOpaque(false);

		setVisible(true);

	}

	public void VueAdminAccueil(){

		container = new JPanel();
		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);

		container.setLayout(new BorderLayout());
		nomuser.setPreferredSize(new Dimension(700, 100));
		user.add(nomuser);
		container.add(user, BorderLayout.NORTH);

		panelFonc2.setLayout(new GridLayout(1, 3));
		panelFonc3.setLayout(new GridLayout(1, 2));
		panelFonc.setLayout(new BoxLayout(panelFonc, BoxLayout.PAGE_AXIS));

		panelFonc2.add(boutonComptes);
		panelFonc2.add(boutonPromos);
		panelFonc2.add(boutonSalles);

		panelFonc3.add(boutonPlaPerso);
		panelFonc3.add(BoutonPlaGe);

		panelFonc.add(panelFonc2);
		panelFonc.add(panelFonc3);
		container.add(panelFonc);

		setContentPane(container);
		this.setVisible(true);
	}

	public void VueAdminComptes(){

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuPromos);
		barreMenu.add(separator2);
		barreMenu.add(menuSalles);
		barreMenu.add(separator3);
		barreMenu.add(menuPlaPerso);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		separator5.setEnabled(false);

		container.setLayout(new BorderLayout());

		JScrollPane scrollPane = new JScrollPane(listeArea);
		scrollPane.setPreferredSize(new Dimension(900,700));
		
		container.add(listeArea, BorderLayout.CENTER);

		GridLayout grille = new GridLayout(3, 1);
		panelFonc.setLayout(grille);
		panelFonc.add(boutonAjouter);
		panelFonc.add(boutonModifier);
		panelFonc.add(boutonSupprimer);

		container.add(panelFonc, BorderLayout.EAST);

		setVisible(true);
	}

	public void VueAdminPromos(){

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuComptes);
		barreMenu.add(separator2);
		barreMenu.add(menuSalles);
		barreMenu.add(separator3);
		barreMenu.add(menuPlaPerso);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		separator5.setEnabled(false);

		container.setLayout(new BorderLayout());

		JScrollPane scrollPane = new JScrollPane(listeArea);
		scrollPane.setPreferredSize(new Dimension(200,70));
		
		container.add(listeArea, BorderLayout.CENTER);

		GridLayout grille = new GridLayout(3, 1);
		panelFonc.setLayout(grille);
		panelFonc.add(boutonAjouter);
		panelFonc.add(boutonModifier);
		panelFonc.add(boutonSupprimer);

		container.add(panelFonc, BorderLayout.EAST);

		setVisible(true);
	}

	public void VueAdminSalles(){

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuComptes);
		barreMenu.add(separator2);
		barreMenu.add(menuPromos);
		barreMenu.add(separator3);
		barreMenu.add(menuPlaPerso);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		separator5.setEnabled(false);

		container.setLayout(new BorderLayout());

		JScrollPane scrollPane = new JScrollPane(listeArea);
		scrollPane.setPreferredSize(new Dimension(200,70));
		
		container.add(listeArea, BorderLayout.CENTER);

		GridLayout grille = new GridLayout(3, 1);
		panelFonc.setLayout(grille);
		panelFonc.add(boutonAjouter);
		panelFonc.add(boutonModifier);
		panelFonc.add(boutonSupprimer);

		container.add(panelFonc, BorderLayout.EAST);

		setVisible(true);
	}

	public void VueAdminPlaPerso(){

		labelPlanning.setText("Planning Personnel");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuComptes);
		barreMenu.add(separator2);
		barreMenu.add(menuPromos);
		barreMenu.add(separator3);
		barreMenu.add(menuPlaPerso);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		separator5.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}

	public void VueAdminPlaGeneral(){

		labelPlanning.setText("Planning Général");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuComptes);
		barreMenu.add(separator2);
		barreMenu.add(menuPromos);
		barreMenu.add(separator3);
		barreMenu.add(menuPlaPerso);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		separator5.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}

	public void VueRespAccueil(){

		JMenuBar barreMenu = new JMenuBar();

		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);

		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

		user.add(nomuser);
		container.add(user);

		nomuser.setBackground(Color.DARK_GRAY);
		nomuser.setOpaque(true);
		nomuser.setPreferredSize(new Dimension(400, 60));
		nomuser.setForeground(Color.WHITE);
		nomuser.setFont(new Font("Arial", Font.PLAIN,30));

		panelboutons1.setLayout(new GridLayout(2, 2));
		panelboutons1.add(resa);
		panelboutons1.add(boutonSalles);
		resa.setBounds(200, 200, 400, 400);
		boutonSalles.setBounds(100, 100, 100, 100);

		panelboutons1.add(boutonPlaPerso);
		panelboutons1.add(BoutonPlaGe);
		boutonPlaPerso.setBounds(100, 100, 100, 100);
		BoutonPlaGe.setBounds(100, 100, 100, 100);

		container.add(panelboutons1);

		this.setVisible(true);

	}

	public void VueRespReservation(){

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuPromos);
		barreMenu.add(separator2);
		barreMenu.add(menuSalles);
		barreMenu.add(separator3);
		barreMenu.add(menuPlaPerso);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		
		container.setLayout(new BorderLayout());

		JScrollPane scrollPane = new JScrollPane(listeArea);
		scrollPane.setPreferredSize(new Dimension(200,70));
		
		container.add(listeArea, BorderLayout.CENTER);

		GridLayout grille = new GridLayout(3, 1);
		panelFonc.setLayout(grille);
		panelFonc.add(boutonAjouter);
		panelFonc.add(boutonModifier);
		panelFonc.add(boutonSupprimer);

		container.add(panelFonc, BorderLayout.EAST);

		setVisible(true);
	}

	public void VueRespSalles(){
		
		labelPlanning.setText("Liste des salles de l'école");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuPromos);
		barreMenu.add(separator2);
		barreMenu.add(menuPlaPerso);
		barreMenu.add(separator3);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);

		container.setLayout(new BorderLayout());

		JScrollPane scrollPane = new JScrollPane(listeArea);
		scrollPane.setPreferredSize(new Dimension(200,70));
		
		container.add(listeArea, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}
	
	public void VueRespPlaPerso(){

		labelPlanning.setText("Planning Personnel");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuComptes);
		barreMenu.add(separator2);
		barreMenu.add(menuPromos);
		barreMenu.add(separator3);
		barreMenu.add(menuSalles);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		separator5.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}
	
	public void VueRespPlaGeneral(){

		labelPlanning.setText("Planning Général");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuComptes);
		barreMenu.add(separator2);
		barreMenu.add(menuPromos);
		barreMenu.add(separator3);
		barreMenu.add(menuSalles);
		barreMenu.add(separator4);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);
		separator2.setEnabled(false);
		separator3.setEnabled(false);
		separator4.setEnabled(false);
		separator5.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}
	
	public void VueFormateurAccueil(){

		JMenuBar barreMenu = new JMenuBar();

		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);

		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

		user.add(nomuser);

		nomuser.setBackground(Color.DARK_GRAY);
		nomuser.setOpaque(true);
		nomuser.setPreferredSize(new Dimension(400, 60));
		nomuser.setForeground(Color.WHITE);
		nomuser.setFont(new Font("Arial", Font.PLAIN,30));

		panelboutons1.setLayout(new GridLayout(1,2));
		panelboutons1.add(boutonPlaPerso);
		panelboutons1.add(BoutonPlaGe);
		boutonPlaPerso.setPreferredSize(new Dimension(200, 80));
		//boutonPlaPerso.setBounds(100, 100, 100, 100);
		//BoutonPlaGe.setBounds(100, 100, 100, 100);

		container.add(user);
		container.add(panelboutons1);

		this.setVisible(true);

	}

	public void VueFormateurPlaPerso(){

		labelPlanning.setText("Planning Personnel");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}
	
	public void VueFormateurPlaGeneral(){

		labelPlanning.setText("Planning Général");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuPlaPerso);

		separator1.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}
	
	public void VueEtudiantAccueil(){

		JMenuBar barreMenu = new JMenuBar();

		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);

		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

		user.add(nomuser);

		nomuser.setBackground(Color.DARK_GRAY);
		nomuser.setOpaque(true);
		nomuser.setPreferredSize(new Dimension(400, 60));
		nomuser.setForeground(Color.WHITE);
		nomuser.setFont(new Font("Arial", Font.PLAIN,30));

		panelboutons1.setLayout(new GridLayout(1,2));
		panelboutons1.add(boutonPlaPerso);
		panelboutons1.add(BoutonPlaGe);
		boutonPlaPerso.setPreferredSize(new Dimension(200, 80));
		//boutonPlaPerso.setBounds(100, 100, 100, 100);
		//BoutonPlaGe.setBounds(100, 100, 100, 100);

		container.add(user);
		container.add(panelboutons1);

		this.setVisible(true);

	}
	
	public void VueEtudiantPlaPerso(){

		labelPlanning.setText("Planning Personnel");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuPlaG);

		separator1.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}
	
	public void VueEtudiantPlaGeneral(){

		labelPlanning.setText("Planning Général");

		JMenuBar barreMenu = new JMenuBar();
		this.setJMenuBar(barreMenu);
		barreMenu.add(menu);
		barreMenu.add(separator5);
		menu.add(parametres);
		menu.addSeparator();
		menu.add(deconnexion);
		barreMenu.add(menuAccueil);
		barreMenu.add(separator1);
		barreMenu.add(menuPlaPerso);

		separator1.setEnabled(false);

		container.setLayout(new BorderLayout());

		box1.addItem(" Semaine numero 1, imie le mans");
		box1.addItem(" Semaine numero 2, imie le mans");
		box1.addItem(" Semaine numero 3, imie le mans");

		container.add(box1, BorderLayout.CENTER);

		panelFonc.add(labelPlanning);
		container.add(panelFonc, BorderLayout.NORTH);

		setVisible(true);
	}
	
	public void FenetreAjoutCompte(){
		
		JFrame fenetre = new JFrame("Fenêtre fonction ajouter");
		this.setTitle("Ajouter");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.getContentPane().setVisible(true);
		this.setContentPane(container);
		
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		panelid1.setLayout(new BoxLayout(panelid1, BoxLayout.LINE_AXIS));
		panelid1.add(prenom);
		prenom.setPreferredSize(new Dimension(140, 20));
		panelid1.add(prenomtext);
		prenomtext.setPreferredSize(new Dimension(200, 20));
		
		panelid2.setLayout(new BoxLayout(panelid2, BoxLayout.LINE_AXIS));
		panelid2.add(nom);
		nom.setPreferredSize(new Dimension(140, 20));
		panelid2.add(nomtext);
		nomtext.setPreferredSize(new Dimension(200, 20));
		
		panelFonc.setLayout(new BoxLayout(panelFonc, BoxLayout.LINE_AXIS));
		panelFonc.add(login);
		login.setPreferredSize(new Dimension(140, 20));
		panelFonc.add(login2);
		login2.setPreferredSize(new Dimension(200, 20));
		
		panelFonc2.setLayout(new BoxLayout(panelFonc2, BoxLayout.LINE_AXIS));
		panelFonc2.add(mdp);
		mdp.setPreferredSize(new Dimension(140, 20));
		panelFonc2.add(mdp2);
		mdp2.setPreferredSize(new Dimension(200, 20));
		
		panelFonc3.setLayout(new BoxLayout(panelFonc3, BoxLayout.LINE_AXIS));
		panelFonc3.add(statutCombo);
		statutCombo.addItem("Etudiant");
		statutCombo.addItem("Formateur");
		statutCombo.addItem("Responsable Pedagogique");
		statutCombo.addItem("Admin");
		
		panelboutons1.setLayout(new BoxLayout(panelboutons1, BoxLayout.LINE_AXIS));
		panelboutons1.add(boutonOk);
		
		container.add(panelid1);
		container.add(panelid2);
		container.add(panelFonc);
		container.add(panelFonc2);
		container.add(panelFonc3);
		container.add(panelboutons1);
		
		this.setVisible(true);
		}
	
	/**************************** ACTION LISTENER**********/




	/*******UPDATE********/

	public void update(Observable arg0, Object arg1) {
		/*if(o instanceof Modele) {
			Modele m = (Modele)arg;
			_texte.setForeground(m.getCouleur());
			_bouton.setText(m.getTexte());*/

	}
}



