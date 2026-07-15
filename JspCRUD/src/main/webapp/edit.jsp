<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<body>

<%

int id=Integer.parseInt(request.getParameter("id"));

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/tecknowell",
		"root",
		"password");

PreparedStatement ps=con.prepareStatement(
		"select * from student where id=?");

ps.setInt(1,id);

ResultSet rs=ps.executeQuery();

if(rs.next())
{

%>

<form action="update.jsp" method="post">

<input type="hidden" name="id" value="<%=rs.getInt("id")%>">

Name

<input type="text"
name="name"
value="<%=rs.getString("name")%>">

<br><br>

Email

<input type="email"
name="email"
value="<%=rs.getString("email")%>">

<br><br>

Course

<input type="text"
name="course"
value="<%=rs.getString("course")%>">

<br><br>

<input type="submit" value="Update">

</form>

<%
}

rs.close();
ps.close();
con.close();

%>

</body>
</html>