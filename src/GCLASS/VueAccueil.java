package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//import com.sun.org.apache.bcel.internal.generic.NEW;

public class VueAccueil extends JFrame {

	
	protected JTextField login2 = new JTextField();
	protected JTextField mdp2 = new JTextField();
	protected JPanel accueil = new JPanel(); 
	protected JPanel identifiants = new JPanel();
	protected JPanel identifiants1 = new JPanel();
	protected JPanel boutonok = new JPanel();
	protected JPanel bienv = new JPanel();
	protected JLabel bienvenue = new JLabel("Bienvenue sur UCD, connectez-vous !", SwingConstants.CENTER);
	protected JLabel login1 = new JLabel("Login", SwingConstants.CENTER);
	protected JLabel mdp1 = new JLabel("Mot de passe", SwingConstants.CENTER);
	protected JButton ok = new JButton("Ok");
	
	public VueAccueil(){
		
		JFrame fenetre = new JFrame("Logiciel");
		this.setTitle("Logiciel");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setVisible(true);
		this.setContentPane(accueil);
		
		accueil.setLayout(new BoxLayout(accueil, BoxLayout.PAGE_AXIS));
		bienv.add(bienvenue);
		bienvenue.setPreferredSize(new Dimension(300, 50));
		accueil.add(bienv);
		//bienvenue.setBackground(Color.black);
		//bienvenue.setOpaque(true);
		
		
		login1.setPreferredSize(new Dimension(150, 30));
		login1.setBackground(Color.white);
		login1.setOpaque(true);
		login2.setPreferredSize(new Dimension(150, 30));
		login2.setBackground(Color.white);
		login2.setOpaque(true);
		identifiants.add(login1);
		identifiants.add(login2);
		accueil.add(identifiants);
		
		mdp1.setPreferredSize(new Dimension(150, 30));
		mdp1.setBackground(Color.white);
		mdp1.setOpaque(true);
		mdp2.setPreferredSize(new Dimension(150, 30));
		mdp2.setBackground(Color.white);
		mdp2.setOpaque(true);
		
		identifiants1.add(mdp1);
		identifiants1.add(mdp2);
		accueil.add(identifiants1);
		
		ok.setPreferredSize(new Dimension(60,40));
		boutonok.add(ok);
		accueil.add(boutonok);
		
		setVisible(true);
		
		
		
		}
}
