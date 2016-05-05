package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DataBase.DatabaseConetion;
import Necesare.Sha256;

public class Panel_UPM extends JPanel {
	
	//DatabaseConetion connection = new DatabaseConetion();
	//static Sha256 sha = new Sha256();
	
	private JTextField textField_7;
	private JTextField textField_1;
	private JLabel lblPrenume;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JTextField textField_4;


	/**
	 * Create the panel.
	 */
	public Panel_UPM() {
		
		setBorder(BorderFactory.createTitledBorder("Date Pacient"));
		setPreferredSize(new Dimension(750, 60));
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 26, 46, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 23, 140, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblPrenume = new JLabel("Password");
		lblPrenume.setBounds(250, 26, 60, 14);
		add(lblPrenume);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(320, 23, 140, 20);
		add(textField_2);
		
		lblNewLabel_2 = new JLabel("Person Mod");
		lblNewLabel_2.setBounds(493, 26, 88, 14);
		add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(577, 23, 140, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		
	}
}
