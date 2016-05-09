package GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame_SecondaryFrame extends JFrame{
	
	public Frame_SecondaryFrame(String name) {
		
		setTitle(name);
		setSize(1, 1);
		setAlwaysOnTop(true);
		
		
		
		Container c = getContentPane();
			
		if (name == "Reteta"){
			JPanel retetaPanel = new Panel_Reteta();
			c.add(retetaPanel,BorderLayout.CENTER);
			setSize(800, 635);
		}
		
		else if (name == "Register Medic"){
			JPanel retetaPanel = new Panel_Register();
			c.add(retetaPanel,BorderLayout.CENTER);
			setSize(800, 335);
		}
		
		else if (name == "Register Pacient"){
			JPanel retetaPanel = new Panel_Register_Pacient();
			c.add(retetaPanel,BorderLayout.CENTER);
			setSize(800, 335);
		}
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
