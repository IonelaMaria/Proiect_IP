package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import com.mysql.jdbc.PreparedStatement;

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
	
	
	
//	public String Register(ArrayList<String> data){
//		
//		String user 	= data.get(0);
//		String password = data.get(1);
//		String Mod 		= data.get(2);
//		
//		try {
//			
//			String query = "INSERT INTO 'logindata'.'data' ('ID', 'Password', 'Mod') VALUES ('"+user+"', '"+password+"', '"+Mod+"');";
//
//			stm = con.createStatement();
//			ResultSet rs = stm.executeQuery(query);
//			
//			System.out.println("am reusit sa introduc urmatoarele date: " + user + " " + password + " " + Mod );
//		
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
//	}
	
	
	
	
	
	public void Register(ArrayList<String> data){
		
		try
	    {
	      // create a mysql database connection
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/logindata";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/logindata?autoReconnect=true&useSSL=false", "root", "parola");
	     
	      // create a sql date object so we can use it in our INSERT statement
	      Calendar calendar = Calendar.getInstance();
	      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
	 
	      // the mysql insert statement
	      String query = "insert into data values (?, ?, ?)";
	      
	      
	      	String user 	= data.get(0);
			String password = data.get(1);
			String Mod 		= data.get(2);
			
	 
	      // create the mysql insert preparedstatement
	      java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, user);
	      preparedStmt.setString (2, password);
	      preparedStmt.setString (3, Mod);
	      
	      // execute the preparedstatement
	      preparedStmt.executeUpdate();
	       
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}	
}