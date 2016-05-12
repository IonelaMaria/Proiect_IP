package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.lang.model.type.PrimitiveType;
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
	

	private JLabel lbl_Password;
	private JLabel lbl_Mod;
	
	private JTextField textField_1 = new JTextField();
	private JTextField textField_2 = new JTextField();
	private JTextField textField_3 = new JTextField();
	
	private String Name;
	private String Password;
	private String Mod;
	
	
	/**
	 * Create the panel.
	 */
	public Panel_UPM() {
		
		setBorder(BorderFactory.createTitledBorder("Date Pacient"));
		setPreferredSize(new Dimension(750, 60));
		setLayout(null);
		
		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setBounds(10, 26, 46, 14);
		add(lbl_Name);
		
		
		textField_1.setBounds(66, 23, 140, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lbl_Password = new JLabel("Password");
		lbl_Password.setBounds(250, 26, 60, 14);
		add(lbl_Password);
		
		
		textField_2.setColumns(10);
		textField_2.setBounds(320, 23, 140, 20);
		add(textField_2);
		
		lbl_Mod = new JLabel("Person Mod");
		lbl_Mod.setBounds(493, 26, 88, 14);
		add(lbl_Mod);
		
		
		textField_3.setBounds(577, 23, 140, 20);
		add(textField_3);
		textField_3.setColumns(10);
//		
//		String userTextValue = textField_1.getText();
//		String passwordTextValue = textField_1.getText();
//		String modTextValue = textField_1.getText();
//		
//		
//		
//		this.Name 		= userTextValue;
//		this.Password 	= passwordTextValue;
//		this.Mod 		= modTextValue;
	}
	
	public String getName(){
		return textField_1.getText();
	}
	
	public String getPassword(){
		return textField_2.getText();
	}
	
	public String getMod(){
		return textField_3.getText();
	}
}
