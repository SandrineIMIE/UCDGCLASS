package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VueAccueil extends JFrame implements Observer {

	
	/**************************** ATTRIBUTS **********************/

	protected JTextField login2 = new JTextField();
	protected JTextField mdp2 = new JTextField();
	protected JPanel accueil = new JPanel(); 
	protected JPanel identifiants = new JPanel();
	protected JPanel identifiants1 = new JPanel();
	protected JPanel vueadmin= new JPanel();
	protected JPanel vueres = new JPanel();
	protected JPanel vueformateur = new JPanel();
	protected JPanel vueetudiant= new JPanel();
	protected Planning jour= new Planning(new String("19/01/2017"),new String("Lundi"), new String("cours1"),new String("Salle1"),new String("prof1"),new String("promo1"));
	protected int codevue=1;
	protected JPanel boutonok = new JPanel();
	protected JPanel bienv = new JPanel();
	protected JLabel bienvenue = new JLabel("Bienvenue sur UCD, connectez-vous !", SwingConstants.CENTER);
	protected JLabel login1 = new JLabel("Login", SwingConstants.CENTER);
	protected JLabel mdp1 = new JLabel("Mot de passe", SwingConstants.CENTER);
	protected JButton ok = new JButton("Ok");
	private Controleur _controleur;
	

	/**************************** CONSTRUCTEUR **********************/

	
	public VueAccueil(Controleur controleur){
		super ("Logiciel");
		this._controleur = controleur;
		this.setTitle("Logiciel GClass");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setVisible(true);
		this.setContentPane(accueil);
		this.setResizable(false);
		
		accueil.setBackground(Color.DARK_GRAY);
		accueil.setLayout(new BoxLayout(accueil, BoxLayout.PAGE_AXIS));
		bienv.add(bienvenue);
		bienvenue.setPreferredSize(new Dimension(300, 50));
		accueil.add(bienv);
		bienv.setOpaque(false);
		bienvenue.setForeground(Color.WHITE);
		bienvenue.setFont(new Font("Arial", Font.BOLD,14));
		
		
		login1.setPreferredSize(new Dimension(150, 30));
		login1.setBackground(Color.white);
		login1.setOpaque(true);
		login2.setPreferredSize(new Dimension(150, 30));
		login2.setBackground(Color.white);
		login2.setOpaque(true);
		identifiants.add(login1);
		identifiants.add(login2);
		accueil.add(identifiants);
		identifiants.setOpaque(false);
		
		mdp1.setPreferredSize(new Dimension(150, 30));
		mdp1.setBackground(Color.white);
		mdp1.setOpaque(true);
		mdp2.setPreferredSize(new Dimension(150, 30));
		mdp2.setBackground(Color.white);
		mdp2.setOpaque(true);
		
		identifiants1.add(mdp1);
		identifiants1.add(mdp2);
		accueil.add(identifiants1);
		identifiants1.setOpaque(false);
		
		ok.setPreferredSize(new Dimension(60,40));
		ok.setBackground(Color.WHITE);
		boutonok.add(ok);
		accueil.add(boutonok);
		boutonok.setOpaque(false);
		
		
		setVisible(true);
		
		
		/**************************** LISTENER DU BOUTON OK **********************/
		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_controleur.verifIdentifiants(login2.getText(), mdp2.getText());
			}
		});

	}
	
	/**************************** FONCTION UPDATE APPELEE LORSQUE CHANGEMENT **********************/
	
	public void update(Observable o, Object arg) {
		if(o instanceof ModeleAccueil) {
			ModeleAccueil mod = (ModeleAccueil)o;
			if(mod.isValide())
			{
				System.out.println("Connexion valide (vue)");
				mod.verifStatut();
				mod.vueSelonStatut();
				codevue=mod.getV();
				
				switch (codevue){
				case 2 :
					System.out.println("vue - formateur");
					this.setContentPane(jour );
					this.validate();
				break;
				case 3 :
					System.out.println("vue - Responsable");
					this.setContentPane(vueres);
					this.validate();
				break;
				case 4 :
					System.out.println("vue - Admin");
					this.setContentPane(vueadmin);
					this.validate();
				break;
				default :
					System.out.println("vue - Etudiant");
					this.setContentPane(vueetudiant);
					this.validate();
					break;
				}
			}
		}
	
		
	}
	
	}
		