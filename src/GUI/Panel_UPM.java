package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DataBase.DatabaseConetion;
import Necesare.Sha256;

public class Panel_UPM extends JPanel {
	
	DatabaseConetion connection = new DatabaseConetion();
	static Sha256 sha = new Sha256();
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

	/**
	 * Create the panel.
	 */
	public Panel_UPM() {
		
		setBorder(BorderFactory.createTitledBorder("Date Pacient"));
		setPreferredSize(new Dimension(746, 300));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths 	= new int[]{0, 0, 25, 150, 50, 0, 100, 0, 130, 0, 70, 142, 0};
		gridBagLayout.rowHeights 	= new int[]{18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights 	= new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel lblCnp = new JLabel("User");
		GridBagConstraints gbc_lblCnp = new GridBagConstraints();
		gbc_lblCnp.anchor = GridBagConstraints.WEST;
		gbc_lblCnp.insets = new Insets(0, 0, 5, 5);
		gbc_lblCnp.gridx = 1;
		gbc_lblCnp.gridy = 1;
		add(lblCnp, gbc_lblCnp);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCid = new JLabel("Password");
		GridBagConstraints gbc_lblCid = new GridBagConstraints();
		gbc_lblCid.insets = new Insets(0, 0, 5, 5);
		gbc_lblCid.anchor = GridBagConstraints.EAST;
		gbc_lblCid.gridx = 6;
		gbc_lblCid.gridy = 1;
		add(lblCid, gbc_lblCid);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 7;
		gbc_textField_1.gridy = 1;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblData = new JLabel("Mod");
		GridBagConstraints gbc_lblData = new GridBagConstraints();
		gbc_lblData.insets = new Insets(0, 0, 5, 5);
		gbc_lblData.anchor = GridBagConstraints.EAST;
		gbc_lblData.gridx = 10;
		gbc_lblData.gridy = 1;
		add(lblData, gbc_lblData);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 11;
		gbc_textField_2.gridy = 1;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		
	}
	
	public void SetData(){
		
		ArrayList<String> data = new ArrayList<String>();
		
		data.add(textField.getText());
		data.add(sha.sha256(textField_1.getText()));
		data.add(textField_2.getText());
		
		connection.Register(data);
	}
	
	
	
}
