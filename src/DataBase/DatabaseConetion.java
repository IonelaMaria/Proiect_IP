package DataBase;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DatabaseConetion {
	
	protected Connection con;
	protected java.sql.Statement stm;
	//protected ResultSet ru;
	
	
	public DatabaseConetion() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/logindata?autoReconnect=true&useSSL=false", "root", "parola");
			
			stm = con.createStatement();
			
			System.out.println("Conexiunea a reusit");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	
	public String Login(String user, String password){
		
		try {
			
			String query = "SELECT * FROM data WHERE ID = '" + user + "' AND Password = '" + password + "'";
			ResultSet rs = stm.executeQuery(query); 
			if (rs.next()){
				return rs.getString("Mod");
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	public String Register(ArrayList<String> data){
		
		String user 	= data.get(0);
		String password = data.get(1);
		String Mod 		= data.get(2);
		
		try {
			
			String query = "INSERT INTO data ('ID', 'Password', 'Mod')"+ 
						   "VALUES ('" +user+ "','" +password+ "','" +Mod+ "')";
			
			
			

			
			
			
			ResultSet rs = stm.executeQuery(query); 
			
			System.out.println("am reusit sa introduc urmatoarele date: " + user + " " + password + " " + Mod );
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}






