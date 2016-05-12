package GUI;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Panel_Register_Pacient extends JPanel{

	
	Panel_Data_Pacient dp = new Panel_Data_Pacient();
	Panel_UPM upm = new Panel_UPM();
	Panel_Butons btn = new Panel_Butons();
	
	

	
	public Panel_Register_Pacient() {
		
		setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10) ,BorderFactory.createTitledBorder("Reteta")));	
		
		add(dp);
		dp.setLayout(null);
		add(upm);
		upm.setLayout(null);
		add(btn);
		btn.setLayout(null);
		
	}
	
	public ArrayList<String> getPaneldata(){
		
		ArrayList<String> data = new ArrayList<>();
		
		
		
		data.add(upm.getName());
		data.add(upm.getPassword());
		data.add(upm.getMod());
		
		return data;
	}
	
}
