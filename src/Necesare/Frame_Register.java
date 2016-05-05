package Necesare;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GUI.Panel_Register_Medic;

public class Frame_Register extends JFrame{
	
	JPanel registerMedic = new Panel_Register_Medic();
	
	public Frame_Register() {
		
		setTitle("Medic Register");
		setSize(800, 600);
		setAlwaysOnTop(true);
		
		
		Container c = getContentPane();
		
		c.add(registerMedic,BorderLayout.CENTER);
		setVisible(true);
	}


	
	
	

}
