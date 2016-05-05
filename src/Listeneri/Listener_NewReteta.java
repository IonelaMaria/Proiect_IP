package Listeneri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import GUI.Panel_RetetaMainPanel;
import GUI.Frame_SecondaryFrame;

public class Listener_NewReteta implements ActionListener{

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		JFrame secondaryFrame = new Frame_SecondaryFrame("Reteta");
		
	}

}
