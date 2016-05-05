package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DataBase.DatabaseConetion;
import Listeneri.Listener_Exit;
import Necesare.Sha256;


public class Frame_Login {
	
	//DatabaseMethods dm = new DatabaseMethods();
	
	static JFrame frame = new JFrame("Login");
	static Sha256 sha = new Sha256();
	
	
	
	public Frame_Login() {
		
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	
	public void ExitLogin(){
		frame.setVisible(false);
	}
	
	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);
		
		//panel.setBackground(Color.BLUE);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(40, 80, 80, 25);
		panel.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DatabaseConetion conn = new DatabaseConetion();
				
				String userTextValue = userText.getText();
			    String passwordTextValue = passwordText.getText();				//Ia valoare din textField si o pun e in variabila passwordTextValue 
			    
			    passwordTextValue = sha.sha256(passwordTextValue);
			    	
			    if (conn.Login(userTextValue, passwordTextValue) != null){
			    //if (connection.Connect(userTextValue, passwordTextValue) == true){
					ApplicatinMainGUI gui = new ApplicatinMainGUI();
					frame.setVisible(false);
				//}
			    }
			}
		});
		
		JButton registerButton = new JButton("Exit");
		registerButton.setBounds(160, 80, 80, 25);
		panel.add(registerButton);
		registerButton.addActionListener(new Listener_Exit() {
		});
	}
}