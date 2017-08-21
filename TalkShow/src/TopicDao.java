import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicDao {

	public static boolean createTopic(String name) throws SQLException {
		  Connection conn = ConnectionManager.getConnection();
	      PreparedStatement stmt = null;
	      int rs = 0;
	    
	      boolean isValid = false;
	      String sql = "insert into TOPIC_XBBNHHW (TOPIC_DESC) values(?) ";
	      try 
	      {
	             stmt = conn.prepareStatement(sql);
	             stmt.setString(1, name);
	         
	              rs = stmt.executeUpdate();
	              if(rs!=0)
	              {
	            	  isValid=true;
	              }
	              else{
	            	  isValid=false;
	              }
	              
	      }
	      
	      finally{
	             try {
	                    
	                    if(stmt != null)                                
	                    stmt.close();                     
	                    conn.commit();
	                    if(conn != null)
	                    conn.close();
	             }                    
	             catch (SQLException e) {
	                          // TODO Auto-generated catch block
	                          e.printStackTrace();
	                    }
	      }
	      
	      return isValid;
	}

	public static int getTopicId(String tname) {
		Connection conn = ConnectionManager.getConnection();
	      PreparedStatement stmt = null;
	      
	      int rst = 0;

          ResultSet rs1 = null;

          String sql1= "select topic_id from topic_xbbnhhw where topic_desc=?";

          try{

              stmt=conn.prepareStatement(sql1);

              stmt.setString(1, tname);

              rs1=stmt.executeQuery();

             while(rs1.next()){

                     rst=rs1.getInt("topic_id");

             }
          }
          catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
        }

         
     return rst;
          }
	}
	
