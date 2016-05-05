package Necesare;

import java.security.MessageDigest;

public class zzzsha256 {
	public static void main(String[] args) {
		
		System.out.println(sha256("parola"));
		
	}

	static //Comvertorul de sha care face criptarea pentru baza de date;
			String sha256(String possiblePassword) {
				try{
			        MessageDigest digest = MessageDigest.getInstance("SHA-256");
			        byte[] hash = digest.digest((""+possiblePassword).getBytes("UTF-8"));
			        StringBuffer hexString = new StringBuffer();

			        for (int i = 0; i < hash.length; i++) {
			            String hex = Integer.toHexString(0xff & hash[i]);
			            if(hex.length() == 1) hexString.append('0');
			            hexString.append(hex);
			        }

			    	return hexString.toString();
				} catch(Exception ex){
				   throw new RuntimeException(ex);
				}
			}
}


