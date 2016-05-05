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
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	
	/**
	 * Create the panel.
	 */
	public Panel_Data_Medic() {
		
		setBorder(BorderFactory.createTitledBorder("Date Medic"));
		setPreferredSize(new Dimension(746, 100));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths 	= new int[]{0, 0, 25, 150, 50, 0, 100, 0, 130, 0, 70, 142, 0};
		gridBagLayout.rowHeights 	= new int[]{18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights 	= new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		

		JLabel lblMedic = new JLabel("Medic");
		GridBagConstraints gbc_lblMedic = new GridBagConstraints();
		gbc_lblMedic.anchor = GridBagConstraints.WEST;
		gbc_lblMedic.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedic.gridx = 1;
		gbc_lblMedic.gridy = 5;
		add(lblMedic, gbc_lblMedic);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.gridwidth = 2;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 3;
		gbc_textField_7.gridy = 5;
		add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblParafa = new JLabel("Parafa");
		GridBagConstraints gbc_lblParafa = new GridBagConstraints();
		gbc_lblParafa.anchor = GridBagConstraints.EAST;
		gbc_lblParafa.gridwidth = 2;
		gbc_lblParafa.insets = new Insets(0, 0, 5, 5);
		gbc_lblParafa.gridx = 6;
		gbc_lblParafa.gridy = 5;
		add(lblParafa, gbc_lblParafa);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 8;
		gbc_textField_8.gridy = 5;
		add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.anchor = GridBagConstraints.WEST;
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 1;
		gbc_lblMail.gridy = 6;
		add(lblMail, gbc_lblMail);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.gridwidth = 6;
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 6;
		add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNrTel = new JLabel("Nr. Tel.");
		GridBagConstraints gbc_lblNrTel = new GridBagConstraints();
		gbc_lblNrTel.anchor = GridBagConstraints.EAST;
		gbc_lblNrTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNrTel.gridx = 10;
		gbc_lblNrTel.gridy = 6;
		add(lblNrTel, gbc_lblNrTel);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 0);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 11;
		gbc_textField_10.gridy = 6;
		add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		

	}
}
