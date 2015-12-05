import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;

public class Carte {
	private JFrame windowCarte;
	private JPanel PanelAddCarte;
	
	private JTextField textFieldPokemon;
	private JTextField textFieldLvl;
	private JTextField textFieldPv;
	private JTextField textFieldAtq;
	
	private JLabel lblCrerVotreCarte;
	private JLabel lblPokemon;
	private JLabel lblLvl;
	private JLabel lblPv;
	private JLabel lblType;
	private JLabel lblAttaque;
	private JLabel lblEnergieAtq;
	private JLabel lblFaiblesse;
	private JLabel lblRsistance;
	
	private JList listType;
	private JList listNrg;
	private JList listFaiblesse;
	private JList listResist;
	
	private JButton btnValider;
	
	public Carte(){
		// Création de la fenetre
		windowCarte = new JFrame("Créer Carte");
		windowCarte.getContentPane().setBackground(Color.DARK_GRAY);
		windowCarte.getContentPane().setLayout(null);
		
		lblCrerVotreCarte = new JLabel("Cr\u00E9er votre carte !");
		lblCrerVotreCarte.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCrerVotreCarte.setForeground(Color.WHITE);
		lblCrerVotreCarte.setBounds(114, 11, 271, 46);
		
		windowCarte.getContentPane().add(lblCrerVotreCarte);
		
		lblPokemon = new JLabel("Pokemon ");
		lblPokemon.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 15));
		lblPokemon.setForeground(Color.WHITE);
		lblPokemon.setBounds(51, 85, 95, 14);
		
		windowCarte.getContentPane().add(lblPokemon);
		
		lblLvl = new JLabel("Lvl ");
		lblLvl.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
		lblLvl.setForeground(Color.WHITE);
		lblLvl.setBounds(51, 125, 95, 14);
		
		windowCarte.getContentPane().add(lblLvl);
		
		lblPv = new JLabel("Pv");
		lblPv.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
		lblPv.setForeground(Color.WHITE);
		lblPv.setBounds(51, 165, 95, 14);
		
		windowCarte.getContentPane().add(lblPv);
		
		lblType = new JLabel("Type");
		lblType.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
		lblType.setForeground(Color.WHITE);
		lblType.setBounds(51, 205, 95, 14);
		windowCarte.getContentPane().add(lblType);
		
		lblAttaque = new JLabel("Attaque");
		lblAttaque.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
		lblAttaque.setForeground(Color.WHITE);
		lblAttaque.setBounds(51, 245, 95, 14);
		windowCarte.getContentPane().add(lblAttaque);
		
		lblEnergieAtq = new JLabel("Energies");
		lblEnergieAtq.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
		lblEnergieAtq.setForeground(Color.WHITE);
		lblEnergieAtq.setBounds(51, 285, 95, 14);
		windowCarte.getContentPane().add(lblEnergieAtq);
		
		lblFaiblesse = new JLabel("Faiblesse");
		lblFaiblesse.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
		lblFaiblesse.setForeground(Color.WHITE);
		lblFaiblesse.setBounds(51, 325, 95, 14);
		windowCarte.getContentPane().add(lblFaiblesse);
		
		lblRsistance = new JLabel("R\u00E9sistance");
		lblRsistance.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
		lblRsistance.setForeground(Color.WHITE);
		lblRsistance.setBounds(51, 365, 95, 14);
		windowCarte.getContentPane().add(lblRsistance);
		
		textFieldPokemon = new JTextField();
		textFieldPokemon.setBounds(256, 85, 86, 20);
		windowCarte.getContentPane().add(textFieldPokemon);
		textFieldPokemon.setColumns(10);
		
		textFieldLvl = new JTextField();
		textFieldLvl.setBounds(256, 124, 86, 20);
		windowCarte.getContentPane().add(textFieldLvl);
		textFieldLvl.setColumns(10);
		
		textFieldPv = new JTextField();
		textFieldPv.setBounds(256, 164, 86, 20);
		windowCarte.getContentPane().add(textFieldPv);
		textFieldPv.setColumns(10);
		
		textFieldAtq = new JTextField();
		textFieldAtq.setBounds(256, 244, 86, 20);
		windowCarte.getContentPane().add(textFieldAtq);
		textFieldAtq.setColumns(10);
		
		listType = new JList();
		listType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		listType.setModel(new AbstractListModel() {
			String[] values = new String[] {"Feu", "Eau", "Plante", "Normal", "Electrik", "Glace", "Combat", "Poison", "Sol", "Vol", "Psy", "Insect", "Roche", "Spectre", "Dragon", "T\u00E9n\u00E9bres", "Acier"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listType.setBounds(256, 204, 86, 20);
		windowCarte.getContentPane().add(listType);
		
		listNrg = new JList();
		listNrg.setModel(new AbstractListModel() {
			String[] values = new String[] {"Feu", "Eau", "Plante", "Normal", "Electrik", "Glace", "Combat", "Poison", "Sol", "Vol", "Psy", "Insect", "Roche", "Spectre", "Dragon", "T\u00E9n\u00E9bres", "Acier"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listNrg.setFont(new Font("Tahoma", Font.PLAIN, 13));
		listNrg.setBounds(256, 284, 86, 20);
		windowCarte.getContentPane().add(listNrg);
		
		listFaiblesse = new JList();
		listFaiblesse.setModel(new AbstractListModel() {
			String[] values = new String[] {"Feu", "Eau", "Plante", "Normal", "Electrik", "Glace", "Combat", "Poison", "Sol", "Vol", "Psy", "Insect", "Roche", "Spectre", "Dragon", "T\u00E9n\u00E9bres", "Acier"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listFaiblesse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		listFaiblesse.setBounds(256, 326, 86, 20);
		windowCarte.getContentPane().add(listFaiblesse);
		
		listResist = new JList();
		listResist.setModel(new AbstractListModel() {
			String[] values = new String[] {"Feu", "Eau", "Plante", "Normal", "Electrik", "Glace", "Combat", "Poison", "Sol", "Vol", "Psy", "Insect", "Roche", "Spectre", "Dragon", "T\u00E9n\u00E9bres", "Acier"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listResist.setFont(new Font("Tahoma", Font.PLAIN, 13));
		listResist.setBounds(256, 366, 86, 20);
		windowCarte.getContentPane().add(listResist);
		
		btnValider = new JButton("Valider");
		btnValider.setBounds(170, 405, 89, 23);
		windowCarte.getContentPane().add(btnValider);
		windowCarte.setSize(499, 600);

		// Création du panel
		PanelAddCarte = new JPanel();
	}
}
