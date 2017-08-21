<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1" import="java.sql.Connection" import="java.sql.PreparedStatement"

import="java.sql.ResultSet"

import="java.sql.SQLException"

import="java.util.*"

import="java.sql.*"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>post comment</title>
<script src="js/Validation.js"></script>
</head>
<body>
<center>
<div> <%String msg= ((String)request.getAttribute("Message"));
       if(msg!=null)
{
out.println(msg);
}

%> </div>
<%
			Connection con = null;
			PreparedStatement ps = null;
			try
			{
			    Class.forName("org.apache.derby.jdbc.ClientDriver");        
            	con=DriverManager.getConnection("jdbc:derby://172.24.34.212:1527/sample","user","pwd");
			String sql = "SELECT TOPIC_DESC FROM TOPIC_XBBNHHW";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); 
%>
<h2>SELECT A TOPIC AND POST YOUR COMMENT</h2>
	<div class="ex">
		<form action="" name="comment1" method="post" onSubmit="return val_comment()">
			<table style="with: 50%">
				<tr>
					<td>Topic</td>
					<td>
			          <select id="topic" name="tname">
			          <option >--topic--</option>
                   <%  while(rs.next()){ %>

                         <option ><%= rs.getString(1)%></option>

                    <% } %>

                </select>


			<%
			}
			catch(SQLException sqe)
			{ 
			out.println(sqe);
			}
%>
					</td>
				</tr>
				<tr>
					<td>Your Comment</td>
					<td><input type="text" name="comment" /></td>
				</tr>
				<tr></tr>
				<tr></tr>
			</table>
			<input type="submit" value="Post Your Comment"  onClick="form.action='CommentServlet'"/>
		</form><br><br>
			<a href="First.jsp"/>Back</a>
	</div>
	</center>
</body>
</html>