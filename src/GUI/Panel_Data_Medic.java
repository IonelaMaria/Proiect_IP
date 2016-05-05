package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Data_Medic extends JPanel {
	private JTextField textField_7;
	private JTextField textField_1;
	private JLabel lblPrenume;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JTextField textField_4;
	private JLabel lblDomeniu;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_3;


	/**
	 * Create the panel.
	 */
	public Panel_Data_Medic() {
		
		setBorder(BorderFactory.createTitledBorder("Date Medic"));
		setPreferredSize(new Dimension(750, 90));
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setBounds(10, 28, 46, 14);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 25, 140, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblPrenume = new JLabel("Prenume");
		lblPrenume.setBounds(250, 28, 60, 14);
		add(lblPrenume);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(320, 25, 140, 20);
		add(textField_2);
		
		lblNewLabel_2 = new JLabel("Parafa");
		lblNewLabel_2.setBounds(496, 28, 71, 14);
		add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(577, 25, 140, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		lblDomeniu = new JLabel("Domeniu");
		lblDomeniu.setBounds(10, 53, 46, 14);
		add(lblDomeniu);
		
		textField = new JTextField();
		textField.setBounds(66, 50, 140, 20);
		add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Ambulatoriu");
		lblNewLabel.setBounds(250, 53, 57, 14);
		add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(320, 50, 397, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		
	}
}
