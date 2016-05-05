package GUI;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class ApplicatinMainGUI extends JFrame{
	
	JPanel retetaPanel = new Panel_Reteta();
	JMenuBar menuBar = new MenuBar();
	
	
	public ApplicatinMainGUI() {
	
	setTitle("Sistemul Informatic Unic Integrat");
	setSize(1390, 760);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	setLocationRelativeTo(null);
	setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setUndecorated(true);
	
	
	
	Container c = getContentPane();
	
	c.add(menuBar, BorderLayout.NORTH);
	//c.add(retetaPanel,BorderLayout.CENTER);
	
	
	
	
	setVisible(true);
	}
}
