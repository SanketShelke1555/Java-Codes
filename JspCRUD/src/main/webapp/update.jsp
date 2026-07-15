<%@page import="java.sql.*"%>

<%

int id=Integer.parseInt(request.getParameter("id"));

String name=request.getParameter("name");
String email=request.getParameter("email");
String course=request.getParameter("course");

try
{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/tecknowell",
		"root",
		"password");

PreparedStatement ps=con.prepareStatement(
		"update student set name=?,email=?,course=? where id=?");

ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,course);
ps.setInt(4,id);

int i=ps.executeUpdate();

if(i>0)
{
	response.sendRedirect("view.jsp");
}
else
{
	out.println("Update Failed");
}

ps.close();
con.close();

}
catch(Exception e)
{
	out.println(e);
}

%>