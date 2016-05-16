package GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class Frame_Reteta extends JFrame{
	

	public Frame_Reteta() {
		
		setTitle("Reteta");
		setSize(1, 1);
		setAlwaysOnTop(true);
		
		Container c = getContentPane();
			
		
		Panel_Reteta retetaPanel = new Panel_Reteta();
		c.add(retetaPanel,BorderLayout.CENTER);
		setSize(800, 635);
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
