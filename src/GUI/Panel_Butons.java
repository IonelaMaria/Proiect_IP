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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_Butons extends JPanel {
	
	//DatabaseConetion connection = new DatabaseConetion();
	//static Sha256 sha = new Sha256();
	
	private JTextField textField_7;
	private JButton btnSave;
	private JButton btnAbort;
	private JButton btnReset;


	/**
	 * Create the panel.
	 */
	public Panel_Butons() {
		
		//setBorder(BorderFactory.createTitledBorder("Date Pacient"));
		setPreferredSize(new Dimension(750, 70));
		setLayout(null);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(30, 10, 160, 51);
		add(btnSave);
		
		btnAbort = new JButton("Abort");
		btnAbort.setBounds(560, 10, 160, 51);
		add(btnAbort);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(300, 10, 160, 51);
		add(btnReset);
		
		
	}
}
