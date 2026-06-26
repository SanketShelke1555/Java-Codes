<%@ page import="java.sql.*" %>
<%@ page import="com.db.DBConnection" %>

<html>
<body>

<h2>Student List</h2>

<table border="1">
<tr>
<th>ID</th><th>Name</th><th>Marks</th>
</tr>

<%
Connection con = DBConnection.getConnection();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM student");

while(rs.next()) {
%>
<tr>
<td><%= rs.getInt(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getInt(3) %></td>
</tr>
<%
}
%>

</table>
</body>
</html>
