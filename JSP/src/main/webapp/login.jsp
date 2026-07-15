<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset ="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="#" methos="post">
Username:<input type="text" name="user"><br><br>
Password:<input type="password" name="pass"><br><br>
<input type="submit" value="Login">
</form>

<%
String user,pass;
user=request.getParameter("user");
pass=request.getParameter("pass");

String url="jdbc:mysql://localhost:3306/teknowell";
Connection con;
Resultset rs;

Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection(url,"root","password");

String query ="select * from jspuser where values=(?,?,?)";

%>

</body>
</html>