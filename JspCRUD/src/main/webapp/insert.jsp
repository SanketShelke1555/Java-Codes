<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>

<h2>Add Student</h2>

<form action="#" method="post">

Name :
<input type="text" name="name"><br><br>

Email :
<input type="email" name="email"><br><br>

Course :
<input type="text" name="course"><br><br>

<input type="submit" value="Save">

</form>

<%

String name=request.getParameter("name");
String email=request.getParameter("email");
String course=request.getParameter("course");

if(name!=null && email!=null && course!=null)
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/tecknowell",
				"root",
				"password");

		PreparedStatement ps=con.prepareStatement(
				"insert into student(name,email,course) values(?,?,?)");

		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,course);

		int i=ps.executeUpdate();

		if(i>0)
		{
			out.println("<h3>Student Added Successfully</h3>");
		}
		else
		{
			out.println("<h3>Failed</h3>");
		}

		ps.close();
		con.close();

	}
	catch(Exception e)
	{
		out.println(e);
	}
}

%>

<br>

<a href="index.jsp">Home</a> |
<a href="view.jsp">View Students</a>

</body>
</html>