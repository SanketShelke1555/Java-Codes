<%@page import="java.sql.*"%>

<%

int id=Integer.parseInt(request.getParameter("id"));

try
{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/tecknowell",
		"root",
		"password");

PreparedStatement ps=con.prepareStatement(
		"delete from student where id=?");

ps.setInt(1,id);

int i=ps.executeUpdate();

if(i>0)
{
	response.sendRedirect("view.jsp");
}
else
{
	out.println("Delete Failed");
}

ps.close();
con.close();

}
catch(Exception e)
{
	out.println(e);
}

%>