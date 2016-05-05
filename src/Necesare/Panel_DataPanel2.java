package Necesare;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_DataPanel2 extends JPanel{
	

	private JLabel fileNumberLable 		= new JLabel("Fisa: ");
	private JLabel fileDateLable 		= new JLabel("Data: ");
	private JLabel firstNameLable 		= new JLabel("Nume: ");
	private JLabel lastNameLable 		= new JLabel("                     Prenume:  ");
	private JLabel cnpLable 			= new JLabel("CNP: ");
	private JLabel addresLable			= new JLabel("Adresa ");
	private JLabel diagnosticLable  	= new JLabel("Diagnostic");
	private JLabel registerNumberLable 	= new JLabel("Nr. Reg ");
	private JLabel medicationLable		= new JLabel("Medicatie ");
	private JLabel cantitatiLable 		= new JLabel("Cantitate  D   P   S");
	private JLabel pretLable			= new JLabel("Pret");
		
	private JTextField fileNumberField 	= new JTextField(10);
	private JTextField fileDateField 	= new JTextField(10);
	private JTextField firstNameField	= new JTextField(10);
	private JTextField lastNameField 	= new JTextField(10);
	private JTextField cnpField 		= new JTextField(10);
	private JTextField addresField 		= new JTextField(40);
	private JTextField diagnosticField 	= new JTextField(40);
	private JTextField registerNumberField = new JTextField(10);
	private JTextField medicationField 	= new JTextField(30);
	private JTextField cantiateField 	= new JTextField(5);
	private JTextField dimineataField 	= new JTextField(2);
	private JTextField pranzField 		= new JTextField(2);
	private JTextField searaField 		= new JTextField(2);
	private JTextField pretField 		= new JTextField(10);

	private JButton saveBtn 	= new JButton("Salvare");
	private JButton printBtn 	= new JButton("Printare reteta");
	private JButton backBtn 	= new JButton("Inapoi");
	private JButton exitBtn 	= new JButton("Iesire");
	

	
	public Panel_DataPanel2() {	
		//setBackground(Color.CYAN);
		setBounds(0, 0, 400, 300);
		setBorder(BorderFactory.createTitledBorder("Date Reteta Individuala"));
	
		setLayout(new GridBagLayout());
		
GridBagConstraints gc = new GridBagConstraints();
		
		
		gc.weightx = 1;
		gc.weighty = 0.1;

		
		gc.gridx = 0;
		gc.gridy = 0;		
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		
		
		//////////  Prima linie   \\\\\\\\\\
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(fileNumberLable, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(fileNumberField, gc);
		
		
		gc.gridx = 4;
		gc.gridy = 0;
		add(fileDateLable, gc);
		
		gc.gridx = 5;
		gc.gridy = 0;
		add(fileDateField, gc);
		
		
		//////////A 2 linie   \\\\\\\\\\
		
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(firstNameLable, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(firstNameField, gc);
		
		
		gc.gridx = 2;
		gc.gridy = 1;
		add(lastNameLable, gc);
		
		gc.gridx = 3;
		gc.gridy = 1;
		add(lastNameField, gc);
				

		gc.gridx = 4;
		gc.gridy = 1;
		add(cnpLable, gc);
		
		gc.gridx = 5;
		gc.gridy = 1;
		add(cnpField, gc);
		
		
		//////////A 3 linie   \\\\\\\\\\
		
		
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(addresLable, gc);
		
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridwidth = 3;
		add(addresField, gc);
		
						
		//////////A 4 linie   \\\\\\\\\\
		
		gc.weighty = 0.4;
		gc.gridx = 0;
		gc.gridy = 3;
		add(diagnosticLable, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		gc.gridwidth = 3;
		add(diagnosticField, gc);
		
		gc.gridx = 4;
		gc.gridy = 3;
		add(registerNumberLable, gc);
		
		gc.gridx = 5;
		gc.gridy = 3;
		add(registerNumberField, gc);
		
		
		//////////A 5 linie   \\\\\\\\\\

		gc.weighty = 0.1;
		gc.gridx = 0;
		gc.gridy = 4;
		add(medicationLable, gc);
		
		gc.gridx = 5;
		gc.gridy = 4;
		add(pretLable, gc);
		
		
		gc.gridx = 0;
		gc.gridy = 5;
		gc.gridwidth = 4;
		add(medicationField, gc);
		
		
		
		
		//////////A 6 linie   \\\\\\\\\\
	
		gc.gridx = 3;
		gc.gridy = 4;
		gc.gridwidth = 3;
		add(cantitatiLable, gc);
		
		gc.gridx = 3;
		gc.gridy = 5;
		gc.gridwidth = 3;
		add(cantiateField, gc);
		
		
		
		gc.gridx = 3;
		gc.gridy = 5;		
		gc.gridwidth = 1;
		add(dimineataField, gc);
		gc.anchor = GridBagConstraints.LINE_END;
		add(pranzField, gc);
		gc.anchor = GridBagConstraints.CENTER;
		add(searaField, gc);
		

		gc.gridx = 5;
		gc.gridy = 5;
		gc.anchor = GridBagConstraints.LINE_START;
		add(pretField, gc);
		
		
		
		
		
		/*
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameField, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(ocupationLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(ocupationField, gc);
		*/
		
		gc.weightx = 1;
		gc.weighty = 1.0;
		
		gc.gridx = 0;
		gc.gridy = 10;
		gc.anchor = GridBagConstraints.LINE_START;
		add(saveBtn, gc);
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridx = 1;
		add(backBtn, gc);
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 2;
		add(printBtn, gc);
		gc.gridx = 3;
		add(exitBtn, gc);
		
		
		
		gc.weightx = 1;
		gc.weighty = 1;
		
		gc.gridx = 0;
		gc.gridy = 7;
		//add(medication,gc);
		//medication.setSize(100, 210);
		
	}
}
