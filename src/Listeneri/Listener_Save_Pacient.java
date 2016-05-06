package Listeneri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import DataBase.DatabaseConetion;
import GUI.Panel_UPM;

public class Listener_Save_Pacient implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<String> data = new ArrayList<>();
		DatabaseConetion conn = new DatabaseConetion();
		
		Panel_UPM upm = new Panel_UPM();
		
		data.clear();
		data.add(upm.getName());
		data.add(upm.getPassword());
		data.add(upm.getMod());
		
		conn.Register(data);
		
	}
	
}
