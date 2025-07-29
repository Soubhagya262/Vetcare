package clinic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertvet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
          
        	  try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soubhagyadb","root","soubhagya@1234");
			    System.out.println(con);
        	    Statement st = con.createStatement();{
        	    	
        	    	String query = "INSERT INTO VET (vet_id,vet_name,contact_number) Values(3,'kelly','76894')";
        	    	
        	    	int count = st.executeUpdate(query);
        	    	
        	    	if(count==0) {
        	    		System.out.println("Record not inserted...");
        	    	}else {
        	    		System.out.println("Record inserted...");
        	    	}
        	    }  
        	    }  catch (SQLException se) {
				// TODO Auto-generated catch block
        		  System.out.println(se.getMessage());
				se.printStackTrace();
			} catch (Exception e) {
               System.out.println(e.getMessage());
               e.printStackTrace();
			}
			
          
	}
	
}	
	
