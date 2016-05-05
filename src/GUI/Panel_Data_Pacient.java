package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Data_Pacient extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;


	/**
	 * Create the panel.
	 */
	public Panel_Data_Pacient() {
		
		setBorder(BorderFactory.createTitledBorder("Date Pacient"));
		setPreferredSize(new Dimension(746, 120));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 25, 150, 50, 0, 100, 0, 130, 0, 70, 142, 0};
		gridBagLayout.rowHeights = new int[]{18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel lblCnp = new JLabel("CNP");
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
		
		JLabel lblCid = new JLabel("CID");
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
		
		JLabel lblData = new JLabel("Data");
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
		
		JLabel lblNume = new JLabel("Nume");
		GridBagConstraints gbc_lblNume = new GridBagConstraints();
		gbc_lblNume.anchor = GridBagConstraints.WEST;
		gbc_lblNume.insets = new Insets(0, 0, 5, 5);
		gbc_lblNume.gridx = 1;
		gbc_lblNume.gridy = 2;
		add(lblNume, gbc_lblNume);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 2;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPrenume = new JLabel("Prenume");
		GridBagConstraints gbc_lblPrenume = new GridBagConstraints();
		gbc_lblPrenume.anchor = GridBagConstraints.EAST;
		gbc_lblPrenume.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenume.gridx = 6;
		gbc_lblPrenume.gridy = 2;
		add(lblPrenume, gbc_lblPrenume);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 7;
		gbc_textField_4.gridy = 2;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAdresa = new JLabel("Adresa");
		GridBagConstraints gbc_lblAdresa = new GridBagConstraints();
		gbc_lblAdresa.anchor = GridBagConstraints.WEST;
		gbc_lblAdresa.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresa.gridx = 1;
		gbc_lblAdresa.gridy = 3;
		add(lblAdresa, gbc_lblAdresa);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 6;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 3;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTara = new JLabel("Tara");
		GridBagConstraints gbc_lblTara = new GridBagConstraints();
		gbc_lblTara.anchor = GridBagConstraints.EAST;
		gbc_lblTara.insets = new Insets(0, 0, 5, 5);
		gbc_lblTara.gridx = 10;
		gbc_lblTara.gridy = 3;
		add(lblTara, gbc_lblTara);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 11;
		gbc_textField_6.gridy = 3;
		add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		
	}
}
