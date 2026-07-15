<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Example</title>
</head>
<body>


	<form action="#">
	Enter Name : <input type="text" name="name"><br>
	Enter Email : <input type="email" name="em"><br>
	Enter Password : <input type="password" name="pass"><br>
	
	<input type="submit" value="Register">
	
	</form>
	
	<%
	
	String nm=request.getParameter("name");
	String e=request.getParameter("em");
	String p=request.getParameter("pass");
	
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tecknowell","root","password");
		
		PreparedStatement pstm = con.prepareStatement("insert into jspuser values(?,?,?)");
		
		pstm.setString(1, nm);
		pstm.setString(2, e);
		pstm.setString(3, p);
		
		
		int i = pstm.executeUpdate();
		
		if(i>0){
			
			out.println("<h3 style='color:green;'>Registration Successfull!</h3>");
			
		}
		else{
			out.println("<h3 style='color:red;'>Registration Failed!</h3>");
		}
		
	}
	catch(Exception ex){
		
		out.println("<h3 style='color:red;'>Error : " + ex.getMessage() + "</h3>");
		
	}
	
	
	
	%>
</body>

</html>