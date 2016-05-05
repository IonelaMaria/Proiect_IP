package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Panel_RegisterMedic extends JPanel{

	
	JPanel dm = new Panel_Data_Medic();
	JPanel upm = new Panel_UPM();
	
	JButton register = new JButton("Register");

	
	public Panel_RegisterMedic() {
		
		setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10) ,BorderFactory.createTitledBorder("Reteta")));	
		
		add(dm);
		add(upm);
		add(register);
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				((Panel_UPM) upm).SetData();
			}
		});
		
	}
	
}
