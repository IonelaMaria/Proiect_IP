package Listeneri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GUI.Frame_SecondaryFrame;
import Necesare.Frame_Register;

public class Listener_NewMedic implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFrame registerMedic = new Frame_SecondaryFrame("Register Medic");
		
	}
	
}
