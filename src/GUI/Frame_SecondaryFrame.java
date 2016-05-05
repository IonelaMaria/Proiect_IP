package GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame_SecondaryFrame extends JFrame{
	
	public Frame_SecondaryFrame(String name) {
		
		setTitle(name);
		setSize(800, 600);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		
		
		Container c = getContentPane();
			
		if (name == "Reteta"){
			JPanel retetaPanel = new Panel_RetetaMainPanel();
			c.add(retetaPanel,BorderLayout.CENTER);
		}
		
		else if (name == "Register Medic"){
			JPanel retetaPanel = new Panel_RegisterMedic();
			c.add(retetaPanel,BorderLayout.CENTER);
		}
			
		setVisible(true);
	}
}
