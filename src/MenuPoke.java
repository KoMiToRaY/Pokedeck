import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MenuPoke {
	private JFrame windowMenu;
	private JPanel PanelAddCarte;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	
	
	public MenuPoke(){
		// Création de la fenetre
		windowMenu = new JFrame("Menu");
		windowMenu.setSize(600, 350);
		windowMenu.getContentPane().setBackground(Color.DARK_GRAY);
		windowMenu.getContentPane().setLayout(null);
		
		JLabel lblCentrePokemon = new JLabel("CENTRE POKEMON");
		lblCentrePokemon.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 30));
		lblCentrePokemon.setForeground(Color.WHITE);
		lblCentrePokemon.setBounds(117, 11, 298, 57);
		windowMenu.getContentPane().add(lblCentrePokemon);
		
		JButton btnCrerCarte = new JButton("Cr\u00E9er Carte");
		btnCrerCarte.setBounds(117, 124, 128, 23);
		windowMenu.getContentPane().add(btnCrerCarte);
		
		JButton btnCrerDeck = new JButton("Cr\u00E9er Deck");
		btnCrerDeck.setBounds(326, 124, 128, 23);
		windowMenu.getContentPane().add(btnCrerDeck);
		
		JButton btnConstruireLeDeck = new JButton("Construire le deck");
		btnConstruireLeDeck.setBounds(200, 207, 197, 23);
		windowMenu.getContentPane().add(btnConstruireLeDeck);
		
		windowMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowMenu.setVisible(true);
	}
}
