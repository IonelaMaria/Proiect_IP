package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DataBase.DatabaseConetion;
import Necesare.Sha256;

public class Panel_Register extends JPanel {
	
	//DatabaseConetion connection = new DatabaseConetion();
	//static Sha256 sha = new Sha256();
	

	private JLabel lbl_Password;
	private JLabel lbl_Mod;
	
	private JTextField textField_ID = new JTextField();
	private JTextField textField_Password = new JTextField();
	private JTextField textField_Mod = new JTextField();
	
	private JTextField textField_CNP;
	private JTextField textField_Nme;
	private JTextField textField_Prenume;
	private JTextField textField_Adresa;
	private JTextField textField_Tara;
	private JTextField textField_Data;
	private JTextField textField_Domeniu;
	private JTextField textField_Ambulatoriu;
	
	
	/**
	 * Create the panel.
	 */
	public Panel_Register() {
		
		setBorder(BorderFactory.createTitledBorder("Medic"));
		setPreferredSize(new Dimension(750, 311));
		setLayout(null);
		
		JLabel lbl_Name = new JLabel("Name_ID");
		lbl_Name.setBounds(10, 126, 46, 14);
		add(lbl_Name);
		
		
		textField_ID.setBounds(66, 123, 140, 20);
		add(textField_ID);
		textField_ID.setColumns(10);
		
		lbl_Password = new JLabel("Password");
		lbl_Password.setBounds(250, 126, 60, 14);
		add(lbl_Password);
		
		
		textField_Password.setColumns(10);
		textField_Password.setBounds(320, 123, 140, 20);
		add(textField_Password);
		
		lbl_Mod = new JLabel("Person Mod");
		lbl_Mod.setBounds(493, 126, 88, 14);
		add(lbl_Mod);
		
		
		textField_Mod.setBounds(577, 123, 140, 20);
		add(textField_Mod);
		textField_Mod.setColumns(10);
		
		String userTextValue = textField_ID.getText();
		String passwordTextValue = textField_ID.getText();
		String modTextValue = textField_ID.getText();
		
		JLabel lblNewLabel = new JLabel("CNP");
		lblNewLabel.setBounds(10, 29, 46, 14);
		add(lblNewLabel);
		
		textField_CNP = new JTextField();
		textField_CNP.setBounds(66, 26, 140, 20);
		add(textField_CNP);
		textField_CNP.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		add(lblNewLabel_1);
		
		textField_Nme = new JTextField();
		textField_Nme.setBounds(66, 57, 140, 20);
		add(textField_Nme);
		textField_Nme.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Prenume");
		lblNewLabel_2.setBounds(250, 60, 46, 14);
		add(lblNewLabel_2);
		
		textField_Prenume = new JTextField();
		textField_Prenume.setBounds(320, 57, 140, 20);
		add(textField_Prenume);
		textField_Prenume.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Adresa");
		lblNewLabel_3.setBounds(10, 91, 46, 14);
		add(lblNewLabel_3);
		
		textField_Adresa = new JTextField();
		textField_Adresa.setBounds(66, 88, 394, 20);
		add(textField_Adresa);
		textField_Adresa.setColumns(10);
		
		JLabel lblTara = new JLabel("Tara");
		lblTara.setBounds(493, 91, 46, 14);
		add(lblTara);
		
		textField_Tara = new JTextField();
		textField_Tara.setBounds(577, 88, 140, 20);
		add(textField_Tara);
		textField_Tara.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DatabaseConetion conn = new DatabaseConetion();
				
				
				ArrayList<String> dataList = new ArrayList<>();
				
				String ID 		= textField_ID.getText();
				String password = textField_Password.getText();
				String mod	 	= textField_Mod.getText();
				
				String CNP 		= textField_CNP.getText();
				String nume 	= textField_Nme.getText();
				String prenume 	= textField_Prenume.getText();
				String adresa 	= textField_Adresa.getText();
				String tara 	= textField_Tara.getText();
				String data 	= textField_Data.getText();
				String domeniu 	= textField_Domeniu.getText();
				String ambulatoriu = textField_Ambulatoriu.getText();
				
				password = Sha256.sha256(password);
				
				
				dataList.add(ID);
				dataList.add(password);
				dataList.add(mod);
				dataList.add(CNP);
				dataList.add(nume);
				dataList.add(prenume);
				dataList.add(adresa);
				dataList.add(tara);
				dataList.add(data);
				dataList.add(domeniu);
				dataList.add(ambulatoriu);
				
				conn.Register(dataList);
				
				
			}
		});
		btnNewButton.setBounds(50, 250, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(330, 250, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setBounds(610, 250, 89, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Data");
		lblNewLabel_4.setBounds(577, 29, 23, 14);
		add(lblNewLabel_4);
		
		textField_Data = new JTextField();
		textField_Data.setBounds(610, 26, 107, 20);
		add(textField_Data);
		textField_Data.setColumns(10);
		
		JLabel lblDonemiu = new JLabel("Donemiu");
		lblDonemiu.setBounds(10, 157, 46, 14);
		add(lblDonemiu);
		
		textField_Domeniu = new JTextField();
		textField_Domeniu.setBounds(66, 154, 140, 20);
		add(textField_Domeniu);
		textField_Domeniu.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Ambulatoriu");
		lblNewLabel_5.setBounds(250, 157, 69, 14);
		add(lblNewLabel_5);
		
		textField_Ambulatoriu = new JTextField();
		textField_Ambulatoriu.setBounds(320, 154, 397, 20);
		add(textField_Ambulatoriu);
		textField_Ambulatoriu.setColumns(10);
	}
	
}
