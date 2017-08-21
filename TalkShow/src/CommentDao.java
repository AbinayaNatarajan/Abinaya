import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentDao {

	public static boolean insertComment(String comment,int id) throws SQLException {
		Connection conn = ConnectionManager.getConnection();
	      PreparedStatement stmt = null;
	      int rs = 0;
	    
	      boolean isValid = false;
	      SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");

          java.util.Date date = new Date();

          java.sql.Date sqlDate = new java.sql.Date(date.getTime());   

	      String sql = "insert into COMMENT_XBBNHHW (COMMENT_DESC,COMMENT_DATE,TOPIC_ID) values(?,?,?) ";
	      try 
	      {
	             stmt = conn.prepareStatement(sql);
	            
	             stmt.setString(1, comment);
                 stmt.setDate(2,sqlDate);
                 stmt.setInt(3,id);

	              rs = stmt.executeUpdate();
	              if(rs!=0)
	              {
	            	  isValid=true;
	              }
	              else
	              {
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


	public static String getLatestComment(int id) 
	{
		Connection conn = ConnectionManager.getConnection();
	      PreparedStatement stmt = null;
	      
	      String rst = null;

        ResultSet rs1 = null;

        String sql1= "select comment_desc from comment_xbbnhhw where topic_id=?";

        try{

            stmt=conn.prepareStatement(sql1);

            stmt.setInt(1, id);

            rs1=stmt.executeQuery();

           while(rs1.next())
           {

                   rst=rs1.getString("comment_desc");

           }
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
      }
        return rst;
	}
	}

	
