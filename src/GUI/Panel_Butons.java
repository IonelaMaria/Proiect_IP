package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DataBase.DatabaseConetion;
import Listeneri.Listener_Save_Pacient;

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
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				DatabaseConetion conn = new DatabaseConetion();
				ArrayList<String> list = new ArrayList<>();
				Panel_UPM upm = new Panel_UPM();
				
				list.add(upm.getName());
				list.add(upm.getPassword());
				list.add(upm.getMod());
				
				conn.Register(list);
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
