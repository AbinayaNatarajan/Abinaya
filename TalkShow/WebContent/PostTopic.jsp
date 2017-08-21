
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>post a topic</title>
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
<h1>POST A TOPIC</h1>
	<div class="ex">
		<form action="" name="postTopic" method="post" onSubmit="return val_postTopic()">
		
			<table style="with: 50%">
				<tr>
					<td>Topic</td>
					<td><input type="text" name="tname" /></td>
				</tr>
				<tr></tr>
				<tr></tr>
			</table>
			<input type="submit" value="Post a Topic" onClick="form.action='TopicServlet'"/><br><br><br>
		</form>
		
		<a href="First.jsp"/>Back</div></a>
</center>
</body>
</html>