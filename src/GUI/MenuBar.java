package GUI;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Listeneri.Listener_Exit;
import Listeneri.Listener_NewMedic;
import Listeneri.Listener_NewReteta;

public class MenuBar extends JMenuBar{

	public MenuBar() {
	
		
		JMenu file = new JMenu("File");
		add(file);
		
		
		JMenuItem fileOption1 = new JMenuItem("Consultatie");
		JMenuItem fileOption2 = new JMenuItem("Reteta");
		JMenuItem fileOption3 = new JMenuItem("Scrisaore Medicala");
		JMenuItem fileOption4 = new JMenuItem("Bon de ordine");
		
		file.add(fileOption1);
		file.add(fileOption2);
		file.add(fileOption3);
		file.add(fileOption4);
		
		
		
		
		JMenu reteta = new JMenu("Reteta");
		add(reteta);
		
		JMenuItem newReteta = new JMenuItem("Reteta Noua");
		
		reteta.add(newReteta);
		newReteta.addActionListener(new Listener_NewReteta());
		
		
		
		
		JMenu register = new JMenu("Register");
		add(register);
		
		JMenuItem registerMedic = new JMenuItem("Register Medic");
		JMenuItem registerFarmacist = new JMenuItem("Register Farmacist");
		
		register.add(registerMedic);
		registerMedic.addActionListener(new Listener_NewMedic());
		
		register.add(registerFarmacist);
		registerFarmacist.addActionListener(new Listener_NewReteta());
		
		
		
		
		
		
		
		JMenu exit = new JMenu("Exit");
		add(exit);
		
		JMenuItem exitOption1 = new JMenuItem("Exit");
		
		exit.add(exitOption1);
		
		exitOption1.addActionListener(new Listener_Exit());
		
		
		JMenuItem x = new JMenuItem("X");
		add(x);
		x.addActionListener(new Listener_Exit());

		
	}
}
