<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>
</head>
<body>

<h2>Student List</h2>

<table border="1" cellpadding="10">

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Course</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<%

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/tecknowell",
			"root",
			"password");

	Statement st=con.createStatement();

	ResultSet rs=st.executeQuery("select * from student");

	while(rs.next())
	{
%>

<tr>

<td><%=rs.getInt("id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getString("course")%></td>

<td>
<a href="edit.jsp?id=<%=rs.getInt("id")%>">Edit</a>
</td>

<td>
<a href="delete.jsp?id=<%=rs.getInt("id")%>">Delete</a>
</td>

</tr>

<%
	}

	rs.close();
	st.close();
	con.close();

}
catch(Exception e)
{
	out.println(e);
}

%>

</table>

<br>

<a href="insert.jsp">Add Student</a>

</body>
</html>