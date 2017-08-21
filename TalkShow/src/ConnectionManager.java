import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {
	static Connection con;
	   static String url;
	         
	   public static Connection getConnection()
	   {
	     
	      try
	      {
	         String url = "jdbc:odbc:" + "DataSource"; 
	         // assuming "DataSource" is your DataSource name

	         Class.forName("org.apache.derby.jdbc.ClientDriver");
	         
	                    	
	            try {
	            	con=DriverManager.getConnection("jdbc:derby://172.24.34.212:1527/sample","user","pwd");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	             								
	         // assuming your SQL Server's	username is "username"               
	         // and password is "password"
	              
	         
	         
	      }

	      catch(ClassNotFoundException e)
	      {
	         System.out.println(e);
	      }

	   return con;
	}
}
