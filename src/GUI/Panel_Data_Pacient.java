package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Panel_Data_Pacient extends JPanel {
	private JTextField textField_7;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblPrenume;
	private JTextField textField_2;
	private JLabel lblAdresa;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JTextField textField_4;
	private JLabel lblCid;
	private JTextField textField_5;
	private JButton btnNewButton;


	/**
	 * Create the panel.
	 */
	public Panel_Data_Pacient() {
		
		setBorder(BorderFactory.createTitledBorder("Date Pacient"));
		setPreferredSize(new Dimension(750, 120));
		setLayout(null);
		
		lblNewLabel = new JLabel("CNP");
		lblNewLabel.setBounds(10, 26, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 23, 140, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 59, 140, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblPrenume = new JLabel("Prenume");
		lblPrenume.setBounds(250, 62, 60, 14);
		add(lblPrenume);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(320, 59, 140, 20);
		add(textField_2);
		
		lblAdresa = new JLabel("Adresa");
		lblAdresa.setBounds(10, 87, 46, 14);
		add(lblAdresa);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 84, 394, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Data nasteri");
		lblNewLabel_2.setBounds(500, 62, 81, 14);
		add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(577, 59, 140, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		lblCid = new JLabel("Tara");
		lblCid.setBounds(500, 87, 56, 14);
		add(lblCid);
		
		textField_5 = new JTextField();
		textField_5.setBounds(577, 84, 140, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setBounds(239, 22, 89, 23);
		add(btnNewButton);
		
		
	}
}
