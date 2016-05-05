package GUI;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import Necesare.panel;

public class Panel_Reteta extends JPanel{

	//JPanel rp = new RetetaDataPacient();
	JPanel rp = new Panel_Data_Diagnostic();
	JPanel dp = new Panel_Data_Pacient();
	JPanel dm = new Panel_Data_Medic();
	

	
	JButton btn = new JButton("Sunt un buton");
	
	public Panel_Reteta() {
		
	
		setBorder(new CompoundBorder(new EmptyBorder(6, 6, 6, 6) ,BorderFactory.createTitledBorder("Reteta")));
		

		
		add(dp);
		add(dm);
		add(rp);
	
	}
	
}
