package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Panel_Data_Diagnostic extends JPanel {
	private JTextField textField_7;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblAdresa;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JTextField textField_4;
	private JLabel lblCid;
	private JTextField textField_5;
	private JLabel lblNewLabel_3;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;


	/**
	 * Create the panel.
	 */
	public Panel_Data_Diagnostic() {
		
		setBorder(BorderFactory.createTitledBorder("Reteta"));
		setPreferredSize(new Dimension(750, 330));
		setLayout(null);
		
		lblNewLabel = new JLabel("Numar");
		lblNewLabel.setBounds(10, 26, 46, 14);
		add(lblNewLabel);
		
		lblAdresa = new JLabel("Diagnostic");
		lblAdresa.setBounds(10, 54, 46, 14);
		add(lblAdresa);
		
		lblNewLabel_2 = new JLabel("Data prez...");
		lblNewLabel_2.setBounds(500, 23, 67, 14);
		add(lblNewLabel_2);
		
		lblCid = new JLabel("Data dep.");
		lblCid.setBounds(500, 54, 56, 14);
		add(lblCid);
		
		textField = new JTextField();
		textField.setBounds(66, 23, 140, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 51, 394, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(577, 20, 140, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(577, 51, 140, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblObservatii = new JLabel("Observatii");
		lblObservatii.setBounds(10, 85, 89, 14);
		add(lblObservatii);
		
		lblNewLabel_3 = new JLabel("Medicamnet");
		lblNewLabel_3.setBounds(10, 180, 67, 14);
		add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 195, 300, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cantitate");
		lblNewLabel_4.setBounds(340, 180, 46, 14);
		add(lblNewLabel_4);
		
		textField_8 = new JTextField();
		textField_8.setBounds(340, 195, 46, 20);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Dim...");
		lblNewLabel_5.setBounds(410, 180, 46, 14);
		add(lblNewLabel_5);
		
		textField_9 = new JTextField();
		textField_9.setBounds(410, 195, 30, 20);
		add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(450, 195, 30, 20);
		add(textField_10);
		
		JLabel lblPranz = new JLabel("Pranz");
		lblPranz.setBounds(450, 180, 46, 14);
		add(lblPranz);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(490, 195, 30, 20);
		add(textField_11);
		
		JLabel lblSeara = new JLabel("Seara");
		lblSeara.setBounds(490, 180, 46, 14);
		add(lblSeara);
		
		JLabel lblNewLabel_6 = new JLabel("Pret");
		lblNewLabel_6.setBounds(546, 180, 46, 14);
		add(lblNewLabel_6);
		
		textField_12 = new JTextField();
		textField_12.setBounds(546, 195, 86, 20);
		add(textField_12);
		textField_12.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 225, 622, 90);
		add(table);
		
		JButton btnNewButton = new JButton("Add.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(642, 194, 89, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(642, 225, 89, 23);
		add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 707, 70);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(642, 261, 89, 54);
		add(btnNewButton_2);
		
		
	}
}
