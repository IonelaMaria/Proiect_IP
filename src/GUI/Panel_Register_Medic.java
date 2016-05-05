package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Panel_Register_Medic extends JPanel{

	
	JPanel dm 	= new Panel_Data_Medic();
	JPanel upm 	= new Panel_UPM();
	JPanel btn 	= new Panel_Butons();

	
	public Panel_Register_Medic() {
		
		setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10) ,BorderFactory.createTitledBorder("Reteta")));	
		
		add(dm);
		dm.setLayout(null);
		add(upm);
		upm.setLayout(null);
		add(btn);
		btn.setLayout(null);
		
	}
	
}
