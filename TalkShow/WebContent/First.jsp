<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Page</title>
</head>
<body>
<form action="">
<center>
   <table style="width: 50%; margin-top: 6cm;">
				<tr>
					<input type="Submit" style="font-size: 12pt; height: 30px; width:150px;background-color: #e7e7e7; color: black;"
 Value="Post Topic" onClick="form.action='PostTopic.jsp'"/>
				</tr><br><br>
				<tr>
				<input type="Submit" style="font-size: 12pt; height: 30px; width:150px;background-color: #e7e7e7; color: black;"
				 Value="Post Comment" onClick="form.action='PostComment.jsp'"/>
				</tr><br><br>
				<tr>
				 <input type="Submit"  style="font-size: 12pt; height: 30px; width:150px;background-color: #e7e7e7; color: black;"
				  Value="View Comment" onClick="form.action='ViewComment.jsp'"/>
				</tr>
			</table>
			</form>
			</center>
</body>
</html>