package GUI;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import Necesare.panel;

public class Panel_RetetaMainPanel extends JPanel{

	//JPanel rp = new RetetaDataPacient();
	JPanel rp = new panel();
	JPanel dp = new Panel_Data_Pacient();
	JPanel dm = new Panel_Data_Medic();
	

	
	JButton btn = new JButton("Sunt un buton");
	
	public Panel_RetetaMainPanel() {
		
		//setBackground(Color.BLUE);
		
		//setBorder(new EmptyBorder(10, 10, 10, 10));
		//setBorder(BorderFactory.createTitledBorder("Date Reteta"));
		
		
		setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10) ,BorderFactory.createTitledBorder("Reteta")));
		
//		setLayout(new BorderLayout());
//		add(rp, BorderLayout.NORTH);
		
		
		//setLayout(new GridLayout(5,1));
		
		add(dp);
		add(dm);
		
		add(rp);
		//add(btn);

		
	
		
	}
	
}
