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
	
	//***Login***\\
	private String user;
	private String password;
	private String mod;
	
	//***Person***\\
	private String cnp;
	private String name;
	private String pname;
	private String addres;
	private String tara;
	
	//***Medic***\\
	private String parafa;
	private String ambulatoriu;
	
	//***Admin***\\
	private String drepturi;
	
	
	//***Reteta***\\
	private String id;
	private String date;
	private String iagnose;
	private String observatii;
	private ArrayList<String> medicatie;      //p[0]-medicatie, p[1]-cantitate, p[2]- ....
	
	
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
	
	
	public void Register(){
		
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
	      
	      // create the mysql insert preparedstatement
	      java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, user);
	      preparedStmt.setString (2, password);
	      preparedStmt.setString (3, mod);
	      
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


	public void setCon(Connection con) {
		this.con = con;
	}


	public void setStm(java.sql.Statement stm) {
		this.stm = stm;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setMod(String mod) {
		this.mod = mod;
	}


	public void setCnp(String cnp) {
		this.cnp = cnp;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public void setAddres(String addres) {
		this.addres = addres;
	}


	public void setTara(String tara) {
		this.tara = tara;
	}


	public void setParafa(String parafa) {
		this.parafa = parafa;
	}


	public void setAmbulatoriu(String ambulatoriu) {
		this.ambulatoriu = ambulatoriu;
	}


	public void setDrepturi(String drepturi) {
		this.drepturi = drepturi;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public void setIagnose(String iagnose) {
		this.iagnose = iagnose;
	}


	public void setObservatii(String observatii) {
		this.observatii = observatii;
	}


	public void setMedicatie(ArrayList<String> medicatie) {
		this.medicatie = medicatie;
	}


	public void setUser(String user) {
		this.user = user;
	}	
}